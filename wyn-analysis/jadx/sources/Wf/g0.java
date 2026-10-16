package Wf;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public abstract class g0 extends r {

    /* renamed from: b, reason: collision with root package name */
    public final C1248f0 f15601b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        AbstractC3340k.e(primitiveSerializer, "primitiveSerializer");
        this.f15601b = new C1248f0(primitiveSerializer.getDescriptor());
    }

    @Override // Wf.AbstractC1237a
    public final Object a() {
        return (AbstractC1246e0) g(j());
    }

    @Override // Wf.AbstractC1237a
    public final int b(Object obj) {
        AbstractC1246e0 abstractC1246e0 = (AbstractC1246e0) obj;
        AbstractC3340k.e(abstractC1246e0, "<this>");
        return abstractC1246e0.d();
    }

    @Override // Wf.AbstractC1237a
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // Wf.AbstractC1237a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f15601b;
    }

    @Override // Wf.AbstractC1237a
    public final Object h(Object obj) {
        AbstractC1246e0 abstractC1246e0 = (AbstractC1246e0) obj;
        AbstractC3340k.e(abstractC1246e0, "<this>");
        return abstractC1246e0.a();
    }

    @Override // Wf.r
    public final void i(int i5, Object obj, Object obj2) {
        AbstractC3340k.e((AbstractC1246e0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(Vf.b bVar, Object obj, int i5);

    @Override // Wf.r, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int iD = d(obj);
        C1248f0 c1248f0 = this.f15601b;
        Vf.b bVarK = encoder.k(c1248f0, iD);
        k(bVarK, obj, iD);
        bVarK.c(c1248f0);
    }
}
