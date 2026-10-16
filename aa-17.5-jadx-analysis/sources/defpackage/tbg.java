package defpackage;

import android.os.Bundle;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes3.dex */
public final class tbg {
    public final Bundle a;
    public final String b;
    public final String c;

    public tbg(Bundle bundle, String str) {
        this.a = bundle;
        this.b = str;
        this.c = RemoteApiConstants.NOW_PACKAGE;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tbg) {
            tbg tbgVar = (tbg) obj;
            if (this.a.equals(tbgVar.a) && ((str = this.b) != null ? str.equals(tbgVar.b) : tbgVar.b == null) && this.c.equals(tbgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 583896283;
        String str = this.b;
        return this.c.hashCode() ^ (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public final String toString() {
        return "AssistantSettingsIntent{feature=null, activityClassPath=null, featureArguments=" + String.valueOf(this.a) + ", accountName=" + this.b + ", gsaPackageName=" + this.c + "}";
    }

    public tbg() {
        throw null;
    }
}
