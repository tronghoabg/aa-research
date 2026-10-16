package com.waze.trip_overview.c.a;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f41233a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f41234b;

    l(Context context, h.g.a.a aVar) {
        this.f41233a = context;
        this.f41234b = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        h.g.b.x.f(view, "view");
        this.f41234b.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        h.g.b.x.f(textPaint, "textPaint");
        textPaint.setColor(this.f41233a.getColor(R.color.primary_variant));
    }
}
