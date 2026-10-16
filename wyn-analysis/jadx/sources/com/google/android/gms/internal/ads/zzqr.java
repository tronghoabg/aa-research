package com.google.android.gms.internal.ads;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes3.dex */
final /* synthetic */ class zzqr implements Function {
    static final /* synthetic */ zzqr zza = new zzqr();

    private /* synthetic */ zzqr() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
