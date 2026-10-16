package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import j$.util.DesugarCollections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10188a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10189b;

    public b(com.google.firebase.g.c cVar) {
        this.f10189b = DesugarCollections.synchronizedMap(new HashMap());
        this.f10188a = cVar;
    }

    final com.google.android.gms.o.t a() {
        return ((com.google.android.gms.o.w) this.f10189b).a();
    }

    final void b() {
        ((com.google.android.gms.o.w) this.f10189b).e(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.g.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void c(String str, com.google.firebase.remoteconfig.internal.h hVar) {
        JSONObject jSONObjectOptJSONObject;
        com.google.firebase.a.a.c cVar = (com.google.firebase.a.a.c) this.f10188a.a();
        if (cVar == null) {
            return;
        }
        JSONObject jSONObjectI = hVar.i();
        if (jSONObjectI.length() > 0) {
            JSONObject jSONObjectH = hVar.h();
            if (jSONObjectH.length() <= 0 || (jSONObjectOptJSONObject = jSONObjectI.optJSONObject(str)) == null) {
                return;
            }
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            ?? r4 = this.f10189b;
            synchronized (r4) {
                if (strOptString.equals(r4.get(str))) {
                    return;
                }
                r4.put(str, strOptString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", jSONObjectH.optString(str));
                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                cVar.e();
                new Bundle().putString("_fpid", strOptString);
                cVar.e();
            }
        }
    }

    b(NotificationCompat.Builder builder, String str) {
        this.f10188a = builder;
        this.f10189b = str;
    }

    b(Intent intent) {
        this.f10189b = new com.google.android.gms.o.w();
        this.f10188a = intent;
    }
}
