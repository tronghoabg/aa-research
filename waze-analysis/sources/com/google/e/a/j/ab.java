package com.google.e.a.j;

import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab implements com.google.e.a.g.c {
    public static com.google.e.a.g.c b(com.google.e.a.g.a aVar) {
        com.google.e.a.g.c cVarB = com.google.e.a.g.a.b.b(aVar);
        try {
            return new aa(cVarB, com.google.e.a.g.a.c.b(aVar));
        } catch (GeneralSecurityException unused) {
            return cVarB;
        }
    }

    @Override // com.google.e.a.g.c
    public final byte[] a(byte[] bArr, int i2) {
        throw null;
    }
}
