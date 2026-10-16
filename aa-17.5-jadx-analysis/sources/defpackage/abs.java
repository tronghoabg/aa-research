package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class abs implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ cfy b;
    public final /* synthetic */ acp c;
    public final /* synthetic */ acq d;
    public final /* synthetic */ String e;
    public final /* synthetic */ afeh f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    private final /* synthetic */ int j;

    public /* synthetic */ abs(Object obj, boolean z, cfy cfyVar, acp acpVar, acq acqVar, String str, afeh afehVar, int i, int i2, int i3) {
        this.j = i3;
        this.i = obj;
        this.a = z;
        this.b = cfyVar;
        this.c = acpVar;
        this.d = acqVar;
        this.e = str;
        this.f = afehVar;
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [avx, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.j != 0) {
            ((Integer) obj2).intValue();
            int i = this.g | 1;
            int i2 = 306783378 & i;
            int i3 = 613566756 & i;
            int i4 = this.h;
            afeh afehVar = this.f;
            String str = this.e;
            acq acqVar = this.d;
            acp acpVar = this.c;
            cfy cfyVar = this.b;
            boolean z = this.a;
            ?? r4 = this.i;
            ca.N(r4, z, cfyVar, acpVar, acqVar, str, afehVar, (bux) obj, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3), i4);
            return afak.a;
        }
        ((Integer) obj2).intValue();
        int i5 = this.g | 1;
        int i6 = 306783378 & i5;
        int i7 = 613566756 & i5;
        int i8 = (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7);
        int i9 = this.h;
        afeh afehVar2 = this.f;
        String str2 = this.e;
        acq acqVar2 = this.d;
        acp acpVar2 = this.c;
        cfy cfyVar2 = this.b;
        boolean z2 = this.a;
        ca.P((ats) this.i, z2, cfyVar2, acpVar2, acqVar2, str2, afehVar2, (bux) obj, i8, i9);
        return afak.a;
    }
}
