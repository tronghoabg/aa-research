package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class etv {
    private final String a;
    private final int b;
    private final int c;

    public etv(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etv)) {
            return false;
        }
        etv etvVar = (etv) obj;
        int i2 = this.b;
        return (i2 < 0 || (i = etvVar.b) < 0) ? TextUtils.equals(this.a, etvVar.a) && this.c == etvVar.c : TextUtils.equals(this.a, etvVar.a) && i2 == i && this.c == etvVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
