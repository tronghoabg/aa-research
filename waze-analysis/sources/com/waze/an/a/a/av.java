package com.waze.an.a.a;

import j$.util.function.BiFunction$CC;
import java.util.Arrays;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class av implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14403a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f14404b;

    public /* synthetic */ av(Object obj, int i2) {
        this.f14404b = i2;
        this.f14403a = obj;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i2 = this.f14404b;
        return i2 != 0 ? i2 != 1 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.p, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i2 = this.f14404b;
        if (i2 == 0) {
            return (com.waze.an.a.r) this.f14403a.invoke(obj, obj2);
        }
        if (i2 != 1) {
            return (Set) this.f14403a.invoke(obj, obj2);
        }
        byte[] bArr = (byte[]) obj2;
        Object obj3 = this.f14403a;
        return Arrays.equals(bArr, (byte[]) obj3) ? bArr : obj3;
    }
}
