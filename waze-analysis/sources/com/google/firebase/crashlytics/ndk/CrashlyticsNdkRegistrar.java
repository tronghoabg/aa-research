package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.r;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.c<?>> getComponents() {
        com.google.firebase.components.b bVarB = com.google.firebase.components.c.b(com.google.firebase.crashlytics.a.a.class);
        bVarB.d("fire-cls-ndk");
        bVarB.b(r.f(Context.class));
        bVarB.c(new a());
        bVarB.g();
        return Arrays.asList(bVarB.a(), com.google.firebase.h.g.a("fire-cls-ndk", "19.0.4_1p"));
    }
}
