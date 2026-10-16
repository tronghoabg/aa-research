package com.waze.push;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.waze.NativeManager;
import com.waze.kw;
import com.waze.lm;
import com.waze.ui.z.as;
import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements h, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33417a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33418b;

    public a(Context context) {
        x.f(context, "context");
        this.f33417a = context;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("DefaultAlertPushMessageHandler");
        x.e(eVarD, "create(...)");
        this.f33418b = eVarD;
    }

    @Override // com.waze.push.h
    public final String a() {
        return "DefaultAlertPushMessageHandler";
    }

    @Override // com.waze.push.h
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        g gVar = (g) obj;
        x.f(gVar, "pushMessage");
        return gVar.g() != null;
    }

    @Override // com.waze.push.h
    public final /* synthetic */ boolean c(Object obj) throws NumberFormatException {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        g gVar = (g) obj;
        x.f(gVar, "pushMessage");
        String strG = gVar.g();
        String strK = gVar.k();
        String str = strK == null ? "NONE" : strK;
        String strD = gVar.d();
        String strConcat = strD != null ? "\nActions json: ".concat(strD) : null;
        String strL = gVar.l();
        String strConcat2 = strL != null ? "\nFeedback json: ".concat(strL) : null;
        com.waze.shared_infra.i.e eVar = this.f33418b;
        eVar.e("Got new alert: " + strG + ". Type: " + strK + ". " + strConcat + strConcat2);
        com.waze.x.h hVarB = gVar.b();
        if (hVarB == null) {
            hVarB = com.waze.x.h.b();
            x.e(hVarB, "createBaseDeepLink(...)");
        }
        if (lm.d().o()) {
            eVar.a("Showing message for the alert: " + strG + ", url = " + hVarB);
            if (hVarB.a().getQueryParameter(com.waze.x.c.SHARE_DRIVE.a()) != null) {
                hVarB.f(com.waze.x.c.TICKER_ONLY, ExifInterface.GPS_DIRECTION_TRUE);
            }
            com.waze.x.c cVar = com.waze.x.c.POPUP_MESSAGE;
            if (!TextUtils.isEmpty(gVar.j())) {
                strG = gVar.j() + ": " + strG;
            }
            hVarB.f(cVar, strG);
            NativeManager.getInstance().UrlHandler(hVarB.toString());
            kw.f25072a.a().e(as.c(eVar, str));
            return true;
        }
        kw.f25072a.a().b(as.c(eVar, str));
        if (gVar.l() != null) {
            n.f33443a.a().c(gVar);
        }
        if (!gVar.C()) {
            return false;
        }
        if (TextUtils.isEmpty(gVar.v())) {
            hVarB.f(com.waze.x.c.NO_LOGIN, "F");
        } else {
            hVarB.f(com.waze.x.c.NO_LOGIN, ExifInterface.GPS_DIRECTION_TRUE);
        }
        Context context = this.f33417a;
        a aVar = this;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(c.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(c.class);
        }
        new j(context, gVar, hVarB, (c) bVarC.a(mVar, null, null)).b();
        return true;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
