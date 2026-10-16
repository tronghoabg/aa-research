package qd;

import K8.C0694f;
import R8.v;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* renamed from: qd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3887b {

    /* renamed from: e, reason: collision with root package name */
    public static final C3887b f44209e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f44210a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f44211b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f44212c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f44213d;

    static {
        EnumC3886a[] enumC3886aArr = {EnumC3886a.TLS_AES_128_GCM_SHA256, EnumC3886a.TLS_AES_256_GCM_SHA384, EnumC3886a.TLS_CHACHA20_POLY1305_SHA256, EnumC3886a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC3886a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC3886a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC3886a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC3886a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC3886a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, EnumC3886a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC3886a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC3886a.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC3886a.TLS_RSA_WITH_AES_256_GCM_SHA384, EnumC3886a.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC3886a.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC3886a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        C0694f c0694f = new C0694f(true);
        c0694f.c(enumC3886aArr);
        m mVar = m.TLS_1_3;
        m mVar2 = m.TLS_1_2;
        c0694f.f(mVar, mVar2);
        if (!c0694f.f6639a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0694f.f6640b = true;
        C3887b c3887b = new C3887b(c0694f);
        f44209e = c3887b;
        C0694f c0694f2 = new C0694f(c3887b);
        c0694f2.f(mVar, mVar2, m.TLS_1_1, m.TLS_1_0);
        if (!c0694f2.f6639a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0694f2.f6640b = true;
        new C3887b(c0694f2);
        new C3887b(new C0694f(false));
    }

    public C3887b(C0694f c0694f) {
        this.f44210a = c0694f.f6639a;
        this.f44211b = (String[]) c0694f.f6641c;
        this.f44212c = (String[]) c0694f.f6642d;
        this.f44213d = c0694f.f6640b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3887b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C3887b c3887b = (C3887b) obj;
        boolean z2 = c3887b.f44210a;
        boolean z10 = this.f44210a;
        if (z10 != z2) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f44211b, c3887b.f44211b) && Arrays.equals(this.f44212c, c3887b.f44212c) && this.f44213d == c3887b.f44213d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f44210a) {
            return ((((527 + Arrays.hashCode(this.f44211b)) * 31) + Arrays.hashCode(this.f44212c)) * 31) + (!this.f44213d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        m mVar;
        if (!this.f44210a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f44211b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            EnumC3886a[] enumC3886aArr = new EnumC3886a[strArr.length];
            for (int i5 = 0; i5 < strArr.length; i5++) {
                String str = strArr[i5];
                enumC3886aArr[i5] = str.startsWith("SSL_") ? EnumC3886a.valueOf("TLS_" + str.substring(4)) : EnumC3886a.valueOf(str);
            }
            String[] strArr2 = n.f44258a;
            listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList((Object[]) enumC3886aArr.clone()));
        }
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f44212c;
        m[] mVarArr = new m[strArr3.length];
        for (int i10 = 0; i10 < strArr3.length; i10++) {
            String str2 = strArr3[i10];
            if ("TLSv1.3".equals(str2)) {
                mVar = m.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                mVar = m.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                mVar = m.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                mVar = m.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(v.f("Unexpected TLS version: ", str2));
                }
                mVar = m.SSL_3_0;
            }
            mVarArr[i10] = mVar;
        }
        String[] strArr4 = n.f44258a;
        sbW.append(DesugarCollections.unmodifiableList(Arrays.asList((Object[]) mVarArr.clone())));
        sbW.append(", supportsTlsExtensions=");
        sbW.append(this.f44213d);
        sbW.append(")");
        return sbW.toString();
    }
}
