package defpackage;

import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.carstream.tech.car.a;
import com.carstream.tech.car.e;
import com.carstream.tech.car.ui.CarEditText;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class u0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a aVar = (a) this.c;
                a.b(aVar);
                ((s2) aVar.b).a.openApp((dd) this.b);
                break;
            case 1:
                r8 r8Var = (r8) ((z2) this.c).b;
                if (r8Var != null) {
                    r8Var.b((bd) this.b);
                    break;
                }
                break;
            case 2:
                y6 y6VarN = z6.n();
                if (y6VarN != null) {
                    ((e) y6VarN).p(((dd) this.b).a);
                }
                ((v3) this.c).e();
                break;
            case 3:
                q4 q4Var = (q4) this.c;
                pc pcVar = (pc) this.b;
                q4Var.j = pcVar;
                q4Var.k = 0;
                q4Var.g.setText(pcVar.b);
                q4Var.h.setText("0");
                q4Var.i.loadUrl("file:///android_asset/games/" + pcVar.a + "/index.html");
                q4Var.d.setVisibility(8);
                q4Var.e.setVisibility(0);
                WebView webView = q4Var.i;
                if (webView != null && q4Var.j != null) {
                    webView.onResume();
                    q4Var.i.evaluateJavascript("window.dispatchEvent(new Event('cargame:resume'))", null);
                    break;
                }
                break;
            case 4:
                x4 x4Var = ((z4) this.c).b;
                y4 y4Var = (y4) this.b;
                s2 s2Var = (s2) x4Var;
                s2Var.getClass();
                dd ddVarA = l0.a(y4Var.a);
                if (ddVarA != null) {
                    s2Var.a.openApp(ddVarA, y4Var.f);
                    break;
                }
                break;
            case 5:
                ((Dialog) this.b).dismiss();
                ((Runnable) this.c).run();
                break;
            case 6:
                o8 o8Var = (o8) this.b;
                o8Var.a = !o8Var.a;
                o8Var.a(true);
                ((n8) this.c).a(o8Var.a);
                break;
            case 7:
                w9 w9Var = (w9) this.c;
                CarEditText carEditText = w9Var.g;
                String str = (String) this.b;
                carEditText.setText(str);
                w9Var.b.a.h(str);
                break;
            case 8:
                fa faVar = (fa) this.c;
                xc.p(faVar.a, "playerStyle", ((t8) this.b).a);
                faVar.c();
                e eVar = faVar.c;
                if (eVar != null) {
                    eVar.o();
                    break;
                }
                break;
            case 9:
                fa faVar2 = (fa) this.c;
                xc.p(faVar2.a, "speedStyle", ((t8) this.b).a);
                faVar2.d();
                e eVar2 = faVar2.c;
                if (eVar2 != null) {
                    eVar2.o();
                    break;
                }
                break;
            case 10:
                ((TextView) this.b).setText("Đang tải…");
                w1.t(((qa) this.c).a, new c1(this, 7));
                break;
            default:
                ((oc) this.c).d((dd) this.b);
                break;
        }
    }

    public /* synthetic */ u0(KeyEvent.Callback callback, Object obj, int i) {
        this.a = i;
        this.b = callback;
        this.c = obj;
    }
}
