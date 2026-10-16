package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class adlc {
    public static final adlc a = new adlc(null, adnq.b, false, null, null);
    public final adlf b;
    public final adnq c;
    public final boolean d;
    public final String e;
    public final String f;
    private final adqq g = null;

    private adlc(adlf adlfVar, adnq adnqVar, boolean z, String str, String str2) {
        this.b = adlfVar;
        adnqVar.getClass();
        this.c = adnqVar;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    public static adlc a(adnq adnqVar) {
        woy.O(!adnqVar.g(), "drop status shouldn't be OK");
        return new adlc(null, adnqVar, true, null, null);
    }

    public static adlc b(adnq adnqVar) {
        woy.O(!adnqVar.g(), "error status shouldn't be OK");
        return new adlc(null, adnqVar, false, null, null);
    }

    public static adlc d(String str) {
        return new adlc(null, adnq.b, false, "connecting", str);
    }

    public static adlc e(adlf adlfVar) {
        return new adlc(adlfVar, adnq.b, false, null, null);
    }

    public final boolean c() {
        return (this.b == null && this.c.g()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adlc)) {
            return false;
        }
        adlc adlcVar = (adlc) obj;
        if (Objects.equals(this.b, adlcVar.b) && Objects.equals(this.c, adlcVar.c)) {
            adqq adqqVar = adlcVar.g;
            if (Objects.equals(null, null) && this.d == adlcVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, null, Boolean.valueOf(this.d));
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("subchannel", this.b);
        xxgVarAo.b("streamTracerFactory", null);
        xxgVarAo.b("status", this.c);
        xxgVarAo.h("drop", this.d);
        xxgVarAo.b("authority-override", null);
        return xxgVarAo.toString();
    }
}
