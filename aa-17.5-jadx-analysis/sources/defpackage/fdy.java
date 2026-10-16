package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fdy extends fgc {
    private static final String[] z = {"android:clipBounds:clip"};
    static final Rect a = new Rect();

    private static final void f(fgo fgoVar, boolean z2) {
        View view = fgoVar.b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z2 ? (Rect) view.getTag(R.id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != a ? clipBounds : null;
        Map map = fgoVar.a;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // defpackage.fgc
    public final Animator a(ViewGroup viewGroup, fgo fgoVar, fgo fgoVar2) {
        if (fgoVar == null || fgoVar2 == null) {
            return null;
        }
        Map map = fgoVar.a;
        if (!map.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Map map2 = fgoVar2.a;
        if (!map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        fgoVar2.b.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(fgoVar2.b, (Property<View, V>) fgu.b, new ffg(new Rect()), rect3, rect4);
        fdx fdxVar = new fdx(fgoVar2.b, rect, rect2);
        objectAnimatorOfObject.addListener(fdxVar);
        H(fdxVar);
        return objectAnimatorOfObject;
    }

    @Override // defpackage.fgc
    public final void b(fgo fgoVar) {
        f(fgoVar, false);
    }

    @Override // defpackage.fgc
    public final void c(fgo fgoVar) {
        f(fgoVar, true);
    }

    @Override // defpackage.fgc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fgc
    public final String[] e() {
        return z;
    }
}
