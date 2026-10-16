package te;

import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: te.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC4158a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC4158a[] f46040a;

    static {
        EnumC4158a[] enumC4158aArr = {new EnumC4158a("ContentType", 0), new EnumC4158a(ApiHeadersProvider.AUTHORIZATION, 1), new EnumC4158a("Locale", 2), new EnumC4158a(ApiHeadersProvider.SOURCE, 3), new EnumC4158a("SourceVersion", 4), new EnumC4158a(ApiHeadersProvider.PLATFORM, 5), new EnumC4158a("PlatformVersion", 6), new EnumC4158a("UserID", 7)};
        f46040a = enumC4158aArr;
        d.t(enumC4158aArr);
    }

    public static EnumC4158a valueOf(String str) {
        return (EnumC4158a) Enum.valueOf(EnumC4158a.class, str);
    }

    public static EnumC4158a[] values() {
        return (EnumC4158a[]) f46040a.clone();
    }
}
