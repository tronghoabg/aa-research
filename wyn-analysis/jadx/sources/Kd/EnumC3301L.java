package kd;

import ad.C1355I;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kd.L, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3301L {

    /* renamed from: b, reason: collision with root package name */
    public static final C1355I f39581b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3301L f39582c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3301L f39583d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3301L f39584e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3301L f39585f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3301L f39586g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3301L f39587h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC3301L f39588i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC3301L[] f39589j;

    /* renamed from: a, reason: collision with root package name */
    public final int f39590a;

    static {
        EnumC3301L enumC3301L = new EnumC3301L("DATE_INVALID", 0, 0);
        f39582c = enumC3301L;
        EnumC3301L enumC3301L2 = new EnumC3301L("EXPIRED", 1, 1);
        f39583d = enumC3301L2;
        EnumC3301L enumC3301L3 = new EnumC3301L("ID_MISMATCH", 2, 2);
        f39584e = enumC3301L3;
        EnumC3301L enumC3301L4 = new EnumC3301L("INVALID", 3, 3);
        f39585f = enumC3301L4;
        EnumC3301L enumC3301L5 = new EnumC3301L("NOT_YET_VALID", 4, 4);
        f39586g = enumC3301L5;
        EnumC3301L enumC3301L6 = new EnumC3301L("UNTRUSTED", 5, 5);
        f39587h = enumC3301L6;
        EnumC3301L enumC3301L7 = new EnumC3301L("UNKNOWN", 6, 6);
        f39588i = enumC3301L7;
        EnumC3301L[] enumC3301LArr = {enumC3301L, enumC3301L2, enumC3301L3, enumC3301L4, enumC3301L5, enumC3301L6, enumC3301L7};
        f39589j = enumC3301LArr;
        ic.d.t(enumC3301LArr);
        f39581b = new C1355I(9);
    }

    public EnumC3301L(String str, int i5, int i10) {
        this.f39590a = i10;
    }

    public static EnumC3301L valueOf(String str) {
        return (EnumC3301L) Enum.valueOf(EnumC3301L.class, str);
    }

    public static EnumC3301L[] values() {
        return (EnumC3301L[]) f39589j.clone();
    }
}
