package Wf;

import ef.EnumC2526j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Wf.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1244d0 implements SerialDescriptor, InterfaceC1253k {

    /* renamed from: a, reason: collision with root package name */
    public final String f15585a;

    /* renamed from: b, reason: collision with root package name */
    public final C f15586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15587c;

    /* renamed from: d, reason: collision with root package name */
    public int f15588d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f15589e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f15590f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f15591g;

    /* renamed from: h, reason: collision with root package name */
    public Object f15592h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f15593i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f15594j;
    public final Object k;

    public C1244d0(String str, C c10, int i5) {
        this.f15585a = str;
        this.f15586b = c10;
        this.f15587c = i5;
        String[] strArr = new String[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f15589e = strArr;
        int i11 = this.f15587c;
        this.f15590f = new List[i11];
        this.f15591g = new boolean[i11];
        this.f15592h = ff.w.f35433a;
        EnumC2526j enumC2526j = EnumC2526j.f34668b;
        final int i12 = 0;
        this.f15593i = Fe.c.y(enumC2526j, new tf.a(this) { // from class: Wf.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1244d0 f15582b;

            {
                this.f15582b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [ef.i, java.lang.Object] */
            @Override // tf.a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i12) {
                    case 0:
                        C c11 = this.f15582b.f15586b;
                        return (c11 == null || (kSerializerArrChildSerializers = c11.childSerializers()) == null) ? AbstractC1240b0.f15577b : kSerializerArrChildSerializers;
                    case 1:
                        C c12 = this.f15582b.f15586b;
                        if (c12 == null || (kSerializerArrTypeParametersSerializers = c12.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC1240b0.c(arrayList);
                    default:
                        C1244d0 c1244d0 = this.f15582b;
                        return Integer.valueOf(AbstractC1240b0.f(c1244d0, (SerialDescriptor[]) c1244d0.f15594j.getValue()));
                }
            }
        });
        final int i13 = 1;
        this.f15594j = Fe.c.y(enumC2526j, new tf.a(this) { // from class: Wf.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1244d0 f15582b;

            {
                this.f15582b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [ef.i, java.lang.Object] */
            @Override // tf.a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        C c11 = this.f15582b.f15586b;
                        return (c11 == null || (kSerializerArrChildSerializers = c11.childSerializers()) == null) ? AbstractC1240b0.f15577b : kSerializerArrChildSerializers;
                    case 1:
                        C c12 = this.f15582b.f15586b;
                        if (c12 == null || (kSerializerArrTypeParametersSerializers = c12.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC1240b0.c(arrayList);
                    default:
                        C1244d0 c1244d0 = this.f15582b;
                        return Integer.valueOf(AbstractC1240b0.f(c1244d0, (SerialDescriptor[]) c1244d0.f15594j.getValue()));
                }
            }
        });
        final int i14 = 2;
        this.k = Fe.c.y(enumC2526j, new tf.a(this) { // from class: Wf.c0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1244d0 f15582b;

            {
                this.f15582b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [ef.i, java.lang.Object] */
            @Override // tf.a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i14) {
                    case 0:
                        C c11 = this.f15582b.f15586b;
                        return (c11 == null || (kSerializerArrChildSerializers = c11.childSerializers()) == null) ? AbstractC1240b0.f15577b : kSerializerArrChildSerializers;
                    case 1:
                        C c12 = this.f15582b.f15586b;
                        if (c12 == null || (kSerializerArrTypeParametersSerializers = c12.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC1240b0.c(arrayList);
                    default:
                        C1244d0 c1244d0 = this.f15582b;
                        return Integer.valueOf(AbstractC1240b0.f(c1244d0, (SerialDescriptor[]) c1244d0.f15594j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Wf.InterfaceC1253k
    public final Set a() {
        return this.f15592h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        Integer num = (Integer) this.f15592h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.f15587c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        return this.f15589e[i5];
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ef.i, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1244d0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f15585a.equals(serialDescriptor.h()) && Arrays.equals((SerialDescriptor[]) this.f15594j.getValue(), (SerialDescriptor[]) ((C1244d0) obj).f15594j.getValue())) {
                int iD = serialDescriptor.d();
                int i5 = this.f15587c;
                if (i5 == iD) {
                    for (int i10 = 0; i10 < i5; i10++) {
                        if (AbstractC3340k.a(g(i10).h(), serialDescriptor.g(i10).h()) && AbstractC3340k.a(g(i10).getKind(), serialDescriptor.g(i10).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        List list = this.f15590f[i5];
        return list == null ? ff.v.f35432a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ef.i, java.lang.Object] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor g(int i5) {
        return ((KSerializer[]) this.f15593i.getValue())[i5].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public S3.f getKind() {
        return Uf.j.f12831p;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.f15585a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ef.i, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        return this.f15591g[i5];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean isInline() {
        return false;
    }

    public final void j(String name, boolean z2) {
        AbstractC3340k.e(name, "name");
        int i5 = this.f15588d + 1;
        this.f15588d = i5;
        String[] strArr = this.f15589e;
        strArr[i5] = name;
        this.f15591g[i5] = z2;
        this.f15590f[i5] = null;
        if (i5 == this.f15587c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f15592h = map;
        }
    }

    public String toString() {
        return AbstractC1240b0.m(this);
    }
}
