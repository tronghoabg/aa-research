package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.k;
import com.carstream.tech.car.u;
import com.carstream.tech.phone.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z = true;
        int i = 6;
        HttpURLConnection httpURLConnection = null;
        switch (this.a) {
            case 0:
                ((i) this.c).b.applyResult((z5) this.b);
                return;
            case 1:
                y yVar = (y) this.c;
                String str = (String) yVar.b;
                e1 e1Var = (e1) yVar.d;
                if (str.equals(e1Var.b)) {
                    Bitmap bitmap = (Bitmap) this.b;
                    if (bitmap == null) {
                        e1Var.b = null;
                        return;
                    }
                    e1Var.c = bitmap;
                    d1 d1Var = (d1) yVar.c;
                    if (d1Var != null) {
                        d1Var.a(bitmap);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((CarScreen) this.c).ghiCoMan((k) this.b);
                return;
            case 3:
                ((WebView) this.b).evaluateJavascript((String) this.c, null);
                return;
            case 4:
                ((InputMethodManager) this.b).showSoftInput((View) this.c, 1);
                return;
            case 5:
                ((c1) ((s5) this.c).e).d((String) this.b);
                return;
            case 6:
                ((l6) ((h) this.c).c).b.showNotice((JSONObject) this.b);
                return;
            case 7:
                MainActivity mainActivity = (MainActivity) this.b;
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(a6.a + "/v1/notice").openConnection();
                    try {
                        httpURLConnection2.setConnectTimeout(4000);
                        httpURLConnection2.setReadTimeout(4000);
                        if (httpURLConnection2.getResponseCode() == 200) {
                            InputStream inputStream = httpURLConnection2.getInputStream();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                } else {
                                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString("UTF-8"));
                                    if (jSONObject.optBoolean("on", false)) {
                                        long jOptLong = jSONObject.optLong("id", 0L);
                                        if (jOptLong > xc.l(mainActivity).getLong(xc.h("noticeSeen"), 0L)) {
                                            xc.o(mainActivity, "noticeSeen", jOptLong);
                                            a6.c.post(new h(i, this, jSONObject));
                                        }
                                    }
                                }
                            }
                        }
                        httpURLConnection2.disconnect();
                        return;
                    } catch (Exception unused) {
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
            case 8:
                ((y5) ((s5) this.c).e).c((z5) this.b);
                return;
            case 9:
                MainActivity mainActivity2 = (MainActivity) this.c;
                mainActivity2.chuyenTab(2);
                if (mainActivity2.settingsScreen != null) {
                    qa qaVar = mainActivity2.settingsScreen;
                    String str2 = (String) this.b;
                    HashSet hashSet = qaVar.c;
                    if (hashSet.contains(str2)) {
                        return;
                    }
                    hashSet.add(str2);
                    qaVar.c();
                    return;
                }
                return;
            case 10:
                ((dd) this.b).f.l(new f(this, 25));
                return;
            case 11:
                a8 a8Var = (a8) this.c;
                CarScreen carScreen = a8Var.a.b;
                FrameLayout frameLayout = (FrameLayout) this.b;
                int width = frameLayout.getWidth();
                int height = frameLayout.getHeight();
                int width2 = a8Var.b.getWidth();
                int height2 = a8Var.b.getHeight();
                if (width == 0 || height == 0 || width2 == 0 || height2 == 0) {
                    return;
                }
                int i3 = xc.l(carScreen).getInt(xc.h(a8.a(a8Var, "fabX")), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                int i4 = carScreen.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h(a8.a(a8Var, "fabY")), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                if (i3 == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE) {
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a8Var.b.getLayoutParams();
                layoutParams.gravity = 8388659;
                layoutParams.setMarginEnd(0);
                layoutParams.bottomMargin = 0;
                layoutParams.leftMargin = i3;
                layoutParams.topMargin = i4;
                layoutParams.leftMargin = Math.max(0, Math.min(i3, Math.max(0, width - width2)));
                layoutParams.topMargin = Math.max(0, Math.min(i4, Math.max(0, height - height2)));
                a8Var.b.setLayoutParams(layoutParams);
                return;
            case 12:
                WebView webView = (WebView) this.b;
                try {
                    webView.onResume();
                    webView.resumeTimers();
                    webView.requestFocus();
                    webView.requestLayout();
                    webView.invalidate();
                    FrameLayout frameLayout2 = ((u) this.c).a.a.rootLayout;
                    if (frameLayout2 != null) {
                        frameLayout2.requestLayout();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.getMessage();
                    return;
                }
            case 13:
                try {
                    try {
                        String strO = ec.o((Context) this.b);
                        if (!strO.isEmpty()) {
                            byte[] bArrA = p9.a(strO, (String) this.c, p9.h((Context) this.b) != null);
                            if (bArrA != null && bArrA.length >= 28) {
                                p9.b((Context) this.b, (String) this.c, bArrA);
                                p9.g.put((String) this.c, Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } finally {
                        p9.f.remove((String) this.c);
                    }
                } catch (o9 unused3) {
                    if (!p9.k) {
                        p9.k = true;
                        Context context = (Context) this.b;
                        String str3 = a6.a;
                        if (ec.j(context)) {
                            a6.a(context, new c1(context, 5));
                        }
                        try {
                            Thread.sleep(1500L);
                        } catch (InterruptedException unused4) {
                        }
                        p9.c = null;
                        p9.d = null;
                        p9.b.clear();
                        try {
                            String strO2 = ec.o((Context) this.b);
                            String str4 = (String) this.c;
                            if (p9.h((Context) this.b) == null) {
                                z = false;
                            }
                            byte[] bArrA2 = p9.a(strO2, str4, z);
                            if (bArrA2 != null && bArrA2.length >= 28) {
                                p9.b((Context) this.b, (String) this.c, bArrA2);
                                p9.g.put((String) this.c, Long.valueOf(System.currentTimeMillis()));
                            }
                        } catch (Throwable th3) {
                            String.valueOf(th3);
                        }
                    }
                } catch (Throwable unused5) {
                }
                return;
            case 14:
                t9 t9Var = (t9) this.c;
                z zVar = t9Var.b.e() == null ? null : t9Var.b.e().k;
                if (zVar == null) {
                    t9Var.g(null);
                    return;
                } else {
                    new Thread(new hb(zVar, (String) this.b, ((AtomicInteger) zVar.b).incrementAndGet(), new c1(this, i)), "suggest").start();
                    return;
                }
            case 15:
                hb hbVar = (hb) this.c;
                if (hbVar.b != ((AtomicInteger) hbVar.d.b).get()) {
                    return;
                }
                ((t9) ((h) hbVar.c.b).c).g((List) this.b);
                return;
            default:
                ((ub) ((y) this.c).c).a((Bitmap) this.b);
                return;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public h(s5 s5Var, int i, String str) {
        this.a = 5;
        this.c = s5Var;
        this.b = str;
    }
}
