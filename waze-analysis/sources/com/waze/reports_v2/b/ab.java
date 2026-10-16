package com.waze.reports_v2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final ab f34009a;

    /* renamed from: b, reason: collision with root package name */
    public static final ab f34010b;

    /* renamed from: c, reason: collision with root package name */
    public static final ab f34011c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ab[] f34012d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f34013e;

    static {
        ab abVar = new ab("TYPE_UNSPECIFIED", 0);
        f34009a = abVar;
        ab abVar2 = new ab("REPORT", 1);
        f34010b = abVar2;
        ab abVar3 = new ab("FEEDBACK", 2);
        f34011c = abVar3;
        ab[] abVarArr = {abVar, abVar2, abVar3};
        f34012d = abVarArr;
        f34013e = h.d.b.a(abVarArr);
    }

    public static h.d.a a() {
        return f34013e;
    }

    public static ab[] values() {
        return (ab[]) f34012d.clone();
    }
}
