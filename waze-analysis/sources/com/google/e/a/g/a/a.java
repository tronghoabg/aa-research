package com.google.e.a.g.a;

import com.google.e.a.j.v;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) v.f8758a.a("AES/ECB/NoPadding");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
