package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.car.ui.CarEditText;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class w9 {
    public final Context a;
    public final q9 b;
    public FrameLayout c;
    public LinearLayout d;
    public FrameLayout.LayoutParams e;
    public int f;
    public CarEditText g;
    public v9 h;
    public TextView i;
    public ImageView j;

    public w9(Context context, q9 q9Var) {
        this.a = context;
        this.b = q9Var;
    }

    public static GradientDrawable a(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i4);
        gradientDrawable.setStroke(i3, i2);
        return gradientDrawable;
    }

    public static int b() {
        return d8.j(k1.h ? 700 : 400);
    }

    public final int c() {
        return Math.max(d(86), d8.g(this.a, 46));
    }

    public final int d(int i) {
        return d8.g(this.a, Math.round(i * 0.6f));
    }

    public final float e(float f) {
        return Math.max(d8.l(this.a, 0.72f) * f * 0.6f, 11.0f);
    }
}
