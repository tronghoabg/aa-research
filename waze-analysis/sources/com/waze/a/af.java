package com.waze.a;

import android.content.Context;
import android.support.v4.app.ar;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.datepicker.ag;
import com.waze.R;
import com.waze.app_nav.ah;
import com.waze.authentication.aj;
import com.waze.authentication.ak;
import com.waze.authentication.al;
import com.waze.config.ConfigValues;
import com.waze.design_components.cta_bar.CallToActionBar;
import com.waze.design_components.header_view.WazeHeaderView;
import com.waze.design_components.hero_view.WazeHeroView;
import com.waze.gas.GasNativeManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class af {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13608a;

    public /* synthetic */ af(byte[] bArr) {
    }

    public static com.waze.uid.stats.a a(s sVar) {
        h.g.b.x.f(sVar, "clickEvent");
        if (h.g.b.x.n(sVar, n.f13645a)) {
            return com.waze.uid.stats.a.f44717a;
        }
        if (h.g.b.x.n(sVar, o.f13646a)) {
            return com.waze.uid.stats.a.f44718b;
        }
        if (h.g.b.x.n(sVar, p.f13647a)) {
            return com.waze.uid.stats.a.f44719c;
        }
        if (h.g.b.x.n(sVar, q.f13648a)) {
            return com.waze.uid.stats.a.f44721e;
        }
        if (sVar instanceof r) {
            return com.waze.uid.stats.a.f44720d;
        }
        throw new h.i();
    }

    public static com.waze.uid.stats.q b(l lVar) {
        h.g.b.x.f(lVar, "ageConfirmationClick");
        if (lVar instanceof k) {
            return com.waze.uid.stats.q.f44784b;
        }
        if (lVar instanceof j) {
            return com.waze.uid.stats.q.f44783a;
        }
        throw new h.i();
    }

    public static /* synthetic */ h.ab c(h.g.a.l lVar, h.g.a.l lVar2, com.waze.shared_infra.q.i iVar) {
        f13608a = true;
        q(lVar, lVar2, iVar);
        return h.ab.f48028a;
    }

    static h.ab d(h.g.a.l lVar, com.waze.shared_infra.q.i iVar) {
        lVar.invoke(new k(iVar));
        f13608a = true;
        return h.ab.f48028a;
    }

    public static void e(final ar arVar, String str, String str2, String str3, String str4, String str5, String str6, final h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, final h.g.a.l lVar2, com.waze.shared_infra.q.i iVar, final boolean z) {
        h.g.b.x.f(arVar, "<this>");
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "subtitle");
        h.g.b.x.f(str3, "linkText");
        h.g.b.x.f(str4, "linkAddress");
        h.g.b.x.f(str5, "datePickerTitle");
        h.g.b.x.f(str6, "saveText");
        h.g.b.x.f(lVar, "onOkClicked");
        h.g.b.x.f(lVar2, "statsSender");
        h.f fVarA = h.g.a(new com.airbnb.lottie.b.v(arVar, 12));
        lVar2.invoke(new x(iVar));
        TextView textView = (TextView) arVar.requireView().findViewById(R.id.aadcLink);
        SpannableString spannableString = new SpannableString(str3);
        int i2 = 0;
        spannableString.setSpan(new ad(lVar2, arVar, str3, str4), 0, spannableString.length(), 0);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(ContextCompat.getColor(arVar.requireContext(), R.color.primary_variant));
        com.waze.uid.state_impl.a.f fVarP = p(fVarA);
        TextView textView2 = (TextView) arVar.requireView().findViewById(R.id.dateOfBirthCta);
        int i3 = com.waze.shared_infra.q.i.f37938a;
        com.google.android.material.datepicker.j jVarB = com.google.android.material.datepicker.j.b(com.waze.settings.h.c.d().a());
        h.g.b.x.e(jVarB, "before(...)");
        com.google.android.material.datepicker.a aVar3 = new com.google.android.material.datepicker.a();
        aVar3.c(jVarB);
        h.g.b.x.e(aVar3, "setValidator(...)");
        com.google.android.material.datepicker.af afVarA = com.google.android.material.datepicker.af.a();
        afVarA.g();
        afVarA.h(str5);
        afVarA.c(aVar3.a());
        afVarA.f(com.waze.shared_infra.q.i.f37939b);
        h.g.b.x.e(afVarA, "setTextInputFormat(...)");
        if (iVar != null) {
            fVarP.e(iVar.a());
            afVarA.e(Long.valueOf(iVar.a()));
        }
        afVarA.d();
        ag agVarB = afVarA.b();
        h.g.b.x.e(agVarB, "build(...)");
        h.g.b.x.c(textView2);
        textView2.setOnClickListener(new ac(new com.waze.ads.c.b(lVar2, agVarB, arVar, fVarP, 1)));
        final com.waze.uid.state_impl.a.f fVarP2 = p(fVarA);
        CallToActionBar callToActionBar = (CallToActionBar) arVar.requireView().findViewById(R.id.callToActionBar);
        fVarP2.b().observe(arVar.getViewLifecycleOwner(), new ae(new com.airbnb.lottie.b.q(callToActionBar, 12)));
        callToActionBar.g(new View.OnClickListener() { // from class: com.waze.a.ab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                af.f(fVarP2, z, arVar, lVar2, lVar);
            }
        });
        ((CallToActionBar) arVar.requireView().findViewById(R.id.callToActionBar)).f(str6);
        View viewFindViewById = arVar.requireView().findViewById(R.id.requestUserAgeLayout);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        com.waze.shared_infra.g.e.c(viewFindViewById);
        WazeHeroView wazeHeroView = (WazeHeroView) arVar.requireView().findViewById(R.id.heroView);
        wazeHeroView.b(str);
        wazeHeroView.a(str2);
        WazeHeaderView wazeHeaderView = (WazeHeaderView) arVar.requireView().findViewById(R.id.requestUserAgeHeader);
        if (aVar == null && aVar2 == null) {
            wazeHeaderView.setVisibility(8);
        } else {
            wazeHeaderView.setVisibility(0);
            if (aVar != null) {
                wazeHeaderView.i();
                wazeHeaderView.c(new y(lVar2, aVar, 1));
            } else {
                wazeHeaderView.a();
            }
            if (aVar2 != null) {
                wazeHeaderView.j();
                wazeHeaderView.f(new y(lVar2, aVar2, i2));
            } else {
                wazeHeaderView.b();
            }
        }
        p(fVarA).a().observe(arVar.getViewLifecycleOwner(), new ae(new com.airbnb.lottie.b.q(arVar, 10)));
        p(fVarA).c().observe(arVar.getViewLifecycleOwner(), new ae(new com.airbnb.lottie.b.q(arVar, 11)));
    }

    static void f(com.waze.uid.state_impl.a.f fVar, boolean z, ar arVar, h.g.a.l lVar, h.g.a.l lVar2) {
        com.waze.shared_infra.q.i iVarD = fVar.d();
        if (iVarD != null) {
            if ((ConfigValues.CONFIG_VALUE_SIGNUP_U16_IS_FEATURE_ENABLED.b().booleanValue() || ConfigValues.CONFIG_VALUE_U16_IS_FEATURE_ENABLED.b().booleanValue()) && z) {
                h.g.b.x.f(iVarD, "birthDate");
                if (com.waze.trip_overview.views.l.b(iVarD) < 16 && !f13608a) {
                    Context contextRequireContext = arVar.requireContext();
                    h.g.b.x.e(contextRequireContext, "requireContext(...)");
                    z zVar = new z((Object) lVar, (Object) lVar2, (Object) iVarD, 1, (byte[]) null);
                    int iB = com.waze.trip_overview.views.l.b(iVarD);
                    com.waze.design_components.cta_bar.g gVar = com.waze.design_components.cta_bar.g.f23435a;
                    int i2 = 0;
                    String strC = com.waze.shared_infra.o.b.a().c(R.string.U16_CONFIRMATION_DIALOG_CONFIRM_CTA, new Object[0]);
                    com.waze.design_components.button.g gVar2 = com.waze.design_components.button.g.f23359b;
                    boolean z2 = false;
                    com.waze.design_components.cta_bar.c cVar = new com.waze.design_components.cta_bar.c(new com.waze.design_components.cta_bar.b(strC, false, gVar2, 0.0f, null, null, new z(lVar, iVarD, zVar, i2), 58), new com.waze.design_components.cta_bar.b(com.waze.shared_infra.o.b.a().c(R.string.U16_CONFIRMATION_DIALOG_EDIT_AGE_CTA, new Object[0]), z2, gVar2, 0.0f, null, null, new aa(lVar, iVarD, i2), 58), gVar);
                    String str = String.format(com.waze.shared_infra.o.b.a().c(R.string.U16_CONFIRMATION_DIALOG_TITLE_PD, new Object[0]), Arrays.copyOf(new Object[]{Integer.valueOf(iB)}, 1));
                    h.g.b.x.e(str, "format(...)");
                    com.waze.design_components.c.j jVar = new com.waze.design_components.c.j(str, cVar, new com.google.firebase.sessions.x(14), com.waze.shared_infra.o.b.a().c(R.string.U16_CONFIRMATION_DIALOG_MESSAGE, new Object[0]), z2, new com.waze.design_components.c.c(new com.waze.design_components.b.a(R.drawable.t3_critical_alert_64px), com.waze.design_components.c.d.f23385b), 64);
                    lVar.invoke(new m(iVarD));
                    com.waze.design_components.d.c(contextRequireContext, jVar);
                    return;
                }
            }
            q(lVar, lVar2, iVarD);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.waze.app_nav.r h(com.waze.app_nav.w wVar, boolean z, String str) {
        h.g.b.x.f(wVar, "<this>");
        h.g.b.x.f(str, "searchTerm");
        com.waze.search.k kVar = com.waze.search.k.f35975a;
        com.waze.search.e eVar = new com.waze.search.e();
        eVar.b(z);
        eVar.c(str);
        return com.waze.alerters.a.k.c(wVar, eVar.a(), new ah(z, null, 0 == true ? 1 : 0, 6));
    }

    public static boolean i(com.waze.app_nav.w wVar) {
        h.g.b.x.f(wVar, "<this>");
        return h.g.b.x.n(((com.waze.app_nav.v) wVar.b().d()).a().b(), com.waze.main_screen.r.f27406a);
    }

    public static /* synthetic */ com.waze.app_nav.r j(com.waze.app_nav.w wVar, boolean z, String str, int i2) {
        boolean z2 = 1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1));
        if ((i2 & 2) != 0) {
            str = "";
        }
        return h(wVar, z2, str);
    }

    public static com.waze.c.d.m l(com.waze.c.d.t tVar) {
        h.g.b.x.f(tVar, "<this>");
        for (com.waze.c.d.m mVar : tVar.f()) {
            if ((mVar instanceof com.waze.c.d.i) || (mVar instanceof com.waze.c.d.j)) {
                return mVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static com.waze.modules.c.ar m(com.waze.c.d.m mVar) {
        h.g.b.x.f(mVar, "<this>");
        if (mVar instanceof com.waze.c.d.i) {
            return ((com.waze.c.d.i) mVar).c();
        }
        if (!(mVar instanceof com.waze.c.d.l)) {
            throw new h.i();
        }
        com.waze.modules.c.ar arVarD = mVar.c().d();
        return (!((com.waze.c.d.l) mVar).b() || arVarD == null) ? mVar.c() : arVarD;
    }

    public static aj n(al alVar) {
        h.g.b.x.f(alVar, "<this>");
        aj ajVarA = alVar.a(ak.f15719a);
        if (ajVarA != null) {
            return ajVarA;
        }
        throw new RuntimeException("no credentials repository");
    }

    public static com.waze.authentication.k o(aj ajVar) {
        h.g.b.x.f(ajVar, "<this>");
        List listA = ajVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof com.waze.authentication.k) {
                arrayList.add(obj);
            }
        }
        return (com.waze.authentication.k) h.a.i.R(arrayList);
    }

    private static com.waze.uid.state_impl.a.f p(h.f fVar) {
        return (com.waze.uid.state_impl.a.f) fVar.getValue();
    }

    private static void q(h.g.a.l lVar, h.g.a.l lVar2, com.waze.shared_infra.q.i iVar) {
        lVar.invoke(new r(iVar));
        lVar2.invoke(iVar);
    }

    private af() {
        throw null;
    }
}
