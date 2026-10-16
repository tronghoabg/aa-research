package defpackage;

import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import com.carstream.tech.phone.MainActivity;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class mc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ mc(oc ocVar, int i) {
        this.a = i;
        this.b = ocVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        switch (this.a) {
            case 0:
                oc ocVar = this.b;
                MainActivity mainActivity = ocVar.a;
                if (z6.n() != null) {
                    ocVar.j = null;
                    WebView webView2 = ocVar.c;
                    if (webView2 != null) {
                        ocVar.e(webView2.getUrl());
                    }
                    Toast.makeText(mainActivity, "Đã gửi sang màn hình xe", 0).show();
                    break;
                } else {
                    Toast.makeText(mainActivity, "Chưa mở CarStream trên màn hình xe", 0).show();
                    break;
                }
            default:
                oc ocVar2 = this.b;
                o8 o8Var = ocVar2.h;
                o8Var.a = !o8Var.a;
                o8Var.a(true);
                xc.m(ocVar2.a, "viewMirror", ocVar2.h.a);
                if (ocVar2.h.a && (webView = ocVar2.c) != null) {
                    ocVar2.e(webView.getUrl());
                    break;
                }
                break;
        }
    }
}
