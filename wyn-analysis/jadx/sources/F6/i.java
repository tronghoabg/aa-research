package F6;

import G6.C0546j;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public final class i extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C0546j f3966a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3967b;

    public i(Context context, String str, String str2, String str3) {
        super(context);
        C0546j c0546j = new C0546j(context);
        c0546j.f4603c = str;
        this.f3966a = c0546j;
        c0546j.f4605e = str2;
        c0546j.f4604d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3967b) {
            return false;
        }
        this.f3966a.a(motionEvent);
        return false;
    }
}
