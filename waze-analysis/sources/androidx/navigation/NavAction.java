package androidx.navigation;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NavAction {
    private Bundle defaultArguments;
    private final int destinationId;
    private NavOptions navOptions;

    public /* synthetic */ NavAction(int i2, NavOptions navOptions, Bundle bundle, int i3, o oVar) {
        this(i2, (i3 & 2) != 0 ? null : navOptions, (i3 & 4) != 0 ? null : bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavAction)) {
            return false;
        }
        NavAction navAction = (NavAction) obj;
        if (this.destinationId != navAction.destinationId || !x.n(this.navOptions, navAction.navOptions)) {
            return false;
        }
        Bundle bundle = this.defaultArguments;
        Bundle bundle2 = navAction.defaultArguments;
        if (x.n(bundle, bundle2)) {
            return true;
        }
        if (bundle != null && bundle2 != null) {
            SavedStateReader.m13269constructorimpl(bundle);
            if (SavedStateReader.m13271contentDeepEqualsimpl(bundle, bundle2)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        NavOptions navOptions = this.navOptions;
        int iHashCode = navOptions != null ? navOptions.hashCode() : 0;
        int i2 = this.destinationId;
        Bundle bundle = this.defaultArguments;
        int i3 = (i2 * 31) + iHashCode;
        if (bundle == null) {
            return i3;
        }
        SavedStateReader.m13269constructorimpl(bundle);
        return (i3 * 31) + SavedStateReader.m13272contentDeepHashCodeimpl(bundle);
    }

    public final void setDefaultArguments(Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public final void setNavOptions(NavOptions navOptions) {
        this.navOptions = navOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.destinationId));
        sb.append(")");
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    public NavAction(int i2, NavOptions navOptions) {
        this(i2, navOptions, null, 4, null);
    }

    public NavAction(int i2, NavOptions navOptions, Bundle bundle) {
        this.destinationId = i2;
        this.navOptions = navOptions;
        this.defaultArguments = bundle;
    }

    public NavAction(int i2) {
        this(i2, null, null, 6, null);
    }
}
