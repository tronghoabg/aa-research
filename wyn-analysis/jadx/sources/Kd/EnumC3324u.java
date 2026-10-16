package kd;

import a9.C1341a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kd.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3324u {

    /* renamed from: b, reason: collision with root package name */
    public static final C1341a f39696b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC3324u[] f39697c;

    /* renamed from: a, reason: collision with root package name */
    public final int f39698a;

    static {
        EnumC3324u[] enumC3324uArr = {new EnumC3324u("ALWAYS_ALLOW", 0, 0), new EnumC3324u("COMPATIBILITY_MODE", 1, 1), new EnumC3324u("NEVER_ALLOW", 2, 2)};
        f39697c = enumC3324uArr;
        ic.d.t(enumC3324uArr);
        f39696b = new C1341a();
    }

    public EnumC3324u(String str, int i5, int i10) {
        this.f39698a = i10;
    }

    public static EnumC3324u valueOf(String str) {
        return (EnumC3324u) Enum.valueOf(EnumC3324u.class, str);
    }

    public static EnumC3324u[] values() {
        return (EnumC3324u[]) f39697c.clone();
    }
}
