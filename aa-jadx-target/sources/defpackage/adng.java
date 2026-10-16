package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adng {
    public final defpackage.adnf a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final adne d;
    public final adne e;
    public final boolean f;

    public adng(defpackage.adnf adnfVar, java.lang.String str, adne adneVar, adne adneVar2, boolean z) {
        new java.util.concurrent.atomic.AtomicReferenceArray(2);
        adnfVar.getClass();
        this.a = adnfVar;
        str.getClass();
        this.b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        adneVar.getClass();
        this.d = adneVar;
        adneVar2.getClass();
        this.e = adneVar2;
        this.f = z;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public static defpackage.xo c() {
        defpackage.xo xoVar = new defpackage.xo();
        xoVar.e = null;
        xoVar.c = null;
        return xoVar;
    }

    public final java.io.InputStream a(java.lang.Object obj) {
        return this.d.a(obj);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("fullMethodName", this.b);
        xymVarBy.b("type", this.a);
        xymVarBy.h("idempotent", false);
        xymVarBy.h("safe", false);
        xymVarBy.h("sampledToLocalTracing", this.f);
        xymVarBy.b("requestMarshaller", this.d);
        xymVarBy.b("responseMarshaller", this.e);
        xymVarBy.b("schemaDescriptor", null);
        xymVarBy.c();
        return xymVarBy.toString();
    }
}
