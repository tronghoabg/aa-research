package androidx.camera.common.internal;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AbstractSizeEnum {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AbstractSizeEnum[] $VALUES;
    public static final AbstractSizeEnum PREVIEW = new AbstractSizeEnum("PREVIEW", 0);
    public static final AbstractSizeEnum RECORD = new AbstractSizeEnum("RECORD", 1);
    public static final AbstractSizeEnum MAXIMUM = new AbstractSizeEnum("MAXIMUM", 2);
    public static final AbstractSizeEnum MAXIMUM_4_3 = new AbstractSizeEnum("MAXIMUM_4_3", 3);
    public static final AbstractSizeEnum MAXIMUM_16_9 = new AbstractSizeEnum("MAXIMUM_16_9", 4);
    public static final AbstractSizeEnum ULTRA_MAXIMUM = new AbstractSizeEnum("ULTRA_MAXIMUM", 5);

    private static final /* synthetic */ AbstractSizeEnum[] $values() {
        return new AbstractSizeEnum[]{PREVIEW, RECORD, MAXIMUM, MAXIMUM_4_3, MAXIMUM_16_9, ULTRA_MAXIMUM};
    }

    static {
        AbstractSizeEnum[] abstractSizeEnumArr$values = $values();
        $VALUES = abstractSizeEnumArr$values;
        $ENTRIES = b.a(abstractSizeEnumArr$values);
    }

    private AbstractSizeEnum(String str, int i2) {
    }

    public static a<AbstractSizeEnum> getEntries() {
        return $ENTRIES;
    }

    public static AbstractSizeEnum valueOf(String str) {
        return (AbstractSizeEnum) Enum.valueOf(AbstractSizeEnum.class, str);
    }

    public static AbstractSizeEnum[] values() {
        return (AbstractSizeEnum[]) $VALUES.clone();
    }
}
