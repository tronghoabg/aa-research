package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class mzd implements afec {
    private final /* synthetic */ int a;

    public mzd(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        ljx ljxVar;
        switch (this.a) {
            case 0:
                mzf.a.l().y("cardState: %s", (mzb) obj);
                return obj;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mzf.a.l().y("isMediaSuggestionAvailable: %s", bool);
                return obj;
            case 2:
                aezu aezuVar = (aezu) obj;
                Duration duration = mzm.a;
                aezuVar.getClass();
                return (abzy) aezuVar.b;
            case 3:
                GhIcon ghIcon = (GhIcon) obj;
                Duration duration2 = mzm.a;
                return Boolean.valueOf(ghIcon == null);
            case 4:
                ComponentName componentName = (ComponentName) obj;
                componentName.getClass();
                Context context = mki.a.c;
                context.getClass();
                return new mon(context, componentName);
            case 5:
                mon monVar = (mon) obj;
                if (monVar != null) {
                    return monVar.b();
                }
                return null;
            case 6:
                mon monVar2 = (mon) obj;
                if (monVar2 != null) {
                    return monVar2.c();
                }
                return null;
            case 7:
                ComponentName componentName2 = (ComponentName) obj;
                componentName2.getClass();
                Context context2 = mki.a.c;
                context2.getClass();
                return new mon(context2, componentName2).b();
            case 8:
                AaPlaybackState aaPlaybackState = (AaPlaybackState) obj;
                aaPlaybackState.getClass();
                if (aaPlaybackState.Q() != 1 && aaPlaybackState.Q() != 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                Icon icon = (Icon) obj;
                if (icon != null) {
                    return GhIcon.o(dtj.d(icon));
                }
                return null;
            case 10:
                aezu aezuVar2 = (aezu) obj;
                aezuVar2.getClass();
                return (Bitmap) aezuVar2.a;
            case 11:
                ltp ltpVar = (ltp) obj;
                ltpVar.getClass();
                return (mzv) ltpVar;
            case 12:
                mzv mzvVar = (mzv) obj;
                mzvVar.getClass();
                return mzvVar.i();
            case 13:
                mzv mzvVar2 = (mzv) obj;
                mzvVar2.getClass();
                return mzvVar2.h();
            case 14:
                aezu aezuVar3 = (aezu) obj;
                aezuVar3.getClass();
                Bitmap bitmap = (Bitmap) aezuVar3.a;
                gjo gjoVar = (gjo) aezuVar3.b;
                if (bitmap != null) {
                    return dtx.p((1 & 1) != 0 ? afcp.a : null, (1 & 2) != 0 ? 5000L : 0L, new dxb(bitmap, gjoVar, (afck) null, 4));
                }
                afco afcoVar = tby.a;
                return new eqm(null);
            case 15:
                ComponentName componentName3 = (ComponentName) obj;
                componentName3.getClass();
                return GhIcon.j(componentName3);
            case 16:
                ljx ljxVar2 = (ljx) obj;
                if (ljxVar2 == null) {
                    afco afcoVar2 = tby.a;
                    return new eqm(null);
                }
                int i = ljxVar2.f;
                if (i != 0) {
                    GhIcon ghIconR = GhIcon.r(ljxVar2.b, i);
                    afco afcoVar3 = tby.a;
                    return new eqm(ghIconR);
                }
                if (!lmi.a.a().d()) {
                    afco afcoVar4 = tby.a;
                    return new eqm(null);
                }
                loo looVarA = loo.a.a();
                String str = ljxVar2.b;
                str.getClass();
                return tby.v(tby.v(looVarA.c, new llf(str, 11)), new mzd(9));
            case 17:
                eqj eqjVarF = loy.j().f((ComponentName) obj);
                eqjVarF.getClass();
                return eqjVarF;
            case 18:
                lol lolVar = (lol) obj;
                lolVar.getClass();
                lod lodVar = lolVar instanceof lod ? (lod) lolVar : null;
                if (lodVar == null || (ljxVar = lodVar.c) == null) {
                    return null;
                }
                return Integer.valueOf(ljxVar.h);
            case 19:
                Integer num = (Integer) obj;
                num.getClass();
                return new abzy(num.intValue());
            default:
                abzy abzyVar = (abzy) obj;
                abzyVar.getClass();
                return Integer.valueOf(abzyVar.e.a(25));
        }
    }
}
