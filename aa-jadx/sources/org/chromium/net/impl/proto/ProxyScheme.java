package org.chromium.net.impl.proto;

/* JADX INFO: loaded from: classes2.dex */
public enum ProxyScheme implements defpackage.abpb {
    DIRECT(0),
    HTTP(1),
    HTTPS(2);

    public final int d;

    /* JADX INFO: renamed from: org.chromium.net.impl.proto.ProxyScheme$1, reason: invalid class name */
    class AnonymousClass1 implements defpackage.abpc<org.chromium.net.impl.proto.ProxyScheme> {
        AnonymousClass1() {
        }

        @Override // defpackage.abpc
        public final /* synthetic */ defpackage.abpb a(int i) {
            return org.chromium.net.impl.proto.ProxyScheme.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ProxySchemeVerifier implements defpackage.abpd {
        static final defpackage.abpd a = new org.chromium.net.impl.proto.ProxyScheme.ProxySchemeVerifier();

        private ProxySchemeVerifier() {
        }

        @Override // defpackage.abpd
        public final boolean a(int i) {
            return org.chromium.net.impl.proto.ProxyScheme.b(i) != null;
        }
    }

    ProxyScheme(int i) {
        this.d = i;
    }

    public static org.chromium.net.impl.proto.ProxyScheme b(int i) {
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

    @Override // defpackage.abpb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
