package com.waze.config;

import android.content.SharedPreferences;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dj implements dh {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22618a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f22619b = h.g.a(new com.waze.car_lib.o.a(1));

    /* renamed from: c, reason: collision with root package name */
    private final List f22620c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f22621d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.ab f22622e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.beacons.g f22623f;

    public dj(com.waze.beacons.g gVar, List list, kotlinx.coroutines.af afVar, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(gVar, "configValueProvider");
        h.g.b.x.f(list, "allConfigs");
        h.g.b.x.f(afVar, "coroutineScope");
        h.g.b.x.f(abVar, "ioDispatcher");
        this.f22623f = gVar;
        this.f22620c = list;
        this.f22621d = afVar;
        this.f22622e = abVar;
    }

    private final void k() {
        if (NativeManager.isAppStarted()) {
            kotlinx.coroutines.aj.z(this.f22621d, this.f22622e, null, new di(this, null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(f fVar, SharedPreferences.Editor editor) {
        Long lH;
        if (fVar instanceof b) {
            b bVar = (b) fVar;
            editor.putBoolean(bVar.i(), h.g.b.x.n(bVar.h(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
            return;
        }
        if (!(fVar instanceof c)) {
            if (fVar instanceof d) {
                d dVar = (d) fVar;
                editor.putString(dVar.i(), dVar.h());
                return;
            }
            return;
        }
        c cVar = (c) fVar;
        String strI = cVar.i();
        String strH = cVar.h();
        if (strH == null || (lH = h.n.o.h(strH)) == null) {
            lH = (Long) cVar.f();
        }
        h.g.b.x.c(lH);
        editor.putLong(strI, lH.longValue());
    }

    @Override // com.waze.config.dh
    public final long a(c cVar) {
        h.g.b.x.f(cVar, "config");
        if (!NativeManager.isAppStarted()) {
            SharedPreferences sharedPreferencesC = this.f22623f.c();
            String strI = cVar.i();
            Object objF = cVar.f();
            h.g.b.x.e(objF, "getDefaultValue(...)");
            return sharedPreferencesC.getLong(strI, ((Number) objF).longValue());
        }
        h.g.b.x.f(cVar, "longConfig");
        if (NativeManager.isAppStarted()) {
            return ConfigManager.getInstance().getConfigValueLong(cVar);
        }
        Object objF2 = cVar.f();
        h.g.b.x.e(objF2, "getDefaultValue(...)");
        return ((Number) objF2).longValue();
    }

    @Override // com.waze.config.dh
    public final String b(d dVar) {
        h.g.b.x.f(dVar, "config");
        if (!NativeManager.isAppStarted()) {
            String string = this.f22623f.c().getString(dVar.i(), (String) dVar.f());
            return string == null ? "" : string;
        }
        h.g.b.x.f(dVar, "stringConfig");
        if (NativeManager.isAppStarted()) {
            String configValueString = ConfigManager.getInstance().getConfigValueString(dVar);
            h.g.b.x.c(configValueString);
            return configValueString;
        }
        Object objF = dVar.f();
        h.g.b.x.e(objF, "getDefaultValue(...)");
        return (String) objF;
    }

    @Override // com.waze.config.dh
    public final boolean c(b bVar) {
        h.g.b.x.f(bVar, "config");
        if (!NativeManager.isAppStarted()) {
            SharedPreferences sharedPreferencesC = this.f22623f.c();
            String strI = bVar.i();
            Object objF = bVar.f();
            h.g.b.x.e(objF, "getDefaultValue(...)");
            return sharedPreferencesC.getBoolean(strI, ((Boolean) objF).booleanValue());
        }
        h.g.b.x.f(bVar, "booleanConfig");
        if (NativeManager.isAppStarted()) {
            return ConfigManager.getInstance().getConfigValueBool(bVar);
        }
        Object objF2 = bVar.f();
        h.g.b.x.e(objF2, "getDefaultValue(...)");
        return ((Boolean) objF2).booleanValue();
    }

    public final void f() {
        k();
    }

    public final void g() {
        k();
    }

    public final void h(f fVar) {
        h.g.b.x.f(fVar, "config");
        SharedPreferences.Editor editorEdit = this.f22623f.c().edit();
        h.g.b.x.c(editorEdit);
        l(fVar, editorEdit);
        editorEdit.apply();
    }
}
