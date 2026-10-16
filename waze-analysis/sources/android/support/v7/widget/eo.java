package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class eo extends ViewGroup.MarginLayoutParams {

    /* renamed from: c, reason: collision with root package name */
    fe f1418c;

    /* renamed from: d, reason: collision with root package name */
    final Rect f1419d;

    /* renamed from: e, reason: collision with root package name */
    boolean f1420e;

    /* renamed from: f, reason: collision with root package name */
    boolean f1421f;

    public eo(int i2, int i3) {
        super(i2, i3);
        this.f1419d = new Rect();
        this.f1420e = true;
        this.f1421f = false;
    }

    public final int a() {
        return this.f1418c.getLayoutPosition();
    }

    public final boolean b() {
        return this.f1418c.isUpdated();
    }

    public final boolean c() {
        return this.f1418c.isRemoved();
    }

    public eo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1419d = new Rect();
        this.f1420e = true;
        this.f1421f = false;
    }

    public eo(eo eoVar) {
        super((ViewGroup.LayoutParams) eoVar);
        this.f1419d = new Rect();
        this.f1420e = true;
        this.f1421f = false;
    }

    public eo(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1419d = new Rect();
        this.f1420e = true;
        this.f1421f = false;
    }

    public eo(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1419d = new Rect();
        this.f1420e = true;
        this.f1421f = false;
    }
}
