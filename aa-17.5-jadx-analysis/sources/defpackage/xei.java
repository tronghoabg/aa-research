package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class xei extends jrh {
    public static final yph a = yph.c("GH.AllCarAppsActivity");
    private PagedListView b;

    @Override // defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void I() {
        super.I();
        this.b.l(0);
    }

    @Override // defpackage.jrh, defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) {
        String str;
        super.a(bundle);
        v(R.layout.overflow_main);
        B(R.id.container).setBackgroundColor(getResources().getColor(R.color.lens_scrim));
        PagedListView pagedListView = (PagedListView) B(R.id.list_view);
        this.b = pagedListView;
        pagedListView.r = -1;
        pagedListView.ft();
        this.b.k();
        this.b.n(2);
        xeh xehVar = new xeh(this);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        PackageManager packageManager = getPackageManager();
        arrayList.clear();
        hashSet.clear();
        adkf adkfVar = new adkf();
        adkfVar.c = "com.google.android.gms";
        try {
            str = packageManager.getPackageInfo("com.google.android.gms", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        adkfVar.a = getString(R.string.all_car_apps_version_label, str);
        try {
            adkfVar.d = packageManager.getApplicationIcon("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        arrayList.add(adkfVar);
        for (ResolveInfo resolveInfo : mjv.b().b(kio.b().e(), new Intent("android.intent.action.MAIN"), rji.a)) {
            if (mon.f(resolveInfo)) {
                mon monVar = new mon(this, resolveInfo);
                String strC = monVar.c();
                ComponentName componentName = monVar.a;
                if (!hashSet.contains(strC) && !mkn.a.equals(componentName) && !mkn.q.equals(componentName)) {
                    String packageName = componentName.getPackageName();
                    if (!qtr.a.contains(packageName) || packageName.equals("com.google.android.projection.gearhead")) {
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
                        intent.setComponent(componentName);
                        adkf adkfVar2 = new adkf();
                        adkfVar2.b = intent;
                        adkfVar2.c = monVar.c();
                        adkfVar2.a = monVar.d();
                        adkfVar2.d = monVar.b();
                        arrayList.add(adkfVar2);
                        hashSet.add(adkfVar2.c);
                    }
                }
            }
        }
        xehVar.a = arrayList;
        xehVar.g();
        this.b.c(xehVar);
    }
}
