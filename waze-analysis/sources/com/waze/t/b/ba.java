package com.waze.t.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    public static final ba f40709a;

    /* renamed from: b, reason: collision with root package name */
    public static final ba f40710b;

    /* renamed from: c, reason: collision with root package name */
    public static final ba f40711c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ba[] f40712d;

    static {
        ba baVar = new ba("MUTED", 0);
        f40709a = baVar;
        ba baVar2 = new ba("AUDIO_FOCUS_LOST", 1);
        f40710b = baVar2;
        ba baVar3 = new ba("USER_CANCELLED", 2);
        f40711c = baVar3;
        ba[] baVarArr = {baVar, baVar2, baVar3};
        f40712d = baVarArr;
        h.d.b.a(baVarArr);
    }

    public static ba[] values() {
        return (ba[]) f40712d.clone();
    }
}
