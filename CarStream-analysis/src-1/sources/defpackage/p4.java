package defpackage;

import android.webkit.JavascriptInterface;
import android.widget.TextView;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class p4 {
    public final /* synthetic */ q4 a;

    public p4(q4 q4Var) {
        this.a = q4Var;
    }

    @JavascriptInterface
    public void setScore(int i) {
        q4 q4Var = this.a;
        q4Var.k = i;
        TextView textView = q4Var.h;
        if (textView != null) {
            textView.post(new f(this, 18));
        }
    }
}
