package Xf;

import Wf.D;
import Wf.q0;
import ff.AbstractC2641B;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class t implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final t f16291b = new t();

    /* renamed from: c, reason: collision with root package name */
    public static final String f16292c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f16293a;

    public t() {
        q0 q0Var = q0.f15625a;
        this.f16293a = AbstractC2641B.a(k.f16281a).f15539d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.f16293a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        return this.f16293a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        this.f16293a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        this.f16293a.getClass();
        return String.valueOf(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        this.f16293a.f(i5);
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        return this.f16293a.g(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f16293a.getClass();
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        this.f16293a.getClass();
        return Uf.j.f12833r;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return f16292c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        this.f16293a.i(i5);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f16293a.getClass();
        return false;
    }
}
