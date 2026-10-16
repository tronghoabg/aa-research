package androidx.window.core;

import android.content.ComponentName;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ActivityComponentInfo {
    private final String className;
    private final String packageName;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityComponentInfo(ComponentName componentName) {
        x.f(componentName, "componentName");
        String packageName = componentName.getPackageName();
        x.e(packageName, "getPackageName(...)");
        String className = componentName.getClassName();
        x.e(className, "getClassName(...)");
        this(packageName, className);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.window.core.ActivityComponentInfo");
        ActivityComponentInfo activityComponentInfo = (ActivityComponentInfo) obj;
        return x.n(this.packageName, activityComponentInfo.packageName) && x.n(this.className, activityComponentInfo.className);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.packageName.hashCode() * 31) + this.className.hashCode();
    }

    public String toString() {
        return "ClassInfo { packageName: " + this.packageName + ", className: " + this.className + " }";
    }

    public ActivityComponentInfo(String str, String str2) {
        x.f(str, "packageName");
        x.f(str2, "className");
        this.packageName = str;
        this.className = str2;
    }
}
