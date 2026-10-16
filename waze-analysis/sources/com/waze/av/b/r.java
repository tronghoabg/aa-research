package com.waze.av.b;

import com.waze.jni.protos.favorites.IsHomeWorkSetResult;
import com.waze.jni.protos.navigate.DriveTo;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class r implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15995d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f15996e;

    public /* synthetic */ r(u uVar, n nVar, h.g.a.a aVar, h.g.a.a aVar2, int i2) {
        this.f15996e = i2;
        this.f15992a = uVar;
        this.f15993b = nVar;
        this.f15994c = aVar;
        this.f15995d = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r1v0, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    @Override // com.waze.jni.a
    public final void a(Object obj) {
        if (this.f15996e != 0) {
            ?? r0 = this.f15994c;
            Object obj2 = this.f15992a;
            ?? r2 = this.f15995d;
            com.waze.navigate.location_preview.ai.e((com.waze.navigate.location_preview.ai) this.f15993b, r2, (com.waze.navigate.location_preview.ay) obj2, r0, (IsHomeWorkSetResult) obj);
            return;
        }
        ?? r02 = this.f15995d;
        ?? r1 = this.f15994c;
        Object obj3 = this.f15993b;
        u.t((u) this.f15992a, (n) obj3, r1, r02, (DriveTo.DangerZoneType) obj);
    }

    public /* synthetic */ r(com.waze.navigate.location_preview.ai aiVar, bn bnVar, com.waze.navigate.location_preview.ay ayVar, bm bmVar, int i2) {
        this.f15996e = i2;
        this.f15993b = aiVar;
        this.f15995d = bnVar;
        this.f15992a = ayVar;
        this.f15994c = bmVar;
    }
}
