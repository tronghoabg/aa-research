package defpackage;

import java.io.IOException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;

@Deprecated
/* loaded from: classes2.dex */
public interface ajuf extends HostnameVerifier {
    void c(String str, SSLSocket sSLSocket) throws IOException;

    void e(String str, String[] strArr, String[] strArr2) throws SSLException;
}
