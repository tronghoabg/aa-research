package com.google.firebase.crashlytics.a.g;

import android.content.Context;
import com.google.android.datatransport.f;
import com.google.android.datatransport.g;
import com.google.android.datatransport.runtime.ac;
import com.google.android.gms.o.t;
import com.google.firebase.crashlytics.a.c.ah;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.crashlytics.a.e.a.c f9716a = new com.google.firebase.crashlytics.a.e.a.c();

    /* renamed from: b, reason: collision with root package name */
    private static final String f9717b = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: c, reason: collision with root package name */
    private static final String f9718c = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: d, reason: collision with root package name */
    private static final f f9719d = new a(0);

    /* renamed from: e, reason: collision with root package name */
    private final e f9720e;

    b(e eVar) {
        this.f9720e = eVar;
    }

    public static b c(Context context, com.google.firebase.crashlytics.a.h.f fVar) {
        ac.d(context);
        g gVarA = ac.c().b(new com.google.android.datatransport.cct.a(f9717b, f9718c)).a("FIREBASE_CRASHLYTICS_REPORT", com.google.android.datatransport.a.a("json"), f9719d);
        com.google.firebase.crashlytics.a.h.d dVarC = fVar.c();
        double d2 = dVarC.f9743d;
        double d3 = dVarC.f9744e;
        int i2 = dVarC.f9745f;
        return new b(new e(d2, gVarA));
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public final t b(ah ahVar) {
        return this.f9720e.b(ahVar).a();
    }
}
