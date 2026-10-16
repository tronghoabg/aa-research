package org.chromium.net.impl.proto;

import defpackage.abnz;
import defpackage.aboa;
import defpackage.abob;

/* loaded from: classes2.dex */
public enum ProxyScheme implements abnz {
    DIRECT(0),
    HTTP(1),
    HTTPS(2);

    public final int d;

    /* renamed from: org.chromium.net.impl.proto.ProxyScheme$1, reason: invalid class name */
    class AnonymousClass1 implements aboa<ProxyScheme> {
        AnonymousClass1() {
        }

        @Override // defpackage.aboa
        public final /* synthetic */ abnz a(int i) {
            return ProxyScheme.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ProxySchemeVerifier implements abob {
        static final abob a = new ProxySchemeVerifier();

        private ProxySchemeVerifier() {
        }

        @Override // defpackage.abob
        public final boolean a(int i) {
            return ProxyScheme.b(i) != null;
        }
    }

    ProxyScheme(int i) {
        this.d = i;
    }

    public static ProxyScheme b(int i) {
        if (i == 0) {
            return DIRECT;
        }
        if (i == 1) {
            return HTTP;
        }
        if (i != 2) {
            return null;
        }
        return HTTPS;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
