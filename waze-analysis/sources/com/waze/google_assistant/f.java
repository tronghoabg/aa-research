package com.waze.google_assistant;

import l.a.zz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24174a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f24175b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ f[] f24176c;

    /* renamed from: d, reason: collision with root package name */
    private final zz f24177d;

    static {
        f fVar = new f("SAME_SIDE", 0, zz.SAME_SIDE);
        f24174a = fVar;
        f fVar2 = new f("OTHER_SIDE", 1, zz.OTHER_SIDE);
        f24175b = fVar2;
        f[] fVarArr = {fVar, fVar2};
        f24176c = fVarArr;
        h.d.b.a(fVarArr);
    }

    private f(String str, int i2, zz zzVar) {
        this.f24177d = zzVar;
    }

    public static f[] values() {
        return (f[]) f24176c.clone();
    }

    public final zz a() {
        return this.f24177d;
    }
}
