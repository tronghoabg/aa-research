package Va;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes4.dex */
public final class K7 implements X9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13479a = 1;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13480b;

    public /* synthetic */ K7() {
    }

    @Override // Va.X9
    public final boolean a(Y9 y92, View view, MotionEvent motionEvent) {
        switch (this.f13479a) {
            case 0:
                O o7 = new O(1);
                o7.f13562g = this;
                o7.f13559d = y92;
                o7.f13560e = view;
                o7.f13561f = motionEvent;
                Cb.j(o7);
                return false;
            default:
                C0935cb c0935cb = (C0935cb) this.f13480b;
                int i5 = C0935cb.f14076g + 65;
                C0935cb.f14075f = i5 % 128;
                int i10 = i5 % 2;
                c0935cb.x(motionEvent);
                if (i10 == 0) {
                    return true;
                }
                throw null;
        }
    }

    public K7(X9 x92) {
        this.f13480b = x92;
    }
}
