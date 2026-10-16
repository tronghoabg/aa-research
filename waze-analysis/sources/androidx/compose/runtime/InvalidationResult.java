package androidx.compose.runtime;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InvalidationResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InvalidationResult[] $VALUES;
    public static final InvalidationResult IGNORED = new InvalidationResult("IGNORED", 0);
    public static final InvalidationResult SCHEDULED = new InvalidationResult("SCHEDULED", 1);
    public static final InvalidationResult DEFERRED = new InvalidationResult("DEFERRED", 2);
    public static final InvalidationResult IMMINENT = new InvalidationResult("IMMINENT", 3);

    private static final /* synthetic */ InvalidationResult[] $values() {
        return new InvalidationResult[]{IGNORED, SCHEDULED, DEFERRED, IMMINENT};
    }

    static {
        InvalidationResult[] invalidationResultArr$values = $values();
        $VALUES = invalidationResultArr$values;
        $ENTRIES = b.a(invalidationResultArr$values);
    }

    private InvalidationResult(String str, int i2) {
    }

    public static a<InvalidationResult> getEntries() {
        return $ENTRIES;
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) $VALUES.clone();
    }
}
