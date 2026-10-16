package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class enb extends android.text.Editable.Factory {
    private static final java.lang.Object a = new java.lang.Object();
    private static volatile android.text.Editable.Factory b;
    private static java.lang.Class c;

    private enb() {
        try {
            c = java.lang.Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static android.text.Editable.Factory a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new defpackage.enb();
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        java.lang.Class cls = c;
        return cls != null ? new defpackage.ena(cls, charSequence) : super.newEditable(charSequence);
    }
}
