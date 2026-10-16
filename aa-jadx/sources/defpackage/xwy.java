package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xwy extends defpackage.xwo {
    public static final j$.time.Duration b = j$.time.Duration.ofMinutes(3);
    public static final j$.time.Duration c = j$.time.Duration.ofMinutes(3).plusSeconds(45);
    public static final defpackage.yhe d = defpackage.ync.a;
    private static final long serialVersionUID = 4556936364828217687L;
    public final java.lang.Object e;
    public volatile defpackage.xwv f;
    public transient defpackage.xwx g;

    public xwy(defpackage.xwq xwqVar, j$.time.Duration duration, j$.time.Duration duration2) {
        this.e = new byte[0];
        this.f = null;
        if (xwqVar != null) {
            this.f = defpackage.xwv.a(xwqVar, d);
        }
        duration.getClass();
        defpackage.ysr.aY(!duration.isNegative(), "refreshMargin can't be negative");
        duration2.getClass();
        defpackage.ysr.aY(!duration2.isNegative(), "expirationMargin can't be negative");
    }

    private final int b() {
        return this.f == null ? 3 : 1;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.g = null;
    }

    @Override // defpackage.xwo
    public void a(java.util.concurrent.Executor executor, defpackage.advt advtVar) {
        defpackage.xwt xwtVar;
        defpackage.zhs zifVar;
        if (b() == 1) {
            zifVar = defpackage.ysr.cp(this.f);
        } else {
            java.lang.Object obj = this.e;
            synchronized (obj) {
                if (b() != 1) {
                    synchronized (obj) {
                        defpackage.xwx xwxVar = this.g;
                        if (xwxVar != null) {
                            xwtVar = new defpackage.xwt(xwxVar, false);
                        } else {
                            defpackage.zht zhtVar = new defpackage.zht(new defpackage.qnn(this, 9));
                            this.g = new defpackage.xwx(zhtVar, new defpackage.hwt(this, zhtVar, 2));
                            xwtVar = new defpackage.xwt(this.g, true);
                        }
                    }
                } else {
                    xwtVar = null;
                }
            }
            if (xwtVar != null && xwtVar.b) {
                executor.execute(xwtVar.a);
            }
            synchronized (this.e) {
                if (b() != 3) {
                    zifVar = defpackage.ysr.cp(this.f);
                } else if (xwtVar != null) {
                    zifVar = xwtVar.a;
                } else {
                    zifVar = new defpackage.zif(new java.lang.IllegalStateException("Credentials expired, but there is no task to refresh"));
                }
            }
        }
        defpackage.ysr.cy(zifVar, new defpackage.xwu(advtVar), defpackage.zgt.INSTANCE);
    }

    public defpackage.xwq c() throws java.io.IOException {
        throw new java.lang.IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xwy) {
            return j$.util.Objects.equals(this.f, ((defpackage.xwy) obj).f);
        }
        return false;
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.f);
    }

    public java.lang.String toString() {
        java.util.Map map;
        defpackage.xwq xwqVar;
        defpackage.xwv xwvVar = this.f;
        if (xwvVar != null) {
            map = xwvVar.b;
            xwqVar = xwvVar.a;
        } else {
            map = null;
            xwqVar = null;
        }
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("requestMetadata", map);
        xymVarBy.b("temporaryAccess", xwqVar);
        return xymVarBy.toString();
    }

    protected xwy() {
        this(null, c, b);
    }
}
