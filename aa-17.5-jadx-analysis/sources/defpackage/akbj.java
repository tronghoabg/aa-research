package defpackage;

/* loaded from: classes2.dex */
public final class akbj implements AutoCloseable {
    public akbj(String str) {
        if (str.length() > 127) {
            str.substring(0, 124);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
