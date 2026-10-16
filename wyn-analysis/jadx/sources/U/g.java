package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.C1489b;
import b.InterfaceC1491d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1491d f46069a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f46070b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f46071c;

    public g(InterfaceC1491d interfaceC1491d, ComponentName componentName, Context context) {
        this.f46069a = interfaceC1491d;
        this.f46070b = componentName;
        this.f46071c = context;
    }

    public static boolean a(Context context, String str, m mVar) {
        mVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, mVar, 33);
    }

    public static String b(Context context, List list, boolean z2) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z2 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final n c(AbstractC4159a abstractC4159a) {
        f fVar = new f(abstractC4159a);
        InterfaceC1491d interfaceC1491d = this.f46069a;
        try {
            if (((C1489b) interfaceC1491d).S(fVar)) {
                return new n(interfaceC1491d, fVar, this.f46070b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
