package androidx.navigation;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NavArgument {
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isDefaultValueUnknown;
    private final boolean isNullable;
    private final NavType<Object> type;

    /* compiled from: WazeSource */
    public final class Builder {
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;
        private NavType<Object> type;
        private boolean unknownDefaultValuePresent;

        public final NavArgument build() {
            NavType<Object> navTypeInferFromValueType = this.type;
            if (navTypeInferFromValueType == null) {
                navTypeInferFromValueType = NavType.Companion.inferFromValueType(this.defaultValue);
                x.d(navTypeInferFromValueType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new NavArgument(navTypeInferFromValueType, this.isNullable, this.defaultValue, this.defaultValuePresent, this.unknownDefaultValuePresent);
        }

        public final Builder setDefaultValue(Object obj) {
            this.defaultValue = obj;
            this.defaultValuePresent = true;
            return this;
        }

        public final Builder setIsNullable(boolean z) {
            this.isNullable = z;
            return this;
        }

        public final <T> Builder setType(NavType<T> navType) {
            x.f(navType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            this.type = navType;
            return this;
        }

        public final Builder setUnknownDefaultValuePresent$navigation_common(boolean z) {
            this.unknownDefaultValuePresent = z;
            return this;
        }
    }

    public NavArgument(NavType<Object> navType, boolean z, Object obj, boolean z2, boolean z3) {
        x.f(navType, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (!navType.isNullableAllowed() && z) {
            throw new IllegalArgumentException(String.valueOf(navType.getName()).concat(" does not allow nullable values"));
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException("Argument with type " + navType.getName() + " has null value but is not nullable.");
        }
        this.type = navType;
        this.isNullable = z;
        this.defaultValue = obj;
        boolean z4 = true;
        if (!z2 && !z3) {
            z4 = false;
        }
        this.isDefaultValuePresent = z4;
        this.isDefaultValueUnknown = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !x.n(this.type, navArgument.type)) {
            return false;
        }
        Object obj2 = this.defaultValue;
        return obj2 != null ? x.n(obj2, navArgument.defaultValue) : navArgument.defaultValue == null;
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final NavType<Object> getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Object obj = this.defaultValue;
        return ((((iHashCode + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    public final boolean isDefaultValueUnknown$navigation_common() {
        return this.isDefaultValueUnknown;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    public final void putDefaultValue(String str, Bundle bundle) {
        Object obj;
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(bundle, "bundle");
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.put(bundle, str, obj);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = ar.f48106a;
        sb.append(new m(getClass()).c());
        NavType<Object> navType = this.type;
        Objects.toString(navType);
        sb.append(" Type: ".concat(String.valueOf(navType)));
        sb.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            Object obj = this.defaultValue;
            Objects.toString(obj);
            sb.append(" DefaultValue: ".concat(String.valueOf(obj)));
        }
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    public final boolean verify(String str, Bundle bundle) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(bundle, "bundle");
        if (!this.isNullable) {
            SavedStateReader.m13269constructorimpl(bundle);
            if (SavedStateReader.m13270containsimpl(bundle, str) && SavedStateReader.m13348isNullimpl(bundle, str)) {
                return false;
            }
        }
        try {
            this.type.get(bundle, str);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
