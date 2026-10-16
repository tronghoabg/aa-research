package B9;

import J9.C0656o;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import q.C3843w;
import q.F0;
import z9.EnumC4624C;
import z9.InterfaceC4626E;

/* loaded from: classes4.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1620b;

    public /* synthetic */ c(Object obj, int i5) {
        this.f1619a = i5;
        this.f1620b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C3843w c3843w;
        switch (this.f1619a) {
            case 0:
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                d dVar = (d) this.f1620b;
                InterfaceC4626E interfaceC4626E = dVar.f1625h.k;
                if (interfaceC4626E != null) {
                    ((C0656o) interfaceC4626E).f(EnumC4624C.f48421a);
                }
                Activity activity = dVar.f1623f;
                f fVar = dVar.f1625h;
                fVar.getClass();
                D9.e.a("Dismissing fiam");
                fVar.e(activity);
                fVar.f1636j = null;
                fVar.k = null;
                return true;
            default:
                int action = motionEvent.getAction();
                int x5 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                F0 f02 = (F0) this.f1620b;
                if (action == 0 && (c3843w = f02.f43651z) != null && c3843w.isShowing() && x5 >= 0 && x5 < f02.f43651z.getWidth() && y10 >= 0 && y10 < f02.f43651z.getHeight()) {
                    f02.f43647v.postDelayed(f02.f43643r, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                f02.f43647v.removeCallbacks(f02.f43643r);
                return false;
        }
    }
}
