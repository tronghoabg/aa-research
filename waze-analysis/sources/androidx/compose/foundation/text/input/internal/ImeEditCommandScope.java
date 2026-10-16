package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ImeEditCommandScope {
    boolean beginBatchEdit();

    void edit(l<? super TextFieldBuffer, ab> lVar);

    boolean endBatchEdit();

    int getTransformedLength();

    /* renamed from: mapFromTransformed-GEjPoXI */
    long mo3512mapFromTransformedGEjPoXI(long j2);

    /* renamed from: mapToTransformed-GEjPoXI */
    long mo3513mapToTransformedGEjPoXI(long j2);
}
