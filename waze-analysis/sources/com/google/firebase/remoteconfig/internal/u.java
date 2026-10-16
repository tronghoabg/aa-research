package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final int f10738a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f10739b;

    public u(int i2, String str) {
        this.f10738a = i2;
        this.f10739b = str;
    }

    public static u g(String str) {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("error"));
        return new u(jSONObject.optInt("code"), jSONObject.optString("message"), null);
    }

    final int a() {
        return this.f10738a;
    }

    final Date b() {
        return (Date) this.f10739b;
    }

    public final int c() {
        return this.f10738a;
    }

    public final String d() {
        return (String) this.f10739b;
    }

    public final int e() {
        return this.f10738a;
    }

    public final String f() {
        return (String) this.f10739b;
    }

    private u(int i2, String str, byte[] bArr) {
        this.f10738a = i2;
        this.f10739b = str;
    }

    public u(int i2, Date date) {
        this.f10738a = i2;
        this.f10739b = date;
    }
}
