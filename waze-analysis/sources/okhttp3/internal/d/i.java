package okhttp3.internal.d;

import h.g.b.x;
import h.n.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.ac;
import okhttp3.ai;
import okhttp3.al;
import okhttp3.aq;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class i implements ac {

    /* renamed from: a, reason: collision with root package name */
    private final ai f56074a;

    public i(ai aiVar) {
        x.f(aiVar, "client");
        this.f56074a = aiVar;
    }

    private final boolean a(IOException iOException, okhttp3.internal.c.j jVar, al alVar, boolean z) {
        if (!this.f56074a.x()) {
            return false;
        }
        if (z) {
            alVar.h();
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        return !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z)) && jVar.v();
    }

    private static final int b(aq aqVar, int i2) throws NumberFormatException {
        String strP = aq.p(aqVar, "Retry-After");
        if (strP == null) {
            return i2;
        }
        if (!new l("\\d+").g(strP)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strP);
        x.e(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e A[Catch: all -> 0x0236, TryCatch #1 {all -> 0x0236, blocks: (B:5:0x0026, B:7:0x002c, B:9:0x0032, B:10:0x004c, B:12:0x0053, B:14:0x005e, B:27:0x0086, B:95:0x01b5, B:97:0x01bb, B:101:0x01cd, B:102:0x01e3, B:30:0x008d, B:33:0x0096, B:35:0x009c, B:38:0x00a3, B:41:0x00aa, B:42:0x00af, B:44:0x00be, B:45:0x00c9, B:46:0x00d0, B:47:0x00d1, B:49:0x00d7, B:52:0x00de, B:54:0x00e7, B:56:0x00ee, B:59:0x00f5, B:60:0x0101, B:62:0x010e, B:65:0x0118, B:68:0x0128, B:70:0x014a, B:77:0x0160, B:81:0x016d, B:88:0x0186, B:90:0x0197, B:92:0x01a5, B:93:0x01aa, B:84:0x0177, B:86:0x0181, B:121:0x022e, B:122:0x0235, B:107:0x01ea, B:109:0x01f4, B:111:0x01fe, B:112:0x0204, B:114:0x0206, B:116:0x0211, B:119:0x0223, B:120:0x022d), top: B:126:0x0026, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177 A[Catch: all -> 0x0236, TryCatch #1 {all -> 0x0236, blocks: (B:5:0x0026, B:7:0x002c, B:9:0x0032, B:10:0x004c, B:12:0x0053, B:14:0x005e, B:27:0x0086, B:95:0x01b5, B:97:0x01bb, B:101:0x01cd, B:102:0x01e3, B:30:0x008d, B:33:0x0096, B:35:0x009c, B:38:0x00a3, B:41:0x00aa, B:42:0x00af, B:44:0x00be, B:45:0x00c9, B:46:0x00d0, B:47:0x00d1, B:49:0x00d7, B:52:0x00de, B:54:0x00e7, B:56:0x00ee, B:59:0x00f5, B:60:0x0101, B:62:0x010e, B:65:0x0118, B:68:0x0128, B:70:0x014a, B:77:0x0160, B:81:0x016d, B:88:0x0186, B:90:0x0197, B:92:0x01a5, B:93:0x01aa, B:84:0x0177, B:86:0x0181, B:121:0x022e, B:122:0x0235, B:107:0x01ea, B:109:0x01f4, B:111:0x01fe, B:112:0x0204, B:114:0x0206, B:116:0x0211, B:119:0x0223, B:120:0x022d), top: B:126:0x0026, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186 A[Catch: all -> 0x0236, TryCatch #1 {all -> 0x0236, blocks: (B:5:0x0026, B:7:0x002c, B:9:0x0032, B:10:0x004c, B:12:0x0053, B:14:0x005e, B:27:0x0086, B:95:0x01b5, B:97:0x01bb, B:101:0x01cd, B:102:0x01e3, B:30:0x008d, B:33:0x0096, B:35:0x009c, B:38:0x00a3, B:41:0x00aa, B:42:0x00af, B:44:0x00be, B:45:0x00c9, B:46:0x00d0, B:47:0x00d1, B:49:0x00d7, B:52:0x00de, B:54:0x00e7, B:56:0x00ee, B:59:0x00f5, B:60:0x0101, B:62:0x010e, B:65:0x0118, B:68:0x0128, B:70:0x014a, B:77:0x0160, B:81:0x016d, B:88:0x0186, B:90:0x0197, B:92:0x01a5, B:93:0x01aa, B:84:0x0177, B:86:0x0181, B:121:0x022e, B:122:0x0235, B:107:0x01ea, B:109:0x01f4, B:111:0x01fe, B:112:0x0204, B:114:0x0206, B:116:0x0211, B:119:0x0223, B:120:0x022d), top: B:126:0x0026, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r0v52, types: [okhttp3.ap] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2, types: [okhttp3.at] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // okhttp3.ac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.aq c(okhttp3.internal.d.g r18) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.d.i.c(okhttp3.internal.d.g):okhttp3.aq");
    }
}
