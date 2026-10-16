package com.waze.reports_v2.presentation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    public static final au f34829a;

    /* renamed from: b, reason: collision with root package name */
    public static final au f34830b;

    /* renamed from: c, reason: collision with root package name */
    public static final au f34831c;

    /* renamed from: d, reason: collision with root package name */
    public static final au f34832d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ au[] f34833e;

    static {
        au auVar = new au("START", 0);
        f34829a = auVar;
        au auVar2 = new au("END", 1);
        f34830b = auVar2;
        au auVar3 = new au("SAME", 2);
        f34831c = auVar3;
        au auVar4 = new au("FORBIDDEN", 3);
        f34832d = auVar4;
        au[] auVarArr = {auVar, auVar2, auVar3, auVar4};
        f34833e = auVarArr;
        h.d.b.a(auVarArr);
    }

    public static au[] values() {
        return (au[]) f34833e.clone();
    }
}
