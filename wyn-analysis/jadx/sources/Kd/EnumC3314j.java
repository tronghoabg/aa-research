package kd;

import ad.C1355I;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kd.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3314j {

    /* renamed from: b, reason: collision with root package name */
    public static final C1355I f39664b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3314j f39665c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3314j f39666d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3314j f39667e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3314j f39668f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3314j f39669g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3314j f39670h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC3314j[] f39671i;

    /* renamed from: a, reason: collision with root package name */
    public final int f39672a;

    static {
        EnumC3314j enumC3314j = new EnumC3314j("DEBUG", 0, 0);
        f39665c = enumC3314j;
        EnumC3314j enumC3314j2 = new EnumC3314j("ERROR", 1, 1);
        f39666d = enumC3314j2;
        EnumC3314j enumC3314j3 = new EnumC3314j("LOG", 2, 2);
        f39667e = enumC3314j3;
        EnumC3314j enumC3314j4 = new EnumC3314j("TIP", 3, 3);
        f39668f = enumC3314j4;
        EnumC3314j enumC3314j5 = new EnumC3314j("WARNING", 4, 4);
        f39669g = enumC3314j5;
        EnumC3314j enumC3314j6 = new EnumC3314j("UNKNOWN", 5, 5);
        f39670h = enumC3314j6;
        EnumC3314j[] enumC3314jArr = {enumC3314j, enumC3314j2, enumC3314j3, enumC3314j4, enumC3314j5, enumC3314j6};
        f39671i = enumC3314jArr;
        ic.d.t(enumC3314jArr);
        f39664b = new C1355I(8);
    }

    public EnumC3314j(String str, int i5, int i10) {
        this.f39672a = i10;
    }

    public static EnumC3314j valueOf(String str) {
        return (EnumC3314j) Enum.valueOf(EnumC3314j.class, str);
    }

    public static EnumC3314j[] values() {
        return (EnumC3314j[]) f39671i.clone();
    }
}
