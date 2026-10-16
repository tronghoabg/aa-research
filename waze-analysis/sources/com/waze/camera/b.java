package com.waze.camera;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.waze.shared_infra.i.e;
import com.waze.sharedui.utils.j;
import com.waze.sharedui.utils.m;
import e.b.c;
import h.a.i;
import h.g.b.x;
import h.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f18799a;

    /* renamed from: b, reason: collision with root package name */
    private final e f18800b;

    public b(String str, e eVar) {
        x.f(str, "fileName");
        x.f(eVar, "logger");
        this.f18799a = str;
        this.f18800b = eVar;
    }

    private static final boolean d(File file) {
        Object objA;
        try {
            objA = Boolean.valueOf(file.exists() && file.length() > 0);
        } catch (Throwable th) {
            objA = c.a(th);
        }
        if (true == (objA instanceof l)) {
            objA = false;
        }
        return ((Boolean) objA).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    @Override // com.waze.camera.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap a(android.content.Context r18, int r19, android.content.Intent r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.camera.b.a(android.content.Context, int, android.content.Intent, int, int):android.graphics.Bitmap");
    }

    @Override // com.waze.camera.a
    public final m b(Context context) {
        Set setAu;
        x.f(context, "context");
        File file = new File(new File(context.getCacheDir(), "waze_camera_private_folder"), this.f18799a);
        String strConcat = "will request capturing an img into ".concat(String.valueOf(file.getAbsolutePath()));
        e eVar = this.f18800b;
        eVar.a(strConcat);
        if (d(file)) {
            eVar.a("noticed file already has a stored bitmap, will clear it before requesting camera to write into this file");
            try {
                b bVar = this;
                file.delete();
                file.createNewFile();
            } catch (Throwable th) {
                c.a(th);
            }
        }
        int i2 = WazeCameraIntentsFileProvider.f18798a;
        Uri uriForFile = FileProvider.getUriForFile(context, com.waze.car_lib.b.a(context), file);
        e eVar2 = this.f18800b;
        Objects.toString(uriForFile);
        eVar2.a("will use URI: ".concat(String.valueOf(uriForFile)));
        x.c(uriForFile);
        j jVar = new j(uriForFile);
        jVar.p();
        PackageManager packageManager = context.getPackageManager();
        x.e(packageManager, "getPackageManager(...)");
        j jVar2 = jVar;
        Intent intentO = jVar2.o(null);
        if (Build.VERSION.SDK_INT >= 33) {
            List listQueryIntentActivities = packageManager.queryIntentActivities(intentO, PackageManager.ResolveInfoFlags.of(131072L));
            x.e(listQueryIntentActivities, "queryIntentActivities(...)");
            ArrayList arrayList = new ArrayList();
            Iterator it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                String str = ((ResolveInfo) it.next()).activityInfo.packageName;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            setAu = i.au(arrayList);
        } else {
            List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intentO, 0);
            x.e(listQueryIntentActivities2, "queryIntentActivities(...)");
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = listQueryIntentActivities2.iterator();
            while (it2.hasNext()) {
                String str2 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            setAu = i.au(arrayList2);
        }
        if (setAu.isEmpty()) {
            eVar2.b("Could not locate any packages supporting intent with action ".concat(String.valueOf(intentO.getAction())));
        }
        Iterator it3 = setAu.iterator();
        while (it3.hasNext()) {
            context.grantUriPermission((String) it3.next(), uriForFile, 3);
        }
        return jVar2;
    }

    @Override // com.waze.camera.a
    public final File c(Context context) {
        x.f(context, "context");
        File file = new File(new File(context.getCacheDir(), "waze_camera_private_folder"), this.f18799a);
        try {
            b bVar = this;
            file.createNewFile();
            return file;
        } catch (Throwable th) {
            c.a(th);
            return file;
        }
    }
}
