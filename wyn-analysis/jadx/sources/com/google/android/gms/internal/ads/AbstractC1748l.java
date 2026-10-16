package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.C0392q;
import java.util.Map;
import ka.AbstractC3256n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1748l {
    public static void a(zzbsu zzbsuVar, String str, JSONObject jSONObject) {
        zzbsuVar.zzc(str, jSONObject.toString());
    }

    public static void b(zzbsu zzbsuVar, String str, String str2) {
        zzbsuVar.zza(AbstractC3256n.h(new StringBuilder(AbstractC0279p0.g(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    public static void c(zzbsu zzbsuVar, String str, JSONObject jSONObject) {
        StringBuilder sbR = AbstractC0279p0.r("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbR.toString();
        int i5 = G6.L.f4523b;
        H6.l.a("Dispatching AFMA event: ".concat(string));
        zzbsuVar.zza(sbR.toString());
    }

    public static void d(zzbsu zzbsuVar, String str, Map map) {
        try {
            zzbsuVar.zzd(str, C0392q.f2477g.f2478a.l(map));
        } catch (JSONException unused) {
            int i5 = G6.L.f4523b;
            H6.l.f("Could not convert parameters to JSON.");
        }
    }
}
