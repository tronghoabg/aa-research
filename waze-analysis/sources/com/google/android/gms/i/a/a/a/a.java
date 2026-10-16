package com.google.android.gms.i.a.a.a;

import android.util.Base64;
import java.security.SecureRandom;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final SecureRandom f5498a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f5498a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
