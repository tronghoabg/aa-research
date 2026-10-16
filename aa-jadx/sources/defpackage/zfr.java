package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zfr extends java.lang.RuntimeException {
    private static final long serialVersionUID = 1;
    public final java.util.List a;

    public zfr(java.util.List list) {
        super("Cyclical graphs can not be topologically sorted.");
        this.a = list;
    }
}
