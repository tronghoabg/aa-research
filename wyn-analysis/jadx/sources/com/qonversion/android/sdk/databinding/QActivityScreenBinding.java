package com.qonversion.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.qonversion.android.sdk.R;

/* loaded from: classes4.dex */
public final class QActivityScreenBinding {
    public final FragmentContainerView fragmentContainerView;
    private final FragmentContainerView rootView;

    private QActivityScreenBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.fragmentContainerView = fragmentContainerView2;
    }

    public static QActivityScreenBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new QActivityScreenBinding(fragmentContainerView, fragmentContainerView);
    }

    public static QActivityScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static QActivityScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(R.layout.q_activity_screen, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public FragmentContainerView getRoot() {
        return this.rootView;
    }
}
