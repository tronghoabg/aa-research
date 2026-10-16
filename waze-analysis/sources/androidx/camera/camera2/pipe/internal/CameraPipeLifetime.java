package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.config.CameraPipeJob;
import androidx.camera.camera2.pipe.core.Log;
import h.ab;
import h.c.k;
import h.d.a;
import h.d.b;
import h.g.b.o;
import h.g.b.x;
import h.i;
import h.o.c;
import h.o.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeLifetime {
    private static final long CAMERA_PIPE_JOB_CANCEL_TIMEOUT;
    public static final Companion Companion = new Companion(null);
    private final Object cameraLock;
    private final br cameraPipeJob;
    private final List<Runnable> cameraShutdownActions;
    private boolean isCameraShutdown;
    private boolean isScopeShutdown;
    private boolean isThreadShutdown;
    private final Object scopeLock;
    private final List<Runnable> scopeShutdownActions;
    private final Object threadLock;
    private final List<Runnable> threadShutdownActions;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class ShutdownType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ShutdownType[] $VALUES;
        public static final ShutdownType CAMERA = new ShutdownType("CAMERA", 0);
        public static final ShutdownType SCOPE = new ShutdownType("SCOPE", 1);
        public static final ShutdownType THREAD = new ShutdownType("THREAD", 2);

        private static final /* synthetic */ ShutdownType[] $values() {
            return new ShutdownType[]{CAMERA, SCOPE, THREAD};
        }

        static {
            ShutdownType[] shutdownTypeArr$values = $values();
            $VALUES = shutdownTypeArr$values;
            $ENTRIES = b.a(shutdownTypeArr$values);
        }

        private ShutdownType(String str, int i2) {
        }

        public static a<ShutdownType> getEntries() {
            return $ENTRIES;
        }

        public static ShutdownType valueOf(String str) {
            return (ShutdownType) Enum.valueOf(ShutdownType.class, str);
        }

        public static ShutdownType[] values() {
            return (ShutdownType[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShutdownType.values().length];
            try {
                iArr[ShutdownType.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShutdownType.SCOPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShutdownType.THREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        c cVar = h.o.a.f48264a;
        CAMERA_PIPE_JOB_CANCEL_TIMEOUT = c.i(3, d.f48273d);
    }

    public CameraPipeLifetime(@CameraPipeJob br brVar) {
        x.f(brVar, "cameraPipeJob");
        this.cameraPipeJob = brVar;
        this.cameraLock = new Object();
        this.cameraShutdownActions = new ArrayList();
        this.scopeLock = new Object();
        this.scopeShutdownActions = new ArrayList();
        this.threadLock = new Object();
        this.threadShutdownActions = new ArrayList();
    }

    private final boolean addCameraShutdownAction(Runnable runnable) {
        boolean zAdd;
        synchronized (this.cameraLock) {
            zAdd = this.isCameraShutdown ? false : this.cameraShutdownActions.add(runnable);
        }
        return zAdd;
    }

    private final boolean addScopeShutdownAction(Runnable runnable) {
        boolean zAdd;
        synchronized (this.scopeLock) {
            zAdd = this.isScopeShutdown ? false : this.scopeShutdownActions.add(runnable);
        }
        return zAdd;
    }

    private final boolean addThreadShutdownAction(Runnable runnable) {
        boolean zAdd;
        synchronized (this.threadLock) {
            zAdd = this.isThreadShutdown ? false : this.threadShutdownActions.add(runnable);
        }
        return zAdd;
    }

    private final void shutdownCamera() {
        synchronized (this.cameraLock) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Shutting down cameras...");
            }
            Iterator<Runnable> it = this.cameraShutdownActions.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    private final ab shutdownScope() {
        ab abVar;
        synchronized (this.scopeLock) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Shutting down scopes...");
            }
            Iterator<Runnable> it = this.scopeShutdownActions.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            abVar = (ab) aj.t(k.f48060a, new CameraPipeLifetime$shutdownScope$1$2(this, null));
        }
        return abVar;
    }

    private final void shutdownThread() {
        synchronized (this.threadLock) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Shutting down threads...");
            }
            Iterator<Runnable> it = this.threadShutdownActions.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    public final void addShutdownAction(ShutdownType shutdownType, Runnable runnable) {
        boolean zAddCameraShutdownAction;
        x.f(shutdownType, "shutdownType");
        x.f(runnable, "shutdownAction");
        ShutdownType shutdownType2 = ShutdownType.CAMERA;
        int iOrdinal = shutdownType.ordinal();
        if (iOrdinal == 0) {
            zAddCameraShutdownAction = addCameraShutdownAction(runnable);
        } else if (iOrdinal == 1) {
            zAddCameraShutdownAction = addScopeShutdownAction(runnable);
        } else {
            if (iOrdinal != 2) {
                throw new i();
            }
            zAddCameraShutdownAction = addThreadShutdownAction(runnable);
        }
        if (zAddCameraShutdownAction) {
            return;
        }
        if (Log.INSTANCE.getERROR_LOGGABLE()) {
            android.util.Log.e(Log.TAG, "CameraPipeLifetime already shut down. This is unexpected. Executing " + shutdownType + " shutdown action immediately...");
        }
        runnable.run();
    }

    public final void shutdown() {
        shutdownCamera();
        shutdownScope();
        shutdownThread();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
