package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.R;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class i8 {
    public static final int[] h = {R.drawable.ic_play, R.drawable.ic_nav_view, R.drawable.ic_settings};
    public static final String[] i = {"Điều khiển", "Xem", "Cài đặt"};
    public final MainActivity a;
    public final h8 b;
    public LinearLayout e;
    public LinearLayout f;
    public final ImageView[] c = new ImageView[3];
    public final TextView[] d = new TextView[3];
    public int g = 0;

    public i8(MainActivity mainActivity, h8 h8Var) {
        this.a = mainActivity;
        this.b = h8Var;
    }

    public final void a() {
        int i2 = 0;
        while (i2 < 3) {
            int i3 = i2 == this.g ? 1 : 0;
            ImageView imageView = this.c[i2];
            if (imageView != null) {
                imageView.setColorFilter(i3 != 0 ? d8.a() : d8.p());
            }
            TextView[] textViewArr = this.d;
            TextView textView = textViewArr[i2];
            if (textView != null) {
                textView.setTextColor(i3 != 0 ? d8.a() : d8.p());
                textViewArr[i2].setTypeface(d8.f(this.a, i3));
            }
            i2++;
        }
    }
}
