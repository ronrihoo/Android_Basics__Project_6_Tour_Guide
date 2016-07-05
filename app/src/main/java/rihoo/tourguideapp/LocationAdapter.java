package rihoo.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int colorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        this.colorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.layout_list_item, parent, false);
        }

        int color = ContextCompat.getColor(getContext(), this.colorResourceId);

        View textContainer = listItemView.findViewById(R.id.LL_Text_Container);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.TV_Location_Name);
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.TV_Location_Address);
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.TV_Location_Phone);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.ImageView);

        Location currentLocation = getItem(position);

        nameTextView.setText(currentLocation.getName());
        addressTextView.setText(currentLocation.getAddress());
        phoneTextView.setText(currentLocation.getPhoneNumber());

        // Look for image. If it exists, then display it. Else, hide the ImageView.
        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
