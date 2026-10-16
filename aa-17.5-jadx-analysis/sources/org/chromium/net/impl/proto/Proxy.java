package org.chromium.net.impl.proto;

import defpackage.abnp;
import defpackage.abnq;
import defpackage.abnv;
import defpackage.abpc;
import defpackage.abpg;
import org.chromium.net.impl.proto.ProxyScheme;

/* loaded from: classes2.dex */
public final class Proxy extends abnv<Proxy, Builder> implements ProxyOrBuilder {
    public static final Proxy a;
    private static volatile abpc f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    /* renamed from: org.chromium.net.impl.proto.Proxy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[7];
            a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends abnp<Proxy, Builder> implements ProxyOrBuilder {
        private Builder() {
            super(Proxy.a);
        }
    }

    static {
        Proxy proxy = new Proxy();
        a = proxy;
        abnv.P(Proxy.class, proxy);
    }

    private Proxy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        abpc abnqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            ProxyScheme proxyScheme = ProxyScheme.DIRECT;
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"b", "c", ProxyScheme.ProxySchemeVerifier.a, "d", "e"});
        }
        if (i2 == 3) {
            return new Proxy();
        }
        if (i2 == 4) {
            return new Builder();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        abpc abpcVar = f;
        if (abpcVar != null) {
            return abpcVar;
        }
        synchronized (Proxy.class) {
            abnqVar = f;
            if (abnqVar == null) {
                abnqVar = new abnq(a);
                f = abnqVar;
            }
        }
        return abnqVar;
    }
}
