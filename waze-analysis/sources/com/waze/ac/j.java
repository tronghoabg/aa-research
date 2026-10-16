package com.waze.ac;

import l.a.ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f13853a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f13854b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f13855c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f13856d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f13857e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f13858f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ j[] f13859g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13860h;

    /* renamed from: i, reason: collision with root package name */
    private final ud f13861i;

    static {
        j jVar = new j("ACTION_UNSPECIFIED", 0, "ACTION_UNSPECIFIED", ud.ACTION_UNSPECIFIED);
        f13853a = jVar;
        j jVar2 = new j("PRIMARY", 1, "PRIMARY", ud.PRIMARY);
        f13854b = jVar2;
        j jVar3 = new j("MAIN", 2, "MAIN", ud.PRIMARY);
        f13855c = jVar3;
        j jVar4 = new j("SECOND", 3, "SECOND", ud.SECONDARY);
        f13856d = jVar4;
        j jVar5 = new j("SECONDARY", 4, "SECONDARY", ud.SECONDARY);
        f13857e = jVar5;
        j jVar6 = new j("BACK", 5, "BACK", ud.BACK);
        f13858f = jVar6;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6};
        f13859g = jVarArr;
        h.d.b.a(jVarArr);
    }

    private j(String str, int i2, String str2, ud udVar) {
        this.f13860h = str2;
        this.f13861i = udVar;
    }

    public static j[] values() {
        return (j[]) f13859g.clone();
    }

    public final String a() {
        return this.f13860h;
    }

    public final ud b() {
        return this.f13861i;
    }
}
