package androidx.camera.camera2.pipe;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class AudioRestrictionMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AUDIO_RESTRICTION_NONE = 0;
    private static final int AUDIO_RESTRICTION_VIBRATION = 1;
    private static final int AUDIO_RESTRICTION_VIBRATION_SOUND = 3;

    private /* synthetic */ AudioRestrictionMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AudioRestrictionMode m330boximpl(int i2) {
        return new AudioRestrictionMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m332equalsimpl(int i2, Object obj) {
        return (obj instanceof AudioRestrictionMode) && i2 == ((AudioRestrictionMode) obj).m336unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m333equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m335toStringimpl(int i2) {
        return a.a(i2, "AudioRestrictionMode(value=", ")");
    }

    public boolean equals(Object obj) {
        return m332equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m335toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m336unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAUDIO_RESTRICTION_NONE-_b5Q8KE, reason: not valid java name */
        public final int m337getAUDIO_RESTRICTION_NONE_b5Q8KE() {
            return AudioRestrictionMode.AUDIO_RESTRICTION_NONE;
        }

        /* renamed from: getAUDIO_RESTRICTION_VIBRATION-_b5Q8KE, reason: not valid java name */
        public final int m338getAUDIO_RESTRICTION_VIBRATION_b5Q8KE() {
            return AudioRestrictionMode.AUDIO_RESTRICTION_VIBRATION;
        }

        /* renamed from: getAUDIO_RESTRICTION_VIBRATION_SOUND-_b5Q8KE, reason: not valid java name */
        public final int m339getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE() {
            return AudioRestrictionMode.AUDIO_RESTRICTION_VIBRATION_SOUND;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m331constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m334hashCodeimpl(int i2) {
        return i2;
    }
}
