package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements com.google.firebase.components.g {
    @Override // com.google.firebase.components.g
    public final Object a(com.google.firebase.components.d dVar) {
        Context context = (Context) dVar.f(Context.class);
        return FirebaseCrashlyticsNdk.a(context, !(com.google.firebase.crashlytics.a.c.g.b(context, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING) != 0));
    }
}
