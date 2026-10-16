package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lqo {
    public final defpackage.lor a;
    public final com.google.android.apps.auto.components.media.compat.AaPlaybackState b;
    public final defpackage.lmk c;
    public final defpackage.ohy d;

    public lqo(defpackage.lor lorVar, com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, defpackage.lmk lmkVar, defpackage.ohy ohyVar) {
        this.a = lorVar;
        this.b = aaPlaybackState;
        this.c = lmkVar;
        this.d = ohyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState;
        defpackage.lmk lmkVar;
        defpackage.ohy ohyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lqo) {
            defpackage.lqo lqoVar = (defpackage.lqo) obj;
            if (this.a.equals(lqoVar.a) && ((aaPlaybackState = this.b) != null ? aaPlaybackState.equals(lqoVar.b) : lqoVar.b == null) && ((lmkVar = this.c) != null ? lmkVar.equals(lqoVar.c) : lqoVar.c == null) && ((ohyVar = this.d) != null ? ohyVar.equals(lqoVar.d) : lqoVar.d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (aaPlaybackState == null ? 0 : aaPlaybackState.hashCode())) * 1000003;
        defpackage.lmk lmkVar = this.c;
        int iHashCode3 = (iHashCode2 ^ (lmkVar == null ? 0 : lmkVar.hashCode())) * 1000003;
        defpackage.ohy ohyVar = this.d;
        return iHashCode3 ^ (ohyVar != null ? ohyVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        defpackage.ohy ohyVar = this.d;
        defpackage.lmk lmkVar = this.c;
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = this.b;
        return "MediaConnectionInfo{connectionStatus=" + this.a.toString() + ", playbackState=" + java.lang.String.valueOf(aaPlaybackState) + ", metadata=" + java.lang.String.valueOf(lmkVar) + ", transportControlsProvider=" + java.lang.String.valueOf(ohyVar) + "}";
    }

    public lqo() {
        throw null;
    }
}
