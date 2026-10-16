package androidx.work;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class BackoffPolicy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BackoffPolicy[] $VALUES;
    public static final BackoffPolicy EXPONENTIAL = new BackoffPolicy("EXPONENTIAL", 0);
    public static final BackoffPolicy LINEAR = new BackoffPolicy("LINEAR", 1);

    private static final /* synthetic */ BackoffPolicy[] $values() {
        return new BackoffPolicy[]{EXPONENTIAL, LINEAR};
    }

    static {
        BackoffPolicy[] backoffPolicyArr$values = $values();
        $VALUES = backoffPolicyArr$values;
        $ENTRIES = b.a(backoffPolicyArr$values);
    }

    private BackoffPolicy(String str, int i2) {
    }

    public static a<BackoffPolicy> getEntries() {
        return $ENTRIES;
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) $VALUES.clone();
    }
}
