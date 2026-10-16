package com.waze.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dw {

    /* renamed from: a, reason: collision with root package name */
    public static final dw f37091a;

    /* renamed from: b, reason: collision with root package name */
    public static final dw f37092b;

    /* renamed from: c, reason: collision with root package name */
    public static final dw f37093c;

    /* renamed from: d, reason: collision with root package name */
    public static final dw f37094d;

    /* renamed from: e, reason: collision with root package name */
    public static final dw f37095e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ dw[] f37096f;

    static {
        dw dwVar = new dw("SOUND_ON", 0);
        f37091a = dwVar;
        dw dwVar2 = new dw("SOUND_OFF", 1);
        f37092b = dwVar2;
        dw dwVar3 = new dw("ALERTS_ONLY", 2);
        f37093c = dwVar3;
        dw dwVar4 = new dw("LESS_CHATTY", 3);
        f37094d = dwVar4;
        dw dwVar5 = new dw("SMART_GUIDANCE", 4);
        f37095e = dwVar5;
        dw[] dwVarArr = {dwVar, dwVar2, dwVar3, dwVar4, dwVar5};
        f37096f = dwVarArr;
        h.d.b.a(dwVarArr);
    }

    public static dw[] values() {
        return (dw[]) f37096f.clone();
    }
}
