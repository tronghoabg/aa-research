package androidx.window.embedding;

import android.app.Activity;
import android.os.IBinder;
import androidx.window.WindowSdkExtensions;
import androidx.window.extensions.embedding.SplitInfo;
import h.g.b.x;
import h.k.j;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SplitInfo {
    private final IBinder binder;
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final SplitAttributes splitAttributes;
    private final SplitInfo.Token token;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitInfo(ActivityStack activityStack, ActivityStack activityStack2, SplitAttributes splitAttributes, IBinder iBinder) {
        this(activityStack, activityStack2, splitAttributes, iBinder, null);
        x.f(activityStack, "primaryActivityStack");
        x.f(activityStack2, "secondaryActivityStack");
        x.f(splitAttributes, "splitAttributes");
        x.f(iBinder, "binder");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(new j(3, 4));
    }

    private static /* synthetic */ void getBinder$annotations() {
    }

    public final boolean contains(Activity activity) {
        x.f(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        return x.n(this.primaryActivityStack, splitInfo.primaryActivityStack) && x.n(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && x.n(this.splitAttributes, splitInfo.splitAttributes) && x.n(this.token, splitInfo.token) && x.n(this.binder, splitInfo.binder);
    }

    public final IBinder getBinder$window() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(new j(3, 4));
        IBinder iBinder = this.binder;
        if (iBinder != null) {
            return iBinder;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final SplitAttributes getSplitAttributes() {
        return this.splitAttributes;
    }

    public final SplitInfo.Token getToken$window() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(5);
        SplitInfo.Token token = this.token;
        if (token != null) {
            return token;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public int hashCode() {
        int iHashCode = (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + this.splitAttributes.hashCode();
        SplitInfo.Token token = this.token;
        int iHashCode2 = ((iHashCode * 31) + (token != null ? token.hashCode() : 0)) * 31;
        IBinder iBinder = this.binder;
        return iHashCode2 + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.primaryActivityStack + ", ");
        sb.append("secondaryActivityStack=" + this.secondaryActivityStack + ", ");
        sb.append("splitAttributes=" + this.splitAttributes + ", ");
        SplitInfo.Token token = this.token;
        if (token != null) {
            Objects.toString(token);
            sb.append("token=".concat(token.toString()));
        }
        IBinder iBinder = this.binder;
        if (iBinder != null) {
            Objects.toString(iBinder);
            sb.append("binder=".concat(iBinder.toString()));
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitInfo(ActivityStack activityStack, ActivityStack activityStack2, SplitAttributes splitAttributes) {
        this(activityStack, activityStack2, splitAttributes, null, null);
        x.f(activityStack, "primaryActivityStack");
        x.f(activityStack2, "secondaryActivityStack");
        x.f(splitAttributes, "splitAttributes");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitInfo(ActivityStack activityStack, ActivityStack activityStack2, SplitAttributes splitAttributes, SplitInfo.Token token) {
        this(activityStack, activityStack2, splitAttributes, null, token);
        x.f(activityStack, "primaryActivityStack");
        x.f(activityStack2, "secondaryActivityStack");
        x.f(splitAttributes, "splitAttributes");
        x.f(token, "token");
    }

    private SplitInfo(ActivityStack activityStack, ActivityStack activityStack2, SplitAttributes splitAttributes, IBinder iBinder, SplitInfo.Token token) {
        this.primaryActivityStack = activityStack;
        this.secondaryActivityStack = activityStack2;
        this.splitAttributes = splitAttributes;
        this.binder = iBinder;
        this.token = token;
    }
}
