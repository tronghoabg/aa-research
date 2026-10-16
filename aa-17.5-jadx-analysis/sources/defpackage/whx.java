package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes3.dex */
public final class whx extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public whx(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        wic wicVar = new wic();
        String str = this.b;
        if (str == null) {
            str = "https://www.google.com/policies/terms/";
        }
        Context context = this.a;
        vuf.I(context, str);
        wox woxVar = wia.c;
        if (wia.c(adgs.c(wia.b))) {
            String str2 = this.c;
            wib wibVarA = wib.a();
            abnp abnpVarN = abwm.a.n();
            abnpVarN.t();
            ((abwm) abnpVarN.b).b = aclh.g(2);
            abnpVarN.t();
            ((abwm) abnpVarN.b).c = aclh.f(5);
            wibVarA.d((abwm) abnpVarN.q(), wicVar.b(), wicVar.a(), context, str2);
        }
    }
}
