package com.waze.sound.a;

import com.waze.copilot.data.ag;
import com.waze.copilot.data.ah;
import com.waze.settings.SettingsNativeManager;
import com.waze.sound.jq;
import com.waze.system.SystemNativeManager;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    private final jq f39394a;

    /* renamed from: b, reason: collision with root package name */
    private final SettingsNativeManager f39395b;

    /* renamed from: c, reason: collision with root package name */
    private final SystemNativeManager f39396c;

    /* renamed from: d, reason: collision with root package name */
    private List f39397d;

    public j(jq jqVar, SettingsNativeManager settingsNativeManager, SystemNativeManager systemNativeManager) {
        x.f(jqVar, "voiceListDataSource");
        x.f(settingsNativeManager, "settingsNativeManager");
        x.f(systemNativeManager, "systemNativeManager");
        this.f39394a = jqVar;
        this.f39395b = settingsNativeManager;
        this.f39396c = systemNativeManager;
        this.f39397d = h.a.i.h();
    }

    @Override // com.waze.sound.a.h
    public final ag a() {
        Object next;
        List list = this.f39397d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ag) obj).d() == ah.f22966b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        SystemNativeManager systemNativeManager = this.f39396c;
        String systemLocale = systemNativeManager.getSystemLocale();
        String systemLanguage = systemNativeManager.getSystemLanguage();
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ag agVar = (ag) next;
            if (x.n(agVar.h(), systemLocale) || x.n(agVar.g(), systemLanguage)) {
                break;
            }
        }
        ag agVar2 = (ag) next;
        return agVar2 == null ? (ag) h.a.i.R(arrayList2) : agVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.waze.sound.a.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.a.j.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.sound.a.h
    public final List c() {
        return h.a.i.ao(this.f39397d);
    }
}
