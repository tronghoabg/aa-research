package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5137a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f5138b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static volatile a.a f5139c;

    public static MessageDigest a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @Deprecated
    public static byte[] b(Context context, String str) {
        MessageDigest messageDigestA;
        PackageInfo packageInfoB = com.google.android.gms.common.d.c.b(context).b(str, 64);
        if (packageInfoB.signatures == null || packageInfoB.signatures.length != 1 || (messageDigestA = a("SHA1")) == null) {
            return null;
        }
        return messageDigestA.digest(packageInfoB.signatures[0].toByteArray());
    }
}
