package okhttp3.internal.http;

import Bf.r;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Protocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatusLine {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f42657d = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Protocol f42658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42660c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "<init>", "()V", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static StatusLine a(String statusLine) throws ProtocolException, NumberFormatException {
            Protocol protocol;
            int i5;
            String strSubstring;
            AbstractC3340k.e(statusLine, "statusLine");
            if (r.k0(statusLine, "HTTP/1.", false)) {
                i5 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(AbstractC3340k.k(statusLine, "Unexpected status line: "));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(AbstractC3340k.k(statusLine, "Unexpected status line: "));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!r.k0(statusLine, "ICY ", false)) {
                    throw new ProtocolException(AbstractC3340k.k(statusLine, "Unexpected status line: "));
                }
                protocol = Protocol.HTTP_1_0;
                i5 = 4;
            }
            int i10 = i5 + 3;
            if (statusLine.length() < i10) {
                throw new ProtocolException(AbstractC3340k.k(statusLine, "Unexpected status line: "));
            }
            try {
                String strSubstring2 = statusLine.substring(i5, i10);
                AbstractC3340k.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i11 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i10) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i10) != ' ') {
                        throw new ProtocolException(AbstractC3340k.k(statusLine, "Unexpected status line: "));
                    }
                    strSubstring = statusLine.substring(i5 + 4);
                    AbstractC3340k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i11, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(AbstractC3340k.k(statusLine, "Unexpected status line: "));
            }
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i5, String message) {
        AbstractC3340k.e(protocol, "protocol");
        AbstractC3340k.e(message, "message");
        this.f42658a = protocol;
        this.f42659b = i5;
        this.f42660c = message;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f42658a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f42659b);
        sb2.append(' ');
        sb2.append(this.f42660c);
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
