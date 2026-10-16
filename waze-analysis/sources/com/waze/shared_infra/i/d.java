package com.waze.shared_infra.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f37886a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f37887b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f37888c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f37889d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f37890e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ d[] f37891f;

    static {
        d dVar = new d("DEBUG", 0);
        f37886a = dVar;
        d dVar2 = new d("INFO", 1);
        f37887b = dVar2;
        d dVar3 = new d("WARNING", 2);
        f37888c = dVar3;
        d dVar4 = new d("ERROR", 3);
        f37889d = dVar4;
        d dVar5 = new d("FATAL", 4);
        f37890e = dVar5;
        f37891f = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
    }

    public static d[] values() {
        return (d[]) f37891f.clone();
    }
}
