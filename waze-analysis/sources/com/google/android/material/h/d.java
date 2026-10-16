package com.google.android.material.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import com.google.android.material.internal.t;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f6548a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6549b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6550c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6551d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6552e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6553f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6554g;

    /* renamed from: h, reason: collision with root package name */
    public final float f6555h;

    /* renamed from: i, reason: collision with root package name */
    private final ColorStateList f6556i;

    /* renamed from: j, reason: collision with root package name */
    private final float f6557j;

    /* renamed from: k, reason: collision with root package name */
    private final int f6558k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6559l = false;
    private boolean m = false;
    private Typeface n;

    public d(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, android.support.v7.a.a.w);
        this.f6557j = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f6556i = t.n(context, typedArrayObtainStyledAttributes, 3);
        t.n(context, typedArrayObtainStyledAttributes, 4);
        t.n(context, typedArrayObtainStyledAttributes, 5);
        this.f6550c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f6551d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iM = t.m(typedArrayObtainStyledAttributes, 12, 10);
        this.f6558k = typedArrayObtainStyledAttributes.getResourceId(iM, 0);
        this.f6549b = typedArrayObtainStyledAttributes.getString(iM);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f6548a = t.n(context, typedArrayObtainStyledAttributes, 6);
        this.f6552e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f6553f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f6554g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, b.f6545a);
        typedArrayObtainStyledAttributes2.hasValue(0);
        this.f6555h = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.getString(t.m(typedArrayObtainStyledAttributes2, 3, 1));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void h() {
        Typeface typeface;
        String str;
        Typeface typefaceCreate = this.n;
        if (typefaceCreate == null && (str = this.f6549b) != null) {
            typefaceCreate = Typeface.create(str, this.f6550c);
            this.n = typefaceCreate;
        }
        if (typefaceCreate == null) {
            int i2 = this.f6551d;
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i2 != 3) {
                    typeface = Typeface.DEFAULT;
                    this.n = typeface;
                    this.n = Typeface.create(typeface, this.f6550c);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.n = typeface;
            this.n = Typeface.create(typeface, this.f6550c);
        }
    }

    public final float a() {
        return this.f6557j;
    }

    public final ColorStateList b() {
        return this.f6556i;
    }

    public final Typeface d() {
        h();
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.content.Context r8, com.google.android.material.h.e r9) {
        /*
            r7 = this;
            boolean r0 = r7.f6559l
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L9
            goto L85
        L9:
            int r0 = r7.f6558k
            if (r0 != 0) goto Lf
            goto L82
        Lf:
            android.graphics.Typeface r4 = androidx.core.content.res.ResourcesCompat.getCachedFont(r8, r0)
            if (r4 == 0) goto L1b
            r7.n = r4
        L17:
            r7.f6559l = r2
            goto L85
        L1b:
            boolean r4 = r7.m
            if (r4 == 0) goto L21
        L1f:
            r0 = r3
            goto L7d
        L21:
            r7.m = r2
            android.content.res.Resources r4 = r8.getResources()
            if (r0 == 0) goto L6a
            java.lang.String r5 = r4.getResourceTypeName(r0)
            java.lang.String r6 = "font"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L36
            goto L6a
        L36:
            android.content.res.XmlResourceParser r0 = r4.getXml(r0)     // Catch: java.lang.Throwable -> L6a
        L3a:
            int r5 = r0.getEventType()     // Catch: java.lang.Throwable -> L6a
            if (r5 == r2) goto L6a
            int r5 = r0.getEventType()     // Catch: java.lang.Throwable -> L6a
            r6 = 2
            if (r5 != r6) goto L66
            java.lang.String r5 = r0.getName()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "font-family"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L66
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r0)     // Catch: java.lang.Throwable -> L6a
            int[] r5 = androidx.core.R.styleable.FontFamily     // Catch: java.lang.Throwable -> L6a
            android.content.res.TypedArray r0 = r4.obtainAttributes(r0, r5)     // Catch: java.lang.Throwable -> L6a
            r4 = 7
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Throwable -> L6a
            r0.recycle()     // Catch: java.lang.Throwable -> L6a
            goto L6b
        L66:
            r0.next()     // Catch: java.lang.Throwable -> L6a
            goto L3a
        L6a:
            r4 = r3
        L6b:
            if (r4 != 0) goto L6e
            goto L1f
        L6e:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r4, r1)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            if (r0 != r4) goto L77
            goto L1f
        L77:
            int r4 = r7.f6550c
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r4)
        L7d:
            if (r0 == 0) goto L82
            r7.n = r0
            goto L17
        L82:
            r7.h()
        L85:
            int r0 = r7.f6558k
            if (r0 != 0) goto L8c
            r7.f6559l = r2
            goto L8d
        L8c:
            r1 = r0
        L8d:
            boolean r0 = r7.f6559l
            if (r0 != 0) goto Lb8
            com.google.android.material.h.c r0 = new com.google.android.material.h.c     // Catch: java.lang.Exception -> L9a android.content.res.Resources.NotFoundException -> Lb2
            r0.<init>(r7, r9)     // Catch: java.lang.Exception -> L9a android.content.res.Resources.NotFoundException -> Lb2
            androidx.core.content.res.ResourcesCompat.getFont(r8, r1, r0, r3)     // Catch: java.lang.Exception -> L9a android.content.res.Resources.NotFoundException -> Lb2
            return
        L9a:
            r8 = move-exception
            java.lang.String r0 = r7.f6549b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "TextAppearance"
            java.lang.String r3 = "Error loading font "
            java.lang.String r0 = r3.concat(r0)
            android.util.Log.d(r1, r0, r8)
            r7.f6559l = r2
            r9.b()
            return
        Lb2:
            r7.f6559l = r2
            r9.b()
            return
        Lb8:
            android.graphics.Typeface r7 = r7.n
            r9.c(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.h.d.f(android.content.Context, com.google.android.material.h.e):void");
    }
}
