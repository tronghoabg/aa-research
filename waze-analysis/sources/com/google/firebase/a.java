package com.google.firebase;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {
    public static void a(ByteBuffer byteBuffer, long j2) throws GeneralSecurityException {
        if (j2 < 0 || j2 >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j2);
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
