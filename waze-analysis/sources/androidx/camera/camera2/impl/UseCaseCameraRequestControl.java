package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import h.a.r;
import h.ab;
import h.c.e;
import h.d.a;
import h.d.b;
import h.g.a.l;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface UseCaseCameraRequestControl {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseCameraRequestControl$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ am removeParametersAsync$default(UseCaseCameraRequestControl useCaseCameraRequestControl, List list, Type type, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeParametersAsync");
            }
            if ((i2 & 2) != 0) {
                type = Type.DEFAULT;
            }
            return useCaseCameraRequestControl.removeParametersAsync(list, type);
        }

        public static /* synthetic */ am setParametersAsync$default(UseCaseCameraRequestControl useCaseCameraRequestControl, Map map, Type type, Config.OptionPriority optionPriority, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setParametersAsync");
            }
            if ((i2 & 2) != 0) {
                type = Type.DEFAULT;
            }
            if ((i2 & 4) != 0) {
                optionPriority = UseCaseCameraKt.getDefaultOptionPriority();
            }
            return useCaseCameraRequestControl.setParametersAsync(map, type, optionPriority);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: startFocusAndMeteringAsync-HEKfQLs$default, reason: not valid java name */
        public static /* synthetic */ am m282startFocusAndMeteringAsyncHEKfQLs$default(UseCaseCameraRequestControl useCaseCameraRequestControl, List list, List list2, List list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, long j2, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startFocusAndMeteringAsync-HEKfQLs");
            }
            if (1 == (i2 & 1)) {
                list = null;
            }
            if ((i2 & 2) != 0) {
                list2 = null;
            }
            if ((i2 & 4) != 0) {
                list3 = null;
            }
            if ((i2 & 8) != 0) {
                lock3ABehavior = null;
            }
            if ((i2 & 16) != 0) {
                lock3ABehavior2 = null;
            }
            if ((i2 & 32) != 0) {
                lock3ABehavior3 = null;
            }
            if ((i2 & 64) != 0) {
                aeMode = null;
            }
            if ((i2 & 128) != 0) {
                j2 = CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
            }
            if ((i2 & 256) != 0) {
                lVar = null;
            }
            return useCaseCameraRequestControl.mo254startFocusAndMeteringAsyncHEKfQLs(list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode, j2, lVar);
        }

        public static /* synthetic */ am submitParameters$default(UseCaseCameraRequestControl useCaseCameraRequestControl, Map map, Type type, Config.OptionPriority optionPriority, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitParameters");
            }
            if ((i2 & 2) != 0) {
                type = Type.DEFAULT;
            }
            if ((i2 & 4) != 0) {
                optionPriority = UseCaseCameraKt.getDefaultOptionPriority();
            }
            return useCaseCameraRequestControl.submitParameters(map, type, optionPriority);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ am update3aRegions$default(UseCaseCameraRequestControl useCaseCameraRequestControl, List list, List list2, List list3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update3aRegions");
            }
            if (1 == (i2 & 1)) {
                list = null;
            }
            if ((i2 & 2) != 0) {
                list2 = null;
            }
            if ((i2 & 4) != 0) {
                list3 = null;
            }
            return useCaseCameraRequestControl.update3aRegions(list, list2, list3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ am updateCamera2ConfigAsync$default(UseCaseCameraRequestControl useCaseCameraRequestControl, Config config, Map map, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCamera2ConfigAsync");
            }
            if ((i2 & 2) != 0) {
                map = r.j();
            }
            return useCaseCameraRequestControl.updateCamera2ConfigAsync(config, map);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type SESSION_CONFIG = new Type("SESSION_CONFIG", 0);
        public static final Type DEFAULT = new Type("DEFAULT", 1);
        public static final Type CAMERA2_CAMERA_CONTROL = new Type("CAMERA2_CAMERA_CONTROL", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SESSION_CONFIG, DEFAULT, CAMERA2_CAMERA_CONTROL};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = b.a(typeArr$values);
        }

        private Type(String str, int i2) {
        }

        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    Object awaitSurfaceSetup(e<? super Boolean> eVar);

    am<Result3A> cancelFocusAndMeteringAsync();

    void close();

    List<am<Void>> issueSingleCaptureAsync(List<CaptureConfig> list, int i2, int i3, int i4);

    am<ab> removeParametersAsync(List<? extends CaptureRequest.Key<?>> list, Type type);

    am<ab> setParametersAsync(Map<CaptureRequest.Key<?>, ? extends Object> map, Type type, Config.OptionPriority optionPriority);

    /* renamed from: setTorchOffAsync-MtizInI */
    am<Result3A> mo253setTorchOffAsyncMtizInI(int i2);

    am<Result3A> setTorchOnAsync();

    /* renamed from: startFocusAndMeteringAsync-HEKfQLs */
    am<Result3A> mo254startFocusAndMeteringAsyncHEKfQLs(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode, long j2, l<? super FrameMetadata, Boolean> lVar);

    am<ab> submitParameters(Map<CaptureRequest.Key<?>, ? extends Object> map, Type type, Config.OptionPriority optionPriority);

    am<Result3A> update3aRegions(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3);

    am<ab> updateCamera2ConfigAsync(Config config, Map<String, ? extends Object> map);

    am<ab> updateRepeatingRequestAsync(boolean z, Collection<? extends UseCase> collection);
}
