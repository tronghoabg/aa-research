package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f44774a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f44775b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f44776c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f44777d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ o[] f44778e;

    static {
        o oVar = new o("SIGN_IN", 0);
        f44774a = oVar;
        o oVar2 = new o("EDIT_EMAIL", 1);
        f44775b = oVar2;
        o oVar3 = new o("REGISTER_GUEST_WAZER", 2);
        f44776c = oVar3;
        o oVar4 = new o("NO_EMAIL", 3);
        f44777d = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        f44778e = oVarArr;
        h.d.b.a(oVarArr);
    }

    public static o[] values() {
        return (o[]) f44778e.clone();
    }
}
