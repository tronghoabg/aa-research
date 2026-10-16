package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ekg {
    private static final defpackage.ekk b = new defpackage.eke(0);
    public final defpackage.ekk a;

    public ekg() {
        defpackage.ekk ekkVar;
        defpackage.ekk[] ekkVarArr = new defpackage.ekk[2];
        ekkVarArr[0] = defpackage.eke.a;
        java.lang.Class cls = defpackage.eio.a;
        try {
            ekkVar = (defpackage.ekk) java.lang.Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (java.lang.Exception unused) {
            ekkVar = b;
        }
        ekkVarArr[1] = ekkVar;
        defpackage.ekf ekfVar = new defpackage.ekf(ekkVarArr);
        java.nio.charset.Charset charset = defpackage.ejv.a;
        this.a = ekfVar;
    }

    public static boolean a(defpackage.ekj ekjVar) {
        return ekjVar.c() + (-1) != 1;
    }

    public static boolean b(java.lang.Class cls) {
        java.lang.Class cls2 = defpackage.eio.a;
        return defpackage.ejq.class.isAssignableFrom(cls);
    }
}
