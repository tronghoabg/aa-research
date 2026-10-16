package androidx.camera.core.impl;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class QuirkSettings {
    private final boolean mEnabledWhenDeviceHasQuirk;
    private final Set<Class<? extends Quirk>> mForceDisabledQuirks;
    private final Set<Class<? extends Quirk>> mForceEnabledQuirks;

    /* compiled from: WazeSource */
    public class Builder {
        private boolean mEnabledWhenDeviceHasQuirk = true;
        private Set<Class<? extends Quirk>> mForceDisabledQuirks;
        private Set<Class<? extends Quirk>> mForceEnabledQuirks;

        public QuirkSettings build() {
            return new QuirkSettings(this.mEnabledWhenDeviceHasQuirk, this.mForceEnabledQuirks, this.mForceDisabledQuirks);
        }

        public Builder forceDisableQuirks(Set<Class<? extends Quirk>> set) {
            this.mForceDisabledQuirks = new HashSet(set);
            return this;
        }

        public Builder forceEnableQuirks(Set<Class<? extends Quirk>> set) {
            this.mForceEnabledQuirks = new HashSet(set);
            return this;
        }

        public Builder setEnabledWhenDeviceHasQuirk(boolean z) {
            this.mEnabledWhenDeviceHasQuirk = z;
            return this;
        }
    }

    private QuirkSettings(boolean z, Set<Class<? extends Quirk>> set, Set<Class<? extends Quirk>> set2) {
        this.mEnabledWhenDeviceHasQuirk = z;
        this.mForceEnabledQuirks = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.mForceDisabledQuirks = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }

    public static QuirkSettings withAllQuirksDisabled() {
        Builder builder = new Builder();
        builder.setEnabledWhenDeviceHasQuirk(false);
        return builder.build();
    }

    public static QuirkSettings withDefaultBehavior() {
        Builder builder = new Builder();
        builder.setEnabledWhenDeviceHasQuirk(true);
        return builder.build();
    }

    public static QuirkSettings withQuirksForceDisabled(Set<Class<? extends Quirk>> set) {
        Builder builder = new Builder();
        builder.forceDisableQuirks(set);
        return builder.build();
    }

    public static QuirkSettings withQuirksForceEnabled(Set<Class<? extends Quirk>> set) {
        Builder builder = new Builder();
        builder.forceEnableQuirks(set);
        return builder.build();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof QuirkSettings)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        QuirkSettings quirkSettings = (QuirkSettings) obj;
        return this.mEnabledWhenDeviceHasQuirk == quirkSettings.mEnabledWhenDeviceHasQuirk && Objects.equals(this.mForceEnabledQuirks, quirkSettings.mForceEnabledQuirks) && Objects.equals(this.mForceDisabledQuirks, quirkSettings.mForceDisabledQuirks);
    }

    public Set<Class<? extends Quirk>> getForceDisabledQuirks() {
        return DesugarCollections.unmodifiableSet(this.mForceDisabledQuirks);
    }

    public Set<Class<? extends Quirk>> getForceEnabledQuirks() {
        return DesugarCollections.unmodifiableSet(this.mForceEnabledQuirks);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mEnabledWhenDeviceHasQuirk), this.mForceEnabledQuirks, this.mForceDisabledQuirks);
    }

    public boolean isEnabledWhenDeviceHasQuirk() {
        return this.mEnabledWhenDeviceHasQuirk;
    }

    public boolean shouldEnableQuirk(Class<? extends Quirk> cls, boolean z) {
        if (this.mForceEnabledQuirks.contains(cls)) {
            return true;
        }
        return !this.mForceDisabledQuirks.contains(cls) && this.mEnabledWhenDeviceHasQuirk && z;
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.mEnabledWhenDeviceHasQuirk + ", forceEnabledQuirks=" + this.mForceEnabledQuirks + ", forceDisabledQuirks=" + this.mForceDisabledQuirks + '}';
    }
}
