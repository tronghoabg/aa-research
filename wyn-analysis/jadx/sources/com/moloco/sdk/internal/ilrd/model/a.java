package com.moloco.sdk.internal.ilrd.model;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28598a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f28599b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f28600c;

    static {
        a aVar = new a("MAX", 0);
        f28598a = aVar;
        a aVar2 = new a("LEVELPLAY", 1);
        f28599b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f28600c = aVarArr;
        d.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28600c.clone();
    }
}
