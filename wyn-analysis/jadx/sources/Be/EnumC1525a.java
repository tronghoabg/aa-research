package be;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: be.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC1525a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1525a f19459b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1525a f19460c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1525a f19461d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1525a f19462e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1525a f19463f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC1525a f19464g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC1525a f19465h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1525a f19466i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC1525a f19467j;
    public static final EnumC1525a k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1525a f19468l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC1525a[] f19469m;

    /* renamed from: a, reason: collision with root package name */
    public final String f19470a;

    static {
        EnumC1525a enumC1525a = new EnumC1525a("ActivityStart", 0, "Failed to start activity for No-Code screen");
        f19459b = enumC1525a;
        EnumC1525a enumC1525a2 = new EnumC1525a("BadNetworkRequest", 1, "Network request is incorrect and thus cannot be executed");
        f19460c = enumC1525a2;
        EnumC1525a enumC1525a3 = new EnumC1525a("NetworkRequestExecution", 2, "Failed to execute network request");
        f19461d = enumC1525a3;
        EnumC1525a enumC1525a4 = new EnumC1525a("Serialization", 3, "Failed to serialize data");
        f19462e = enumC1525a4;
        EnumC1525a enumC1525a5 = new EnumC1525a("Deserialization", 4, "Failed to deserialize data");
        f19463f = enumC1525a5;
        EnumC1525a enumC1525a6 = new EnumC1525a("RequestDenied", 5, "Request denied");
        f19464g = enumC1525a6;
        EnumC1525a enumC1525a7 = new EnumC1525a("Mapping", 6, "Failed to map response");
        f19465h = enumC1525a7;
        EnumC1525a enumC1525a8 = new EnumC1525a("BadResponse", 7, "API response can not be handled");
        f19466i = enumC1525a8;
        EnumC1525a enumC1525a9 = new EnumC1525a("BackendError", 8, "Qonversion API returned an error");
        f19467j = enumC1525a9;
        EnumC1525a enumC1525a10 = new EnumC1525a("ScreenNotFound", 9, "No-Code screen not found");
        k = enumC1525a10;
        EnumC1525a enumC1525a11 = new EnumC1525a("QonversionError", 10, "An internal error from Qonversion SDK. For more details look at the nested error.");
        f19468l = enumC1525a11;
        EnumC1525a[] enumC1525aArr = {enumC1525a, enumC1525a2, enumC1525a3, enumC1525a4, enumC1525a5, enumC1525a6, enumC1525a7, enumC1525a8, enumC1525a9, enumC1525a10, enumC1525a11};
        f19469m = enumC1525aArr;
        d.t(enumC1525aArr);
    }

    public EnumC1525a(String str, int i5, String str2) {
        this.f19470a = str2;
    }

    public static EnumC1525a valueOf(String str) {
        return (EnumC1525a) Enum.valueOf(EnumC1525a.class, str);
    }

    public static EnumC1525a[] values() {
        return (EnumC1525a[]) f19469m.clone();
    }
}
