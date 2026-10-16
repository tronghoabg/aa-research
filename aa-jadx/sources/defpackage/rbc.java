package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rbc extends android.content.res.Resources {
    public rbc(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        if (defpackage.rrx.e("CAR.INTERNAL", 4)) {
            defpackage.rrx.d(4, "CAR.INTERNAL", null, "Creating InternalResources using assets: %s", resources.getAssets());
            defpackage.rrx.d(4, "CAR.INTERNAL", null, "Creating InternalResources using display metrics: %s", resources.getDisplayMetrics());
            defpackage.rrx.d(4, "CAR.INTERNAL", null, "Creating InternalResources using config: %s", resources.getConfiguration());
        }
    }

    @Override // android.content.res.Resources
    public final void addLoaders(android.content.res.loader.ResourcesLoader... resourcesLoaderArr) {
        resourcesLoaderArr.getClass();
        if (defpackage.rrx.e("CAR.INTERNAL", 4)) {
            defpackage.rrx.c("CAR.INTERNAL", null, "addLoaders called");
        }
        super.addLoaders((android.content.res.loader.ResourcesLoader[]) java.util.Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public final void removeLoaders(android.content.res.loader.ResourcesLoader... resourcesLoaderArr) {
        resourcesLoaderArr.getClass();
        if (defpackage.rrx.e("CAR.INTERNAL", 4)) {
            defpackage.rrx.c("CAR.INTERNAL", null, "removeLoaders called");
        }
        super.removeLoaders((android.content.res.loader.ResourcesLoader[]) java.util.Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public final void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        configuration.getClass();
        displayMetrics.getClass();
        if (defpackage.rrx.e("CAR.INTERNAL", 4)) {
            defpackage.rrx.d(4, "CAR.INTERNAL", null, "updateConfiguration existing config: %s, metrics: %s", getConfiguration(), getDisplayMetrics());
            defpackage.rrx.d(4, "CAR.INTERNAL", null, "updateConfiguration called with config: %s, metrics: %s", configuration, displayMetrics);
        }
        super.updateConfiguration(configuration, displayMetrics);
    }
}
