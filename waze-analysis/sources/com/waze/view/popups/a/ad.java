package com.waze.view.popups.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f45154a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f45155b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f45156c;

    ad(h hVar, View view, int i2) {
        this.f45156c = i2;
        this.f45154a = view;
        Objects.requireNonNull(hVar);
        this.f45155b = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i2 = this.f45156c;
        View view = this.f45154a;
        if (i2 == 0) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            ((af) this.f45155b).l();
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = view instanceof TextView;
        if (z) {
            TextView textView = (TextView) view;
            if (textView.getLineCount() != 1) {
                if (z) {
                    textView.setGravity(1);
                    return;
                }
                return;
            }
        }
        h hVar = (h) this.f45155b;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, ((hVar.findViewById(R.id.TextLayout).getWidth() - hVar.G(18)) - view.getWidth()) / 2, 0.0f, 0.0f);
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(200L);
        view.startAnimation(translateAnimation);
    }

    ad(af afVar, View view, int i2) {
        this.f45156c = i2;
        this.f45154a = view;
        Objects.requireNonNull(afVar);
        this.f45155b = afVar;
    }
}
