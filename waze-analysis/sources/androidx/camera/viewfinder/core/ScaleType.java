package androidx.camera.viewfinder.core;

import androidx.camera.viewfinder.core.impl.Alignment;
import androidx.camera.viewfinder.core.impl.ContentScale;
import h.d.a;
import h.d.b;
import h.g.b.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScaleType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ScaleType[] $VALUES;
    public static final Companion Companion;
    private final Alignment alignment;
    private final ContentScale contentScale;
    private final int id;
    public static final ScaleType FILL_START = new ScaleType("FILL_START", 0, 0, ScaleTypeKt.Fill, ScaleTypeKt.Start);
    public static final ScaleType FILL_CENTER = new ScaleType("FILL_CENTER", 1, 1, ScaleTypeKt.Fill, ScaleTypeKt.Center);
    public static final ScaleType FILL_END = new ScaleType("FILL_END", 2, 2, ScaleTypeKt.Fill, ScaleTypeKt.End);
    public static final ScaleType FIT_START = new ScaleType("FIT_START", 3, 3, ScaleTypeKt.Fit, ScaleTypeKt.Start);
    public static final ScaleType FIT_CENTER = new ScaleType("FIT_CENTER", 4, 4, ScaleTypeKt.Fit, ScaleTypeKt.Center);
    public static final ScaleType FIT_END = new ScaleType("FIT_END", 5, 5, ScaleTypeKt.Fit, ScaleTypeKt.End);

    private static final /* synthetic */ ScaleType[] $values() {
        return new ScaleType[]{FILL_START, FILL_CENTER, FILL_END, FIT_START, FIT_CENTER, FIT_END};
    }

    static {
        ScaleType[] scaleTypeArr$values = $values();
        $VALUES = scaleTypeArr$values;
        $ENTRIES = b.a(scaleTypeArr$values);
        Companion = new Companion(null);
    }

    private ScaleType(String str, int i2, int i3, ContentScale contentScale, Alignment alignment) {
        this.id = i3;
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public static final ScaleType fromId(int i2) {
        return Companion.fromId(i2);
    }

    public static a<ScaleType> getEntries() {
        return $ENTRIES;
    }

    public static ScaleType valueOf(String str) {
        return (ScaleType) Enum.valueOf(ScaleType.class, str);
    }

    public static ScaleType[] values() {
        return (ScaleType[]) $VALUES.clone();
    }

    public final Alignment getAlignment$viewfinder_core() {
        return this.alignment;
    }

    public final ContentScale getContentScale$viewfinder_core() {
        return this.contentScale;
    }

    public final int getId() {
        return this.id;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ScaleType fromId(int i2) {
            for (ScaleType scaleType : ScaleType.values()) {
                if (scaleType.getId() == i2) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
