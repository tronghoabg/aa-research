package Wf;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class D implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f15531a;

    /* renamed from: b, reason: collision with root package name */
    public final SerialDescriptor f15532b;

    /* renamed from: c, reason: collision with root package name */
    public final SerialDescriptor f15533c;

    public D(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f15531a = str;
        this.f15532b = serialDescriptor;
        this.f15533c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        Integer numL0 = Bf.r.l0(name);
        if (numL0 != null) {
            return numL0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        return String.valueOf(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d3 = (D) obj;
        return AbstractC3340k.a(this.f15531a, d3.f15531a) && AbstractC3340k.a(this.f15532b, d3.f15532b) && AbstractC3340k.a(this.f15533c, d3.f15533c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        if (i5 >= 0) {
            return ff.v.f35432a;
        }
        throw new IllegalArgumentException(wg.b.c(pd.f.l(i5, "Illegal index ", ", "), this.f15531a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(wg.b.c(pd.f.l(i5, "Illegal index ", ", "), this.f15531a, " expects only non-negative indices").toString());
        }
        int i10 = i5 % 2;
        if (i10 == 0) {
            return this.f15532b;
        }
        if (i10 == 1) {
            return this.f15533c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ List getAnnotations() {
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        return Uf.j.f12833r;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.f15531a;
    }

    public final int hashCode() {
        return this.f15533c.hashCode() + ((this.f15532b.hashCode() + (this.f15531a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        if (i5 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(wg.b.c(pd.f.l(i5, "Illegal index ", ", "), this.f15531a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.f15531a + '(' + this.f15532b + ", " + this.f15533c + ')';
    }
}
