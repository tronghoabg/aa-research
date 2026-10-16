package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.R;
import com.carstream.tech.launcher.Ui;
import com.carstream.tech.phone.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class v3 {
    public final MainActivity a;
    public LinearLayout b;
    public View c;
    public TextView d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public View k;
    public ImageView l;
    public TextView m;
    public ImageView n;
    public TextView o;
    public final ArrayList p = new ArrayList();
    public final e1 q = new e1();
    public int r = -1;
    public final h2 s = new h2(this, 1);

    public v3(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public static String a(long j) {
        if (j <= 0) {
            return "0:00";
        }
        long j2 = j / 1000;
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        return j3 + ":" + (j4 < 10 ? "0" : "") + j4;
    }

    public static LinearLayout.LayoutParams b(int i, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = i;
        layoutParams.leftMargin = i2;
        layoutParams.bottomMargin = i3;
        return layoutParams;
    }

    public final TextView c(String str) {
        TextView textView = new TextView(this.a);
        textView.setText(str);
        textView.setTypeface(Typeface.MONOSPACE);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(d8.p());
        return textView;
    }

    public final ImageView d(int i, int i2, int i3, int i4, View.OnClickListener onClickListener) {
        MainActivity mainActivity = this.a;
        ImageView imageView = new ImageView(mainActivity);
        imageView.setImageResource(i);
        imageView.setColorFilter(i4);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        k1.B(imageView, i3, true, 0);
        imageView.setOnClickListener(onClickListener);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(d8.g(mainActivity, i2), d8.g(mainActivity, i2)));
        return imageView;
    }

    public final void e() {
        boolean z;
        if (this.b == null) {
            return;
        }
        Iterator it = z6.e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((w6) it.next()).c) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        k1.B(this.c, z ? d8.c(600) : d8.j(500), true, 0);
        w6 w6VarE = z6.e();
        String strQ = (w6VarE == null || !w6VarE.c) ? "" : z6.q(w6VarE);
        this.d.setText(!z ? "Chưa mở" : strQ.isEmpty() ? "Đang mở" : strQ);
        TextView textView = this.f;
        w6 w6VarL = z6.l();
        textView.setText((w6VarL == null ? "" : w6VarL.n).toUpperCase());
        String strM = z6.m();
        TextView textView2 = this.g;
        if (strM == null || strM.isEmpty()) {
            strM = "Chưa phát gì";
        }
        textView2.setText(strM);
        this.h.setText(z ? "" : "Mở CarStream trên màn hình xe");
        k1.B(this.c, !z ? d8.j(500) : strQ.equals("CarStream Full") ? d8.b(600) : d8.c(600), true, 0);
        String strX = z6.x();
        Bitmap bitmap = null;
        if (strX == null || strX.isEmpty()) {
            this.e.setImageDrawable(null);
        } else {
            e1 e1Var = this.q;
            ImageView imageView = this.e;
            if (e1Var.c != null && strX.equals(e1Var.b)) {
                bitmap = e1Var.c;
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                e1Var.a(strX, new c1(imageView, 0));
            }
        }
        long jO = z6.o(z6.l());
        long jK = z6.k();
        this.i.setText(a(jO));
        this.j.setText(a(jK));
        int iMax = Math.max(0, Math.min(100, jK > 0 ? (int) ((jO * 100) / jK) : 0));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k.getLayoutParams();
        layoutParams.weight = iMax;
        this.k.setLayoutParams(layoutParams);
        View childAt = ((LinearLayout) this.k.getParent()).getChildAt(1);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
        layoutParams2.weight = 100 - iMax;
        childAt.setLayoutParams(layoutParams2);
        this.l.setImageResource(z6.b ? R.drawable.ic_pause : R.drawable.ic_play);
        TextView textView3 = this.m;
        int i = this.r;
        textView3.setText(i < 0 ? "--" : String.valueOf(i));
        this.m.setTextColor(w7.b ? d8.b(700) : d8.o());
        this.n.setImageResource(xc.q(w7.g()));
        TextView textView4 = this.o;
        if (textView4 != null) {
            textView4.setText(w7.k(this.a)[1]);
        }
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            TextView textView5 = (TextView) this.p.get(i2);
            String strValueOf = String.valueOf(textView5.getTag());
            w6 w6VarL2 = z6.l();
            boolean zEquals = strValueOf.equals(w6VarL2 == null ? "" : w6VarL2.m);
            textView5.setText(zEquals ? "Mở lại" : "Mở");
            textView5.setTextColor(zEquals ? d8.o() : d8.k());
            k1.B(textView5, zEquals ? d8.j(200) : d8.a(), false, d8.g(this.a, Ui.R_PILL));
        }
    }
}
