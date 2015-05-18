package org.un.untheuniversaldeclarationofhumanrights;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GridFragment extends Fragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
			savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_main, container, false);
		TextView text = (TextView) v.findViewById(R.id.section_label);
		text.setText("This is the Grid View.");
		return v;
	}
}
