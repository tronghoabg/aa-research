package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class myq implements defpackage.affg {
    public final /* synthetic */ defpackage.afer a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ defpackage.cgf e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ defpackage.affg g;
    public final /* synthetic */ int h;
    private final /* synthetic */ int i;

    public /* synthetic */ myq(defpackage.afer aferVar, boolean z, long j, long j2, defpackage.cgf cgfVar, boolean z2, defpackage.affg affgVar, int i, int i2) {
        this.i = i2;
        this.a = aferVar;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = cgfVar;
        this.f = z2;
        this.g = affgVar;
        this.h = i;
    }

    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.i != 0) {
            ((java.lang.Integer) obj2).intValue();
            int i = this.h;
            long j = this.d;
            long j2 = this.c;
            defpackage.affg affgVar = this.g;
            boolean z = this.f;
            defpackage.cgf cgfVar = this.e;
            defpackage.afer aferVar = this.a;
            int i2 = i | 1;
            int i3 = i2 & 306783378;
            int i4 = 613566756 & i2;
            defpackage.brh.d(this.b, aferVar, cgfVar, z, affgVar, j2, j, (defpackage.bve) obj, (i2 & (-920350135)) | i3 | (i4 >> 1) | ((i3 + i3) & i4));
            return defpackage.afbk.a;
        }
        ((java.lang.Integer) obj2).intValue();
        int i5 = this.h;
        defpackage.affg affgVar2 = this.g;
        boolean z2 = this.f;
        defpackage.cgf cgfVar2 = this.e;
        long j3 = this.d;
        long j4 = this.c;
        boolean z3 = this.b;
        int i6 = i5 | 1;
        int i7 = 306783378 & i6;
        int i8 = 613566756 & i6;
        int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1);
        defpackage.myx.J(this.a, z3, j4, j3, cgfVar2, z2, affgVar2, (defpackage.bve) obj, (i8 & (i7 + i7)) | i9);
        return defpackage.afbk.a;
    }

    public /* synthetic */ myq(boolean z, defpackage.afer aferVar, defpackage.cgf cgfVar, boolean z2, defpackage.affg affgVar, long j, long j2, int i, int i2) {
        this.i = i2;
        this.b = z;
        this.a = aferVar;
        this.e = cgfVar;
        this.f = z2;
        this.g = affgVar;
        this.c = j;
        this.d = j2;
        this.h = i;
    }
}
