package com.waze.c.d;

import androidx.webkit.UserAgentMetadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    public static final bc f18342a;

    /* renamed from: b, reason: collision with root package name */
    public static final bc f18343b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ bc[] f18344c;

    static {
        bc bcVar = new bc(UserAgentMetadata.FORM_FACTOR_MOBILE, 0);
        f18342a = bcVar;
        bc bcVar2 = new bc("InCar", 1);
        f18343b = bcVar2;
        bc[] bcVarArr = {bcVar, bcVar2};
        f18344c = bcVarArr;
        h.d.b.a(bcVarArr);
    }

    public static bc[] values() {
        return (bc[]) f18344c.clone();
    }
}
