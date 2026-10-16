package android.support.v7.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.widget.dn;
import android.view.MenuItem;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class i implements dn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f795a;

    i(k kVar) {
        this.f795a = kVar;
    }

    @Override // android.support.v7.widget.dn
    public final void a(q qVar, MenuItem menuItem) {
        k kVar = this.f795a;
        Handler handler = kVar.f799a;
        handler.removeCallbacksAndMessages(null);
        List list = kVar.f800b;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (qVar == ((j) list.get(i2)).f797b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        handler.postAtTime(new h(this, i3 < list.size() ? (j) list.get(i3) : null, menuItem, qVar), qVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // android.support.v7.widget.dn
    public final void b(q qVar, MenuItem menuItem) {
        this.f795a.f799a.removeCallbacksAndMessages(qVar);
    }
}
