package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ekc {
    public static final defpackage.dtq a;
    public static final defpackage.dtq b;

    static {
        java.lang.Class cls = defpackage.eio.a;
        defpackage.dtq dtqVar = null;
        try {
            dtqVar = (defpackage.dtq) java.lang.Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception unused) {
        }
        a = dtqVar;
        b = new defpackage.dtq();
    }
}
