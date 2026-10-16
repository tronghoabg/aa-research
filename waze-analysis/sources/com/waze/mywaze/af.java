package com.waze.mywaze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    public static final af f30564a;

    /* renamed from: b, reason: collision with root package name */
    public static final af f30565b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ af[] f30566c;

    static {
        af afVar = new af("REGISTERED", 0);
        f30564a = afVar;
        af afVar2 = new af("UNREGISTERED", 1);
        f30565b = afVar2;
        af[] afVarArr = {afVar, afVar2};
        f30566c = afVarArr;
        h.d.b.a(afVarArr);
    }

    public static af[] values() {
        return (af[]) f30566c.clone();
    }
}
