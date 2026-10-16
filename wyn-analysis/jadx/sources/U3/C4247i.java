package u3;

import android.graphics.Paint;

/* renamed from: u3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4247i extends l {

    /* renamed from: d, reason: collision with root package name */
    public E4.n f46587d;

    /* renamed from: e, reason: collision with root package name */
    public float f46588e;

    /* renamed from: f, reason: collision with root package name */
    public E4.n f46589f;

    /* renamed from: g, reason: collision with root package name */
    public float f46590g;

    /* renamed from: h, reason: collision with root package name */
    public float f46591h;

    /* renamed from: i, reason: collision with root package name */
    public float f46592i;

    /* renamed from: j, reason: collision with root package name */
    public float f46593j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f46594l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f46595m;

    /* renamed from: n, reason: collision with root package name */
    public float f46596n;

    @Override // u3.k
    public final boolean a() {
        return this.f46589f.m() || this.f46587d.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // u3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            E4.n r0 = r6.f46589f
            boolean r1 = r0.m()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f2940d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f2938b
            if (r1 == r4) goto L1e
            r0.f2938b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            E4.n r1 = r6.f46587d
            boolean r4 = r1.m()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f2940d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f2938b
            if (r7 == r4) goto L3a
            r1.f2938b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C4247i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f46591h;
    }

    public int getFillColor() {
        return this.f46589f.f2938b;
    }

    public float getStrokeAlpha() {
        return this.f46590g;
    }

    public int getStrokeColor() {
        return this.f46587d.f2938b;
    }

    public float getStrokeWidth() {
        return this.f46588e;
    }

    public float getTrimPathEnd() {
        return this.f46593j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.f46592i;
    }

    public void setFillAlpha(float f10) {
        this.f46591h = f10;
    }

    public void setFillColor(int i5) {
        this.f46589f.f2938b = i5;
    }

    public void setStrokeAlpha(float f10) {
        this.f46590g = f10;
    }

    public void setStrokeColor(int i5) {
        this.f46587d.f2938b = i5;
    }

    public void setStrokeWidth(float f10) {
        this.f46588e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f46593j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f46592i = f10;
    }
}
