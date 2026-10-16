package com.google.e.a.c.a;

import com.google.e.a.e.ad;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d implements com.google.e.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final c f8372a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f8373b;

    d(c cVar, ad adVar) {
        this.f8372a = cVar;
        this.f8373b = adVar;
    }

    @Override // com.google.e.a.d
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f8373b.a(bArr).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            try {
                byte[] bArrA = cVar.f8370a.a(bArr, bArr2);
                int i2 = cVar.f8371b;
                int length = bArr.length;
                return bArrA;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.e.a.d
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArrB = this.f8372a.f8370a.b(bArr, bArr2);
        int length = bArr.length;
        return bArrB;
    }
}
