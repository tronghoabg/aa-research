package defpackage;

import android.os.Bundle;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
public final class lpf {
    public final String a;
    public final AaPlaybackState b;
    public final lmd c;
    public final boolean d;
    public final Bundle e;
    public final llu f;

    public lpf(String str, AaPlaybackState aaPlaybackState, lmd lmdVar, boolean z, Bundle bundle, llu lluVar) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = aaPlaybackState;
        this.c = lmdVar;
        this.d = z;
        if (bundle == null) {
            throw new NullPointerException("Null extras");
        }
        this.e = bundle;
        this.f = lluVar;
    }

    public final boolean equals(Object obj) {
        AaPlaybackState aaPlaybackState;
        lmd lmdVar;
        llu lluVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lpf) {
            lpf lpfVar = (lpf) obj;
            if (this.a.equals(lpfVar.a) && ((aaPlaybackState = this.b) != null ? aaPlaybackState.equals(lpfVar.b) : lpfVar.b == null) && ((lmdVar = this.c) != null ? lmdVar.equals(lpfVar.c) : lpfVar.c == null) && this.d == lpfVar.d && this.e.equals(lpfVar.e) && ((lluVar = this.f) != null ? lluVar.equals(lpfVar.f) : lpfVar.f == null)) {
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
        int iHashCode3 = (((((iHashCode2 ^ (lmdVar == null ? 0 : lmdVar.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003;
        llu lluVar = this.f;
        return iHashCode3 ^ (lluVar != null ? lluVar.hashCode() : 0);
    }

    public final String toString() {
        llu lluVar = this.f;
        Bundle bundle = this.e;
        lmd lmdVar = this.c;
        return "MediaSessionState{packageName=" + this.a + ", playbackState=" + String.valueOf(this.b) + ", metadata=" + String.valueOf(lmdVar) + ", isRemote=" + this.d + ", extras=" + bundle.toString() + ", sessionToken=" + String.valueOf(lluVar) + "}";
    }

    public lpf() {
        throw null;
    }
}
