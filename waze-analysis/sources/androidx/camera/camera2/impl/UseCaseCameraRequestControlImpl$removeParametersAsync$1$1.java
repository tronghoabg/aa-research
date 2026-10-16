package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraRequestControlImpl$removeParametersAsync$1$1 extends g implements l<e<? super am<? extends ab>>, Object> {
    final /* synthetic */ List<CaptureRequest.Key<?>> $keys;
    final /* synthetic */ UseCaseCameraRequestControl.Type $type;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCaseCameraRequestControlImpl$removeParametersAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, UseCaseCameraRequestControl.Type type, List<? extends CaptureRequest.Key<?>> list, e<? super UseCaseCameraRequestControlImpl$removeParametersAsync$1$1> eVar) {
        super(1, eVar);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$type = type;
        this.$keys = list;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$removeParametersAsync$1$1(this.this$0, this.$type, this.$keys, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<? super am<ab>> eVar) {
        return ((UseCaseCameraRequestControlImpl$removeParametersAsync$1$1) create(eVar)).invokeSuspend(ab.f48028a);
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
        UseCaseCameraRequestControl.Type type = this.$type;
        List<CaptureRequest.Key<?>> list = this.$keys;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraRequestControlImpl#removeParametersAsync: [" + type + "] keys = " + list);
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
        UseCaseCameraRequestControl.Type type2 = this.$type;
        Map map = useCaseCameraRequestControlImpl.infoBundleMap;
        Object obj2 = map.get(type2);
        if (obj2 == null) {
            UseCaseCameraRequestControlImpl.InfoBundle infoBundle = new UseCaseCameraRequestControlImpl.InfoBundle(null, null, null, null, 15, null);
            map.put(type2, infoBundle);
            obj2 = infoBundle;
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = this.this$0;
        useCaseCameraRequestControlImpl2.infoBundleMap.put(this.$type, useCaseCameraRequestControlImpl2.withoutParameters((UseCaseCameraRequestControlImpl.InfoBundle) obj2, this.$keys));
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl3 = this.this$0;
        this.label = 1;
        Object objUpdateCameraStateAsync$default = UseCaseCameraRequestControlImpl.updateCameraStateAsync$default(useCaseCameraRequestControlImpl3, useCaseCameraRequestControlImpl3.merge(useCaseCameraRequestControlImpl3.infoBundleMap), null, this, 1, null);
        return objUpdateCameraStateAsync$default == aVar ? aVar : objUpdateCameraStateAsync$default;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super am<? extends ab>> eVar) {
        return invoke2((e<? super am<ab>>) eVar);
    }
}
