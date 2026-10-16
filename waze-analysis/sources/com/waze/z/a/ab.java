package com.waze.z.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final ab f45610a;

    /* renamed from: b, reason: collision with root package name */
    public static final ab f45611b;

    /* renamed from: c, reason: collision with root package name */
    public static final ab f45612c;

    /* renamed from: d, reason: collision with root package name */
    public static final ab f45613d;

    /* renamed from: e, reason: collision with root package name */
    public static final ab f45614e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ ab[] f45615f;

    static {
        ab abVar = new ab("Primary", 0);
        f45610a = abVar;
        ab abVar2 = new ab("Alarming", 1);
        f45611b = abVar2;
        ab abVar3 = new ab("Cautious", 2);
        f45612c = abVar3;
        ab abVar4 = new ab("Safe", 3);
        f45613d = abVar4;
        ab abVar5 = new ab("Promotion", 4);
        f45614e = abVar5;
        ab[] abVarArr = {abVar, abVar2, abVar3, abVar4, abVar5};
        f45615f = abVarArr;
        h.d.b.a(abVarArr);
    }

    public static ab[] values() {
        return (ab[]) f45615f.clone();
    }
}
