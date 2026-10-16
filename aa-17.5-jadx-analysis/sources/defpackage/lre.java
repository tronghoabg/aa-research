package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final class lre {
    public final ComponentName a;
    public final lok b;
    public final AaPlaybackState c;
    public final boolean d;

    public lre(ComponentName componentName, lok lokVar, AaPlaybackState aaPlaybackState, boolean z) {
        this.a = componentName;
        if (lokVar == null) {
            throw new NullPointerException("Null connectionStatus");
        }
        this.b = lokVar;
        this.c = aaPlaybackState;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        AaPlaybackState aaPlaybackState;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lre) {
            lre lreVar = (lre) obj;
            ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(lreVar.a) : lreVar.a == null) {
                if (this.b.equals(lreVar.b) && ((aaPlaybackState = this.c) != null ? aaPlaybackState.equals(lreVar.c) : lreVar.c == null) && this.d == lreVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int iHashCode = (((componentName == null ? 0 : componentName.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        AaPlaybackState aaPlaybackState = this.c;
        return (true != this.d ? 1237 : 1231) ^ (((iHashCode * 1000003) ^ (aaPlaybackState != null ? aaPlaybackState.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        AaPlaybackState aaPlaybackState = this.c;
        lok lokVar = this.b;
        return "AppConnectionAndPlaybackState{appName=" + String.valueOf(this.a) + ", connectionStatus=" + lokVar.toString() + ", playbackState=" + String.valueOf(aaPlaybackState) + ", isRemote=" + this.d + "}";
    }

    public lre() {
        throw null;
    }
}
