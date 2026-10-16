package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f31437a;

    /* renamed from: b, reason: collision with root package name */
    public static final C f31438b;

    /* renamed from: c, reason: collision with root package name */
    public static final C f31439c;

    /* renamed from: d, reason: collision with root package name */
    public static final C f31440d;

    /* renamed from: e, reason: collision with root package name */
    public static final C f31441e;

    /* renamed from: f, reason: collision with root package name */
    public static final C f31442f;

    /* renamed from: g, reason: collision with root package name */
    public static final C f31443g;

    /* renamed from: h, reason: collision with root package name */
    public static final C f31444h;

    /* renamed from: i, reason: collision with root package name */
    public static final C f31445i;

    /* renamed from: j, reason: collision with root package name */
    public static final C f31446j;
    public static final C k;

    /* renamed from: l, reason: collision with root package name */
    public static final C f31447l;

    /* renamed from: m, reason: collision with root package name */
    public static final C f31448m;

    /* renamed from: n, reason: collision with root package name */
    public static final C f31449n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ C[] f31450o;

    static {
        C c10 = new C("CreativeView", 0);
        f31437a = c10;
        C c11 = new C("Start", 1);
        f31438b = c11;
        C c12 = new C("FirstQuartile", 2);
        f31439c = c12;
        C c13 = new C("Midpoint", 3);
        f31440d = c13;
        C c14 = new C("ThirdQuartile", 4);
        f31441e = c14;
        C c15 = new C("Complete", 5);
        f31442f = c15;
        C c16 = new C("Mute", 6);
        f31443g = c16;
        C c17 = new C("UnMute", 7);
        f31444h = c17;
        C c18 = new C("Pause", 8);
        f31445i = c18;
        C c19 = new C("Rewind", 9);
        f31446j = c19;
        C c20 = new C("Resume", 10);
        k = c20;
        C c21 = new C("CloseLinear", 11);
        f31447l = c21;
        C c22 = new C("Skip", 12);
        f31448m = c22;
        C c23 = new C("Progress", 13);
        f31449n = c23;
        C[] cArr = {c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23};
        f31450o = cArr;
        ic.d.t(cArr);
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f31450o.clone();
    }
}
