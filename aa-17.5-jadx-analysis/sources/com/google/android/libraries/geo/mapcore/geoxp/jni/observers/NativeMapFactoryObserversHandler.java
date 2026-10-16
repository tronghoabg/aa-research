package com.google.android.libraries.geo.mapcore.geoxp.jni.observers;

import defpackage.abon;
import defpackage.gms;
import defpackage.jor;
import defpackage.kex;
import defpackage.shd;
import defpackage.ynz;
import defpackage.yob;
import defpackage.zgl;
import defpackage.zgp;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class NativeMapFactoryObserversHandler {
    public static final yob a;
    public final kex b;
    private final Executor c;
    private final gms d;

    static {
        zgp zgpVar = zgl.a;
        a = yob.c("com/google/android/libraries/geo/mapcore/geoxp/jni/observers/NativeMapFactoryObserversHandler");
    }

    public NativeMapFactoryObserversHandler(gms gmsVar, kex kexVar, Executor executor) {
        this.d = gmsVar;
        this.b = kexVar;
        this.c = executor;
    }

    private static native boolean nativeInitClass();

    void onPrefetchComplete(long j, byte[] bArr) {
        this.c.execute(new jor(this, bArr, j, 3));
    }

    public void onReportingStateUpdated(byte[] bArr) {
        try {
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9122)).u("Failed to parse reporting state");
        }
    }

    void updateClientParameters() {
        this.c.execute(new shd(this.d, 12));
    }
}
