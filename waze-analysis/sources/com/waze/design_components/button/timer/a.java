package com.waze.design_components.button.timer;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class a extends View {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f23370a;

    /* renamed from: b, reason: collision with root package name */
    private float f23371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        this.f23370a = new Rect();
    }

    private final void b() {
        Configuration configuration = getResources().getConfiguration();
        x.e(configuration, "getConfiguration(...)");
        int layoutDirection = configuration.getLayoutDirection();
        Rect rect = this.f23370a;
        if (layoutDirection == 1) {
            rect.set((int) (getMeasuredWidth() * (1.0f - this.f23371b)), 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            rect.set(0, 0, (int) (this.f23371b * getMeasuredWidth()), getMeasuredHeight());
        }
        setVisibility(this.f23371b <= 0.0f ? 8 : 0);
        invalidate();
    }

    public final void a(float f2) {
        this.f23371b = f2;
        b();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        x.f(canvas, "canvas");
        canvas.clipRect(this.f23370a);
        super.draw(canvas);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
