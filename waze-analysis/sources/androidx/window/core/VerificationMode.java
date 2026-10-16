package androidx.window.core;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class VerificationMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VerificationMode[] $VALUES;
    public static final VerificationMode STRICT = new VerificationMode("STRICT", 0);
    public static final VerificationMode LOG = new VerificationMode("LOG", 1);
    public static final VerificationMode QUIET = new VerificationMode("QUIET", 2);

    private static final /* synthetic */ VerificationMode[] $values() {
        return new VerificationMode[]{STRICT, LOG, QUIET};
    }

    static {
        VerificationMode[] verificationModeArr$values = $values();
        $VALUES = verificationModeArr$values;
        $ENTRIES = b.a(verificationModeArr$values);
    }

    private VerificationMode(String str, int i2) {
    }

    public static a<VerificationMode> getEntries() {
        return $ENTRIES;
    }

    public static VerificationMode valueOf(String str) {
        return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) $VALUES.clone();
    }
}
