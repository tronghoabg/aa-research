package qd;

import java.security.PrivilegedExceptionAction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: qd.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3891f implements PrivilegedExceptionAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44225a;

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        switch (this.f44225a) {
            case 0:
                return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
            case 1:
                return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            default:
                return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }
}
