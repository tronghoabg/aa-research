package defpackage;

import android.content.Context;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;
import com.carstream.tech.car.ui.CarEditText;
import com.carstream.tech.launcher.Ui;
import com.google.android.gms.car.input.InputManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class t9 {
    public s9 a;
    public final e b;
    public final Handler c;
    public FrameLayout d;
    public w9 e;
    public CarEditText f;
    public rc g;
    public boolean i;
    public boolean j;
    public h k;
    public final q9 h = new q9(this);
    public final q9 l = new q9(this);

    public t9(e eVar, Handler handler) {
        this.b = eVar;
        this.c = handler;
    }

    public static void a(t9 t9Var, String str) {
        Handler handler = t9Var.c;
        e eVar = t9Var.b;
        h hVar = t9Var.k;
        if (hVar != null) {
            handler.removeCallbacks(hVar);
        }
        String strTrim = str.trim();
        if (!strTrim.isEmpty()) {
            h hVar2 = new h(14, t9Var, strTrim);
            t9Var.k = hVar2;
            handler.postDelayed(hVar2, 250L);
        } else {
            if (eVar.e() != null && eVar.e().k != null) {
                ((AtomicInteger) eVar.e().k.b).incrementAndGet();
            }
            t9Var.g(null);
        }
    }

    public final void b() {
        s9 s9Var = this.a;
        if (s9Var != null) {
            this.c.removeCallbacks(s9Var);
            this.a = null;
        }
    }

    public final void c() {
        rc rcVar = this.g;
        if (rcVar != null) {
            rcVar.a();
        }
        boolean z = this.j;
        e eVar = this.b;
        if (z) {
            this.j = false;
            eVar.y();
        }
        i(null, false);
        h hVar = this.k;
        if (hVar != null) {
            this.c.removeCallbacks(hVar);
            this.k = null;
        }
        if (eVar.e() != null && eVar.e().k != null) {
            ((AtomicInteger) eVar.e().k.b).incrementAndGet();
        }
        g(null);
        CarScreen carScreen = eVar.b;
        InputManager inputManager = carScreen.host() != null ? carScreen.host().getInputManager() : null;
        if (inputManager != null && inputManager.isInputActive()) {
            inputManager.stopInput();
        }
        this.d.setVisibility(8);
    }

    public final void d(String str) {
        String strReplace;
        e eVar = this.b;
        CarScreen carScreen = eVar.b;
        if (TextUtils.isEmpty(str)) {
            c();
            return;
        }
        if (eVar.e() == null || eVar.e().e == null) {
            dd[] ddVarArr = l0.a;
            int length = ddVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                dd ddVar = ddVarArr[i];
                if (ddVar.e != null) {
                    carScreen.openApp(ddVar);
                    break;
                }
                i++;
            }
        }
        if (eVar.e() == null || eVar.e().e == null) {
            c();
            return;
        }
        try {
            strReplace = URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            strReplace = str.replace(" ", "%20");
        }
        this.j = false;
        c();
        carScreen.moTrongTrang(eVar.e().e + strReplace);
    }

    public final boolean e() {
        FrameLayout frameLayout = this.d;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }

    public final void f(boolean z) {
        CarScreen carScreen = this.b.b;
        w9 w9Var = this.e;
        if (w9Var != null) {
            int iG = carScreen.rail != null ? carScreen.rail.g() : 0;
            FrameLayout frameLayout = w9Var.c;
            if (frameLayout != null && w9Var.d != null && w9Var.e != null) {
                frameLayout.setPadding(iG, 0, 0, 0);
                int iRound = Math.round((w9Var.f - iG) * 0.54f);
                if (iRound > 0) {
                    FrameLayout.LayoutParams layoutParams = w9Var.e;
                    layoutParams.width = iRound;
                    w9Var.d.setLayoutParams(layoutParams);
                }
            }
        }
        this.d.setVisibility(0);
        this.d.bringToFront();
        if (carScreen.rootLayout != null) {
            carScreen.rootLayout.invalidate();
        }
        this.f.setText("");
        this.f.requestFocus();
        g(null);
        if (!z) {
            CarEditText carEditText = this.f;
            InputManager inputManager = carScreen.host() != null ? carScreen.host().getInputManager() : null;
            if (inputManager != null && inputManager.isValid()) {
                inputManager.startInput(carEditText);
            }
        }
        if (z) {
            this.c.postDelayed(new s9(this, 2), 300L);
        }
    }

    public final void g(List list) {
        v9 v9Var;
        w9 w9Var = this.e;
        if (w9Var == null || (v9Var = w9Var.h) == null) {
            return;
        }
        v9Var.removeAllViews();
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size() && i < 8; i++) {
            v9 v9Var2 = w9Var.h;
            String str = (String) list.get(i);
            Context context = w9Var.a;
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setGravity(17);
            textView.setTypeface(d8.f(context, 1));
            textView.setTextSize(2, w9Var.e(20.0f));
            textView.setTextColor(d8.o());
            textView.setSingleLine(true);
            textView.setPadding(w9Var.d(24), 0, w9Var.d(24), 0);
            textView.setMinHeight(Math.max(w9Var.d(66), d8.g(context, 42)));
            textView.setBackground(w9.a(k1.h ? -15265265 : -990000, w9.b(), w9Var.d(2), w9Var.d(Ui.R_PILL)));
            textView.setOnClickListener(new u0(7, w9Var, str));
            v9Var2.addView(textView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110 A[PHI: r4
  0x0110: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v6 java.lang.String) binds: [B:37:0x0075, B:39:0x007d, B:69:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.h(java.lang.String):void");
    }

    public final void i(String str, boolean z) {
        rc rcVar;
        w9 w9Var = this.e;
        if (w9Var != null) {
            boolean z2 = (z || (rcVar = this.g) == null || !rcVar.d) ? false : true;
            if (w9Var.i == null) {
                return;
            }
            boolean z3 = str != null && str.length() > 0;
            TextView textView = w9Var.i;
            if (!z3) {
                str = "";
            }
            textView.setText(str);
            w9Var.i.setVisibility(z3 ? 0 : 8);
            ImageView imageView = w9Var.j;
            if (imageView != null) {
                k1.B(imageView, z2 ? d8.b(700) : d8.a(), true, 0);
            }
        }
    }

    public final void j(boolean z) {
        boolean zIsRecognitionAvailable;
        this.i = z;
        e eVar = this.b;
        CarScreen carScreen = eVar.b;
        try {
            zIsRecognitionAvailable = SpeechRecognizer.isRecognitionAvailable(carScreen);
        } catch (Exception unused) {
            zIsRecognitionAvailable = false;
        }
        int i = 1;
        if (!zIsRecognitionAvailable) {
            i("Máy không hỗ trợ nhận dạng giọng nói", true);
            return;
        }
        if (this.g == null) {
            this.g = new rc(carScreen, this.l);
        }
        InputManager inputManager = carScreen.host() != null ? carScreen.host().getInputManager() : null;
        if (inputManager != null && inputManager.isInputActive()) {
            inputManager.stopInput();
        }
        this.j = eVar.h();
        eVar.s();
        i("Đang nghe", false);
        rc rcVar = this.g;
        if (rcVar != null) {
            rcVar.b();
        }
        r9 r9Var = new r9(this, z);
        s9 s9Var = new s9(this, 0);
        Context applicationContext = carScreen.getApplicationContext();
        int[] iArr = ec.e;
        int i2 = xc.l(carScreen).getInt(xc.h("voicePromptUsage"), -1);
        if (i2 >= 0) {
            int[] iArr2 = new int[3];
            iArr2[0] = i2;
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (i4 != i2) {
                    iArr2[i] = i4;
                    i++;
                }
            }
            if (i == 3) {
                iArr = iArr2;
            }
        }
        ec.n(applicationContext, r9Var, s9Var, iArr, 0);
    }
}
