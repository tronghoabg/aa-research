package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mmh extends fz {
    private static final gf e = new mmf();
    private final ajmd f;

    public mmh(ajmd ajmdVar) {
        super(e);
        this.f = ajmdVar;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        return new mmg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.material3_list_item_troubleshooter, viewGroup, false), this.f);
    }

    @Override // defpackage.lt
    public final /* synthetic */ void n(mo moVar, int i) {
        mmg mmgVar = (mmg) moVar;
        mmgVar.s = (ojn) b(i);
        xxh xxhVarA = mmgVar.s.a();
        mmgVar.t.setText(mmgVar.s.b());
        mmgVar.u.setText(mmgVar.s.c());
        ojn ojnVar = mmgVar.s;
        ohs ohsVarJ = ebf.j();
        rqz rqzVarH = rra.h();
        rqzVarH.c = ojnVar.c;
        rqzVarH.d = 4;
        ohsVarJ.F(rqzVarH.l());
        if (xxhVarA.f()) {
            mmgVar.v.setText(((ojm) xxhVarA.b()).a());
        } else if (mmgVar.s.f() == 5) {
            mmgVar.v.setText(R.string.settings_troubleshooter_send_feedback);
        }
    }
}
