package org.apache.tika.pipes.async;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.apache.tika.pipes.async.AsyncEmitter;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return AsyncEmitter.EmitDataCache.lambda$add$0((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
