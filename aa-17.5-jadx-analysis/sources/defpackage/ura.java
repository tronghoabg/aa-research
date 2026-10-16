package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class ura implements utr {
    final /* synthetic */ tvc a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ura(Object obj, tvc tvcVar, int i) {
        this.c = i;
        this.a = tvcVar;
        this.b = obj;
    }

    @Override // defpackage.utr
    public final boolean a(MotionEvent motionEvent, utq utqVar) {
        int i = this.c;
        Object obj = this.b;
        if (i != 0) {
            View view = ((uga) obj).a;
            if (!view.isEnabled() || !view.isClickable()) {
                return false;
            }
            if (this.a.d(motionEvent)) {
                return true;
            }
            return utqVar.a(motionEvent);
        }
        View view2 = ((urb) obj).a;
        if (!view2.isEnabled() || !view2.isClickable()) {
            return false;
        }
        if (this.a.d(motionEvent)) {
            return true;
        }
        return utqVar.a(motionEvent);
    }

    @Override // defpackage.utr
    public final boolean b(MotionEvent motionEvent) {
        int i = this.c;
        Object obj = this.b;
        if (i != 0) {
            View view = ((uga) obj).a;
            if (!view.isEnabled() || !view.isClickable()) {
                return false;
            }
            this.a.e(motionEvent);
            return true;
        }
        View view2 = ((urb) obj).a;
        if (!view2.isEnabled() || !view2.isClickable()) {
            return false;
        }
        this.a.e(motionEvent);
        return true;
    }
}
