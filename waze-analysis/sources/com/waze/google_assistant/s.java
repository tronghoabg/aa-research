package com.waze.google_assistant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f24236a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f24237b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f24238c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ s[] f24239d;

    static {
        s sVar = new s("NONE", 0);
        f24236a = sVar;
        s sVar2 = new s("ACTIVE_IN_MOBILE", 1);
        f24237b = sVar2;
        s sVar3 = new s("ACTIVE_IN_CAR_AAP", 2);
        f24238c = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        f24239d = sVarArr;
        h.d.b.a(sVarArr);
    }

    public static s[] values() {
        return (s[]) f24239d.clone();
    }
}
