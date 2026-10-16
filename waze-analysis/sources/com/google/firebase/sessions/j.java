package com.google.firebase.sessions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j implements com.google.firebase.d.b.f {

    /* renamed from: a, reason: collision with root package name */
    public static final j f10956a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f10957b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f10958c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f10959d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f10960e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f10961f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ j[] f10962g;

    /* renamed from: h, reason: collision with root package name */
    private final int f10963h;

    static {
        j jVar = new j("COLLECTION_UNKNOWN", 0, 0);
        f10956a = jVar;
        j jVar2 = new j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        f10957b = jVar2;
        j jVar3 = new j("COLLECTION_ENABLED", 2, 2);
        f10958c = jVar3;
        j jVar4 = new j("COLLECTION_DISABLED", 3, 3);
        f10959d = jVar4;
        j jVar5 = new j("COLLECTION_DISABLED_REMOTE", 4, 4);
        f10960e = jVar5;
        j jVar6 = new j("COLLECTION_SAMPLED", 5, 5);
        f10961f = jVar6;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6};
        f10962g = jVarArr;
        h.d.b.a(jVarArr);
    }

    private j(String str, int i2, int i3) {
        this.f10963h = i3;
    }

    public static j[] values() {
        return (j[]) f10962g.clone();
    }

    @Override // com.google.firebase.d.b.f
    public final int a() {
        return this.f10963h;
    }
}
