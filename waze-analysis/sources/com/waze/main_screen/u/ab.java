package com.waze.main_screen.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final ab f27658a;

    /* renamed from: b, reason: collision with root package name */
    public static final ab f27659b;

    /* renamed from: c, reason: collision with root package name */
    public static final ab f27660c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ab[] f27661d;

    static {
        ab abVar = new ab("PLANNED_DRIVE", 0);
        f27658a = abVar;
        ab abVar2 = new ab("CALENDAR_EVENT", 1);
        f27659b = abVar2;
        ab abVar3 = new ab("NONE", 2);
        f27660c = abVar3;
        ab[] abVarArr = {abVar, abVar2, abVar3};
        f27661d = abVarArr;
        h.d.b.a(abVarArr);
    }

    public static ab[] values() {
        return (ab[]) f27661d.clone();
    }
}
