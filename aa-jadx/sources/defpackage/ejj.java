package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ejj {
    public static final defpackage.dtp a = new defpackage.dtp();
    private static final defpackage.dtp b;

    static {
        java.lang.Class cls = defpackage.eio.a;
        defpackage.dtp dtpVar = null;
        try {
            dtpVar = (defpackage.dtp) java.lang.Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Exception unused) {
        }
        b = dtpVar;
    }

    static defpackage.dtp a() {
        defpackage.dtp dtpVar = b;
        if (dtpVar != null) {
            return dtpVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
