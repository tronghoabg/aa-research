package com.google.firebase.appcheck.playintegrity.a;

import com.google.firebase.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f8896a;

    private a(String str) {
        this.f8896a = str;
    }

    public static a a(String str) throws h {
        JSONObject jSONObject = new JSONObject(str);
        String strA = com.google.android.gms.common.util.h.a(jSONObject.optString("challenge"));
        String strA2 = com.google.android.gms.common.util.h.a(jSONObject.optString("ttl"));
        if (strA == null || strA2 == null) {
            throw new h("Unexpected server response.");
        }
        return new a(strA);
    }

    public final String b() {
        return this.f8896a;
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIntegrityToken", this.f8896a);
        return jSONObject.toString();
    }

    public a(String str, byte[] bArr) {
        this.f8896a = str;
    }
}
