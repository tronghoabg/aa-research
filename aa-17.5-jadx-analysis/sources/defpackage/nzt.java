package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nzt implements afeg {
    public final /* synthetic */ cfy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    private final /* synthetic */ int k;

    public /* synthetic */ nzt(cfy cfyVar, boolean z, boolean z2, afdr afdrVar, boolean z3, boolean z4, String str, boolean z5, int i, int i2, int i3) {
        this.k = i3;
        this.a = cfyVar;
        this.b = z;
        this.c = z2;
        this.i = afdrVar;
        this.d = z3;
        this.e = z4;
        this.j = str;
        this.f = z5;
        this.h = i;
        this.g = i2;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.k != 0) {
            ((Integer) obj2).intValue();
            int i = this.h | 1;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            int i4 = (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3);
            int i5 = this.g;
            boolean z = this.f;
            Object obj3 = this.j;
            boolean z2 = this.e;
            boolean z3 = this.d;
            ?? r9 = this.i;
            boolean z4 = this.c;
            boolean z5 = this.b;
            kgq.n(this.a, null, z5, z4, r9, z3, z2, (String) obj3, z, (bux) obj, i4, i5);
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i6 = this.g | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8);
        int i10 = this.h;
        boolean z6 = this.f;
        boolean z7 = this.e;
        boolean z8 = this.d;
        boolean z9 = this.c;
        boolean z10 = this.b;
        Object obj4 = this.j;
        cfy cfyVar = this.a;
        ((oag) this.i).c(cfyVar, (nep) obj4, z10, z9, z8, z7, z6, (bux) obj, i9, i10);
        return afak.a;
    }

    public /* synthetic */ nzt(oag oagVar, cfy cfyVar, nep nepVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2, int i3) {
        this.k = i3;
        this.i = oagVar;
        this.a = cfyVar;
        this.j = nepVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i;
        this.h = i2;
    }
}
