package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
public final class lqi {
    public final lok a;
    public final AaPlaybackState b;
    public final lmd c;
    public final ogz d;

    public lqi(lok lokVar, AaPlaybackState aaPlaybackState, lmd lmdVar, ogz ogzVar) {
        this.a = lokVar;
        this.b = aaPlaybackState;
        this.c = lmdVar;
        this.d = ogzVar;
    }

    public final boolean equals(Object obj) {
        AaPlaybackState aaPlaybackState;
        lmd lmdVar;
        ogz ogzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqi) {
            lqi lqiVar = (lqi) obj;
            if (this.a.equals(lqiVar.a) && ((aaPlaybackState = this.b) != null ? aaPlaybackState.equals(lqiVar.b) : lqiVar.b == null) && ((lmdVar = this.c) != null ? lmdVar.equals(lqiVar.c) : lqiVar.c == null) && ((ogzVar = this.d) != null ? ogzVar.equals(lqiVar.d) : lqiVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        AaPlaybackState aaPlaybackState = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (aaPlaybackState == null ? 0 : aaPlaybackState.hashCode())) * 1000003;
        lmd lmdVar = this.c;
        int iHashCode3 = (iHashCode2 ^ (lmdVar == null ? 0 : lmdVar.hashCode())) * 1000003;
        ogz ogzVar = this.d;
        return iHashCode3 ^ (ogzVar != null ? ogzVar.hashCode() : 0);
    }

    public final String toString() {
        ogz ogzVar = this.d;
        lmd lmdVar = this.c;
        AaPlaybackState aaPlaybackState = this.b;
        return "MediaConnectionInfo{connectionStatus=" + this.a.toString() + ", playbackState=" + String.valueOf(aaPlaybackState) + ", metadata=" + String.valueOf(lmdVar) + ", transportControlsProvider=" + String.valueOf(ogzVar) + "}";
    }

    public lqi() {
        throw null;
    }
}
