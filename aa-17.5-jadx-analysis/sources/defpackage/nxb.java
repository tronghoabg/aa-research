package defpackage;

import android.app.PendingIntent;
import android.support.v4.app.Fragment;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class nxb implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nxb(agg aggVar, int i) {
        this.b = i;
        this.a = aggVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v23, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v88, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v90, types: [afdr, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = 1;
        switch (this.b) {
            case 0:
                yph yphVar = nxm.a;
                ebf.j().q(yzz.NOTIFICATION_CENTER, yzy.lz, this.a.size());
                return afak.a;
            case 1:
                nwr nwrVar = (nwr) this.a;
                int i2 = nwrVar.u;
                if (i2 == 0) {
                    throw null;
                }
                mcd.J(nwrVar, lxw.u(i2, 1));
                return afak.a;
            case 2:
                ?? r3 = this.a;
                nxm.a.l().u("Show notifications");
                r3.b(true);
                return afak.a;
            case 3:
                yph yphVar2 = nxm.a;
                return Boolean.valueOf(((axr) this.a).g());
            case 4:
                yph yphVar3 = nxm.a;
                return Boolean.valueOf(((axr) this.a).h());
            case 5:
                mcd.H(((nul) this.a).c);
                ebf.j().f(rrc.h(yxy.GEARHEAD, yzz.NOTIFICATION_CENTER, yzy.lw));
                return afak.a;
            case 6:
                this.a.invoke();
                return afak.a;
            case 7:
                mcd.H(((nur) this.a).c);
                ebf.j().f(rrc.h(yxy.GEARHEAD, yzz.NOTIFICATION_CENTER, yzy.lv));
                return afak.a;
            case 8:
                return Integer.valueOf(((Fragment) this.a).requireContext().getResources().getDimensionPixelSize(R.dimen.count_indicator_view_single_digit_width));
            case 9:
                return Integer.valueOf(((Fragment) this.a).requireContext().getResources().getDimensionPixelSize(R.dimen.count_indicator_view_double_digit_width));
            case 10:
                return Integer.valueOf(((Fragment) this.a).requireContext().getResources().getDimensionPixelSize(R.dimen.count_indicator_view_height));
            case 11:
                return Integer.valueOf(((Fragment) this.a).requireContext().getResources().getDimensionPixelSize(R.dimen.status_bar_small_notification_badge_size));
            case 12:
                nkd nkdVar = (nkd) ((RailStatusBarFragment) this.a).m.a();
                if (!nkdVar.b && (!nkdVar.c || !nkdVar.d)) {
                    i = 2;
                }
                return Integer.valueOf(i);
            case 13:
                return ((agg) this.a).g();
            case 14:
                return ((agg) this.a).g();
            case 15:
                return ((agg) this.a).g();
            case 16:
                return Integer.valueOf((int) (((qij) this.a).e(R.dimen.m3_ripple_pressed_alpha) * 255.0f));
            case 17:
                return Integer.valueOf((int) (((qij) this.a).e(R.dimen.m3_ripple_hovered_alpha) * 255.0f));
            case 18:
                return Integer.valueOf((int) (((qij) this.a).e(R.dimen.m3_ripple_default_alpha) * 255.0f));
            case 19:
                this.a.b(Boolean.valueOf(true));
                return afak.a;
            default:
                this.a.invoke();
                return afak.a;
        }
    }

    public /* synthetic */ nxb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
