package androidx.work;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ExistingPeriodicWorkPolicy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ExistingPeriodicWorkPolicy[] $VALUES;
    public static final ExistingPeriodicWorkPolicy REPLACE = new ExistingPeriodicWorkPolicy("REPLACE", 0);
    public static final ExistingPeriodicWorkPolicy KEEP = new ExistingPeriodicWorkPolicy("KEEP", 1);
    public static final ExistingPeriodicWorkPolicy UPDATE = new ExistingPeriodicWorkPolicy("UPDATE", 2);
    public static final ExistingPeriodicWorkPolicy CANCEL_AND_REENQUEUE = new ExistingPeriodicWorkPolicy("CANCEL_AND_REENQUEUE", 3);

    private static final /* synthetic */ ExistingPeriodicWorkPolicy[] $values() {
        return new ExistingPeriodicWorkPolicy[]{REPLACE, KEEP, UPDATE, CANCEL_AND_REENQUEUE};
    }

    static {
        ExistingPeriodicWorkPolicy[] existingPeriodicWorkPolicyArr$values = $values();
        $VALUES = existingPeriodicWorkPolicyArr$values;
        $ENTRIES = b.a(existingPeriodicWorkPolicyArr$values);
    }

    private ExistingPeriodicWorkPolicy(String str, int i2) {
    }

    public static a<ExistingPeriodicWorkPolicy> getEntries() {
        return $ENTRIES;
    }

    public static ExistingPeriodicWorkPolicy valueOf(String str) {
        return (ExistingPeriodicWorkPolicy) Enum.valueOf(ExistingPeriodicWorkPolicy.class, str);
    }

    public static ExistingPeriodicWorkPolicy[] values() {
        return (ExistingPeriodicWorkPolicy[]) $VALUES.clone();
    }
}
