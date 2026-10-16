package Xf;

import Wf.C1239b;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class d implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final d f16255b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f16256c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1239b f16257a;

    public d() {
        SerialDescriptor elementDesc = k.f16281a.getDescriptor();
        AbstractC3340k.e(elementDesc, "elementDesc");
        this.f16257a = new C1239b(elementDesc, 1);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        this.f16257a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        return this.f16257a.c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        this.f16257a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        this.f16257a.getClass();
        return String.valueOf(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        this.f16257a.f(i5);
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        return this.f16257a.g(i5);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f16257a.getClass();
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        this.f16257a.getClass();
        return Uf.j.f12832q;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return f16256c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        this.f16257a.i(i5);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f16257a.getClass();
        return false;
    }
}
