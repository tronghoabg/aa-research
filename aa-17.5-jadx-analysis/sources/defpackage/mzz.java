package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mzz implements afeg {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ mzz(float f, int i, int i2) {
        this.c = i2;
        this.a = f;
        this.b = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.c != 0) {
            ((Integer) obj2).intValue();
            int i = this.b;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            lxw.r(this.a, (bux) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i5 = this.b;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        mjv.j(this.a, (bux) obj, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return afak.a;
    }
}
