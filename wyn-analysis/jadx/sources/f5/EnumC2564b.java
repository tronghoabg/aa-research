package f5;

import com.applovin.sdk.AppLovinEventTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2564b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2564b f34825a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2564b f34826b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2564b[] f34827c;

    static {
        EnumC2564b enumC2564b = new EnumC2564b("deviceDefault", 0);
        f34825a = enumC2564b;
        EnumC2564b enumC2564b2 = new EnumC2564b("dictation", 1);
        f34826b = enumC2564b2;
        EnumC2564b[] enumC2564bArr = {enumC2564b, enumC2564b2, new EnumC2564b(AppLovinEventTypes.USER_EXECUTED_SEARCH, 2), new EnumC2564b("confirmation", 3)};
        f34827c = enumC2564bArr;
        ic.d.t(enumC2564bArr);
    }

    public static EnumC2564b valueOf(String str) {
        return (EnumC2564b) Enum.valueOf(EnumC2564b.class, str);
    }

    public static EnumC2564b[] values() {
        return (EnumC2564b[]) f34827c.clone();
    }
}
