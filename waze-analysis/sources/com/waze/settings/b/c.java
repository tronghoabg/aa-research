package com.waze.settings.b;

import com.waze.settings.SettingsNativeManager;
import com.waze.settings.bj;
import h.g.b.x;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements com.waze.shared_infra.f.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.e.a.e f36833a;

    /* renamed from: b, reason: collision with root package name */
    private final SettingsNativeManager f36834b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f36835c;

    public c(com.waze.settings.e.a.e eVar, SettingsNativeManager settingsNativeManager, h.g.a.l lVar) {
        x.f(eVar, "hncSettingsDataSource");
        x.f(settingsNativeManager, "settingsNativeManager");
        this.f36833a = eVar;
        this.f36834b = settingsNativeManager;
        this.f36835c = lVar;
    }

    private final void b(String str, boolean z) {
        h.g.a.l lVar = this.f36835c;
        if (lVar != null) {
            lVar.invoke(new bj(str));
        } else {
            com.waze.bs.a.f(str, "DEEP_LINK", z);
        }
    }

    @Override // com.waze.shared_infra.f.b
    public final boolean a(com.waze.shared_infra.f.a aVar) {
        x.f(aVar, "deeplink");
        String strA = aVar.a();
        if (strA == null) {
            return false;
        }
        Object obj = null;
        if (!x.n(strA, "open_settings")) {
            Iterator<E> it = a.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (x.n(((a) next).a(), strA)) {
                    obj = next;
                    break;
                }
            }
            a aVar2 = (a) obj;
            if (aVar2 == null) {
                return false;
            }
            b(aVar2.b(), false);
            return true;
        }
        String strB = aVar.b("page_id");
        Iterator<E> it2 = b.c().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (x.n(((b) next2).a(), strB)) {
                obj = next2;
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar == null) {
            com.waze.shared_infra.i.h.j("unknown settings page ".concat(String.valueOf(strB)));
        } else {
            if (bVar == b.f36826f && !this.f36833a.j()) {
                com.waze.shared_infra.i.h.j("Trying to open a hoy no circula page from a deeplink when feature is disabled. page name: ".concat(String.valueOf(strB)));
                return false;
            }
            if (bVar.ordinal() != 5 || !this.f36834b.openInCarSettingsPage(h.f36839a)) {
                b(bVar.b(), bVar.d());
            }
        }
        return true;
    }
}
