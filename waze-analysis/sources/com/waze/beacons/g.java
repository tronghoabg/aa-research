package com.waze.beacons;

import android.content.Context;
import android.content.SharedPreferences;
import com.waze.NativeManager;
import com.waze.authentication.AuthNativeManager;
import com.waze.iu;
import com.waze.jni.protos.LoadAutoCompleteVenueRequest;
import com.waze.stats.ax;
import e.a.d.jm;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;
import l.a.hq;
import l.a.hr;
import l.a.hs;
import l.a.ht;
import l.a.hw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16267a;

    public g(Context context) {
        x.f(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.waze.config.offline", 0);
        x.e(sharedPreferences, "getSharedPreferences(...)");
        this.f16267a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.stats.ax, java.lang.Object] */
    public final void a() {
        com.waze.cf.d.c cVarR = jm.r(hw.newBuilder());
        hq hqVarNewBuilder = hr.newBuilder();
        x.f(hqVarNewBuilder, "builder");
        hr hrVarBuild = hqVarNewBuilder.build();
        x.e(hrVarBuild, "build(...)");
        cVarR.k(hrVarBuild);
        com.waze.sharedui.utils.o.i(this.f16267a, cVarR.j());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.stats.ax, java.lang.Object] */
    public final void b() {
        com.waze.cf.d.c cVarR = jm.r(hw.newBuilder());
        hs hsVarNewBuilder = ht.newBuilder();
        x.f(hsVarNewBuilder, "builder");
        ht htVarBuild = hsVarNewBuilder.build();
        x.e(htVarBuild, "build(...)");
        cVarR.l(htVarBuild);
        com.waze.sharedui.utils.o.i(this.f16267a, cVarR.j());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final SharedPreferences c() {
        return this.f16267a;
    }

    public final Object d(String str, String str2, String str3, String str4, h.c.e eVar) {
        if (str == null && str2 == null) {
            return null;
        }
        Object obj = this.f16267a;
        CompletableDeferred completableDeferredJ = bo.j();
        iu iuVar = (iu) obj;
        LoadAutoCompleteVenueRequest.Builder builderNewBuilder = LoadAutoCompleteVenueRequest.newBuilder();
        if (str != null) {
            builderNewBuilder.setVenueId(str);
        }
        if (str2 != null) {
            builderNewBuilder.setVenueContext(str2);
        }
        if (str3 != null) {
            builderNewBuilder.setAutocompleteQuery(str3);
        }
        if (str4 != null) {
            builderNewBuilder.setAutocompleteResponse(str4);
        }
        iu.fetchAutocompleteVenue$default(iuVar, builderNewBuilder.build(), completableDeferredJ, null, 4, null);
        return completableDeferredJ.c(eVar);
    }

    public final com.waze.authentication.k e() {
        com.waze.authentication.e eVar = (com.waze.authentication.e) this.f16267a;
        String strLoadUsernameLegacy = eVar.loadUsernameLegacy();
        String strLoadPasswordLegacy = eVar.loadPasswordLegacy();
        String str = strLoadPasswordLegacy;
        if (str == null || str.length() == 0 || strLoadUsernameLegacy.length() <= 0) {
            return null;
        }
        return new com.waze.authentication.k(strLoadUsernameLegacy, strLoadPasswordLegacy);
    }

    public final void f(com.waze.authentication.k kVar) {
        x.f(kVar, "value");
        ((com.waze.authentication.e) this.f16267a).saveUsernamePasswordLegacy(kVar.b(), kVar.a());
    }

    public g(AuthNativeManager authNativeManager) {
        x.f(authNativeManager, "authNativeManager");
        this.f16267a = authNativeManager;
    }

    public g(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f16267a = axVar;
    }

    public g(NativeManager nativeManager) {
        x.f(nativeManager, "nativeManager");
        this.f16267a = nativeManager;
    }
}
