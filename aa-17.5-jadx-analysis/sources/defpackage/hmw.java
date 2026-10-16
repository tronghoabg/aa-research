package defpackage;

import androidx.car.app.model.Action;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class hmw extends gwc {
    public static final yob a = yob.c("com/android/car/libraries/apphost/webview/WebViewTemplateInternalToUiModelEmitter");
    public final geu b;
    public final hmr c;
    public final ajab d = ajac.a(null);
    private final aiyk e;

    public hmw(geu geuVar) {
        this.b = geuVar;
        List<Action> listBg = woy.bg(Action.BACK);
        ArrayList arrayList = new ArrayList(woy.bp(listBg, 10));
        for (Action action : listBg) {
            action.getClass();
            geu geuVar2 = this.b;
            arrayList.add(fvl.c(action, geuVar2, ((ggk) geuVar2.F(ggk.class)).f(), null, false, 12));
        }
        this.c = new hmr(new fza(null, hmp.c(arrayList, this.b), null, null, 59), new grw(null, gey.b(this.b.getString(R.string.webview_template_error_message)), null, null, 0, false, 61));
        this.e = aizc.b(new hcg(new jxz(this.n, 6), this, 3), new hcg(new jxz(this.d, 6), new dxi(this, (afck) null, 13), 16));
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.e;
    }
}
