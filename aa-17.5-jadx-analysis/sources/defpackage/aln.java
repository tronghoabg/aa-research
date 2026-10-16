package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class aln implements afem {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afem
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        ((Boolean) obj3).booleanValue();
        int iIntValue = ((Integer) obj8).intValue();
        if ((iIntValue & 6) == 0) {
            i = (true != obj7.C(obj) ? 2 : 4) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= true != obj7.C(obj2) ? 16 : 32;
        }
        if ((iIntValue & 384) == 0) {
            i |= true != obj7.D(true) ? 128 : 256;
        }
        if ((iIntValue & 3072) == 0) {
            i |= true != obj7.C(obj4) ? 1024 : 2048;
        }
        if ((iIntValue & 24576) == 0) {
            i |= true != obj7.E(obj5) ? 8192 : 16384;
        }
        if ((iIntValue & 196608) == 0) {
            i |= true != obj7.E(obj6) ? 65536 : 131072;
        }
        if (obj7.I((599187 & i) != 599186, i & 1)) {
            alw.b((String) obj2, true, (alp) obj4, obj, obj5, obj6, obj7, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            obj7.s();
        }
        return afak.a;
    }
}
