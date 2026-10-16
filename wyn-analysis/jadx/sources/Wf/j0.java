package Wf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class j0 extends r {

    /* renamed from: b, reason: collision with root package name */
    public final KClass f15609b;

    /* renamed from: c, reason: collision with root package name */
    public final C1239b f15610c;

    public j0(KClass kClass, KSerializer kSerializer) {
        super(kSerializer);
        this.f15609b = kClass;
        SerialDescriptor elementDesc = kSerializer.getDescriptor();
        AbstractC3340k.e(elementDesc, "elementDesc");
        this.f15610c = new C1239b(elementDesc, 0);
    }

    @Override // Wf.AbstractC1237a
    public final Object a() {
        return new ArrayList();
    }

    @Override // Wf.AbstractC1237a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC3340k.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // Wf.AbstractC1237a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC3340k.e(objArr, "<this>");
        return AbstractC3340k.i(objArr);
    }

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC3340k.e(objArr, "<this>");
        return objArr.length;
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        AbstractC3340k.e(null, "<this>");
        ff.m.c0(null);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f15610c;
    }

    @Override // Wf.AbstractC1237a
    public final Object h(Object obj) throws NegativeArraySizeException {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC3340k.e(arrayList, "<this>");
        KClass eClass = this.f15609b;
        AbstractC3340k.e(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) Fe.b.y(eClass), arrayList.size());
        AbstractC3340k.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        AbstractC3340k.d(array, "toArray(...)");
        return array;
    }

    @Override // Wf.r
    public final void i(int i5, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC3340k.e(arrayList, "<this>");
        arrayList.add(i5, obj2);
    }
}
