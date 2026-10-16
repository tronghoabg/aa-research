package com.waze.share;

import android.content.pm.ResolveInfo;
import com.waze.NativeManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f37724a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f37725b;

    q(v vVar, List list) {
        this.f37724a = list;
        Objects.requireNonNull(vVar);
        this.f37725b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] recentShareAppsNTV = NativeManager.getInstance().getRecentShareAppsNTV();
        ArrayList arrayList = new ArrayList();
        for (String str : recentShareAppsNTV) {
            for (ResolveInfo resolveInfo : this.f37724a) {
                if (resolveInfo.loadLabel(this.f37725b.f37741f).toString().equals(str)) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        for (ResolveInfo resolveInfo2 : this.f37724a) {
            String str2 = resolveInfo2.activityInfo.packageName;
            if (!arrayList.contains(resolveInfo2) && this.f37725b.f37744i.contains(str2)) {
                arrayList.add(resolveInfo2);
            }
        }
        com.waze.t.l(new p(this, arrayList));
    }
}
