package Va;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* renamed from: Va.bb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0922bb extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0935cb f14046a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0922bb(C0935cb c0935cb, Context context) {
        super(context);
        this.f14046a = c0935cb;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0935cb c0935cb = this.f14046a;
        int i5 = C0935cb.f14076g + 65;
        C0935cb.f14075f = i5 % 128;
        int i10 = i5 % 2;
        c0935cb.x(motionEvent);
        if (i10 == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        throw null;
    }
}
