package com.google.firebase.h;

import android.content.Context;
import com.google.firebase.components.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {
    public static com.google.firebase.components.c a(String str, String str2) {
        return com.google.firebase.components.c.f(new d(str, str2), d.class);
    }

    public static com.google.firebase.components.c b(String str, f fVar) {
        com.google.firebase.components.b bVarE = com.google.firebase.components.c.e(d.class);
        bVarE.b(r.f(Context.class));
        bVarE.c(new e(str, fVar, 0));
        return bVarE.a();
    }
}
