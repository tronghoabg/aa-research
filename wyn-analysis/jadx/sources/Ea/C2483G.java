package ea;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import j9.C3094d;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import n7.AbstractC3598c;

/* renamed from: ea.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2483G {

    /* renamed from: a, reason: collision with root package name */
    public static final C2483G f34460a = new C2483G();

    /* renamed from: b, reason: collision with root package name */
    public static final ad.L f34461b;

    static {
        C3094d c3094d = new C3094d();
        c3094d.registerEncoder(C2482F.class, C2492g.f34540a);
        c3094d.registerEncoder(N.class, C2493h.f34544a);
        c3094d.registerEncoder(C2495j.class, C2490e.f34531a);
        c3094d.registerEncoder(C2487b.class, C2489d.f34524a);
        c3094d.registerEncoder(C2486a.class, C2488c.f34517a);
        c3094d.registerEncoder(C2504t.class, C2491f.f34535a);
        c3094d.f38685d = true;
        f34461b = new ad.L(c3094d, 11);
    }

    public static C2487b a(s8.g gVar) {
        Object next;
        String strF;
        gVar.a();
        Context context = gVar.f45328a;
        AbstractC3340k.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.f45330c.f45344b;
        AbstractC3340k.d(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        AbstractC3340k.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC3340k.d(RELEASE, "RELEASE");
        AbstractC3340k.d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC3340k.d(MANUFACTURER, "MANUFACTURER");
        gVar.a();
        int iMyPid = Process.myPid();
        Iterator it = A6.h.y(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C2504t) next).f34581b == iMyPid) {
                break;
            }
        }
        C2504t c2504t = (C2504t) next;
        if (c2504t == null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 33) {
                strF = Process.myProcessName();
                AbstractC3340k.d(strF, "myProcessName()");
            } else if ((i5 < 28 || (strF = Application.getProcessName()) == null) && (strF = AbstractC3598c.f()) == null) {
                strF = "";
            }
            c2504t = new C2504t(strF, iMyPid, 0, false);
        }
        gVar.a();
        return new C2487b(str, new C2486a(packageName, str2, strValueOf, c2504t, A6.h.y(context)));
    }
}
