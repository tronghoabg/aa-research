package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f18764b;

    public /* synthetic */ E(RecyclerView recyclerView, int i5) {
        this.f18763a = i5;
        this.f18764b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f18764b;
        switch (this.f18763a) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.mLayoutSuppressed) {
                        recyclerView.consumePendingUpdateOperations();
                        break;
                    } else {
                        recyclerView.mLayoutWasDefered = true;
                        break;
                    }
                }
                break;
            default:
                P p10 = recyclerView.mItemAnimator;
                if (p10 != null) {
                    C1472j c1472j = (C1472j) p10;
                    ArrayList arrayList = c1472j.f18884h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1472j.f18886j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1472j.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1472j.f18885i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j8 = c1472j.f18782d;
                            if (zHasNext) {
                                m0 m0Var = (m0) it.next();
                                View view = m0Var.itemView;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c1472j.f18892q.add(m0Var);
                                viewPropertyAnimatorAnimate.setDuration(j8).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new C1467e(c1472j, m0Var, viewPropertyAnimatorAnimate, view)).start();
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1472j.f18888m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC1466d runnableC1466d = new RunnableC1466d(c1472j, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC1466d.run();
                                    } else {
                                        View view2 = ((C1471i) arrayList5.get(0)).f18877a.itemView;
                                        WeakHashMap weakHashMap = k1.S.f38779a;
                                        view2.postOnAnimationDelayed(runnableC1466d, j8);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1472j.f18889n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC1466d runnableC1466d2 = new RunnableC1466d(c1472j, arrayList6, 1);
                                    if (zIsEmpty) {
                                        runnableC1466d2.run();
                                    } else {
                                        View view3 = ((C1470h) arrayList6.get(0)).f18871a.itemView;
                                        WeakHashMap weakHashMap2 = k1.S.f38779a;
                                        view3.postOnAnimationDelayed(runnableC1466d2, j8);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1472j.f18887l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC1466d runnableC1466d3 = new RunnableC1466d(c1472j, arrayList7, 2);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC1466d3.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j8 = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c1472j.f18783e : 0L, zIsEmpty3 ? 0L : c1472j.f18784f) + j8;
                                        View view4 = ((m0) arrayList7.get(0)).itemView;
                                        WeakHashMap weakHashMap3 = k1.S.f38779a;
                                        view4.postOnAnimationDelayed(runnableC1466d3, jMax);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.mPostedAnimatorRunner = false;
                break;
        }
    }
}
