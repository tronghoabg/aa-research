package androidx.navigation.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavContext {
    private final Context context;

    public NavContext(Context context) {
        this.context = context;
    }

    public final Object getApplication() {
        Context context = this.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getResourceName(int i2) throws Resources.NotFoundException {
        try {
            Context context = this.context;
            x.c(context);
            String resourceName = context.getResources().getResourceName(i2);
            x.c(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i2);
        }
    }
}
