package K8;

import A7.W;
import Hf.j0;
import Hf.k0;
import a2.C1323c;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.AbstractC1451o;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import lc.C3458b;
import ld.AbstractC3459a;
import oc.C3665d;
import org.json.JSONObject;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;

/* loaded from: classes4.dex */
public final class H implements OnFailureListener, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6582a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6583b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6584c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6585d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6586e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6587f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6588g;

    public H(C0690b c0690b, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z2, F f10, TaskCompletionSource taskCompletionSource) {
        this.f6583b = firebaseAuth;
        this.f6584c = str;
        this.f6585d = activity;
        this.f6582a = z2;
        this.f6586e = f10;
        this.f6587f = taskCompletionSource;
        this.f6588g = c0690b;
    }

    public static String a(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.left);
        sb2.append(',');
        sb2.append(rect.top);
        sb2.append(',');
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    public static String g(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.width());
        sb2.append(',');
        sb2.append(rect.height());
        return sb2.toString();
    }

    public void b(K3.r screenMetrics) {
        AbstractC3340k.e(screenMetrics, "screenMetrics");
        StringBuilder sb2 = new StringBuilder("\n                mraidbridge.setScreenSize(");
        sb2.append(g((Rect) screenMetrics.f6513c));
        sb2.append(");\n                mraidbridge.setMaxSize(");
        sb2.append(g((Rect) screenMetrics.f6515e));
        sb2.append(");\n                mraidbridge.setCurrentPosition(");
        Rect rect = (Rect) screenMetrics.f6517g;
        sb2.append(a(rect));
        sb2.append(");\n                mraidbridge.setDefaultPosition(");
        sb2.append(a((Rect) screenMetrics.f6519i));
        sb2.append(")\n            ");
        h(sb2.toString());
        h("mraidbridge.notifySizeChangeEvent(" + g(rect) + ')');
    }

    public void c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.C command, String msg) {
        AbstractC3340k.e(command, "command");
        AbstractC3340k.e(msg, "msg");
        h("mraidbridge.notifyErrorEvent(" + JSONObject.quote(command.f30339a) + ", " + JSONObject.quote(msg) + ')');
    }

    public void d(Object obj) {
        if (this.f6582a) {
            return;
        }
        obj.getClass();
        ((CopyOnWriteArraySet) this.f6586e).add(new u6.i(obj));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public void destroy() {
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O) this.f6586e).destroy();
    }

    public void e(InterfaceC3885b interfaceC3885b) {
        AbstractC3459a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC3885b.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC3885b.getClass();
            HashMap map = (HashMap) this.f6583b;
            if (map.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC3885b + ") but it was already registered with this FlutterEngine (" + ((C3458b) this.f6584c) + ").");
                Trace.endSection();
                return;
            }
            interfaceC3885b.toString();
            map.put(interfaceC3885b.getClass(), interfaceC3885b);
            interfaceC3885b.onAttachedToEngine((C3884a) this.f6585d);
            if (interfaceC3885b instanceof InterfaceC3964a) {
                InterfaceC3964a interfaceC3964a = (InterfaceC3964a) interfaceC3885b;
                ((HashMap) this.f6586e).put(interfaceC3885b.getClass(), interfaceC3964a);
                if (n()) {
                    interfaceC3964a.onAttachedToActivity((s1) this.f6588g);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void f(Activity activity, AbstractC1451o abstractC1451o) {
        s1 s1Var = new s1();
        s1Var.f43898c = new HashSet();
        s1Var.f43899d = new HashSet();
        s1Var.f43900e = new HashSet();
        s1Var.f43901f = new HashSet();
        new HashSet();
        s1Var.f43902g = new HashSet();
        s1Var.f43896a = activity;
        s1Var.f43897b = new HiddenLifecycleReference(abstractC1451o);
        this.f6588g = s1Var;
        boolean booleanExtra = activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        C3458b c3458b = (C3458b) this.f6584c;
        io.flutter.plugin.platform.q qVar = c3458b.f40267r;
        qVar.f37152u = booleanExtra;
        if (qVar.f37135c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        qVar.f37135c = activity;
        qVar.f37137e = c3458b.f40252b;
        mc.b bVar = c3458b.f40253c;
        t6.q qVar2 = new t6.q(bVar, 2);
        qVar.f37139g = qVar2;
        qVar2.f45907b = qVar.f37153v;
        io.flutter.plugin.platform.p pVar = c3458b.f40268s;
        if (pVar.f37119c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        pVar.f37119c = activity;
        Y2.B b5 = new Y2.B(bVar);
        pVar.f37123g = b5;
        b5.f16384c = pVar.f37131p;
        for (InterfaceC3964a interfaceC3964a : ((HashMap) this.f6586e).values()) {
            if (this.f6582a) {
                interfaceC3964a.onReattachedToActivityForConfigChanges((s1) this.f6588g);
            } else {
                interfaceC3964a.onAttachedToActivity((s1) this.f6588g);
            }
        }
        this.f6582a = false;
    }

    public void h(String str) {
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O) this.f6586e).loadUrl("javascript:" + str);
    }

    public void i() {
        if (!n()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        AbstractC3459a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f6586e).values().iterator();
            while (it.hasNext()) {
                ((InterfaceC3964a) it.next()).onDetachedFromActivity();
            }
            j();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void j() {
        C3458b c3458b = (C3458b) this.f6584c;
        io.flutter.plugin.platform.q qVar = c3458b.f40267r;
        t6.q qVar2 = qVar.f37139g;
        if (qVar2 != null) {
            qVar2.f45907b = null;
        }
        qVar.g();
        qVar.f37139g = null;
        qVar.f37135c = null;
        qVar.f37137e = null;
        io.flutter.plugin.platform.p pVar = c3458b.f40268s;
        Y2.B b5 = pVar.f37123g;
        if (b5 != null) {
            b5.f16384c = null;
        }
        Surface surface = pVar.f37129n;
        if (surface != null) {
            surface.release();
            pVar.f37129n = null;
            pVar.f37130o = null;
        }
        pVar.f37123g = null;
        pVar.f37119c = null;
        this.f6587f = null;
        this.f6588g = null;
    }

    public void l() {
        if (n()) {
            i();
        }
    }

    public void m() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f6588g;
        if (arrayDeque.isEmpty()) {
            return;
        }
        u6.s sVar = (u6.s) this.f6584c;
        if (!sVar.f46716a.hasMessages(0)) {
            sVar.getClass();
            u6.r rVarB = u6.s.b();
            rVarB.f46714a = sVar.f46716a.obtainMessage(0);
            sVar.getClass();
            Message message = rVarB.f46714a;
            message.getClass();
            sVar.f46716a.sendMessageAtFrontOfQueue(message);
            rVarB.a();
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f6587f;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public boolean n() {
        return ((kc.f) this.f6587f) != null;
    }

    public void o(int i5, u6.g gVar) {
        ((ArrayDeque) this.f6588g).add(new Mb.b(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f6586e), i5, gVar, 6));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("b", "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        Object obj = this.f6583b;
        boolean zI = ((FirebaseAuth) obj).n().I();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6587f;
        if (!zI) {
            taskCompletionSource.setResult(new K(null, null, null));
        } else {
            ((C0690b) this.f6588g).c((FirebaseAuth) obj, (String) this.f6584c, (Activity) this.f6585d, this.f6582a, false, (F) this.f6586e, taskCompletionSource);
        }
    }

    public void p(int i5, u6.g gVar) {
        o(i5, gVar);
        m();
    }

    public void q(boolean z2) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f6582a = z2;
        ((W) this.f6588g).a((Context) this.f6583b, intentFilter2);
        if (!this.f6582a) {
            ((W) this.f6587f).a((Context) this.f6583b, intentFilter);
            return;
        }
        W w2 = (W) this.f6587f;
        Context context = (Context) this.f6583b;
        synchronized (w2) {
            try {
                if (w2.f728b) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(w2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != w2.f729c ? 4 : 2);
                } else {
                    context.registerReceiver(w2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                w2.f728b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public H(Context context, Kd.a scope, boolean z2) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(scope, "scope");
        this.f6582a = z2;
        Lf.e eVar = Ef.S.f3698a;
        this.f6583b = Ef.H.F(scope, Jf.n.f6132a);
        j0 j0VarB = k0.b(0, 0, 7);
        this.f6584c = j0VarB;
        this.f6585d = j0VarB;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O o7 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O(context, new C1323c(this, 6));
        this.f6586e = o7;
        this.f6587f = o7;
        this.f6588g = o7.getUnrecoverableError();
    }

    public H(Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, X2.j jVar) {
        this.f6583b = context;
        this.f6584c = purchasesUpdatedListener;
        this.f6585d = userChoiceBillingListener;
        this.f6586e = jVar;
        this.f6587f = new W(this, true);
        this.f6588g = new W(this, false);
    }

    public H(Looper looper, u6.q qVar, u6.h hVar) {
        this(new CopyOnWriteArraySet(), looper, qVar, hVar);
    }

    public H(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, u6.q qVar, u6.h hVar) {
        this.f6583b = qVar;
        this.f6586e = copyOnWriteArraySet;
        this.f6585d = hVar;
        this.f6587f = new ArrayDeque();
        this.f6588g = new ArrayDeque();
        this.f6584c = qVar.a(looper, new Q1.f(this, 2));
    }

    public H(Context context, C3458b c3458b, C3665d c3665d) {
        this.f6583b = new HashMap();
        this.f6586e = new HashMap();
        this.f6582a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f6584c = c3458b;
        io.flutter.plugin.platform.n nVar = c3458b.f40267r.f37133a;
        com.google.android.gms.ads.nativead.l lVar = new com.google.android.gms.ads.nativead.l(c3665d, 9);
        this.f6585d = new C3884a(context, c3458b, c3458b.f40253c, c3458b.f40252b, nVar, lVar);
    }

    public H(Context context, q2.m mVar) {
        this.f6583b = context.getApplicationContext();
        this.f6584c = mVar;
        C3407I c3407i = AbstractC3409K.f40056b;
        this.f6587f = e0.f40101e;
        this.f6588g = Q1.q.f9708a;
    }

    public H(Context context) {
        this.f6583b = context;
        this.f6584c = W1.b.f14944c;
        this.f6586e = W1.u.f15098a;
        this.f6587f = W1.u.f15099b;
    }
}
