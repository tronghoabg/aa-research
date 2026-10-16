package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class cm extends java.io.Writer {
    private final java.lang.StringBuilder b = new java.lang.StringBuilder(128);
    private final java.lang.String a = "FragmentManager";

    private final void a() {
        java.lang.StringBuilder sb = this.b;
        if (sb.length() > 0) {
            android.util.Log.d(this.a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.b.append(c);
            }
        }
    }
}
