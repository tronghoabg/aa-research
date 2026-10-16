package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bhn implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ bhn(afdr afdrVar, cfy cfyVar, azt aztVar, azj azjVar, int i, int i2) {
        this.f = i2;
        this.c = afdrVar;
        this.d = cfyVar;
        this.b = aztVar;
        this.e = azjVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [afej, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [azj, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.a;
            ?? r3 = this.d;
            ?? r2 = this.c;
            Object obj3 = this.e;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = 613566756 & i3;
            bvf bvfVar = (bvf) obj3;
            awx.Y(this.b, bvfVar, r2, r3, (bux) obj, (i3 & (-920350135)) | i4 | (i5 >> 1) | (i5 & (i4 + i4)));
            return afak.a;
        }
        if (i != 1) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i6 = this.a;
            Object obj4 = this.c;
            Object obj5 = this.d;
            int i7 = i6 & 306783378;
            int i8 = 613566756 & i6;
            ((cct) this.e).d(this.b, obj5, obj4, buxVar, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8) | 1);
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i9 = this.a;
        ?? r32 = this.e;
        Object obj6 = this.b;
        ?? r1 = this.d;
        ?? r0 = this.c;
        int i10 = i9 | 1;
        int i11 = i10 & 306783378;
        int i12 = 613566756 & i10;
        azt aztVar = (azt) obj6;
        awx.n(r0, r1, aztVar, r32, (bux) obj, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12));
        return afak.a;
    }

    public /* synthetic */ bhn(cct cctVar, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f = i2;
        this.e = cctVar;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.a = i;
    }

    public /* synthetic */ bhn(cfy cfyVar, bvf bvfVar, afej afejVar, afeg afegVar, int i, int i2) {
        this.f = i2;
        this.b = cfyVar;
        this.e = bvfVar;
        this.c = afejVar;
        this.d = afegVar;
        this.a = i;
    }
}
