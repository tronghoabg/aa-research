package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class uef implements Application.ActivityLifecycleCallbacks {

    /* renamed from: oa, reason: collision with root package name */
    public static long f26167oa = 0;
    public static boolean uef = false;
    public static long yo;
    private final moa bcc;
    private final moa cz;
    private volatile WeakReference<Activity> dz;
    private final AtomicBoolean moa = new AtomicBoolean(false);
    private final RunnableC0137uef lw = new RunnableC0137uef();
    private final ivm ivm = new ivm();
    private final lw xs = new lw();
    private int zjm = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.uef>> dj = new CopyOnWriteArrayList<>();
    private HandlerThread wrv = null;
    private Handler cq = null;
    private final LinkedList<Activity> wk = new LinkedList<>();

    public class ivm implements Runnable {
        public ivm() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.wk.oa().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.sy.uef();
        }
    }

    public class lw implements Runnable {
        public lw() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerOa = com.bytedance.sdk.openadsdk.core.wk.oa();
                Message messageObtain = Message.obtain(handlerOa, uef.this.lw);
                messageObtain.what = 1001;
                handlerOa.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    public static class moa implements Runnable {
        private moa() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.moa.uef.zjm zjmVarTam = com.bytedance.sdk.openadsdk.core.settings.dj.oa().tam();
            if (zjmVarTam == null || zjmVarTam.uef() || !com.bytedance.sdk.component.utils.sy.bcc(com.bytedance.sdk.openadsdk.core.sy.uef())) {
                return;
            }
            com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.core.cq.uef(com.bytedance.sdk.openadsdk.core.sy.uef()));
        }
    }

    public static class oa extends moa {
        private oa() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.uef.moa, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.ivm.oa.uef().oa();
            com.bytedance.sdk.openadsdk.utils.lw.oa();
            com.bytedance.sdk.openadsdk.component.xs.uef.uef(3);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.uef$uef, reason: collision with other inner class name */
    public static class RunnableC0137uef implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            km.oa(new com.bytedance.sdk.component.bcc.oa.yo("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.uef.uef.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public class xs implements Runnable {
        private boolean moa;

        /* renamed from: oa, reason: collision with root package name */
        private long f26169oa;
        private long yo;

        public xs(long j8, long j10, boolean z2) {
            this.f26169oa = j8;
            this.yo = j10;
            this.moa = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.moa) {
                com.bytedance.sdk.openadsdk.ab.moa.uef().uef(this.f26169oa / 1000, this.yo / 1000);
            }
        }
    }

    public static class yo extends moa {
        private yo() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.uef.moa, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.lw.uef();
        }
    }

    public uef() {
        this.bcc = new oa();
        this.cz = new yo();
        yo();
    }

    private void yo() {
        this.wrv = com.bytedance.sdk.component.utils.bcc.uef("lifecycle", 10);
        this.cq = new Handler(this.wrv.getLooper());
    }

    public boolean oa(com.bytedance.sdk.component.adexpress.uef uefVar) {
        return this.dj.remove(new WeakReference(uefVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.wk.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.dj != null && this.dj.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.uef>> it = this.dj.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.uef> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().uef(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.dz != null && this.dz.get() == activity) {
            this.dz = null;
        }
        this.wk.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i5 = this.zjm - 1;
        this.zjm = i5;
        if (i5 < 0) {
            this.zjm = 0;
        }
        if (ApmHelper.isIsInit()) {
            uef(this.xs);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        uef(this.ivm);
        if (!uef) {
            f26167oa = System.currentTimeMillis();
            uef = true;
        }
        this.dz = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (af.oa() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (!decorView.isAttachedToWindow()) {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.uef.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (af.moa(activity)) {
                                af.uef(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                } else if (af.moa(activity)) {
                    af.uef(true);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.ActivityLifecycle", th);
        }
        this.zjm++;
        if (this.moa.get()) {
            this.cq.removeCallbacks(this.cz);
            this.cq.removeCallbacks(this.bcc);
            uef(this.cz);
        }
        this.moa.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.zjm <= 0) {
            this.moa.set(true);
        }
        if (uef()) {
            uef = false;
            com.bytedance.sdk.openadsdk.core.wk.f25784oa.set(false);
            yo = System.currentTimeMillis();
            this.cq.removeCallbacks(this.cz);
            this.cq.removeCallbacks(this.bcc);
            uef(this.bcc);
        }
        uef(new xs(f26167oa, yo, uef()));
    }

    private void uef(Runnable runnable) {
        if (!this.wrv.isAlive()) {
            yo();
        }
        this.cq.postDelayed(runnable, 1000L);
    }

    public Activity oa() {
        if (this.wk.isEmpty()) {
            return null;
        }
        return this.wk.getFirst();
    }

    public void uef(com.bytedance.sdk.component.adexpress.uef uefVar) {
        this.dj.add(new WeakReference<>(uefVar));
    }

    public boolean uef() {
        return this.moa.get();
    }

    public boolean uef(boolean z2) {
        Window window;
        if (this.dz == null) {
            return z2;
        }
        try {
            Activity activity = this.dz.get();
            if (activity != null && (window = activity.getWindow()) != null) {
                return window.getDecorView().hasWindowFocus();
            }
            return z2;
        } catch (Throwable unused) {
            return z2;
        }
    }
}
