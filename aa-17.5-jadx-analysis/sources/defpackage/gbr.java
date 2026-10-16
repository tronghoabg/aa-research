package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class gbr implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ gbr(asf asfVar, cfy cfyVar, bpv bpvVar, boolean z, long j, int i, int i2) {
        this.g = i2;
        this.e = asfVar;
        this.f = cfyVar;
        this.d = bpvVar;
        this.a = z;
        this.b = j;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [cfy, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.g == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.c;
            ?? r5 = this.f;
            long j = this.b;
            int i2 = i | 1;
            int i3 = 306783378 & i2;
            int i4 = 613566756 & i2;
            gbt.b(this.a, (gbv) this.d, this.e, j, r5, buxVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i5 = this.c;
        long j2 = this.b;
        boolean z = this.a;
        Object obj3 = this.d;
        ?? r52 = this.f;
        ?? r4 = this.e;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        bqh.c(r4, r52, (bpv) obj3, z, j2, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return afak.a;
    }

    public /* synthetic */ gbr(boolean z, gbv gbvVar, cfy cfyVar, long j, afeg afegVar, int i, int i2) {
        this.g = i2;
        this.a = z;
        this.d = gbvVar;
        this.e = cfyVar;
        this.b = j;
        this.f = afegVar;
        this.c = i;
    }
}
