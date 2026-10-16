package defpackage;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;

/* loaded from: classes.dex */
public final class tdh {
    public static final yph a = yph.c("CreateResourceLoader");

    public static final void a(Context context, ResourcesLoader resourcesLoader) {
        resourcesLoader.getClass();
        context.getResources().removeLoaders(resourcesLoader);
        context.getResources().addLoaders(resourcesLoader);
    }
}
