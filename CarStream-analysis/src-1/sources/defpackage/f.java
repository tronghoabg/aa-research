package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.carstream.tech.box.BoxActivity;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.a;
import com.carstream.tech.car.e;
import com.carstream.tech.core.gofa.GofaTap;
import com.carstream.tech.media.ControllerService;
import com.carstream.tech.phone.ActivateActivity;
import com.carstream.tech.phone.MainActivity;
import com.carstream.tech.phone.ModeActivity;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zNamNgang;
        HttpURLConnection httpURLConnection = null;
        int i = 1;
        switch (this.a) {
            case 0:
                ActivateActivity activateActivity = (ActivateActivity) ((l) this.b).b;
                if (!activateActivity.isFinishing() && (zNamNgang = ModeActivity.namNgang(activateActivity)) != activateActivity.manNgang) {
                    activateActivity.setRequestedOrientation(!zNamNgang ? 1 : 0);
                    break;
                }
                break;
            case 1:
                ((k) ((f) this.b).b).a.animate().translationX(0.0f).setDuration(160L).start();
                break;
            case 2:
                k kVar = (k) this.b;
                kVar.a.animate().translationX((-kVar.b) * 0.5f).setDuration(120L).withEndAction(new f(this, i)).start();
                break;
            case 3:
                ((j) this.b).b.startBreathing();
                break;
            case 4:
                w0 w0Var = (w0) this.b;
                a.a((a) w0Var.c, (ScrollView) w0Var.b);
                break;
            case 5:
                ((f1) this.b).b.a.a("if(window.__cntGoFullscreen){window.__cntGoFullscreen();}");
                break;
            case 6:
                WebView webView = (WebView) this.b;
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    float width = webView.getWidth() / 2.0f;
                    float height = webView.getHeight() / 3.0f;
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, width, height, 0);
                    webView.dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis, 60 + jUptimeMillis, 1, width, height, 0);
                    webView.dispatchTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    break;
                } catch (Exception e) {
                    e.getMessage();
                    return;
                }
            case 7:
                BoxActivity boxActivity = (BoxActivity) ((l) this.b).b;
                if (!boxActivity.isFinishing()) {
                    ControllerService controllerService = z6.a;
                    if (boxActivity.screen != null) {
                        boxActivity.screen.pauseNow();
                    }
                    boxActivity.startActivity(new Intent(boxActivity, (Class<?>) MainActivity.class));
                    boxActivity.finish();
                    break;
                }
                break;
            case 8:
                FrameLayout frameLayout = ((r1) this.b).b;
                if (frameLayout != null) {
                    frameLayout.bringToFront();
                    break;
                }
                break;
            case 9:
                if (u1.e != null && u1.e.a.equals((String) this.b) && u1.c != 1) {
                    u1.c(1);
                    break;
                }
                break;
            case 10:
                u1.a((PendingIntent) this.b);
                break;
            case 11:
                j2 j2Var = ((g2) this.b).a;
                if (j2Var.d && !j2Var.e) {
                    j2Var.e = true;
                    break;
                }
                break;
            case 12:
                j2 j2Var2 = (j2) ((h2) this.b).b;
                String str = j2.j;
                j2Var2.b();
                break;
            case 13:
                j2 j2Var3 = (j2) ((i2) this.b).b;
                String str2 = j2.j;
                j2Var3.b();
                break;
            case 14:
                ((CarScreen) this.b).js("var v=(window.__cntVideo&&window.__cntVideo())||document.querySelector('video'); if(v&&v.paused){v.play();}");
                break;
            case 15:
                g3.a((g3) this.b);
                break;
            case 16:
                ControllerService controllerService2 = ((w3) this.b).a;
                controllerService2.pendingSkip = null;
                y6 y6VarPlayerOrLog = controllerService2.playerOrLog("onSkipToNext (het cho)");
                if (y6VarPlayerOrLog != null) {
                    ((e) y6VarPlayerOrLog).l();
                    break;
                }
                break;
            case 17:
                ((f) this.b).run();
                break;
            case 18:
                q4 q4Var = ((p4) this.b).a;
                q4Var.h.setText(String.valueOf(q4Var.k));
                break;
            case 19:
                GofaTap gofaTap = (GofaTap) this.b;
                gofaTap.scan();
                gofaTap.handler.postDelayed(this, 400L);
                break;
            case 20:
                ((c1) this.b).d("chưa có nguồn nào");
                break;
            case 21:
                JSONObject jSONObject = (JSONObject) this.b;
                try {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(a6.a + "/v1/relaylog").openConnection();
                        try {
                            httpURLConnection2.setConnectTimeout(6000);
                            httpURLConnection2.setReadTimeout(6000);
                            httpURLConnection2.setRequestMethod("POST");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                            OutputStream outputStream = httpURLConnection2.getOutputStream();
                            outputStream.write(jSONObject.toString().getBytes("UTF-8"));
                            outputStream.close();
                            httpURLConnection2.getResponseCode();
                            httpURLConnection2.disconnect();
                        } catch (Throwable unused) {
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                                return;
                            }
                            return;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    return;
                }
            case 22:
                ((x5) ((c1) this.b).b).a();
                break;
            case 23:
                TextView textView = ((x5) this.b).f;
                if (textView != null) {
                    textView.setVisibility(8);
                    break;
                }
                break;
            case 24:
                ((y5) this.b).c(new z5(false, "bad_request", null));
                break;
            case 25:
                h hVar = (h) this.b;
                l6 l6Var = (l6) hVar.c;
                if (l6Var.b.settingsScreen != null) {
                    l6Var.b.settingsScreen.n();
                }
                z6.r(((dd) hVar.b).a);
                break;
            case 26:
                ((l6) this.b).b.changeKey();
                break;
            case 27:
                MainActivity mainActivity = (MainActivity) ((l) this.b).b;
                if (!mainActivity.isFinishing() && !mainActivity.boSungTay) {
                    if (!ModeActivity.daHoiTrongPhien()) {
                        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) ModeActivity.class));
                    } else if (ModeActivity.chonBox()) {
                        mainActivity.startActivity(new Intent(mainActivity, (Class<?>) BoxActivity.class));
                    }
                    mainActivity.finish();
                    break;
                }
                break;
            case 28:
                try {
                    MainActivity mainActivity2 = ((l6) ((x6) this.b)).b;
                    if (mainActivity2.settingsScreen != null) {
                        mainActivity2.settingsScreen.n();
                    }
                    mainActivity2.render();
                    break;
                } catch (Throwable th) {
                    String.valueOf(th);
                    return;
                }
            default:
                ((ModeActivity) ((l) this.b).b).vaoDienThoai();
                break;
        }
    }

    public f(l lVar, boolean z) {
        this.a = 0;
        this.b = lVar;
    }

    public f(PendingIntent pendingIntent, String str) {
        this.a = 10;
        this.b = pendingIntent;
    }
}
