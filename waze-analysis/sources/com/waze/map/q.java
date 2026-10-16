package com.waze.map;

import com.waze.jni.protos.map.GenerateMapObjectsPositionRequest;
import com.waze.jni.protos.map.MapBounds;
import com.waze.jni.protos.map.MapContent;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class q implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f29589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.v.du f29591c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f29592d;

    public /* synthetic */ q(u uVar, String str, com.google.v.du duVar, int i2) {
        this.f29592d = i2;
        this.f29589a = uVar;
        this.f29590b = str;
        this.f29591c = duVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f29592d;
        if (i2 == 0) {
            com.google.v.du duVar = this.f29591c;
            u.UpdateMapBounds$lambda$0(this.f29589a, this.f29590b, (MapBounds) duVar);
            return null;
        }
        com.google.v.du duVar2 = this.f29591c;
        if (i2 == 1) {
            return u.generateEtaLabelPositions$lambda$0(this.f29589a, this.f29590b, (GenerateMapObjectsPositionRequest) duVar2);
        }
        u.updateMapContent$lambda$0(this.f29589a, this.f29590b, (MapContent) duVar2);
        return null;
    }
}
