package com.b.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static com.waze.n f2612a;

    public static s a(Throwable th) {
        return new t(th, 1);
    }

    public static s b(Object obj) {
        return new t(obj, 0);
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not allowed here.");
        }
    }

    public static com.waze.n d() {
        com.waze.n nVar = f2612a;
        return nVar == null ? com.waze.n.f30639a : nVar;
    }

    public static void e(Context context) {
        String strH;
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.waze.appuid", 0);
        String string = sharedPreferences.getString("UUID", null);
        String string2 = sharedPreferences.getString("UNAUTHENTICATED_UUID", null);
        if (string == null) {
            strH = h();
            sharedPreferences.edit().putString("UUID", strH).apply();
        } else {
            strH = string;
        }
        if (string2 == null) {
            string2 = h();
            sharedPreferences.edit().putString("UNAUTHENTICATED_UUID", string2).apply();
        }
        String strH2 = h();
        if (!"5.20.90.901".equals(sharedPreferences.getString("VERSION", null))) {
            sharedPreferences.edit().putString("VERSION", "5.20.90.901").apply();
            z = true;
        }
        f2612a = new com.waze.n(new com.waze.g.b(strH, string2), strH2, string == null ? com.waze.m.f25473a : z ? com.waze.m.f25474b : com.waze.m.f25475c);
    }

    public static final String f(com.waze.z zVar) {
        h.g.b.x.f(zVar, "<this>");
        com.waze.z zVar2 = com.waze.z.f45553a;
        int iOrdinal = zVar.ordinal();
        if (iOrdinal == 0) {
            return "WAZE_MOBILE";
        }
        if (iOrdinal == 1) {
            return "WAZE_AUTOMOTIVE";
        }
        throw new h.i();
    }

    public static final bjz g(com.waze.z zVar) {
        h.g.b.x.f(zVar, "<this>");
        com.waze.z zVar2 = com.waze.z.f45553a;
        int iOrdinal = zVar.ordinal();
        if (iOrdinal == 0) {
            return bjz.AAP;
        }
        if (iOrdinal == 1) {
            return bjz.AAOS;
        }
        throw new h.i();
    }

    private static String h() {
        return UUID.randomUUID().toString();
    }
}
