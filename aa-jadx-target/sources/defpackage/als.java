package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class als implements defpackage.affm {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affm
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        int i;
        ((java.lang.Boolean) obj3).booleanValue();
        int iIntValue = ((java.lang.Integer) obj8).intValue();
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
            defpackage.amb.b((java.lang.String) obj2, true, (defpackage.alu) obj4, obj, obj5, obj6, obj7, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            obj7.s();
        }
        return defpackage.afbk.a;
    }
}
