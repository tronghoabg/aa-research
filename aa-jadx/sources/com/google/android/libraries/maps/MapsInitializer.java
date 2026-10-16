package com.google.android.libraries.maps;

/* JADX INFO: loaded from: classes3.dex */
public final class MapsInitializer {
    private static boolean a = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Renderer {
        public static final com.google.android.libraries.maps.MapsInitializer.Renderer LATEST;

        @java.lang.Deprecated
        public static final com.google.android.libraries.maps.MapsInitializer.Renderer LEGACY;
        private static final /* synthetic */ com.google.android.libraries.maps.MapsInitializer.Renderer[] a;

        static {
            com.google.android.libraries.maps.MapsInitializer.Renderer renderer = new com.google.android.libraries.maps.MapsInitializer.Renderer("LEGACY", 0);
            LEGACY = renderer;
            com.google.android.libraries.maps.MapsInitializer.Renderer renderer2 = new com.google.android.libraries.maps.MapsInitializer.Renderer("LATEST", 1);
            LATEST = renderer2;
            a = new com.google.android.libraries.maps.MapsInitializer.Renderer[]{renderer, renderer2};
        }

        public static com.google.android.libraries.maps.MapsInitializer.Renderer valueOf(java.lang.String str) {
            return (com.google.android.libraries.maps.MapsInitializer.Renderer) java.lang.Enum.valueOf(com.google.android.libraries.maps.MapsInitializer.Renderer.class, str);
        }

        public static com.google.android.libraries.maps.MapsInitializer.Renderer[] values() {
            return (com.google.android.libraries.maps.MapsInitializer.Renderer[]) a.clone();
        }
    }

    private MapsInitializer() {
    }

    public static void initFactories(defpackage.vfa vfaVar) {
        try {
            com.google.android.libraries.maps.CameraUpdateFactory.init(vfaVar.a());
            com.google.android.libraries.maps.model.BitmapDescriptorFactory.init(vfaVar.g());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.libraries.maps.model.RuntimeRemoteException(e);
        }
    }

    public static synchronized int initialize(android.content.Context context) {
        defpackage.sqs.aB(context, "Context is null");
        if (a) {
            return 0;
        }
        try {
            initFactories(defpackage.vjy.a(context));
            a = true;
            return 0;
        } catch (defpackage.slg e) {
            return e.a;
        }
    }

    public static synchronized int initialize(android.content.Context context, com.google.android.libraries.maps.MapsInitializer.Renderer renderer, com.google.android.libraries.maps.OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        int iInitialize;
        defpackage.sqs.aB(context, "Context is null");
        iInitialize = initialize(context);
        if (onMapsSdkInitializedCallback != null) {
            onMapsSdkInitializedCallback.onMapsSdkInitialized(com.google.android.libraries.maps.MapsInitializer.Renderer.LATEST);
        }
        return iInitialize;
    }
}
