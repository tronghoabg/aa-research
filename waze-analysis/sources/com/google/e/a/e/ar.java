package com.google.e.a.e;

import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8433a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(com.google.e.a.n nVar) {
        for (int i2 = 0; i2 < nVar.a(); i2++) {
            com.google.e.a.m mVarC = nVar.c(i2);
            if (mVarC.h() && mVarC.c().equals(com.google.e.a.f.f8466a)) {
                return true;
            }
        }
        return false;
    }
}
