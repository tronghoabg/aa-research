package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class wkm {
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public wkm(Iterable iterable) {
        new yw();
        this.c = new yw();
        this.e = new nok(null, null);
        this.b = false;
        this.d = new yw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((aat) this.d).put(((sle) it.next()).r(), null);
        }
        this.a = ((aat) this.d).d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    private final void g() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((wkl) it.next()).a();
        }
        this.b = false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void a(Animator animator) {
        this.c.add(animator);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b(emm emmVar) {
        this.d.add(emmVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void c(wkl wklVar) {
        this.e.add(wklVar);
    }

    public final void d() {
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void e() {
        if (this.b) {
            return;
        }
        this.b = true;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((wkl) it.next()).b();
        }
        ?? r1 = this.d;
        this.a = r1.size();
        ?? r2 = this.c;
        if (!r2.isEmpty()) {
            this.a++;
        }
        if (this.a == 0) {
            g();
            return;
        }
        tem temVar = new tem(this, 2);
        for (emm emmVar : r1) {
            emmVar.g(temVar);
            emmVar.e();
        }
        if (r2.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        wox.p(animatorSet, new ArrayList((Collection) r2));
        animatorSet.addListener(new wkk(this));
        animatorSet.start();
    }

    public final void f(slr slrVar, ConnectionResult connectionResult, String str) {
        Object obj = this.d;
        ((aat) obj).put(slrVar, connectionResult);
        Object obj2 = this.c;
        ((aat) obj2).put(slrVar, str);
        this.a--;
        if (!connectionResult.c()) {
            this.b = true;
        }
        if (this.a == 0) {
            if (!this.b) {
                ((nok) this.e).e(obj2);
            } else {
                ((nok) this.e).d(new skx((yw) obj));
            }
        }
    }

    public wkm() {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.a = 0;
        this.b = false;
    }
}
