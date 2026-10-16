package defpackage;

import android.content.res.Resources;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Tab;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.internal.model.TabContentsInternal;
import com.android.car.libraries.apphost.internal.model.TabTemplateInternal;
import com.google.android.projection.gearhead.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class mqn extends qw {
    public static final /* synthetic */ int k = 0;
    private static final yph l = yph.c("LauncherCarAppService");
    public List f;
    public List g;
    public List h;
    public boolean i;
    public String j;
    private final mqi m;
    private boolean n;
    private boolean o;
    private final Map p;
    private final int q;

    public mqn(qn qnVar, mqi mqiVar) {
        super(qnVar);
        this.m = mqiVar;
        this.i = true;
        this.p = new HashMap();
        this.j = "ANDROID_AUTO_COMPATIBLE_APPS_ID";
        this.q = qnVar.getResources().getColor(R.color.boardwalk_standard_red_dark, qnVar.getTheme());
        eqj eqjVar = mqiVar.a;
        eqjVar.getClass();
        tby.v(eqjVar, new mii(6)).fE(this, new med(new mcm(this, 20), 5));
        mqiVar.b.fE(this, new med(new mqm(this, 1), 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.wb a(java.util.List r35) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqn.a(java.util.List):wb");
    }

    @Override // defpackage.qw
    public final wb h() throws Resources.NotFoundException {
        wb wbVarA;
        l.l().u("LauncherCarAppService.onGetTemplate");
        Map map = this.p;
        if (map.isEmpty()) {
            vt vtVar = new vt();
            vtVar.c("Car Optimized Apps");
            vtVar.c = "ANDROID_AUTO_COMPATIBLE_APPS_ID";
            qn qnVar = this.a;
            vtVar.b(new CarIcon(new tj(IconCompat.m(qnVar, R.drawable.gs_android_auto_vd_theme_24))));
            map.put("ANDROID_AUTO_COMPATIBLE_APPS_ID", vtVar.a());
            vt vtVar2 = new vt();
            vtVar2.c("Entertainment Apps");
            vtVar2.c = "ENTERTAINMENT_APPS_ID";
            vtVar2.b(new CarIcon(new tj(IconCompat.m(qnVar, R.drawable.gs_confirmation_number_vd_theme_24))));
            map.put("ENTERTAINMENT_APPS_ID", vtVar2.a());
            if (acpf.k()) {
                vt vtVar3 = new vt();
                vtVar3.c("Phone Apps");
                vtVar3.c = "ALL_PHONE_APPS_ID";
                vtVar3.b(new CarIcon(new tj(IconCompat.m(qnVar, R.drawable.gs_smartphone_vd_theme_24))));
                map.put("ALL_PHONE_APPS_ID", vtVar3.a());
            }
        }
        gmv gmvVar = new gmv(new thm(this, 1));
        Object obj = map.get("ANDROID_AUTO_COMPATIBLE_APPS_ID");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        gmvVar.a((Tab) obj);
        Object obj2 = map.get("ENTERTAINMENT_APPS_ID");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        gmvVar.a((Tab) obj2);
        String str = this.j;
        if (affa.f(str, "ANDROID_AUTO_COMPATIBLE_APPS_ID")) {
            wbVarA = a(this.f);
        } else {
            int i = 5;
            if (affa.f(str, "ENTERTAINMENT_APPS_ID")) {
                if (!this.n) {
                    this.n = true;
                    eqj eqjVar = this.m.a;
                    eqjVar.getClass();
                    tby.v(eqjVar, new mii(i)).fE(this, new med(new mqm(this, 0), 5));
                }
                int i2 = yfq.d;
                yfl yflVar = new yfl(4);
                List list = this.h;
                if (list != null) {
                    yflVar.k(list);
                }
                wbVarA = a(yflVar.g());
            } else {
                if (!this.o) {
                    this.o = true;
                    ((eqj) this.m.e.a()).fE(this, new med(new mcm(this, 19), 5));
                }
                wbVarA = a(this.g);
            }
        }
        gmvVar.e = new TabContentsInternal(new gms(wbVarA));
        gmvVar.f = this.j;
        gmvVar.c = Action.APP_ICON;
        if (acpf.k()) {
            Object obj3 = map.get("ALL_PHONE_APPS_ID");
            if (obj3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            gmvVar.a((Tab) obj3);
        }
        return new TabTemplateInternal(gmvVar);
    }
}
