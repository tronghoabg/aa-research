package com.waze.view.popups;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LinearLayout f45309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f45310b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f45311c;

    i(j jVar, LinearLayout linearLayout, View view) {
        this.f45309a = linearLayout;
        this.f45310b = view;
        Objects.requireNonNull(jVar);
        this.f45311c = jVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j jVar = this.f45311c;
        int width = this.f45309a.getWidth();
        TextView textView = (TextView) jVar.findViewById(R.id.genTakeOverUser);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, width, layoutParams.bottomMargin);
        textView.setLayoutParams(layoutParams);
        this.f45310b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
