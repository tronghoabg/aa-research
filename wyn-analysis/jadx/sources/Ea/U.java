package ea;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class U extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f34502a;

    /* renamed from: b, reason: collision with root package name */
    public long f34503b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f34504c;

    public U(Looper looper) {
        super(looper);
        this.f34504c = new ArrayList();
    }

    public final void a(Messenger messenger) throws RemoteException {
        if (this.f34502a) {
            Object objC = s8.g.e().c(M.class);
            AbstractC3340k.d(objC, "Firebase.app[SessionGenerator::class.java]");
            C2481E c2481e = ((M) objC).f34487e;
            if (c2481e != null) {
                c(messenger, c2481e.f34454a);
                return;
            } else {
                AbstractC3340k.m("currentSession");
                throw null;
            }
        }
        Object objC2 = s8.g.e().c(InterfaceC2506v.class);
        AbstractC3340k.d(objC2, "Firebase.app[SessionDatastore::class.java]");
        C2500o c2500o = (C2500o) ((C2480D) ((InterfaceC2506v) objC2)).f34452c.get();
        String str = c2500o != null ? c2500o.f34569a : null;
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() throws RemoteException {
        Object objC = s8.g.e().c(M.class);
        AbstractC3340k.d(objC, "Firebase.app[SessionGenerator::class.java]");
        M m10 = (M) objC;
        int i5 = m10.f34486d + 1;
        m10.f34486d = i5;
        String strA = i5 == 0 ? m10.f34485c : m10.a();
        int i10 = m10.f34486d;
        m10.f34483a.getClass();
        m10.f34487e = new C2481E(System.currentTimeMillis() * 1000, strA, m10.f34485c, i10);
        Log.d("SessionLifecycleService", "Generated new session.");
        Log.d("SessionLifecycleService", "Broadcasting new session");
        Object objC2 = s8.g.e().c(InterfaceC2484H.class);
        AbstractC3340k.d(objC2, "Firebase.app[SessionFirelogPublisher::class.java]");
        InterfaceC2484H interfaceC2484H = (InterfaceC2484H) objC2;
        Object objC3 = s8.g.e().c(M.class);
        AbstractC3340k.d(objC3, "Firebase.app[SessionGenerator::class.java]");
        C2481E c2481e = ((M) objC3).f34487e;
        if (c2481e == null) {
            AbstractC3340k.m("currentSession");
            throw null;
        }
        K k = (K) interfaceC2484H;
        Ef.H.D(Ef.H.c(k.f34481e), null, new C2485I(k, c2481e, null), 3);
        Iterator it = new ArrayList(this.f34504c).iterator();
        while (it.hasNext()) {
            Messenger it2 = (Messenger) it.next();
            AbstractC3340k.d(it2, "it");
            a(it2);
        }
        Object objC4 = s8.g.e().c(InterfaceC2506v.class);
        AbstractC3340k.d(objC4, "Firebase.app[SessionDatastore::class.java]");
        InterfaceC2506v interfaceC2506v = (InterfaceC2506v) objC4;
        Object objC5 = s8.g.e().c(M.class);
        AbstractC3340k.d(objC5, "Firebase.app[SessionGenerator::class.java]");
        C2481E c2481e2 = ((M) objC5).f34487e;
        if (c2481e2 == null) {
            AbstractC3340k.m("currentSession");
            throw null;
        }
        C2480D c2480d = (C2480D) interfaceC2506v;
        String sessionId = c2481e2.f34454a;
        AbstractC3340k.e(sessionId, "sessionId");
        Ef.H.D(Ef.H.c(c2480d.f34451b), null, new C2479C(c2480d, sessionId, null), 3);
    }

    public final void c(Messenger messenger, String str) throws RemoteException {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f34504c.remove(messenger);
        } catch (Exception e7) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0155  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.U.handleMessage(android.os.Message):void");
    }
}
