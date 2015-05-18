package org.un.untheuniversaldeclarationofhumanrights;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ArticleFragment extends Fragment {
	public static final String EXTRA_LAYOUT_ID = "layout_id";

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
			savedInstanceState) {
		Bundle args = getArguments();
		View v = inflater.inflate(args.getInt(EXTRA_LAYOUT_ID), container, false);
		return v;
	}
}
