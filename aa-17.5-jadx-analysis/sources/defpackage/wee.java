package defpackage;

import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class wee extends ebj {
    public final Intent a;
    private final ygr b;

    public wee(Intent intent, ygr ygrVar) {
        this.a = intent;
        this.b = ygrVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wee) {
            wee weeVar = (wee) obj;
            if (Objects.equals(this.a, weeVar.a) && Objects.equals(this.b, weeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a.V(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "intent;removedExtras".split(";");
        StringBuilder sb = new StringBuilder("wee[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
