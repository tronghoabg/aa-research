package androidx.window.embedding;

import android.app.Activity;
import androidx.window.WindowSdkExtensions;
import androidx.window.extensions.embedding.ActivityStack;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ActivityStack {
    private final List<Activity> activitiesInProcess;
    private final boolean isEmpty;
    private final ActivityStack.Token token;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> list, boolean z, ActivityStack.Token token) {
        x.f(list, "activitiesInProcess");
        this.activitiesInProcess = list;
        this.isEmpty = z;
        this.token = token;
    }

    public final boolean contains(Activity activity) {
        x.f(activity, "activity");
        return this.activitiesInProcess.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return x.n(this.activitiesInProcess, activityStack.activitiesInProcess) && this.isEmpty == activityStack.isEmpty && x.n(this.token, activityStack.token);
    }

    public final List<Activity> getActivitiesInProcess$window() {
        return this.activitiesInProcess;
    }

    public final ActivityStack.Token getToken$window() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(5);
        ActivityStack.Token token = this.token;
        x.c(token);
        return token;
    }

    public int hashCode() {
        int iHashCode = this.activitiesInProcess.hashCode() * 31;
        ActivityStack.Token token = this.token;
        return ((iHashCode + ActivityStack$$ExternalSyntheticBackport0.m(this.isEmpty)) * 31) + (token != null ? token.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        return "ActivityStack{activitiesInProcess=" + this.activitiesInProcess + ", isEmpty=" + this.isEmpty + ", token=" + this.token + "}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityStack(List<? extends Activity> list, boolean z) {
        this(list, z, null);
        x.f(list, "activitiesInProcess");
    }
}
