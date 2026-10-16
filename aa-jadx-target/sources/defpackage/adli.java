package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adli {
    public final java.lang.String a;
    public final defpackage.adlh b;
    public final long c;
    public final adlu d;
    public final adlu e;

    public adli(java.lang.String str, defpackage.adlh adlhVar, long j, adlu adluVar) {
        this.a = str;
        adlhVar.getClass();
        this.b = adlhVar;
        this.c = j;
        this.d = null;
        this.e = adluVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.adli) {
            defpackage.adli adliVar = (defpackage.adli) obj;
            if (j$.util.Objects.equals(this.a, adliVar.a) && j$.util.Objects.equals(this.b, adliVar.b) && this.c == adliVar.c) {
                adlu adluVar = adliVar.d;
                if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.e, adliVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, java.lang.Long.valueOf(this.c), null, this.e});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("description", this.a);
        xymVarBy.b("severity", this.b);
        xymVarBy.g("timestampNanos", this.c);
        xymVarBy.b("channelRef", null);
        xymVarBy.b("subchannelRef", this.e);
        return xymVarBy.toString();
    }
}
