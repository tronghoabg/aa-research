package V5;

import Ef.H;
import Va.Xa;
import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import ea.O;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes3.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13023a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13024b;

    private final void a(Message message) throws MediaCodec.CryptoException {
        d2.d dVar = (d2.d) this.f13024b;
        dVar.getClass();
        int i5 = message.what;
        d2.c cVar = null;
        if (i5 == 1) {
            d2.c cVar2 = (d2.c) message.obj;
            try {
                dVar.f33966a.queueInputBuffer(cVar2.f33959a, 0, cVar2.f33960b, cVar2.f33962d, cVar2.f33963e);
            } catch (RuntimeException e7) {
                AtomicReference atomicReference = dVar.f33969d;
                while (!atomicReference.compareAndSet(null, e7) && atomicReference.get() == null) {
                }
            }
            cVar = cVar2;
        } else if (i5 == 2) {
            d2.c cVar3 = (d2.c) message.obj;
            int i10 = cVar3.f33959a;
            MediaCodec.CryptoInfo cryptoInfo = cVar3.f33961c;
            long j8 = cVar3.f33962d;
            int i11 = cVar3.f33963e;
            try {
                synchronized (d2.d.f33965h) {
                    dVar.f33966a.queueSecureInputBuffer(i10, 0, cryptoInfo, j8, i11);
                }
            } catch (RuntimeException e10) {
                AtomicReference atomicReference2 = dVar.f33969d;
                while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                }
            }
            cVar = cVar3;
        } else if (i5 == 3) {
            dVar.f33970e.e();
        } else if (i5 != 4) {
            AtomicReference atomicReference3 = dVar.f33969d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                dVar.f33966a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e11) {
                AtomicReference atomicReference4 = dVar.f33969d;
                while (!atomicReference4.compareAndSet(null, e11) && atomicReference4.get() == null) {
                }
            }
        }
        if (cVar != null) {
            d2.d.e(cVar);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws MediaCodec.CryptoException {
        String string;
        switch (this.f13023a) {
            case 0:
                e eVar = (e) this.f13024b;
                eVar.getClass();
                int i5 = msg.what;
                d dVar = null;
                if (i5 == 0) {
                    d dVar2 = (d) msg.obj;
                    try {
                        eVar.f13032a.queueInputBuffer(dVar2.f13025a, 0, dVar2.f13026b, dVar2.f13028d, dVar2.f13029e);
                    } catch (RuntimeException e7) {
                        AtomicReference atomicReference = eVar.f13035d;
                        while (!atomicReference.compareAndSet(null, e7) && atomicReference.get() == null) {
                        }
                    }
                    dVar = dVar2;
                } else if (i5 == 1) {
                    d dVar3 = (d) msg.obj;
                    int i10 = dVar3.f13025a;
                    MediaCodec.CryptoInfo cryptoInfo = dVar3.f13027c;
                    long j8 = dVar3.f13028d;
                    int i11 = dVar3.f13029e;
                    try {
                        synchronized (e.f13031h) {
                            eVar.f13032a.queueSecureInputBuffer(i10, 0, cryptoInfo, j8, i11);
                        }
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference2 = eVar.f13035d;
                        while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                        }
                    }
                    dVar = dVar3;
                } else if (i5 != 2) {
                    AtomicReference atomicReference3 = eVar.f13035d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    eVar.f13036e.e();
                }
                if (dVar != null) {
                    e.c(dVar);
                    return;
                }
                return;
            case 1:
                if (msg.what != 1) {
                    super.handleMessage(msg);
                    return;
                }
                int i12 = Xa.f13853l + 23;
                Xa.k = i12 % 128;
                int i13 = i12 % 2;
                ((Xa) this.f13024b).f();
                if (i13 != 0) {
                    throw null;
                }
                Xa.k = (Xa.f13853l + 81) % 128;
                return;
            case 2:
                if (msg.what != 1) {
                    super.handleMessage(msg);
                    return;
                } else {
                    ((LocalBroadcastManager) this.f13024b).executePendingBroadcasts();
                    return;
                }
            case 3:
                a(msg);
                return;
            case 4:
                AbstractC3340k.e(msg, "msg");
                if (msg.what != 3) {
                    Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
                    super.handleMessage(msg);
                    return;
                }
                Bundle data = msg.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                Log.d("SessionLifecycleClient", "Session update received.");
                H.D(H.c((InterfaceC3108h) this.f13024b), null, new O(string, null), 3);
                return;
            default:
                int i14 = msg.what;
                if (i14 == -3 || i14 == -2 || i14 == -1) {
                    ((DialogInterface.OnClickListener) msg.obj).onClick((DialogInterface) ((WeakReference) this.f13024b).get(), msg.what);
                    return;
                } else {
                    if (i14 != 1) {
                        return;
                    }
                    ((DialogInterface) msg.obj).dismiss();
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Looper looper, int i5) {
        super(looper);
        this.f13023a = i5;
        this.f13024b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC3108h interfaceC3108h) {
        super(Looper.getMainLooper());
        this.f13023a = 4;
        this.f13024b = interfaceC3108h;
    }
}
