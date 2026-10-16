package Xf;

import Yf.H;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class p extends kotlinx.serialization.json.d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16284a;

    /* renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f16285b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16286c;

    public p(Serializable body, boolean z2, SerialDescriptor serialDescriptor) {
        AbstractC3340k.e(body, "body");
        this.f16284a = z2;
        this.f16285b = serialDescriptor;
        this.f16286c = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.d
    public final String a() {
        return this.f16286c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f16284a == pVar.f16284a && AbstractC3340k.a(this.f16286c, pVar.f16286c);
    }

    public final int hashCode() {
        return this.f16286c.hashCode() + ((this.f16284a ? 1231 : 1237) * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final String toString() {
        boolean z2 = this.f16284a;
        String str = this.f16286c;
        if (!z2) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        H.a(str, sb2);
        return sb2.toString();
    }
}
