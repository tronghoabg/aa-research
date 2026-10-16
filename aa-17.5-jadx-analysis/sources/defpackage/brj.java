package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class brj implements afeg {
    public final /* synthetic */ cfy a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ afeh d;
    public final /* synthetic */ afeg e;
    public final /* synthetic */ afeg f;
    public final /* synthetic */ int g;
    private final /* synthetic */ int h;

    public /* synthetic */ brj(cfy cfyVar, long j, long j2, afeh afehVar, afeg afegVar, afeg afegVar2, int i, int i2) {
        this.h = i2;
        this.a = cfyVar;
        this.b = j;
        this.c = j2;
        this.d = afehVar;
        this.e = afegVar;
        this.f = afegVar2;
        this.g = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.h != 0) {
            ((Integer) obj2).intValue();
            int i = this.g;
            afeg afegVar = this.f;
            afeg afegVar2 = this.e;
            afeh afehVar = this.d;
            long j = this.c;
            long j2 = this.b;
            cfy cfyVar = this.a;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            tr.i(cfyVar, j2, j, afehVar, afegVar2, afegVar, (bux) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i5 = this.g;
        afeg afegVar3 = this.f;
        afeg afegVar4 = this.e;
        afeh afehVar2 = this.d;
        long j3 = this.c;
        long j4 = this.b;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1);
        tr.j(this.a, j4, j3, afehVar2, afegVar4, afegVar3, (bux) obj, ((i7 + i7) & i8) | i9);
        return afak.a;
    }
}
