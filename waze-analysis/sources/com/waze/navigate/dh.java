package com.waze.navigate;

import com.waze.jni.protos.navigate.OfflineNavigationRouteProto;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class dh implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31236a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31237b;

    public /* synthetic */ dh(Object obj, int i2) {
        this.f31237b = i2;
        this.f31236a = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        if (this.f31237b != 0) {
            ((dj) obj).D(new com.waze.modules.c.dv((com.waze.modules.c.ar) this.f31236a));
        } else {
            OfflineNavigationRouteProto offlineNavigationRouteProto = (OfflineNavigationRouteProto) this.f31236a;
            ((dj) obj).D(new com.waze.modules.c.du(new com.waze.modules.c.ag(et.s(offlineNavigationRouteProto), offlineNavigationRouteProto.getIsReroute(), offlineNavigationRouteProto.getRouteUUID())));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return this.f31237b != 0 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
