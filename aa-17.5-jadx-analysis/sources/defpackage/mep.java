package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import com.android.car.libraries.apphost.external.model.DialpadTemplate;

/* loaded from: classes2.dex */
public final class mep implements tho {
    private static final Header a;

    static {
        ua uaVar = new ua();
        uaVar.c(Action.BACK);
        a = uaVar.a();
    }

    @Override // defpackage.tho
    public final /* bridge */ /* synthetic */ eqj a(qw qwVar, Object obj) {
        oct octVar = (oct) obj;
        octVar.getClass();
        gjr gjrVar = new gjr();
        gjrVar.a = a;
        gjrVar.b = (String) octVar.a;
        DialpadTemplate dialpadTemplateA = gjrVar.a();
        afco afcoVar = tby.a;
        return new eqm(dialpadTemplateA);
    }
}
