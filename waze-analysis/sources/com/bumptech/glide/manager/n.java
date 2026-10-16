package com.bumptech.glide.manager;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ar;
import android.support.v4.app.av;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.ac;
import com.bumptech.glide.load.c.a.ag;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private static final m f3533a = new l();

    /* renamed from: b, reason: collision with root package name */
    private volatile ac f3534b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayMap f3535c = new ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    private final j f3536d = new j();

    public n() {
        int i2 = ag.f3295a;
    }

    private static Activity d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return d(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void e(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ar arVar = (ar) it.next();
            if (arVar != null && arVar.getView() != null) {
                map.put(arVar.getView(), arVar);
                e(arVar.getChildFragmentManager().x(), map);
            }
        }
    }

    public final ac a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.g.r.m() && !(context instanceof Application)) {
            if (context instanceof av) {
                return b((av) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f3534b == null) {
            synchronized (this) {
                if (this.f3534b == null) {
                    this.f3534b = new ac(com.bumptech.glide.c.b(context.getApplicationContext()), new a(), new i(), context.getApplicationContext());
                }
            }
        }
        return this.f3534b;
    }

    public final ac b(av avVar) {
        if (com.bumptech.glide.g.r.l()) {
            return a(avVar.getApplicationContext());
        }
        if (avVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        Activity activityD = d(avVar);
        boolean z = true;
        if (activityD != null && activityD.isFinishing()) {
            z = false;
        }
        com.bumptech.glide.c cVarB = com.bumptech.glide.c.b(avVar.getApplicationContext());
        j jVar = this.f3536d;
        Lifecycle lifecycle = avVar.getLifecycle();
        avVar.bv();
        return jVar.a(avVar, cVarB, lifecycle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ac c(View view) {
        if (com.bumptech.glide.g.r.l()) {
            return a(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.g.p.f(view);
        com.bumptech.glide.g.p.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityD = d(view.getContext());
        if (activityD == null) {
            return a(view.getContext().getApplicationContext());
        }
        if (!(activityD instanceof av)) {
            return a(view.getContext().getApplicationContext());
        }
        av avVar = (av) activityD;
        ArrayMap arrayMap = this.f3535c;
        arrayMap.clear();
        e(avVar.bv().x(), arrayMap);
        View viewFindViewById = avVar.findViewById(R.id.content);
        ar arVar = null;
        while (!view.equals(viewFindViewById) && (arVar = (ar) arrayMap.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        arrayMap.clear();
        if (arVar == null) {
            return b(avVar);
        }
        com.bumptech.glide.g.p.e(arVar.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (com.bumptech.glide.g.r.l()) {
            return a(arVar.getContext().getApplicationContext());
        }
        if (arVar.getActivity() != null) {
            arVar.getActivity();
        }
        arVar.getChildFragmentManager();
        Context context = arVar.getContext();
        return this.f3536d.a(context, com.bumptech.glide.c.b(context.getApplicationContext()), arVar.getLifecycle(), arVar.isVisible());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
