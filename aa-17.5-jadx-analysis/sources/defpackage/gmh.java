package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class gmh implements gdv {
    private static final String[] d = {"androidx.car.app.category.NAVIGATION", "androidx.car.app.category.POI", "androidx.car.app.category.SETTINGS", "androidx.car.app.category.CHARGING", "androidx.car.app.category.MESSAGING", "androidx.car.app.category.CALLING", "androidx.car.app.category.WEATHER", "androidx.car.app.category.MEDIA"};
    public final ComponentName a;
    public final boolean b;
    public final yfq c;
    private final Context e;
    private boolean f;
    private jvb g;

    public gmh(Context context, ComponentName componentName, boolean z) {
        this.e = context;
        this.a = componentName;
        this.b = z;
        HashMap map = new HashMap();
        PackageManager packageManager = context.getPackageManager();
        String[] strArr = d;
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            Intent intent = new Intent("androidx.car.app.CarAppService");
            intent.setPackage(this.a.getPackageName());
            intent.addCategory(str);
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                if (str.equals("androidx.car.app.category.CHARGING") || str.equals("androidx.car.app.category.PARKING")) {
                    map.put("androidx.car.app.category.POI", "androidx.car.app.category.POI");
                } else {
                    map.put(str, str);
                }
            }
        }
        this.c = yfq.o(map.values());
    }

    private final int h() throws PackageManager.NameNotFoundException {
        ServiceInfo serviceInfo;
        if (!f()) {
            return 0;
        }
        Context context = this.e;
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(this.a, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        int i = (serviceInfo == null || serviceInfo.metaData == null) ? 0 : serviceInfo.metaData.getInt("androidx.car.app.TintableAttributionIcon", 0);
        if (i != 0) {
            return i;
        }
        try {
            applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return 0;
        }
        return applicationInfo.metaData.getInt("androidx.car.app.TintableAttributionIcon", 0);
    }

    @Override // defpackage.gdv
    public final Drawable a() {
        int iH;
        if (Build.VERSION.SDK_INT < 29 || (iH = h()) == 0) {
            return null;
        }
        Context context = this.e;
        String packageName = this.a.getPackageName();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateHeaderButtonIconSize});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return GhIcon.r(packageName, iH).f(context, dimensionPixelSize);
    }

    @Override // defpackage.gdv
    public final Drawable b() throws PackageManager.NameNotFoundException, FileNotFoundException {
        int[] iArr = {R.attr.templateHeaderButtonIconSize};
        Context context = this.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawableF = GhIcon.j(this.a).f(context, dimensionPixelSize);
        drawableF.getClass();
        return drawableF;
    }

    @Override // defpackage.gdv
    public final yfq c() {
        return yfq.o(this.c);
    }

    @Override // defpackage.gdv
    public final boolean d() {
        return Build.VERSION.SDK_INT >= 29 && h() != 0;
    }

    @Override // defpackage.gdv
    public final boolean e() {
        return this.a.getPackageName().equals("com.google.android.projection.gearhead");
    }

    @Override // defpackage.gdv
    public final boolean f() {
        return this.c.contains("androidx.car.app.category.MEDIA");
    }

    @Override // defpackage.gdv
    public final jvb g() {
        if (!this.f) {
            this.g = gbt.n(this.e, this.a);
            this.f = true;
        }
        jvb jvbVar = this.g;
        jvbVar.getClass();
        return jvbVar;
    }

    public final String toString() {
        return "[" + this.a.flattenToShortString() + ", isNav: " + this.b + "]";
    }
}
