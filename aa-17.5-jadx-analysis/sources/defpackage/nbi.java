package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nbi implements afeg {
    public final /* synthetic */ cfy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nbi(cfy cfyVar, boolean z, hjw hjwVar, hcw hcwVar, int i, int i2, int i3) {
        this.g = i3;
        this.a = cfyVar;
        this.b = z;
        this.f = hjwVar;
        this.e = hcwVar;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [hcw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.c | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            int i5 = (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4);
            int i6 = this.d;
            boolean z = this.b;
            cfy cfyVar = this.a;
            Object obj3 = this.f;
            ((uxc) this.e).c((String) obj3, cfyVar, z, (bux) obj, i5, i6);
            return afak.a;
        }
        if (i != 1) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i7 = this.d;
            cfy cfyVar2 = this.a;
            ?? r8 = this.f;
            Object obj4 = this.e;
            int i8 = this.c;
            boolean z2 = this.b;
            int i9 = i7 | 1;
            int i10 = i9 & 306783378;
            int i11 = 613566756 & i9;
            mva.L(z2, i8, (String) obj4, r8, cfyVar2, buxVar, (i9 & (-920350135)) | i10 | (i11 >> 1) | ((i10 + i10) & i11));
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i12 = this.c | 1;
        int i13 = i12 & 306783378;
        int i14 = 613566756 & i12;
        int i15 = (i12 & (-920350135)) | i13 | (i14 >> 1) | ((i13 + i13) & i14);
        int i16 = this.d;
        ?? r3 = this.e;
        Object obj5 = this.f;
        boolean z3 = this.b;
        guc.g(this.a, z3, (hjw) obj5, r3, (bux) obj, i15, i16);
        return afak.a;
    }

    public /* synthetic */ nbi(uxc uxcVar, String str, cfy cfyVar, boolean z, int i, int i2, int i3) {
        this.g = i3;
        this.e = uxcVar;
        this.f = str;
        this.a = cfyVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ nbi(boolean z, int i, String str, afdr afdrVar, cfy cfyVar, int i2, int i3) {
        this.g = i3;
        this.b = z;
        this.c = i;
        this.e = str;
        this.f = afdrVar;
        this.a = cfyVar;
        this.d = i2;
    }
}
