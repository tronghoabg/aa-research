package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class xvs extends xvi {
    public static final Duration b = Duration.ofMinutes(3);
    public static final Duration c = Duration.ofMinutes(3).plusSeconds(45);
    public static final yfy d = ylx.a;
    private static final long serialVersionUID = 4556936364828217687L;
    public final Object e;
    public volatile xvp f;
    public transient xvr g;

    public xvs(xvk xvkVar, Duration duration, Duration duration2) {
        this.e = new byte[0];
        this.f = null;
        if (xvkVar != null) {
            this.f = xvp.a(xvkVar, d);
        }
        duration.getClass();
        woy.O(!duration.isNegative(), "refreshMargin can't be negative");
        duration2.getClass();
        woy.O(!duration2.isNegative(), "expirationMargin can't be negative");
    }

    private final int b() {
        return this.f == null ? 3 : 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.g = null;
    }

    @Override // defpackage.xvi
    public void a(Executor executor, adus adusVar) {
        xvn xvnVar;
        zgp zhcVar;
        if (b() == 1) {
            zhcVar = wub.Y(this.f);
        } else {
            Object obj = this.e;
            synchronized (obj) {
                if (b() != 1) {
                    synchronized (obj) {
                        xvr xvrVar = this.g;
                        if (xvrVar != null) {
                            xvnVar = new xvn(xvrVar, false);
                        } else {
                            zgq zgqVar = new zgq(new qmr(this, 8));
                            this.g = new xvr(zgqVar, new hwk(this, zgqVar, 2));
                            xvnVar = new xvn(this.g, true);
                        }
                    }
                } else {
                    xvnVar = null;
                }
            }
            if (xvnVar != null && xvnVar.b) {
                executor.execute(xvnVar.a);
            }
            synchronized (this.e) {
                if (b() != 3) {
                    zhcVar = wub.Y(this.f);
                } else if (xvnVar != null) {
                    zhcVar = xvnVar.a;
                } else {
                    zhcVar = new zhc(new IllegalStateException("Credentials expired, but there is no task to refresh"));
                }
            }
        }
        wub.ah(zhcVar, new xvo(adusVar), zfq.a);
    }

    public xvk c() throws IOException {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof xvs) {
            return Objects.equals(this.f, ((xvs) obj).f);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f);
    }

    public String toString() {
        Map map;
        xvk xvkVar;
        xvp xvpVar = this.f;
        if (xvpVar != null) {
            map = xvpVar.b;
            xvkVar = xvpVar.a;
        } else {
            map = null;
            xvkVar = null;
        }
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("requestMetadata", map);
        xxgVarAo.b("temporaryAccess", xvkVar);
        return xxgVarAo.toString();
    }

    protected xvs() {
        this(null, c, b);
    }
}
