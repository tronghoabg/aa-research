package com.waze.settings.d;

import com.waze.R;
import com.waze.settings.SettingsNativeManager;
import com.waze.settings.ds;
import com.waze.settings.tree.c.h;
import h.a.i;
import h.g;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f37010a;

    /* renamed from: b, reason: collision with root package name */
    private final ds f37011b;

    /* renamed from: c, reason: collision with root package name */
    private final SettingsNativeManager f37012c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f37013d;

    public f(com.waze.shared_infra.o.a aVar, ds dsVar, SettingsNativeManager settingsNativeManager) {
        x.f(aVar, "stringProvider");
        x.f(dsVar, "settingsRepository");
        x.f(settingsNativeManager, "settingsNativeManager");
        this.f37010a = aVar;
        this.f37011b = dsVar;
        this.f37012c = settingsNativeManager;
        this.f37013d = g.a(new a(this, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final com.waze.settings.d.c d(com.waze.settings.d.f r10) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.settings.d.f.d(com.waze.settings.d.f):com.waze.settings.d.c");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c h() {
        return (c) this.f37013d.getValue();
    }

    public final int a() {
        b bVarA = h().a();
        return bVarA != null ? bVarA.b() : R.drawable.setting_icon_gas_regular;
    }

    public final h e() {
        return new e(this);
    }

    public final String f() {
        b bVarA = h().a();
        if (bVarA != null) {
            return bVarA.c().t();
        }
        return null;
    }

    public final List g() {
        List listB = h().b();
        ArrayList arrayList = new ArrayList(i.q(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).c());
        }
        return arrayList;
    }
}
