package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9051a = 0;

    static {
        com.google.firebase.sessions.a.c.b(com.google.firebase.sessions.a.d.f10776a);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(FirebaseCrashlytics.class);
        bVarB.d("fire-cls");
        bVarB.b(r.f(com.google.firebase.e.class));
        bVarB.b(r.f(com.google.firebase.installations.d.class));
        bVarB.b(r.a(com.google.firebase.crashlytics.a.a.class));
        bVarB.b(r.a(com.google.firebase.a.a.c.class));
        bVarB.b(r.a(com.google.firebase.remoteconfig.a.a.class));
        bVarB.c(new d());
        bVarB.g();
        return Arrays.asList(bVarB.a(), com.google.firebase.h.g.a("fire-cls", "19.0.4_1p"));
    }
}
