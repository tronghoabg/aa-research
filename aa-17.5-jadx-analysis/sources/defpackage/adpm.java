package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.UserHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class adpm implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adpm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws adnr {
        if (this.b != 0) {
            int i = wdx.a;
            return ((Context) this.a).getExternalCacheDirs();
        }
        int i2 = Build.VERSION.SDK_INT >= 29 ? 268435456 : 0;
        adpq adpqVar = (adpq) this.a;
        Intent intent = adpqVar.c;
        List<ResolveInfo> listQueryIntentServices = adpqVar.e.getPackageManager().queryIntentServices(intent, i2);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            throw new adnr(adnq.k.e("Service not found for intent ".concat(String.valueOf(String.valueOf(intent)))));
        }
        Intent intent2 = new Intent();
        intent2.setAction(intent.getAction());
        intent2.setData(intent.getData());
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            Iterator<String> it = categories.iterator();
            while (it.hasNext()) {
                intent2.addCategory(it.next());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentServices) {
            intent2.setComponent(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
            Intent intentCloneFilter = intent2.cloneFilter();
            UserHandle userHandle = adpqVar.d;
            woy.aa(intentCloneFilter != null, "Required property 'bindIntent' unset");
            arrayList.add(new adjv(new adod(intentCloneFilter, userHandle), adpq.b));
        }
        List list = Collections.EMPTY_LIST;
        return new admp(new adns(null, arrayList), adis.a, adpqVar.h.a(ylx.a));
    }
}
