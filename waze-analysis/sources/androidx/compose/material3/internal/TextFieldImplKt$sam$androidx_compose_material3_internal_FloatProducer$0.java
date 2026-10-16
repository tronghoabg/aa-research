package androidx.compose.material3.internal;

import h.c;
import h.g.a.a;
import h.g.b.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 implements FloatProducer, r {
    private final /* synthetic */ a function;

    TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0(a aVar) {
        this.function = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FloatProducer) && (obj instanceof r)) {
            return x.n(getFunctionDelegate(), ((r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final c<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final /* synthetic */ float invoke() {
        return ((Number) this.function.invoke()).floatValue();
    }
}
