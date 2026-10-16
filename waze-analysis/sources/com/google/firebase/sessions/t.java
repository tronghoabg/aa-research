package com.google.firebase.sessions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t implements com.google.firebase.d.b.f {

    /* renamed from: a, reason: collision with root package name */
    public static final t f10986a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f10987b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f10988c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f10989d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ t[] f10990e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10991f;

    static {
        t tVar = new t("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        f10986a = tVar;
        t tVar2 = new t("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        f10987b = tVar2;
        t tVar3 = new t("LOG_ENVIRONMENT_STAGING", 2, 2);
        f10988c = tVar3;
        t tVar4 = new t("LOG_ENVIRONMENT_PROD", 3, 3);
        f10989d = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        f10990e = tVarArr;
        h.d.b.a(tVarArr);
    }

    private t(String str, int i2, int i3) {
        this.f10991f = i3;
    }

    public static t[] values() {
        return (t[]) f10990e.clone();
    }

    @Override // com.google.firebase.d.b.f
    public final int a() {
        return this.f10991f;
    }
}
