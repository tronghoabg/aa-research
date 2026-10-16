package com.waze.modules.navigation;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.modules.navigation.StartNavigationResponse;
import i.b.l.pw;
import i.b.l.qg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class r {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleRerouteSuggestion$default(r rVar, qg qgVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleRerouteSuggestion");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        rVar.handleRerouteSuggestion(qgVar, lVar);
    }

    static final h.ab handleRerouteSuggestion$lambda$0(r rVar, qg qgVar) {
        h.g.b.x.d(rVar, "null cannot be cast to non-null type com.waze.modules.navigation.NavigationServiceNativeManager");
        byte[] byteArray = qgVar.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((NavigationServiceNativeManager) rVar).handleRerouteSuggestionNTV(byteArray);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleRoutingUpdate$default(r rVar, pw pwVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleRoutingUpdate");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        rVar.handleRoutingUpdate(pwVar, lVar);
    }

    static final h.ab handleRoutingUpdate$lambda$0(r rVar, pw pwVar) {
        h.g.b.x.d(rVar, "null cannot be cast to non-null type com.waze.modules.navigation.NavigationServiceNativeManager");
        byte[] byteArray = pwVar.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((NavigationServiceNativeManager) rVar).handleRoutingUpdateNTV(byteArray);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initNativeLayer$default(r rVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNativeLayer");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        rVar.initNativeLayer(lVar);
    }

    static final h.ab initNativeLayer$lambda$0(r rVar) {
        h.g.b.x.d(rVar, "null cannot be cast to non-null type com.waze.modules.navigation.NavigationServiceNativeManager");
        ((NavigationServiceNativeManager) rVar).initNativeLayerNTV();
        return null;
    }

    static final void onStartNavigationResponseJNI$lambda$0(r rVar, int i2, StartNavigationResponse startNavigationResponse) {
        h.g.b.x.d(rVar, "null cannot be cast to non-null type com.waze.modules.navigation.NavigationServiceNativeManager");
        h.g.b.x.c(startNavigationResponse);
        ((NavigationServiceNativeManager) rVar).onStartNavigationResponse(i2, startNavigationResponse);
    }

    public static /* synthetic */ void selectAlternativeRoute$default(r rVar, byte[] bArr, byte[] bArr2, byte[] bArr3, long j2, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectAlternativeRoute");
        }
        rVar.selectAlternativeRoute(bArr, bArr2, bArr3, j2, i2, (i3 & 32) != 0 ? null : lVar);
    }

    static final h.ab selectAlternativeRoute$lambda$0(r rVar, byte[] bArr, byte[] bArr2, byte[] bArr3, long j2, int i2) {
        h.g.b.x.d(rVar, "null cannot be cast to non-null type com.waze.modules.navigation.NavigationServiceNativeManager");
        ((NavigationServiceNativeManager) rVar).selectAlternativeRouteNTV(bArr, bArr2, bArr3, j2, i2);
        return null;
    }

    public static /* synthetic */ void startNavigation$default(r rVar, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, h.g.a.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startNavigation");
        }
        rVar.startNavigation(bArr, bArr2, i2, bArr3, i3, i4, (i5 & 64) != 0 ? null : lVar);
    }

    static final h.ab startNavigation$lambda$0(r rVar, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        h.g.b.x.d(rVar, "null cannot be cast to non-null type com.waze.modules.navigation.NavigationServiceNativeManager");
        ((NavigationServiceNativeManager) rVar).startNavigationNTV(bArr, bArr2, i2, bArr3, i3, i4);
        return null;
    }

    public static /* synthetic */ void startNavigationOnRouteById$default(r rVar, String str, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i3, h.g.a.l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startNavigationOnRouteById");
        }
        rVar.startNavigationOnRouteById(str, i2, bArr, bArr2, bArr3, bArr4, i3, (i4 & 128) != 0 ? null : lVar);
    }

    static final h.ab startNavigationOnRouteById$lambda$0(r rVar, String str, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i3) {
        h.g.b.x.d(rVar, "null cannot be cast to non-null type com.waze.modules.navigation.NavigationServiceNativeManager");
        ((NavigationServiceNativeManager) rVar).startNavigationOnRouteByIdNTV(str, i2, bArr, bArr2, bArr3, bArr4, i3);
        return null;
    }

    public void handleRerouteSuggestion(qg qgVar, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(qgVar, "rerouteSuggestion");
        int i2 = 1;
        NativeManager.runNativeTask(new n(this, qgVar, i2), lVar != null ? new m(lVar, i2) : null);
    }

    public void handleRoutingUpdate(pw pwVar, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(pwVar, "routingUpdate");
        NativeManager.runNativeTask(new n(this, pwVar, 0), lVar != null ? new m(lVar, 2) : null);
    }

    public void initNativeLayer(h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.modules.navigation.o
            @Override // com.waze.hw
            public final Object a() {
                r.initNativeLayer$lambda$0(this.f30455a);
                return null;
            }
        }, lVar != null ? new m(lVar, 3) : null);
    }

    public abstract void onStartNavigationResponse(int i2, StartNavigationResponse startNavigationResponse);

    protected final void onStartNavigationResponseJNI(final int i2, byte[] bArr) {
        h.g.b.x.f(bArr, "navigationResponse");
        try {
            final StartNavigationResponse startNavigationResponse = (StartNavigationResponse) StartNavigationResponse.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.modules.navigation.l
                @Override // java.lang.Runnable
                public final void run() {
                    r.onStartNavigationResponseJNI$lambda$0(this.f30447a, i2, startNavigationResponse);
                }
            });
        } catch (eu unused) {
        }
    }

    public void selectAlternativeRoute(final byte[] bArr, final byte[] bArr2, final byte[] bArr3, final long j2, final int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(bArr, "routingResult");
        h.g.b.x.f(bArr2, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(bArr3, "destination");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.modules.navigation.k
            @Override // com.waze.hw
            public final Object a() {
                r.selectAlternativeRoute$lambda$0(this.f30441a, bArr, bArr2, bArr3, j2, i2);
                return null;
            }
        }, lVar != null ? new m(lVar, 0) : null);
    }

    public void startNavigation(final byte[] bArr, final byte[] bArr2, final int i2, final byte[] bArr3, final int i3, final int i4, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(bArr, "routingResponse");
        h.g.b.x.f(bArr2, "destinationPlaceKey");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.modules.navigation.p
            @Override // com.waze.hw
            public final Object a() {
                r.startNavigation$lambda$0(this.f30456a, bArr, bArr2, i2, bArr3, i3, i4);
                return null;
            }
        }, lVar != null ? new m(lVar, 4) : null);
    }

    public void startNavigationOnRouteById(final String str, final int i2, final byte[] bArr, final byte[] bArr2, final byte[] bArr3, final byte[] bArr4, final int i3, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "routeId");
        h.g.b.x.f(bArr, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(bArr2, "destinationPlaceKey");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.modules.navigation.q
            @Override // com.waze.hw
            public final Object a() {
                r.startNavigationOnRouteById$lambda$0(this.f30463a, str, i2, bArr, bArr2, bArr3, bArr4, i3);
                return null;
            }
        }, lVar != null ? new m(lVar, 5) : null);
    }

    public final void initNativeLayer() {
        initNativeLayer$default(this, null, 1, null);
    }

    public final void handleRerouteSuggestion(qg qgVar) {
        h.g.b.x.f(qgVar, "rerouteSuggestion");
        handleRerouteSuggestion$default(this, qgVar, null, 2, null);
    }

    public final void handleRoutingUpdate(pw pwVar) {
        h.g.b.x.f(pwVar, "routingUpdate");
        handleRoutingUpdate$default(this, pwVar, null, 2, null);
    }

    public final void startNavigation(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        h.g.b.x.f(bArr, "routingResponse");
        h.g.b.x.f(bArr2, "destinationPlaceKey");
        startNavigation$default(this, bArr, bArr2, i2, bArr3, i3, i4, null, 64, null);
    }

    public final void selectAlternativeRoute(byte[] bArr, byte[] bArr2, byte[] bArr3, long j2, int i2) {
        h.g.b.x.f(bArr, "routingResult");
        h.g.b.x.f(bArr2, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(bArr3, "destination");
        selectAlternativeRoute$default(this, bArr, bArr2, bArr3, j2, i2, null, 32, null);
    }

    public final void startNavigationOnRouteById(String str, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i3) {
        h.g.b.x.f(str, "routeId");
        h.g.b.x.f(bArr, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(bArr2, "destinationPlaceKey");
        startNavigationOnRouteById$default(this, str, i2, bArr, bArr2, bArr3, bArr4, i3, null, 128, null);
    }
}
