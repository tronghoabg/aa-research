package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ActivityComponentInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SplitPairFilter {
    private final ActivityComponentInfo _primaryActivityName;
    private final ActivityComponentInfo _secondaryActivityName;
    private final String secondaryActivityIntentAction;

    public SplitPairFilter(ActivityComponentInfo activityComponentInfo, ActivityComponentInfo activityComponentInfo2, String str) {
        x.f(activityComponentInfo, "_primaryActivityName");
        x.f(activityComponentInfo2, "_secondaryActivityName");
        this._primaryActivityName = activityComponentInfo;
        this._secondaryActivityName = activityComponentInfo2;
        this.secondaryActivityIntentAction = str;
        MatcherUtils.INSTANCE.validateComponentName$window(activityComponentInfo.getPackageName(), activityComponentInfo.getClassName());
        MatcherUtils.INSTANCE.validateComponentName$window(activityComponentInfo2.getPackageName(), activityComponentInfo2.getClassName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.window.embedding.SplitPairFilter");
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return x.n(this._primaryActivityName, splitPairFilter._primaryActivityName) && x.n(this._secondaryActivityName, splitPairFilter._secondaryActivityName) && x.n(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        ActivityComponentInfo activityComponentInfo = this._primaryActivityName;
        return new ComponentName(activityComponentInfo.getPackageName(), activityComponentInfo.getClassName());
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        ActivityComponentInfo activityComponentInfo = this._secondaryActivityName;
        return new ComponentName(activityComponentInfo.getPackageName(), activityComponentInfo.getClassName());
    }

    public int hashCode() {
        int iHashCode = (this._primaryActivityName.hashCode() * 31) + this._secondaryActivityName.hashCode();
        String str = this.secondaryActivityIntentAction;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean matchesActivityIntentPair(Activity activity, Intent intent) {
        x.f(activity, "primaryActivity");
        x.f(intent, "secondaryActivityIntent");
        if (!MatcherUtils.INSTANCE.isActivityMatching$window(activity, this._primaryActivityName)) {
            return false;
        }
        if (!MatcherUtils.INSTANCE.isIntentMatching$window(intent, this._secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || x.n(str, intent.getAction());
    }

    public final boolean matchesActivityPair(Activity activity, Activity activity2) {
        x.f(activity, "primaryActivity");
        x.f(activity2, "secondaryActivity");
        if (!MatcherUtils.INSTANCE.isActivityMatching$window(activity, this._primaryActivityName)) {
            return false;
        }
        if (!MatcherUtils.INSTANCE.isActivityMatching$window(activity2, this._secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        if (str == null) {
            return true;
        }
        Intent intent = activity2.getIntent();
        return x.n(str, intent != null ? intent.getAction() : null);
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + getPrimaryActivityName() + ", secondaryActivityName=" + getSecondaryActivityName() + ", secondaryActivityAction=" + this.secondaryActivityIntentAction + "}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitPairFilter(ComponentName componentName, ComponentName componentName2, String str) {
        this(new ActivityComponentInfo(componentName), new ActivityComponentInfo(componentName2), str);
        x.f(componentName, "primaryActivityName");
        x.f(componentName2, "secondaryActivityName");
    }
}
