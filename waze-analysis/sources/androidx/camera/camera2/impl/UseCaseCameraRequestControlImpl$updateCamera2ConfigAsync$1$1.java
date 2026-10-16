package androidx.camera.camera2.impl;

import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Config;
import e.b.c;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import java.util.Map;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1 extends g implements l<e<? super am<? extends ab>>, Object> {
    final /* synthetic */ Config $config;
    final /* synthetic */ Map<String, Object> $tags;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, Config config, Map<String, ? extends Object> map, e<? super UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1> eVar) {
        super(1, eVar);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$config = config;
        this.$tags = map;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(this.this$0, this.$config, this.$tags, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<? super am<ab>> eVar) {
        return ((UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            return obj;
        }
        c.b(obj);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync");
        }
        this.this$0.infoBundleMap.put(UseCaseCameraRequestControl.Type.CAMERA2_CAMERA_CONTROL, new UseCaseCameraRequestControlImpl.InfoBundle(UseCaseCameraRequestControlImpl.Companion.extractCamera2ImplConfigBuilder(this.$config), r.t(this.$tags), null, null, 12, null));
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
        this.label = 1;
        Object objUpdateCameraStateAsync$default = UseCaseCameraRequestControlImpl.updateCameraStateAsync$default(useCaseCameraRequestControlImpl, useCaseCameraRequestControlImpl.merge(useCaseCameraRequestControlImpl.infoBundleMap), null, this, 1, null);
        return objUpdateCameraStateAsync$default == aVar ? aVar : objUpdateCameraStateAsync$default;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super am<? extends ab>> eVar) {
        return invoke2((e<? super am<ab>>) eVar);
    }
}
