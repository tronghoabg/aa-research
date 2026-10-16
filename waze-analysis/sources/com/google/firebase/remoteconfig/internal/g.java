package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f10669a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    private Date f10670b = h.f10676b;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f10671c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f10672d = new JSONObject();

    /* renamed from: e, reason: collision with root package name */
    private long f10673e = 0;

    /* renamed from: f, reason: collision with root package name */
    private JSONArray f10674f = new JSONArray();

    /* synthetic */ g() {
    }

    public final h a() {
        return new h(this.f10669a, this.f10670b, this.f10671c, this.f10672d, this.f10673e, this.f10674f, null);
    }

    public final void b(JSONObject jSONObject) {
        try {
            this.f10669a = new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    public final void c(JSONArray jSONArray) {
        try {
            this.f10671c = new JSONArray(jSONArray.toString());
        } catch (JSONException unused) {
        }
    }

    public final void d(Date date) {
        this.f10670b = date;
    }

    public final void e(JSONObject jSONObject) {
        try {
            this.f10672d = new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    public final void f(JSONArray jSONArray) {
        try {
            this.f10674f = new JSONArray(jSONArray.toString());
        } catch (JSONException unused) {
        }
    }

    public final void g(long j2) {
        this.f10673e = j2;
    }
}
