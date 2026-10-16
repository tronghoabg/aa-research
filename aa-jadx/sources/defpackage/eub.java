package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eub {
    private final java.lang.String a;
    private final int b;
    private final int c;

    public eub(java.lang.String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        new android.media.session.MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.eub)) {
            return false;
        }
        defpackage.eub eubVar = (defpackage.eub) obj;
        int i2 = this.b;
        if (i2 < 0 || (i = eubVar.b) < 0) {
            return android.text.TextUtils.equals(this.a, eubVar.a) && this.c == eubVar.c;
        }
        return android.text.TextUtils.equals(this.a, eubVar.a) && i2 == i && this.c == eubVar.c;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, java.lang.Integer.valueOf(this.c));
    }
}
