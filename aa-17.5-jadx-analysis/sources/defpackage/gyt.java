package defpackage;

import android.content.Context;
import com.android.car.libraries.apphost.external.model.GridWrapperTemplate;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import java.util.List;

/* loaded from: classes2.dex */
public final class gyt implements ghq {
    private final /* synthetic */ int c;
    public static final gyt b = new gyt(4);
    public static final gyt a = new gyt(0);

    public gyt(int i) {
        this.c = i;
    }

    @Override // defpackage.ghq
    public final boolean b(wb wbVar, wb wbVar2, int i) {
        int i2 = this.c;
        if (i2 == 1) {
            affa.d("remoteBytes");
            throw null;
        }
        if (i2 == 2) {
            return ghm.d(((GridWrapperTemplate) wbVar).getTemplate(), ((GridWrapperTemplate) wbVar2).getTemplate(), 2);
        }
        if (i2 != 3) {
            return true;
        }
        return affa.f(((WebViewTemplate) wbVar).getUrl(), ((WebViewTemplate) wbVar2).getUrl());
    }

    @Override // defpackage.ghq
    public final /* synthetic */ List c(wb wbVar, wb wbVar2) {
        int i = this.c;
        if (i == 0) {
            int i2 = yfq.d;
            return yls.a;
        }
        if (i == 1) {
            int i3 = yfq.d;
            return yls.a;
        }
        if (i == 2) {
            int i4 = yfq.d;
            return yls.a;
        }
        if (i != 3) {
            int i5 = yfq.d;
            return yls.a;
        }
        int i6 = yfq.d;
        return yls.a;
    }

    @Override // defpackage.ghq
    public final /* synthetic */ void a(Context context, wb wbVar) {
    }
}
