package com.google.android.material.k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r implements o {

    /* renamed from: a, reason: collision with root package name */
    d f6694a;

    /* renamed from: b, reason: collision with root package name */
    d f6695b;

    /* renamed from: c, reason: collision with root package name */
    d f6696c;

    /* renamed from: d, reason: collision with root package name */
    d f6697d;

    /* renamed from: e, reason: collision with root package name */
    f f6698e;

    /* renamed from: f, reason: collision with root package name */
    f f6699f;

    /* renamed from: g, reason: collision with root package name */
    f f6700g;

    /* renamed from: h, reason: collision with root package name */
    f f6701h;

    /* renamed from: i, reason: collision with root package name */
    f f6702i;

    /* renamed from: j, reason: collision with root package name */
    f f6703j;

    /* renamed from: k, reason: collision with root package name */
    f f6704k;

    /* renamed from: l, reason: collision with root package name */
    f f6705l;

    public r() {
        this.f6702i = new n();
        this.f6703j = new n();
        this.f6704k = new n();
        this.f6705l = new n();
        this.f6694a = new a(0.0f);
        this.f6695b = new a(0.0f);
        this.f6696c = new a(0.0f);
        this.f6697d = new a(0.0f);
        this.f6698e = new f();
        this.f6699f = new f();
        this.f6700g = new f();
        this.f6701h = new f();
    }

    public static d h(TypedArray typedArray, int i2, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new m(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public static p k(Resources.Theme theme, int i2) {
        return t(theme.obtainStyledAttributes(i2, l.f6679b), new a(0.0f));
    }

    public static p l(Context context, int i2, int i3) {
        return u(context, i2, i3, new a(0.0f));
    }

    public static p m(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f6678a, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return u(context, resourceId, resourceId2, aVar);
    }

    private static p t(TypedArray typedArray, d dVar) {
        try {
            int[] iArr = l.f6678a;
            int i2 = typedArray.getInt(0, 0);
            int i3 = typedArray.getInt(3, i2);
            int i4 = typedArray.getInt(4, i2);
            int i5 = typedArray.getInt(2, i2);
            int i6 = typedArray.getInt(1, i2);
            d dVarH = h(typedArray, 5, dVar);
            d dVarH2 = h(typedArray, 8, dVarH);
            d dVarH3 = h(typedArray, 9, dVarH);
            d dVarH4 = h(typedArray, 7, dVarH);
            d dVarH5 = h(typedArray, 6, dVarH);
            p pVar = new p();
            pVar.v(i3, dVarH2);
            pVar.w(i4, dVarH3);
            pVar.u(i5, dVarH4);
            pVar.t(i6, dVarH5);
            return pVar;
        } finally {
            typedArray.recycle();
        }
    }

    private static p u(Context context, int i2, int i3, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i3, true);
        }
        return t(contextThemeWrapper.obtainStyledAttributes(l.f6679b), dVar);
    }

    @Override // com.google.android.material.k.o
    public final r a() {
        return this;
    }

    @Override // com.google.android.material.k.o
    public final r b(int[] iArr) {
        return this;
    }

    @Override // com.google.android.material.k.o
    public final r c(float f2) {
        p pVar = new p(this);
        pVar.s(f2);
        return new r(pVar);
    }

    @Override // com.google.android.material.k.o
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.material.k.o
    public final r[] e() {
        return new r[]{this};
    }

    public final d f() {
        return this.f6697d;
    }

    public final d g() {
        return this.f6696c;
    }

    public final d i() {
        return this.f6694a;
    }

    public final d j() {
        return this.f6695b;
    }

    public final r n(q qVar) {
        p pVar = new p(this);
        pVar.p(qVar.a(this.f6694a));
        pVar.r(qVar.a(this.f6695b));
        pVar.l(qVar.a(this.f6697d));
        pVar.n(qVar.a(this.f6696c));
        return new r(pVar);
    }

    public final boolean o(RectF rectF) {
        boolean z = this.f6701h.getClass().equals(f.class) && this.f6699f.getClass().equals(f.class) && this.f6698e.getClass().equals(f.class) && this.f6700g.getClass().equals(f.class);
        float fA = this.f6694a.a(rectF);
        return z && ((this.f6695b.a(rectF) > fA ? 1 : (this.f6695b.a(rectF) == fA ? 0 : -1)) == 0 && (this.f6697d.a(rectF) > fA ? 1 : (this.f6697d.a(rectF) == fA ? 0 : -1)) == 0 && (this.f6696c.a(rectF) > fA ? 1 : (this.f6696c.a(rectF) == fA ? 0 : -1)) == 0) && (this.f6703j instanceof n) && (this.f6702i instanceof n) && (this.f6704k instanceof n) && (this.f6705l instanceof n);
    }

    public final f p() {
        return this.f6705l;
    }

    public final f q() {
        return this.f6704k;
    }

    public final f r() {
        return this.f6702i;
    }

    public final f s() {
        return this.f6703j;
    }

    public final String toString() {
        return "[" + String.valueOf(this.f6694a) + ", " + String.valueOf(this.f6695b) + ", " + String.valueOf(this.f6696c) + ", " + String.valueOf(this.f6697d) + "]";
    }

    private r(p pVar) {
        this.f6702i = pVar.f6690i;
        this.f6703j = pVar.f6691j;
        this.f6704k = pVar.f6692k;
        this.f6705l = pVar.f6693l;
        this.f6694a = pVar.f6682a;
        this.f6695b = pVar.f6683b;
        this.f6696c = pVar.f6684c;
        this.f6697d = pVar.f6685d;
        this.f6698e = pVar.f6686e;
        this.f6699f = pVar.f6687f;
        this.f6700g = pVar.f6688g;
        this.f6701h = pVar.f6689h;
    }

    /* synthetic */ r(p pVar, byte[] bArr) {
        this(pVar);
    }
}
