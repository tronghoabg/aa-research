package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;

/* loaded from: classes2.dex */
public final class ajxo {
    private final Log a;
    private final String b = "";

    public ajxo(Log log) {
        this.a = log;
    }

    public final void a(byte[] bArr) throws IOException {
        ahgm.e(bArr, "Input");
        c("<< ", new ByteArrayInputStream(bArr));
    }

    public final void b(byte[] bArr) throws IOException {
        ahgm.e(bArr, "Output");
        c(">> ", new ByteArrayInputStream(bArr));
    }

    public final void c(String str, InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
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
                sb.append(Integer.toHexString(i));
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
