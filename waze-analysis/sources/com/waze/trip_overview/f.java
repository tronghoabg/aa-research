package com.waze.trip_overview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f41451a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f41452b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f41453c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ f[] f41454d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f41455e;

    static {
        f fVar = new f("NOW", 0, true);
        f41451a = fVar;
        f fVar2 = new f("FUTURE", 1, false);
        f41452b = fVar2;
        f fVar3 = new f("CURRENT_TRAFFIC", 2, true);
        f41453c = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        f41454d = fVarArr;
        h.d.b.a(fVarArr);
    }

    private f(String str, int i2, boolean z) {
        this.f41455e = z;
    }

    public static f[] values() {
        return (f[]) f41454d.clone();
    }

    public final boolean a() {
        return this.f41455e;
    }
}
