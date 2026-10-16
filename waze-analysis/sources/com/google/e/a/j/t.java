package com.google.e.a.j;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    private final x f8756a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f8757b;

    /* synthetic */ t(x xVar, int i2) {
        this.f8757b = i2;
        this.f8756a = xVar;
    }

    @Override // com.google.e.a.j.u
    public final Object a(String str) throws GeneralSecurityException {
        int i2 = this.f8757b;
        Exception exc = null;
        if (i2 == 0) {
            return this.f8756a.a(str, null);
        }
        if (i2 == 1) {
            Iterator it = v.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            while (it.hasNext()) {
                try {
                    return this.f8756a.a(str, (Provider) it.next());
                } catch (Exception unused) {
                }
            }
            return this.f8756a.a(str, null);
        }
        Iterator it2 = v.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        while (it2.hasNext()) {
            try {
                return this.f8756a.a(str, (Provider) it2.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
