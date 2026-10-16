package Uf;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class b implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final g f12801a;

    /* renamed from: b, reason: collision with root package name */
    public final KClass f12802b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12803c;

    public b(g gVar, KClass kClass) {
        AbstractC3340k.e(kClass, "kClass");
        this.f12801a = gVar;
        this.f12802b = kClass;
        this.f12803c = gVar.f12815a + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        return this.f12801a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.f12801a.f12817c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        return this.f12801a.f12820f[i5];
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f12801a.equals(bVar.f12801a) && AbstractC3340k.a(bVar.f12802b, this.f12802b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        return this.f12801a.f12822h[i5];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        return this.f12801a.f12821g[i5];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f12801a.f12818d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        return this.f12801a.f12816b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.f12803c;
    }

    public final int hashCode() {
        return this.f12803c.hashCode() + (this.f12802b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        return this.f12801a.f12823i[i5];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f12802b + ", original: " + this.f12801a + ')';
    }
}
