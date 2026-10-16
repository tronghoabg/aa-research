package com.google.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f12462a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f12463b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f12464c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ s[] f12465d;

    static {
        s sVar = new s("LENIENT", 0);
        f12462a = sVar;
        s sVar2 = new s("LEGACY_STRICT", 1);
        f12463b = sVar2;
        s sVar3 = new s("STRICT", 2);
        f12464c = sVar3;
        f12465d = new s[]{sVar, sVar2, sVar3};
    }

    public static s[] values() {
        return (s[]) f12465d.clone();
    }
}
