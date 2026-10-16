package org.chromium.net.impl.proto;

import defpackage.abnp;
import defpackage.abnq;
import defpackage.abnv;
import defpackage.aboh;
import defpackage.abpc;
import defpackage.abpf;
import defpackage.abpg;

/* loaded from: classes2.dex */
public final class ProxyOptions extends abnv<ProxyOptions, Builder> implements ProxyOptionsOrBuilder {
    public static final ProxyOptions a;
    private static volatile abpc c;
    public aboh b = abpf.b;

    /* renamed from: org.chromium.net.impl.proto.ProxyOptions$1, reason: invalid class name */
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

    public static final class Builder extends abnp<ProxyOptions, Builder> implements ProxyOptionsOrBuilder {
        private Builder() {
            super(ProxyOptions.a);
        }
    }

    static {
        ProxyOptions proxyOptions = new ProxyOptions();
        a = proxyOptions;
        abnv.P(ProxyOptions.class, proxyOptions);
    }

    private ProxyOptions() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        abpc abnqVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", Proxy.class});
        }
        if (i2 == 3) {
            return new ProxyOptions();
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
        abpc abpcVar = c;
        if (abpcVar != null) {
            return abpcVar;
        }
        synchronized (ProxyOptions.class) {
            abnqVar = c;
            if (abnqVar == null) {
                abnqVar = new abnq(a);
                c = abnqVar;
            }
        }
        return abnqVar;
    }
}
