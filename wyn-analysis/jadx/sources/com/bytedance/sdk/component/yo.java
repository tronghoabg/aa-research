package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.oa;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class yo {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile Handler f25120oa;
    private static final Object uef = new Object();
    private static final LinkedList<Runnable> yo = new LinkedList<>();
    private static Object moa = new Object();

    public static class uef extends Handler {
        public uef(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    yo.yo();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    private static Handler oa() {
        Handler handler;
        if (f25120oa != null) {
            return f25120oa;
        }
        synchronized (uef) {
            try {
                if (f25120oa == null) {
                    oa.uef uefVar = oa.uef;
                    HandlerThread handlerThreadUef = uefVar != null ? uefVar.uef("queued-work-looper", -2) : null;
                    if (handlerThreadUef == null) {
                        handlerThreadUef = new HandlerThread("queued-work-looper", -2);
                        handlerThreadUef.start();
                    }
                    f25120oa = new uef(handlerThreadUef.getLooper());
                }
                handler = f25120oa;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yo() {
        LinkedList linkedList;
        synchronized (moa) {
            try {
                synchronized (uef) {
                    LinkedList<Runnable> linkedList2 = yo;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    oa().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void uef(Runnable runnable, boolean z2) {
        try {
            Handler handlerOa = oa();
            synchronized (uef) {
                try {
                    yo.add(runnable);
                    if (z2) {
                        handlerOa.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerOa.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
