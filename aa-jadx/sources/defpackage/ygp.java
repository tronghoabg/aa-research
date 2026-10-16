package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ygp implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.EnumSet a;

    public ygp(java.util.EnumSet enumSet) {
        this.a = enumSet;
    }

    java.lang.Object readResolve() {
        return new defpackage.ygq(this.a.clone());
    }
}
