package Wf;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class k0 implements SerialDescriptor, InterfaceC1253k {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f15611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15612b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f15613c;

    public k0(SerialDescriptor original) {
        AbstractC3340k.e(original, "original");
        this.f15611a = original;
        this.f15612b = original.h() + '?';
        this.f15613c = AbstractC1240b0.b(original);
    }

    @Override // Wf.InterfaceC1253k
    public final Set a() {
        return this.f15613c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        return this.f15611a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.f15611a.d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        return this.f15611a.e(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return AbstractC3340k.a(this.f15611a, ((k0) obj).f15611a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        return this.f15611a.f(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        return this.f15611a.g(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f15611a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        return this.f15611a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.f15612b;
    }

    public final int hashCode() {
        return this.f15611a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        return this.f15611a.i(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f15611a.isInline();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15611a);
        sb2.append('?');
        return sb2.toString();
    }
}
