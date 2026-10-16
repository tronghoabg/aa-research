package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ekr {
    public static final defpackage.dtr a;
    public static final defpackage.dtr b;

    static {
        java.lang.Class cls = defpackage.eio.a;
        defpackage.dtr dtrVar = null;
        try {
            dtrVar = (defpackage.dtr) java.lang.Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception unused) {
        }
        a = dtrVar;
        b = new defpackage.dtr();
    }
}
