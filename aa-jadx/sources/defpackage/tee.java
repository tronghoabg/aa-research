package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tee {
    public static final defpackage.yqm a = defpackage.yqm.c("CreateResourceLoader");

    public static final void a(android.content.Context context, android.content.res.loader.ResourcesLoader resourcesLoader) {
        resourcesLoader.getClass();
        context.getResources().removeLoaders(resourcesLoader);
        context.getResources().addLoaders(resourcesLoader);
    }
}
