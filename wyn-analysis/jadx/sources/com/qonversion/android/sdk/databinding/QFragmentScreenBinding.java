package com.qonversion.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.qonversion.android.sdk.R;
import vf.AbstractC4345a;

/* loaded from: classes4.dex */
public final class QFragmentScreenBinding {
    public final QProgressBarBinding progressBarLayout;
    private final RelativeLayout rootView;
    public final RelativeLayout screen;
    public final WebView webView;

    private QFragmentScreenBinding(RelativeLayout relativeLayout, QProgressBarBinding qProgressBarBinding, RelativeLayout relativeLayout2, WebView webView) {
        this.rootView = relativeLayout;
        this.progressBarLayout = qProgressBarBinding;
        this.screen = relativeLayout2;
        this.webView = webView;
    }

    public static QFragmentScreenBinding bind(View view) {
        int i5 = R.id.progressBarLayout;
        View viewQ = AbstractC4345a.q(i5, view);
        if (viewQ != null) {
            QProgressBarBinding qProgressBarBindingBind = QProgressBarBinding.bind(viewQ);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i10 = R.id.webView;
            WebView webView = (WebView) AbstractC4345a.q(i10, view);
            if (webView != null) {
                return new QFragmentScreenBinding(relativeLayout, qProgressBarBindingBind, relativeLayout, webView);
            }
            i5 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    public static QFragmentScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static QFragmentScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(R.layout.q_fragment_screen, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
