package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraMetadata;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2MetadataCache$getCameraMetadata$3 extends h.c.b.a.g implements p<af, h.c.e<? super CameraMetadata>, Object> {
    final /* synthetic */ String $cameraId;
    int label;
    final /* synthetic */ Camera2MetadataCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2MetadataCache$getCameraMetadata$3(Camera2MetadataCache camera2MetadataCache, String str, h.c.e<? super Camera2MetadataCache$getCameraMetadata$3> eVar) {
        super(2, eVar);
        this.this$0 = camera2MetadataCache;
        this.$cameraId = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new Camera2MetadataCache$getCameraMetadata$3(this.this$0, this.$cameraId, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super CameraMetadata> eVar) {
        return ((Camera2MetadataCache$getCameraMetadata$3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        return this.this$0.mo1047awaitCameraMetadataEfqyGwQ(this.$cameraId);
    }
}
