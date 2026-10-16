package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class idm implements Handler.Callback {
    private static final idl b = new hrr(1);
    public final yw a = new yw();
    private volatile hss c;
    private final idl d;
    private final idf e;
    private final ieb f;

    public idm(idl idlVar) {
        idlVar = idlVar == null ? b : idlVar;
        this.d = idlVar;
        this.f = new ieb(idlVar);
        boolean z = ibi.a;
        this.e = !ibi.a ? new idc() : new ide();
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

    public static void e(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                e(fragment.getChildFragmentManager().l(), map);
            }
        }
    }

    public final hss b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = ify.a;
        if (a.Z() && !(context instanceof Application)) {
            if (context instanceof bc) {
                return d((bc) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = this.d.a(hrt.b(context.getApplicationContext()), new icy(), new idj(), context.getApplicationContext());
                }
            }
        }
        return this.c;
    }

    public final hss c(Fragment fragment) {
        a.al(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (ify.h()) {
            return b(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.e.a(fragment.getActivity());
        }
        fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f.f(context, hrt.b(context.getApplicationContext()), fragment.getLifecycle(), fragment.isVisible());
    }

    public final hss d(bc bcVar) {
        if (ify.h()) {
            return b(bcVar.getApplicationContext());
        }
        if (bcVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.e.a(bcVar);
        Activity activityA = a(bcVar);
        boolean z = true;
        if (activityA != null && activityA.isFinishing()) {
            z = false;
        }
        hrt hrtVarB = hrt.b(bcVar.getApplicationContext());
        ieb iebVar = this.f;
        eqc eqcVar = bcVar.f;
        bcVar.a();
        return iebVar.f(bcVar, hrtVarB, eqcVar, z);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
