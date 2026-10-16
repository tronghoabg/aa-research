package com.waze.config;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cx implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f22595a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RecyclerView f22596b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DebugConfigListActivity f22597c;

    cx(DebugConfigListActivity debugConfigListActivity, View view, RecyclerView recyclerView) {
        this.f22595a = view;
        this.f22596b = recyclerView;
        Objects.requireNonNull(debugConfigListActivity);
        this.f22597c = debugConfigListActivity;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.f22597c.aB()) {
            View view2 = this.f22595a;
            view2.post(new com.google.android.libraries.phenotype.client.stable.x(view2, this.f22596b, 12, null));
            return windowInsetsCompat;
        }
        Insets insets = windowInsetsCompat.getInsets(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL);
        Insets insets2 = windowInsetsCompat.getInsets(128);
        this.f22595a.setPadding(insets.left + insets2.left, 0, insets.right + insets2.right, insets.bottom + insets2.bottom);
        return windowInsetsCompat;
    }
}
