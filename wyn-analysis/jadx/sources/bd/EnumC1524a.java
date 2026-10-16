package bd;

import android.graphics.Typeface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC1524a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1524a f19444a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1524a[] f19445b;

    static {
        EnumC1524a enumC1524a = new EnumC1524a("NORMAL", 0);
        f19444a = enumC1524a;
        f19445b = new EnumC1524a[]{enumC1524a, new EnumC1524a("BOLD", 1), new EnumC1524a("ITALIC", 2), new EnumC1524a("MONOSPACE", 3)};
    }

    public static EnumC1524a valueOf(String str) {
        return (EnumC1524a) Enum.valueOf(EnumC1524a.class, str);
    }

    public static EnumC1524a[] values() {
        return (EnumC1524a[]) f19445b.clone();
    }

    public final Typeface a() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.defaultFromStyle(2) : Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
