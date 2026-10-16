package com.google.firebase.perf.f;

import com.google.v.dm;
import com.google.v.fj;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends dm<h, f> implements fj {
    /* synthetic */ f(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final boolean a() {
        return ((h) this.instance).hasAppInstanceId();
    }

    public final void b(Map map) {
        copyOnWrite();
        ((h) this.instance).getMutableCustomAttributesMap().putAll(map);
    }

    public final void c(a aVar) {
        copyOnWrite();
        ((h) this.instance).setAndroidAppInfo(aVar.build());
    }

    public final void d(String str) {
        copyOnWrite();
        ((h) this.instance).setAppInstanceId(str);
    }

    public final void e(i iVar) {
        copyOnWrite();
        ((h) this.instance).setApplicationProcessState(iVar);
    }

    public final void f(String str) {
        copyOnWrite();
        ((h) this.instance).setGoogleAppId(str);
    }

    private f() {
        throw null;
    }
}
