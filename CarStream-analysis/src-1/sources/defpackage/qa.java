package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.carstream.tech.R;
import com.carstream.tech.core.gofa.GofaTap;
import com.carstream.tech.launcher.AppRepo;
import com.carstream.tech.launcher.Ui;
import com.carstream.tech.phone.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class qa {
    public static final String[] m = {"fixed", "auto", "float"};
    public final MainActivity a;
    public final pa b;
    public LinearLayout d;
    public TextView e;
    public TextView f;
    public TextView g;
    public ScrollView h;
    public long j;
    public ic k;
    public TextView l;
    public final HashSet c = new HashSet();
    public String i = "";

    public qa(MainActivity mainActivity, pa paVar) {
        this.a = mainActivity;
        this.b = paVar;
    }

    public static boolean g(String str) {
        return "gofa".equals(str) || "waze".equals(str) || "wyn".equals(str);
    }

    public final LinearLayout a() {
        String strConcat;
        int i;
        View view;
        View view2;
        View view3;
        LinearLayout linearLayoutJ = k1.j(this.a);
        linearLayoutJ.addView(j("Kết nối", false));
        MainActivity mainActivity = this.a;
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        int i2 = 1;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 6), d8.g(mainActivity, 16), d8.g(mainActivity, 6));
        linearLayout.addView(k1.o(mainActivity, "Trên xe: Android Auto › Cài đặt nhà phát triển › bật \"Nguồn không xác định\", không thì Android Auto không hiện CarStream.", 12, 0, d8.p()));
        linearLayoutJ.addView(linearLayout);
        linearLayoutJ.addView(j("Thanh công cụ", true));
        String[] strArr = {"Cố định", "Tự động", "Nổi"};
        MainActivity mainActivity2 = this.a;
        String strG = xc.g(mainActivity2, "toolbarMode", "auto");
        int i3 = 0;
        int i4 = 1;
        while (true) {
            String[] strArr2 = m;
            if (i3 >= 3) {
                break;
            }
            if (strArr2[i3].equals(strG)) {
                i4 = i3;
            }
            i3++;
        }
        l8 l8VarB = k1.b(mainActivity2, strArr, null, i4, new la(this, i2));
        String strG2 = xc.g(this.a, "toolbarMode", "auto");
        linearLayoutJ.addView(h("Thanh công cụ trên màn hình xe", l8VarB, l("fixed".equals(strG2) ? "Thanh luôn hiện bên trái màn hình xe." : "float".equals(strG2) ? "Thanh luôn ẩn, kéo từ mép trái để mở." : "Trang chủ & cài đặt có thanh; xem video thì thanh tự trượt ra.")));
        linearLayoutJ.addView(j("Mục hiện trên thanh", true));
        linearLayoutJ.addView(q("Hiện mục Trò chơi trên thanh công cụ", "Game chạy sẵn trong app, không cần mạng.", "gamesEnabled"));
        linearLayoutJ.addView(q("Hiện mục Launcher trên thanh công cụ", "Lưới ứng dụng điện thoại trên màn hình xe.", "launcherEnabled"));
        MainActivity mainActivity3 = this.a;
        boolean zE = xc.e(mainActivity3, "restoreLayout", true);
        e(zE);
        linearLayoutJ.addView(k1.y(mainActivity3, "Mở lại giao diện chia màn cũ", "Khi kết nối lại (thoát AA, tắt máy…) tự dựng lại bố cục chia màn + ứng dụng như lần trước.", zE, new la(this, 2)));
        if (xc.e(this.a, "launcherEnabled", false)) {
            fc fcVarA = fc.a(this.a);
            LinearLayout linearLayout2 = new LinearLayout(this.a);
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(d8.g(this.a, 16), d8.g(this.a, 4), d8.g(this.a, 16), d8.g(this.a, 12));
            int i5 = fcVarA.a;
            boolean z = i5 != 0;
            boolean z2 = i5 == 1;
            LinearLayout linearLayout3 = new LinearLayout(this.a);
            linearLayout3.setOrientation(0);
            MainActivity mainActivity4 = this.a;
            int i6 = fcVarA.a;
            linearLayout3.addView(k1.v(mainActivity4, i6 != 1 ? i6 != 2 ? i6 != 3 ? "Chưa bật" : "Đang chờ" : "Tạm nghỉ" : "Đang chạy", z2 ? d8.c(800) : z ? d8.b(800) : d8.p(), z2 ? d8.c(200) : z ? -7728 : d8.j(200)));
            linearLayout2.addView(linearLayout3);
            MainActivity mainActivity5 = this.a;
            int i7 = fcVarA.a;
            TextView textViewO = k1.o(mainActivity5, i7 != 1 ? i7 != 2 ? i7 != 3 ? "Chưa sẵn sàng — ứng dụng sẽ mở trên điện thoại." : "Đang chờ kết nối." : "Tạm nghỉ. Vào mục Ứng dụng trên màn hình xe là chạy lại." : "Đang chạy trên màn hình xe.", 13, 0, d8.p());
            textViewO.setPadding(0, d8.g(this.a, 8), 0, 0);
            textViewO.setLineSpacing(d8.g(this.a, 3), 1.0f);
            linearLayout2.addView(textViewO);
            if (z) {
                view = new View(this.a);
            } else {
                LinearLayout linearLayout4 = new LinearLayout(this.a);
                linearLayout4.setOrientation(1);
                linearLayout4.setPadding(0, d8.g(this.a, 12), 0, 0);
                if (Build.VERSION.SDK_INT < 30) {
                    TextView textViewO2 = k1.o(this.a, ad.d("Ghép nối không dây cần Android 11 trở lên. Máy này chạy Android ", Build.VERSION.RELEASE, " — chỉ chạy được khi cắm máy tính một lần để khởi động bộ chiếu."), 13, 0, d8.p());
                    textViewO2.setLineSpacing(d8.g(this.a, 3), 1.0f);
                    linearLayout4.addView(textViewO2);
                    view = linearLayout4;
                } else {
                    boolean zD = b0.d(this.a);
                    String str = u.d;
                    int i8 = b0.i(this.a);
                    boolean zT = b0.t(this.a);
                    int i9 = -1;
                    try {
                        i9 = Settings.Global.getInt(this.a.getContentResolver(), "adb_enabled", -1);
                    } catch (Throwable unused) {
                    }
                    String str2 = "Mở cài đặt";
                    if (i9 == 0) {
                        strConcat = "Gỡ lỗi USB đang TẮT. Bắt buộc phải bật — không có nó thì Gỡ lỗi không dây cũng không dùng được.";
                    } else {
                        if (i8 == 0 && !zT) {
                            strConcat = "Wi-Fi đang tắt. Gỡ lỗi không dây tắt theo Wi-Fi — bật Wi-Fi lên rồi mở lại mục Ứng dụng trên màn hình xe là chạy.";
                            str2 = "Mở Wi-Fi";
                            i = 3;
                        } else if (i8 == 0) {
                            strConcat = zD ? "Gỡ lỗi không dây đang TẮT. Bật lại là chạy được ngay — không phải ghép nối lại." : "Gỡ lỗi không dây đang TẮT. Bật nó lên rồi mới ghép nối được.";
                        } else if (zD) {
                            String str3 = b0.h;
                            strConcat = str3 != null ? "Khởi động hỏng: ".concat(str3) : "Đã ghép nối. Mở mục Ứng dụng trên màn hình xe là chạy.";
                            str2 = z ? "Chạy lại" : "Khởi động";
                            i = 2;
                        } else {
                            if (str == null) {
                                str = "Hoặc ghép nối một lần, khỏi cần app khác.";
                            }
                            str2 = "Ghép nối";
                            strConcat = str;
                            i = 1;
                        }
                        TextView textViewO3 = k1.o(this.a, strConcat, 13, 0, d8.p());
                        textViewO3.setLineSpacing(d8.g(this.a, 3), 1.0f);
                        linearLayout4.addView(textViewO3);
                        TextView textViewO4 = k1.o(this.a, str2, 13, 1, d8.k());
                        textViewO4.setGravity(17);
                        textViewO4.setPadding(d8.g(this.a, 16), d8.g(this.a, 10), d8.g(this.a, 16), d8.g(this.a, 10));
                        k1.B(textViewO4, d8.a(), false, d8.g(this.a, Ui.R_PILL));
                        textViewO4.setOnClickListener(new b8(i, this, 2));
                        LinearLayout linearLayout5 = new LinearLayout(this.a);
                        linearLayout5.setOrientation(0);
                        linearLayout5.setPadding(0, d8.g(this.a, 10), 0, 0);
                        linearLayout5.addView(textViewO4);
                        linearLayout4.addView(linearLayout5);
                        view = linearLayout4;
                    }
                    i = 0;
                    TextView textViewO32 = k1.o(this.a, strConcat, 13, 0, d8.p());
                    textViewO32.setLineSpacing(d8.g(this.a, 3), 1.0f);
                    linearLayout4.addView(textViewO32);
                    TextView textViewO42 = k1.o(this.a, str2, 13, 1, d8.k());
                    textViewO42.setGravity(17);
                    textViewO42.setPadding(d8.g(this.a, 16), d8.g(this.a, 10), d8.g(this.a, 16), d8.g(this.a, 10));
                    k1.B(textViewO42, d8.a(), false, d8.g(this.a, Ui.R_PILL));
                    textViewO42.setOnClickListener(new b8(i, this, 2));
                    LinearLayout linearLayout52 = new LinearLayout(this.a);
                    linearLayout52.setOrientation(0);
                    linearLayout52.setPadding(0, d8.g(this.a, 10), 0, 0);
                    linearLayout52.addView(textViewO42);
                    linearLayout4.addView(linearLayout52);
                    view = linearLayout4;
                }
            }
            linearLayout2.addView(view);
            view2 = linearLayout2;
        } else {
            view2 = new View(this.a);
        }
        linearLayoutJ.addView(view2);
        MainActivity mainActivity6 = this.a;
        if (xc.e(mainActivity6, "launcherEnabled", false)) {
            LinearLayout linearLayoutA = ad.a(mainActivity6, 1);
            linearLayoutA.addView(j("Danh sách ứng dụng", true));
            linearLayoutA.addView(l("Bấm − để bỏ, + để thêm. Mặc định hiện hết."));
            final LinearLayout linearLayoutA2 = ad.a(mainActivity6, 1);
            int iG = d8.g(mainActivity6, 16);
            linearLayoutA2.setPadding(iG, 0, iG, d8.g(mainActivity6, 12));
            linearLayoutA.addView(linearLayoutA2);
            linearLayoutA2.addView(l("Đang nạp danh sách ứng dụng…"));
            final AppRepo.Listener[] listenerArr = {listener};
            AppRepo.Listener listener = new AppRepo.Listener() { // from class: ga
                @Override // com.carstream.tech.launcher.AppRepo.Listener
                public final void onApps(List list) {
                    AppRepo.unload(listenerArr[0]);
                    LinearLayout linearLayout6 = linearLayoutA2;
                    linearLayout6.removeAllViews();
                    qa qaVar = this.a;
                    if (list == null || list.isEmpty()) {
                        linearLayout6.addView(qaVar.l("Không đọc được danh sách ứng dụng."));
                        return;
                    }
                    LinearLayout linearLayout7 = new i0(qaVar.a, new r(qaVar, 9), new m0(list, 6)).d;
                    h3.a("launcherApps", linearLayout7);
                    linearLayout6.addView(linearLayout7);
                }
            };
            AppRepo.load(mainActivity6, listener);
            view3 = linearLayoutA;
        } else {
            view3 = new View(mainActivity6);
        }
        linearLayoutJ.addView(view3);
        return linearLayoutJ;
    }

    public final boolean b(String str) throws PackageManager.NameNotFoundException {
        MainActivity mainActivity = this.a;
        try {
            if ("waze".equals(str)) {
                boolean z = yc.a;
                mainActivity.getPackageManager().getPackageInfo(yc.a(mainActivity), 0);
                return true;
            }
            if ("wyn".equals(str)) {
                boolean z2 = ld.a;
                mainActivity.getPackageManager().getPackageInfo("com.wynauto.wyn", 0);
                return true;
            }
            boolean z3 = r4.a;
            mainActivity.getPackageManager().getPackageInfo("com.gofa.mobile", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0aec  */
    /* JADX WARN: Type inference failed for: r10v63, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r11v31, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.lang.Object, qa] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v30, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v48, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v61, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v70, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r6v83, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 3716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa.c():void");
    }

    public final void d() {
        ec.a(this.a);
        if (this.b != null) {
            z6.w();
        }
        ic icVar = this.k;
        if (icVar != null) {
            icVar.a();
            icVar.e();
            icVar.f = ic.b(icVar.f, Math.max(0, icVar.b - icVar.d));
            icVar.g = ic.b(icVar.g, Math.max(0, icVar.c - icVar.e));
            icVar.invalidate();
        }
    }

    public final void e(boolean z) {
        try {
            File externalFilesDir = this.a.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalFilesDir, "helper-restore.txt"), false);
            fileOutputStream.write((z ? "1" : "0").getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    public final LinearLayout f(String str, TextView textView, LinearLayout linearLayout) {
        boolean zContains = this.c.contains(str);
        ma maVar = new ma(this, str, 1);
        MainActivity mainActivity = this.a;
        LinearLayout linearLayoutA = ad.a(mainActivity, 1);
        linearLayoutA.setBackground(k1.t(d8.n(), d8.g(mainActivity, 24)));
        linearLayoutA.setClipToOutline(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = d8.g(mainActivity, 10);
        linearLayoutA.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 14), d8.g(mainActivity, 16), d8.g(mainActivity, 14));
        LinearLayout linearLayoutA2 = ad.a(mainActivity, 1);
        linearLayoutA2.addView(k1.o(mainActivity, str, 16, 1, d8.o()));
        if (textView != null) {
            linearLayoutA2.addView(textView);
        }
        linearLayout2.addView(linearLayoutA2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        ImageView imageView = new ImageView(mainActivity);
        imageView.setImageResource(R.drawable.ic_nav_down);
        imageView.setColorFilter(d8.p());
        imageView.setRotation(zContains ? 180.0f : 0.0f);
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(d8.g(mainActivity, 22), d8.g(mainActivity, 22)));
        View viewK = k1.k(mainActivity);
        viewK.setVisibility(zContains ? 0 : 8);
        linearLayout.setVisibility(zContains ? 0 : 8);
        linearLayout2.setFocusable(false);
        linearLayout2.setFocusableInTouchMode(false);
        k1.B(linearLayout2, 0, false, 0);
        linearLayout2.setOnClickListener(new j8(linearLayout, viewK, imageView, maVar));
        linearLayoutA.addView(linearLayout2);
        linearLayoutA.addView(viewK);
        linearLayoutA.addView(linearLayout);
        return linearLayoutA;
    }

    public final LinearLayout h(String str, View... viewArr) {
        LinearLayout linearLayout = new LinearLayout(this.a);
        linearLayout.setOrientation(1);
        linearLayout.addView(k(str));
        for (View view : viewArr) {
            linearLayout.addView(view);
        }
        h3.a(str, linearLayout);
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa.i():java.lang.String");
    }

    public final LinearLayout j(String str, boolean z) {
        MainActivity mainActivity = this.a;
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(1);
        if (z) {
            linearLayout.addView(k1.k(mainActivity));
        }
        TextView textViewO = k1.o(mainActivity, str, 12, 1, d8.p());
        textViewO.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 14), d8.g(mainActivity, 16), d8.g(mainActivity, 6));
        linearLayout.addView(textViewO);
        return linearLayout;
    }

    public final TextView k(String str) {
        int iO = d8.o();
        MainActivity mainActivity = this.a;
        TextView textViewO = k1.o(mainActivity, str, 15, 1, iO);
        textViewO.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 10), d8.g(mainActivity, 16), d8.g(mainActivity, 6));
        return textViewO;
    }

    public final TextView l(String str) {
        int iP = d8.p();
        MainActivity mainActivity = this.a;
        TextView textViewO = k1.o(mainActivity, str, 13, 0, iP);
        textViewO.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 12), d8.g(mainActivity, 16), d8.g(mainActivity, 12));
        textViewO.setLineSpacing(d8.g(mainActivity, 3), 1.0f);
        return textViewO;
    }

    public final TextView m(String str, boolean z, View.OnClickListener onClickListener) {
        int iK = z ? d8.k() : d8.o();
        MainActivity mainActivity = this.a;
        TextView textViewO = k1.o(mainActivity, str, 13, 1, iK);
        textViewO.setGravity(17);
        textViewO.setPadding(d8.g(mainActivity, 18), d8.g(mainActivity, 10), d8.g(mainActivity, 18), d8.g(mainActivity, 10));
        k1.B(textViewO, z ? d8.a() : d8.j(200), false, d8.g(mainActivity, Ui.R_PILL));
        if (onClickListener != null) {
            textViewO.setOnClickListener(onClickListener);
        }
        return textViewO;
    }

    public final void n() {
        if (this.d == null) {
            return;
        }
        ScrollView scrollView = this.h;
        int scrollY = scrollView == null ? 0 : scrollView.getScrollY();
        c();
        ScrollView scrollView2 = this.h;
        if (scrollView2 == null || scrollY <= 0) {
            return;
        }
        d3 d3Var = new d3(scrollY, this, 3);
        scrollView2.post(d3Var);
        this.h.postDelayed(d3Var, 150L);
    }

    public final String o() {
        MainActivity mainActivity = this.a;
        if (!xc.e(mainActivity, "showSpeed", true)) {
            return "Bong bóng tốc độ đang tắt";
        }
        String strG = xc.g(mainActivity, "speedStyle", "pill");
        int i = 0;
        while (true) {
            t8[] t8VarArr = w1.d;
            if (i >= 8) {
                return "Đang bật";
            }
            if (t8VarArr[i].a.equals(strG)) {
                return ad.g("Đang bật · ", t8VarArr[i].b.toLowerCase());
            }
            i++;
        }
    }

    public final TextView p(String str) {
        return k1.o(this.a, str, 12, 0, d8.p());
    }

    public final LinearLayout q(String str, String str2, String str3) {
        boolean z = ("hudSend".equals(str3) || "speedSignsOnly".equals(str3) || "gaugeOnlyArt".equals(str3) || "limitAsTitle".equals(str3) || "videoCrop".equals(str3) || "ytDataSaver".equals(str3) || "callBar".equals(str3) || "launcherEnabled".equals(str3)) ? false : true;
        MainActivity mainActivity = this.a;
        LinearLayout linearLayoutY = k1.y(mainActivity, str, str2, xc.e(mainActivity, str3, z), new ma(this, str3, 0));
        h3.a(str, linearLayoutY);
        return linearLayoutY;
    }

    public final String r() {
        String str;
        String str2;
        String strG = xc.g(this.a, "vietmapSource", "widget");
        if ("carstream".equals(strG)) {
            if (!cb.b(this.a)) {
                return "Nguồn CarStream · chưa có quyền vị trí";
            }
            if (!dc.k) {
                return "Nguồn CarStream · chưa chạy";
            }
            if (dc.l >= 3) {
                return "Nguồn CarStream · chưa lấy được bản đồ";
            }
            int iH = ad.h(w7.l());
            if (iH == 1) {
                return "Nguồn CarStream · mất tín hiệu GPS";
            }
            if (iH != 2) {
                return "Nguồn CarStream · chưa nhận được dữ liệu";
            }
            int iG = w7.g();
            if (iG > 0) {
                str2 = iG + " km/h";
            } else {
                str2 = "đường không có biển";
            }
            return ad.g("Nguồn CarStream · ", str2);
        }
        if (!g(strG)) {
            if (xc.f(-1, this.a, "vietmapWidgetId") < 0) {
                return "Chưa kết nối widget";
            }
            if (w7.h <= 0) {
                return "Chưa nhận được dữ liệu";
            }
            int i = w7.a;
            if (i <= 0) {
                return "Đang nhận dữ liệu";
            }
            return "Đang nhận · " + i + " km/h";
        }
        String strD = ad.d("Nguồn ", "waze".equals(strG) ? "Waze" : "wyn".equals(strG) ? "Wyn" : "Gofa", " · ");
        if (!b(strG)) {
            return ad.c(strD, "chưa cài app");
        }
        if (!r4.a(this.a)) {
            return ad.c(strD, "chưa bật Trợ năng");
        }
        if (!GofaTap.connected) {
            return ad.c(strD, "cần bật lại Trợ năng");
        }
        int i2 = w7.a;
        if (i2 > 0) {
            str = i2 + " km/h";
        } else {
            str = "chưa thấy bong bóng";
        }
        return ad.c(strD, str);
    }
}
