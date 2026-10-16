package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nkp implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nkp(boolean z, boolean z2, afec afecVar, cfy cfyVar, int i, int i2, int i3) {
        this.g = i3;
        this.a = z;
        this.b = z2;
        this.e = afecVar;
        this.f = cfyVar;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.g != 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.c | 1;
            int i2 = i & 306783378;
            int i3 = 613566756 & i;
            int i4 = (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3);
            int i5 = this.d;
            ?? r7 = this.e;
            Object obj3 = this.f;
            jtr.b(this.a, this.b, (hjo) obj3, r7, buxVar, i4, i5);
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        ((Integer) obj2).intValue();
        int i6 = this.c | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8);
        int i10 = this.d;
        ?? r3 = this.f;
        ?? r2 = this.e;
        lvl.O(this.a, this.b, r2, r3, buxVar2, i9, i10);
        return afak.a;
    }

    public /* synthetic */ nkp(boolean z, boolean z2, hjo hjoVar, afeg afegVar, int i, int i2, int i3) {
        this.g = i3;
        this.a = z;
        this.b = z2;
        this.f = hjoVar;
        this.e = afegVar;
        this.c = i;
        this.d = i2;
    }
}
