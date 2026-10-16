package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.EditText;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gearhead.appdecor.CarUiEntry;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.search.SearchBar;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.input.RotaryKeyboardLayout;
import j$.time.Instant;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class ykd {
    public final /* synthetic */ Object a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ykd(upy upyVar) {
        this((char[]) null);
        this.a = upyVar;
    }

    public static /* synthetic */ void r(ykd ykdVar, whn whnVar) {
        whl whlVar = (whl) ykdVar.a;
        if (whlVar.c.c(whnVar.a) != null) {
            whlVar.d.a();
        }
    }

    public final void A(ouo ouoVar) {
        D(ouoVar, C());
    }

    public final void B(ouo ouoVar) {
        abnp abnpVarC = C();
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = "AudioSourceService";
        abnpVarN.t();
        oup oupVar2 = (oup) abnpVarN.b;
        oupVar2.e = ouoVar.al;
        oupVar2.b |= 4;
        abnpVarN.t();
        oup oupVar3 = (oup) abnpVarN.b;
        oum oumVar = (oum) abnpVarC.q();
        oumVar.getClass();
        oupVar3.g = oumVar;
        oupVar3.b |= 16;
        ((qpo) this.a).l.o(abnpVarN);
    }

    public final abnp C() {
        int iA;
        abnp abnpVarN = oum.a.n();
        qpo qpoVar = (qpo) this.a;
        boolean z = qpoVar.f;
        abnpVarN.t();
        oum oumVar = (oum) abnpVarN.b;
        oumVar.b |= 1;
        oumVar.c = z;
        qpj qpjVar = qpoVar.e;
        boolean z2 = qpjVar != null && ((qpl) qpjVar).d;
        abnpVarN.t();
        oum oumVar2 = (oum) abnpVarN.b;
        oumVar2.b |= 2;
        oumVar2.d = z2;
        qpj qpjVar2 = qpoVar.e;
        boolean z3 = qpjVar2 != null && ((qpl) qpjVar2).c;
        abnpVarN.t();
        oum oumVar3 = (oum) abnpVarN.b;
        oumVar3.b |= 4;
        oumVar3.e = z3;
        boolean z4 = qpoVar.i;
        abnpVarN.t();
        oum oumVar4 = (oum) abnpVarN.b;
        oumVar4.b |= 8;
        oumVar4.f = z4;
        int i = qpoVar.j.get();
        if (i != 0) {
            oul oulVarU = roc.U(i);
            abnpVarN.t();
            oum oumVar5 = (oum) abnpVarN.b;
            oumVar5.g = oulVarU.f;
            oumVar5.b |= 16;
        }
        qpj qpjVar3 = qpoVar.e;
        rek rekVar = qpjVar3 == null ? null : ((qpl) qpjVar3).e;
        if (rekVar != null) {
            int iA2 = rekVar.a();
            ypf ypfVar = qqv.a;
            ouh ouhVarM = roc.M(iA2);
            abnpVarN.t();
            oum oumVar6 = (oum) abnpVarN.b;
            oumVar6.h = ouhVarM.f;
            oumVar6.b |= 32;
        }
        rek rekVar2 = (rek) qpoVar.k.get();
        if (rekVar2 != null) {
            int iA3 = rekVar2.a();
            ypf ypfVar2 = qqv.a;
            ouh ouhVarM2 = roc.M(iA3);
            abnpVarN.t();
            oum oumVar7 = (oum) abnpVarN.b;
            oumVar7.i = ouhVarM2.f;
            oumVar7.b |= 64;
        }
        qpj qpjVar4 = qpoVar.e;
        if (qpjVar4 != null && (iA = ((qpl) qpjVar4).a.a()) > 0) {
            abnpVarN.t();
            oum oumVar8 = (oum) abnpVarN.b;
            oumVar8.b |= 1024;
            oumVar8.m = iA;
        }
        return abnpVarN;
    }

    public final void D(ouo ouoVar, abnp abnpVar) {
        abnp abnpVarN = oup.a.n();
        abnpVarN.t();
        oup oupVar = (oup) abnpVarN.b;
        oupVar.b |= 1;
        oupVar.c = "AudioSourceService";
        abnpVarN.t();
        oup oupVar2 = (oup) abnpVarN.b;
        oupVar2.e = ouoVar.al;
        oupVar2.b |= 4;
        abnpVarN.t();
        oup oupVar3 = (oup) abnpVarN.b;
        oum oumVar = (oum) abnpVar.q();
        oumVar.getClass();
        oupVar3.g = oumVar;
        oupVar3.b |= 16;
        ((qpo) this.a).l.n(abnpVarN);
    }

    public final void E() {
        ((qmq) this.a).B();
    }

    public final void F(int i) {
        ((CarUiEntry) this.a).applySystemUiVisibility(i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xwx] */
    public final Object a(Object obj) {
        return this.a.a(obj);
    }

    public final void b() {
        ((RotaryKeyboardLayout) this.a).g(0, true);
    }

    public final void c(boolean z) {
        ((xdm) this.a).g(z);
    }

    public final void d() {
        xda xdaVar = (xda) tec.a((Fragment) this.a, xda.class);
        xdaVar.getClass();
        xdaVar.f();
    }

    public final void e(String str) {
        Context context = ((seg) this.a).d.c;
        Bundle bundle = new Bundle();
        try {
            PackageManager packageManager = context.getPackageManager();
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0));
            bundle.putString("errorTitle", context.getString(R.string.frx_fsm_install_failed_title_with_app_name, applicationLabel));
            bundle.putString("errorMessage", context.getString(R.string.frx_fsm_install_failed_message_with_app_name, applicationLabel));
        } catch (PackageManager.NameNotFoundException unused) {
            bundle.putString("errorTitle", context.getString(R.string.frx_fsm_install_failed_title));
            bundle.putString("errorMessage", context.getString(R.string.frx_fsm_install_failed_message));
        }
        ((seg) this.a).d.f("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED", bundle);
    }

    public final void f(TextInputLayout textInputLayout) {
        wxa wxaVar = (wxa) this.a;
        EditText editText = wxaVar.j;
        if (editText == textInputLayout.c) {
            return;
        }
        if (editText != null) {
            editText.removeTextChangedListener(wxaVar.k);
            if (wxaVar.j.getOnFocusChangeListener() == wxaVar.c().d()) {
                wxaVar.j.setOnFocusChangeListener(null);
            }
        }
        wxaVar.j = textInputLayout.c;
        EditText editText2 = wxaVar.j;
        if (editText2 != null) {
            editText2.addTextChangedListener(wxaVar.k);
        }
        wxaVar.c().g(wxaVar.j);
        wxaVar.o(wxaVar.c());
    }

    public final void g(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((BaseTransientBottomBar) this.a).d(0);
    }

    public final void h(Drawable drawable) {
        if (drawable != null) {
            super/*wqx*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean i() {
        return ((FloatingActionButton) this.a).b;
    }

    public final void j(float f) {
        SearchBar searchBar = (SearchBar) this.a;
        ColorStateList colorStateList = searchBar.G;
        if (colorStateList != null) {
            searchBar.J.O(ColorStateList.valueOf(woy.o(searchBar.F, colorStateList.getDefaultColor(), f)));
        }
    }

    public final void k() {
        whl.b();
        long epochMilli = Instant.now().toEpochMilli();
        whl whlVar = (whl) this.a;
        whlVar.j = epochMilli;
        ajmd ajmdVar = whlVar.l;
        if (ajmdVar != null) {
            ajmdVar.y(whlVar.d.a());
        }
        String strB = whlVar.d.b();
        if (strB != null) {
            whlVar.c.b(strB);
        }
    }

    public final void l(whn whnVar) {
        who whoVar = whnVar.b;
        who whoVar2 = who.a;
        if (!whoVar.equals(whoVar2)) {
            whl.b();
        }
        Object obj = this.a;
        String str = whnVar.a;
        whl whlVar = (whl) obj;
        whm whmVar = whlVar.c;
        ajmd ajmdVarC = whmVar.c(str);
        SurveyDataImpl surveyDataImplA = whmVar.a(str);
        if (whoVar != whoVar2) {
            whlVar.j = Instant.now().toEpochMilli();
        }
        if (ajmdVarC != null && surveyDataImplA != null) {
            ajmdVarC.y(surveyDataImplA.a());
        }
        whmVar.b(str);
    }

    public final void m() {
        whl.c();
        whl whlVar = (whl) this.a;
        if (whlVar.l != null) {
            ajmd.A(whlVar.d.a());
        }
    }

    public final void n(whn whnVar) {
        if (!whnVar.b.equals(who.a)) {
            whl.c();
        }
        Object obj = this.a;
        String str = whnVar.a;
        whm whmVar = ((whl) obj).c;
        ajmd ajmdVarC = whmVar.c(str);
        SurveyDataImpl surveyDataImplA = whmVar.a(str);
        if (ajmdVarC == null || surveyDataImplA == null) {
            return;
        }
        ajmd.A(surveyDataImplA.a());
    }

    public final void o(whn whnVar) {
        whl whlVar = (whl) this.a;
        if (whlVar.c.c(whnVar.a) != null) {
            whlVar.d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezk, java.lang.Object] */
    public final String p() {
        return ((plq) this.a.a()).c();
    }

    public final void q() {
        ((umn) this.a).x.k();
    }

    public final void s(int i) {
        ((umn) this.a).d(i != 0);
    }

    public final void t(Runnable runnable) {
        boolean z;
        twq twqVarJ = ((tyb) this.a).j();
        synchronized (twqVarJ) {
            z = twqVarJ.c;
            if (!z) {
                twqVarJ.d.add(runnable);
            }
        }
        if (z) {
            runnable.run();
        }
    }

    public final boolean u() {
        return ((uga) this.a).o().a;
    }

    public final void v(sqk sqkVar) {
        sqg sqgVar = (sqg) this.a;
        sqgVar.a = sqkVar;
        Iterator it = sqgVar.c.iterator();
        while (it.hasNext()) {
            ((sqf) it.next()).b();
        }
        sqgVar.c.clear();
        sqgVar.b = null;
    }

    public final void w() {
        int i = scr.c;
        ((seg) this.a).d.f("EVENT_CAR_DISCONNECTED", null);
    }

    public final void x(rgv rgvVar) {
        if (rgvVar == null) {
            qrg.a.g().ai(7674).u("Cannot get BluetoothProfileUtil");
            return;
        }
        qrg qrgVar = (qrg) this.a;
        qrgVar.h = rgvVar;
        rgs rgsVar = qrgVar.e;
        rgsVar.h = qrgVar.h;
        rgsVar.c(rgo.EVENT_BLUETOOTH_PROFILE_UTIL_READY);
    }

    public final void y(ots otsVar) {
        yzy yzyVar;
        yzy yzyVar2;
        Object obj = this.a;
        qqv qqvVar = (qqv) obj;
        qqvVar.i.b(roc.Q(otsVar));
        qsb qsbVar = qqvVar.l;
        Object obj2 = qsbVar.c;
        otw otwVar = otsVar.c;
        if (otwVar == null) {
            otwVar = otw.a;
        }
        ouh ouhVarB = ouh.b(otwVar.e);
        if (ouhVarB == null) {
            ouhVarB = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        yzz yzzVarN = roc.N(ouhVarB);
        for (oup oupVar : otsVar.g) {
            ouo ouoVarB = ouo.b(oupVar.e);
            if (ouoVarB == null) {
                ouoVarB = ouo.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
            }
            switch (ouoVarB.ordinal()) {
                case 0:
                    yzyVar2 = yzy.vZ;
                    break;
                case 1:
                    yzyVar2 = yzy.wa;
                    break;
                case 2:
                    yzyVar2 = yzy.wb;
                    break;
                case 3:
                    yzyVar2 = yzy.wc;
                    break;
                case 4:
                    yzyVar2 = yzy.wd;
                    break;
                case 5:
                    yzyVar2 = yzy.we;
                    break;
                case 6:
                    yzyVar2 = yzy.wf;
                    break;
                case 7:
                    yzyVar2 = yzy.wg;
                    break;
                case 8:
                    yzyVar2 = yzy.wh;
                    break;
                case 9:
                    yzyVar2 = yzy.wi;
                    break;
                case 10:
                    yzyVar2 = yzy.wj;
                    break;
                case 11:
                    yzyVar2 = yzy.wk;
                    break;
                case 12:
                    yzyVar2 = yzy.wl;
                    break;
                case 13:
                    yzyVar2 = yzy.wm;
                    break;
                case 14:
                    yzyVar2 = yzy.wn;
                    break;
                case 15:
                    yzyVar2 = yzy.wo;
                    break;
                case 16:
                    yzyVar2 = yzy.wp;
                    break;
                case 17:
                    yzyVar2 = yzy.wq;
                    break;
                case 18:
                    yzyVar2 = yzy.wr;
                    break;
                case 19:
                    yzyVar2 = yzy.ws;
                    break;
                case 20:
                    yzyVar2 = yzy.wt;
                    break;
                case 21:
                    yzyVar2 = yzy.wu;
                    break;
                case 22:
                    yzyVar2 = yzy.wv;
                    break;
                case 23:
                    yzyVar2 = yzy.wH;
                    break;
                case 24:
                    yzyVar2 = yzy.wI;
                    break;
                case 25:
                    yzyVar2 = yzy.wK;
                    break;
                case 26:
                    yzyVar2 = yzy.wL;
                    break;
                case 27:
                    yzyVar2 = yzy.wM;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    yzyVar2 = yzy.wN;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    yzyVar2 = yzy.wO;
                    break;
                case 30:
                    yzyVar2 = yzy.wQ;
                    break;
                case 31:
                    yzyVar2 = yzy.wJ;
                    break;
                case 32:
                    yzyVar2 = yzy.wE;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    yzyVar2 = yzy.wz;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    yzyVar2 = yzy.wR;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    yzyVar2 = yzy.wS;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    yzyVar2 = yzy.wT;
                    break;
                case 37:
                    yzyVar2 = yzy.xy;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    yzyVar2 = yzy.wW;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    yzyVar2 = yzy.wX;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    yzyVar2 = yzy.wY;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    yzyVar2 = yzy.wZ;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    yzyVar2 = yzy.xa;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    yzyVar2 = yzy.xb;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    yzyVar2 = yzy.xc;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    yzyVar2 = yzy.xd;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    yzyVar2 = yzy.xe;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    yzyVar2 = yzy.xf;
                    break;
                case 48:
                    yzyVar2 = yzy.xg;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    yzyVar2 = yzy.xh;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    yzyVar2 = yzy.xi;
                    break;
                case 51:
                    yzyVar2 = yzy.xj;
                    break;
                case 52:
                    yzyVar2 = yzy.xk;
                    break;
                case 53:
                    yzyVar2 = yzy.xl;
                    break;
                case 54:
                    yzyVar2 = yzy.xm;
                    break;
                case 55:
                    yzyVar2 = yzy.xn;
                    break;
                case 56:
                    yzyVar2 = yzy.xo;
                    break;
                case 57:
                    yzyVar2 = yzy.xp;
                    break;
                case 58:
                    yzyVar2 = yzy.xq;
                    break;
                case 59:
                    yzyVar2 = yzy.xr;
                    break;
                case 60:
                    yzyVar2 = yzy.xs;
                    break;
                case 61:
                    yzyVar2 = yzy.xt;
                    break;
                case 62:
                    yzyVar2 = yzy.xu;
                    break;
                default:
                    throw new RuntimeException(null, null);
            }
            qsbVar.f(yzzVarN, yzyVar2, 1);
            if ((oupVar.b & 16) != 0) {
                oum oumVar = oupVar.g;
                if (oumVar == null) {
                    oumVar = oum.a;
                }
                otw otwVar2 = otsVar.c;
                if (otwVar2 == null) {
                    otwVar2 = otw.a;
                }
                ouh ouhVarB2 = ouh.b(otwVar2.e);
                if (ouhVarB2 == null) {
                    ouhVarB2 = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
                }
                ouo ouoVarB2 = ouo.b(oupVar.e);
                if (ouoVarB2 == null) {
                    ouoVarB2 = ouo.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
                }
                int iOrdinal = ouoVarB2.ordinal();
                if (iOrdinal == 29 || iOrdinal == 36) {
                    if ((oumVar.b & 64) != 0) {
                        ouh ouhVarB3 = ouh.b(oumVar.i);
                        if (ouhVarB3 == null) {
                            ouhVarB3 = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
                        }
                        if (ouhVarB2 != ouhVarB3) {
                            qsbVar.f(yzzVarN, yzy.wP, 1);
                        }
                    }
                } else if (iOrdinal == 42 && (oumVar.b & 2) != 0 && !oumVar.d) {
                    qsbVar.f(yzzVarN, yzy.xv, 1);
                }
            }
            if ((oupVar.b & 32) != 0) {
                ouk oukVar = oupVar.h;
                if (oukVar == null) {
                    oukVar = ouk.a;
                }
                ouo ouoVarB3 = ouo.b(oupVar.e);
                if (ouoVarB3 == null) {
                    ouoVarB3 = ouo.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
                }
                if (ouoVarB3 == ouo.AUDIO_BOTTOM_HALF_STREAMING_STARTED && (oukVar.b & 8) != 0 && oukVar.f) {
                    qsbVar.f(yzzVarN, yzy.xw, 1);
                }
            }
        }
        qsbVar.f(yzzVarN, yzy.vL, otsVar.h);
        otr otrVarB = otr.b(otsVar.e);
        if (otrVarB == null) {
            otrVarB = otr.AUDIO_STREAMING_STATUS_UNSPECIFIED;
        }
        if (otrVarB != otr.STREAMING) {
            ott ottVar = otsVar.f;
            if (ottVar == null) {
                ottVar = ott.a;
            }
            qsbVar.f(yzzVarN, yzy.vO, ottVar.f);
            for (ouj oujVar : ottVar.r) {
                oui ouiVarB = oui.b(oujVar.d);
                if (ouiVarB == null) {
                    ouiVarB = oui.DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED;
                }
                switch (ouiVarB.ordinal()) {
                    case 0:
                        yzyVar = yzy.vP;
                        break;
                    case 1:
                        yzyVar = yzy.vQ;
                        break;
                    case 2:
                        yzyVar = yzy.vR;
                        break;
                    case 3:
                        yzyVar = yzy.vS;
                        break;
                    case 4:
                        yzyVar = yzy.vT;
                        break;
                    case 5:
                        yzyVar = yzy.vU;
                        break;
                    case 6:
                        yzyVar = yzy.vV;
                        break;
                    case 7:
                        yzyVar = yzy.vW;
                        break;
                    case 8:
                        yzyVar = yzy.vX;
                        break;
                    case 9:
                        yzyVar = yzy.vY;
                        break;
                    default:
                        throw new RuntimeException(null, null);
                }
                qsbVar.f(yzzVarN, yzyVar, oujVar.e);
            }
            qsbVar.f(yzzVarN, yzy.vM, ottVar.g);
            qsbVar.f(yzzVarN, yzy.vN, ottVar.i);
        }
    }

    public final void z() {
        qqt qqtVar = (qqt) this.a;
        qqtVar.g();
        qqtVar.c("onExternalAppLoseAudioFocus");
    }

    public /* synthetic */ ykd(Object obj) {
        this.a = obj;
    }

    public ykd(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ykd() {
        throw null;
    }

    public ykd(char[] cArr) {
    }
}
