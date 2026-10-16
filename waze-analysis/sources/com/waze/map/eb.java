package com.waze.map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public static final eb f28816a;

    /* renamed from: b, reason: collision with root package name */
    public static final eb f28817b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ eb[] f28818c;

    static {
        eb ebVar = new eb("Start", 0);
        f28816a = ebVar;
        eb ebVar2 = new eb("End", 1);
        f28817b = ebVar2;
        eb[] ebVarArr = {ebVar, ebVar2};
        f28818c = ebVarArr;
        h.d.b.a(ebVarArr);
    }

    public static eb[] values() {
        return (eb[]) f28818c.clone();
    }
}
