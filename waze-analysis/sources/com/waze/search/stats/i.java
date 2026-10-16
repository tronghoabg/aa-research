package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f36041a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f36042b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f36043c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f36044d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ i[] f36045e;

    static {
        i iVar = new i("TYPE_UNSPECIFIED", 0);
        f36041a = iVar;
        i iVar2 = new i("HOME", 1);
        f36042b = iVar2;
        i iVar3 = new i("OTHER_PLACE", 2);
        f36043c = iVar3;
        i iVar4 = new i("WORK", 3);
        f36044d = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f36045e = iVarArr;
        h.d.b.a(iVarArr);
    }

    public static i[] values() {
        return (i[]) f36045e.clone();
    }
}
