package com.carstream.tech.phone;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.IntentCompat;
import com.carstream.tech.R;
import com.carstream.tech.box.BoxActivity;
import com.carstream.tech.car.e;
import com.carstream.tech.core.call.CallWatch;
import com.carstream.tech.core.ui.SplashArt;
import com.carstream.tech.core.ui.SplashView;
import com.carstream.tech.launcher.Ui;
import defpackage.a6;
import defpackage.ab;
import defpackage.ad;
import defpackage.b8;
import defpackage.c1;
import defpackage.c5;
import defpackage.cb;
import defpackage.d3;
import defpackage.d8;
import defpackage.dd;
import defpackage.ec;
import defpackage.f;
import defpackage.f3;
import defpackage.g3;
import defpackage.h;
import defpackage.h2;
import defpackage.h3;
import defpackage.h8;
import defpackage.i6;
import defpackage.i8;
import defpackage.id;
import defpackage.j6;
import defpackage.jc;
import defpackage.k1;
import defpackage.k6;
import defpackage.l;
import defpackage.l0;
import defpackage.l6;
import defpackage.m6;
import defpackage.mc;
import defpackage.n1;
import defpackage.n6;
import defpackage.nc;
import defpackage.o8;
import defpackage.oc;
import defpackage.p9;
import defpackage.pa;
import defpackage.qa;
import defpackage.s5;
import defpackage.t3;
import defpackage.t6;
import defpackage.u0;
import defpackage.u3;
import defpackage.v0;
import defpackage.v3;
import defpackage.v6;
import defpackage.w0;
import defpackage.w1;
import defpackage.w7;
import defpackage.x6;
import defpackage.xc;
import defpackage.y6;
import defpackage.z6;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class MainActivity extends Activity {
    public static final String EXTRA_PHONE_UI = "phoneUi";
    public static final String EXTRA_SKIP_BOX = "skipBox";
    private static final long HEARTBEAT_TICK_MS = 60000;
    private static final int REQ_ALL_PERMS = 9;
    private static final int REQ_BIND_WIDGET = 23325;
    private static final int TAB_CONTROL = 0;
    private static final int TAB_SETTINGS = 2;
    private static final int TAB_VIEW = 1;
    private static final long TICK_MS = 500;
    private static final String VM_PKG = "vn.vietmap.live";
    private static final String VM_PROVIDER = "vn.vietmap.live.homewidget.VMAlertWidgetProvider";
    private static final int WIDGET_HOST_ID = 22177;
    private final t6 aaListener;
    private AppWidgetHost bindHost;
    private boolean boSungTay;
    private FrameLayout body;
    private v3 controllerScreen;
    private i8 nav;
    private boolean navigating;
    private qa settingsScreen;
    private final Runnable ticker;
    private oc viewTab;
    private int currentTab = 0;
    private final Handler tick = new Handler(Looper.getMainLooper());
    private final jc vietmap = new jc();
    private final x6 phoneUi = new l6(this, 1);
    private final pa settingsListener = new l6(this, 2);
    private final h8 navListener = new l6(this, 3);
    private int pendingWidgetId = -1;
    private final Runnable heartbeatTicker = new k6(this, 3);
    private final v6 phoneDeact = new l6(this, 0);

    public MainActivity() {
        int i = 2;
        this.aaListener = new l(this, i);
        this.ticker = new k6(this, i);
    }

    private void applyThemeIfChanged() {
        ab abVar;
        boolean z = k1.h;
        k1.s(this);
        if (k1.h == z) {
            return;
        }
        h2 h2Var = this.controllerScreen.s;
        CopyOnWriteArrayList copyOnWriteArrayList = cb.e;
        copyOnWriteArrayList.remove(h2Var);
        if (copyOnWriteArrayList.isEmpty() && cb.f.isEmpty()) {
            LocationManager locationManager = cb.h;
            if (locationManager != null && (abVar = cb.i) != null) {
                try {
                    locationManager.removeUpdates(abVar);
                } catch (Throwable unused) {
                }
            }
            cb.i = null;
        }
        this.controllerScreen = new v3(this);
        this.settingsScreen = new qa(this, this.settingsListener);
        this.viewTab.b = null;
        buildUi();
        render();
        getWindow().setStatusBarColor(d8.e());
        getWindow().getDecorView().setSystemUiVisibility(k1.h ? 0 : 8192);
    }

    private void buildUi() {
        LinearLayout linearLayoutA = ad.a(this, 1);
        linearLayoutA.setBackgroundColor(d8.e());
        FrameLayout frameLayout = new FrameLayout(this);
        this.body = frameLayout;
        frameLayout.setPadding(0, statusBarHeight(), 0, 0);
        linearLayoutA.addView(this.body, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        i8 i8Var = new i8(this, this.navListener);
        this.nav = i8Var;
        if (!this.boSungTay) {
            LinearLayout linearLayout = i8Var.f;
            if (linearLayout == null) {
                LinearLayout linearLayout2 = new LinearLayout(this);
                i8Var.e = linearLayout2;
                linearLayout2.setOrientation(0);
                i8Var.e.setBackgroundColor(d8.e());
                View view = new View(this);
                view.setBackgroundColor(d8.j(300));
                LinearLayout linearLayout3 = new LinearLayout(this);
                linearLayout3.setOrientation(1);
                linearLayout3.addView(view, new LinearLayout.LayoutParams(-1, Math.max(1, d8.g(this, 1) / 2)));
                linearLayout3.addView(i8Var.e, new LinearLayout.LayoutParams(-1, -2));
                int i = 0;
                while (i < 3) {
                    LinearLayout linearLayout4 = i8Var.e;
                    LinearLayout linearLayout5 = new LinearLayout(this);
                    h3.a(i == 0 ? "tabDieuKhien" : i == 1 ? "tabXem" : "tabCaiDat", linearLayout5);
                    linearLayout5.setOrientation(1);
                    linearLayout5.setGravity(17);
                    linearLayout5.setPadding(0, d8.g(this, 10), 0, d8.g(this, 12));
                    linearLayout5.setMinimumHeight(d8.g(this, 56));
                    k1.B(linearLayout5, 0, false, 0);
                    linearLayout5.setOnClickListener(new b8(i, i8Var, 1));
                    ImageView imageView = new ImageView(this);
                    imageView.setImageResource(i8.h[i]);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    linearLayout5.addView(imageView, new LinearLayout.LayoutParams(d8.g(this, 24), d8.g(this, 24)));
                    TextView textViewO = k1.o(this, i8.i[i], 12, 0, d8.p());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = d8.g(this, 4);
                    linearLayout5.addView(textViewO, layoutParams);
                    i8Var.c[i] = imageView;
                    i8Var.d[i] = textViewO;
                    linearLayout4.addView(linearLayout5, new LinearLayout.LayoutParams(0, -2, 1.0f));
                    i++;
                }
                i8Var.a();
                i8Var.f = linearLayout3;
                linearLayout = linearLayout3;
            }
            linearLayoutA.addView(linearLayout);
        }
        linearLayoutA.setOnApplyWindowInsetsListener(new j6(this));
        setContentView(linearLayoutA);
        if (this.boSungTay || getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("daXemHuongDan"), false)) {
            return;
        }
        linearLayoutA.post(new k6(this, 0));
    }

    private f3 buoc(String str, String str2, String str3, Runnable runnable) {
        return new f3(str, str2, str3, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeKey() {
        a6.a(this, new l6(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void chuyenTab(int i) {
        if (this.currentTab != i) {
            MainActivity mainActivity = ((l6) this.navListener).b;
            mainActivity.currentTab = i;
            mainActivity.render();
            i8 i8Var = this.nav;
            i8Var.g = i;
            i8Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void confirm(String str, String str2, String str3, Runnable runnable) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        int iK = w1.k(this, 24);
        LinearLayout linearLayoutA = ad.a(this, 1);
        linearLayoutA.setBackground(k1.t(d8.n(), w1.k(this, 24)));
        linearLayoutA.setPadding(iK, iK, iK, w1.k(this, 20));
        TextView textViewY = w1.y(this, str, 19, d8.o());
        textViewY.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        linearLayoutA.addView(textViewY);
        TextView textViewY2 = w1.y(this, str2, 15, d8.p());
        textViewY2.setLineSpacing(w1.k(this, 5), 1.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = w1.k(this, 10);
        linearLayoutA.addView(textViewY2, layoutParams);
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        linearLayoutA.addView(w1.e(this, str3, d8.a(), new u0(dialog, runnable, 5)));
        TextView textViewE = w1.e(this, "Để sau", k1.x(), new i6(dialog, 0));
        textViewE.setTextColor(d8.o());
        linearLayoutA.addView(textViewE);
        dialog.setContentView(linearLayoutA);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(Math.min(getResources().getDisplayMetrics().widthPixels - w1.k(this, 48), w1.k(this, 400)), -2);
        }
        dialog.show();
    }

    private static View detach(View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goMayThat() throws JSONException {
        l6 l6Var = new l6(this, 5);
        String str = a6.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", ec.o(this));
            jSONObject.put("hwid", c5.c());
            jSONObject.put("hw", a6.d());
            a6.b.execute(new s5(xc.b("ZAwo7DrqQ4Jy9D0bbaY="), jSONObject, this, l6Var));
        } catch (Exception unused) {
            a6.c.post(new f(l6Var, 24));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goToActivate() {
        if (isFinishing()) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) ActivateActivity.class));
        finish();
    }

    private void handleAssistantIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        boolean zEquals = "android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(intent.getAction());
        boolean booleanExtra = intent.getBooleanExtra(IntentCompat.EXTRA_START_PLAYBACK, false);
        if (zEquals || booleanExtra) {
            String stringExtra = intent.getStringExtra("query");
            if (stringExtra != null && !stringExtra.trim().isEmpty()) {
                Toast.makeText(this, z6.d(stringExtra) ? ad.d("Đang tìm \"", stringExtra, "\" trên màn hình xe") : ad.d("Sẽ tìm \"", stringExtra, "\" khi mở màn hình xe"), 0).show();
                return;
            }
            y6 y6VarN = z6.n();
            if (y6VarN == null) {
                Toast.makeText(this, "Chưa mở CarStream trên màn hình xe", 0).show();
            } else {
                ((e) y6VarN).t();
            }
        }
    }

    private Runnable moNhom(String str) {
        return new h(9, this, str);
    }

    private void onWidgetBound() {
        xc.n(this.pendingWidgetId, this, "vietmapWidgetId");
        xc.p(this, "vietmapSource", "widget");
        id.b(this);
        requestOverlayIfNeeded();
        toast("Đã kết nối widget VietMap. Mở VietMap và dẫn đường để có dữ liệu.");
        render();
    }

    private void promptCallOnce() {
        if (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("callPrompted"), false) || CallWatch.coQuyen(this)) {
            return;
        }
        xc.m(this, "callPrompted", true);
        confirm("Hiện cuộc gọi lên màn hình xe?", "Cuộc gọi Messenger, Zalo… hiện lên màn hình xe để trả lời ngay, không phải cầm điện thoại.\n\nCần cấp quyền đọc thông báo. Bỏ qua cũng được — bật lại trong Cài đặt bất cứ lúc nào.", "Cấp quyền", new k6(this, 4));
    }

    private void promptOverlayOnce() {
        if (Settings.canDrawOverlays(this) || getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("overlayPrompted"), false)) {
            return;
        }
        xc.m(this, "overlayPrompted", true);
        new AlertDialog.Builder(this).setTitle("Cần thêm một quyền").setMessage("Quyền \"Hiển thị trên ứng dụng khác\" phải bật trong trang Cài đặt riêng, không hỏi được như các quyền vừa rồi.\n\nCarStream cần nó để giữ kết nối khi bạn đang mở bản đồ.").setPositiveButton("Mở Cài đặt", new m6(this)).setNegativeButton("Để sau", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render() {
        ab abVar;
        int i;
        ab abVar2;
        i8 i8Var = this.nav;
        i8Var.g = this.currentTab;
        i8Var.a();
        this.body.removeAllViews();
        int i2 = 0;
        int i3 = 12;
        int i4 = 16;
        if (this.currentTab == 1) {
            FrameLayout frameLayout = this.body;
            oc ocVar = this.viewTab;
            if (ocVar.b == null) {
                MainActivity mainActivity = ocVar.a;
                LinearLayout linearLayout = new LinearLayout(mainActivity);
                linearLayout.setOrientation(1);
                linearLayout.setBackgroundColor(d8.e());
                linearLayout.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 16), d8.g(mainActivity, 16), 0);
                linearLayout.addView(k1.l(mainActivity, "Xem"), ocVar.c(14));
                LinearLayout linearLayout2 = new LinearLayout(mainActivity);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                LinearLayout linearLayout3 = new LinearLayout(mainActivity);
                ocVar.e = linearLayout3;
                linearLayout3.setOrientation(0);
                ocVar.e.setGravity(16);
                dd[] ddVarArrB = l0.b(mainActivity);
                int length = ddVarArrB.length;
                int i5 = 0;
                while (i5 < length) {
                    dd ddVar = ddVarArrB[i5];
                    LinearLayout linearLayout4 = ocVar.e;
                    LinearLayout linearLayout5 = new LinearLayout(mainActivity);
                    linearLayout5.setOrientation(i2);
                    linearLayout5.setGravity(i4);
                    dd[] ddVarArr = ddVarArrB;
                    linearLayout5.setPadding(d8.g(mainActivity, i3), d8.g(mainActivity, 9), d8.g(mainActivity, i4), d8.g(mainActivity, 9));
                    linearLayout5.setTag(ddVar.a);
                    ImageView imageView = new ImageView(mainActivity);
                    imageView.setImageResource(ddVar.c);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(d8.g(mainActivity, 26), d8.g(mainActivity, 26));
                    layoutParams.rightMargin = d8.g(mainActivity, 8);
                    linearLayout5.addView(imageView, layoutParams);
                    linearLayout5.addView(k1.o(mainActivity, ddVar.b, 13, 1, d8.o()));
                    linearLayout5.setOnClickListener(new u0(11, ocVar, ddVar));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.rightMargin = d8.g(mainActivity, 8);
                    linearLayout5.setLayoutParams(layoutParams2);
                    linearLayout4.addView(linearLayout5);
                    i5++;
                    ddVarArrB = ddVarArr;
                    length = length;
                    i4 = 16;
                    i2 = 0;
                    i3 = 12;
                }
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(mainActivity);
                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
                horizontalScrollView.setFadingEdgeLength(d8.g(mainActivity, 28));
                horizontalScrollView.addView(ocVar.e, new FrameLayout.LayoutParams(-2, -2));
                FrameLayout frameLayout2 = new FrameLayout(mainActivity);
                frameLayout2.addView(horizontalScrollView, new FrameLayout.LayoutParams(-1, -2));
                ocVar.f = ocVar.b(R.drawable.ic_nav_back, 3);
                ocVar.g = ocVar.b(R.drawable.ic_nav_forward, 5);
                frameLayout2.addView(ocVar.f);
                frameLayout2.addView(ocVar.g);
                horizontalScrollView.setOnScrollChangeListener(new v0(ocVar, horizontalScrollView, 1));
                horizontalScrollView.addOnLayoutChangeListener(new w0(ocVar, horizontalScrollView, 3));
                linearLayout2.addView(frameLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
                TextView textViewO = k1.o(mainActivity, "Gửi sang xe", 13, 1, d8.o());
                textViewO.setGravity(17);
                textViewO.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 9), d8.g(mainActivity, 16), d8.g(mainActivity, 9));
                k1.B(textViewO, d8.j(200), false, d8.g(mainActivity, Ui.R_PILL));
                textViewO.setOnClickListener(new mc(ocVar, 0));
                linearLayout2.addView(textViewO);
                ocVar.f();
                linearLayout.addView(linearLayout2, ocVar.c(10));
                LinearLayout linearLayout6 = new LinearLayout(mainActivity);
                linearLayout6.setOrientation(0);
                linearLayout6.setGravity(16);
                linearLayout6.setBackground(k1.t(d8.n(), d8.g(mainActivity, 20)));
                linearLayout6.setPadding(d8.g(mainActivity, 16), d8.g(mainActivity, 12), d8.g(mainActivity, 16), d8.g(mainActivity, 12));
                LinearLayout linearLayoutA = ad.a(mainActivity, 1);
                linearLayoutA.addView(k1.o(mainActivity, "Đồng bộ sang màn hình xe", 15, 1, d8.o()));
                linearLayoutA.addView(k1.o(mainActivity, "Chọn ở đây, xe mở theo", 12, 0, d8.p()));
                linearLayout6.addView(linearLayoutA, new LinearLayout.LayoutParams(0, -2, 1.0f));
                o8 o8Var = new o8(mainActivity, xc.l(mainActivity).getBoolean(xc.h("viewMirror"), true));
                ocVar.h = o8Var;
                linearLayout6.addView(o8Var, new LinearLayout.LayoutParams(d8.g(mainActivity, 50), d8.g(mainActivity, 29)));
                k1.B(linearLayout6, 0, false, d8.g(mainActivity, 20));
                linearLayout6.setOnClickListener(new mc(ocVar, 1));
                linearLayout.addView(linearLayout6, ocVar.c(10));
                TextView textViewO2 = k1.o(mainActivity, "", 12, 0, d8.p());
                ocVar.d = textViewO2;
                textViewO2.setTypeface(Typeface.MONOSPACE);
                ocVar.d.setMaxLines(1);
                ocVar.d.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(ocVar.d, ocVar.c(8));
                FrameLayout frameLayout3 = new FrameLayout(mainActivity);
                frameLayout3.setBackground(k1.t(d8.j(300), d8.g(mainActivity, 20)));
                frameLayout3.setClipToOutline(true);
                WebView webView = new WebView(mainActivity);
                ocVar.c = webView;
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setDomStorageEnabled(true);
                settings.setMediaPlaybackRequiresUserGesture(true);
                settings.setUseWideViewPort(true);
                settings.setLoadWithOverviewMode(true);
                settings.setSupportZoom(false);
                ocVar.k = settings.getUserAgentString();
                CookieManager.getInstance().setAcceptCookie(true);
                CookieManager.getInstance().setAcceptThirdPartyCookies(ocVar.c, true);
                ocVar.c.setWebViewClient(new nc(ocVar));
                dd ddVar2 = ocVar.i;
                if (ddVar2 == null) {
                    dd[] ddVarArr2 = l0.a;
                    ddVar2 = ddVarArr2.length > 0 ? ddVarArr2[0] : null;
                }
                if (ddVar2 != null) {
                    ocVar.d(ddVar2);
                }
                i = -1;
                frameLayout3.addView(ocVar.c, new FrameLayout.LayoutParams(-1, -1));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.bottomMargin = d8.g(mainActivity, 8);
                frameLayout3.setLayoutParams(layoutParams3);
                linearLayout.addView(frameLayout3, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                ocVar.b = linearLayout;
            } else {
                i = -1;
            }
            frameLayout.addView(detach(ocVar.b), new FrameLayout.LayoutParams(i, i));
            WebView webView2 = this.viewTab.c;
            if (webView2 != null) {
                webView2.onResume();
            }
            h2 h2Var = this.controllerScreen.s;
            CopyOnWriteArrayList copyOnWriteArrayList = cb.e;
            copyOnWriteArrayList.remove(h2Var);
            if (copyOnWriteArrayList.isEmpty() && cb.f.isEmpty()) {
                LocationManager locationManager = cb.h;
                if (locationManager != null && (abVar2 = cb.i) != null) {
                    try {
                        locationManager.removeUpdates(abVar2);
                    } catch (Throwable unused) {
                    }
                }
                cb.i = null;
            }
            stopTicking();
            return;
        }
        oc ocVar2 = this.viewTab;
        WebView webView3 = ocVar2.c;
        if (webView3 != null) {
            try {
                if (webView3.getParent() instanceof ViewGroup) {
                    ((ViewGroup) ocVar2.c.getParent()).removeView(ocVar2.c);
                }
                ocVar2.c.stopLoading();
                ocVar2.c.onPause();
                ocVar2.c.clearHistory();
                ocVar2.c.destroy();
            } catch (Exception e) {
                e.getMessage();
            }
            ocVar2.c = null;
            ocVar2.j = null;
            ocVar2.b = null;
        }
        if (this.currentTab == 2) {
            FrameLayout frameLayout4 = this.body;
            qa qaVar = this.settingsScreen;
            qaVar.getClass();
            MainActivity mainActivity2 = qaVar.a;
            ScrollView scrollView = new ScrollView(mainActivity2);
            qaVar.h = scrollView;
            scrollView.setBackgroundColor(d8.e());
            LinearLayout linearLayout7 = new LinearLayout(mainActivity2);
            qaVar.d = linearLayout7;
            linearLayout7.setOrientation(1);
            qaVar.d.setPadding(d8.g(mainActivity2, 16), d8.g(mainActivity2, 16), d8.g(mainActivity2, 16), d8.g(mainActivity2, 8));
            qaVar.h.addView(qaVar.d, new ViewGroup.LayoutParams(-1, -2));
            qaVar.c();
            frameLayout4.addView(detach(qaVar.h), new FrameLayout.LayoutParams(-1, -1));
            h2 h2Var2 = this.controllerScreen.s;
            CopyOnWriteArrayList copyOnWriteArrayList2 = cb.e;
            copyOnWriteArrayList2.remove(h2Var2);
            if (copyOnWriteArrayList2.isEmpty() && cb.f.isEmpty()) {
                LocationManager locationManager2 = cb.h;
                if (locationManager2 != null && (abVar = cb.i) != null) {
                    try {
                        locationManager2.removeUpdates(abVar);
                    } catch (Throwable unused2) {
                    }
                }
                cb.i = null;
            }
            startTicking();
            return;
        }
        ScrollView scrollView2 = new ScrollView(this);
        scrollView2.setBackgroundColor(d8.e());
        v3 v3Var = this.controllerScreen;
        if (v3Var.b == null) {
            MainActivity mainActivity3 = v3Var.a;
            LinearLayout linearLayout8 = new LinearLayout(mainActivity3);
            linearLayout8.setOrientation(1);
            linearLayout8.setBackgroundColor(d8.e());
            linearLayout8.setPadding(d8.g(mainActivity3, 16), d8.g(mainActivity3, 16), d8.g(mainActivity3, 16), d8.g(mainActivity3, 8));
            LinearLayout linearLayout9 = new LinearLayout(mainActivity3);
            linearLayout9.setOrientation(0);
            linearLayout9.setGravity(16);
            TextView textViewL = k1.l(mainActivity3, "CarStream");
            textViewL.setMaxLines(1);
            linearLayout9.addView(textViewL, new LinearLayout.LayoutParams(-2, -2));
            linearLayout9.addView(new View(mainActivity3), new LinearLayout.LayoutParams(0, d8.g(mainActivity3, 1), 1.0f));
            LinearLayout linearLayout10 = new LinearLayout(mainActivity3);
            linearLayout10.setOrientation(0);
            linearLayout10.setGravity(16);
            linearLayout10.setBackground(k1.t(d8.c(200), d8.g(mainActivity3, Ui.R_PILL)));
            linearLayout10.setPadding(d8.g(mainActivity3, 14), d8.g(mainActivity3, 7), d8.g(mainActivity3, 14), d8.g(mainActivity3, 7));
            v3Var.c = new View(mainActivity3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(d8.g(mainActivity3, 8), d8.g(mainActivity3, 8));
            layoutParams4.rightMargin = d8.g(mainActivity3, 8);
            linearLayout10.addView(v3Var.c, layoutParams4);
            TextView textViewO3 = k1.o(mainActivity3, "", 13, 1, d8.c(800));
            v3Var.d = textViewO3;
            textViewO3.setMaxLines(1);
            TextView textView = v3Var.d;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            linearLayout10.addView(v3Var.d);
            linearLayout9.addView(linearLayout10, new LinearLayout.LayoutParams(-2, -2));
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.bottomMargin = d8.g(mainActivity3, 14);
            linearLayout9.setLayoutParams(layoutParams5);
            linearLayout8.addView(linearLayout9);
            LinearLayout linearLayout11 = new LinearLayout(mainActivity3);
            linearLayout11.setOrientation(1);
            linearLayout11.setBackground(k1.t(d8.n(), d8.g(mainActivity3, 24)));
            linearLayout11.setPadding(d8.g(mainActivity3, 14), d8.g(mainActivity3, 14), d8.g(mainActivity3, 14), d8.g(mainActivity3, 14));
            LinearLayout linearLayoutA2 = ad.a(mainActivity3, 0);
            ImageView imageView2 = new ImageView(mainActivity3);
            v3Var.e = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            v3Var.e.setBackground(k1.t(d8.j(300), d8.g(mainActivity3, 18)));
            v3Var.e.setClipToOutline(true);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(d8.g(mainActivity3, 76), d8.g(mainActivity3, 76));
            layoutParams6.rightMargin = d8.g(mainActivity3, 14);
            linearLayoutA2.addView(v3Var.e, layoutParams6);
            LinearLayout linearLayout12 = new LinearLayout(mainActivity3);
            linearLayout12.setOrientation(1);
            TextView textViewO4 = k1.o(mainActivity3, "", 11, 1, d8.a());
            v3Var.f = textViewO4;
            textViewO4.setLetterSpacing(0.1f);
            linearLayout12.addView(v3Var.f);
            TextView textViewO5 = k1.o(mainActivity3, "", 16, 1, d8.o());
            v3Var.g = textViewO5;
            textViewO5.setMaxLines(2);
            v3Var.g.setEllipsize(truncateAt);
            linearLayout12.addView(v3Var.g);
            TextView textViewO6 = k1.o(mainActivity3, "", 13, 0, d8.p());
            v3Var.h = textViewO6;
            textViewO6.setSingleLine(true);
            v3Var.h.setEllipsize(truncateAt);
            linearLayout12.addView(v3Var.h);
            linearLayoutA2.addView(linearLayout12, new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout11.addView(linearLayoutA2);
            LinearLayout linearLayout13 = new LinearLayout(mainActivity3);
            linearLayout13.setOrientation(0);
            linearLayout13.setGravity(16);
            TextView textViewC = v3Var.c("0:00");
            v3Var.i = textViewC;
            linearLayout13.addView(textViewC);
            FrameLayout frameLayout5 = new FrameLayout(mainActivity3);
            frameLayout5.setBackground(k1.t(d8.j(300), d8.g(mainActivity3, Ui.R_PILL)));
            frameLayout5.setClipToOutline(true);
            View view = new View(mainActivity3);
            v3Var.k = view;
            view.setBackground(k1.t(d8.a(), d8.g(mainActivity3, Ui.R_PILL)));
            LinearLayout linearLayout14 = new LinearLayout(mainActivity3);
            linearLayout14.setOrientation(0);
            linearLayout14.addView(v3Var.k, new LinearLayout.LayoutParams(0, d8.g(mainActivity3, 5), 0.0f));
            linearLayout14.addView(new View(mainActivity3), new LinearLayout.LayoutParams(0, d8.g(mainActivity3, 5), 100.0f));
            frameLayout5.addView(linearLayout14, new FrameLayout.LayoutParams(-1, d8.g(mainActivity3, 5)));
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, d8.g(mainActivity3, 5), 1.0f);
            layoutParams7.leftMargin = d8.g(mainActivity3, 10);
            layoutParams7.rightMargin = d8.g(mainActivity3, 10);
            linearLayout13.addView(frameLayout5, layoutParams7);
            TextView textViewC2 = v3Var.c("0:00");
            v3Var.j = textViewC2;
            linearLayout13.addView(textViewC2);
            linearLayout11.addView(linearLayout13, v3.b(d8.g(mainActivity3, 14), 0, 0));
            LinearLayout linearLayout15 = new LinearLayout(mainActivity3);
            linearLayout15.setOrientation(0);
            linearLayout15.setGravity(17);
            int i6 = 18;
            linearLayout15.addView(v3Var.d(R.drawable.ic_skip_prev, 56, d8.j(200), d8.o(), new n1(3)));
            v3Var.l = v3Var.d(R.drawable.ic_pause, 68, d8.a(), d8.k(), new t3(v3Var, 0));
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(d8.g(mainActivity3, 68), d8.g(mainActivity3, 68));
            layoutParams8.leftMargin = d8.g(mainActivity3, 18);
            layoutParams8.rightMargin = d8.g(mainActivity3, 18);
            linearLayout15.addView(v3Var.l, layoutParams8);
            linearLayout15.addView(v3Var.d(R.drawable.ic_skip_next, 56, d8.j(200), d8.o(), new n1(4)));
            linearLayout11.addView(linearLayout15, v3.b(d8.g(mainActivity3, 14), 0, 0));
            linearLayout8.addView(linearLayout11, v3.b(d8.g(mainActivity3, 0), 0, 0));
            LinearLayout linearLayout16 = new LinearLayout(mainActivity3);
            linearLayout16.setOrientation(0);
            linearLayout16.setGravity(16);
            linearLayout16.setBackground(k1.t(d8.n(), d8.g(mainActivity3, 24)));
            linearLayout16.setPadding(d8.g(mainActivity3, 14), d8.g(mainActivity3, 14), d8.g(mainActivity3, 14), d8.g(mainActivity3, 14));
            FrameLayout frameLayout6 = new FrameLayout(mainActivity3);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(d8.g(mainActivity3, 7), d8.a());
            frameLayout6.setBackground(gradientDrawable);
            LinearLayout linearLayout17 = new LinearLayout(mainActivity3);
            linearLayout17.setOrientation(1);
            linearLayout17.setGravity(17);
            TextView textViewC3 = v3Var.c("--");
            v3Var.m = textViewC3;
            textViewC3.setTextSize(2, 22.0f);
            v3Var.m.setTextColor(d8.o());
            v3Var.m.setGravity(17);
            linearLayout17.addView(v3Var.m);
            TextView textViewO7 = k1.o(mainActivity3, "km/h", 9, 0, d8.p());
            textViewO7.setGravity(17);
            linearLayout17.addView(textViewO7);
            frameLayout6.addView(linearLayout17, new FrameLayout.LayoutParams(-2, -2, 17));
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(d8.g(mainActivity3, 74), d8.g(mainActivity3, 74));
            layoutParams9.rightMargin = d8.g(mainActivity3, 14);
            linearLayout16.addView(frameLayout6, layoutParams9);
            LinearLayout linearLayout18 = new LinearLayout(mainActivity3);
            linearLayout18.setOrientation(1);
            linearLayout18.addView(k1.o(mainActivity3, "Giới hạn đoạn này", 13, 0, d8.p()));
            LinearLayout linearLayout19 = new LinearLayout(mainActivity3);
            linearLayout19.setOrientation(0);
            linearLayout19.setGravity(16);
            ImageView imageView3 = new ImageView(mainActivity3);
            v3Var.n = imageView3;
            imageView3.setClipToOutline(true);
            v3Var.n.setOutlineProvider(new u3());
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(d8.g(mainActivity3, 34), d8.g(mainActivity3, 34));
            layoutParams10.rightMargin = d8.g(mainActivity3, 8);
            linearLayout19.addView(v3Var.n, layoutParams10);
            TextView textViewO8 = k1.o(mainActivity3, w7.k(mainActivity3)[1], 13, 0, d8.p());
            v3Var.o = textViewO8;
            linearLayout19.addView(textViewO8);
            linearLayout18.addView(linearLayout19, v3.b(d8.g(mainActivity3, 6), 0, 0));
            linearLayout16.addView(linearLayout18);
            linearLayout8.addView(linearLayout16, v3.b(d8.g(mainActivity3, 12), 0, 0));
            TextView textViewO9 = k1.o(mainActivity3, "MỞ TRÊN MÀN HÌNH XE", 11, 1, d8.j(600));
            textViewO9.setLetterSpacing(0.1f);
            linearLayout8.addView(textViewO9, v3.b(d8.g(mainActivity3, 16), d8.g(mainActivity3, 4), d8.g(mainActivity3, 8)));
            LinearLayout linearLayoutA3 = ad.a(mainActivity3, 1);
            linearLayoutA3.setBackground(k1.t(d8.n(), d8.g(mainActivity3, 24)));
            linearLayoutA3.setPadding(d8.g(mainActivity3, 6), d8.g(mainActivity3, 6), d8.g(mainActivity3, 6), d8.g(mainActivity3, 6));
            ArrayList arrayList = v3Var.p;
            arrayList.clear();
            dd[] ddVarArrB2 = l0.b(mainActivity3);
            int i7 = 0;
            while (i7 < ddVarArrB2.length) {
                dd ddVar3 = ddVarArrB2[i7];
                LinearLayout linearLayout20 = new LinearLayout(mainActivity3);
                linearLayout20.setOrientation(0);
                linearLayout20.setGravity(16);
                dd[] ddVarArr3 = ddVarArrB2;
                linearLayout20.setPadding(d8.g(mainActivity3, 12), d8.g(mainActivity3, 12), d8.g(mainActivity3, 12), d8.g(mainActivity3, 12));
                k1.B(linearLayout20, 0, false, d8.g(mainActivity3, i6));
                linearLayout20.setOnClickListener(new u0(2, v3Var, ddVar3));
                ImageView imageView4 = new ImageView(mainActivity3);
                imageView4.setImageResource(ddVar3.c);
                LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(d8.g(mainActivity3, 32), d8.g(mainActivity3, 32));
                layoutParams11.rightMargin = d8.g(mainActivity3, 12);
                linearLayout20.addView(imageView4, layoutParams11);
                linearLayout20.addView(k1.o(mainActivity3, ddVar3.b, 16, 1, d8.o()), new LinearLayout.LayoutParams(0, -2, 1.0f));
                TextView textViewO10 = k1.o(mainActivity3, "Mở", 13, 1, d8.k());
                textViewO10.setGravity(17);
                textViewO10.setPadding(d8.g(mainActivity3, 16), d8.g(mainActivity3, 8), d8.g(mainActivity3, 16), d8.g(mainActivity3, 8));
                textViewO10.setTag(ddVar3.a);
                linearLayout20.addView(textViewO10);
                arrayList.add(textViewO10);
                linearLayoutA3.addView(linearLayout20);
                i7++;
                ddVarArrB2 = ddVarArr3;
                i6 = 18;
            }
            linearLayout8.addView(linearLayoutA3);
            v3Var.b = linearLayout8;
            v3Var.e();
        }
        scrollView2.addView(detach(v3Var.b), new ViewGroup.LayoutParams(-1, -2));
        this.body.addView(scrollView2, new FrameLayout.LayoutParams(-1, -1));
        v3 v3Var2 = this.controllerScreen;
        cb.a(v3Var2.a, v3Var2.s);
        startTicking();
    }

    private void requestAllPermissions() {
        if (xc.a(this, 9)) {
            return;
        }
        promptOverlayOnce();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNotice(JSONObject jSONObject) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        int iK = w1.k(this, 24);
        LinearLayout linearLayoutA = ad.a(this, 1);
        linearLayoutA.setBackground(k1.t(d8.n(), w1.k(this, 24)));
        linearLayoutA.setPadding(iK, iK, iK, w1.k(this, 20));
        String strOptString = jSONObject.optString("title", "");
        if (!strOptString.isEmpty()) {
            TextView textViewY = w1.y(this, strOptString, 19, d8.o());
            textViewY.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
            linearLayoutA.addView(textViewY);
        }
        String strOptString2 = jSONObject.optString("body", "");
        if (!strOptString2.isEmpty()) {
            TextView textViewY2 = w1.y(this, strOptString2, 15, d8.p());
            textViewY2.setLineSpacing(w1.k(this, 5), 1.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = strOptString.isEmpty() ? 0 : w1.k(this, 10);
            linearLayoutA.addView(textViewY2, layoutParams);
        }
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        String strOptString3 = jSONObject.optString("link", "");
        if (strOptString3.startsWith("https://")) {
            String strOptString4 = jSONObject.optString("link_label", "");
            if (strOptString4.isEmpty()) {
                strOptString4 = "Xem";
            }
            linearLayoutA.addView(w1.e(this, strOptString4, d8.a(), new n6(this, strOptString3, dialog, 0)));
        }
        TextView textViewE = w1.e(this, "Đóng", k1.x(), new i6(dialog, 1));
        textViewE.setTextColor(d8.o());
        linearLayoutA.addView(textViewE);
        dialog.setContentView(linearLayoutA);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(Math.min(getResources().getDisplayMetrics().widthPixels - w1.k(this, 48), w1.k(this, 400)), -2);
        }
        dialog.show();
    }

    private void showNoticeOnce() {
        a6.b.execute(new h(this, new l6(this, 6), 7, false));
    }

    private void showSplashOnce() {
        SplashView.c(this);
        getWindow().setStatusBarColor(SplashArt.L);
        getWindow().getDecorView().setSystemUiVisibility(8192);
        new Handler(Looper.getMainLooper()).postDelayed(new k6(this, 1), 1680L);
    }

    private void startHeartbeatWatch() {
        this.tick.removeCallbacks(this.heartbeatTicker);
        this.tick.postDelayed(this.heartbeatTicker, HEARTBEAT_TICK_MS);
    }

    private void startTicking() {
        this.tick.removeCallbacks(this.ticker);
        this.tick.postDelayed(this.ticker, TICK_MS);
    }

    private int statusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? getResources().getDimensionPixelSize(identifier) : w1.k(this, 28);
    }

    private void stopHeartbeatWatch() {
        this.tick.removeCallbacks(this.heartbeatTicker);
    }

    private void stopTicking() {
        this.tick.removeCallbacks(this.ticker);
    }

    private Runnable tab(int i) {
        return new d3(i, this, 1);
    }

    private void toast(String str) {
        Toast.makeText(this, str, 1).show();
    }

    public void bindVietmapWidget() {
        boolean zBindAppWidgetIdIfAllowed;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);
        if (this.bindHost == null) {
            this.bindHost = new AppWidgetHost(this, WIDGET_HOST_ID);
        }
        int i = this.pendingWidgetId;
        if (i >= 0) {
            try {
                this.bindHost.deleteAppWidgetId(i);
            } catch (Throwable unused) {
            }
        }
        this.pendingWidgetId = this.bindHost.allocateAppWidgetId();
        ComponentName componentName = new ComponentName(VM_PKG, VM_PROVIDER);
        try {
            zBindAppWidgetIdIfAllowed = appWidgetManager.bindAppWidgetIdIfAllowed(this.pendingWidgetId, componentName);
        } catch (Throwable th) {
            String.valueOf(th);
            zBindAppWidgetIdIfAllowed = false;
        }
        if (zBindAppWidgetIdIfAllowed) {
            onWidgetBound();
            return;
        }
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
        intent.putExtra("appWidgetId", this.pendingWidgetId);
        intent.putExtra("appWidgetProvider", componentName);
        try {
            startActivityForResult(intent, REQ_BIND_WIDGET);
        } catch (Throwable unused2) {
            toast("Không mở được hộp thoại kết nối widget");
        }
    }

    public void moHuongDan() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(buoc("tabDieuKhien", "Tab Điều khiển", "Chọn trang, phát / dừng, chuyển bài — màn hình xe làm theo ngay.\n\nNút vô lăng cũng vào đây: bấm NEXT hai lần để tìm bằng giọng nói.", tab(0)));
        arrayList.add(buoc("tabXem", "Tab Xem", "Duyệt web trên điện thoại, bấm “Gửi sang xe” để mở đúng trang đó trên màn hình xe.\n\nBật “Đồng bộ” thì bạn đổi trang ở đây, xe mở theo — chỉ một chiều điện thoại → xe.", null));
        arrayList.add(buoc("tabCaiDat", "Tab Cài đặt", "Mọi tuỳ chọn gom theo nhóm ở đây. Đi tiếp để xem nhanh từng mục chính.", null));
        arrayList.add(buoc("Hiện bong bóng tốc độ trên màn hình xe", "Bong bóng tốc độ", "Đồng hồ tốc độ nổi trên màn hình xe.\n\nKéo thả đặt chỗ tuỳ ý — mỗi màn nhớ chỗ riêng.", moNhom("Chung")));
        arrayList.add(buoc("Chỉ hiện biển báo & giới hạn (ẩn tốc độ xe)", "Chỉ hiện biển báo", "Ẩn số tốc độ, chỉ giữ biển giới hạn và cảnh báo — gọn và đỡ phân tâm khi lái.", null));
        arrayList.add(buoc("Kiểu bong bóng — 8 kiểu, vuốt ngang", "Kiểu bong bóng", "Tám kiểu hiển thị, vuốt ngang xem ảnh mẫu thật.\n\nNgay dưới là thanh chỉnh kích thước và độ mờ nền.", null));
        arrayList.add(buoc("viTriBong", "Đặt chỗ cho bong bóng", "Khung màn xe thu nhỏ — chạm hoặc kéo để đặt bong bóng, xe chạy theo ngay.\n\nDành cho màn xe không cảm ứng.", null));
        arrayList.add(buoc("nguonTocDo", "Nguồn giới hạn tốc độ", "Chọn nơi lấy biển giới hạn. CarStream tự lấy qua mạng — không cần cài thêm app nào.\n\nDùng VietMap, Gofa, Waze hay Wyn thì chọn nguồn đó, app đọc thẳng từ màn hình dẫn đường. Thẻ trạng thái bên dưới báo nguồn đang chạy hay đang vướng gì.", moNhom("Giới hạn tốc độ")));
        arrayList.add(buoc("Gửi cảnh báo lên HUD / đồng hồ xe", "Cảnh báo lên HUD", "Đẩy giới hạn tốc độ lên HUD hoặc đồng hồ sau vô lăng — cho xe có chỗ hiển thị đó.", moNhom("Chung")));
        arrayList.add(buoc("Hiển thị giới hạn tốc độ lên màn hình odo LED", "Màn odo LED", "Giới hạn tốc độ vẽ thành ảnh bìa bài đang phát — hiện ngay giữa đồng hồ.\n\nChạy cả khi bong bóng đang tắt.", null));
        arrayList.add(buoc("Thay tên bài bằng giới hạn tốc độ", "Thay tên bài", "Ô tên bài gửi sang xe hiện giới hạn tốc độ thay vì tên video.", null));
        arrayList.add(buoc("Hiện cuộc gọi trên màn hình xe", "Cuộc gọi trên màn hình xe", "Cuộc gọi Messenger, Zalo… hiện trên cùng màn hình xe — nghe, từ chối, kết thúc tại chỗ; vuốt thanh sang trái để cúp nhanh.\n\nCần cấp quyền đọc thông báo — gạt công tắc là được dẫn tới trang cấp.", moNhom("Cuộc gọi")));
        arrayList.add(buoc("Kêu chuông khi có cuộc gọi", "Chuông báo cuộc gọi", "Điện thoại đổ chuông to khi có cuộc gọi — kể cả khi máy đang để im lặng, vì nhạc trong xe thường át chuông thường.\n\nChuông kêu ở loa điện thoại: Android Auto không cho tiếng app ra loa xe trong lúc có cuộc gọi.", null));
        arrayList.add(buoc("Tự động toàn màn hình khi phát video", "Tự toàn màn hình", "Phát video là tự phóng to kín màn hình xe, không phải bấm thêm.", moNhom("Ứng dụng")));
        arrayList.add(buoc("chonApp", "Chọn mục hiện trên xe", "Dấu trừ bỏ bớt mục khỏi thanh ứng dụng của xe, ô + thêm lại.\n\nBỏ đi chỉ là ẩn — cài đặt riêng của mục vẫn còn.", null));
        arrayList.add(buoc("Thanh điều khiển khi toàn màn hình", "Thanh điều khiển", "Ba kiểu: Thanh ngang, Viên thuốc, Thẻ giấy — chọn rồi xem trước ngay tại chỗ.", null));
        arrayList.add(buoc("Cắt video phủ kín màn hình", "Cắt video phủ kín", "Cắt bớt hai bên để video phủ kín màn xe tỉ lệ vuông, bỏ viền đen.", null));
        arrayList.add(buoc("Tiết kiệm dữ liệu YouTube", "Tiết kiệm dữ liệu", "Ép hình xuống thấp, tiếng giữ nguyên — hợp khi nghe nhạc bằng 4G.", null));
        arrayList.add(buoc("Mở 2K/4K trên YouTube", "Bật 2K/4K", "Màn xe có sẵn 2K/4K thì bật. Mặc định app giữ độ phân giải vừa cho nhẹ máy và đỡ tốn 4G.", null));
        arrayList.add(buoc("Danh sách kênh (M3U)", "IPTV — kênh của bạn", "Dán đường dẫn danh sách kênh M3U của bạn — app tải về và nhớ, trên xe bấm IPTV là có.\n\nTrên xe: nút lưới bung danh sách, dấu sao đánh dấu kênh hay xem, nút vô lăng đổi kênh.", null));
        arrayList.add(buoc("Thanh công cụ trên màn hình xe", "Thanh công cụ", "Thanh trái trên màn hình xe: cố định, tự ẩn, hay thu thành núm kéo ra từ mép.", moNhom("Android Auto")));
        arrayList.add(buoc("Hiện mục Trò chơi trên thanh công cụ", "Trò chơi", "Thêm ô Trò chơi vào thanh trái — không dùng thì tắt cho gọn.", null));
        arrayList.add(buoc("Hiện mục Launcher trên thanh công cụ", "Launcher — app điện thoại", "Thêm ô Launcher: lưới ứng dụng điện thoại ngay trên màn hình xe, chạm là chiếu app đó lên xe (cần bộ chiếu chạy qua ADB không dây).\n\nCó sẵn hàng “Gần đây” và cảm ứng đa điểm (zoom/pinch) trên màn xe.", null));
        arrayList.add(buoc("launcherApps", "Chọn app cho Launcher", "Bật Launcher xong, chọn app nào hiện lên: dấu − bỏ, + thêm, ô tìm để lọc, “Xóa hết / Hiện hết” cho nhanh khi máy nhiều app.\n\nMặc định hiện hết; đổi xong màn hình xe cập nhật ngay.", null));
        arrayList.add(buoc("nhomKichHoat", "Kích hoạt", "Nhập key, xem hạn, và đổi sang máy khác khi cần — mỗi năm đổi được 2 lần.", moNhom("Kích hoạt")));
        int i = g3.p;
        if (arrayList.isEmpty()) {
            return;
        }
        if (g3.e(getWindow() != null ? getWindow().getDecorView() : null)) {
            return;
        }
        g3 g3Var = new g3(this, arrayList);
        addContentView(g3Var, new FrameLayout.LayoutParams(-1, -1));
        g3Var.post(new f(g3Var, 15));
        arrayList.size();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != REQ_BIND_WIDGET) {
            return;
        }
        if (i2 == -1) {
            onWidgetBound();
            return;
        }
        try {
            AppWidgetHost appWidgetHost = this.bindHost;
            if (appWidgetHost != null) {
                appWidgetHost.deleteAppWidgetId(this.pendingWidgetId);
            }
        } catch (Throwable unused) {
        }
        this.pendingWidgetId = -1;
        toast("Chưa kết nối được widget VietMap");
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        oc ocVar;
        WebView webView;
        if (this.currentTab == 1 && (webView = (ocVar = this.viewTab).c) != null && webView.canGoBack()) {
            ocVar.c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        applyThemeIfChanged();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k1.i(this);
        c5.d(this);
        ec.a(this);
        if (!ec.j(this)) {
            startActivity(new Intent(this, (Class<?>) ActivateActivity.class));
            finish();
            return;
        }
        this.boSungTay = getIntent().getBooleanExtra(EXTRA_PHONE_UI, false);
        boolean booleanExtra = getIntent().getBooleanExtra(EXTRA_SKIP_BOX, false);
        if (this.boSungTay) {
            setRequestedOrientation(0);
            this.currentTab = 2;
        }
        z6.a();
        if (!this.boSungTay && !booleanExtra) {
            z6.a();
        }
        if (!this.boSungTay && !booleanExtra && !z6.a()) {
            if (!ModeActivity.daHoiTrongPhien()) {
                startActivity(new Intent(this, (Class<?>) ModeActivity.class));
                finish();
                return;
            } else {
                ModeActivity.chonBox();
                if (ModeActivity.chonBox()) {
                    startActivity(new Intent(this, (Class<?>) BoxActivity.class));
                    finish();
                    return;
                }
            }
        }
        z6.b(this.aaListener);
        p9.i(this);
        k1.s(this);
        requestAllPermissions();
        this.controllerScreen = new v3(this);
        this.viewTab = new oc(this);
        this.settingsScreen = new qa(this, this.settingsListener);
        buildUi();
        showSplashOnce();
        handleAssistantIntent(getIntent());
        String str = a6.a;
        if (ec.j(this)) {
            a6.a(this, new c1(this, 5));
        }
        showNoticeOnce();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        z6.j.remove(this.aaListener);
        if (isFinishing() && !this.navigating && !this.boSungTay) {
            ModeActivity.quenLuaChon();
            z6.p();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        handleAssistantIntent(intent);
    }

    @Override // android.app.Activity
    public void onPause() {
        ab abVar;
        super.onPause();
        stopTicking();
        stopHeartbeatWatch();
        z6.h = null;
        z6.g = null;
        jc jcVar = this.vietmap;
        if (jcVar.a) {
            try {
                unregisterReceiver(jcVar);
            } catch (Exception unused) {
            }
            jcVar.a = false;
            jc.d.decrementAndGet();
        }
        WebView webView = this.viewTab.c;
        if (webView != null) {
            webView.onPause();
        }
        h2 h2Var = this.controllerScreen.s;
        CopyOnWriteArrayList copyOnWriteArrayList = cb.e;
        copyOnWriteArrayList.remove(h2Var);
        if (copyOnWriteArrayList.isEmpty() && cb.f.isEmpty()) {
            LocationManager locationManager = cb.h;
            if (locationManager != null && (abVar = cb.i) != null) {
                try {
                    locationManager.removeUpdates(abVar);
                } catch (Throwable unused2) {
                }
            }
            cb.i = null;
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 9) {
            promptOverlayOnce();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.navigating = false;
        if (!ec.j(this)) {
            goToActivate();
            return;
        }
        if (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("overlayPrompted"), false)) {
            promptCallOnce();
        }
        a6.c(this);
        z6.h = this.phoneDeact;
        z6.g = this.phoneUi;
        startHeartbeatWatch();
        applyThemeIfChanged();
        id.b(this);
        if (!w7.k) {
            this.vietmap.a(this);
        }
        render();
    }

    public void requestLocationIfNeeded() {
        if (checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 2);
        }
    }

    public void requestOverlayIfNeeded() {
        if (Settings.canDrawOverlays(this)) {
            return;
        }
        try {
            startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())));
        } catch (Exception e) {
            String.valueOf(e);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        if (intent != null && intent.getComponent() != null && getPackageName().equals(intent.getComponent().getPackageName())) {
            this.navigating = true;
        }
        super.startActivity(intent);
    }
}
