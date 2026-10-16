package com.google.e.a.a.a;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends ThreadLocal {
    protected static final Cipher a() {
        try {
            return (Cipher) com.google.e.a.j.v.f8758a.a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
