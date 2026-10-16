package com.google.d.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al {

    /* renamed from: a, reason: collision with root package name */
    public static final al f7299a;

    /* renamed from: b, reason: collision with root package name */
    public static final al f7300b;

    /* renamed from: c, reason: collision with root package name */
    public static final al f7301c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ al[] f7302d;

    static {
        al alVar = new al("STRONG", 0);
        f7299a = alVar;
        al alVar2 = new al("SOFT", 1);
        f7300b = alVar2;
        al alVar3 = new al("WEAK", 2);
        f7301c = alVar3;
        f7302d = new al[]{alVar, alVar2, alVar3};
    }

    public static al[] values() {
        return (al[]) f7302d.clone();
    }

    final com.google.d.b.s a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return com.google.d.b.s.d();
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return com.google.d.b.s.e();
        }
        throw null;
    }
}
