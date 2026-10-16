package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.core.impl.Config;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import java.util.Map;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class UseCaseCameraRequestControlImpl$setParametersAsync$1$1 extends g implements l<e<? super am<? extends ab>>, Object> {
    final /* synthetic */ Config.OptionPriority $optionPriority;
    final /* synthetic */ UseCaseCameraRequestControl.Type $type;
    final /* synthetic */ Map<CaptureRequest.Key<?>, Object> $values;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UseCaseCameraRequestControlImpl$setParametersAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, UseCaseCameraRequestControl.Type type, Map<CaptureRequest.Key<?>, ? extends Object> map, Config.OptionPriority optionPriority, e<? super UseCaseCameraRequestControlImpl$setParametersAsync$1$1> eVar) {
        super(1, eVar);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$type = type;
        this.$values = map;
        this.$optionPriority = optionPriority;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new UseCaseCameraRequestControlImpl$setParametersAsync$1$1(this.this$0, this.$type, this.$values, this.$optionPriority, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<? super am<ab>> eVar) {
        return ((UseCaseCameraRequestControlImpl$setParametersAsync$1$1) create(eVar)).invokeSuspend(ab.f48028a);
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
        this.label = 1;
        Object parametersInternal = this.this$0.setParametersInternal(this.$type, this.$values, this.$optionPriority, this);
        return parametersInternal == aVar ? aVar : parametersInternal;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super am<? extends ab>> eVar) {
        return invoke2((e<? super am<ab>>) eVar);
    }
}
