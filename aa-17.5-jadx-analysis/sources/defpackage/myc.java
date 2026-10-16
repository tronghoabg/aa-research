package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class myc implements afeg {
    public final /* synthetic */ afdr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ cfy e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ afeg g;
    public final /* synthetic */ int h;
    private final /* synthetic */ int i;

    public /* synthetic */ myc(afdr afdrVar, boolean z, long j, long j2, cfy cfyVar, boolean z2, afeg afegVar, int i, int i2) {
        this.i = i2;
        this.a = afdrVar;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = cfyVar;
        this.f = z2;
        this.g = afegVar;
        this.h = i;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.i != 0) {
            ((Integer) obj2).intValue();
            int i = this.h;
            long j = this.d;
            long j2 = this.c;
            afeg afegVar = this.g;
            boolean z = this.f;
            cfy cfyVar = this.e;
            afdr afdrVar = this.a;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            brb.d(this.b, afdrVar, cfyVar, z, afegVar, j2, j, (bux) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i5 = this.h;
        afeg afegVar2 = this.g;
        boolean z2 = this.f;
        cfy cfyVar2 = this.e;
        long j3 = this.d;
        long j4 = this.c;
        boolean z3 = this.b;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1);
        myi.I(this.a, z3, j4, j3, cfyVar2, z2, afegVar2, (bux) obj, (i8 & (i7 + i7)) | i9);
        return afak.a;
    }

    public /* synthetic */ myc(boolean z, afdr afdrVar, cfy cfyVar, boolean z2, afeg afegVar, long j, long j2, int i, int i2) {
        this.i = i2;
        this.b = z;
        this.a = afdrVar;
        this.e = cfyVar;
        this.f = z2;
        this.g = afegVar;
        this.c = j;
        this.d = j2;
        this.h = i;
    }
}
