package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final class lqm {
    public final AaPlaybackState a;
    public final boolean b;
    public final int c;

    public lqm(AaPlaybackState aaPlaybackState, boolean z, int i) {
        this.a = aaPlaybackState;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqm) {
            lqm lqmVar = (lqm) obj;
            AaPlaybackState aaPlaybackState = this.a;
            if (aaPlaybackState != null ? aaPlaybackState.equals(lqmVar.a) : lqmVar.a == null) {
                if (this.b == lqmVar.b && this.c == lqmVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        AaPlaybackState aaPlaybackState = this.a;
        int iHashCode = aaPlaybackState == null ? 0 : aaPlaybackState.hashCode();
        return this.c ^ ((((iHashCode ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "PersistenceSignal{playbackState=" + String.valueOf(this.a) + ", hasActiveCall=" + this.b + ", demandSpaceState=" + this.c + "}";
    }

    public lqm() {
        throw null;
    }
}
