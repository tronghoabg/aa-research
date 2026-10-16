package androidx.camera.camera2.adapter;

import android.content.Context;
import android.os.Trace;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraInteropStateCallbackRepository;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraPipeKt;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.StreamSpecsCalculator;
import com.waze.strings.DisplayStrings;
import h.f;
import h.g;
import h.g.b.o;
import h.g.b.x;
import h.o.c;
import h.o.d;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraFactoryProvider implements CameraFactory.Provider {
    private final Context sharedAppContext;
    private final CameraPipe sharedCameraPipe;
    private final CameraInteropStateCallbackRepository sharedInteropCallbacks;
    private final CameraThreadConfig sharedThreadConfig;

    public /* synthetic */ CameraFactoryProvider(CameraPipe cameraPipe, Context context, CameraThreadConfig cameraThreadConfig, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : cameraPipe, (i2 & 2) != 0 ? null : context, (i2 & 4) != 0 ? null : cameraThreadConfig);
    }

    /* renamed from: createCameraPipe-moChb0s, reason: not valid java name */
    private final CameraPipe m180createCameraPipemoChb0s(Context context, CameraThreadConfig cameraThreadConfig, h.o.a aVar) {
        try {
            Trace.beginSection("Create CameraPipe");
            SystemTimeSource systemTimeSource = new SystemTimeSource();
            long jMo1117nowvQl9yQU = systemTimeSource.mo1117nowvQl9yQU();
            Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context);
            x.e(persistentApplicationContext, "getPersistentApplicationContext(...)");
            CameraPipe CameraPipe = CameraPipeKt.CameraPipe(new CameraPipe.Config(persistentApplicationContext, new CameraPipe.ThreadConfig(null, null, null, CameraXExecutors.newSequentialExecutor(cameraThreadConfig.getCameraExecutor()), null, null, null, 119, null), null, new CameraPipe.CameraInteropConfig(this.sharedInteropCallbacks.getDeviceStateCallback(), this.sharedInteropCallbacks.getSessionStateCallback(), aVar, null, 8, null), null, new CameraPipe.Flags(false, true, 1, null), null, null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_3, null));
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                String str = Camera2Logger.TRUNCATED_TAG;
                long jMo1117nowvQl9yQU2 = systemTimeSource.mo1117nowvQl9yQU();
                c cVar = h.o.a.f48264a;
                String str2 = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, d.f48270a), d.f48272c))}, 1));
                x.e(str2, "format(...)");
                android.util.Log.d(str, "Created CameraPipe in " + str2);
            }
            return CameraPipe;
        } finally {
            Trace.endSection();
        }
    }

    static final CameraPipe newInstance$lambda$0(CameraFactoryProvider cameraFactoryProvider, Context context, CameraThreadConfig cameraThreadConfig, h.o.a aVar) {
        if (cameraFactoryProvider.sharedCameraPipe == null) {
            return cameraFactoryProvider.m180createCameraPipemoChb0s(context, cameraThreadConfig, aVar);
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Using shared a " + cameraFactoryProvider.sharedCameraPipe + " instance.");
        }
        return cameraFactoryProvider.sharedCameraPipe;
    }

    @Override // androidx.camera.core.impl.CameraFactory.Provider
    public CameraFactory newInstance(final Context context, final CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector, long j2, CameraXConfig cameraXConfig, StreamSpecsCalculator streamSpecsCalculator) {
        final h.o.a aVarZ;
        x.f(context, "context");
        x.f(cameraThreadConfig, "threadConfig");
        x.f(streamSpecsCalculator, "streamSpecsCalculator");
        if (j2 == -1) {
            aVarZ = null;
        } else {
            c cVar = h.o.a.f48264a;
            aVarZ = h.o.a.z(c.j(j2, d.f48272c));
        }
        f fVarA = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.CameraFactoryProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CameraFactoryProvider.newInstance$lambda$0(this.f$0, context, cameraThreadConfig, aVarZ);
            }
        });
        Context context2 = this.sharedAppContext;
        Context context3 = context2 != null ? context2 : context;
        CameraThreadConfig cameraThreadConfig2 = this.sharedThreadConfig;
        CameraThreadConfig cameraThreadConfig3 = cameraThreadConfig2 != null ? cameraThreadConfig2 : cameraThreadConfig;
        CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository = this.sharedInteropCallbacks;
        if (cameraXConfig == null) {
            cameraXConfig = new CameraXConfig.Builder().build();
            x.e(cameraXConfig, "build(...)");
        }
        return new CameraFactoryAdapter(fVarA, context3, cameraThreadConfig3, cameraInteropStateCallbackRepository, cameraSelector, streamSpecsCalculator, cameraXConfig);
    }

    public CameraFactoryProvider(CameraPipe cameraPipe, Context context, CameraThreadConfig cameraThreadConfig) {
        this.sharedCameraPipe = cameraPipe;
        this.sharedAppContext = context;
        this.sharedThreadConfig = cameraThreadConfig;
        this.sharedInteropCallbacks = new CameraInteropStateCallbackRepository();
    }

    public CameraFactoryProvider() {
        this(null, null, null, 7, null);
    }
}
