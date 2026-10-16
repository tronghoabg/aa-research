package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class i0 {
    public final Context a;
    public final Runnable b;
    public final k0 c;
    public final LinearLayout d;
    public boolean e = false;
    public String f = "";
    public LinearLayout g;
    public LinearLayout h;
    public EditText i;

    public i0(Context context, Runnable runnable, k0 k0Var) {
        this.a = context;
        this.b = runnable;
        this.c = k0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        a();
    }

    public final void a() {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        Context context = this.a;
        int iG = k1.g(context, 48.0f);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.g = linearLayout2;
        linearLayout2.setOrientation(0);
        this.g.setGravity(48);
        b();
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
        horizontalScrollView.setFadingEdgeLength(k1.g(context, 20.0f));
        horizontalScrollView.addView(this.g, new FrameLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setBackground(k1.t(d8.j(100), k1.g(context, 18.0f)));
        int iG2 = k1.g(context, 8.0f);
        linearLayout3.setPadding(iG2, iG2, iG2, iG2);
        linearLayout3.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k1.g(context, 18.0f) + iG, -2);
        layoutParams.rightMargin = k1.g(context, 10.0f);
        layoutParams.leftMargin = k1.g(context, 10.0f);
        layoutParams.rightMargin = 0;
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(1);
        linearLayout5.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(Math.max(1, k1.g(context, 2.0f)), d8.j(500), k1.g(context, 5.0f), k1.g(context, 4.0f));
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setContentDescription(this.e ? "Đóng danh sách" : "Thêm ứng dụng");
        TextView textView = new TextView(context);
        textView.setText(this.e ? "×" : "+");
        textView.setTextSize(0, iG * 0.5f);
        textView.setTextColor(d8.o());
        textView.setGravity(17);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new g0(this, 0));
        linearLayout5.addView(frameLayout, new LinearLayout.LayoutParams(iG, iG));
        View viewA = k1.a(d8.p(), context, this.e ? "Đóng" : "Thêm");
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = k1.g(context, 6.0f);
        linearLayout5.addView(viewA, layoutParams2);
        linearLayout4.addView(linearLayout5, layoutParams);
        linearLayout.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
        k0 k0Var = this.c;
        if (k0Var.a(context).size() > 12) {
            LinearLayout linearLayout6 = new LinearLayout(context);
            linearLayout6.setOrientation(0);
            linearLayout6.setGravity(16);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = k1.g(context, 8.0f);
            linearLayout6.setLayoutParams(layoutParams3);
            final int i = 0;
            linearLayout6.addView(d("Xóa hết", new Runnable(this) { // from class: f0
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            i0 i0Var = this.b;
                            k0 k0Var2 = i0Var.c;
                            Context context2 = i0Var.a;
                            ArrayList arrayListA = k0Var2.a(context2);
                            int size = arrayListA.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayListA.get(i2);
                                i2++;
                                xc.m(context2, "appHien_" + ((j0) obj).a, false);
                            }
                            if (i0Var.e) {
                                i0Var.b();
                                i0Var.c();
                            } else {
                                i0Var.e = true;
                                i0Var.a();
                            }
                            i0Var.b.run();
                            break;
                        default:
                            i0 i0Var2 = this.b;
                            k0 k0Var3 = i0Var2.c;
                            Context context3 = i0Var2.a;
                            ArrayList arrayListA2 = k0Var3.a(context3);
                            int size2 = arrayListA2.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj2 = arrayListA2.get(i3);
                                i3++;
                                xc.m(context3, "appHien_" + ((j0) obj2).a, true);
                            }
                            i0Var2.b();
                            if (i0Var2.e) {
                                i0Var2.c();
                            }
                            i0Var2.b.run();
                            break;
                    }
                }
            }));
            final int i2 = 1;
            linearLayout6.addView(d("Hiện hết", new Runnable(this) { // from class: f0
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            i0 i0Var = this.b;
                            k0 k0Var2 = i0Var.c;
                            Context context2 = i0Var.a;
                            ArrayList arrayListA = k0Var2.a(context2);
                            int size = arrayListA.size();
                            int i22 = 0;
                            while (i22 < size) {
                                Object obj = arrayListA.get(i22);
                                i22++;
                                xc.m(context2, "appHien_" + ((j0) obj).a, false);
                            }
                            if (i0Var.e) {
                                i0Var.b();
                                i0Var.c();
                            } else {
                                i0Var.e = true;
                                i0Var.a();
                            }
                            i0Var.b.run();
                            break;
                        default:
                            i0 i0Var2 = this.b;
                            k0 k0Var3 = i0Var2.c;
                            Context context3 = i0Var2.a;
                            ArrayList arrayListA2 = k0Var3.a(context3);
                            int size2 = arrayListA2.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj2 = arrayListA2.get(i3);
                                i3++;
                                xc.m(context3, "appHien_" + ((j0) obj2).a, true);
                            }
                            i0Var2.b();
                            if (i0Var2.e) {
                                i0Var2.c();
                            }
                            i0Var2.b.run();
                            break;
                    }
                }
            }));
            linearLayout.addView(linearLayout6);
        }
        if (this.e) {
            LinearLayout linearLayout7 = new LinearLayout(context);
            linearLayout7.setOrientation(1);
            linearLayout7.setBackground(k1.t(d8.j(100), k1.g(context, 16.0f)));
            int iG3 = k1.g(context, 6.0f);
            linearLayout7.setPadding(iG3, iG3, iG3, iG3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.topMargin = k1.g(context, 10.0f);
            linearLayout7.setLayoutParams(layoutParams4);
            if (k0Var.a(context).size() > 12) {
                EditText editText = new EditText(context);
                this.i = editText;
                editText.setHint("Tìm ứng dụng…");
                this.i.setText(this.f);
                this.i.setSingleLine(true);
                this.i.setTextSize(2, 15.0f);
                int iG4 = k1.g(context, 10.0f);
                this.i.setPadding(iG4, iG4, iG4, iG4);
                this.i.setBackground(k1.t(d8.n(), k1.g(context, 12.0f)));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.bottomMargin = k1.g(context, 6.0f);
                this.i.setLayoutParams(layoutParams5);
                this.i.addTextChangedListener(new m(this, 1));
                linearLayout7.addView(this.i);
            } else {
                this.i = null;
            }
            LinearLayout linearLayout8 = new LinearLayout(context);
            this.h = linearLayout8;
            linearLayout8.setOrientation(1);
            linearLayout7.addView(this.h);
            c();
            linearLayout.addView(linearLayout7);
        }
    }

    public final void b() {
        int i;
        ArrayList arrayList;
        boolean z;
        int i2;
        this.g.removeAllViews();
        Context context = this.a;
        int iG = k1.g(context, 48.0f);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayListA = this.c.a(context);
        int size = arrayListA.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= size) {
                break;
            }
            Object obj = arrayListA.get(i4);
            i4++;
            j0 j0Var = (j0) obj;
            if (xc.e(context, "appHien_" + j0Var.a, true)) {
                arrayList2.add(j0Var);
            }
        }
        boolean z2 = arrayList2.size() <= 1;
        if (arrayList2.isEmpty()) {
            TextView textView = new TextView(context);
            textView.setText("Chưa hiện app nào — bấm “+” để thêm.");
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(d8.p());
            textView.setGravity(16);
            textView.setPadding(k1.g(context, 6.0f), 0, k1.g(context, 6.0f), 0);
            this.g.addView(textView);
            return;
        }
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            j0 j0Var2 = (j0) obj2;
            LinearLayout linearLayout = this.g;
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(i);
            linearLayout2.setGravity(i);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            Drawable drawable = j0Var2.d;
            String str = j0Var2.b;
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(iG, iG));
            if (z2) {
                arrayList = arrayList2;
                z = z2;
                i2 = size2;
            } else {
                int iRound = Math.round(iG * 0.42f);
                FrameLayout frameLayout2 = new FrameLayout(context);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(i);
                gradientDrawable.setColor(d8.a());
                arrayList = arrayList2;
                gradientDrawable.setStroke(Math.max(1, k1.g(context, 2.0f)), d8.n());
                frameLayout2.setBackground(gradientDrawable);
                View view = new View(context);
                view.setBackgroundColor(d8.k());
                z = z2;
                i2 = size2;
                frameLayout2.addView(view, new FrameLayout.LayoutParams(Math.round(iRound * 0.42f), Math.max(1, k1.g(context, 2.0f)), 17));
                frameLayout2.setContentDescription("Bỏ " + str + " khỏi danh sách");
                frameLayout2.setOnClickListener(new h0(0, this, j0Var2));
                frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(iRound, iRound, 8388661));
            }
            linearLayout2.addView(frameLayout, new LinearLayout.LayoutParams(iG, iG));
            View viewA = k1.a(d8.o(), context, str);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = k1.g(context, 6.0f);
            linearLayout2.addView(viewA, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(k1.g(context, 18.0f) + iG, -2);
            layoutParams2.rightMargin = k1.g(context, 10.0f);
            linearLayout.addView(linearLayout2, layoutParams2);
            z2 = z;
            arrayList2 = arrayList;
            size2 = i2;
            i = 1;
        }
    }

    public final void c() {
        float f;
        LinearLayout linearLayout = this.h;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        String str = this.f;
        String lowerCase = str == null ? "" : str.trim().toLowerCase();
        k0 k0Var = this.c;
        Context context = this.a;
        ArrayList arrayListA = k0Var.a(context);
        int size = arrayListA.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListA.get(i4);
            i4++;
            j0 j0Var = (j0) obj;
            boolean zE = xc.e(context, "appHien_" + j0Var.a, true);
            String str2 = j0Var.b;
            if (!zE) {
                i2++;
                if (lowerCase.length() <= 0 || str2.toLowerCase().contains(lowerCase)) {
                    i3++;
                    LinearLayout linearLayout2 = this.h;
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(i);
                    linearLayout3.setGravity(16);
                    int iG = k1.g(context, 8.0f);
                    linearLayout3.setPadding(iG, iG, iG, iG);
                    int iG2 = k1.g(context, 32.0f);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(j0Var.d);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    linearLayout3.addView(imageView, new LinearLayout.LayoutParams(iG2, iG2));
                    LinearLayout linearLayout4 = new LinearLayout(context);
                    linearLayout4.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str2);
                    textView.setTextSize(2, 15.0f);
                    textView.setTypeface(null, 1);
                    textView.setTextColor(d8.o());
                    linearLayout4.addView(textView);
                    String str3 = j0Var.c;
                    if (str3.length() > 0) {
                        TextView textView2 = new TextView(context);
                        textView2.setText(str3);
                        f = 12.0f;
                        textView2.setTextSize(2, 12.0f);
                        textView2.setTextColor(d8.p());
                        linearLayout4.addView(textView2);
                    } else {
                        f = 12.0f;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    layoutParams.leftMargin = k1.g(context, f);
                    linearLayout3.addView(linearLayout4, layoutParams);
                    int iG3 = k1.g(context, 32.0f);
                    TextView textView3 = new TextView(context);
                    textView3.setText("+");
                    textView3.setTextSize(2, 18.0f);
                    textView3.setGravity(17);
                    textView3.setTextColor(d8.k());
                    textView3.setBackground(k1.t(d8.a(), k1.g(context, 999.0f)));
                    linearLayout3.addView(textView3, new LinearLayout.LayoutParams(iG3, iG3));
                    linearLayout3.setOnClickListener(new h0(1, this, j0Var));
                    linearLayout2.addView(linearLayout3);
                    i = 0;
                    lowerCase = lowerCase;
                }
            }
        }
        if (i2 == 0 || i3 == 0) {
            TextView textView4 = new TextView(context);
            textView4.setText(i2 == 0 ? "Đã hiện tất cả ứng dụng." : "Không tìm thấy ứng dụng nào.");
            textView4.setTextSize(2, 14.0f);
            textView4.setTextColor(d8.p());
            int iG4 = k1.g(context, 12.0f);
            textView4.setPadding(iG4, iG4, iG4, iG4);
            this.h.addView(textView4);
        }
    }

    public final TextView d(String str, Runnable runnable) {
        Context context = this.a;
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(null, 1);
        textView.setTextColor(d8.a());
        int iG = k1.g(context, 12.0f);
        int iG2 = k1.g(context, 8.0f);
        textView.setPadding(iG, iG2, iG, iG2);
        textView.setBackground(k1.t(d8.j(100), k1.g(context, 12.0f)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = k1.g(context, 10.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new g0(runnable, 1));
        return textView;
    }
}
