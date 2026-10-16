package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3387c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3387c f39948a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3387c f39949b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3387c f39950c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC3387c[] f39951d;

    static {
        EnumC3387c enumC3387c = new EnumC3387c("POSITIVE", 0);
        f39948a = enumC3387c;
        EnumC3387c enumC3387c2 = new EnumC3387c("NEUTRAL", 1);
        f39949b = enumC3387c2;
        EnumC3387c enumC3387c3 = new EnumC3387c("NEGATIVE", 2);
        f39950c = enumC3387c3;
        f39951d = new EnumC3387c[]{enumC3387c, enumC3387c2, enumC3387c3};
    }

    public static EnumC3387c valueOf(String str) {
        return (EnumC3387c) Enum.valueOf(EnumC3387c.class, str);
    }

    public static EnumC3387c[] values() {
        return (EnumC3387c[]) f39951d.clone();
    }
}
