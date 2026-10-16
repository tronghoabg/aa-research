package com.google.android.libraries.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import defpackage.skk;
import defpackage.spu;
import defpackage.ved;
import defpackage.vjb;

/* loaded from: classes3.dex */
public final class MapsInitializer {
    private static boolean a = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Renderer {
        public static final Renderer LATEST;

        @Deprecated
        public static final Renderer LEGACY;
        private static final /* synthetic */ Renderer[] a;

        static {
            Renderer renderer = new Renderer("LEGACY", 0);
            LEGACY = renderer;
            Renderer renderer2 = new Renderer("LATEST", 1);
            LATEST = renderer2;
            a = new Renderer[]{renderer, renderer2};
        }

        public static Renderer valueOf(String str) {
            return (Renderer) Enum.valueOf(Renderer.class, str);
        }

        public static Renderer[] values() {
            return (Renderer[]) a.clone();
        }
    }

    private MapsInitializer() {
    }

    public static void initFactories(ved vedVar) {
        try {
            CameraUpdateFactory.init(vedVar.a());
            BitmapDescriptorFactory.init(vedVar.g());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static synchronized int initialize(Context context) {
        spu.ax(context, "Context is null");
        if (a) {
            return 0;
        }
        try {
            initFactories(vjb.a(context));
            a = true;
            return 0;
        } catch (skk e) {
            return e.a;
        }
    }

    public static synchronized int initialize(Context context, Renderer renderer, OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        int iInitialize;
        spu.ax(context, "Context is null");
        iInitialize = initialize(context);
        if (onMapsSdkInitializedCallback != null) {
            onMapsSdkInitializedCallback.onMapsSdkInitialized(Renderer.LATEST);
        }
        return iInitialize;
    }
}
