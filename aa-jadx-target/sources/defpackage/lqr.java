package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lqr {
    public final com.google.android.apps.auto.components.media.compat.AaPlaybackState a;
    public final boolean b;
    public final int c;

    public lqr(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, boolean z, int i) {
        this.a = aaPlaybackState;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lqr) {
            defpackage.lqr lqrVar = (defpackage.lqr) obj;
            com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = this.a;
            if (aaPlaybackState != null ? aaPlaybackState.equals(lqrVar.a) : lqrVar.a == null) {
                if (this.b == lqrVar.b && this.c == lqrVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = this.a;
        int iHashCode = aaPlaybackState == null ? 0 : aaPlaybackState.hashCode();
        return this.c ^ ((((iHashCode ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
    }

    public final java.lang.String toString() {
        return "PersistenceSignal{playbackState=" + java.lang.String.valueOf(this.a) + ", hasActiveCall=" + this.b + ", demandSpaceState=" + this.c + "}";
    }

    public lqr() {
        throw null;
    }
}
