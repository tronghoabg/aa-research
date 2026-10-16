package kd;

import a9.C1342b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kd.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3325v {

    /* renamed from: b, reason: collision with root package name */
    public static final C1342b f39699b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3325v f39700c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC3325v[] f39701d;

    /* renamed from: a, reason: collision with root package name */
    public final int f39702a;

    static {
        EnumC3325v enumC3325v = new EnumC3325v("ALWAYS", 0, 0);
        EnumC3325v enumC3325v2 = new EnumC3325v("IF_CONTENT_SCROLLS", 1, 1);
        EnumC3325v enumC3325v3 = new EnumC3325v("NEVER", 2, 2);
        EnumC3325v enumC3325v4 = new EnumC3325v("UNKNOWN", 3, 3);
        f39700c = enumC3325v4;
        EnumC3325v[] enumC3325vArr = {enumC3325v, enumC3325v2, enumC3325v3, enumC3325v4};
        f39701d = enumC3325vArr;
        ic.d.t(enumC3325vArr);
        f39699b = new C1342b();
    }

    public EnumC3325v(String str, int i5, int i10) {
        this.f39702a = i10;
    }

    public static EnumC3325v valueOf(String str) {
        return (EnumC3325v) Enum.valueOf(EnumC3325v.class, str);
    }

    public static EnumC3325v[] values() {
        return (EnumC3325v[]) f39701d.clone();
    }
}
