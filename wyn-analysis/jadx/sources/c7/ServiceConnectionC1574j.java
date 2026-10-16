package c7;

import Y2.B;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m7.C3493a;

/* renamed from: c7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC1574j implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    public B f19695c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1576l f19698f;

    /* renamed from: a, reason: collision with root package name */
    public int f19693a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f19694b = new Messenger(new zzf(Looper.getMainLooper(), new P4.g(this, 1)));

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f19696d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f19697e = new SparseArray();

    public /* synthetic */ ServiceConnectionC1574j(C1576l c1576l) {
        this.f19698f = c1576l;
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i5 = this.f19693a;
            if (i5 == 0) {
                throw new IllegalStateException();
            }
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                this.f19693a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f19693a = 4;
            C3493a.b().c((Context) this.f19698f.f19706b, this);
            Ya.a aVar = new Ya.a(str, securityException);
            Iterator it = this.f19696d.iterator();
            while (it.hasNext()) {
                ((C1575k) it.next()).b(aVar);
            }
            this.f19696d.clear();
            for (int i10 = 0; i10 < this.f19697e.size(); i10++) {
                ((C1575k) this.f19697e.valueAt(i10)).b(aVar);
            }
            this.f19697e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f19693a == 2 && this.f19696d.isEmpty() && this.f19697e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f19693a = 3;
                C3493a.b().c((Context) this.f19698f.f19706b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(C1575k c1575k) {
        int i5 = this.f19693a;
        if (i5 != 0) {
            if (i5 == 1) {
                this.f19696d.add(c1575k);
                return true;
            }
            if (i5 != 2) {
                return false;
            }
            this.f19696d.add(c1575k);
            ((ScheduledExecutorService) this.f19698f.f19707c).execute(new RunnableC1573i(this, 0));
            return true;
        }
        this.f19696d.add(c1575k);
        AbstractC1732v.l(this.f19693a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f19693a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C3493a.b().a((Context) this.f19698f.f19706b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f19698f.f19707c).schedule(new RunnableC1573i(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e7) {
            b("Unable to bind to service", e7);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f19698f.f19707c).execute(new L7.b(14, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f19698f.f19707c).execute(new RunnableC1573i(this, 2));
    }
}
