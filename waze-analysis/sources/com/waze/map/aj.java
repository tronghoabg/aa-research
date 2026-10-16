package com.waze.map;

import com.waze.jni.protos.map.MapLine;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class aj implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapLineResolverNativeManager f27942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred f27943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27944c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27945d;

    public /* synthetic */ aj(MapLineResolverNativeManager mapLineResolverNativeManager, Object obj, CompletableDeferred completableDeferred, int i2) {
        this.f27945d = i2;
        this.f27942a = mapLineResolverNativeManager;
        this.f27944c = obj;
        this.f27943b = completableDeferred;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f27945d != 0) {
            CompletableDeferred completableDeferred = this.f27943b;
            Object obj2 = this.f27944c;
            return MapLineResolverNativeManager.resolveSegmentToMapLine_gIAlu_s$lambda$1(this.f27942a, (com.waze.shared_infra.l.a) obj2, completableDeferred, (MapLine) obj);
        }
        CompletableDeferred completableDeferred2 = this.f27943b;
        Object obj3 = this.f27944c;
        return MapLineResolverNativeManager.findNearestMapLine_gIAlu_s$lambda$1(this.f27942a, (com.waze.shared_infra.h.c) obj3, completableDeferred2, (MapLine) obj);
    }
}
