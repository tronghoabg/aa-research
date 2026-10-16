package com.waze.modules.navigation;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.jni.protos.ConversionExtensionsKt;
import com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo;
import com.waze.jni.protos.modules.navigation.StartNavigationResponse;
import com.waze.jni.protos.places.Place;
import com.waze.modules.c.dk;
import i.b.l.sl;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationServiceNativeManager extends r {
    private static volatile NavigationServiceNativeManager instance;
    private final com.waze.native_managers.c<StartNavigationResponse> startNavigationCallbackWrapper;
    public static final j Companion = new j();
    public static final int $stable = 8;

    private NavigationServiceNativeManager() {
        this.startNavigationCallbackWrapper = new com.waze.native_managers.c<>();
        r.initNativeLayer$default(this, null, 1, null);
    }

    static final h.ab selectAlternativeRoute$lambda$0(CompletableDeferred completableDeferred, StartNavigationResponse startNavigationResponse) {
        if (startNavigationResponse == null || startNavigationResponse.getCode() != 0) {
            completableDeferred.a(al.f30302b);
        } else {
            completableDeferred.a(al.f30301a);
        }
        return h.ab.f48028a;
    }

    static final h.ab startNavigationOnRoute$lambda$0(com.waze.jni.a aVar, StartNavigationResponse startNavigationResponse) {
        aVar.a(startNavigationResponse);
        return h.ab.f48028a;
    }

    static final h.ab startNavigationOnRouteId$lambda$0(com.waze.jni.a aVar, StartNavigationResponse startNavigationResponse) {
        aVar.a(startNavigationResponse);
        return h.ab.f48028a;
    }

    public final native void handleRerouteSuggestionNTV(byte[] bArr);

    public final native void handleRoutingUpdateNTV(byte[] bArr);

    public final native void initNativeLayerNTV();

    @Override // com.waze.modules.navigation.r
    public void onStartNavigationResponse(int i2, StartNavigationResponse startNavigationResponse) {
        h.g.b.x.f(startNavigationResponse, "navigationResponse");
        h.g.a.l lVarB = this.startNavigationCallbackWrapper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(startNavigationResponse);
        }
    }

    public final Object selectAlternativeRoute(sl slVar, com.waze.places.f fVar, com.waze.places.f fVar2, long j2, h.c.e<? super al> eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        byte[] byteArray = slVar.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        byte[] byteArray2 = com.waze.notifications.c.k.e(fVar).toByteArray();
        h.g.b.x.e(byteArray2, "toByteArray(...)");
        byte[] byteArray3 = com.waze.notifications.c.k.e(fVar2).toByteArray();
        h.g.b.x.e(byteArray3, "toByteArray(...)");
        r.selectAlternativeRoute$default(this, byteArray, byteArray2, byteArray3, j2, this.startNavigationCallbackWrapper.a(new g(completableDeferredJ, 0)), null, 32, null);
        return completableDeferredJ.c(eVar);
    }

    public final native void selectAlternativeRouteNTV(byte[] bArr, byte[] bArr2, byte[] bArr3, long j2, int i2);

    public final native void startNavigationNTV(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4);

    public final void startNavigationOnRoute(dk dkVar, com.waze.av.b.n nVar, long j2, com.waze.av.b.n nVar2, i iVar, com.waze.jni.a<StartNavigationResponse> aVar) {
        Place placeK;
        h.g.b.x.f(dkVar, "routingResponse");
        h.g.b.x.f(nVar, "destination");
        h.g.b.x.f(iVar, "useCase");
        h.g.b.x.f(aVar, "callback");
        NavigationServiceNativeManager navigationServiceNativeManager = this;
        byte[] byteArray = dkVar.g().toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        byte[] byteArray2 = com.waze.ac.e.l(nVar).toByteArray();
        h.g.b.x.e(byteArray2, "toByteArray(...)");
        byte[] byteArray3 = null;
        if (nVar2 != null && (placeK = com.waze.ac.e.k(nVar2)) != null) {
            byteArray3 = placeK.toByteArray();
        }
        r.startNavigation$default(navigationServiceNativeManager, byteArray, byteArray2, (int) j2, byteArray3, iVar.a().getNumber(), this.startNavigationCallbackWrapper.a(new g(aVar, 2)), null, 64, null);
    }

    public final native void startNavigationOnRouteByIdNTV(String str, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i3);

    public final void startNavigationOnRouteId(String str, int i2, com.waze.shared_infra.h.c cVar, com.waze.av.b.n nVar, com.waze.av.b.n nVar2, h hVar, com.waze.jni.a<StartNavigationResponse> aVar) {
        AlternativeHovRouteInfo proto;
        Place placeK;
        h.g.b.x.f(str, "routeUuid");
        h.g.b.x.f(cVar, TtmlNode.ATTR_TTS_ORIGIN);
        h.g.b.x.f(nVar, "destination");
        h.g.b.x.f(aVar, "callback");
        NavigationServiceNativeManager navigationServiceNativeManager = this;
        byte[] byteArray = ConversionExtensionsKt.toIntPosition(cVar).toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        byte[] byteArray2 = com.waze.ac.e.l(nVar).toByteArray();
        h.g.b.x.e(byteArray2, "toByteArray(...)");
        byte[] byteArray3 = null;
        byte[] byteArray4 = (nVar2 == null || (placeK = com.waze.ac.e.k(nVar2)) == null) ? null : placeK.toByteArray();
        if (hVar != null && (proto = toProto(hVar)) != null) {
            byteArray3 = proto.toByteArray();
        }
        r.startNavigationOnRouteById$default(navigationServiceNativeManager, str, i2, byteArray, byteArray2, byteArray4, byteArray3, this.startNavigationCallbackWrapper.a(new g(aVar, 1)), null, 128, null);
    }

    public final AlternativeHovRouteInfo toProto(h hVar) {
        h.g.b.x.f(hVar, "<this>");
        AlternativeHovRouteInfo.Builder builderNewBuilder = AlternativeHovRouteInfo.newBuilder();
        builderNewBuilder.setDurationSeconds(hVar.a());
        AlternativeHovRouteInfo.HovInfo.Builder builderNewBuilder2 = AlternativeHovRouteInfo.HovInfo.newBuilder();
        builderNewBuilder2.setMinPassengers(hVar.b());
        builderNewBuilder2.addAllRequiredPermits(hVar.c());
        builderNewBuilder.setHovInfo(builderNewBuilder2.build());
        AlternativeHovRouteInfo alternativeHovRouteInfoBuild = builderNewBuilder.build();
        h.g.b.x.e(alternativeHovRouteInfoBuild, "let(...)");
        return alternativeHovRouteInfoBuild;
    }

    public /* synthetic */ NavigationServiceNativeManager(h.g.b.o oVar) {
        this();
    }
}
