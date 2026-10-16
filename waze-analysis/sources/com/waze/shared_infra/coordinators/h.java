package com.waze.shared_infra.coordinators;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f37806a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f37807b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f37808c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h[] f37809d;

    static {
        h hVar = new h("Aborted", 0);
        f37806a = hVar;
        h hVar2 = new h("BackPressed", 1);
        f37807b = hVar2;
        h hVar3 = new h("CanceledMultipleSubCoordinators", 2);
        f37808c = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        f37809d = hVarArr;
        h.d.b.a(hVarArr);
    }

    public static h[] values() {
        return (h[]) f37809d.clone();
    }
}
