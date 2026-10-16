package com.google.android.play.core.b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.o.w;
import com.waze.navigate.di;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f6974a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f6975b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6980g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f6981h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f6985l;
    private IInterface m;
    private final di n;

    /* renamed from: d, reason: collision with root package name */
    private final List f6977d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f6978e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f6979f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f6983j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.b.b
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            i.h(this.f6965a);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f6984k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f6976c = "IntegrityService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f6982i = new WeakReference(null);

    public i(Context context, di diVar, Intent intent) {
        this.f6975b = context;
        this.n = diVar;
        this.f6981h = intent;
    }

    public static /* synthetic */ void h(i iVar) {
        di diVar = iVar.n;
        diVar.h("reportBinderDeath", new Object[0]);
        e eVar = (e) iVar.f6982i.get();
        if (eVar != null) {
            diVar.h("calling onBinderDied", new Object[0]);
            eVar.a();
        } else {
            diVar.h("%s : Binder has died.", iVar.f6976c);
            List list = iVar.f6977d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(iVar.v());
            }
            list.clear();
        }
        synchronized (iVar.f6979f) {
            iVar.w();
        }
    }

    static /* bridge */ /* synthetic */ void j(i iVar, w wVar) {
        iVar.f6978e.add(wVar);
        wVar.a().m(new com.google.firebase.messaging.e(iVar, wVar, 1));
    }

    static /* bridge */ /* synthetic */ void l(i iVar, a aVar) {
        if (iVar.m != null || iVar.f6980g) {
            if (!iVar.f6980g) {
                aVar.run();
                return;
            } else {
                iVar.n.h("Waiting to bind to the service.", new Object[0]);
                iVar.f6977d.add(aVar);
                return;
            }
        }
        di diVar = iVar.n;
        diVar.h("Initiate binding to the service.", new Object[0]);
        List list = iVar.f6977d;
        list.add(aVar);
        h hVar = new h(iVar);
        iVar.f6985l = hVar;
        iVar.f6980g = true;
        if (iVar.f6975b.bindService(iVar.f6981h, hVar, 1)) {
            return;
        }
        diVar.h("Failed to bind to the service.", new Object[0]);
        iVar.f6980g = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(new j());
        }
        list.clear();
    }

    static /* bridge */ /* synthetic */ void m(i iVar) throws RemoteException {
        iVar.n.h("linkToDeath", new Object[0]);
        try {
            iVar.m.asBinder().linkToDeath(iVar.f6983j, 0);
        } catch (RemoteException e2) {
            iVar.n.g(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void n(i iVar) {
        iVar.n.h("unlinkToDeath", new Object[0]);
        iVar.m.asBinder().unlinkToDeath(iVar.f6983j, 0);
    }

    public static /* synthetic */ void r(i iVar, w wVar) {
        synchronized (iVar.f6979f) {
            iVar.f6978e.remove(wVar);
        }
    }

    private final RemoteException v() {
        return new RemoteException(String.valueOf(this.f6976c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        Set set = this.f6978e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((w) it.next()).d(v());
        }
        set.clear();
    }

    public final IInterface d() {
        return this.m;
    }

    public final void o(a aVar, w wVar) {
        p(new c(this, aVar.c(), wVar, aVar));
    }

    public final void p(a aVar) {
        Handler handler;
        Map map = f6974a;
        synchronized (map) {
            String str = this.f6976c;
            if (!map.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(str);
        }
        handler.post(aVar);
    }

    public final void q(w wVar) {
        synchronized (this.f6979f) {
            this.f6978e.remove(wVar);
        }
        p(new d(this));
    }
}
