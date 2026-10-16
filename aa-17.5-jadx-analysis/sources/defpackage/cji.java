package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class cji {
    private static boolean d = true;
    public boolean a;
    public coc c;
    private final ViewGroup e;
    private cms g;
    private final Object f = new Object();
    public final ComponentCallbacks2 b = new cjg(this);

    public cji(ViewGroup viewGroup) {
        this.e = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            c(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new cjh(this, 0));
    }

    private final cms e(ViewGroup viewGroup) {
        cms cmsVar = this.g;
        if (cmsVar != null) {
            return cmsVar;
        }
        cmt cmtVar = new cmt(viewGroup.getContext());
        ((czq) viewGroup).addView(cmtVar, -1);
        this.g = cmtVar;
        return cmtVar;
    }

    public final cmi a() {
        cmp cmpVar;
        cml cmmVar;
        cmi cmiVar;
        synchronized (this.f) {
            ViewGroup viewGroup = this.e;
            if (Build.VERSION.SDK_INT >= 29) {
                viewGroup.getUniqueDrawingId();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                cmmVar = new cmn(new kgx((char[]) null), new cmb());
            } else {
                if (d) {
                    try {
                        cmmVar = new cmm(viewGroup, new kgx((char[]) null), new cmb());
                    } catch (Throwable unused) {
                        d = false;
                        cmpVar = new cmp(e(this.e));
                    }
                } else {
                    cmpVar = new cmp(e(this.e));
                }
                cmmVar = cmpVar;
            }
            cmiVar = new cmi(cmmVar);
        }
        return cmiVar;
    }

    public final void b() {
        coc cocVar = this.c;
        if (cocVar != null) {
            synchronized (cocVar) {
                Object obj = cocVar.a;
                if (obj != null) {
                    ((aan) obj).k();
                }
                cocVar.b = null;
            }
        }
        this.c = null;
    }

    public final void c(Context context) {
        if (this.a) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.b);
        this.a = true;
    }

    public final void d(cmi cmiVar) {
        synchronized (this.f) {
            if (!cmiVar.l) {
                cmiVar.l = true;
                cmiVar.e();
            }
        }
    }
}
