package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.system.dashboard.design.DashboardCardView;
import com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment;

/* loaded from: classes.dex */
public final /* synthetic */ class mvg implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mvg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v67, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v69, types: [java.lang.Object, lpt] */
    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.b) {
            case 0:
                yph yphVar = mvk.a;
                oqc.b((Context) this.a);
                return afak.a;
            case 1:
                yph yphVar2 = mvk.a;
                oqc.b((Context) this.a);
                return afak.a;
            case 2:
                ((mwa) this.a).f.invoke();
                return afak.a;
            case 3:
                ((DashboardCardView) this.a).a();
                return afak.a;
            case 4:
                yph yphVar3 = myi.a;
                ?? r6 = this.a;
                if (r6 != 0) {
                    r6.invoke();
                }
                return afak.a;
            case 5:
                yph yphVar4 = myi.a;
                ((ltg) this.a).c.invoke();
                return afak.a;
            case 6:
                yph yphVar5 = myi.a;
                ((ltg) this.a).c.invoke();
                return afak.a;
            case 7:
                yph yphVar6 = myv.a;
                return Boolean.valueOf(woy.di(new Integer[]{6, 3}).contains(Integer.valueOf(((AaPlaybackState) this.a.a()).Q())));
            case 8:
                yph yphVar7 = myv.a;
                return Boolean.valueOf(lmi.a.a().c() && Math.abs(((bbt) this.a).c()) > 0.005f);
            case 9:
                return myv.h(this.a);
            case 10:
                return new kfm(mzm.class, new mvg(this.a, 11));
            case 11:
                MediaPlayerFragment mediaPlayerFragment = (MediaPlayerFragment) this.a;
                eqj eqjVarA = mediaPlayerFragment.b().a();
                eqj eqjVarB = mediaPlayerFragment.b().b();
                mzw mzwVarQ = mjv.q();
                return new mzm(eqjVarA, eqjVarB, mzwVarQ, lto.e(yzz.DASHBOARD, null, null, mzwVarQ, 6));
            case 12:
                mzn mznVar = (mzn) this.a;
                return tby.a(mznVar.b, mznVar.a);
            case 13:
                mzn mznVar2 = (mzn) this.a;
                return tby.y(tby.p(mznVar2.a()), (eqj) mznVar2.c.a());
            case 14:
                mzs mzsVar = (mzs) this.a;
                return new mzo(mzsVar.a().a(), mzsVar.a().b());
            case 15:
                return new kfm(mzo.class, new mvg(this.a, 14));
            case 16:
                return new kfm(mzt.class, new mvg(this.a, 17));
            case 17:
                mzu mzuVar = (mzu) this.a;
                return new mzt(mzuVar.a().a(), mzuVar.a().b());
            case 18:
                this.a.invoke();
                return afak.a;
            case 19:
                return GhIcon.j(this.a.a());
            default:
                mwc.a(yzy.Hl, null);
                ((naq) this.a).f();
                return afak.a;
        }
    }
}
