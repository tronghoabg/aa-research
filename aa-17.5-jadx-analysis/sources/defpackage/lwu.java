package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.car.app.model.Badge;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.external.model.widgets.PaneWidget;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class lwu extends kae {
    private final Intent h;
    private static final String g = "GH.SmartReplyConfirm";
    public static final yph f = yph.c(g);

    public lwu(qn qnVar, Intent intent) {
        super(qnVar, (rrc) rrc.h(yxy.GEARHEAD, yzz.MESSAGING_APP, yzy.kP).l());
        this.h = intent;
    }

    @Override // defpackage.qw
    public final wb h() {
        Badge badgeA;
        Object next;
        Object next2;
        Bitmap bitmap;
        String strF;
        Intent intent = this.h;
        final String stringExtra = intent.getStringExtra("EXTRA_SBN_KEY");
        if (stringExtra == null) {
            throw new IllegalArgumentException("SBN_KEY");
        }
        String stringExtra2 = intent.getStringExtra("EXTRA_CONVERSATION_TITLE");
        if (stringExtra2 == null) {
            throw new IllegalArgumentException("CONVERSATION_TITLE");
        }
        final String stringExtra3 = intent.getStringExtra("EXTRA_REPLY_TEXT");
        if (stringExtra3 == null) {
            throw new IllegalArgumentException("REPLY_TEXT");
        }
        f.l().u("onGetTemplate");
        int i = 1;
        List listB = mlq.e().b(yzr.IM_NOTIFICATION);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (obj instanceof lue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            badgeA = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (affa.f(((lue) next).s, stringExtra)) {
                break;
            }
        }
        final lue lueVar = (lue) next;
        yfq yfqVarB = lnm.m().b();
        yfqVarB.getClass();
        Iterator<E> it2 = yfqVarB.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (affa.f(((lvg) next2).k, stringExtra)) {
                break;
            }
        }
        final lvg lvgVar = (lvg) next2;
        sw swVar = new sw();
        qn qnVar = this.a;
        swVar.b = CarText.create(qnVar.getString(R.string.smart_reply_send));
        swVar.d(new us() { // from class: lwt
            @Override // defpackage.us
            public final void onClick() {
                lwu.f.l().u("Send clicked");
                lwg.a().c(stringExtra, stringExtra3);
                lue lueVar2 = lueVar;
                if (lueVar2 != null) {
                    lnm.k().e(lueVar2);
                }
                lvg lvgVar2 = lvgVar;
                if (lvgVar2 != null) {
                    lnm.j().f(lvgVar2);
                }
                obs.a().f(this.a, mkn.n, R.string.smart_reply_sent_text, 0);
                nqd.a.a().h();
            }
        });
        sw swVar2 = new sw();
        swVar2.b = CarText.create(qnVar.getString(R.string.smart_reply_cancel));
        swVar2.d(new mew(i));
        List listBi = woy.bi(swVar.a(), swVar2.a());
        if (lueVar == null || (bitmap = lueVar.n) == null) {
            bitmap = lvgVar != null ? lvgVar.i : null;
        }
        CarIcon carIcon = bitmap != null ? new CarIcon(new tj(IconCompat.k(bitmap))) : null;
        if (lueVar == null || (strF = lueVar.l) == null) {
            strF = lvgVar != null ? lvgVar.f() : null;
        }
        if (strF != null) {
            CarIcon carIconI = GhIcon.j(new ComponentName(strF, "")).i(qnVar, -1);
            carIconI.getClass();
            te teVar = new te();
            teVar.c = carIconI;
            badgeA = teVar.a();
        }
        return new PaneWidget(carIcon, CarText.create(stringExtra2), null, CarText.create(stringExtra3), listBi, badgeA, 4, null);
    }
}
