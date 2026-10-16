package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.navigation.ActivityNavigator;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.Map;

/* compiled from: WazeSource */
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder<ActivityNavigator.Destination> {
    private String action;
    private c<? extends Activity> activityClass;
    private Context context;
    private Uri data;
    private String dataPattern;
    private String targetPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator activityNavigator, c<? extends Object> cVar, Map<s, NavType<?>> map) {
        super(activityNavigator, cVar, map);
        x.f(activityNavigator, "navigator");
        x.f(cVar, "route");
        x.f(map, "typeMap");
        this.context = activityNavigator.getContext();
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public ActivityNavigator.Destination build() {
        ActivityNavigator.Destination destination = (ActivityNavigator.Destination) super.build();
        destination.setTargetPackage(this.targetPackage);
        c<? extends Activity> cVar = this.activityClass;
        if (cVar != null) {
            destination.setComponentName(new ComponentName(this.context, (Class<?>) o.w(cVar)));
        }
        destination.setAction(this.action);
        destination.setData(this.data);
        destination.setDataPattern(this.dataPattern);
        return destination;
    }

    public final String getAction() {
        return this.action;
    }

    public final c<? extends Activity> getActivityClass() {
        return this.activityClass;
    }

    public final Uri getData() {
        return this.data;
    }

    public final String getDataPattern() {
        return this.dataPattern;
    }

    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setActivityClass(c<? extends Activity> cVar) {
        this.activityClass = cVar;
    }

    public final void setData(Uri uri) {
        this.data = uri;
    }

    public final void setDataPattern(String str) {
        this.dataPattern = str;
    }

    public final void setTargetPackage(String str) {
        this.targetPackage = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator activityNavigator, String str) {
        super(activityNavigator, str);
        x.f(activityNavigator, "navigator");
        x.f(str, "route");
        this.context = activityNavigator.getContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavigatorDestinationBuilder(ActivityNavigator activityNavigator, int i2) {
        super(activityNavigator, i2);
        x.f(activityNavigator, "navigator");
        this.context = activityNavigator.getContext();
    }
}
