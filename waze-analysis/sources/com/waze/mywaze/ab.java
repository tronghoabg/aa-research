package com.waze.mywaze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final ab f30543a;

    /* renamed from: b, reason: collision with root package name */
    public static final ab f30544b;

    /* renamed from: c, reason: collision with root package name */
    public static final ab f30545c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ab[] f30546d;

    static {
        ab abVar = new ab("STATUS_UNSPECIFIED", 0);
        f30543a = abVar;
        ab abVar2 = new ab("REGULAR", 1);
        f30544b = abVar2;
        ab abVar3 = new ab("WITH_BADGE", 2);
        f30545c = abVar3;
        ab[] abVarArr = {abVar, abVar2, abVar3};
        f30546d = abVarArr;
        h.d.b.a(abVarArr);
    }

    public static ab[] values() {
        return (ab[]) f30546d.clone();
    }
}
