package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ksy {
    public static final ksy a = new ksy(48.0f, 32.0f, null, new kve(3.0f, 1.0f, 3.0f), null, 380);
    public static final ksy b;
    public static final ksy c;
    public static final ksy d;
    public static final ksy e;
    public static final ksy f;
    public static final ksy g;
    public final float h;
    public final float i;
    public final dlj j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final kve o;
    public final kve p;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kve kveVar = null;
        dlj dljVar = null;
        b = new ksy(56.0f, 34.0f, dljVar, new kve(4.0f, 2.0f, 4.0f), kveVar, 380);
        dlj dljVar2 = null;
        c = new ksy(64.0f, 38.0f, dljVar2, null, null, 508);
        d = new ksy(72.0f, 42.0f, dljVar, null, kveVar, 508);
        e = new ksy(56.0f, 48.0f, dljVar2, new kve(4.0f, 4.0f, 4.2f), new kve(2.0f, 2.0f, 2.0f), 124);
        float f2 = 56.0f;
        f = new ksy(64.0f, f2, null, null, null, 508);
        g = new ksy(f2, 24.0f, 0 == true ? 1 : 0, new kve(4.0f, 4.0f, 4.2f), new kve(2.0f, 2.0f, 2.0f), 124);
        woy.dG(new dba(20));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ksy(float f2, float f3, dlj dljVar, kve kveVar, kve kveVar2, int i) {
        kve kveVar3 = (i & 128) != 0 ? new kve(4.0f, 4.0f, 4.0f) : kveVar;
        kve kveVar4 = (i & 256) != 0 ? new kve(3.0f, 3.0f, 3.0f) : kveVar2;
        int i2 = i & 32;
        int i3 = i & 16;
        int i4 = i & 8;
        float f4 = (i & 64) != 0 ? 12.0f : 0.0f;
        float f5 = i2 != 0 ? 32.0f : 0.0f;
        float f6 = i3 != 0 ? 24.0f : 0.0f;
        this(f2, f3, (i & 4) != 0 ? null : dljVar, i4 != 0 ? 32.0f : 0.0f, f6, f5, f4, kveVar3, kveVar4);
    }

    public static /* synthetic */ ksy a(ksy ksyVar, float f2, float f3, dlj dljVar, float f4, int i) {
        if ((i & 1) != 0) {
            f2 = ksyVar.h;
        }
        float f5 = f2;
        if ((i & 2) != 0) {
            f3 = ksyVar.i;
        }
        float f6 = f3;
        if ((i & 4) != 0) {
            dljVar = ksyVar.j;
        }
        dlj dljVar2 = dljVar;
        int i2 = i & 8;
        float f7 = BitmapDescriptorFactory.HUE_RED;
        float f8 = i2 != 0 ? ksyVar.k : 0.0f;
        if ((i & 16) != 0) {
            f7 = ksyVar.l;
        }
        float f9 = f7;
        if ((i & 32) != 0) {
            f4 = ksyVar.m;
        }
        return new ksy(f5, f6, dljVar2, f8, f9, f4, ksyVar.n, ksyVar.o, ksyVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksy)) {
            return false;
        }
        ksy ksyVar = (ksy) obj;
        return Float.compare(this.h, ksyVar.h) == 0 && Float.compare(this.i, ksyVar.i) == 0 && affa.f(this.j, ksyVar.j) && Float.compare(this.k, ksyVar.k) == 0 && Float.compare(this.l, ksyVar.l) == 0 && Float.compare(this.m, ksyVar.m) == 0 && Float.compare(this.n, ksyVar.n) == 0 && affa.f(this.o, ksyVar.o) && affa.f(this.p, ksyVar.p);
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.h) * 31) + Float.floatToIntBits(this.i);
        dlj dljVar = this.j;
        return (((((((((((((iFloatToIntBits * 31) + (dljVar == null ? 0 : Float.floatToIntBits(dljVar.a))) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + this.o.hashCode()) * 31) + this.p.hashCode();
    }

    public final String toString() {
        float f2 = this.n;
        float f3 = this.m;
        float f4 = this.l;
        float f5 = this.k;
        float f6 = this.i;
        return "ButtonSize(buttonHeight=" + dlj.b(this.h) + ", iconContentHeight=" + dlj.b(f6) + ", iconContentWidth=" + this.j + ", labelContentHeight=" + dlj.b(f5) + ", iconHorizontalPadding=" + dlj.b(f4) + ", labelHorizontalPadding=" + dlj.b(f3) + ", iconSpacing=" + dlj.b(f2) + ", focusRingThickness=" + this.o + ", innerFocusRingThickness=" + this.p + ")";
    }

    private ksy(float f2, float f3, dlj dljVar, float f4, float f5, float f6, float f7, kve kveVar, kve kveVar2) {
        kveVar.getClass();
        kveVar2.getClass();
        this.h = f2;
        this.i = f3;
        this.j = dljVar;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
        this.o = kveVar;
        this.p = kveVar2;
    }
}
