package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class maf implements android.content.ServiceConnection {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NavProviderConn");
    public defpackage.mac b;
    public boolean c;
    public final android.content.ComponentName d;
    public final mae e;
    public boolean f;

    public maf(android.content.ComponentName componentName, mae maeVar) {
        this.e = maeVar;
        this.d = componentName;
    }

    public static void c(defpackage.zbd zbdVar) {
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.NAVIGATION_CLIENT_MANAGER, zbdVar).l());
    }

    final synchronized void a() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4562)).u("cleanup()");
        this.f = false;
        defpackage.mac macVar = this.b;
        if (macVar != null) {
            macVar.e();
            this.b = null;
        }
        this.c = true;
    }

    public final void b() {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4563)).u("handleFailedInit()");
        a();
        defpackage.tna.i(new defpackage.lzk(this, 4));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        ((defpackage.yqj) a.l().ai((char) 4568)).y("Connected to %s", componentName.getShortClassName());
        android.content.ComponentName componentName2 = this.d;
        defpackage.ysr.bp(componentName2.equals(componentName), "Expected to connect to %s, got %s", componentName2, componentName);
        this.f = true;
        defpackage.mkp.a.d.execute(new defpackage.jdh(this, iBinder, componentName, 18));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f = false;
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4569)).y("Disconnected from %s", componentName.getShortClassName());
        synchronized (this) {
            mae maeVar = this.e;
            defpackage.wfp.c();
            defpackage.yqm yqmVar = defpackage.mad.a;
            ((defpackage.yqj) yqmVar.l().ai(4558)).M("%s died for %s", this, ((defpackage.mad) maeVar).b);
            synchronized (((defpackage.mad) maeVar).d) {
                defpackage.maf mafVar = ((defpackage.mad) maeVar).e;
                if (mafVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(4560)).u("Not rebinding on a null connection");
                    ((defpackage.mad) maeVar).c.n(this.d, "Navigation service died. No rebind for null currentConnection");
                } else if (mafVar != this) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(4559)).u("Not rebinding, dead service is not current");
                    ((defpackage.mad) maeVar).c.n(this.d, "Navigation service died. No rebind for non current connection");
                } else {
                    ((defpackage.mad) maeVar).c.n(this.d, "Navigation service died. Rebinding");
                    ((defpackage.mad) maeVar).b();
                }
            }
            this.b = null;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationProviderServiceConnection{, navProviderName=");
        sb.append(this.d);
        synchronized (this) {
            sb.append(", cleanedUp=");
            sb.append(this.c);
            sb.append("navClient=");
            sb.append(this.b);
            sb.append(", isConnected=");
            sb.append(this.f);
        }
        sb.append('}');
        return sb.toString();
    }
}
