package com.waze.map.canvas;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f28654a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f28655b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ q[] f28656c;

    /* renamed from: d, reason: collision with root package name */
    private final String f28657d;

    static {
        q qVar = new q("Main", 0, "Main Canvas");
        f28654a = qVar;
        q qVar2 = new q("Generic", 1, "Generic Canvas");
        f28655b = qVar2;
        q[] qVarArr = {qVar, qVar2};
        f28656c = qVarArr;
        h.d.b.a(qVarArr);
    }

    private q(String str, int i2, String str2) {
        this.f28657d = str2;
    }

    public static q[] values() {
        return (q[]) f28656c.clone();
    }

    public final String a() {
        return this.f28657d;
    }
}
