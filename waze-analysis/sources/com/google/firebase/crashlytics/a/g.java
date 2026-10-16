package com.google.firebase.crashlytics.a;

import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f9713a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9714b;

    /* synthetic */ g(h hVar) throws Resources.NotFoundException {
        Objects.requireNonNull(hVar);
        int iB = com.google.firebase.crashlytics.a.c.g.b(hVar.f9732a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
        if (iB != 0) {
            this.f9713a = "Unity";
            String string = hVar.f9732a.getResources().getString(iB);
            this.f9714b = string;
            i.f9765a.g("Unity Editor version is: ".concat(String.valueOf(string)));
            return;
        }
        if (!h.d(hVar)) {
            this.f9713a = null;
            this.f9714b = null;
        } else {
            this.f9713a = "Flutter";
            this.f9714b = null;
            i.f9765a.g("Development platform is: Flutter");
        }
    }
}
