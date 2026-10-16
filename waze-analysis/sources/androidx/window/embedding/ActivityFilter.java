package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.window.core.ActivityComponentInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ActivityFilter {
    private final ActivityComponentInfo activityComponentInfo;
    private final String intentAction;

    public ActivityFilter(ActivityComponentInfo activityComponentInfo, String str) {
        x.f(activityComponentInfo, "activityComponentInfo");
        this.activityComponentInfo = activityComponentInfo;
        this.intentAction = str;
        MatcherUtils.INSTANCE.validateComponentName$window(activityComponentInfo.getPackageName(), activityComponentInfo.getClassName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        return x.n(this.activityComponentInfo, activityFilter.activityComponentInfo) && x.n(this.intentAction, activityFilter.intentAction);
    }

    public final ActivityComponentInfo getActivityComponentInfo$window() {
        return this.activityComponentInfo;
    }

    public final ComponentName getComponentName() {
        ActivityComponentInfo activityComponentInfo = this.activityComponentInfo;
        return new ComponentName(activityComponentInfo.getPackageName(), activityComponentInfo.getClassName());
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int iHashCode = this.activityComponentInfo.hashCode() * 31;
        String str = this.intentAction;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean matchesActivity(Activity activity) {
        x.f(activity, "activity");
        if (!MatcherUtils.INSTANCE.isActivityMatching$window(activity, this.activityComponentInfo)) {
            return false;
        }
        String str = this.intentAction;
        if (str != null) {
            Intent intent = activity.getIntent();
            if (!x.n(str, intent != null ? intent.getAction() : null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean matchesIntent(Intent intent) {
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        if (!MatcherUtils.INSTANCE.isIntentMatching$window(intent, this.activityComponentInfo)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || x.n(str, intent.getAction());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.activityComponentInfo + ", intentAction=" + this.intentAction + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityFilter(ComponentName componentName, String str) {
        this(new ActivityComponentInfo(componentName), str);
        x.f(componentName, "componentName");
    }
}
