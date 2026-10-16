package com.waze.navigate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gl {

    /* renamed from: a, reason: collision with root package name */
    public static final gl f31434a;

    /* renamed from: b, reason: collision with root package name */
    public static final gl f31435b;

    /* renamed from: c, reason: collision with root package name */
    public static final gl f31436c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ gl[] f31437d;

    static {
        gl glVar = new gl("ACTION_UNSPECIFIED", 0);
        f31434a = glVar;
        gl glVar2 = new gl("VIEW_LOCATION", 1);
        f31435b = glVar2;
        gl glVar3 = new gl("CANCEL", 2);
        f31436c = glVar3;
        gl[] glVarArr = {glVar, glVar2, glVar3};
        f31437d = glVarArr;
        h.d.b.a(glVarArr);
    }

    public static gl[] values() {
        return (gl[]) f31437d.clone();
    }
}
