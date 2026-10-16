package com.waze.car_lib.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    public static final jb f19737a;

    /* renamed from: b, reason: collision with root package name */
    public static final jb f19738b;

    /* renamed from: c, reason: collision with root package name */
    public static final jb f19739c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ jb[] f19740d;

    static {
        jb jbVar = new jb("GENERIC_ERROR", 0);
        f19737a = jbVar;
        jb jbVar2 = new jb("START_NAVIGATION_ERROR", 1);
        f19738b = jbVar2;
        jb jbVar3 = new jb("ROUTES_FETCH_ERROR", 2);
        f19739c = jbVar3;
        jb[] jbVarArr = {jbVar, jbVar2, jbVar3};
        f19740d = jbVarArr;
        h.d.b.a(jbVarArr);
    }

    public static jb[] values() {
        return (jb[]) f19740d.clone();
    }
}
