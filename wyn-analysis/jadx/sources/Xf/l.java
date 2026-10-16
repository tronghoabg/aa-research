package Xf;

import ef.C2532p;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class l implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final C2532p f16283a;

    public l(tf.a aVar) {
        this.f16283a = Fe.c.z(aVar);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.f16283a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        return a().c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return a().d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        return a().e(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        return a().f(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        return a().g(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ List getAnnotations() {
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        return a().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return a().h();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        return a().i(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }
}
