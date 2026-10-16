package defpackage;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes2.dex */
final class sds extends LinkMovementMethod {
    final /* synthetic */ sdt a;

    public sds(sdt sdtVar) {
        this.a = sdtVar;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod
    protected final boolean handleMovementKey(TextView textView, Spannable spannable, int i, int i2, KeyEvent keyEvent) {
        this.a.a();
        return super.handleMovementKey(textView, spannable, i, i2, keyEvent);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.a.a();
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
