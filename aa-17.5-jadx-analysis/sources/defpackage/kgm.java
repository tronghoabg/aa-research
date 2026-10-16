package defpackage;

import androidx.car.app.model.Action;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class kgm extends kae {
    private static final rrc f = (rrc) rrc.h(yxy.GEARHEAD, yzz.CALENDAR_APP, yzy.tb).l();
    private boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public kgm(qn qnVar) {
        rrc rrcVar = f;
        rrcVar.getClass();
        super(qnVar, rrcVar);
        kgs.a.a().a().fE(this, new ewg(new kaa(this, 8), 12));
    }

    @Override // defpackage.qw
    public final wb h() {
        uj ujVar = new uj();
        List list = (List) kgs.a.a().a().e();
        qn qnVar = this.a;
        String string = qnVar.getString(R.string.all_day_events_title);
        string.getClass();
        if (list == null) {
            ujVar.a = true;
        } else {
            if (!this.g) {
                this.g = true;
                kgq.b();
                kgq.a(list, false, yzz.CALENDAR_ALL_DAY_EVENTS_VIEW);
            }
            if (list.isEmpty()) {
                qnVar.getClass();
                return juc.d(qnVar, string);
            }
            ug ugVar = new ug();
            qnVar.getClass();
            juc.e(ugVar, list, qnVar, yzz.CALENDAR_ALL_DAY_EVENTS_VIEW);
            ujVar.f(ugVar.a());
        }
        ujVar.e(Action.BACK);
        ujVar.g(string);
        return ujVar.a();
    }
}
