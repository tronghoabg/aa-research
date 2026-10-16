package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
final class qha implements qhg {
    private final /* synthetic */ int a;
    private final View b;

    public qha(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.qhg
    public final void a(int i) {
        if (this.a == 0) {
            ((TextView) this.b).setTextColor(i);
        } else {
            ((ImageView) this.b).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }
}
