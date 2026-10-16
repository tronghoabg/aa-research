package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akcj implements java.lang.AutoCloseable {
    public akcj(java.lang.String str) {
        if (str.length() > 127) {
            str.substring(0, 124);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
