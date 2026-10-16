package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class mcp implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ cfy b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ mcp(int i, cfy cfyVar, mce mceVar, int i2, int i3, int i4) {
        this.f = i4;
        this.a = i;
        this.b = cfyVar;
        this.e = mceVar;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.f != 0) {
            bux buxVar = (bux) obj;
            ((Integer) obj2).intValue();
            int i = this.c | 1;
            int i2 = i & 306783378;
            int i3 = 613566756 & i;
            int i4 = this.d;
            int i5 = this.a;
            cfy cfyVar = this.b;
            gcb gcbVar = (gcb) this.e;
            gca.a(gcbVar, cfyVar, i5, buxVar, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3), i4);
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i6 = this.c | 1;
        int i7 = i6 & 306783378;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8);
        int i10 = this.d;
        Object obj3 = this.e;
        cfy cfyVar2 = this.b;
        mcd.e(this.a, cfyVar2, (mce) obj3, (bux) obj, i9, i10);
        return afak.a;
    }

    public /* synthetic */ mcp(gcb gcbVar, cfy cfyVar, int i, int i2, int i3, int i4) {
        this.f = i4;
        this.e = gcbVar;
        this.b = cfyVar;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }
}
