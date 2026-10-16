package com.waze.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f45428a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f45429b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ g[] f45430c;

    static {
        g gVar = new g("Server", 0);
        f45428a = gVar;
        g gVar2 = new g("Local", 1);
        f45429b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f45430c = gVarArr;
        h.d.b.a(gVarArr);
    }

    public static g[] values() {
        return (g[]) f45430c.clone();
    }
}
