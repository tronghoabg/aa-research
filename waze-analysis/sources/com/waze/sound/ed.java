package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ed {

    /* renamed from: a, reason: collision with root package name */
    public static final ed f39887a;

    /* renamed from: b, reason: collision with root package name */
    public static final ed f39888b;

    /* renamed from: c, reason: collision with root package name */
    public static final ed f39889c;

    /* renamed from: d, reason: collision with root package name */
    public static final ed f39890d;

    /* renamed from: e, reason: collision with root package name */
    public static final ed f39891e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ ed[] f39892f;

    static {
        ed edVar = new ed("Timeout", 0);
        f39887a = edVar;
        ed edVar2 = new ed("SilenceDetected", 1);
        f39888b = edVar2;
        ed edVar3 = new ed("SilenceDetectorError", 2);
        f39889c = edVar3;
        ed edVar4 = new ed("RecorderError", 3);
        f39890d = edVar4;
        ed edVar5 = new ed("UserCancel", 4);
        f39891e = edVar5;
        ed[] edVarArr = {edVar, edVar2, edVar3, edVar4, edVar5};
        f39892f = edVarArr;
        h.d.b.a(edVarArr);
    }

    public static ed[] values() {
        return (ed[]) f39892f.clone();
    }
}
