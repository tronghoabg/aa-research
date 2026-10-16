package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.AudioRestrictionMode;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AudioRestrictionControllerImpl$addListener$1$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    final /* synthetic */ AudioRestrictionController.Listener $listener;
    final /* synthetic */ AudioRestrictionMode $mode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioRestrictionControllerImpl$addListener$1$1(AudioRestrictionController.Listener listener, AudioRestrictionMode audioRestrictionMode, h.c.e<? super AudioRestrictionControllerImpl$addListener$1$1> eVar) {
        super(2, eVar);
        this.$listener = listener;
        this.$mode = audioRestrictionMode;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new AudioRestrictionControllerImpl$addListener$1$1(this.$listener, this.$mode, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((AudioRestrictionControllerImpl$addListener$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        this.$listener.mo986onCameraAudioRestrictionUpdatedLwUUkyU(this.$mode.m336unboximpl());
        return ab.f48028a;
    }
}
