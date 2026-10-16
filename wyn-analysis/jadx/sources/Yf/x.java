package Yf;

import ff.AbstractC2640A;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class x extends v {

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.serialization.json.c f16892j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16893l;

    /* renamed from: m, reason: collision with root package name */
    public int f16894m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Xf.c json, kotlinx.serialization.json.c value) {
        super(json, value, (String) null, 12);
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(value, "value");
        this.f16892j = value;
        List listS0 = ff.o.S0(value.f39780a.keySet());
        this.k = listS0;
        this.f16893l = listS0.size() * 2;
        this.f16894m = -1;
    }

    @Override // Yf.v, Yf.AbstractC1295a
    public final kotlinx.serialization.json.b F(String tag) {
        AbstractC3340k.e(tag, "tag");
        return this.f16894m % 2 == 0 ? Xf.j.b(tag) : (kotlinx.serialization.json.b) AbstractC2640A.P(tag, this.f16892j);
    }

    @Override // Yf.v, Yf.AbstractC1295a
    public final String R(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return (String) this.k.get(i5 / 2);
    }

    @Override // Yf.v, Yf.AbstractC1295a
    public final kotlinx.serialization.json.b T() {
        return this.f16892j;
    }

    @Override // Yf.v
    /* renamed from: Y */
    public final kotlinx.serialization.json.c T() {
        return this.f16892j;
    }

    @Override // Yf.v, Yf.AbstractC1295a, Vf.a
    public final void c(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
    }

    @Override // Yf.v, Vf.a
    public final int m(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        int i5 = this.f16894m;
        if (i5 >= this.f16893l - 1) {
            return -1;
        }
        int i10 = i5 + 1;
        this.f16894m = i10;
        return i10;
    }
}
