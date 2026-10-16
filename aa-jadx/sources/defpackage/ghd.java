package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ghd implements defpackage.affg {
    public final /* synthetic */ defpackage.cgf a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ghd(defpackage.afer aferVar, defpackage.cgf cgfVar, long j, long j2, int i, int i2) {
        this.f = i2;
        this.e = aferVar;
        this.a = cgfVar;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [affh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [afer, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        if (i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i2 = this.d;
            java.lang.Object obj3 = this.e;
            long j = this.c;
            long j2 = this.b;
            defpackage.cgf cgfVar = this.a;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = i3 & 613566756;
            defpackage.fxf.m(cgfVar, j2, j, (java.lang.String) obj3, bveVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return defpackage.afbk.a;
        }
        if (i != 1) {
            defpackage.bve bveVar2 = (defpackage.bve) obj;
            ((java.lang.Integer) obj2).intValue();
            int i6 = this.d;
            long j3 = this.c;
            long j4 = this.b;
            defpackage.cgf cgfVar2 = this.a;
            ?? r5 = this.e;
            int i7 = i6 | 1;
            int i8 = i7 & 306783378;
            int i9 = i7 & 613566756;
            defpackage.myx.E(r5, cgfVar2, j4, j3, bveVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar3 = (defpackage.bve) obj;
        ((java.lang.Integer) obj2).intValue();
        int i10 = this.d;
        ?? r6 = this.e;
        long j5 = this.c;
        long j6 = this.b;
        defpackage.cgf cgfVar3 = this.a;
        int i11 = i10 | 1;
        int i12 = i11 & 306783378;
        int i13 = i11 & 613566756;
        defpackage.bmq.a(cgfVar3, j6, j5, r6, bveVar3, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
        return defpackage.afbk.a;
    }

    public /* synthetic */ ghd(defpackage.cgf cgfVar, long j, long j2, java.lang.Object obj, int i, int i2) {
        this.f = i2;
        this.a = cgfVar;
        this.b = j;
        this.c = j2;
        this.e = obj;
        this.d = i;
    }
}
