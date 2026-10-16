package com.qonversion.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.qonversion.android.sdk.R;
import vf.AbstractC4345a;

/* loaded from: classes4.dex */
public final class QProgressBarBinding {
    public final ProgressBar progressBar;
    private final LinearLayout rootView;

    private QProgressBarBinding(LinearLayout linearLayout, ProgressBar progressBar) {
        this.rootView = linearLayout;
        this.progressBar = progressBar;
    }

    public static QProgressBarBinding bind(View view) {
        int i5 = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) AbstractC4345a.q(i5, view);
        if (progressBar != null) {
            return new QProgressBarBinding((LinearLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    public static QProgressBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static QProgressBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(R.layout.q_progress_bar, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
