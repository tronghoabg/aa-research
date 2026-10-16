package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class jqy extends ebj {
    private final String a;
    private final Uri b;
    private final Bundle c;

    public jqy(String str, Uri uri, Bundle bundle) {
        this.a = str;
        this.b = uri;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jqy) {
            jqy jqyVar = (jqy) obj;
            if (Objects.equals(this.a, jqyVar.a) && Objects.equals(this.b, jqyVar.b) && Objects.equals(this.c, jqyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "action;uri;extras".split(";");
        StringBuilder sb = new StringBuilder("jqy[");
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
