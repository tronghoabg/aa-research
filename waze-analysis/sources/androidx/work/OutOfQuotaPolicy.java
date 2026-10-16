package androidx.work;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OutOfQuotaPolicy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OutOfQuotaPolicy[] $VALUES;
    public static final OutOfQuotaPolicy RUN_AS_NON_EXPEDITED_WORK_REQUEST = new OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
    public static final OutOfQuotaPolicy DROP_WORK_REQUEST = new OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);

    private static final /* synthetic */ OutOfQuotaPolicy[] $values() {
        return new OutOfQuotaPolicy[]{RUN_AS_NON_EXPEDITED_WORK_REQUEST, DROP_WORK_REQUEST};
    }

    static {
        OutOfQuotaPolicy[] outOfQuotaPolicyArr$values = $values();
        $VALUES = outOfQuotaPolicyArr$values;
        $ENTRIES = b.a(outOfQuotaPolicyArr$values);
    }

    private OutOfQuotaPolicy(String str, int i2) {
    }

    public static a<OutOfQuotaPolicy> getEntries() {
        return $ENTRIES;
    }

    public static OutOfQuotaPolicy valueOf(String str) {
        return (OutOfQuotaPolicy) Enum.valueOf(OutOfQuotaPolicy.class, str);
    }

    public static OutOfQuotaPolicy[] values() {
        return (OutOfQuotaPolicy[]) $VALUES.clone();
    }
}
