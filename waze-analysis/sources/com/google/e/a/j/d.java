package com.google.e.a.j;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) v.f8758a.a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
