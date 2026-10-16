package com.waze.map.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dk {

    /* renamed from: a, reason: collision with root package name */
    public static final dk f28192a;

    /* renamed from: b, reason: collision with root package name */
    public static final dk f28193b;

    /* renamed from: c, reason: collision with root package name */
    public static final dk f28194c;

    /* renamed from: d, reason: collision with root package name */
    public static final dk f28195d;

    /* renamed from: e, reason: collision with root package name */
    public static final dk f28196e;

    /* renamed from: f, reason: collision with root package name */
    public static final dk f28197f;

    /* renamed from: g, reason: collision with root package name */
    public static final dk f28198g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ dk[] f28199h;

    static {
        dk dkVar = new dk("Unknown", 0);
        f28192a = dkVar;
        dk dkVar2 = new dk("IdleAfterTouch", 1);
        f28193b = dkVar2;
        dk dkVar3 = new dk("FollowingTouch", 2);
        f28194c = dkVar3;
        dk dkVar4 = new dk("SettlingAfterTouch", 3);
        f28195d = dkVar4;
        dk dkVar5 = new dk("AnimatingMovementFromCode", 4);
        f28196e = dkVar5;
        dk dkVar6 = new dk("AnimatingMovementToTarget", 5);
        f28197f = dkVar6;
        dk dkVar7 = new dk("FocusedOnTarget", 6);
        f28198g = dkVar7;
        dk[] dkVarArr = {dkVar, dkVar2, dkVar3, dkVar4, dkVar5, dkVar6, dkVar7};
        f28199h = dkVarArr;
        h.d.b.a(dkVarArr);
    }

    public static dk[] values() {
        return (dk[]) f28199h.clone();
    }
}
