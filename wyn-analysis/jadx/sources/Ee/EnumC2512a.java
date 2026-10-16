package ee;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ee.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2512a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC2512a[] f34651a;

    static {
        EnumC2512a[] enumC2512aArr = {new EnumC2512a("SourceKey", 0), new EnumC2512a("VersionKey", 1)};
        f34651a = enumC2512aArr;
        d.t(enumC2512aArr);
    }

    public static EnumC2512a valueOf(String str) {
        return (EnumC2512a) Enum.valueOf(EnumC2512a.class, str);
    }

    public static EnumC2512a[] values() {
        return (EnumC2512a[]) f34651a.clone();
    }
}
