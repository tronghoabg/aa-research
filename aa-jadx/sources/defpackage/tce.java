package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tce {
    public final android.os.Bundle a;
    public final java.lang.String b;
    public final java.lang.String c;

    public tce(android.os.Bundle bundle, java.lang.String str) {
        this.a = bundle;
        this.b = str;
        this.c = com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.NOW_PACKAGE;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tce) {
            defpackage.tce tceVar = (defpackage.tce) obj;
            if (this.a.equals(tceVar.a) && ((str = this.b) != null ? str.equals(tceVar.b) : tceVar.b == null) && this.c.equals(tceVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 583896283;
        java.lang.String str = this.b;
        return this.c.hashCode() ^ (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public final java.lang.String toString() {
        return "AssistantSettingsIntent{feature=null, activityClassPath=null, featureArguments=" + java.lang.String.valueOf(this.a) + ", accountName=" + this.b + ", gsaPackageName=" + this.c + "}";
    }

    public tce() {
        throw null;
    }
}
