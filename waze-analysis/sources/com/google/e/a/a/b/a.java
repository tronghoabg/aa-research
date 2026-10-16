package com.google.e.a.a.b;

import com.google.e.a.a.a.f;
import com.google.e.a.j.v;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) v.f8758a.a("AES/GCM-SIV/NoPadding");
            if (f.c(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
