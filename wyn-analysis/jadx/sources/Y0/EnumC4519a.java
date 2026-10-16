package y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4519a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC4519a[] f47917a = {new EnumC4519a("On", 0), new EnumC4519a("Off", 1), new EnumC4519a("Indeterminate", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4519a EF7;

    public static EnumC4519a valueOf(String str) {
        return (EnumC4519a) Enum.valueOf(EnumC4519a.class, str);
    }

    public static EnumC4519a[] values() {
        return (EnumC4519a[]) f47917a.clone();
    }
}
