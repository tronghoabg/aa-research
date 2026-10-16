package com.waze.search.v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f36485a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f36486b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f36487c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f36488d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f36489e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ f[] f36490f;

    static {
        f fVar = new f("REGULAR", 0);
        f36485a = fVar;
        f fVar2 = new f("PARKING", 1);
        f36486b = fVar2;
        f fVar3 = new f("CRISIS", 2);
        f36487c = fVar3;
        f fVar4 = new f("SHELTER", 3);
        f36488d = fVar4;
        f fVar5 = new f("DONATION_CENTER", 4);
        f36489e = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f36490f = fVarArr;
        h.d.b.a(fVarArr);
    }

    public static f[] values() {
        return (f[]) f36490f.clone();
    }
}
