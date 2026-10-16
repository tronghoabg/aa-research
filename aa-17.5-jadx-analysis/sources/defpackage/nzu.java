package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nzu implements afeh {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ bym g;
    private final /* synthetic */ int h;

    public /* synthetic */ nzu(long j, bym bymVar, bym bymVar2, bym bymVar3, boolean z, Integer num, byd bydVar, int i) {
        this.h = i;
        this.a = j;
        this.c = bymVar;
        this.d = bymVar2;
        this.e = bymVar3;
        this.b = z;
        this.f = num;
        this.g = bydVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [ckv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bym, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.h == 0) {
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((abu) obj).getClass();
            int i = iIntValue & 17;
            if (buxVar.I(i != 16, iIntValue & 1)) {
                bym bymVar = this.g;
                Object obj4 = this.f;
                boolean z = this.b;
                oag.h(this.a, this.c, this.d, this.e, z, (Integer) obj4, (byd) bymVar, null, buxVar, 1);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        afeg afegVar = (afeg) obj;
        bux buxVar2 = (bux) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        afegVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= true != buxVar2.E(afegVar) ? 2 : 4;
        }
        if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            bym bymVar2 = this.g;
            ?? r11 = this.d;
            Object obj5 = this.c;
            gbt.p(afegVar, ((Boolean) bymVar2.a()).booleanValue(), (gbv) this.f, this.a, this.b, (ieb) this.e, (cil) obj5, r11, buxVar2, (iIntValue2 & 14) | 1573376);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ nzu(gbv gbvVar, long j, boolean z, ieb iebVar, cil cilVar, ckv ckvVar, bym bymVar, int i) {
        this.h = i;
        this.f = gbvVar;
        this.a = j;
        this.b = z;
        this.e = iebVar;
        this.c = cilVar;
        this.d = ckvVar;
        this.g = bymVar;
    }
}
