package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
public final class lrn {
    public final lod a;
    public final AaPlaybackState b;
    public final lmd c;

    public lrn(lod lodVar, AaPlaybackState aaPlaybackState, lmd lmdVar) {
        if (lodVar == null) {
            throw new NullPointerException("Null activeMediaControllerConnection");
        }
        this.a = lodVar;
        this.b = aaPlaybackState;
        this.c = lmdVar;
    }

    public final boolean equals(Object obj) {
        AaPlaybackState aaPlaybackState;
        lmd lmdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrn) {
            lrn lrnVar = (lrn) obj;
            if (this.a.equals(lrnVar.a) && ((aaPlaybackState = this.b) != null ? aaPlaybackState.equals(lrnVar.b) : lrnVar.b == null) && ((lmdVar = this.c) != null ? lmdVar.equals(lrnVar.c) : lrnVar.c == null)) {
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
        return iHashCode2 ^ (lmdVar != null ? lmdVar.hashCode() : 0);
    }

    public final String toString() {
        lmd lmdVar = this.c;
        AaPlaybackState aaPlaybackState = this.b;
        return "ActiveConnectionPlaybackStateAndMetadata{activeMediaControllerConnection=" + this.a.toString() + ", playbackState=" + String.valueOf(aaPlaybackState) + ", metadata=" + String.valueOf(lmdVar) + "}";
    }

    public lrn() {
        throw null;
    }
}
