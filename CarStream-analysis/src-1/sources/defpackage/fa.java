package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;
import com.carstream.tech.car.player.PlayerStyles$Preview;
import com.carstream.tech.core.call.CallWatch;
import com.carstream.tech.core.speed.SpeedStyles$Preview;
import java.util.ArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class fa {
    public final CarScreen a;
    public final boolean b;
    public final e c;
    public LinearLayout d;
    public LinearLayout e;
    public LinearLayout f;
    public TextView k;
    public boolean m;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final Handler l = new Handler(Looper.getMainLooper());

    public fa(CarScreen carScreen, boolean z, e eVar) {
        this.a = carScreen;
        this.b = z;
        this.c = eVar;
    }

    public final TextView a(String str, String str2) {
        CarScreen carScreen = this.a;
        boolean zEquals = str2.equals(xc.g(carScreen, "hudText", "viPlain"));
        TextView textView = new TextView(carScreen);
        textView.setText(str);
        textView.setTextSize(0, d8.m(carScreen, 15.0f));
        textView.setTextColor(zEquals ? d8.k() : d8.o());
        textView.setGravity(17);
        int iG = k1.g(carScreen, 12.0f);
        textView.setPadding(iG, iG, iG, iG);
        textView.setBackground(k1.t(zEquals ? d8.a() : d8.n(), k1.g(carScreen, 12.0f)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.rightMargin = k1.g(carScreen, 8.0f);
        textView.setLayoutParams(layoutParams);
        textView.setTag(str2);
        textView.setOnClickListener(new da(this, str2, 0));
        this.g.add(textView);
        return textView;
    }

    public final TextView b(String str) {
        CarScreen carScreen = this.a;
        TextView textView = new TextView(carScreen);
        textView.setText(str);
        textView.setTextSize(0, d8.m(carScreen, 14.0f));
        textView.setTextColor(d8.p());
        textView.setIncludeFontPadding(true);
        textView.setPadding(0, k1.g(carScreen, 4.0f), 0, k1.g(carScreen, 4.0f));
        return textView;
    }

    public final void c() {
        CarScreen carScreen = this.a;
        String strG = xc.g(carScreen, "playerStyle", "pill");
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            k1.B(view, strG.equals(view.getTag()) ? d8.a() : k1.x(), false, k1.g(carScreen, 14.0f));
        }
    }

    public final void d() {
        CarScreen carScreen = this.a;
        String strG = xc.g(carScreen, "speedStyle", "pill");
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            boolean zEquals = strG.equals(view.getTag());
            GradientDrawable gradientDrawableT = k1.t(zEquals ? k1.x() : d8.n(), k1.g(carScreen, 18.0f));
            gradientDrawableT.setStroke(k1.g(carScreen, zEquals ? 3.0f : 1.0f), zEquals ? d8.a() : k1.h ? 587198950 : 523902226);
            view.setBackground(gradientDrawableT);
            View childAt = ((LinearLayout) view).getChildAt(1);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(zEquals ? d8.a() : d8.o());
            }
        }
    }

    public final void e() {
        CarScreen carScreen = this.a;
        String strG = xc.g(carScreen, "toolbarMode", "auto");
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            boolean zEquals = strG.equals(view.getTag());
            ((TextView) view).setTextColor(zEquals ? d8.k() : d8.o());
            k1.B(view, zEquals ? d8.a() : k1.x(), false, k1.g(carScreen, 14.0f));
        }
    }

    public final void f() {
        float f;
        float f2;
        LinearLayout linearLayout = this.e;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        this.f.removeAllViews();
        ArrayList arrayList = this.j;
        arrayList.clear();
        ArrayList arrayList2 = this.g;
        arrayList2.clear();
        this.e.addView(h("Tốc độ & an toàn"));
        this.e.addView(g("Hiện bong bóng tốc độ", "showSpeed", false));
        this.e.addView(g("Chỉ hiện biển báo & giới hạn (ẩn tốc độ xe)", "speedSignsOnly", false));
        this.e.addView(g("Hiển thị giới hạn tốc độ lên màn hình odo LED", "gaugeOnlyArt", false));
        this.e.addView(g("Thay tên bài bằng giới hạn tốc độ (chữ như HUD)", "limitAsTitle", false));
        this.e.addView(g("Gửi cảnh báo lên HUD / đồng hồ xe", "hudSend", false));
        CarScreen carScreen = this.a;
        if (!"carstream".equals(xc.g(carScreen, "vietmapSource", "widget"))) {
            this.e.addView(g(ad.d("Tự mở ", w7.k(carScreen)[2], " khi thiếu tín hiệu"), "vietmapWatchdog", false));
        }
        TextView textViewB = b(k());
        this.k = textViewB;
        this.e.addView(textViewB);
        int i = 1;
        if (!this.m) {
            this.m = true;
            this.l.postDelayed(new aa(this, 0), 3000L);
        }
        this.e.addView(h("Cuộc gọi"));
        this.e.addView(g("Hiện cuộc gọi Messenger, Zalo… lên màn hình xe", "callBar", false));
        this.e.addView(g("Kêu chuông khi có cuộc gọi (loa điện thoại)", "callRing", true));
        this.e.addView(b(CallWatch.coQuyen(carScreen) ? "Đã cấp quyền đọc thông báo." : "Cần cấp quyền đọc thông báo — cấp trên điện thoại."));
        this.e.addView(h("Ứng dụng"));
        this.e.addView(g("Tự động toàn màn hình khi phát video", "autoFullscreen", true));
        this.e.addView(g("Tự phát kết quả đầu khi tìm giọng nói", "voiceOpenFirst", true));
        this.e.addView(g("Cắt video phủ kín màn hình (mất rìa)", "videoCrop", false));
        this.e.addView(g("Tiết kiệm dữ liệu YouTube (hình 144p)", "ytDataSaver", false));
        this.e.addView(b("Hình xuống mức thấp nhất, tiếng giữ nguyên. Hợp khi nghe nhạc bằng 4G."));
        this.e.addView(g("Mở 2K/4K trên YouTube (VP9/AV1)", "ytHighCodec", false));
        LinearLayout linearLayout2 = this.e;
        DisplayMetrics displayMetrics = carScreen.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        String str = i2 + "x" + i3;
        linearLayout2.addView(b(i3 >= 1440 ? ad.d("Màn xe này ", str, " — đủ sức hiện 2K/4K. Đổi lại tốn 4G và máy nóng hơn.") : ad.d("Cân nhắc: màn xe này ", str, ", chưa đủ độ phân giải cho 2K/4K nên hình không nét thêm, chỉ tốn 4G và máy nóng hơn.")));
        this.e.addView(b("Chọn mục hiện trên thanh ứng dụng:"));
        this.e.addView(new i0(carScreen, new aa(this, 1), new e0()).d);
        this.e.addView(b("Phải giữ lại ít nhất một mục."));
        this.e.addView(g("Hiện mục Trò chơi trên thanh công cụ", "gamesEnabled", true));
        this.e.addView(b("Game chạy sẵn trong app, không cần mạng."));
        this.e.addView(g("Hiện mục Ứng dụng trên thanh công cụ", "launcherEnabled", false));
        this.e.addView(b("Lưới ứng dụng điện thoại trên màn hình xe."));
        this.e.addView(b("Đăng nhập và cấp quyền phải làm trên điện thoại."));
        this.f.addView(h("Thanh công cụ"));
        LinearLayout linearLayout3 = this.f;
        LinearLayout linearLayout4 = new LinearLayout(carScreen);
        linearLayout4.setOrientation(0);
        int i4 = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f3 = 14.0f;
        layoutParams.bottomMargin = k1.g(carScreen, 14.0f);
        linearLayout4.setLayoutParams(layoutParams);
        this.h.clear();
        linearLayout4.addView(j("Cố định", "fixed"));
        linearLayout4.addView(j("Tự động", "auto"));
        linearLayout4.addView(j("Nổi", "float"));
        e();
        linearLayout3.addView(linearLayout4);
        this.f.addView(h("Thanh điều khiển khi toàn màn hình"));
        LinearLayout linearLayout5 = this.f;
        LinearLayout linearLayout6 = new LinearLayout(carScreen);
        linearLayout6.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = k1.g(carScreen, 10.0f);
        linearLayout6.setLayoutParams(layoutParams2);
        ArrayList arrayList3 = this.i;
        arrayList3.clear();
        t8[] t8VarArr = k1.e;
        int i5 = 0;
        while (true) {
            f = 84.0f;
            f2 = 5.0f;
            if (i5 >= 3) {
                break;
            }
            t8 t8Var = t8VarArr[i5];
            LinearLayout linearLayout7 = new LinearLayout(carScreen);
            linearLayout7.setOrientation(i);
            int iG = k1.g(carScreen, 5.0f);
            linearLayout7.setPadding(iG, iG, iG, iG);
            linearLayout7.addView(new PlayerStyles$Preview(carScreen, t8Var.a), new LinearLayout.LayoutParams(-1, k1.g(carScreen, 84.0f)));
            TextView textView = new TextView(carScreen);
            textView.setText(t8Var.b);
            textView.setTextSize(0, d8.m(carScreen, f3));
            textView.setGravity(17);
            textView.setTextColor(d8.o());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = k1.g(carScreen, 4.0f);
            linearLayout7.addView(textView, layoutParams3);
            linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            linearLayout7.setTag(t8Var.a);
            linearLayout7.setOnClickListener(new u0(8, this, t8Var));
            arrayList3.add(linearLayout7);
            linearLayout6.addView(linearLayout7);
            i5++;
            i = 1;
            f3 = 14.0f;
        }
        c();
        linearLayout5.addView(linearLayout6);
        this.f.addView(h("Kiểu bong bóng tốc độ"));
        LinearLayout linearLayout8 = this.f;
        LinearLayout linearLayout9 = new LinearLayout(carScreen);
        linearLayout9.setOrientation(1);
        int i6 = 0;
        while (i6 < 2) {
            LinearLayout linearLayout10 = new LinearLayout(carScreen);
            linearLayout10.setOrientation(0);
            int i7 = 0;
            while (i7 < 4) {
                int i8 = (i6 * 4) + i7;
                if (i8 < 8) {
                    t8 t8Var2 = w1.d[i8];
                    LinearLayout linearLayout11 = new LinearLayout(carScreen);
                    linearLayout11.setOrientation(1);
                    int iG2 = k1.g(carScreen, f2);
                    linearLayout11.setPadding(iG2, iG2, iG2, iG2);
                    linearLayout11.setTag(t8Var2.a);
                    SpeedStyles$Preview speedStyles$Preview = new SpeedStyles$Preview(carScreen, t8Var2.a);
                    speedStyles$Preview.setBackground(k1.t(-15460838, k1.g(carScreen, 12.0f)));
                    linearLayout11.addView(speedStyles$Preview, new LinearLayout.LayoutParams(i4, k1.g(carScreen, f)));
                    TextView textView2 = new TextView(carScreen);
                    textView2.setText(t8Var2.b);
                    textView2.setTextSize(0, d8.m(carScreen, 14.0f));
                    textView2.setGravity(17);
                    textView2.setTextColor(d8.o());
                    textView2.setIncludeFontPadding(true);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i4, -2);
                    layoutParams4.topMargin = k1.g(carScreen, 4.0f);
                    linearLayout11.addView(textView2, layoutParams4);
                    linearLayout11.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                    linearLayout11.setOnClickListener(new u0(9, this, t8Var2));
                    arrayList.add(linearLayout11);
                    linearLayout10.addView(linearLayout11);
                } else {
                    linearLayout10.addView(new View(carScreen), new LinearLayout.LayoutParams(0, 1, 1.0f));
                }
                i7++;
                f = 84.0f;
                i4 = -1;
                f2 = 5.0f;
            }
            i4 = -1;
            linearLayout9.addView(linearLayout10, new LinearLayout.LayoutParams(-1, -2));
            i6++;
            f = 84.0f;
            f2 = 5.0f;
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(i4, -2);
        layoutParams5.bottomMargin = k1.g(carScreen, 10.0f);
        linearLayout9.setLayoutParams(layoutParams5);
        d();
        linearLayout8.addView(linearLayout9);
        this.f.addView(i("Kích thước bong bóng", "speedScale", 60, 220));
        this.f.addView(i("Độ mờ nền bong bóng", "speedAlpha", 20, 100));
        this.f.addView(h("Chữ trên HUD"));
        LinearLayout linearLayout12 = this.f;
        LinearLayout linearLayout13 = new LinearLayout(carScreen);
        linearLayout13.setOrientation(1);
        linearLayout13.setPadding(0, k1.g(carScreen, 4.0f), 0, k1.g(carScreen, 8.0f));
        LinearLayout linearLayout14 = new LinearLayout(carScreen);
        linearLayout14.setOrientation(0);
        arrayList2.clear();
        linearLayout14.addView(a("Không dấu", "viPlain"));
        linearLayout14.addView(a("English", "en"));
        linearLayout14.addView(a("Đủ dấu", "vi"));
        linearLayout14.addView(a("Tách dấu", "viNfd"));
        linearLayout13.addView(linearLayout14);
        linearLayout12.addView(linearLayout13);
        if (this.b) {
            this.f.addView(h("Nâng cao"));
            LinearLayout linearLayout15 = this.f;
            aa aaVar = new aa(this, 2);
            LinearLayout linearLayout16 = new LinearLayout(carScreen);
            linearLayout16.setOrientation(0);
            linearLayout16.setGravity(16);
            linearLayout16.setBackground(k1.t(d8.n(), k1.g(carScreen, 20.0f)));
            int iG3 = k1.g(carScreen, 16.0f);
            linearLayout16.setPadding(iG3, iG3, iG3, iG3);
            LinearLayout linearLayout17 = new LinearLayout(carScreen);
            linearLayout17.setOrientation(1);
            TextView textView3 = new TextView(carScreen);
            textView3.setText("Cấu hình chi tiết");
            textView3.setTextSize(0, d8.m(carScreen, 18.0f));
            textView3.setTextColor(d8.o());
            textView3.setIncludeFontPadding(true);
            linearLayout17.addView(textView3);
            TextView textView4 = new TextView(carScreen);
            textView4.setText("Đăng nhập tài khoản, kích hoạt, và các tuỳ chọn khác");
            textView4.setTextSize(0, d8.m(carScreen, 14.0f));
            textView4.setTextColor(d8.p());
            textView4.setIncludeFontPadding(true);
            linearLayout17.addView(textView4);
            linearLayout16.addView(linearLayout17, new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView5 = new TextView(carScreen);
            textView5.setText("›");
            textView5.setTextSize(0, d8.m(carScreen, 22.0f));
            textView5.setTextColor(d8.p());
            linearLayout16.addView(textView5);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.bottomMargin = k1.g(carScreen, 10.0f);
            linearLayout16.setLayoutParams(layoutParams6);
            linearLayout16.setOnClickListener(new t3(aaVar, 3));
            linearLayout15.addView(linearLayout16);
        }
    }

    public final LinearLayout g(String str, String str2, boolean z) {
        CarScreen carScreen = this.a;
        LinearLayout linearLayout = new LinearLayout(carScreen);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackground(k1.t(d8.n(), k1.g(carScreen, 20.0f)));
        int iG = k1.g(carScreen, 16.0f);
        linearLayout.setPadding(iG, iG, iG, iG);
        TextView textView = new TextView(carScreen);
        textView.setText(str);
        textView.setTextSize(0, d8.m(carScreen, 18.0f));
        textView.setTextColor(d8.o());
        textView.setIncludeFontPadding(true);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        ea eaVar = new ea(carScreen);
        boolean z2 = xc.l(carScreen).getBoolean(xc.h(str2), z);
        if (z2 != eaVar.c) {
            eaVar.c = z2;
            eaVar.invalidate();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k1.g(carScreen, 56.0f), k1.g(carScreen, 32.0f));
        layoutParams.leftMargin = k1.g(carScreen, 16.0f);
        linearLayout.addView(eaVar, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = k1.g(carScreen, 10.0f);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOnClickListener(new ba(this, str2, z, eaVar));
        return linearLayout;
    }

    public final TextView h(String str) {
        CarScreen carScreen = this.a;
        TextView textView = new TextView(carScreen);
        textView.setText(str.toUpperCase());
        textView.setTextSize(0, d8.m(carScreen, 13.0f));
        textView.setTextColor(d8.p());
        textView.setLetterSpacing(0.1f);
        textView.setIncludeFontPadding(true);
        textView.setPadding(0, k1.g(carScreen, 20.0f), 0, k1.g(carScreen, 8.0f));
        return textView;
    }

    public final LinearLayout i(String str, String str2, int i, int i2) {
        CarScreen carScreen = this.a;
        LinearLayout linearLayout = new LinearLayout(carScreen);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, k1.g(carScreen, 8.0f), 0, k1.g(carScreen, 8.0f));
        LinearLayout linearLayout2 = new LinearLayout(carScreen);
        linearLayout2.setOrientation(0);
        TextView textView = new TextView(carScreen);
        textView.setText(str);
        textView.setTextSize(0, d8.m(carScreen, 16.0f));
        textView.setTextColor(d8.o());
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        int i3 = xc.l(carScreen).getInt(xc.h(str2), 100);
        TextView textView2 = new TextView(carScreen);
        textView2.setText(i3 + "%");
        textView2.setTextSize(0, d8.m(carScreen, 16.0f));
        textView2.setTextColor(d8.a());
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        SeekBar seekBar = new SeekBar(carScreen);
        seekBar.setMin(i);
        seekBar.setMax(i2);
        seekBar.setProgress(i3);
        int iG = k1.g(carScreen, 8.0f);
        seekBar.setPadding(seekBar.getPaddingLeft(), iG, seekBar.getPaddingRight(), iG);
        seekBar.setOnSeekBarChangeListener(new ca(this, textView2, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = k1.g(carScreen, 4.0f);
        layoutParams.bottomMargin = k1.g(carScreen, 10.0f);
        linearLayout.addView(seekBar, layoutParams);
        return linearLayout;
    }

    public final TextView j(String str, String str2) {
        CarScreen carScreen = this.a;
        TextView textView = new TextView(carScreen);
        textView.setText(str);
        textView.setTextSize(0, d8.m(carScreen, 17.0f));
        textView.setGravity(17);
        int iG = k1.g(carScreen, 8.0f);
        int iG2 = k1.g(carScreen, 16.0f);
        textView.setPadding(iG, iG2, iG, iG2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.rightMargin = k1.g(carScreen, 8.0f);
        textView.setLayoutParams(layoutParams);
        textView.setTag(str2);
        textView.setOnClickListener(new da(this, str2, 1));
        this.h.add(textView);
        return textView;
    }

    public final String k() {
        String str;
        String str2;
        String strG = xc.g(this.a, "vietmapSource", "widget");
        String str3 = w7.k(this.a)[1];
        if ("carstream".equals(strG)) {
            if (!cb.b(this.a)) {
                return "Nguồn CarStream   ·   chưa có quyền vị trí";
            }
            if (!dc.k) {
                return "Nguồn CarStream   ·   chưa chạy";
            }
            if (dc.l >= 3) {
                return "Nguồn CarStream   ·   chưa lấy được bản đồ";
            }
            int iH = ad.h(w7.l());
            if (iH == 1) {
                return "Nguồn CarStream   ·   mất tín hiệu GPS";
            }
            if (iH != 2) {
                return "Nguồn CarStream   ·   chưa nhận được dữ liệu";
            }
            int iG = w7.g();
            if (iG > 0) {
                str2 = iG + " km/h";
            } else {
                str2 = "đường không có biển";
            }
            return ad.g("Nguồn CarStream   ·   ", str2);
        }
        if ("widget".equals(strG) && xc.f(-1, this.a, "vietmapWidgetId") < 0) {
            return ad.c(str3, "   ·   chưa kết nối widget");
        }
        int iH2 = ad.h(w7.l());
        if (iH2 == 1) {
            return ad.c(str3, "   ·   mất tín hiệu");
        }
        if (iH2 != 2) {
            return ad.c(str3, "   ·   chưa nhận được dữ liệu");
        }
        int iG2 = w7.g();
        if (iG2 > 0) {
            str = iG2 + " km/h";
        } else {
            str = "đường không biển";
        }
        return "Đang nhận từ " + str3 + "   ·   " + str;
    }

    public final View l() {
        if (this.d == null) {
            CarScreen carScreen = this.a;
            LinearLayout linearLayout = new LinearLayout(carScreen);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(d8.e());
            linearLayout.setClickable(true);
            LinearLayout linearLayout2 = new LinearLayout(carScreen);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setBackgroundColor(d8.n());
            int iG = k1.g(carScreen, 12.0f);
            linearLayout2.setPadding(iG, iG, iG, iG);
            TextView textView = new TextView(carScreen);
            textView.setText("Cài đặt");
            textView.setTextSize(0, d8.m(carScreen, 22.0f));
            textView.setTextColor(d8.o());
            textView.setIncludeFontPadding(true);
            textView.setPadding(k1.g(carScreen, 8.0f), 0, 0, 0);
            linearLayout2.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout.addView(linearLayout2);
            int iG2 = k1.g(carScreen, 20.0f);
            int iG3 = k1.g(carScreen, 10.0f);
            LinearLayout linearLayout3 = new LinearLayout(carScreen);
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = new LinearLayout(carScreen);
            this.e = linearLayout4;
            linearLayout4.setOrientation(1);
            this.e.setPadding(iG2, iG2, iG3, iG2);
            ScrollView scrollView = new ScrollView(carScreen);
            scrollView.addView(this.e, new ViewGroup.LayoutParams(-1, -2));
            linearLayout3.addView(scrollView, new LinearLayout.LayoutParams(0, -1, 1.0f));
            LinearLayout linearLayout5 = new LinearLayout(carScreen);
            this.f = linearLayout5;
            linearLayout5.setOrientation(1);
            this.f.setPadding(iG3, iG2, iG2, iG2);
            ScrollView scrollView2 = new ScrollView(carScreen);
            scrollView2.addView(this.f, new ViewGroup.LayoutParams(-1, -2));
            linearLayout3.addView(scrollView2, new LinearLayout.LayoutParams(0, -1, 1.0f));
            linearLayout.addView(linearLayout3, new LinearLayout.LayoutParams(-1, 0, 1.0f));
            f();
            this.d = linearLayout;
        }
        return this.d;
    }
}
