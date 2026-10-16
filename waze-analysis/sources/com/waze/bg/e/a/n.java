package com.waze.bg.e.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f16730a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f16731b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f16732c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f16733d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f16734e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ n[] f16735f;

    static {
        n nVar = new n("BEGIN_NAVIGATION", 0);
        f16730a = nVar;
        n nVar2 = new n("RESUME_NAVIGATION", 1);
        f16731b = nVar2;
        n nVar3 = new n("OFFLINE_RECOVERY", 2);
        f16732c = nVar3;
        n nVar4 = new n("ERROR_RECOVERY", 3);
        f16733d = nVar4;
        n nVar5 = new n("FLOW_NOT_SET", 4);
        f16734e = nVar5;
        f16735f = new n[]{nVar, nVar2, nVar3, nVar4, nVar5};
    }

    public static n[] values() {
        return (n[]) f16735f.clone();
    }
}
