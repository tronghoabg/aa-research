package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lrk {
    public final android.content.ComponentName a;
    public final defpackage.lor b;
    public final com.google.android.apps.auto.components.media.compat.AaPlaybackState c;
    public final boolean d;

    public lrk(android.content.ComponentName componentName, defpackage.lor lorVar, com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, boolean z) {
        this.a = componentName;
        if (lorVar == null) {
            throw new java.lang.NullPointerException("Null connectionStatus");
        }
        this.b = lorVar;
        this.c = aaPlaybackState;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lrk) {
            defpackage.lrk lrkVar = (defpackage.lrk) obj;
            android.content.ComponentName componentName = this.a;
            if (componentName != null ? componentName.equals(lrkVar.a) : lrkVar.a == null) {
                if (this.b.equals(lrkVar.b) && ((aaPlaybackState = this.c) != null ? aaPlaybackState.equals(lrkVar.c) : lrkVar.c == null) && this.d == lrkVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.content.ComponentName componentName = this.a;
        int iHashCode = (((componentName == null ? 0 : componentName.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = this.c;
        return (true != this.d ? 1237 : 1231) ^ (((iHashCode * 1000003) ^ (aaPlaybackState != null ? aaPlaybackState.hashCode() : 0)) * 1000003);
    }

    public final java.lang.String toString() {
        com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = this.c;
        defpackage.lor lorVar = this.b;
        return "AppConnectionAndPlaybackState{appName=" + java.lang.String.valueOf(this.a) + ", connectionStatus=" + lorVar.toString() + ", playbackState=" + java.lang.String.valueOf(aaPlaybackState) + ", isRemote=" + this.d + "}";
    }

    public lrk() {
        throw null;
    }
}
