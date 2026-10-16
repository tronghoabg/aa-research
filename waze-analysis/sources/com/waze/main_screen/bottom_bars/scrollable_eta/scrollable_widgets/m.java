package com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ap;
import android.view.View;
import android.widget.EditText;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.google_assistant.al;
import com.waze.google_assistant.an;
import com.waze.main_screen.bottom_bars.scrollable_eta.s;
import com.waze.navigate.AddressItem;
import com.waze.navigate.NavResultData;
import com.waze.navigate.et;
import com.waze.navigate.ge;
import com.waze.reports.ba;
import com.waze.settings.bp;
import com.waze.settings.cs;
import com.waze.settings.dd;
import com.waze.uid.b.u;
import com.waze.uid.c.bt;
import com.waze.uid.state_impl.g.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f26061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26062b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f26063c;

    public /* synthetic */ m(Object obj, Object obj2, int i2) {
        this.f26063c = i2;
        this.f26061a = obj;
        this.f26062b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.waze.settings.de, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.waze.settings.de, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f26063c) {
            case 0:
                s sVar = ((o) this.f26061a).f26030a;
                if (sVar != null) {
                    sVar.i();
                    if (ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_SHOW_TOLL_PRICE)) {
                        et.e(((NavResultData) this.f26062b).tollInfo, ge.f31410a);
                        break;
                    }
                }
                break;
            case 1:
                ?? r6 = this.f26061a;
                an.c(r6.g(), al.f24101b, new com.waze.settings.tree.a.a(r6, this.f26062b));
                break;
            case 2:
                ?? r62 = this.f26061a;
                com.waze.settings.tree.g gVarB = r62.b();
                com.waze.settings.tree.d.d dVar = gVarB instanceof com.waze.settings.tree.d.d ? (com.waze.settings.tree.d.d) gVarB : null;
                if (dVar != null) {
                    dVar.d((com.waze.settings.tree.d.g) this.f26062b, (dd) r62);
                    break;
                }
                break;
            case 3:
                ?? r63 = this.f26061a;
                com.waze.settings.tree.g gVarB2 = r63.b();
                com.waze.settings.tree.d.d dVar2 = gVarB2 instanceof com.waze.settings.tree.d.d ? (com.waze.settings.tree.d.d) gVarB2 : null;
                if (dVar2 != null) {
                    dVar2.d((com.waze.settings.tree.d.g) this.f26062b, (dd) r63);
                    break;
                }
                break;
            case 4:
                com.waze.settings.tree.f fVar = (com.waze.settings.tree.f) this.f26062b;
                ?? r5 = this.f26061a;
                com.waze.search.v2.o.g(fVar, r5);
                cs csVarA = r5.a();
                String strQ = fVar.q();
                com.waze.settings.tree.g gVarB3 = r5.b();
                csVarA.c(strQ, gVarB3 != null ? gVarB3.r() : null);
                break;
            case 5:
                Object obj = this.f26062b;
                ?? r52 = this.f26061a;
                com.waze.search.v2.o.g((com.waze.settings.tree.f) obj, r52);
                bp bpVarC = ((com.waze.settings.tree.d.h) obj).c();
                if (bpVarC != null) {
                    Context context = view.getContext();
                    x.e(context, "getContext(...)");
                    cs csVarA2 = r52.a();
                    x.c(view);
                    bpVarC.a(new ba(context, csVarA2, view));
                    break;
                }
                break;
            case 6:
                com.waze.settings.tree.f fVar2 = (com.waze.settings.tree.f) this.f26062b;
                ?? r53 = this.f26061a;
                com.waze.search.v2.o.g(fVar2, r53);
                r53.a().c(fVar2.q(), null);
                break;
            case 7:
                ?? r0 = this.f26061a;
                if (r0.j().a().d() != com.waze.ui.r.a.e.b.a.f43359a) {
                    Object obj2 = this.f26062b;
                    com.waze.search.v2.o.g((com.waze.settings.tree.f) obj2, r0);
                    Intent intent = new Intent(view.getContext(), (Class<?>) ((com.waze.settings.tree.d.j) obj2).c());
                    Context context2 = view.getContext();
                    x.d(context2, "null cannot be cast to non-null type com.waze.ifs.ui.ActivityBase");
                    ((com.waze.ifs.ui.a) context2).startActivityForResult(intent, 15000);
                    break;
                } else {
                    x.c(view);
                    Context context3 = view.getContext();
                    x.d(context3, "null cannot be cast to non-null type com.waze.ifs.ui.ActivityBase");
                    com.waze.design_components.d.a((com.waze.ifs.ui.a) context3, com.waze.shared_infra.o.b.a().c(R.string.LOCK_SCREEN_NAVIGATION_SETTINGS_BLOCKED_MESSAGE, new Object[0]), null);
                    break;
                }
            case 8:
                com.waze.settings.tree.f fVar3 = (com.waze.settings.tree.f) this.f26062b;
                ?? r54 = this.f26061a;
                com.waze.search.v2.o.g(fVar3, r54);
                cs csVarA3 = r54.a();
                String strQ2 = fVar3.q();
                com.waze.settings.tree.g gVarB4 = r54.b();
                csVarA3.c(strQ2, gVarB4 != null ? gVarB4.r() : null);
                break;
            case 9:
                ((ap) this.f26062b).dismiss();
                ?? r55 = this.f26061a;
                if (r55 != 0) {
                    r55.onClick(view);
                    break;
                }
                break;
            case 10:
                ((ap) this.f26062b).dismiss();
                ?? r56 = this.f26061a;
                if (r56 != 0) {
                    r56.onClick(view);
                    break;
                }
                break;
            case 11:
                ((com.waze.cg.a.c) this.f26062b).f22255b.o(((u) this.f26061a).o());
                break;
            case 12:
                ((com.waze.cg.a.c) this.f26062b).f22255b.o(((u) this.f26061a).p());
                break;
            case 13:
                View view2 = (View) this.f26061a;
                ((bt) this.f26062b).n.o(new r(((EditText) view2.findViewById(R.id.username)).getText().toString(), ((EditText) view2.findViewById(R.id.password)).getText().toString()));
                break;
            case 14:
                com.waze.view.popups.a.h.B((com.waze.view.popups.a.h) this.f26062b, (AddressItem) this.f26061a);
                break;
            case 15:
                com.waze.view.popups.a.h.r((com.waze.view.popups.a.h) this.f26062b, (AddressItem) this.f26061a);
                break;
            case 16:
                com.waze.view.popups.a.h.y((com.waze.view.popups.a.h) this.f26062b, (AddressItem) this.f26061a);
                break;
            case 17:
                com.waze.view.popups.a.h.A((com.waze.view.popups.a.h) this.f26062b, (AddressItem) this.f26061a);
                break;
            case 18:
                com.waze.view.popups.a.h.u((com.waze.view.popups.a.h) this.f26062b, (AddressItem) this.f26061a);
                break;
            case 19:
                com.waze.view.popups.a.h.n((com.waze.view.popups.a.h) this.f26062b, (AddressItem) this.f26061a);
                break;
            default:
                com.waze.view.popups.a.h.s((com.waze.view.popups.a.h) this.f26062b, (AddressItem) this.f26061a);
                break;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f26063c = i2;
        this.f26062b = obj;
        this.f26061a = obj2;
    }
}
