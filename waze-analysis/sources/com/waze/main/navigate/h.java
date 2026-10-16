package com.waze.main.navigate;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TextView f25509a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f25510b;

    h(i iVar, TextView textView, boolean z) {
        this.f25509a = textView;
        this.f25510b = z;
        Objects.requireNonNull(iVar);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TextView textView = this.f25509a;
        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = this.f25510b;
        textView.setTextSize(1, (textView.getLineCount() > 1 ? 22 : 26) * (true != z ? 1.0f : 0.75f));
        textView.setMaxLines(true != z ? 2 : 1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }
}
