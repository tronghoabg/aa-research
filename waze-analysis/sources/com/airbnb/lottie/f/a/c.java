package com.airbnb.lottie.f.a;

import java.io.IOException;
import k.h;
import k.k;
import k.z;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final String[] f2310a;

    /* renamed from: b, reason: collision with root package name */
    final z f2311b;

    private c(String[] strArr, z zVar) {
        this.f2310a = strArr;
        this.f2311b = zVar;
    }

    public static c a(String... strArr) {
        try {
            k[] kVarArr = new k[strArr.length];
            h hVar = new h();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                d.i(hVar, strArr[i2]);
                hVar.c();
                kVarArr[i2] = hVar.G();
            }
            return new c((String[]) strArr.clone(), z.f50879a.a(kVarArr));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    static /* synthetic */ String b(e eVar, String str) {
        return str + com.waze.c.c.e.c(eVar.s()) + " at path " + eVar.f();
    }
}
