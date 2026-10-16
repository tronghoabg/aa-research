package com.waze.main_screen.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f26167a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f26168b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f26169c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f26170d;

    /* renamed from: e, reason: collision with root package name */
    private final long f26171e;

    static {
        d dVar = new d("ASCENDING", 0, 0L);
        f26167a = dVar;
        d dVar2 = new d("DESCENDING", 1, 1L);
        f26168b = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f26169c = dVarArr;
        f26170d = h.d.b.a(dVarArr);
    }

    private d(String str, int i2, long j2) {
        this.f26171e = j2;
    }

    public static h.d.a b() {
        return f26170d;
    }

    public static d[] values() {
        return (d[]) f26169c.clone();
    }

    public final long a() {
        return this.f26171e;
    }
}
