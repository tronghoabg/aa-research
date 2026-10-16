package com.waze.main_screen.y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f27875a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f27876b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f27877c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f27878d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f27879e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ f[] f27880f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f27881g;

    static {
        f fVar = new f("INITIAL_LAUNCH", 0);
        f27875a = fVar;
        f fVar2 = new f("REACHED_DESTINATION", 1);
        f27876b = fVar2;
        f fVar3 = new f("USER_STOPPED", 2);
        f27877c = fVar3;
        f fVar4 = new f("PARKED", 3);
        f27878d = fVar4;
        f fVar5 = new f("OTHER", 4);
        f27879e = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f27880f = fVarArr;
        f27881g = h.d.b.a(fVarArr);
    }

    public static h.d.a a() {
        return f27881g;
    }

    public static f[] values() {
        return (f[]) f27880f.clone();
    }
}
