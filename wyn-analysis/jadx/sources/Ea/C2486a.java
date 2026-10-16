package ea;

import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ea.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2486a {

    /* renamed from: a, reason: collision with root package name */
    public final String f34510a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34511b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34512c;

    /* renamed from: d, reason: collision with root package name */
    public final C2504t f34513d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f34514e;

    public C2486a(String str, String versionName, String appBuildVersion, C2504t c2504t, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        AbstractC3340k.e(versionName, "versionName");
        AbstractC3340k.e(appBuildVersion, "appBuildVersion");
        AbstractC3340k.e(deviceManufacturer, "deviceManufacturer");
        this.f34510a = str;
        this.f34511b = versionName;
        this.f34512c = appBuildVersion;
        this.f34513d = c2504t;
        this.f34514e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2486a)) {
            return false;
        }
        C2486a c2486a = (C2486a) obj;
        if (!this.f34510a.equals(c2486a.f34510a) || !AbstractC3340k.a(this.f34511b, c2486a.f34511b) || !AbstractC3340k.a(this.f34512c, c2486a.f34512c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return AbstractC3340k.a(str, str) && this.f34513d.equals(c2486a.f34513d) && this.f34514e.equals(c2486a.f34514e);
    }

    public final int hashCode() {
        return this.f34514e.hashCode() + ((this.f34513d.hashCode() + N0.a.c(N0.a.c(N0.a.c(this.f34510a.hashCode() * 31, 31, this.f34511b), 31, this.f34512c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f34510a + ", versionName=" + this.f34511b + ", appBuildVersion=" + this.f34512c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f34513d + ", appProcessDetails=" + this.f34514e + ')';
    }
}
