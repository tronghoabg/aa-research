package defpackage;

import android.content.Context;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ohy extends ebj {
    public final Context a;
    public final Executor b;
    public final jri c;
    public final mkf d;
    public final Optional e;

    public ohy(Context context, Executor executor, jri jriVar, mkf mkfVar, Optional optional) {
        this.a = context;
        this.b = executor;
        this.c = jriVar;
        this.d = mkfVar;
        this.e = optional;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ohy) {
            ohy ohyVar = (ohy) obj;
            if (Objects.equals(this.a, ohyVar.a) && Objects.equals(this.b, ohyVar.b) && Objects.equals(this.c, ohyVar.c) && Objects.equals(this.d, ohyVar.d) && Objects.equals(this.e, ohyVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c, this.d, this.e};
        String[] strArrSplit = "context;backgroundExecutor;androidAutoUiMode;sharedServiceConnectionFactory;carSensorReader".split(";");
        StringBuilder sb = new StringBuilder("ohy[");
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
