package androidx.compose.material3;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TimePickerKt$TimeSelector$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ boolean $isValid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimePickerKt$TimeSelector$1$1(boolean z, e<? super TimePickerKt$TimeSelector$1$1> eVar) {
        super(2, eVar);
        this.$isValid = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TimePickerKt$TimeSelector$1$1(this.$isValid, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TimePickerKt$TimeSelector$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        return ab.f48028a;
    }
}
