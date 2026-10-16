package Wf;

import A7.AbstractC0279p0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class h0 implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final String f15603a;

    /* renamed from: b, reason: collision with root package name */
    public final Uf.f f15604b;

    public h0(String str, Uf.f kind) {
        AbstractC3340k.e(kind, "kind");
        this.f15603a = str;
        this.f15604b = kind;
    }

    public final void a() {
        throw new IllegalStateException(wg.b.c(new StringBuilder("Primitive descriptor "), this.f15603a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (AbstractC3340k.a(this.f15603a, h0Var.f15603a)) {
            if (AbstractC3340k.a(this.f15604b, h0Var.f15604b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ List getAnnotations() {
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        return this.f15604b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.f15603a;
    }

    public final int hashCode() {
        return (this.f15604b.hashCode() * 31) + this.f15603a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("PrimitiveDescriptor("), this.f15603a, ')');
    }
}
