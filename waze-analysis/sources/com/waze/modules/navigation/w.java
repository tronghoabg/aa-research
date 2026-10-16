package com.waze.modules.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f30499a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f30500b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f30501c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ w[] f30502d;

    static {
        w wVar = new w("YES", 0);
        f30499a = wVar;
        w wVar2 = new w("NO", 1);
        f30500b = wVar2;
        w wVar3 = new w("BACK", 2);
        f30501c = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        f30502d = wVarArr;
        h.d.b.a(wVarArr);
    }

    public static w[] values() {
        return (w[]) f30502d.clone();
    }
}
