package androidx.camera.viewfinder.core;

import h.d.a;
import h.d.b;
import h.g.b.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImplementationMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ImplementationMode[] $VALUES;
    public static final Companion Companion;
    private final int id;
    public static final ImplementationMode EXTERNAL = new ImplementationMode("EXTERNAL", 0, 0);
    public static final ImplementationMode EMBEDDED = new ImplementationMode("EMBEDDED", 1, 1);

    private static final /* synthetic */ ImplementationMode[] $values() {
        return new ImplementationMode[]{EXTERNAL, EMBEDDED};
    }

    static {
        ImplementationMode[] implementationModeArr$values = $values();
        $VALUES = implementationModeArr$values;
        $ENTRIES = b.a(implementationModeArr$values);
        Companion = new Companion(null);
    }

    private ImplementationMode(String str, int i2, int i3) {
        this.id = i3;
    }

    public static final ImplementationMode fromId(int i2) {
        return Companion.fromId(i2);
    }

    public static a<ImplementationMode> getEntries() {
        return $ENTRIES;
    }

    public static ImplementationMode valueOf(String str) {
        return (ImplementationMode) Enum.valueOf(ImplementationMode.class, str);
    }

    public static ImplementationMode[] values() {
        return (ImplementationMode[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ImplementationMode fromId(int i2) {
            for (ImplementationMode implementationMode : ImplementationMode.values()) {
                if (implementationMode.id == i2) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
