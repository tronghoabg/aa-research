package com.waze.copilot.data.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f22991a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f22992b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ g[] f22993c;

    static {
        g gVar = new g("SELECT", 0);
        f22991a = gVar;
        g gVar2 = new g("DESELECT", 1);
        f22992b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f22993c = gVarArr;
        h.d.b.a(gVarArr);
    }

    public static g[] values() {
        return (g[]) f22993c.clone();
    }
}
