package ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ve.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC4344b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC4344b[] f47239a;

    static {
        EnumC4344b[] enumC4344bArr = {new EnumC4344b("POST", 0), new EnumC4344b("GET", 1), new EnumC4344b("DELETE", 2), new EnumC4344b("PUT", 3)};
        f47239a = enumC4344bArr;
        ic.d.t(enumC4344bArr);
    }

    public static EnumC4344b valueOf(String str) {
        return (EnumC4344b) Enum.valueOf(EnumC4344b.class, str);
    }

    public static EnumC4344b[] values() {
        return (EnumC4344b[]) f47239a.clone();
    }
}
