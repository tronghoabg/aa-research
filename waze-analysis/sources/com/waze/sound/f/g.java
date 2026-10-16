package com.waze.sound.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f39991a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f39992b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ g[] f39993c;

    static {
        g gVar = new g("OFFLINE", 0);
        f39991a = gVar;
        g gVar2 = new g("ONLINE", 1);
        f39992b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f39993c = gVarArr;
        h.d.b.a(gVarArr);
    }

    public static g[] values() {
        return (g[]) f39993c.clone();
    }
}
