package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class dbb implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dbb(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cym, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.d != 0) {
            ((Integer) obj2).intValue();
            int i = this.a;
            Object obj3 = this.c;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            ((cct) this.b).b(obj3, (bux) obj, (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 + i2) & i3) | 1);
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i4 = this.a;
        ?? r0 = this.c;
        int i5 = i4 | 1;
        int i6 = 306783378 & i5;
        int i7 = 613566756 & i5;
        dbc.a(this.b, r0, (bux) obj, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
        return afak.a;
    }
}
