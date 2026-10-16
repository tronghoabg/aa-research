package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.util.DisplayMetrics;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rag extends Resources {
    public rag(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        if (rrd.e("CAR.INTERNAL", 4)) {
            rrd.d(4, "CAR.INTERNAL", null, "Creating InternalResources using assets: %s", resources.getAssets());
            rrd.d(4, "CAR.INTERNAL", null, "Creating InternalResources using display metrics: %s", resources.getDisplayMetrics());
            rrd.d(4, "CAR.INTERNAL", null, "Creating InternalResources using config: %s", resources.getConfiguration());
        }
    }

    @Override // android.content.res.Resources
    public final void addLoaders(ResourcesLoader... resourcesLoaderArr) {
        resourcesLoaderArr.getClass();
        if (rrd.e("CAR.INTERNAL", 4)) {
            rrd.c("CAR.INTERNAL", null, "addLoaders called");
        }
        super.addLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public final void removeLoaders(ResourcesLoader... resourcesLoaderArr) {
        resourcesLoaderArr.getClass();
        if (rrd.e("CAR.INTERNAL", 4)) {
            rrd.c("CAR.INTERNAL", null, "removeLoaders called");
        }
        super.removeLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        configuration.getClass();
        displayMetrics.getClass();
        if (rrd.e("CAR.INTERNAL", 4)) {
            rrd.d(4, "CAR.INTERNAL", null, "updateConfiguration existing config: %s, metrics: %s", getConfiguration(), getDisplayMetrics());
            rrd.d(4, "CAR.INTERNAL", null, "updateConfiguration called with config: %s, metrics: %s", configuration, displayMetrics);
        }
        super.updateConfiguration(configuration, displayMetrics);
    }
}
