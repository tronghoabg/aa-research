package com.waze.sound;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    public static final bk f39540a;

    /* renamed from: b, reason: collision with root package name */
    public static final bk f39541b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ bk[] f39542c;

    static {
        bk bkVar = new bk("METER", 0);
        f39540a = bkVar;
        bk bkVar2 = new bk("FOOT", 1);
        f39541b = bkVar2;
        bk[] bkVarArr = {bkVar, bkVar2};
        f39542c = bkVarArr;
        h.d.b.a(bkVarArr);
    }

    public static bk[] values() {
        return (bk[]) f39542c.clone();
    }
}
