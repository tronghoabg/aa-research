package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;
import com.carstream.tech.car.ui.CarEditText;
import com.carstream.tech.launcher.Ui;
import com.google.android.gms.car.input.InputManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class fd {
    public final e a;
    public FrameLayout b;
    public LinearLayout c;
    public CarEditText d;
    public boolean e;
    public boolean f;

    public fd(e eVar) {
        this.a = eVar;
    }

    public static TextView b(Context context, String str, boolean z, View.OnClickListener onClickListener) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setGravity(17);
        textView.setTypeface(d8.f(context, 1));
        textView.setTextSize(2, 18.0f);
        textView.setTextColor(z ? d8.k() : d8.o());
        float f = 22;
        float f2 = 12;
        textView.setPadding(k1.g(context, f), k1.g(context, f2), k1.g(context, f), k1.g(context, f2));
        k1.B(textView, z ? d8.a() : k1.x(), false, k1.g(context, Ui.R_PILL));
        textView.setOnClickListener(onClickListener);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = k1.g(context, 10);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final void a() {
        CarScreen carScreen = this.a.b;
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.e = false;
        InputManager inputManager = carScreen.host() != null ? carScreen.host().getInputManager() : null;
        if (inputManager != null && inputManager.isInputActive()) {
            inputManager.stopInput();
        }
        carScreen.js("if(window.__cntWebDangNhap){window.__cntWebDangNhap(false);}");
        carScreen.traTieuDiemVeTrang();
    }

    public final View c() {
        if (this.b == null) {
            CarScreen carScreen = this.a.b;
            FrameLayout frameLayout = new FrameLayout(carScreen);
            frameLayout.setVisibility(8);
            frameLayout.setClickable(false);
            LinearLayout linearLayout = new LinearLayout(carScreen);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.c.setGravity(16);
            LinearLayout linearLayout2 = this.c;
            int iN = d8.n();
            int iX = k1.x();
            float f = 2;
            int iG = k1.g(carScreen, f);
            int iG2 = k1.g(carScreen, 22);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(iN);
            gradientDrawable.setCornerRadius(iG2);
            gradientDrawable.setStroke(iG, iX);
            linearLayout2.setBackground(gradientDrawable);
            float f2 = 10;
            this.c.setElevation(k1.g(carScreen, f2));
            int iG3 = k1.g(carScreen, 12);
            this.c.setPadding(iG3, iG3, iG3, iG3);
            CarEditText carEditText = new CarEditText(carScreen);
            this.d = carEditText;
            carEditText.setSingleLine(true);
            this.d.setTextColor(d8.o());
            this.d.setHintTextColor(d8.p());
            this.d.setHint("Gõ vào ô của trang");
            this.d.setTextSize(2, 20.0f);
            CarEditText carEditText2 = this.d;
            int iE = d8.e();
            int iX2 = k1.x();
            int iG4 = k1.g(carScreen, f);
            int iG5 = k1.g(carScreen, Ui.R_PILL);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(iE);
            gradientDrawable2.setCornerRadius(iG5);
            gradientDrawable2.setStroke(iG4, iX2);
            carEditText2.setBackground(gradientDrawable2);
            float f3 = 18;
            this.d.setPadding(k1.g(carScreen, f3), k1.g(carScreen, f2), k1.g(carScreen, f3), k1.g(carScreen, f2));
            this.d.addTextChangedListener(new m(this, 3));
            this.c.addView(this.d, new LinearLayout.LayoutParams(0, -2, 1.0f));
            this.c.addView(b(carScreen, "Xong", true, new ed(this, 0)));
            this.c.addView(b(carScreen, "Phím", false, new ed(this, 1)));
            this.c.addView(b(carScreen, "Đóng", false, new ed(this, 2)));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            int iG6 = k1.g(carScreen, 14);
            layoutParams.setMargins(iG6, iG6, iG6, 0);
            this.c.setLayoutParams(layoutParams);
            frameLayout.addView(this.c, layoutParams);
            this.b = frameLayout;
        }
        return this.b;
    }
}
