package com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher;

import defpackage.isq;
import defpackage.pmc;
import defpackage.pwr;
import defpackage.uzw;
import defpackage.yob;
import defpackage.zgl;
import defpackage.zgp;
import defpackage.zgt;

/* loaded from: classes3.dex */
public final class NativeNetworkTileFetchHandler {
    public static final yob a;
    public final pwr b;
    public final zgt c;

    static {
        zgp zgpVar = zgl.a;
        a = yob.c("com/google/android/libraries/geo/mapcore/geoxp/jni/fetcher/NativeNetworkTileFetchHandler");
    }

    public NativeNetworkTileFetchHandler(pwr pwrVar, zgt zgtVar) {
        this.b = pwrVar;
        ((pmc) pwrVar).b.a(uzw.a);
        this.c = zgtVar;
    }

    private static native boolean nativeInitClass();

    public void requestTile(long j, byte[] bArr, byte[] bArr2, boolean z) {
        this.c.execute(new isq(this, bArr, bArr2, z, 9));
    }
}
