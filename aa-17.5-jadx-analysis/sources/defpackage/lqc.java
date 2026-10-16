package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.time.Duration;

/* loaded from: classes.dex */
public final /* synthetic */ class lqc implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ lqc(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((lod) obj).e;
            case 1:
                yph yphVar = lqu.a;
                return roc.az((lol) obj);
            case 2:
                return Boolean.valueOf(((lqs) obj).a());
            case 3:
                AaPlaybackState aaPlaybackState = ((lqs) obj).a.b;
                yph yphVar2 = lqu.a;
                boolean z = false;
                if (aaPlaybackState != null && aaPlaybackState.Q() == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return (lnr) lom.b((loj) obj, lnr.class);
            case 5:
                return (lnr) lom.b((loj) obj, lnr.class);
            case 6:
                return ((lnr) obj).c();
            case 7:
                return roc.az((lol) obj);
            case 8:
                return ((lod) obj).f;
            case 9:
                return ((loz) obj).a;
            case 10:
                loz lozVar = (loz) obj;
                if (lozVar.b) {
                    return lozVar.a;
                }
                return null;
            case 11:
                yph yphVar3 = lrq.a;
                return (lpt) yrm.au((yfq) obj);
            case 12:
                yph yphVar4 = lrq.a;
                return roc.az((lol) obj);
            case 13:
                yph yphVar5 = lrq.a;
                return tby.v(loy.j().f((ComponentName) obj), new lqc(12));
            case 14:
                lod lodVar = (lod) obj;
                yph yphVar6 = lrq.a;
                afco afcoVar = tby.a;
                return tby.e(new eqm(lodVar), lodVar.e, lodVar.f, new kuv(10));
            case 15:
                Duration duration = lrt.a;
                return loy.j().f((ComponentName) obj);
            case 16:
                Duration duration2 = lrt.a;
                return roc.az((lol) obj);
            case 17:
                lod lodVar2 = (lod) obj;
                eqj eqjVar = lodVar2.e;
                Duration duration3 = lrt.a;
                return tby.w(eqjVar, new lpx(lodVar2, 6));
            case 18:
                yph yphVar7 = lsc.a;
                return (lnr) lom.b((loj) obj, lnr.class);
            case 19:
                return ((lnr) obj).c();
            default:
                return lsc.b((ComponentName) obj);
        }
    }
}
