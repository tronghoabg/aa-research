package com.waze.navigate.a;

import com.waze.NativeManager;
import com.waze.ao;
import com.waze.settings.SettingsNativeManager;
import com.waze.z;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f30933a;

    /* renamed from: b, reason: collision with root package name */
    private final SettingsNativeManager f30934b;

    /* renamed from: c, reason: collision with root package name */
    private final z f30935c;

    /* renamed from: d, reason: collision with root package name */
    private final ao f30936d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30937e;

    /* renamed from: f, reason: collision with root package name */
    private final bm f30938f;

    /* renamed from: g, reason: collision with root package name */
    private final k f30939g;

    /* renamed from: h, reason: collision with root package name */
    private final e f30940h;

    public f(NativeManager nativeManager, SettingsNativeManager settingsNativeManager, z zVar, ao aoVar, com.waze.shared_infra.i.e eVar) {
        x.f(nativeManager, "nativeManager");
        x.f(settingsNativeManager, "settingsNativeManager");
        x.f(zVar, "appType");
        x.f(aoVar, "carManager");
        x.f(eVar, "logger");
        this.f30933a = nativeManager;
        this.f30934b = settingsNativeManager;
        this.f30935c = zVar;
        this.f30936d = aoVar;
        this.f30937e = eVar;
        bm bmVarE = bu.e(0, 32, kotlinx.coroutines.a.a.f51272b, 1);
        this.f30938f = bmVarE;
        this.f30939g = bmVarE;
        this.f30940h = new e(this);
    }

    public static final /* synthetic */ void e(f fVar, d dVar) {
        Objects.toString(dVar);
        fVar.f30937e.a("action submitted ".concat(dVar.toString()));
        fVar.f30938f.c(dVar);
    }

    public final k d() {
        return this.f30939g;
    }

    public final void f() {
        this.f30937e.a("onActionHandled");
        this.f30938f.b();
    }

    public final void g() {
        e eVar = this.f30940h;
        this.f30933a.registerOnInCarDeeplinkActionListener(eVar);
        this.f30934b.registerOnInCarDeeplinkActionListener(eVar);
    }
}
