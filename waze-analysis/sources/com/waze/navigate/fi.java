package com.waze.navigate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fi {

    /* renamed from: a, reason: collision with root package name */
    public static final fi f31361a;

    /* renamed from: b, reason: collision with root package name */
    public static final fi f31362b;

    /* renamed from: c, reason: collision with root package name */
    public static final fi f31363c;

    /* renamed from: d, reason: collision with root package name */
    public static final fi f31364d;

    /* renamed from: e, reason: collision with root package name */
    public static final fi f31365e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ fi[] f31366f;

    static {
        fi fiVar = new fi("UNSPECIFIED", 0);
        f31361a = fiVar;
        fi fiVar2 = new fi("AUTO_DETECTED", 1);
        f31362b = fiVar2;
        fi fiVar3 = new fi("MANUALLY", 2);
        f31363c = fiVar3;
        fi fiVar4 = new fi("MANUALLY_PARK_NOW", 3);
        f31364d = fiVar4;
        fi fiVar5 = new fi("LOCATION_EDITED", 4);
        f31365e = fiVar5;
        fi[] fiVarArr = {fiVar, fiVar2, fiVar3, fiVar4, fiVar5};
        f31366f = fiVarArr;
        h.d.b.a(fiVarArr);
    }

    public static fi[] values() {
        return (fi[]) f31366f.clone();
    }
}
