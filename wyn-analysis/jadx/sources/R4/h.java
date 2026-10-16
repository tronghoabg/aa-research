package R4;

import Va.C1038ka;
import Y4.m;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.C1409a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e0;
import java.util.HashMap;
import x9.C4504d;
import y3.C4552j;
import za.C4658a;

/* loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    public static final C1038ka f10244f = new C1038ka(26);

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.h f10245a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10246b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10247c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f10248d;

    /* renamed from: e, reason: collision with root package name */
    public final C1038ka f10249e;

    public h() {
        new Bundle();
        this.f10249e = f10244f;
        this.f10248d = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean e(Context context) {
        Activity activityA = a(context);
        return activityA == null || !activityA.isFinishing();
    }

    public final com.bumptech.glide.h b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = m.f16700a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                j jVarD = d(fragmentActivity.getSupportFragmentManager(), e(fragmentActivity));
                com.bumptech.glide.h hVar = jVarD.f10254e;
                if (hVar != null) {
                    return hVar;
                }
                com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(fragmentActivity);
                C4552j c4552j = jVarD.f10251b;
                this.f10249e.getClass();
                com.bumptech.glide.h hVar2 = new com.bumptech.glide.h(bVarB, jVarD.f10250a, c4552j, fragmentActivity);
                jVarD.f10254e = hVar2;
                return hVar2;
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(activity.getApplicationContext());
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                g gVarC = c(activity.getFragmentManager(), e(activity));
                com.bumptech.glide.h hVar3 = gVarC.f10242d;
                if (hVar3 != null) {
                    return hVar3;
                }
                com.bumptech.glide.b bVarB2 = com.bumptech.glide.b.b(activity);
                xa.d dVar = gVarC.f10240b;
                this.f10249e.getClass();
                com.bumptech.glide.h hVar4 = new com.bumptech.glide.h(bVarB2, gVarC.f10239a, dVar, activity);
                gVarC.f10242d = hVar4;
                return hVar4;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f10245a == null) {
            synchronized (this) {
                try {
                    if (this.f10245a == null) {
                        com.bumptech.glide.b bVarB3 = com.bumptech.glide.b.b(context.getApplicationContext());
                        C1038ka c1038ka = this.f10249e;
                        C4504d c4504d = new C4504d(25);
                        C4658a c4658a = new C4658a(25);
                        Context applicationContext = context.getApplicationContext();
                        c1038ka.getClass();
                        this.f10245a = new com.bumptech.glide.h(bVarB3, c4504d, c4658a, applicationContext);
                    }
                } finally {
                }
            }
        }
        return this.f10245a;
    }

    public final g c(FragmentManager fragmentManager, boolean z2) {
        g gVar = (g) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (gVar != null) {
            return gVar;
        }
        HashMap map = this.f10246b;
        g gVar2 = (g) map.get(fragmentManager);
        if (gVar2 == null) {
            gVar2 = new g();
            if (z2) {
                gVar2.f10239a.a();
            }
            map.put(fragmentManager, gVar2);
            fragmentManager.beginTransaction().add(gVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f10248d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return gVar2;
    }

    public final j d(e0 e0Var, boolean z2) {
        j jVar = (j) e0Var.C("com.bumptech.glide.manager");
        if (jVar != null) {
            return jVar;
        }
        HashMap map = this.f10247c;
        j jVar2 = (j) map.get(e0Var);
        if (jVar2 == null) {
            jVar2 = new j();
            if (z2) {
                jVar2.f10250a.a();
            }
            map.put(e0Var, jVar2);
            C1409a c1409a = new C1409a(e0Var);
            c1409a.e(0, jVar2, "com.bumptech.glide.manager", 1);
            c1409a.d(true);
            this.f10248d.obtainMessage(2, e0Var).sendToTarget();
        }
        return jVar2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        Object obj3;
        int i5 = message.what;
        boolean z2 = true;
        if (i5 == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.f10246b.remove(obj);
        } else {
            if (i5 != 2) {
                obj3 = null;
                z2 = false;
                obj2 = null;
                if (z2 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z2;
            }
            obj = (e0) message.obj;
            objRemove = this.f10247c.remove(obj);
        }
        Object obj4 = objRemove;
        obj2 = obj;
        obj3 = obj4;
        if (z2) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z2;
    }
}
