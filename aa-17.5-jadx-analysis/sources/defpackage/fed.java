package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fed extends fgc {
    private static final String[] a = {"android:changeScroll:x", "android:changeScroll:y"};

    private static final void f(fgo fgoVar) {
        Integer numValueOf = Integer.valueOf(fgoVar.b.getScrollX());
        Map map = fgoVar.a;
        map.put("android:changeScroll:x", numValueOf);
        map.put("android:changeScroll:y", Integer.valueOf(fgoVar.b.getScrollY()));
    }

    @Override // defpackage.fgc
    public final Animator a(ViewGroup viewGroup, fgo fgoVar, fgo fgoVar2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (fgoVar == null || fgoVar2 == null) {
            return null;
        }
        View view = fgoVar2.b;
        Map map = fgoVar.a;
        int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
        Map map2 = fgoVar2.a;
        int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return dat.h(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    @Override // defpackage.fgc
    public final void b(fgo fgoVar) {
        f(fgoVar);
    }

    @Override // defpackage.fgc
    public final void c(fgo fgoVar) {
        f(fgoVar);
    }

    @Override // defpackage.fgc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fgc
    public final String[] e() {
        return a;
    }
}
