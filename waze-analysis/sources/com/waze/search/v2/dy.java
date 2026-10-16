package com.waze.search.v2;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwnerKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class dy implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36397b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36398c;

    public /* synthetic */ dy(Object obj, Object obj2, int i2) {
        this.f36398c = i2;
        this.f36396a = obj;
        this.f36397b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f36398c == 0) {
            Object obj2 = this.f36397b;
            return fi.e((fi) this.f36396a, (com.waze.navigate.location_preview.ay) obj2, (h.g.a.l) obj);
        }
        ck ckVar = (ck) obj;
        int i2 = SearchV2Activity.f36131f;
        h.g.b.x.f(ckVar, "fragment");
        ckVar.D(this.f36396a);
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(ckVar), null, null, new x((MutableState) this.f36397b, ckVar, (h.c.e) null, 1), 3);
        return h.ab.f48028a;
    }
}
