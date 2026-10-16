package Wf;

import ff.AbstractC2641B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class E extends AbstractC1237a {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f15536a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f15537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15538c;

    /* renamed from: d, reason: collision with root package name */
    public final D f15539d;

    public E(KSerializer kSerializer, KSerializer kSerializer2, byte b5) {
        this.f15536a = kSerializer;
        this.f15537b = kSerializer2;
    }

    @Override // Wf.AbstractC1237a
    public final Object a() {
        switch (this.f15538c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // Wf.AbstractC1237a
    public final int b(Object obj) {
        switch (this.f15538c) {
            case 0:
                HashMap map = (HashMap) obj;
                AbstractC3340k.e(map, "<this>");
                return map.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC3340k.e(linkedHashMap, "<this>");
                return linkedHashMap.size() * 2;
        }
    }

    @Override // Wf.AbstractC1237a
    public final Iterator c(Object obj) {
        switch (this.f15538c) {
            case 0:
                Map map = (Map) obj;
                AbstractC3340k.e(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                AbstractC3340k.e(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // Wf.AbstractC1237a
    public final int d(Object obj) {
        switch (this.f15538c) {
            case 0:
                Map map = (Map) obj;
                AbstractC3340k.e(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                AbstractC3340k.e(map2, "<this>");
                return map2.size();
        }
    }

    @Override // Wf.AbstractC1237a
    public final void f(Vf.a aVar, int i5, Object obj) {
        Map builder = (Map) obj;
        AbstractC3340k.e(builder, "builder");
        Object objD = aVar.D(getDescriptor(), i5, this.f15536a, null);
        int iM = aVar.m(getDescriptor());
        if (iM != i5 + 1) {
            throw new IllegalArgumentException(R8.v.e(i5, iM, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objD);
        KSerializer kSerializer = this.f15537b;
        builder.put(objD, (!zContainsKey || (kSerializer.getDescriptor().getKind() instanceof Uf.f)) ? aVar.D(getDescriptor(), iM, kSerializer, null) : aVar.D(getDescriptor(), iM, kSerializer, AbstractC2641B.v(objD, builder)));
    }

    @Override // Wf.AbstractC1237a
    public final Object g(Object obj) {
        switch (this.f15538c) {
            case 0:
                AbstractC3340k.e(null, "<this>");
                return new HashMap((Map) null);
            default:
                AbstractC3340k.e(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f15538c) {
        }
        return this.f15539d;
    }

    @Override // Wf.AbstractC1237a
    public final Object h(Object obj) {
        switch (this.f15538c) {
            case 0:
                HashMap map = (HashMap) obj;
                AbstractC3340k.e(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC3340k.e(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        Vf.b bVarK = encoder.k(descriptor, iD);
        Iterator itC = c(obj);
        int i5 = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i5 + 1;
            bVarK.f(getDescriptor(), i5, this.f15536a, key);
            i5 += 2;
            bVarK.f(getDescriptor(), i10, this.f15537b, value);
        }
        bVarK.c(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(KSerializer kSerializer, KSerializer vSerializer, int i5) {
        this(kSerializer, vSerializer, (byte) 0);
        this.f15538c = i5;
        switch (i5) {
            case 1:
                AbstractC3340k.e(kSerializer, "kSerializer");
                AbstractC3340k.e(vSerializer, "vSerializer");
                this(kSerializer, vSerializer, (byte) 0);
                SerialDescriptor keyDesc = kSerializer.getDescriptor();
                SerialDescriptor valueDesc = vSerializer.getDescriptor();
                AbstractC3340k.e(keyDesc, "keyDesc");
                AbstractC3340k.e(valueDesc, "valueDesc");
                this.f15539d = new D("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                break;
            default:
                AbstractC3340k.e(kSerializer, "kSerializer");
                AbstractC3340k.e(vSerializer, "vSerializer");
                SerialDescriptor keyDesc2 = kSerializer.getDescriptor();
                SerialDescriptor valueDesc2 = vSerializer.getDescriptor();
                AbstractC3340k.e(keyDesc2, "keyDesc");
                AbstractC3340k.e(valueDesc2, "valueDesc");
                this.f15539d = new D("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                break;
        }
    }
}
