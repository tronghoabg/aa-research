package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajyo {
    private final org.apache.commons.logging.Log a;
    private final java.lang.String b = "";

    public ajyo(org.apache.commons.logging.Log log) {
        this.a = log;
    }

    public final void a(byte[] bArr) throws java.io.IOException {
        defpackage.aguw.e(bArr, "Input");
        c("<< ", new java.io.ByteArrayInputStream(bArr));
    }

    public final void b(byte[] bArr) throws java.io.IOException {
        defpackage.aguw.e(bArr, "Output");
        c(">> ", new java.io.ByteArrayInputStream(bArr));
    }

    public final void c(java.lang.String str, java.io.InputStream inputStream) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i = inputStream.read();
            if (i == -1) {
                break;
            }
            if (i == 13) {
                sb.append("[\\r]");
            } else if (i == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, "\"");
                sb.insert(0, str);
                this.a.debug(this.b + " " + sb.toString());
                sb.setLength(0);
            } else if (i < 32 || i > 127) {
                sb.append("[0x");
                sb.append(java.lang.Integer.toHexString(i));
                sb.append("]");
            } else {
                sb.append((char) i);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            this.a.debug(this.b + " " + sb.toString());
        }
    }

    public final boolean d() {
        return this.a.isDebugEnabled();
    }
}
