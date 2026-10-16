package com.waze.native_managers;

import android.os.Debug;
import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.waze.an.a.a.bd;
import h.g.b.x;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeNativeLooperDispatcher extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f30673a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f30674b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f30675c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f30676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WazeNativeLooperDispatcher(p pVar, com.waze.shared_infra.i.e eVar) {
        super(pVar.getLooper());
        x.f(pVar, "wazeNativeThreadLooperProvider");
        x.f(eVar, "logger");
        this.f30673a = eVar;
        this.f30674b = new ArrayDeque();
        this.f30675c = new ArrayDeque();
        this.f30676d = new AtomicReference(l.f30697a);
    }

    public static /* synthetic */ boolean f(WazeNativeLooperDispatcher wazeNativeLooperDispatcher, Runnable runnable, Runnable runnable2, int i2) {
        if ((i2 & 2) != 0) {
            runnable2 = null;
        }
        return wazeNativeLooperDispatcher.e(runnable, runnable2, 0L);
    }

    private final String g(Message message) {
        boolean zA;
        String str;
        Object obj = message.obj;
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar != null) {
            zA = bVar.a();
            str = "Timer Event";
        } else {
            zA = true;
            str = "IO event";
        }
        if (zA) {
            nativeMsgDispatcherNTV(message.arg1, message.arg2);
        }
        return str;
    }

    private static final boolean h(l lVar) {
        return lVar == l.f30698b;
    }

    private static final boolean i(l lVar) {
        return lVar == l.f30699c;
    }

    private final native void nativeMsgDispatcherNTV(int i2, int i3);

    public final void a() {
        this.f30676d.set(l.f30698b);
    }

    public final void b(int i2, b bVar, int i3) {
        x.f(bVar, "messageParam");
        Message messageObtain = Message.obtain(this, com.waze.aj.b.d(d.f30682d), i2, i3);
        messageObtain.obj = bVar;
        ArrayDeque arrayDeque = this.f30675c;
        synchronized (arrayDeque) {
            arrayDeque.add(messageObtain);
        }
        messageObtain.sendToTarget();
    }

    public final void c() {
        this.f30676d.set(l.f30699c);
    }

    public final boolean d(Runnable runnable, Runnable runnable2) {
        x.f(runnable, "runnable");
        if (i((l) this.f30676d.get())) {
            if (runnable2 == null) {
                return false;
            }
            runnable2.run();
            return false;
        }
        m mVar = new m(runnable2, runnable, 1);
        ArrayDeque arrayDeque = this.f30674b;
        synchronized (arrayDeque) {
            arrayDeque.add(mVar);
        }
        sendEmptyMessage(com.waze.aj.b.d(d.f30679a));
        return true;
    }

    public final boolean e(Runnable runnable, Runnable runnable2, long j2) {
        x.f(runnable, "runnable");
        if (i((l) this.f30676d.get())) {
            if (runnable2 != null) {
                runnable2.run();
            }
            return false;
        }
        d dVar = d.f30683e;
        if (runnable2 != null) {
            dVar = d.f30684f;
            runnable = new m(runnable2, runnable, 0);
        }
        Message messageObtain = Message.obtain(this, com.waze.aj.b.d(dVar), runnable);
        if (j2 > 0) {
            sendMessageDelayed(messageObtain, j2);
            return true;
        }
        messageObtain.sendToTarget();
        return true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objPollFirst;
        Object objPollFirst2;
        String strG;
        a aVar;
        x.f(message, NotificationCompat.CATEGORY_MESSAGE);
        d dVar = d.f30679a;
        d dVarI = bd.i(message.what);
        if (i((l) this.f30676d.get())) {
            while (true) {
                ArrayDeque arrayDeque = this.f30674b;
                synchronized (arrayDeque) {
                    aVar = (a) arrayDeque.pollFirst();
                }
                if (aVar == null) {
                    break;
                } else {
                    aVar.a();
                }
            }
            if (dVarI == d.f30684f) {
                Object obj = message.obj;
                a aVar2 = obj instanceof a ? (a) obj : null;
                if (aVar2 != null) {
                    aVar2.a();
                    return;
                }
                return;
            }
            return;
        }
        if (h((l) this.f30676d.get())) {
            while (true) {
                ArrayDeque arrayDeque2 = this.f30674b;
                synchronized (arrayDeque2) {
                    objPollFirst = arrayDeque2.pollFirst();
                }
                if (objPollFirst == null) {
                    ArrayDeque arrayDeque3 = this.f30675c;
                    synchronized (arrayDeque3) {
                        objPollFirst2 = arrayDeque3.pollFirst();
                    }
                    if (objPollFirst2 == null) {
                        break;
                    }
                    Message message2 = (Message) objPollFirst2;
                    d dVarI2 = bd.i(message2.what);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (dVarI2 == d.f30682d) {
                        strG = g(message2);
                    } else {
                        com.waze.shared_infra.i.e eVar = this.f30673a;
                        Objects.toString(dVarI2);
                        eVar.b("Unknown priority event - ".concat(String.valueOf(dVarI2)));
                        strG = "";
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (jCurrentTimeMillis2 > 500) {
                        this.f30673a.g("WAZE PROFILER EXCEPTIONAL TIME FOR " + strG + " HANDLING TIME: " + jCurrentTimeMillis2);
                    }
                } else {
                    ((a) objPollFirst).run();
                }
            }
        }
        String strG2 = "";
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        if (dVarI == null) {
            this.f30673a.b("Unknown event type code received - " + message.what);
        } else {
            int iOrdinal = dVarI.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    this.f30673a.g("Android system reported low memory !!! ".concat("Memory usage native heap. Used: " + Debug.getNativeHeapAllocatedSize() + ". Free: " + Debug.getNativeHeapFreeSize() + ". Total: " + Debug.getNativeHeapSize()));
                } else if (iOrdinal == 2) {
                    strG2 = g(message);
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4 && iOrdinal != 5) {
                        throw new h.i();
                    }
                    Object obj2 = message.obj;
                    Runnable runnable = obj2 instanceof Runnable ? (Runnable) obj2 : null;
                    if (runnable != null) {
                        strG2 = runnable.toString();
                        runnable.run();
                    }
                }
            }
        }
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
        if (jCurrentTimeMillis4 <= 500 || !h((l) this.f30676d.get())) {
            return;
        }
        this.f30673a.g("WAZE PROFILER EXCEPTIONAL TIME FOR " + strG2 + " HANDLING TIME: " + jCurrentTimeMillis4);
    }
}
