package U8;

import android.os.Build;

/* renamed from: U8.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0887p0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12664a;

    public C0887p0(boolean z2) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f12664a = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0887p0)) {
            return false;
        }
        C0887p0 c0887p0 = (C0887p0) obj;
        c0887p0.getClass();
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.f12664a == c0887p0.f12664a;
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.f12664a ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f12664a + "}";
    }
}
