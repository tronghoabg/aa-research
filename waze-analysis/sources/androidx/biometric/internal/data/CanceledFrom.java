package androidx.biometric.internal.data;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CanceledFrom {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CanceledFrom[] $VALUES;
    public static final CanceledFrom INTERNAL = new CanceledFrom("INTERNAL", 0);
    public static final CanceledFrom USER = new CanceledFrom("USER", 1);
    public static final CanceledFrom CLIENT = new CanceledFrom("CLIENT", 2);
    public static final CanceledFrom NEGATIVE_BUTTON = new CanceledFrom("NEGATIVE_BUTTON", 3);
    public static final CanceledFrom FALLBACK_OPTION = new CanceledFrom("FALLBACK_OPTION", 4);
    public static final CanceledFrom MORE_OPTIONS_BUTTON = new CanceledFrom("MORE_OPTIONS_BUTTON", 5);

    private static final /* synthetic */ CanceledFrom[] $values() {
        return new CanceledFrom[]{INTERNAL, USER, CLIENT, NEGATIVE_BUTTON, FALLBACK_OPTION, MORE_OPTIONS_BUTTON};
    }

    static {
        CanceledFrom[] canceledFromArr$values = $values();
        $VALUES = canceledFromArr$values;
        $ENTRIES = b.a(canceledFromArr$values);
    }

    private CanceledFrom(String str, int i2) {
    }

    public static a<CanceledFrom> getEntries() {
        return $ENTRIES;
    }

    public static CanceledFrom valueOf(String str) {
        return (CanceledFrom) Enum.valueOf(CanceledFrom.class, str);
    }

    public static CanceledFrom[] values() {
        return (CanceledFrom[]) $VALUES.clone();
    }

    public final boolean isNotUserInitiated() {
        return this == INTERNAL || this == CLIENT;
    }
}
