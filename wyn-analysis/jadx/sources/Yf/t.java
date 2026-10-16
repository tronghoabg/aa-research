package Yf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class t extends AbstractC1295a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.b f16876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Xf.c json, kotlinx.serialization.json.b value, String str) {
        super(json, str);
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(value, "value");
        this.f16876f = value;
        this.f16842a.add("primitive");
    }

    @Override // Yf.AbstractC1295a
    public final kotlinx.serialization.json.b F(String tag) {
        AbstractC3340k.e(tag, "tag");
        if (tag == "primitive") {
            return this.f16876f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // Yf.AbstractC1295a
    public final kotlinx.serialization.json.b T() {
        return this.f16876f;
    }

    @Override // Vf.a
    public final int m(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        return 0;
    }
}
