package com.waze.modules.navigation;

import com.waze.jni.protos.modules.navigation.StartNavigationResponse;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f30433a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30434b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f30434b = i2;
        this.f30433a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.waze.jni.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.waze.jni.a, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f30434b;
        if (i2 == 0) {
            return NavigationServiceNativeManager.selectAlternativeRoute$lambda$0(this.f30433a, (StartNavigationResponse) obj);
        }
        if (i2 == 1) {
            return NavigationServiceNativeManager.startNavigationOnRouteId$lambda$0(this.f30433a, (StartNavigationResponse) obj);
        }
        if (i2 == 2) {
            return NavigationServiceNativeManager.startNavigationOnRoute$lambda$0(this.f30433a, (StartNavigationResponse) obj);
        }
        if (i2 != 3) {
            return bk.m((bk) this.f30433a, (ao) obj);
        }
        return bk.l((bk) this.f30433a, (ao) obj);
    }
}
