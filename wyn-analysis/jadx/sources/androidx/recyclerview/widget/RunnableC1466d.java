package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1466d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1472j f18845c;

    public /* synthetic */ RunnableC1466d(C1472j c1472j, ArrayList arrayList, int i5) {
        this.f18843a = i5;
        this.f18845c = c1472j;
        this.f18844b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18843a) {
            case 0:
                ArrayList arrayList = this.f18844b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1472j c1472j = this.f18845c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1472j.f18888m.remove(arrayList);
                        break;
                    } else {
                        C1471i c1471i = (C1471i) it.next();
                        m0 m0Var = c1471i.f18877a;
                        c1472j.getClass();
                        View view = m0Var.itemView;
                        int i5 = c1471i.f18880d - c1471i.f18878b;
                        int i10 = c1471i.f18881e - c1471i.f18879c;
                        if (i5 != 0) {
                            view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        if (i10 != 0) {
                            view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1472j.f18891p.add(m0Var);
                        viewPropertyAnimatorAnimate.setDuration(c1472j.f18783e).setListener(new C1468f(c1472j, m0Var, i5, view, i10, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f18844b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C1472j c1472j2 = this.f18845c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c1472j2.f18889n.remove(arrayList2);
                        break;
                    } else {
                        C1470h c1470h = (C1470h) it2.next();
                        c1472j2.getClass();
                        m0 m0Var2 = c1470h.f18871a;
                        View view2 = m0Var2 == null ? null : m0Var2.itemView;
                        m0 m0Var3 = c1470h.f18872b;
                        View view3 = m0Var3 != null ? m0Var3.itemView : null;
                        ArrayList arrayList3 = c1472j2.f18893r;
                        long j8 = c1472j2.f18784f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j8);
                            arrayList3.add(c1470h.f18871a);
                            duration.translationX(c1470h.f18875e - c1470h.f18873c);
                            duration.translationY(c1470h.f18876f - c1470h.f18874d);
                            duration.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new C1469g(c1472j2, c1470h, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c1470h.f18872b);
                            viewPropertyAnimatorAnimate2.translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j8).alpha(1.0f).setListener(new C1469g(c1472j2, c1470h, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f18844b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C1472j c1472j3 = this.f18845c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c1472j3.f18887l.remove(arrayList4);
                        break;
                    } else {
                        m0 m0Var4 = (m0) it3.next();
                        c1472j3.getClass();
                        View view4 = m0Var4.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1472j3.f18890o.add(m0Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1472j3.f18781c).setListener(new C1467e(c1472j3, m0Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
