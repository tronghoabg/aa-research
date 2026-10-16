package defpackage;

import androidx.car.app.model.Action;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class kgl extends kae {
    public static final /* synthetic */ int f = 0;
    private static final rrc g = (rrc) rrc.h(yxy.GEARHEAD, yzz.CALENDAR_APP, yzy.sY).l();
    private boolean h;
    private final kgs i;

    /* JADX WARN: Illegal instructions before constructor call */
    public kgl(qn qnVar) {
        rrc rrcVar = g;
        rrcVar.getClass();
        super(qnVar, rrcVar);
        kgs kgsVarA = kgs.a.a();
        this.i = kgsVarA;
        eql eqlVar = new eql();
        eqlVar.r(kgsVarA.d, new ewg(new kaa(eqlVar, 5), 11));
        eqlVar.r(kgsVarA.b(), new ewg(new kaa(eqlVar, 6), 11));
        eqlVar.r(kgsVarA.a(), new ewg(new kaa(eqlVar, 7), 11));
        eqlVar.fE(this, new hlg(this, 16));
    }

    private final void a(List list, boolean z) {
        if (this.h) {
            return;
        }
        this.h = true;
        kgq.b();
        kgq.a(list, z, yzz.CALENDAR_AGENDA_VIEW);
    }

    @Override // defpackage.qw
    public final wb h() {
        uj ujVar = new uj();
        kgs kgsVar = this.i;
        List list = (List) kgsVar.a().e();
        List list2 = (List) kgsVar.b().e();
        String string = (String) kgsVar.d.e();
        if (string == null) {
            string = this.a.getString(R.string.calendar_app_name);
            string.getClass();
        }
        if (list2 == null || list == null) {
            ujVar.e(Action.APP_ICON);
            ujVar.g(string);
            ujVar.a = true;
            return ujVar.a();
        }
        List listBY = woy.bY(list, list2);
        if (listBY.isEmpty()) {
            a(listBY, false);
            qn qnVar = this.a;
            qnVar.getClass();
            return juc.d(qnVar, string);
        }
        ug ugVar = new ug();
        boolean z = ((long) list.size()) > acsu.b();
        if (z) {
            vf vfVar = new vf();
            String string2 = this.a.getString(R.string.agenda_all_day_browse_item_title);
            string2.getClass();
            String str = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1));
            str.getClass();
            vfVar.i(str);
            vfVar.k = true;
            vfVar.g(new gec(this, 17));
            ugVar.b(vfVar.a());
        } else {
            list2 = listBY;
        }
        qn qnVar2 = this.a;
        qnVar2.getClass();
        juc.e(ugVar, list2, qnVar2, yzz.CALENDAR_AGENDA_VIEW);
        ujVar.f(ugVar.a());
        a(list2, z);
        ujVar.e(Action.APP_ICON);
        ujVar.g(string);
        return ujVar.a();
    }
}
