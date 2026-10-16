package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import com.google.android.projection.gearhead.R;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fdw extends fgc {
    private boolean F;
    private static final String[] a = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property z = new fdn(PointF.class);
    private static final Property A = new fdo(PointF.class);
    private static final Property B = new fdp(PointF.class);
    private static final Property C = new fdq(PointF.class);
    private static final Property D = new fdr(PointF.class);
    private static final ffg E = new ffg();

    public fdw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.c);
        boolean zT = dlz.t(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        this.F = zT;
    }

    private final void f(fgo fgoVar) {
        View view = fgoVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map map = fgoVar.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", fgoVar.b.getParent());
        if (this.F) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // defpackage.fgc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.ViewGroup r23, defpackage.fgo r24, defpackage.fgo r25) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdw.a(android.view.ViewGroup, fgo, fgo):android.animation.Animator");
    }

    @Override // defpackage.fgc
    public final void b(fgo fgoVar) {
        f(fgoVar);
    }

    @Override // defpackage.fgc
    public final void c(fgo fgoVar) {
        Rect rect;
        f(fgoVar);
        if (!this.F || (rect = (Rect) fgoVar.b.getTag(R.id.transition_clip)) == null) {
            return;
        }
        fgoVar.a.put("android:changeBounds:clip", rect);
    }

    @Override // defpackage.fgc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fgc
    public final String[] e() {
        return a;
    }

    public fdw() {
        this.F = false;
    }
}
