package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class qto extends qtn {
    final WeakReference c;

    public qto(View view, int i, long j) {
        super(i, j);
        this.c = new WeakReference(view);
    }
}
