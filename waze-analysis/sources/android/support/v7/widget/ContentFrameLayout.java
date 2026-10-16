package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f906a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f907b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f908c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f909d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f910e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f911f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f912g;

    /* renamed from: h, reason: collision with root package name */
    private bv f913h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f912g = new Rect();
    }

    public final TypedValue a() {
        TypedValue typedValue = this.f910e;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f910e = typedValue2;
        return typedValue2;
    }

    public final TypedValue b() {
        TypedValue typedValue = this.f911f;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f911f = typedValue2;
        return typedValue2;
    }

    public final TypedValue c() {
        TypedValue typedValue = this.f908c;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f908c = typedValue2;
        return typedValue2;
    }

    public final TypedValue d() {
        TypedValue typedValue = this.f909d;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f909d = typedValue2;
        return typedValue2;
    }

    public final TypedValue e() {
        TypedValue typedValue = this.f906a;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f906a = typedValue2;
        return typedValue2;
    }

    public final TypedValue f() {
        TypedValue typedValue = this.f907b;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.f907b = typedValue2;
        return typedValue2;
    }

    public final void g(bv bvVar) {
        this.f913h = bvVar;
    }

    public final void h(int i2, int i3, int i4, int i5) {
        this.f912g.set(i2, i3, i4, i5);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bv bvVar = this.f913h;
        if (bvVar != null) {
            bvVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
