package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class W extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public m0 f18812a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f18813b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18814c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18815d;

    public W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18813b = new Rect();
        this.f18814c = true;
        this.f18815d = false;
    }

    public W(int i5, int i10) {
        super(i5, i10);
        this.f18813b = new Rect();
        this.f18814c = true;
        this.f18815d = false;
    }

    public W(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f18813b = new Rect();
        this.f18814c = true;
        this.f18815d = false;
    }

    public W(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f18813b = new Rect();
        this.f18814c = true;
        this.f18815d = false;
    }

    public W(W w2) {
        super((ViewGroup.LayoutParams) w2);
        this.f18813b = new Rect();
        this.f18814c = true;
        this.f18815d = false;
    }
}
