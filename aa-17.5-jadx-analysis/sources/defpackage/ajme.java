package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public final class ajme implements ajmg {
    public static final ajmd a = new ajmd();
    private final Class b;
    private final Method c;
    private final Method d;
    private final Method e;

    public ajme(Class cls) throws NoSuchMethodException, SecurityException {
        this.b = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.c = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.ajmg
    public final String a(SSLSocket sSLSocket) {
        if (!d(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, aise.a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && affa.f(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.ajmg
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (d(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, true);
                Method method = this.e;
                ajly ajlyVar = ajly.c;
                ajmy ajmyVar = new ajmy();
                for (String str2 : ahet.b(list)) {
                    ajmyVar.N(str2.length());
                    ajmyVar.V(str2);
                }
                method.invoke(sSLSocket, ajmyVar.D());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.ajmg
    public final boolean c() {
        return ajlx.b;
    }

    @Override // defpackage.ajmg
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.isInstance(sSLSocket);
    }

    public ajme(Class cls, byte[] bArr) {
        this(cls);
    }
}
