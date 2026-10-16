package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class lzy implements ServiceConnection {
    public static final yph a = yph.c("GH.NavProviderConn");
    public lzv b;
    public boolean c;
    public final ComponentName d;
    public final lzx e;
    public boolean f;

    public lzy(ComponentName componentName, lzx lzxVar) {
        this.e = lzxVar;
        this.d = componentName;
    }

    public static void c(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.NAVIGATION_CLIENT_MANAGER, yzyVar).l());
    }

    final synchronized void a() {
        ((ype) ((ype) a.f()).ai((char) 4559)).u("cleanup()");
        this.f = false;
        lzv lzvVar = this.b;
        if (lzvVar != null) {
            lzvVar.e();
            this.b = null;
        }
        this.c = true;
    }

    public final void b() {
        ((ype) ((ype) a.f()).ai((char) 4560)).u("handleFailedInit()");
        a();
        szp.u(new lqj(this, 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ype) a.l().ai((char) 4565)).y("Connected to %s", componentName.getShortClassName());
        ComponentName componentName2 = this.d;
        woy.af(componentName2.equals(componentName), "Expected to connect to %s, got %s", componentName2, componentName);
        this.f = true;
        mki.a.d.execute(new jda(this, iBinder, componentName, 17));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f = false;
        ((ype) ((ype) a.h()).ai((char) 4566)).y("Disconnected from %s", componentName.getShortClassName());
        synchronized (this) {
            lzx lzxVar = this.e;
            wer.c();
            yph yphVar = lzw.a;
            ((ype) yphVar.l().ai(4555)).M("%s died for %s", this, ((lzw) lzxVar).b);
            synchronized (((lzw) lzxVar).d) {
                lzy lzyVar = ((lzw) lzxVar).e;
                if (lzyVar == null) {
                    ((ype) ((ype) yphVar.h()).ai(4557)).u("Not rebinding on a null connection");
                    ((lzw) lzxVar).c.n(this.d, "Navigation service died. No rebind for null currentConnection");
                } else if (lzyVar != this) {
                    ((ype) ((ype) yphVar.h()).ai(4556)).u("Not rebinding, dead service is not current");
                    ((lzw) lzxVar).c.n(this.d, "Navigation service died. No rebind for non current connection");
                } else {
                    ((lzw) lzxVar).c.n(this.d, "Navigation service died. Rebinding");
                    ((lzw) lzxVar).b();
                }
            }
            this.b = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationProviderServiceConnection{, navProviderName=");
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
