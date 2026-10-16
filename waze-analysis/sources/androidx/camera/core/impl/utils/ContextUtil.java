package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ContextUtil {
    private static final int DEVICE_ID_DEFAULT = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1641a = 0;
    private static final Object CACHE_LOCK = new Object();
    private static final Map<String, WeakReference<Context>> CACHED_CONTEXTS = new HashMap();

    /* compiled from: WazeSource */
    class Api30Impl {
        private Api30Impl() {
        }

        static Context createAttributionContext(Context context, String str) {
            return context.createAttributionContext(str);
        }

        static String getAttributionTag(Context context) {
            return context.getAttributionTag();
        }
    }

    /* compiled from: WazeSource */
    class Api34Impl {
        static final int DEVICE_ID_DEFAULT = 0;

        private Api34Impl() {
        }

        static Context createDeviceContext(Context context, int i2) {
            return context.createDeviceContext(i2);
        }

        static int getDeviceId(Context context) {
            return context.getDeviceId();
        }
    }

    private ContextUtil() {
    }

    public static Application getApplication(Context context) {
        for (Context applicationContext = context.getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    private static String getApplicationContextHashKey(Context context) {
        return String.format("%d-%d-%s", Integer.valueOf(context.getApplicationContext().hashCode()), Integer.valueOf(getDeviceId(context)), Build.VERSION.SDK_INT >= 30 ? Api30Impl.getAttributionTag(context) : null);
    }

    private static Context getCachedContext(String str) {
        Map<String, WeakReference<Context>> map = CACHED_CONTEXTS;
        WeakReference<Context> weakReference = map.get(str);
        if (weakReference == null) {
            return null;
        }
        Context context = weakReference.get();
        if (context != null) {
            return context;
        }
        map.remove(str);
        return null;
    }

    public static int getDefaultDeviceId() {
        return 0;
    }

    public static int getDeviceId(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getDeviceId(context);
        }
        return 0;
    }

    public static Context getPersistentApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        String applicationContextHashKey = getApplicationContextHashKey(context);
        synchronized (CACHE_LOCK) {
            Context cachedContext = getCachedContext(applicationContextHashKey);
            if (cachedContext != null) {
                return cachedContext;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                applicationContext = Api34Impl.createDeviceContext(applicationContext, Api34Impl.getDeviceId(context));
            }
            if (Build.VERSION.SDK_INT >= 30) {
                String attributionTag = Api30Impl.getAttributionTag(context);
                if (!Objects.equals(attributionTag, Api30Impl.getAttributionTag(applicationContext))) {
                    applicationContext = Api30Impl.createAttributionContext(applicationContext, attributionTag);
                }
            }
            CACHED_CONTEXTS.put(applicationContextHashKey, new WeakReference<>(applicationContext));
            return applicationContext;
        }
    }
}
