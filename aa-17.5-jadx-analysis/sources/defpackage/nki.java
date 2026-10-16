package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nki implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    public /* synthetic */ nki(gbg gbgVar, gcq gcqVar, boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
        this.h = i3;
        this.g = gbgVar;
        this.f = gcqVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gbg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.h != 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.d | 1;
            int i2 = i & 306783378;
            int i3 = 613566756 & i;
            int i4 = this.e;
            boolean z = this.c;
            boolean z2 = this.b;
            boolean z3 = this.a;
            fww.b(this.g, (gcq) this.f, z3, z2, z, buxVar, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3), i4);
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i5 = this.d | 1;
        int i6 = i5 & 306783378;
        int i7 = 613566756 & i5;
        int i8 = (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7);
        int i9 = this.e;
        ?? r4 = this.g;
        ?? r3 = this.f;
        boolean z4 = this.c;
        lvl.X(this.a, this.b, z4, r3, r4, buxVar2, i8, i9);
        return afak.a;
    }

    public /* synthetic */ nki(boolean z, boolean z2, boolean z3, afec afecVar, cfy cfyVar, int i, int i2, int i3) {
        this.h = i3;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f = afecVar;
        this.g = cfyVar;
        this.d = i;
        this.e = i2;
    }
}
