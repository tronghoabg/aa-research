package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class qhb {
    private static final yph d = yph.c("ADU.StatusBarFaderContr");
    public final Context a;
    public float b;
    public int c;
    private final StatusBarView e;
    private final List f;
    private final List g;
    private final List h;
    private int i;
    private int j;
    private int k;
    private final oct l = new oct(new moj(moj.a, 0.25f, 0.5f), (byte[]) null);

    public qhb(Context context, StatusBarView statusBarView) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.h = arrayList2;
        this.a = context;
        this.e = statusBarView;
        ImageView imageView = (ImageView) statusBarView.findViewById(R.id.car_drawer_button);
        TextView textView = (TextView) statusBarView.findViewById(R.id.car_drawer_title);
        ImageView imageView2 = (ImageView) statusBarView.findViewById(R.id.car_mic_button);
        arrayList.add(new qha(imageView, 1));
        arrayList.add(new qha(textView, 0));
        arrayList2.add(new qha(imageView2, 1));
        b(0);
        statusBarView.t = new ykd(this);
    }

    private static final int d(int i, int i2, float f) {
        return (int) (((1.0f - f) * i) + (f * i2));
    }

    private static final void e(List list, int i, int i2, float f) {
        int iD = d(Color.alpha(i), Color.alpha(i2), f);
        int iD2 = d(Color.red(i), Color.red(i2), f);
        int iD3 = d(Color.green(i), Color.green(i2), f);
        int iD4 = d(Color.blue(i), Color.blue(i2), f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qhg qhgVar = (qhg) it.next();
            qhgVar.a((iD2 << 16) | (iD << 24) | (iD3 << 8) | iD4);
        }
    }

    final void a() {
        int color;
        Context context = this.a;
        this.k = context.getColor(R.color.status_bar_drawer_opened);
        this.c = this.j;
        int i = this.i;
        if (i == 0) {
            color = context.getColor(R.color.status_bar_drawer_closed);
        } else if (i == 1) {
            color = context.getColor(R.color.status_bar_drawer_closed_inverse);
        } else if (i == 2) {
            color = context.getColor(R.color.status_bar_drawer_closed_night);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(a.bp(i, "Unknown DayNightStyle: "));
            }
            color = context.getColor(R.color.status_bar_drawer_closed_day);
        }
        this.j = color;
        c(this.b);
    }

    public final void b(int i) {
        ((ype) d.l().ai((char) 7228)).w("setDayNightStyle %d", i);
        this.i = i;
        a();
    }

    public final void c(float f) {
        List list = this.f;
        float fE = this.l.e(f);
        e(list, this.j, this.k, fE);
        e(this.g, this.j, this.c, fE);
        e(this.h, this.e.q != 0 ? this.k : this.j, this.c, fE);
    }
}
