package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.carstream.tech.launcher.Ui;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class o8 extends LinearLayout {
    public boolean a;
    public final View b;

    public o8(Context context, boolean z) {
        super(context);
        setPadding(d8.g(context, 3), d8.g(context, 3), d8.g(context, 3), d8.g(context, 3));
        View view = new View(context);
        this.b = view;
        view.setBackground(k1.c(-1));
        addView(view, new LinearLayout.LayoutParams(d8.g(context, 23), d8.g(context, 23)));
        this.a = z;
        a(false);
    }

    public final void a(boolean z) {
        setBackground(k1.t(this.a ? d8.a() : d8.j(300), d8.g(getContext(), Ui.R_PILL)));
        GradientDrawable gradientDrawableC = k1.c(this.a ? -1 : d8.p());
        View view = this.b;
        view.setBackground(gradientDrawableC);
        float fG = this.a ? d8.g(getContext(), 21) : 0.0f;
        if (z) {
            view.animate().translationX(fG).setDuration(140L).start();
        } else {
            view.setTranslationX(fG);
        }
    }
}
