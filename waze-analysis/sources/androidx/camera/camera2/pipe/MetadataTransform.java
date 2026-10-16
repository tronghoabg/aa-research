package androidx.camera.camera2.pipe;

import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MetadataTransform {
    private final int future;
    private final int past;
    private final TransformFn transformFn;

    /* compiled from: WazeSource */
    public interface TransformFn {

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.camera2.pipe.MetadataTransform$TransformFn$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: $default$computeOverridesFor-F8oR-dw, reason: not valid java name */
            public static Map m731$default$computeOverridesForF8oRdw(TransformFn transformFn, FrameInfo frameInfo, String str, List list) {
                x.f(frameInfo, "result");
                x.f(str, "camera");
                x.f(list, "related");
                return r.j();
            }
        }

        /* compiled from: WazeSource */
        public final class DefaultImpls {
            @Deprecated
            /* renamed from: computeOverridesFor-F8oR-dw, reason: not valid java name */
            public static Map<?, Object> m733computeOverridesForF8oRdw(TransformFn transformFn, FrameInfo frameInfo, String str, List<? extends FrameInfo> list) {
                x.f(frameInfo, "result");
                x.f(str, "camera");
                x.f(list, "related");
                return CC.m731$default$computeOverridesForF8oRdw(transformFn, frameInfo, str, list);
            }
        }

        /* renamed from: computeOverridesFor-F8oR-dw */
        Map<?, Object> mo730computeOverridesForF8oRdw(FrameInfo frameInfo, String str, List<? extends FrameInfo> list);
    }

    public MetadataTransform(int i2, int i3, TransformFn transformFn) {
        x.f(transformFn, "transformFn");
        this.past = i2;
        this.future = i3;
        this.transformFn = transformFn;
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i3 < 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public static /* synthetic */ MetadataTransform copy$default(MetadataTransform metadataTransform, int i2, int i3, TransformFn transformFn, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = metadataTransform.past;
        }
        if ((i4 & 2) != 0) {
            i3 = metadataTransform.future;
        }
        if ((i4 & 4) != 0) {
            transformFn = metadataTransform.transformFn;
        }
        return metadataTransform.copy(i2, i3, transformFn);
    }

    public final int component1() {
        return this.past;
    }

    public final int component2() {
        return this.future;
    }

    public final TransformFn component3() {
        return this.transformFn;
    }

    public final MetadataTransform copy(int i2, int i3, TransformFn transformFn) {
        x.f(transformFn, "transformFn");
        return new MetadataTransform(i2, i3, transformFn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetadataTransform)) {
            return false;
        }
        MetadataTransform metadataTransform = (MetadataTransform) obj;
        return this.past == metadataTransform.past && this.future == metadataTransform.future && x.n(this.transformFn, metadataTransform.transformFn);
    }

    public final int getFuture() {
        return this.future;
    }

    public final int getPast() {
        return this.past;
    }

    public final TransformFn getTransformFn() {
        return this.transformFn;
    }

    public int hashCode() {
        return (((this.past * 31) + this.future) * 31) + this.transformFn.hashCode();
    }

    public String toString() {
        return "MetadataTransform(past=" + this.past + ", future=" + this.future + ", transformFn=" + this.transformFn + ")";
    }

    public MetadataTransform() {
        this(0, 0, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MetadataTransform(int i2, int i3, TransformFn transformFn, int i4, o oVar) {
        transformFn = (i4 & 4) != 0 ? new TransformFn() { // from class: androidx.camera.camera2.pipe.MetadataTransform.1
            @Override // androidx.camera.camera2.pipe.MetadataTransform.TransformFn
            /* renamed from: computeOverridesFor-F8oR-dw, reason: not valid java name */
            public /* synthetic */ Map mo730computeOverridesForF8oRdw(FrameInfo frameInfo, String str, List list) {
                return TransformFn.CC.m731$default$computeOverridesForF8oRdw(this, frameInfo, str, list);
            }
        } : transformFn;
        int i5 = i4 & 2;
        int i6 = i4 & 1;
        this(1 == i6 ? 0 : i2, i5 != 0 ? 0 : i3, transformFn);
    }
}
