package com.google.android.libraries.e.a.a;

import android.content.Context;
import com.google.android.gms.o.ag;
import j$.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5810a;

    /* synthetic */ b(Context context) {
        new ConcurrentHashMap();
        ag.i(context != null, "Context cannot be null", new Object[0]);
        this.f5810a = context.getApplicationContext();
    }

    static /* bridge */ /* synthetic */ Context a(b bVar) {
        return (Context) bVar.f5810a;
    }

    public final c b() {
        return new c(this);
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("debugToken", this.f5810a);
        return jSONObject.toString();
    }

    public b(String str) {
        this.f5810a = str;
    }
}
