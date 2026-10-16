package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.graph.LatestFrameMetadataImpl;
import h.a.r;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface LatestFrameMetadata extends Metadata {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LatestFrameMetadata invoke$default(Companion companion, Map map, Map map2, Map map3, Map map4, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                map2 = r.j();
            }
            if ((i2 & 4) != 0) {
                map3 = r.j();
            }
            if ((i2 & 8) != 0) {
                map4 = r.j();
            }
            return companion.invoke(map, map2, map3, map4);
        }

        public final LatestFrameMetadata invoke(Map<CaptureResult.Key<?>, ? extends Object> map, Map<Metadata.Key<?>, ? extends Object> map2, Map<CaptureResult.Key<?>, FrameNumber> map3, Map<Metadata.Key<?>, FrameNumber> map4) {
            x.f(map, "captureResultParameters");
            x.f(map2, "metadataParameters");
            x.f(map3, "captureResultFrameNumbers");
            x.f(map4, "metadataFrameNumbers");
            CaptureResult.Key[] keyArr = (CaptureResult.Key[]) map.keySet().toArray(new CaptureResult.Key[0]);
            int length = keyArr.length;
            Object[] objArr = new Object[length];
            for (int i2 = 0; i2 < length; i2++) {
                objArr[i2] = map.get(keyArr[i2]);
            }
            int length2 = keyArr.length;
            FrameNumber[] frameNumberArr = new FrameNumber[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                frameNumberArr[i3] = map3.get(keyArr[i3]);
            }
            Metadata.Key[] keyArr2 = (Metadata.Key[]) map2.keySet().toArray(new Metadata.Key[0]);
            int length3 = keyArr2.length;
            Object[] objArr2 = new Object[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                objArr2[i4] = map2.get(keyArr2[i4]);
            }
            int length4 = keyArr2.length;
            FrameNumber[] frameNumberArr2 = new FrameNumber[length4];
            for (int i5 = 0; i5 < length4; i5++) {
                frameNumberArr2[i5] = map4.get(keyArr2[i5]);
            }
            return new LatestFrameMetadataImpl(keyArr, objArr, frameNumberArr, keyArr2, objArr2, frameNumberArr2);
        }
    }

    <T> T get(CaptureResult.Key<T> key);

    /* renamed from: getFrameNumber-nwBJogA, reason: not valid java name */
    FrameNumber mo718getFrameNumbernwBJogA(CaptureResult.Key<?> key);

    /* renamed from: getFrameNumber-nwBJogA, reason: not valid java name */
    FrameNumber mo719getFrameNumbernwBJogA(Metadata.Key<?> key);

    List<CaptureResult.Key<?>> getKeys();

    List<Metadata.Key<?>> getMetadataKeys();

    <T> T getOrDefault(CaptureResult.Key<T> key, T t);
}
