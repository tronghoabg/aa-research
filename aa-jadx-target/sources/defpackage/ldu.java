package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ldu extends defpackage.ldv {
    @Override // defpackage.ldv
    public final defpackage.tex a() {
        defpackage.jfa jfaVar = (defpackage.jfa) ((java.lang.ref.WeakReference) defpackage.iwa.a().b).get();
        return defpackage.lbm.b(jfaVar != null ? jfaVar.t() : null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    @Override // defpackage.ldv
    public final java.lang.Boolean b() {
        boolean z;
        defpackage.iwa iwaVarA = defpackage.iwa.a();
        defpackage.jey jeyVarA = defpackage.jey.e;
        defpackage.jez jezVar = (defpackage.jez) ((java.lang.ref.WeakReference) iwaVarA.a).get();
        if (jezVar != null) {
            jeyVarA = jezVar.a();
        }
        int iOrdinal = jeyVarA.ordinal();
        if (iOrdinal != 0) {
            z = true;
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal == 4) {
                    z = false;
                } else if (iOrdinal != 5) {
                    throw new java.lang.RuntimeException(null, null);
                }
            }
        } else {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
