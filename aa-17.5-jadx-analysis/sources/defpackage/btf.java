package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class btf implements afeg {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ btf(long j, dfw dfwVar, afeg afegVar, int i, int i2) {
        this.e = i2;
        this.a = j;
        this.c = dfwVar;
        this.d = afegVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bjy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [cfy, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.b;
            long j = this.a;
            ?? r5 = this.d;
            ?? r4 = this.c;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = i2 & 613566756;
            afp.O(r4, r5, j, buxVar, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i5 = this.b;
        ?? r3 = this.d;
        Object obj3 = this.c;
        long j2 = this.a;
        int i6 = i5 | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        czz.ao(j2, (dfw) obj3, r3, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
        return afak.a;
    }

    public /* synthetic */ btf(bjy bjyVar, cfy cfyVar, long j, int i, int i2) {
        this.e = i2;
        this.c = bjyVar;
        this.d = cfyVar;
        this.a = j;
        this.b = i;
    }
}
