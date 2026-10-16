package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import java.util.List;

/* loaded from: classes.dex */
public final class lf {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int k;
    public boolean m;
    public boolean a = true;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public List l = null;

    public final View a(me meVar) {
        List list = this.l;
        if (list == null) {
            View viewN = meVar.n(this.d);
            this.d += this.e;
            return viewN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((mo) this.l.get(i)).a;
            ma maVar = (ma) view.getLayoutParams();
            if (!maVar.fR() && this.d == maVar.fP()) {
                b(view);
                return view;
            }
        }
        return null;
    }

    public final void b(View view) {
        int iFP;
        int size = this.l.size();
        int i = 0;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        View view2 = null;
        while (true) {
            if (i >= size) {
                break;
            }
            View view3 = ((mo) this.l.get(i)).a;
            ma maVar = (ma) view3.getLayoutParams();
            if (view3 != view && !maVar.fR() && (iFP = (maVar.fP() - this.d) * this.e) >= 0 && iFP < i2) {
                if (iFP == 0) {
                    view2 = view3;
                    break;
                } else {
                    view2 = view3;
                    i2 = iFP;
                }
            }
            i++;
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((ma) view2.getLayoutParams()).fP();
        }
    }

    public final boolean c(ml mlVar) {
        int i = this.d;
        return i >= 0 && i < mlVar.a();
    }
}
