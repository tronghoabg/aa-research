package android.support.v7.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f1190a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eh f1191b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f1192c;

    bx(eh ehVar, ArrayList arrayList, int i2) {
        this.f1192c = i2;
        this.f1191b = ehVar;
        this.f1190a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f1192c;
        int i3 = 0;
        if (i2 == 0) {
            ArrayList arrayList = this.f1190a;
            int size = arrayList.size();
            while (i3 < size) {
                cd cdVar = (cd) arrayList.get(i3);
                eh ehVar = this.f1191b;
                fe feVar = cdVar.f1216a;
                View view = feVar == null ? null : feVar.itemView;
                fe feVar2 = cdVar.f1217b;
                View view2 = feVar2 != null ? feVar2.itemView : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(ehVar.a());
                    ehVar.f1399h.add(cdVar.f1216a);
                    duration.translationX(cdVar.f1220e - cdVar.f1218c);
                    duration.translationY(cdVar.f1221f - cdVar.f1219d);
                    duration.alpha(0.0f).setListener(new cb(ehVar, cdVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    ehVar.f1399h.add(cdVar.f1217b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(ehVar.a()).alpha(1.0f).setListener(new cc(ehVar, cdVar, viewPropertyAnimatorAnimate, view2)).start();
                }
                i3++;
            }
            arrayList.clear();
            this.f1191b.f1395d.remove(arrayList);
            return;
        }
        ArrayList arrayList2 = this.f1190a;
        if (i2 != 1) {
            int size2 = arrayList2.size();
            while (i3 < size2) {
                fe feVar3 = (fe) arrayList2.get(i3);
                eh ehVar2 = this.f1191b;
                View view3 = feVar3.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                ehVar2.f1396e.add(feVar3);
                viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(120L).setListener(new bz(ehVar2, feVar3, view3, viewPropertyAnimatorAnimate2)).start();
                i3++;
            }
            arrayList2.clear();
            this.f1191b.f1393b.remove(arrayList2);
            return;
        }
        int size3 = arrayList2.size();
        while (i3 < size3) {
            ce ceVar = (ce) arrayList2.get(i3);
            eh ehVar3 = this.f1191b;
            fe feVar4 = ceVar.f1222a;
            int i4 = ceVar.f1223b;
            int i5 = ceVar.f1224c;
            int i6 = ceVar.f1225d;
            int i7 = ceVar.f1226e;
            View view4 = feVar4.itemView;
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (i8 != 0) {
                view4.animate().translationX(0.0f);
            }
            if (i9 != 0) {
                view4.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
            ehVar3.f1397f.add(feVar4);
            viewPropertyAnimatorAnimate3.setDuration(250L).setListener(new ca(ehVar3, feVar4, i8, view4, i9, viewPropertyAnimatorAnimate3)).start();
            i3++;
        }
        arrayList2.clear();
        this.f1191b.f1394c.remove(arrayList2);
    }
}
