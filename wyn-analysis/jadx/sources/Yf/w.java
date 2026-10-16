package Yf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class w extends AbstractC1295a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.a f16889f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16890g;

    /* renamed from: h, reason: collision with root package name */
    public int f16891h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Xf.c json, kotlinx.serialization.json.a value) {
        super(json, null);
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(value, "value");
        this.f16889f = value;
        this.f16890g = value.f39779a.size();
        this.f16891h = -1;
    }

    @Override // Yf.AbstractC1295a
    public final kotlinx.serialization.json.b F(String tag) throws NumberFormatException {
        AbstractC3340k.e(tag, "tag");
        return (kotlinx.serialization.json.b) this.f16889f.f39779a.get(Integer.parseInt(tag));
    }

    @Override // Yf.AbstractC1295a
    public final String R(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return String.valueOf(i5);
    }

    @Override // Yf.AbstractC1295a
    public final kotlinx.serialization.json.b T() {
        return this.f16889f;
    }

    @Override // Vf.a
    public final int m(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        int i5 = this.f16891h;
        if (i5 >= this.f16890g - 1) {
            return -1;
        }
        int i10 = i5 + 1;
        this.f16891h = i10;
        return i10;
    }
}
