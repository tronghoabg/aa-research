package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class adkh {
    public final String a;
    public final adkg b;
    public final long c;
    public final adkt d;
    public final adkt e;

    public adkh(String str, adkg adkgVar, long j, adkt adktVar) {
        this.a = str;
        adkgVar.getClass();
        this.b = adkgVar;
        this.c = j;
        this.d = null;
        this.e = adktVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adkh) {
            adkh adkhVar = (adkh) obj;
            if (Objects.equals(this.a, adkhVar.a) && Objects.equals(this.b, adkhVar.b) && this.c == adkhVar.c) {
                adkt adktVar = adkhVar.d;
                if (Objects.equals(null, null) && Objects.equals(this.e, adkhVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), null, this.e);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("description", this.a);
        xxgVarAo.b("severity", this.b);
        xxgVarAo.g("timestampNanos", this.c);
        xxgVarAo.b("channelRef", null);
        xxgVarAo.b("subchannelRef", this.e);
        return xxgVarAo.toString();
    }
}
