package com.waze.z.a.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f45843a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f45844b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f45845c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f45846d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ i[] f45847e;

    static {
        i iVar = new i("Small", 0);
        f45843a = iVar;
        i iVar2 = new i("Big", 1);
        f45844b = iVar2;
        i iVar3 = new i("Legacy", 2);
        f45845c = iVar3;
        i iVar4 = new i("FullBleed", 3);
        f45846d = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f45847e = iVarArr;
        h.d.b.a(iVarArr);
    }

    public static i[] values() {
        return (i[]) f45847e.clone();
    }
}
