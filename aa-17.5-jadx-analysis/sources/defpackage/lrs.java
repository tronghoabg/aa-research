package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
public final class lrs {
    public final ComponentName a;
    public final AaPlaybackState b;

    public lrs(ComponentName componentName, AaPlaybackState aaPlaybackState) {
        if (componentName == null) {
            throw new NullPointerException("Null componentName");
        }
        this.a = componentName;
        if (aaPlaybackState == null) {
            throw new NullPointerException("Null playbackState");
        }
        this.b = aaPlaybackState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrs) {
            lrs lrsVar = (lrs) obj;
            if (this.a.equals(lrsVar.a) && this.b.equals(lrsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        AaPlaybackState aaPlaybackState = this.b;
        return "ComponentNameAndPlaybackStatePair{componentName=" + this.a.toString() + ", playbackState=" + aaPlaybackState.toString() + "}";
    }

    public lrs() {
        throw null;
    }
}
