package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bbe implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bbe(Object obj, int i, Object obj2, int i2, int i3) {
        this.e = i3;
        this.d = obj;
        this.a = i;
        this.b = obj2;
        this.c = i2;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            ((Integer) obj2).intValue();
            int i = this.c;
            Object obj3 = this.b;
            int i2 = this.a;
            int i3 = i | 1;
            int i4 = 306783378 & i3;
            int i5 = 613566756 & i3;
            ((axe) this.d).e(i2, obj3, (bux) obj, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i6 = this.c;
        Object obj4 = this.b;
        int i7 = this.a;
        int i8 = i6 | 1;
        int i9 = 306783378 & i8;
        int i10 = 613566756 & i8;
        ((bbf) this.d).e(i7, obj4, (bux) obj, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
        return afak.a;
    }
}
