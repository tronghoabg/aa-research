package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import com.android.car.libraries.apphost.external.model.WebViewTemplate;
import com.google.android.apps.auto.components.gearsnacks.GearSnacksService;

/* loaded from: classes2.dex */
public final class lfg extends qw {
    private static final ygr f = ygr.p("google.com", "www.google.com");
    private final String g;

    public lfg(qn qnVar, String str) {
        super(qnVar);
        this.g = str;
        ((ype) GearSnacksService.c.l().ai((char) 3863)).y("Starting game screen for %s", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qw
    public final wb h() {
        sx sxVar = new sx();
        sxVar.b(Action.BACK);
        ActionStrip actionStripA = sxVar.a();
        gkr gkrVar = new gkr(this.g);
        gkrVar.b = actionStripA;
        gkrVar.d = false;
        gkrVar.c = true;
        gkrVar.e = true;
        yno it = f.iterator();
        while (it.hasNext()) {
            gkrVar.f.add((String) it.next());
        }
        return new WebViewTemplate(gkrVar, null);
    }
}
