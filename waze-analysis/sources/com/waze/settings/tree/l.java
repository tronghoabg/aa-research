package com.waze.settings.tree;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.jni.protos.settings.SettingsValueListProto;
import com.waze.jni.protos.settings.SettingsValueProto;
import com.waze.network.f.ak;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.cr;
import com.waze.settings.de;
import com.waze.settings.gw;
import com.waze.settings.tree.views.WazeSettingsView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends com.waze.settings.tree.d.d implements com.waze.settings.tree.c.h {

    /* renamed from: a, reason: collision with root package name */
    private final SettingsNativeManager f37575a;

    /* renamed from: b, reason: collision with root package name */
    private String f37576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SettingsNativeManager settingsNativeManager, com.waze.ui.ac.n nVar) {
        super("language", "LANGUAGE_SETTINGS", nVar, null, null, null, 56);
        h.g.b.x.f(settingsNativeManager, "settingsNativeManager");
        h.g.b.x.f("language", TtmlNode.ATTR_ID);
        h.g.b.x.f("LANGUAGE_SETTINGS", "analytic");
        this.f37575a = settingsNativeManager;
        this.f37576b = "";
        J(this);
        B(h.a.i.d(new k(this, com.waze.ui.ad.b.d("LOADING"))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(List list) {
        List<gw> list2 = list;
        for (gw gwVar : list2) {
            if (gwVar.f37348a) {
                String str = gwVar.f37349b;
                h.g.b.x.e(str, "value");
                this.f37576b = str;
            }
        }
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        for (gw gwVar2 : list2) {
            String str2 = gwVar2.f37349b;
            h.g.b.x.e(str2, "value");
            com.waze.settings.tree.d.g gVar = new com.waze.settings.tree.d.g(str2, com.waze.ui.ad.b.d(gwVar2.f37350c), null, null, null, null, 60);
            gVar.f(gwVar2.f37348a);
            arrayList.add(gVar);
        }
        B(arrayList);
    }

    static final h.ab g(l lVar, WazeSettingsView wazeSettingsView, SettingsValueListProto settingsValueListProto) {
        ArrayList arrayListH;
        List<SettingsValueProto> valuesList;
        if (settingsValueListProto == null || (valuesList = settingsValueListProto.getValuesList()) == null) {
            arrayListH = h.a.i.h();
        } else {
            List<SettingsValueProto> list = valuesList;
            ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
            for (SettingsValueProto settingsValueProto : list) {
                h.g.b.x.c(settingsValueProto);
                arrayList.add(ak.o(settingsValueProto));
            }
            arrayListH = arrayList;
        }
        lVar.L(arrayListH);
        String strB = lVar.E().b();
        if (strB == null) {
            strB = "";
        }
        wazeSettingsView.P(lVar.G(strB));
        wazeSettingsView.m();
        return h.ab.f48028a;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        final WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        if (i().size() != 1) {
            return wazeSettingsView;
        }
        wazeSettingsView.G();
        this.f37575a.getLanguages(new h.g.a.l() { // from class: com.waze.settings.tree.j
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return l.g(this.f37571a, wazeSettingsView, (SettingsValueListProto) obj);
            }
        });
        return wazeSettingsView;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        return this.f37576b;
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        if (h.g.b.x.n(this.f37576b, str)) {
            return;
        }
        cr.setLanguage$default(this.f37575a, str, null, 2, null);
        h.g.b.x.c(str);
        this.f37576b = str;
    }
}
