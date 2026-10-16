package com.waze.config;

import com.waze.ix;
import com.waze.settings.SettingsMainActivity;
import com.waze.settings.SettingsNavHostFragment;
import com.waze.settings.he;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.strings.DisplayStrings;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class cv implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22591a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f22592b;

    public /* synthetic */ cv(Object obj, int i2) {
        this.f22592b = i2;
        this.f22591a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v14, types: [com.waze.j.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [com.waze.j.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [com.waze.j.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20, types: [com.waze.j.f, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f22592b) {
            case 0:
                return Boolean.valueOf(DebugConfigListActivity.p(((f) obj).j()).contains((String) this.f22591a));
            case 1:
                return com.waze.navigate.location_preview.ay.U((com.waze.navigate.location_preview.ay) obj, 0, null, (com.waze.ui.m.t) this.f22591a, null, null, -2097153);
            case 2:
                Throwable th = (Throwable) obj;
                com.waze.shared_infra.i.e eVar = ((com.waze.search.h.o) this.f22591a).f35951g;
                Objects.toString(th);
                eVar.a("AutoComplete - fetching autocomplete results done, reason:".concat(String.valueOf(th)));
                return h.ab.f48028a;
            case 3:
                Throwable th2 = (Throwable) obj;
                com.waze.shared_infra.i.e eVar2 = ((com.waze.search.h.o) this.f22591a).f35951g;
                Objects.toString(th2);
                eVar2.a("AutoComplete - canceled loading job, reason:".concat(String.valueOf(th2)));
                return h.ab.f48028a;
            case 4:
                int i2 = com.waze.search.h.cd.f35888a;
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                this.f22591a.invoke("contacts");
                return h.ab.f48028a;
            case 5:
                int i3 = com.waze.search.h.cd.f35888a;
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                this.f22591a.invoke("home");
                return h.ab.f48028a;
            case 6:
                int i4 = com.waze.search.h.cd.f35888a;
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                this.f22591a.invoke("work");
                return h.ab.f48028a;
            case 7:
                int i5 = com.waze.search.h.cd.f35888a;
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                this.f22591a.invoke("calendar");
                return h.ab.f48028a;
            case 8:
                Integer num = (Integer) obj;
                if (num != null) {
                    SettingsMainActivity settingsMainActivity = (SettingsMainActivity) this.f22591a;
                    settingsMainActivity.setResult(num.intValue());
                    settingsMainActivity.finish();
                }
                return h.ab.f48028a;
            case 9:
                com.waze.settings.bj bjVar = (com.waze.settings.bj) obj;
                ((SettingsNavHostFragment) this.f22591a).a().c(bjVar.b(), bjVar.a());
                return h.ab.f48028a;
            case 10:
                com.waze.settings.f fVar = (com.waze.settings.f) obj;
                boolean zN = h.g.b.x.n(fVar, com.waze.settings.d.f36998a);
                Object obj2 = this.f22591a;
                if (zN) {
                    com.waze.settings.dc.p((com.waze.settings.dc) obj2);
                } else {
                    if (!h.g.b.x.n(fVar, com.waze.settings.e.f37117a)) {
                        throw new h.i();
                    }
                    android.support.v4.app.ar arVar = (android.support.v4.app.ar) obj2;
                    arVar.startActivity(ix.g(arVar.getActivity()));
                }
                return h.ab.f48028a;
            case 11:
                he heVar = (he) obj;
                h.g.b.x.f(heVar, "it");
                return he.k(heVar, null, null, null, null, null, (String) this.f22591a, null, 1, null, DisplayStrings.DS_PHOTO);
            case 12:
                he heVar2 = (he) obj;
                h.g.b.x.f(heVar2, "it");
                return he.k(heVar2, null, null, null, null, null, (String) this.f22591a, null, 0, null, DisplayStrings.DS_PHOTO);
            case 13:
                he heVar3 = (he) obj;
                h.g.b.x.f(heVar3, "it");
                return he.k(heVar3, null, null, null, null, null, (String) this.f22591a, null, -1, null, DisplayStrings.DS_PHOTO);
            case 14:
                he heVar4 = (he) obj;
                h.g.b.x.f(heVar4, "it");
                return he.k(heVar4, null, null, null, (String) this.f22591a, null, null, null, 0, null, 2015);
            case 15:
                he heVar5 = (he) obj;
                h.g.b.x.f(heVar5, "it");
                return he.k(heVar5, null, null, null, null, (String) this.f22591a, null, null, 0, null, DisplayStrings.DS_VOICE_PROMPTS_SHARE_DISCLAIMER_TITLE);
            case 16:
                he heVar6 = (he) obj;
                h.g.b.x.f(heVar6, "it");
                return he.k(heVar6, null, null, null, null, null, null, null, 0, (String) this.f22591a, 1023);
            case 17:
                he heVar7 = (he) obj;
                h.g.b.x.f(heVar7, "it");
                return he.k(heVar7, null, null, null, null, null, (String) this.f22591a, null, 0, null, DisplayStrings.DS_CUSTOM_PROMPT_EXIT_RIGHT);
            case 18:
                return com.waze.settings.a.a.b.f.f((com.waze.settings.a.a.b.f) this.f22591a, (com.waze.ui.g.f) obj);
            case 19:
                List list = (List) obj;
                h.g.b.x.c(list);
                ((com.waze.settings.tree.d.d) this.f22591a).e(list);
                return h.ab.f48028a;
            default:
                Boolean bool = (Boolean) obj;
                h.g.b.x.c(bool);
                ((WazeSettingsView) this.f22591a).D(bool.booleanValue());
                return h.ab.f48028a;
        }
    }
}
