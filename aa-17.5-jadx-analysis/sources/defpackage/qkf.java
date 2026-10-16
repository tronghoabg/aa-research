package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class qkf extends qkk {
    private static final yph a = yph.c("GH.NPAdapter");
    private final Set b;

    public qkf(ykd ykdVar) {
        super(ykdVar);
        this.b = new HashSet();
    }

    @Override // defpackage.qkk
    protected final nur a(moa moaVar) {
        boolean zContains;
        if (moaVar.N() != null) {
            Set set = this.b;
            zContains = set.contains(moaVar.N());
            set.add(moaVar.N());
        } else {
            zContains = true;
        }
        moa moaVar2 = this.g;
        yzr yzrVarJ = moaVar2.J();
        yzr yzrVar = yzr.NAV_NOTIFICATION_HERO;
        String string = (yzrVarJ != yzrVar || moaVar2.L() == null) ? moaVar2.K() == null ? null : moaVar2.K().toString() : moaVar2.L().toString();
        moa moaVar3 = this.g;
        String string2 = (moaVar3.J() != yzrVar || moaVar3.K() == null) ? moaVar3.L() == null ? null : moaVar3.L().toString() : moaVar3.K().toString();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        String str = true != zIsEmpty ? string2 : null;
        if (true == zIsEmpty) {
            string = string2;
        }
        Bitmap bitmapC = moaVar.C();
        GhIcon ghIcon = bitmapC == null ? new GhIcon(8) : GhIcon.l(bitmapC);
        PendingIntent pendingIntentBo = roc.bo(moaVar, null);
        num numVar = new num();
        numVar.d = ghIcon;
        numVar.c = pendingIntentBo;
        numVar.f = moaVar.O() == null ? "com.google.android.projection.gearhead" : moaVar.O();
        numVar.g = moaVar.P();
        numVar.x = nuo.c;
        numVar.a = moaVar.T() ? nup.HIGH : nup.LOW;
        numVar.m = string;
        numVar.n = str;
        numVar.w = moaVar.E();
        numVar.k = zContains;
        if (moaVar.J() == yzrVar) {
            numVar.h = moaVar.v();
            numVar.l = true;
        }
        return numVar.b();
    }

    @Override // defpackage.qkj
    public final void b(Bundle bundle) {
        moa moaVar = this.g;
        ((ype) a.l().ai((char) 7483)).M("handleNotificationAction intent=%s si.action=%s", bundle, moaVar.G());
        yzy yzyVar = yzy.Cf;
        if (moaVar.G() != null) {
            yzyVar = yzy.Cg;
            moaVar.G().b();
        }
        ohu.a().b((rrc) rrc.h(yxy.GEARHEAD, yzz.PROJECTION_NOTIFICATION, yzyVar).l());
    }
}
