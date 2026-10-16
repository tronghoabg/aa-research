package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.webkit.ProxyConfig;
import androidx.window.core.ActivityComponentInfo;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MatcherUtils {
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(String str, String str2) {
        String str3 = str2;
        if (!o.F(str3, ProxyConfig.MATCH_ALL_SCHEMES, false)) {
            return false;
        }
        if (x.n(str2, ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        if (o.X(str3, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6) != o.am(str3, ProxyConfig.MATCH_ALL_SCHEMES) || !o.l(str2, ProxyConfig.MATCH_ALL_SCHEMES, false)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        x.e(strSubstring, "substring(...)");
        return o.ah(str, strSubstring);
    }

    public final boolean areComponentsMatching$window(ActivityComponentInfo activityComponentInfo, ActivityComponentInfo activityComponentInfo2) {
        x.f(activityComponentInfo2, "ruleComponent");
        if (activityComponentInfo == null) {
            return x.n(activityComponentInfo2.getPackageName(), ProxyConfig.MATCH_ALL_SCHEMES) && x.n(activityComponentInfo2.getClassName(), ProxyConfig.MATCH_ALL_SCHEMES);
        }
        if (o.F(activityComponentInfo.toString(), ProxyConfig.MATCH_ALL_SCHEMES, false)) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.");
        }
        return (x.n(activityComponentInfo.getPackageName(), activityComponentInfo2.getPackageName()) || wildcardMatch(activityComponentInfo.getPackageName(), activityComponentInfo2.getPackageName())) && (x.n(activityComponentInfo.getClassName(), activityComponentInfo2.getClassName()) || wildcardMatch(activityComponentInfo.getClassName(), activityComponentInfo2.getClassName()));
    }

    public final boolean isActivityMatching$window(Activity activity, ActivityComponentInfo activityComponentInfo) {
        x.f(activity, "activity");
        x.f(activityComponentInfo, "ruleComponent");
        ComponentName componentName = activity.getComponentName();
        x.e(componentName, "getComponentName(...)");
        if (areComponentsMatching$window(new ActivityComponentInfo(componentName), activityComponentInfo)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            return INSTANCE.isIntentMatching$window(intent, activityComponentInfo);
        }
        return false;
    }

    public final boolean isIntentMatching$window(Intent intent, ActivityComponentInfo activityComponentInfo) {
        String str;
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        x.f(activityComponentInfo, "ruleComponent");
        ComponentName component = intent.getComponent();
        if (areComponentsMatching$window(component != null ? new ActivityComponentInfo(component) : null, activityComponentInfo)) {
            return true;
        }
        if (intent.getComponent() == null && (str = intent.getPackage()) != null) {
            return (x.n(str, activityComponentInfo.getPackageName()) || wildcardMatch(str, activityComponentInfo.getPackageName())) && x.n(activityComponentInfo.getClassName(), ProxyConfig.MATCH_ALL_SCHEMES);
        }
        return false;
    }

    public final void validateComponentName$window(String str, String str2) {
        x.f(str, "packageName");
        x.f(str2, "className");
        String str3 = str;
        if (str3.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        String str4 = str2;
        if (str4.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty");
        }
        if (o.F(str3, ProxyConfig.MATCH_ALL_SCHEMES, false) && o.X(str3, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6) != str.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (o.F(str4, ProxyConfig.MATCH_ALL_SCHEMES, false) && o.X(str4, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6) != str2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }
}
