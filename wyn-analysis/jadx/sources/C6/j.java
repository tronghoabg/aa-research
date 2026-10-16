package C6;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class j implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1842a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f1842a) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
