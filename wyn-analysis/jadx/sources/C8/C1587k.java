package c8;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: c8.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1587k {

    /* renamed from: a, reason: collision with root package name */
    public Fe.e f19762a = new C1585i();

    /* renamed from: b, reason: collision with root package name */
    public Fe.e f19763b = new C1585i();

    /* renamed from: c, reason: collision with root package name */
    public Fe.e f19764c = new C1585i();

    /* renamed from: d, reason: collision with root package name */
    public Fe.e f19765d = new C1585i();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1579c f19766e = new C1577a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1579c f19767f = new C1577a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1579c f19768g = new C1577a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1579c f19769h = new C1577a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: i, reason: collision with root package name */
    public C1581e f19770i = new C1581e(0);

    /* renamed from: j, reason: collision with root package name */
    public C1581e f19771j = new C1581e(0);
    public C1581e k = new C1581e(0);

    /* renamed from: l, reason: collision with root package name */
    public C1581e f19772l = new C1581e(0);

    public static C1586j a(Context context, int i5, int i10, C1577a c1577a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i5);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(I7.a.f5418u);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(3, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(4, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(2, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(1, i11);
            InterfaceC1579c interfaceC1579cC = c(typedArrayObtainStyledAttributes, 5, c1577a);
            InterfaceC1579c interfaceC1579cC2 = c(typedArrayObtainStyledAttributes, 8, interfaceC1579cC);
            InterfaceC1579c interfaceC1579cC3 = c(typedArrayObtainStyledAttributes, 9, interfaceC1579cC);
            InterfaceC1579c interfaceC1579cC4 = c(typedArrayObtainStyledAttributes, 7, interfaceC1579cC);
            InterfaceC1579c interfaceC1579cC5 = c(typedArrayObtainStyledAttributes, 6, interfaceC1579cC);
            C1586j c1586j = new C1586j();
            Fe.e eVarY = Fe.g.y(i12);
            c1586j.f19751a = eVarY;
            C1586j.b(eVarY);
            c1586j.f19755e = interfaceC1579cC2;
            Fe.e eVarY2 = Fe.g.y(i13);
            c1586j.f19752b = eVarY2;
            C1586j.b(eVarY2);
            c1586j.f19756f = interfaceC1579cC3;
            Fe.e eVarY3 = Fe.g.y(i14);
            c1586j.f19753c = eVarY3;
            C1586j.b(eVarY3);
            c1586j.f19757g = interfaceC1579cC4;
            Fe.e eVarY4 = Fe.g.y(i15);
            c1586j.f19754d = eVarY4;
            C1586j.b(eVarY4);
            c1586j.f19758h = interfaceC1579cC5;
            return c1586j;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static C1586j b(Context context, AttributeSet attributeSet, int i5, int i10) {
        C1577a c1577a = new C1577a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I7.a.f5412o, i5, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c1577a);
    }

    public static InterfaceC1579c c(TypedArray typedArray, int i5, InterfaceC1579c interfaceC1579c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i5);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                return new C1577a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new C1584h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC1579c;
    }

    public final boolean d(RectF rectF) {
        boolean z2 = this.f19772l.getClass().equals(C1581e.class) && this.f19771j.getClass().equals(C1581e.class) && this.f19770i.getClass().equals(C1581e.class) && this.k.getClass().equals(C1581e.class);
        float fA = this.f19766e.a(rectF);
        return z2 && ((this.f19767f.a(rectF) > fA ? 1 : (this.f19767f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f19769h.a(rectF) > fA ? 1 : (this.f19769h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f19768g.a(rectF) > fA ? 1 : (this.f19768g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f19763b instanceof C1585i) && (this.f19762a instanceof C1585i) && (this.f19764c instanceof C1585i) && (this.f19765d instanceof C1585i));
    }

    public final C1586j e() {
        C1586j c1586j = new C1586j();
        c1586j.f19751a = this.f19762a;
        c1586j.f19752b = this.f19763b;
        c1586j.f19753c = this.f19764c;
        c1586j.f19754d = this.f19765d;
        c1586j.f19755e = this.f19766e;
        c1586j.f19756f = this.f19767f;
        c1586j.f19757g = this.f19768g;
        c1586j.f19758h = this.f19769h;
        c1586j.f19759i = this.f19770i;
        c1586j.f19760j = this.f19771j;
        c1586j.k = this.k;
        c1586j.f19761l = this.f19772l;
        return c1586j;
    }
}
