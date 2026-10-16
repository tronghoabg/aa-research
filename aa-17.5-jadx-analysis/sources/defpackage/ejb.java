package defpackage;

/* loaded from: classes2.dex */
final class ejb {
    public static final dtg a = new dtg();
    private static final dtg b;

    static {
        Class cls = eig.a;
        dtg dtgVar = null;
        try {
            dtgVar = (dtg) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = dtgVar;
    }

    static dtg a() {
        dtg dtgVar = b;
        if (dtgVar != null) {
            return dtgVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
