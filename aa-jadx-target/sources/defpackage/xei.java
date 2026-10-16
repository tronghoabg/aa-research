package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xei {
    public final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xei(uqw uqwVar) {
        this((char[]) null);
        this.a = uqwVar;
    }

    public static /* synthetic */ void q(defpackage.xei xeiVar, wim wimVar) {
        wik wikVar = (wik) xeiVar.a;
        if (wikVar.c.c(wimVar.a) != null) {
            wikVar.d.a();
        }
    }

    public final void A(defpackage.ovl ovlVar) {
        defpackage.abor aborVarB = B();
        defpackage.abor aborVarN = defpackage.ovm.a.n();
        aborVarN.t();
        defpackage.ovm ovmVar = (defpackage.ovm) aborVarN.b;
        ovmVar.b |= 1;
        ovmVar.c = "AudioSourceService";
        aborVarN.t();
        defpackage.ovm ovmVar2 = (defpackage.ovm) aborVarN.b;
        ovmVar2.e = ovlVar.al;
        ovmVar2.b |= 4;
        aborVarN.t();
        defpackage.ovm ovmVar3 = (defpackage.ovm) aborVarN.b;
        defpackage.ovj ovjVar = (defpackage.ovj) aborVarB.q();
        ovjVar.getClass();
        ovmVar3.g = ovjVar;
        ovmVar3.b |= 16;
        ((qqk) this.a).l.o(aborVarN);
    }

    public final defpackage.abor B() {
        int iA;
        defpackage.abor aborVarN = defpackage.ovj.a.n();
        qqk qqkVar = (qqk) this.a;
        boolean z = qqkVar.f;
        aborVarN.t();
        defpackage.ovj ovjVar = (defpackage.ovj) aborVarN.b;
        ovjVar.b |= 1;
        ovjVar.c = z;
        qqh qqhVar = qqkVar.e;
        boolean z2 = qqhVar != null && qqhVar.d;
        aborVarN.t();
        defpackage.ovj ovjVar2 = (defpackage.ovj) aborVarN.b;
        ovjVar2.b |= 2;
        ovjVar2.d = z2;
        qqh qqhVar2 = qqkVar.e;
        boolean z3 = qqhVar2 != null && qqhVar2.c;
        aborVarN.t();
        defpackage.ovj ovjVar3 = (defpackage.ovj) aborVarN.b;
        ovjVar3.b |= 4;
        ovjVar3.e = z3;
        boolean z4 = qqkVar.i;
        aborVarN.t();
        defpackage.ovj ovjVar4 = (defpackage.ovj) aborVarN.b;
        ovjVar4.b |= 8;
        ovjVar4.f = z4;
        int i = qqkVar.j.get();
        if (i != 0) {
            defpackage.ovi oviVarAe = defpackage.tna.ae(i);
            aborVarN.t();
            defpackage.ovj ovjVar5 = (defpackage.ovj) aborVarN.b;
            ovjVar5.g = oviVarAe.f;
            ovjVar5.b |= 16;
        }
        qqh qqhVar3 = qqkVar.e;
        rff rffVar = qqhVar3 == null ? null : qqhVar3.e;
        if (rffVar != null) {
            int iA2 = rffVar.a();
            defpackage.yqk yqkVar = qrr.a;
            defpackage.ove oveVarW = defpackage.tna.W(iA2);
            aborVarN.t();
            defpackage.ovj ovjVar6 = (defpackage.ovj) aborVarN.b;
            ovjVar6.h = oveVarW.f;
            ovjVar6.b |= 32;
        }
        rff rffVar2 = (rff) qqkVar.k.get();
        if (rffVar2 != null) {
            int iA3 = rffVar2.a();
            defpackage.yqk yqkVar2 = qrr.a;
            defpackage.ove oveVarW2 = defpackage.tna.W(iA3);
            aborVarN.t();
            defpackage.ovj ovjVar7 = (defpackage.ovj) aborVarN.b;
            ovjVar7.i = oveVarW2.f;
            ovjVar7.b |= 64;
        }
        qqh qqhVar4 = qqkVar.e;
        if (qqhVar4 != null && (iA = qqhVar4.a.a()) > 0) {
            aborVarN.t();
            defpackage.ovj ovjVar8 = (defpackage.ovj) aborVarN.b;
            ovjVar8.b |= 1024;
            ovjVar8.m = iA;
        }
        return aborVarN;
    }

    public final void C(defpackage.ovl ovlVar, defpackage.abor aborVar) {
        defpackage.abor aborVarN = defpackage.ovm.a.n();
        aborVarN.t();
        defpackage.ovm ovmVar = (defpackage.ovm) aborVarN.b;
        ovmVar.b |= 1;
        ovmVar.c = "AudioSourceService";
        aborVarN.t();
        defpackage.ovm ovmVar2 = (defpackage.ovm) aborVarN.b;
        ovmVar2.e = ovlVar.al;
        ovmVar2.b |= 4;
        aborVarN.t();
        defpackage.ovm ovmVar3 = (defpackage.ovm) aborVarN.b;
        defpackage.ovj ovjVar = (defpackage.ovj) aborVar.q();
        ovjVar.getClass();
        ovmVar3.g = ovjVar;
        ovmVar3.b |= 16;
        ((qqk) this.a).l.n(aborVarN);
    }

    public final void D() {
        ((qnm) this.a).B();
    }

    public final void E(int i) {
        ((com.google.android.gearhead.appdecor.CarUiEntry) this.a).applySystemUiVisibility(i);
    }

    public final void a(boolean z) {
        ((xej) this.a).g(z);
    }

    public final void b() {
        xdw xdwVar = (xdw) defpackage.tez.a((android.support.v4.app.Fragment) this.a, xdw.class);
        xdwVar.getClass();
        xdwVar.f();
    }

    public final void c(java.lang.String str) {
        android.content.Context context = ((sfc) this.a).d.c;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0));
            bundle.putString("errorTitle", context.getString(2132084115, applicationLabel));
            bundle.putString("errorMessage", context.getString(2132084113, applicationLabel));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            bundle.putString("errorTitle", context.getString(2132084114));
            bundle.putString("errorMessage", context.getString(2132084112));
        }
        ((sfc) this.a).d.f("EVENT_DOWNLOAD_AND_INSTALL_APPS_FAILED", bundle);
    }

    public final void d(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        wxw wxwVar = (wxw) this.a;
        android.widget.EditText editText = wxwVar.j;
        if (editText == textInputLayout.c) {
            return;
        }
        if (editText != null) {
            editText.removeTextChangedListener(wxwVar.k);
            if (wxwVar.j.getOnFocusChangeListener() == wxwVar.c().d()) {
                wxwVar.j.setOnFocusChangeListener(null);
            }
        }
        wxwVar.j = textInputLayout.c;
        android.widget.EditText editText2 = wxwVar.j;
        if (editText2 != null) {
            editText2.addTextChangedListener(wxwVar.k);
        }
        wxwVar.c().g(wxwVar.j);
        wxwVar.o(wxwVar.c());
    }

    public final void e(android.view.View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((com.google.android.material.snackbar.BaseTransientBottomBar) this.a).d(0);
    }

    public final wuy f(wuy wuyVar) {
        return wuyVar instanceof defpackage.wvf ? wuyVar : new wuw(-((defpackage.wvd) this.a).w(), wuyVar);
    }

    public final void g(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            com.google.android.material.floatingactionbutton.FloatingActionButton.c((com.google.android.material.floatingactionbutton.FloatingActionButton) this.a, drawable);
        }
    }

    public final boolean h() {
        return ((com.google.android.material.floatingactionbutton.FloatingActionButton) this.a).b;
    }

    public final void i(float f) {
        com.google.android.material.search.SearchBar searchBar = (com.google.android.material.search.SearchBar) this.a;
        android.content.res.ColorStateList colorStateList = searchBar.G;
        if (colorStateList != null) {
            searchBar.J.O(android.content.res.ColorStateList.valueOf(defpackage.sqs.bx(searchBar.F, colorStateList.getDefaultColor(), f)));
        }
    }

    public final void j() {
        wik.b();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        wik wikVar = (wik) this.a;
        wikVar.j = epochMilli;
        ajnd ajndVar = wikVar.l;
        if (ajndVar != null) {
            ajndVar.A(wikVar.d.a());
        }
        java.lang.String strB = wikVar.d.b();
        if (strB != null) {
            wikVar.c.b(strB);
        }
    }

    public final void k(wim wimVar) {
        win winVar = wimVar.b;
        win winVar2 = win.a;
        if (!winVar.equals(winVar2)) {
            wik.b();
        }
        java.lang.Object obj = this.a;
        java.lang.String str = wimVar.a;
        wik wikVar = (wik) obj;
        wil wilVar = wikVar.c;
        ajnd ajndVarC = wilVar.c(str);
        com.google.android.libraries.surveys.internal.model.SurveyDataImpl surveyDataImplA = wilVar.a(str);
        if (winVar != winVar2) {
            wikVar.j = j$.time.Instant.now().toEpochMilli();
        }
        if (ajndVarC != null && surveyDataImplA != null) {
            ajndVarC.A(surveyDataImplA.a());
        }
        wilVar.b(str);
    }

    public final void l() {
        wik.c();
        wik wikVar = (wik) this.a;
        if (wikVar.l != null) {
            ajnd.C(wikVar.d.a());
        }
    }

    public final void m(wim wimVar) {
        if (!wimVar.b.equals(win.a)) {
            wik.c();
        }
        java.lang.Object obj = this.a;
        java.lang.String str = wimVar.a;
        wil wilVar = ((wik) obj).c;
        ajnd ajndVarC = wilVar.c(str);
        com.google.android.libraries.surveys.internal.model.SurveyDataImpl surveyDataImplA = wilVar.a(str);
        if (ajndVarC == null || surveyDataImplA == null) {
            return;
        }
        ajnd.C(surveyDataImplA.a());
    }

    public final void n(wim wimVar) {
        wik wikVar = (wik) this.a;
        if (wikVar.c.c(wimVar.a) != null) {
            wikVar.d.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afak, java.lang.Object] */
    public final java.lang.String o() {
        return ((pmk) this.a.a()).c();
    }

    public final void p() {
        ((unk) this.a).x.k();
    }

    public final void r(int i) {
        ((unk) this.a).d(i != 0);
    }

    public final void s(java.lang.Runnable runnable) {
        boolean z;
        txn txnVarJ = ((tyy) this.a).j();
        synchronized (txnVarJ) {
            z = txnVarJ.c;
            if (!z) {
                txnVarJ.d.add(runnable);
            }
        }
        if (z) {
            runnable.run();
        }
    }

    public final boolean t() {
        return ((ugw) this.a).o().a;
    }

    public final void u(sri sriVar) {
        sre sreVar = (sre) this.a;
        sreVar.a = sriVar;
        java.util.Iterator it = sreVar.c.iterator();
        while (it.hasNext()) {
            ((srd) it.next()).b();
        }
        sreVar.c.clear();
        sreVar.b = null;
    }

    public final void v() {
        int i = sdn.c;
        ((sfc) this.a).d.f("EVENT_CAR_DISCONNECTED", (android.os.Parcelable) null);
    }

    public final void w(rhq rhqVar) {
        if (rhqVar == null) {
            defpackage.qsa.a.g().ai(7699).u("Cannot get BluetoothProfileUtil");
            return;
        }
        defpackage.qsa qsaVar = (defpackage.qsa) this.a;
        qsaVar.h = rhqVar;
        defpackage.rhn rhnVar = qsaVar.e;
        rhnVar.h = qsaVar.h;
        rhnVar.c(defpackage.rhj.EVENT_BLUETOOTH_PROFILE_UTIL_READY);
    }

    public final void x(defpackage.oup oupVar) {
        defpackage.zbd zbdVar;
        defpackage.zbd zbdVar2;
        java.lang.Object obj = this.a;
        qrr qrrVar = (qrr) obj;
        qrrVar.i.b(defpackage.tna.aa(oupVar));
        qsv qsvVar = qrrVar.l;
        java.lang.Object obj2 = qsvVar.c;
        defpackage.out outVar = oupVar.c;
        if (outVar == null) {
            outVar = defpackage.out.a;
        }
        defpackage.ove oveVarB = defpackage.ove.b(outVar.e);
        if (oveVarB == null) {
            oveVarB = defpackage.ove.AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        defpackage.zbe zbeVarX = defpackage.tna.X(oveVarB);
        for (defpackage.ovm ovmVar : oupVar.g) {
            defpackage.ovl ovlVarB = defpackage.ovl.b(ovmVar.e);
            if (ovlVarB == null) {
                ovlVarB = defpackage.ovl.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
            }
            switch (ovlVarB.ordinal()) {
                case defpackage.abnt.b /* 0 */:
                    zbdVar2 = defpackage.zbd.wd;
                    break;
                case 1:
                    zbdVar2 = defpackage.zbd.we;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    zbdVar2 = defpackage.zbd.wf;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    zbdVar2 = defpackage.zbd.wg;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    zbdVar2 = defpackage.zbd.wh;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    zbdVar2 = defpackage.zbd.wi;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    zbdVar2 = defpackage.zbd.wj;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    zbdVar2 = defpackage.zbd.wk;
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    zbdVar2 = defpackage.zbd.wl;
                    break;
                case 9:
                    zbdVar2 = defpackage.zbd.wm;
                    break;
                case 10:
                    zbdVar2 = defpackage.zbd.wn;
                    break;
                case 11:
                    zbdVar2 = defpackage.zbd.wo;
                    break;
                case 12:
                    zbdVar2 = defpackage.zbd.wp;
                    break;
                case 13:
                    zbdVar2 = defpackage.zbd.wq;
                    break;
                case 14:
                    zbdVar2 = defpackage.zbd.wr;
                    break;
                case 15:
                    zbdVar2 = defpackage.zbd.ws;
                    break;
                case 16:
                    zbdVar2 = defpackage.zbd.wt;
                    break;
                case 17:
                    zbdVar2 = defpackage.zbd.wu;
                    break;
                case 18:
                    zbdVar2 = defpackage.zbd.wv;
                    break;
                case 19:
                    zbdVar2 = defpackage.zbd.ww;
                    break;
                case 20:
                    zbdVar2 = defpackage.zbd.wx;
                    break;
                case 21:
                    zbdVar2 = defpackage.zbd.wy;
                    break;
                case 22:
                    zbdVar2 = defpackage.zbd.wz;
                    break;
                case 23:
                    zbdVar2 = defpackage.zbd.wL;
                    break;
                case 24:
                    zbdVar2 = defpackage.zbd.wM;
                    break;
                case 25:
                    zbdVar2 = defpackage.zbd.wO;
                    break;
                case 26:
                    zbdVar2 = defpackage.zbd.wP;
                    break;
                case 27:
                    zbdVar2 = defpackage.zbd.wQ;
                    break;
                case 28:
                    zbdVar2 = defpackage.zbd.wR;
                    break;
                case 29:
                    zbdVar2 = defpackage.zbd.wS;
                    break;
                case 30:
                    zbdVar2 = defpackage.zbd.wU;
                    break;
                case 31:
                    zbdVar2 = defpackage.zbd.wN;
                    break;
                case 32:
                    zbdVar2 = defpackage.zbd.wI;
                    break;
                case 33:
                    zbdVar2 = defpackage.zbd.wD;
                    break;
                case 34:
                    zbdVar2 = defpackage.zbd.wV;
                    break;
                case 35:
                    zbdVar2 = defpackage.zbd.wW;
                    break;
                case 36:
                    zbdVar2 = defpackage.zbd.wX;
                    break;
                case 37:
                    zbdVar2 = defpackage.zbd.xC;
                    break;
                case 38:
                    zbdVar2 = defpackage.zbd.xa;
                    break;
                case 39:
                    zbdVar2 = defpackage.zbd.xb;
                    break;
                case 40:
                    zbdVar2 = defpackage.zbd.xc;
                    break;
                case 41:
                    zbdVar2 = defpackage.zbd.xd;
                    break;
                case 42:
                    zbdVar2 = defpackage.zbd.xe;
                    break;
                case 43:
                    zbdVar2 = defpackage.zbd.xf;
                    break;
                case 44:
                    zbdVar2 = defpackage.zbd.xg;
                    break;
                case 45:
                    zbdVar2 = defpackage.zbd.xh;
                    break;
                case 46:
                    zbdVar2 = defpackage.zbd.xi;
                    break;
                case 47:
                    zbdVar2 = defpackage.zbd.xj;
                    break;
                case 48:
                    zbdVar2 = defpackage.zbd.xk;
                    break;
                case 49:
                    zbdVar2 = defpackage.zbd.xl;
                    break;
                case 50:
                    zbdVar2 = defpackage.zbd.xm;
                    break;
                case 51:
                    zbdVar2 = defpackage.zbd.xn;
                    break;
                case 52:
                    zbdVar2 = defpackage.zbd.xo;
                    break;
                case 53:
                    zbdVar2 = defpackage.zbd.xp;
                    break;
                case 54:
                    zbdVar2 = defpackage.zbd.xq;
                    break;
                case 55:
                    zbdVar2 = defpackage.zbd.xr;
                    break;
                case 56:
                    zbdVar2 = defpackage.zbd.xs;
                    break;
                case 57:
                    zbdVar2 = defpackage.zbd.xt;
                    break;
                case 58:
                    zbdVar2 = defpackage.zbd.xu;
                    break;
                case 59:
                    zbdVar2 = defpackage.zbd.xv;
                    break;
                case 60:
                    zbdVar2 = defpackage.zbd.xw;
                    break;
                case 61:
                    zbdVar2 = defpackage.zbd.xx;
                    break;
                case 62:
                    zbdVar2 = defpackage.zbd.xy;
                    break;
                default:
                    throw new java.lang.RuntimeException(null, null);
            }
            qsvVar.e(zbeVarX, zbdVar2, 1);
            if ((ovmVar.b & 16) != 0) {
                defpackage.ovj ovjVar = ovmVar.g;
                if (ovjVar == null) {
                    ovjVar = defpackage.ovj.a;
                }
                defpackage.out outVar2 = oupVar.c;
                if (outVar2 == null) {
                    outVar2 = defpackage.out.a;
                }
                defpackage.ove oveVarB2 = defpackage.ove.b(outVar2.e);
                if (oveVarB2 == null) {
                    oveVarB2 = defpackage.ove.AUDIO_STREAM_TYPE_UNSPECIFIED;
                }
                defpackage.ovl ovlVarB2 = defpackage.ovl.b(ovmVar.e);
                if (ovlVarB2 == null) {
                    ovlVarB2 = defpackage.ovl.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
                }
                int iOrdinal = ovlVarB2.ordinal();
                if (iOrdinal == 29 || iOrdinal == 36) {
                    if ((ovjVar.b & 64) != 0) {
                        defpackage.ove oveVarB3 = defpackage.ove.b(ovjVar.i);
                        if (oveVarB3 == null) {
                            oveVarB3 = defpackage.ove.AUDIO_STREAM_TYPE_UNSPECIFIED;
                        }
                        if (oveVarB2 != oveVarB3) {
                            qsvVar.e(zbeVarX, defpackage.zbd.wT, 1);
                        }
                    }
                } else if (iOrdinal == 42 && (ovjVar.b & 2) != 0 && !ovjVar.d) {
                    qsvVar.e(zbeVarX, defpackage.zbd.xz, 1);
                }
            }
            if ((ovmVar.b & 32) != 0) {
                defpackage.ovh ovhVar = ovmVar.h;
                if (ovhVar == null) {
                    ovhVar = defpackage.ovh.a;
                }
                defpackage.ovl ovlVarB3 = defpackage.ovl.b(ovmVar.e);
                if (ovlVarB3 == null) {
                    ovlVarB3 = defpackage.ovl.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
                }
                if (ovlVarB3 == defpackage.ovl.AUDIO_BOTTOM_HALF_STREAMING_STARTED && (ovhVar.b & 8) != 0 && ovhVar.f) {
                    qsvVar.e(zbeVarX, defpackage.zbd.xA, 1);
                }
            }
        }
        qsvVar.e(zbeVarX, defpackage.zbd.vP, oupVar.h);
        defpackage.ouo ouoVarB = defpackage.ouo.b(oupVar.e);
        if (ouoVarB == null) {
            ouoVarB = defpackage.ouo.AUDIO_STREAMING_STATUS_UNSPECIFIED;
        }
        if (ouoVarB != defpackage.ouo.STREAMING) {
            defpackage.ouq ouqVar = oupVar.f;
            if (ouqVar == null) {
                ouqVar = defpackage.ouq.a;
            }
            qsvVar.e(zbeVarX, defpackage.zbd.vS, ouqVar.f);
            for (ovg ovgVar : ouqVar.r) {
                defpackage.ovf ovfVarB = defpackage.ovf.b(ovgVar.d);
                if (ovfVarB == null) {
                    ovfVarB = defpackage.ovf.DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED;
                }
                switch (ovfVarB.ordinal()) {
                    case defpackage.abnt.b /* 0 */:
                        zbdVar = defpackage.zbd.vT;
                        break;
                    case 1:
                        zbdVar = defpackage.zbd.vU;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        zbdVar = defpackage.zbd.vV;
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        zbdVar = defpackage.zbd.vW;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        zbdVar = defpackage.zbd.vX;
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        zbdVar = defpackage.zbd.vY;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        zbdVar = defpackage.zbd.vZ;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        zbdVar = defpackage.zbd.wa;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        zbdVar = defpackage.zbd.wb;
                        break;
                    case 9:
                        zbdVar = defpackage.zbd.wc;
                        break;
                    default:
                        throw new java.lang.RuntimeException(null, null);
                }
                qsvVar.e(zbeVarX, zbdVar, ovgVar.e);
            }
            qsvVar.e(zbeVarX, defpackage.zbd.vQ, ouqVar.g);
            qsvVar.e(zbeVarX, defpackage.zbd.vR, ouqVar.i);
        }
    }

    public final void y() {
        qrp qrpVar = (qrp) this.a;
        qrpVar.g();
        qrpVar.c("onExternalAppLoseAudioFocus");
    }

    public final void z(defpackage.ovl ovlVar) {
        C(ovlVar, B());
    }

    public xei(java.lang.Object obj) {
        this.a = obj;
    }

    public xei() {
        throw null;
    }

    public xei(char[] cArr) {
    }
}
