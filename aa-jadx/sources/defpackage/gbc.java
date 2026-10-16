package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gbc implements defpackage.affg {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ gbc(java.lang.Object obj, long j, java.lang.Object obj2, int i, int i2) {
        this.e = i2;
        this.c = obj;
        this.a = j;
        this.d = obj2;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [cld, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [cgf, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e;
        if (i == 0) {
            ((java.lang.Integer) obj2).intValue();
            int i2 = this.b;
            ?? r3 = this.d;
            int i3 = i2 | 1;
            int i4 = 306783378 & i3;
            int i5 = 613566756 & i3;
            defpackage.gbd gbdVar = (defpackage.gbd) this.c;
            gbdVar.b(this.a, r3, (defpackage.bve) obj, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return defpackage.afbk.a;
        }
        if (i == 1) {
            ((java.lang.Integer) obj2).intValue();
            int i6 = this.b;
            long j = this.a;
            int i7 = i6 | 1;
            int i8 = 306783378 & i7;
            int i9 = 613566756 & i7;
            defpackage.cno cnoVar = (defpackage.cno) this.c;
            defpackage.boh.b(cnoVar, this.d, j, (defpackage.bve) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
            return defpackage.afbk.a;
        }
        if (i == 2) {
            ((java.lang.Integer) obj2).intValue();
            int i10 = this.b;
            ?? r4 = this.d;
            int i11 = i10 | 1;
            int i12 = 306783378 & i11;
            int i13 = 613566756 & i11;
            defpackage.gcc gccVar = (defpackage.gcc) this.c;
            defpackage.gca.c(gccVar, this.a, r4, (defpackage.bve) obj, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i14 = this.b;
        long j2 = this.a;
        ?? r7 = this.d;
        int i15 = i14 | 1;
        int i16 = i15 & 306783378;
        int i17 = 613566756 & i15;
        defpackage.lwz.j((java.lang.String) this.c, r7, j2, bveVar, (i17 >> 1) | i16 | (i15 & (-920350135)) | ((i16 + i16) & i17));
        return defpackage.afbk.a;
    }

    public /* synthetic */ gbc(java.lang.Object obj, defpackage.cgf cgfVar, long j, int i, int i2) {
        this.e = i2;
        this.c = obj;
        this.d = cgfVar;
        this.a = j;
        this.b = i;
    }
}
