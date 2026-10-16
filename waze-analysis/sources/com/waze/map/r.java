package com.waze.map;

import com.waze.jni.protos.NavigationSegment;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class r implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f29593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29594b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29595c;

    public /* synthetic */ r(ao aoVar, NavigationSegment navigationSegment, int i2) {
        this.f29595c = i2;
        this.f29594b = aoVar;
        this.f29593a = navigationSegment;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f29595c;
        if (i2 == 0) {
            u.initNativeLayer$lambda$0((u) this.f29593a, (String) this.f29594b);
            return null;
        }
        if (i2 == 1) {
            u.performZoomIn$lambda$0((u) this.f29593a, (String) this.f29594b);
            return null;
        }
        if (i2 == 2) {
            u.cleanupAndClose$lambda$0((u) this.f29593a, (String) this.f29594b);
            return null;
        }
        if (i2 != 3) {
            return ao.resolveSegmentToLine$lambda$0((ao) this.f29594b, (NavigationSegment) this.f29593a);
        }
        u.performZoomOut$lambda$0((u) this.f29593a, (String) this.f29594b);
        return null;
    }

    public /* synthetic */ r(u uVar, String str, int i2) {
        this.f29595c = i2;
        this.f29593a = uVar;
        this.f29594b = str;
    }
}
