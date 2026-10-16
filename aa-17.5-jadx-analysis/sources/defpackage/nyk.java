package defpackage;

import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class nyk {
    public final nyj a;
    public final Intent b;
    public final qpi c;

    public nyk(Intent intent, qpi qpiVar, nyj nyjVar) {
        this.a = nyjVar;
        this.b = intent;
        this.c = qpiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyk)) {
            return false;
        }
        nyk nykVar = (nyk) obj;
        return Objects.equals(this.a, nykVar.a) && Objects.equals(this.b, nykVar.b) && Objects.equals(this.c, nykVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        xxg xxgVar = new xxg("AppProviderFilterQuery");
        xxgVar.b("filters", this.a);
        xxgVar.b("queryIntent", this.b);
        xxgVar.b("applicationType", this.c);
        return xxgVar.toString();
    }
}
