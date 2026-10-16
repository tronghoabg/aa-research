package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31963a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f31964b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f31965c;

    static {
        a aVar = new a("DisplayStarted", 0);
        f31963a = aVar;
        a aVar2 = new a("ClickThrough", 1);
        f31964b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f31965c = aVarArr;
        d.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f31965c.clone();
    }
}
