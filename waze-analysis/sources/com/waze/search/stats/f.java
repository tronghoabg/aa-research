package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f36026a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f36027b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f36028c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f36029d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f36030e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ f[] f36031f;

    static {
        f fVar = new f("HOME", 0);
        f36026a = fVar;
        f fVar2 = new f("WORK", 1);
        f36027b = fVar2;
        f fVar3 = new f("FAVORITE", 2);
        f36028c = fVar3;
        f fVar4 = new f("RECENT", 3);
        f36029d = fVar4;
        f fVar5 = new f("NEW_DESTINATION", 4);
        f36030e = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f36031f = fVarArr;
        h.d.b.a(fVarArr);
    }

    public static f[] values() {
        return (f[]) f36031f.clone();
    }
}
