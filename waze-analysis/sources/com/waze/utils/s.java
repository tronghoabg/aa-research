package com.waze.utils;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends ae {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CancellationException cancellationException) {
        super(cancellationException);
        h.g.b.x.f(cancellationException, "cause");
    }
}
