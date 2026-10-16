package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class bri implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ cfy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ afeh e;
    public final /* synthetic */ afeg f;
    public final /* synthetic */ afeg g;
    public final /* synthetic */ int h;
    private final /* synthetic */ int i;

    public /* synthetic */ bri(int i, cfy cfyVar, long j, long j2, afeh afehVar, afeg afegVar, afeg afegVar2, int i2, int i3) {
        this.i = i3;
        this.a = i;
        this.b = cfyVar;
        this.c = j;
        this.d = j2;
        this.e = afehVar;
        this.f = afegVar;
        this.g = afegVar2;
        this.h = i2;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.i != 0) {
            ((Integer) obj2).intValue();
            int i = this.h;
            afeg afegVar = this.g;
            afeg afegVar2 = this.f;
            afeh afehVar = this.e;
            long j = this.d;
            long j2 = this.c;
            cfy cfyVar = this.b;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            tr.k(this.a, cfyVar, j2, j, afehVar, afegVar2, afegVar, (bux) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i5 = this.h;
        afeg afegVar3 = this.g;
        afeg afegVar4 = this.f;
        afeh afehVar2 = this.e;
        long j3 = this.d;
        long j4 = this.c;
        cfy cfyVar2 = this.b;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1);
        tr.l(this.a, cfyVar2, j4, j3, afehVar2, afegVar4, afegVar3, (bux) obj, (i8 & (i7 + i7)) | i9);
        return afak.a;
    }
}
