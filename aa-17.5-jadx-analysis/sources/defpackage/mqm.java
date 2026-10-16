package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.support.v4.app.Fragment;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment;
import com.google.android.apps.auto.components.ui.media.PlayPauseStopCoolwalkButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.projection.gearhead.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class mqm implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mqm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v42, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v54, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v56, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v58, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v69, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v74, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                ((mqn) obj2).h = (List) obj;
                ((qw) obj2).j();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = this.a;
                ((mqn) obj3).i = zBooleanValue;
                ((qw) obj3).j();
                break;
            case 2:
                mpt.d();
                break;
            case 3:
                Intent intent = new Intent();
                intent.setComponent(mkn.t);
                break;
            case 4:
                Object obj4 = this.a;
                Boolean bool2 = (Boolean) obj;
                Fragment fragment = (Fragment) obj4;
                w wVar = new w(fragment.getParentFragmentManager());
                wVar.h(fragment, bool2.booleanValue() ? eps.e : eps.d);
                wVar.i(false, true);
                if (bool2.booleanValue()) {
                    xya xyaVar = ((msx) obj4).a;
                    xyaVar.d();
                    xyaVar.e();
                } else {
                    xya xyaVar2 = ((msx) obj4).a;
                    if (xyaVar2.a) {
                        xyaVar2.f();
                        ohs ohsVarJ = ebf.j();
                        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.DASHBOARD, yzy.HC);
                        rrbVarH.u(xyaVar2.a(TimeUnit.MILLISECONDS));
                        ohsVarJ.F(rrbVarH.l());
                    }
                }
                break;
            case 5:
                qsw qswVar = (qsw) obj;
                qswVar.getClass();
                nso nsoVar = (nso) this.a;
                qswVar.b(true != nsoVar.E() ? R.anim.dashboard_fade_in : R.anim.dashboard_slide_up);
                qswVar.c(true != nsoVar.E() ? R.anim.dashboard_fade_out : R.anim.dashboard_slide_down);
                leg legVar = leh.a;
                if (legVar.a().b()) {
                    i = R.style.Theme_Gearhead_Coolwalk_Dashboard_DayNight;
                } else {
                    legVar.a();
                    i = R.style.Theme_Gearhead_Coolwalk_Dashboard_Dark;
                }
                qswVar.n = i;
                qswVar.m = sk.AUDIO_CONTENT_BUFFER_SIZE;
                if (ldz.a.a().b() && !acxa.ai()) {
                    int i2 = (int) gjk.b.k;
                    qswVar.e = new Rect(i2, i2, i2, i2);
                }
                qswVar.l = true;
                break;
            case 6:
                cks cksVar = (cks) obj;
                cksVar.getClass();
                cksVar.o(1.0f - ((Number) this.a.a()).floatValue());
                break;
            case 7:
                if (((Integer) obj).intValue() == 0) {
                    mss mssVarA = mva.a(this.a);
                    if (!(mssVarA instanceof msn)) {
                        if (!(mssVarA instanceof msp)) {
                            if (mssVarA instanceof msm) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 8:
                List list = (List) obj;
                list.getClass();
                this.a.b(list);
                break;
            case 9:
                List list2 = (List) obj;
                yph yphVar = mvk.a;
                list2.getClass();
                this.a.b(list2);
                break;
            case 10:
                cis cisVar = (cis) obj;
                cisVar.getClass();
                this.a.b(Boolean.valueOf(cisVar.a()));
                break;
            case 11:
                cie cieVar = (cie) obj;
                yph yphVar2 = myi.a;
                cieVar.getClass();
                cieVar.k((cil) this.a);
                break;
            case 12:
                ((Float) obj).floatValue();
                yph yphVar3 = myi.a;
                break;
            case 13:
                cxd cxdVar = (cxd) obj;
                Object obj5 = this.a;
                yph yphVar4 = myi.a;
                cxdVar.getClass();
                czz.aK(cxdVar, (cjs) obj5, 0L, 0L, null, 0, 126);
                break;
            case 14:
                cis cisVar2 = (cis) obj;
                ?? r9 = this.a;
                yph yphVar5 = myv.a;
                cisVar2.getClass();
                r9.b(Boolean.valueOf(cisVar2.a()));
                break;
            case 15:
                cie cieVar2 = (cie) obj;
                yph yphVar6 = myv.a;
                cieVar2.getClass();
                cil cilVar = (cil) this.a;
                cieVar2.b(cilVar);
                cieVar2.j(cilVar);
                break;
            case 16:
                yph yphVar7 = myv.a;
                this.a.b((List) obj);
                break;
            case 17:
                yph yphVar8 = mzf.a;
                ((qrn) obj).getClass();
                break;
            case 18:
                Object obj6 = this.a;
                yph yphVar9 = mzf.a;
                gjv gjvVar = new gjv((xyi) oit.a().b);
                afco afcoVar = tby.a;
                break;
            case 19:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj7 = this.a;
                int i3 = true != zBooleanValue2 ? 2 : 1;
                int i4 = MediaPlayerFragment.b;
                ((PlayPauseStopCoolwalkButton) obj7).d = i3;
                break;
            default:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                int i5 = MediaPlayerFragment.b;
                aaPlaybackState.getClass();
                int iQ = aaPlaybackState.Q();
                Object obj8 = this.a;
                ((PlayPauseStopCoolwalkButton) obj8).c = iQ;
                ((MaterialButton) obj8).refreshDrawableState();
                break;
        }
        return afak.a;
    }
}
