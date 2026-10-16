package com.waze.google_assistant;

import android.content.Context;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.MapVisibleAreaChanged;
import com.waze.lm;
import com.waze.map.b.ci;
import com.waze.map.cc;
import com.waze.settings.cs;
import l.a.fv;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class an {
    public /* synthetic */ an(byte[] bArr) {
    }

    public static void a(Context context, al alVar) {
        c(context, alVar, null);
    }

    public static void c(Context context, final al alVar, final com.waze.settings.tree.a.a aVar) {
        if (ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_DISCLOSURE_SHOWN.b().booleanValue() && alVar == al.f24100a) {
            return;
        }
        ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_DISCLOSURE_SHOWN.d(true);
        int i2 = 0;
        boolean z = ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_ONBOARDING_POPUP_SHOWN.b().booleanValue() && !ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_AGREED_TO_TERMS.b().booleanValue();
        com.waze.z.a.e.b.f().b(alVar);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        com.waze.ab.k kVar = new com.waze.ab.k();
        kVar.u(aVarA.c(R.string.GOOGLE_ASSISTANT_DISCLOSURE_TITLE, new Object[0]));
        kVar.t(String.format("%s %s", aVarA.c(true != z ? R.string.GOOGLE_ASSISTANT_DISCLOSURE_BODY : R.string.GOOGLE_ASSISTANT_DISCLOSURE_BODY_RETURNING_USER, new Object[0]), aVarA.c(R.string.GOOGLE_ASSISTANT_DISCLOSURE_PRIVACY_POLICY_HTML, new Object[0])));
        kVar.n(aVarA.c(R.string.GOOGLE_ASSISTANT_DISCLOSURE_CTA, new Object[0]));
        kVar.p(context.getResources().getDrawable(R.drawable.wheeler_onboarding_illustration_4));
        kVar.q(context.getResources().getDimensionPixelSize(R.dimen.confirmation_popup_image_size));
        kVar.o();
        kVar.w(new ai(alVar, aVar));
        kVar.s(new aj(alVar, aVar, i2));
        kVar.r(new com.waze.ab.h() { // from class: com.waze.google_assistant.ak
            @Override // com.waze.ab.h
            public final void a() {
                an.i(am.f24105b, alVar, aVar);
            }
        });
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE == null || !eVarE.aK()) {
            return;
        }
        com.waze.ab.l lVar = new com.waze.ab.l(eVarE, kVar);
        eVarE.aI(lVar);
        lVar.show();
    }

    public static ci f(MapVisibleAreaChanged.CornersPolygon cornersPolygon) {
        h.g.b.x.f(cornersPolygon, "<this>");
        Position.IntPosition topLeft = cornersPolygon.getTopLeft();
        h.g.b.x.e(topLeft, "getTopLeft(...)");
        com.waze.shared_infra.h.c cVarA = cc.a(topLeft);
        Position.IntPosition topRight = cornersPolygon.getTopRight();
        h.g.b.x.e(topRight, "getTopRight(...)");
        com.waze.shared_infra.h.c cVarA2 = cc.a(topRight);
        Position.IntPosition bottomRight = cornersPolygon.getBottomRight();
        h.g.b.x.e(bottomRight, "getBottomRight(...)");
        com.waze.shared_infra.h.c cVarA3 = cc.a(bottomRight);
        Position.IntPosition bottomLeft = cornersPolygon.getBottomLeft();
        h.g.b.x.e(bottomLeft, "getBottomLeft(...)");
        return new ci(cVarA, cVarA2, cVarA3, cc.a(bottomLeft));
    }

    public static /* synthetic */ fv g(com.waze.mywaze.ag agVar) {
        com.waze.mywaze.ab abVar = com.waze.mywaze.ab.f30543a;
        com.waze.mywaze.ac acVar = com.waze.mywaze.ac.f30547a;
        com.waze.mywaze.ad adVar = com.waze.mywaze.ad.f30558a;
        com.waze.mywaze.ae aeVar = com.waze.mywaze.ae.f30561a;
        com.waze.mywaze.ag agVar2 = com.waze.mywaze.ag.f30567a;
        switch (agVar.ordinal()) {
            case 0:
                return fv.ASSET_CHANGED_SOURCE_UNSPECIFIED;
            case 1:
                return fv.ASSET_CHANGED_SOURCE_DEEPLINK;
            case 2:
                return fv.ASSET_CHANGED_SOURCE_LEGACY_COPILOT;
            case 3:
                return fv.ASSET_CHANGED_SOURCE_MARKETPLACE;
            case 4:
                return fv.ASSET_CHANGED_SOURCE_SETTINGS;
            case 5:
                return fv.ASSET_CHANGED_SOURCE_DEFAULT;
            case 6:
                return fv.ASSET_CHANGED_SOURCE_TRANSPORT_SDK;
            default:
                throw new h.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.waze.settings.de, java.lang.Object] */
    public static void i(am amVar, al alVar, com.waze.settings.tree.a.a aVar) {
        com.waze.z.a.e.b.f().a(amVar, alVar);
        am amVar2 = am.f24104a;
        aa aaVarA = aa.f24060a.a();
        boolean z = amVar == amVar2;
        aaVarA.w(z);
        if (aVar == null || !z) {
            return;
        }
        ?? r1 = aVar.f37461a;
        Object obj = aVar.f37462b;
        cs csVarA = r1.a();
        String strQ = ((com.waze.settings.tree.f) obj).q();
        com.waze.settings.tree.g gVarB = r1.b();
        h.g.b.x.c(gVarB);
        csVarA.c(strQ, gVarB.r());
    }

    private an() {
        throw null;
    }
}
