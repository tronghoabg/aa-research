package com.waze.native_managers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f30691a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f30692b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f30693c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h[] f30694d;

    static {
        h hVar = new h("Low", 0);
        f30691a = hVar;
        h hVar2 = new h("High", 1);
        f30692b = hVar2;
        h hVar3 = new h("WhenReady", 2);
        f30693c = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        f30694d = hVarArr;
        h.d.b.a(hVarArr);
    }

    public static h[] values() {
        return (h[]) f30694d.clone();
    }
}
