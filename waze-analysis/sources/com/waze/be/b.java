package com.waze.be;

import android.content.Context;
import android.content.SharedPreferences;
import h.g.b.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f16231a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ b[] f16232b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16233c = "com.waze.Keys";

    static {
        b bVar = new b();
        f16231a = bVar;
        b[] bVarArr = {bVar};
        f16232b = bVarArr;
        h.d.b.a(bVarArr);
    }

    private b() {
    }

    public static b[] values() {
        return (b[]) f16232b.clone();
    }

    public final SharedPreferences a(Context context) {
        x.f(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f16233c, 0);
        x.e(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
