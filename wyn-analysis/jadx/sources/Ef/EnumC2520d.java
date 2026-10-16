package ef;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ef.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2520d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2520d f34660a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2520d[] f34661b;

    static {
        EnumC2520d enumC2520d = new EnumC2520d("WARNING", 0);
        f34660a = enumC2520d;
        EnumC2520d[] enumC2520dArr = {enumC2520d, new EnumC2520d("ERROR", 1), new EnumC2520d("HIDDEN", 2)};
        f34661b = enumC2520dArr;
        ic.d.t(enumC2520dArr);
    }

    public static EnumC2520d valueOf(String str) {
        return (EnumC2520d) Enum.valueOf(EnumC2520d.class, str);
    }

    public static EnumC2520d[] values() {
        return (EnumC2520d[]) f34661b.clone();
    }
}
