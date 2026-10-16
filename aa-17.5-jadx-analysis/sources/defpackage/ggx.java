package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ggx implements afeg {
    public final /* synthetic */ cfy a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ggx(afdr afdrVar, cfy cfyVar, long j, long j2, int i, int i2) {
        this.f = i2;
        this.e = afdrVar;
        this.a = cfyVar;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i2 = this.d;
            Object obj3 = this.e;
            long j = this.c;
            long j2 = this.b;
            cfy cfyVar = this.a;
            int i3 = i2 | 1;
            int i4 = i3 & 306783378;
            int i5 = i3 & 613566756;
            fxa.m(cfyVar, j2, j, (String) obj3, buxVar, (i3 & (-920350135)) | i4 | (i5 >> 1) | ((i4 + i4) & i5));
            return afak.a;
        }
        if (i != 1) {
            bux buxVar2 = (bux) obj;
            ((Integer) obj2).intValue();
            int i6 = this.d;
            long j3 = this.c;
            long j4 = this.b;
            cfy cfyVar2 = this.a;
            ?? r5 = this.e;
            int i7 = i6 | 1;
            int i8 = i7 & 306783378;
            int i9 = i7 & 613566756;
            myi.D(r5, cfyVar2, j4, j3, buxVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
            return afak.a;
        }
        bux buxVar3 = (bux) obj;
        ((Integer) obj2).intValue();
        int i10 = this.d;
        ?? r52 = this.e;
        long j5 = this.c;
        long j6 = this.b;
        cfy cfyVar3 = this.a;
        int i11 = i10 | 1;
        int i12 = i11 & 306783378;
        int i13 = i11 & 613566756;
        bmm.a(cfyVar3, j6, j5, r52, buxVar3, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
        return afak.a;
    }

    public /* synthetic */ ggx(cfy cfyVar, long j, long j2, Object obj, int i, int i2) {
        this.f = i2;
        this.a = cfyVar;
        this.b = j;
        this.c = j2;
        this.e = obj;
        this.d = i;
    }
}
