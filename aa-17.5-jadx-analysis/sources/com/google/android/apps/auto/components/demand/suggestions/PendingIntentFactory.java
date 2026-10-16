package com.google.android.apps.auto.components.demand.suggestions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import defpackage.abnj;
import defpackage.abnp;
import defpackage.abnv;
import defpackage.abon;
import defpackage.abpc;
import defpackage.acrn;
import defpackage.ebf;
import defpackage.kfl;
import defpackage.kzd;
import defpackage.kzt;
import defpackage.kzy;
import defpackage.mdd;
import defpackage.ory;
import defpackage.orz;
import defpackage.otp;
import defpackage.rqv;
import defpackage.rrc;
import defpackage.vky;
import defpackage.wdu;
import defpackage.wer;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yyv;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public final class PendingIntentFactory {
    public static final yph a = yph.c("GH.Assistant.SPIF");
    private final Context b;
    private int c;

    public static class AssistantSuggestionActionBroadcastReceiver extends mdd {
        @Override // defpackage.mdd
        protected final vky a() {
            return vky.c(null, getClass());
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) throws ClassNotFoundException {
            wer.c();
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_SUGGESTION_EXTRAS");
            byteArrayExtra.getClass();
            otp otpVar = otp.a;
            abpc abpcVarL = abnv.L(otp.class);
            try {
                otp otpVar2 = (otp) abpcVarL.j(byteArrayExtra, abnj.a());
                orz orzVar = otpVar2.c;
                if (orzVar == null) {
                    orzVar = orz.a;
                }
                String str = orzVar.c;
                yzy yzyVarB = yzy.b(otpVar2.e);
                yzz yzzVar = yzz.ASSISTANT_SUGGESTION;
                yph yphVar = PendingIntentFactory.a;
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar, yzyVarB).l());
                if ((otpVar2.b & 2) == 0) {
                    ((ype) PendingIntentFactory.a.l().ai(3671)).M("Suggestion %s tapped, uiAction=%s", str, yzyVarB.sn);
                    return;
                }
                ory oryVar = otpVar2.d;
                if (oryVar == null) {
                    oryVar = ory.a;
                }
                ((ype) PendingIntentFactory.a.l().ai(3672)).R("Suggestion action selected: %s/%s, uiAction=%s", str, kzd.e(oryVar), yzyVarB.sn);
                if ((oryVar.b & 1) != 0) {
                    kfl.h().o(oryVar);
                    if (acrn.g() && orzVar.g == 4) {
                        ebf.j().F(rqv.h(yxy.GEARHEAD, 40, yyv.ASSISTANT_SUGGESTION_CLICKED_SHARE_ETA_TRIGGER_HATS).l());
                    }
                }
                if (oryVar.d) {
                    Object obj = kzt.a().b;
                    synchronized (obj) {
                        if (((kzy) obj).a(str)) {
                            kzt.b(yzy.tI, 1);
                        } else {
                            kzt.b(yzy.tJ, 1);
                        }
                    }
                }
            } catch (abon e) {
                throw new IllegalArgumentException("Failed to parse a proto message using ".concat(String.valueOf(abpcVarL.getClass().getSimpleName())), e);
            }
        }
    }

    public PendingIntentFactory(Context context) {
        this.b = context;
    }

    public final PendingIntent a(orz orzVar, ory oryVar, yzy yzyVar) {
        abnp abnpVarN = otp.a.n();
        abnpVarN.t();
        otp otpVar = (otp) abnpVarN.b;
        orzVar.getClass();
        otpVar.c = orzVar;
        otpVar.b |= 1;
        abnpVarN.t();
        otp otpVar2 = (otp) abnpVarN.b;
        oryVar.getClass();
        otpVar2.d = oryVar;
        otpVar2.b |= 2;
        int iA = yzyVar.a();
        abnpVarN.t();
        otp otpVar3 = (otp) abnpVarN.b;
        otpVar3.b |= 4;
        otpVar3.e = iA;
        return b((otp) abnpVarN.q());
    }

    public final PendingIntent b(otp otpVar) {
        String strE;
        int i = this.c;
        this.c = i + 1;
        ype ypeVar = (ype) a.l().ai(3673);
        Integer numValueOf = Integer.valueOf(i);
        orz orzVar = otpVar.c;
        if (orzVar == null) {
            orzVar = orz.a;
        }
        String str = orzVar.c;
        if ((otpVar.b & 2) != 0) {
            ory oryVar = otpVar.d;
            if (oryVar == null) {
                oryVar = ory.a;
            }
            strE = kzd.e(oryVar);
        } else {
            strE = null;
        }
        ypeVar.R("Creating pending intent with ID=%d, suggestionID='%s', action=%s", numValueOf, str, strE);
        Context context = this.b;
        Intent intentPutExtra = new Intent(context, (Class<?>) AssistantSuggestionActionBroadcastReceiver.class).putExtra("EXTRA_SUGGESTION_EXTRAS", otpVar.h());
        ClipData clipData = wdu.a;
        PendingIntent pendingIntentC = wdu.c(context, i, intentPutExtra, 67108864);
        pendingIntentC.getClass();
        return pendingIntentC;
    }
}
