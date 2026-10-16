package com.waze.modules.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    public static final as f30317a;

    /* renamed from: b, reason: collision with root package name */
    public static final as f30318b;

    /* renamed from: c, reason: collision with root package name */
    public static final as f30319c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ as[] f30320d;

    static {
        as asVar = new as("ALWAYS_SHOW", 0);
        f30317a = asVar;
        as asVar2 = new as("NEVER_SHOW", 1);
        f30318b = asVar2;
        as asVar3 = new as("DEPENDS_ON_CALLER_CONFIG", 2);
        f30319c = asVar3;
        as[] asVarArr = {asVar, asVar2, asVar3};
        f30320d = asVarArr;
        h.d.b.a(asVarArr);
    }

    public static as[] values() {
        return (as[]) f30320d.clone();
    }
}
