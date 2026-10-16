package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nlv implements afeh {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kts d;
    private final /* synthetic */ int e;

    public /* synthetic */ nlv(String str, boolean z, boolean z2, kts ktsVar, int i) {
        this.e = i;
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = ktsVar;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            int iIntValue = ((Integer) obj3).intValue();
            kts ktsVar = this.d;
            boolean z = this.c;
            boolean z2 = this.b;
            return lxr.G(this.a, z2, z, ktsVar, (ats) obj, (bux) obj2, iIntValue);
        }
        int iIntValue2 = ((Integer) obj3).intValue();
        kts ktsVar2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.b;
        return lxr.G(this.a, z4, z3, ktsVar2, (ats) obj, (bux) obj2, iIntValue2);
    }
}
