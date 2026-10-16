package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f44730a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f44731b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f44732c;

    static {
        d dVar = new d("EXISTING_ACCOUNT", 0);
        f44730a = dVar;
        d dVar2 = new d("NEW_ACCOUNT", 1);
        f44731b = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f44732c = dVarArr;
        h.d.b.a(dVarArr);
    }

    public static d[] values() {
        return (d[]) f44732c.clone();
    }
}
