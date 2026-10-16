package com.waze.map.b;

import androidx.webkit.Profile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ct {

    /* renamed from: a, reason: collision with root package name */
    public static final ct f28165a;

    /* renamed from: b, reason: collision with root package name */
    public static final ct f28166b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ct[] f28167c;

    static {
        ct ctVar = new ct(Profile.DEFAULT_PROFILE_NAME, 0);
        f28165a = ctVar;
        ct ctVar2 = new ct("Overview", 1);
        f28166b = ctVar2;
        ct[] ctVarArr = {ctVar, ctVar2};
        f28167c = ctVarArr;
        h.d.b.a(ctVarArr);
    }

    public static ct[] values() {
        return (ct[]) f28167c.clone();
    }
}
