package com.google.e.a.a.a;

import com.google.e.a.e.ad;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r implements com.google.e.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f8141a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f8142b;

    /* synthetic */ r(q qVar, ad adVar) {
        this.f8141a = qVar;
        this.f8142b = adVar;
    }

    @Override // com.google.e.a.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f8142b.a(bArr).iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            try {
                byte[] bArrA = qVar.f8139a.a(bArr, bArr2);
                int i2 = qVar.f8140b;
                int length = bArr.length;
                return bArrA;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.e.a.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArrB = this.f8141a.f8139a.b(bArr, bArr2);
        int length = bArr.length;
        return bArrB;
    }
}
