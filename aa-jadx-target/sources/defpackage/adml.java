package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class adml extends defpackage.adlz {
    private static final defpackage.adno a = new defpackage.adno(new admk());

    public defpackage.adno b(java.util.Map map) {
        return a;
    }

    public abstract java.lang.String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("policy", c());
        xymVarBy.f("priority", 5);
        xymVarBy.h("available", true);
        return xymVarBy.toString();
    }
}
