package ea;

import android.os.Build;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ea.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2487b {

    /* renamed from: a, reason: collision with root package name */
    public final String f34515a;

    /* renamed from: b, reason: collision with root package name */
    public final C2486a f34516b;

    public C2487b(String appId, C2486a c2486a) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        AbstractC3340k.e(appId, "appId");
        AbstractC3340k.e(deviceModel, "deviceModel");
        AbstractC3340k.e(osVersion, "osVersion");
        this.f34515a = appId;
        this.f34516b = c2486a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2487b)) {
            return false;
        }
        C2487b c2487b = (C2487b) obj;
        if (!AbstractC3340k.a(this.f34515a, c2487b.f34515a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!AbstractC3340k.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return AbstractC3340k.a(str2, str2) && this.f34516b.equals(c2487b.f34516b);
    }

    public final int hashCode() {
        return this.f34516b.hashCode() + ((EnumC2503s.LOG_ENVIRONMENT_PROD.hashCode() + N0.a.c((((Build.MODEL.hashCode() + (this.f34515a.hashCode() * 31)) * 31) + 47594045) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f34515a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.0.7, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + EnumC2503s.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f34516b + ')';
    }
}
