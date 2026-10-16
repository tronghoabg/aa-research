package androidx.savedstate.serialization;

import h.g.b.o;
import h.g.b.x;
import kotlinx.b.e.e;
import kotlinx.b.e.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateConfiguration {
    public static final Companion Companion = new Companion(null);
    public static final SavedStateConfiguration DEFAULT = new SavedStateConfiguration(null, 0, false, 7, null);
    private final int classDiscriminatorMode;
    private final boolean encodeDefaults;
    private final e serializersModule;

    /* compiled from: WazeSource */
    public final class Builder {
        private int classDiscriminatorMode;
        private boolean encodeDefaults;
        private e serializersModule;

        public Builder(SavedStateConfiguration savedStateConfiguration) {
            x.f(savedStateConfiguration, "configuration");
            this.serializersModule = savedStateConfiguration.getSerializersModule();
            this.encodeDefaults = savedStateConfiguration.getEncodeDefaults();
            this.classDiscriminatorMode = savedStateConfiguration.getClassDiscriminatorMode();
        }

        public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
        }

        public static /* synthetic */ void getEncodeDefaults$annotations() {
        }

        public final SavedStateConfiguration build$savedstate() {
            return new SavedStateConfiguration(i.b(SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE, this.serializersModule), this.classDiscriminatorMode, this.encodeDefaults, null);
        }

        public final int getClassDiscriminatorMode() {
            return this.classDiscriminatorMode;
        }

        public final boolean getEncodeDefaults() {
            return this.encodeDefaults;
        }

        public final e getSerializersModule() {
            return this.serializersModule;
        }

        public final void setClassDiscriminatorMode(int i2) {
            this.classDiscriminatorMode = i2;
        }

        public final void setEncodeDefaults(boolean z) {
            this.encodeDefaults = z;
        }

        public final void setSerializersModule(e eVar) {
            x.f(eVar, "<set-?>");
            this.serializersModule = eVar;
        }
    }

    /* synthetic */ SavedStateConfiguration(e eVar, int i2, boolean z, int i3, o oVar) {
        this((i3 & 1) != 0 ? SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE : eVar, (i3 & 2) != 0 ? 2 : i2, z & ((i3 & 4) == 0));
    }

    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final e getSerializersModule() {
        return this.serializersModule;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ SavedStateConfiguration(e eVar, int i2, boolean z, o oVar) {
        this(eVar, i2, z);
    }

    private SavedStateConfiguration(e eVar, int i2, boolean z) {
        this.serializersModule = eVar;
        this.classDiscriminatorMode = i2;
        this.encodeDefaults = z;
    }
}
