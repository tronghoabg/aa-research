package com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher;

import defpackage.oyx;
import defpackage.zgl;
import defpackage.zgp;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class NativeUrlLoader {
    private final Executor a;

    static {
        zgp zgpVar = zgl.a;
    }

    public NativeUrlLoader(Executor executor) {
        this.a = executor;
    }

    private static native boolean nativeInitClass();

    public void loadUrl(long j, String str) {
        this.a.execute(new oyx(12));
    }
}
