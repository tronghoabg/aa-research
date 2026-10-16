package Uf;

import Af.q;
import Af.t;
import Wf.AbstractC1240b0;
import Wf.InterfaceC1253k;
import ef.C2527k;
import ef.C2532p;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import ff.o;
import ff.p;
import ff.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class g implements SerialDescriptor, InterfaceC1253k {

    /* renamed from: a, reason: collision with root package name */
    public final String f12815a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.f f12816b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12817c;

    /* renamed from: d, reason: collision with root package name */
    public final List f12818d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f12819e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f12820f;

    /* renamed from: g, reason: collision with root package name */
    public final SerialDescriptor[] f12821g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f12822h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f12823i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f12824j;
    public final SerialDescriptor[] k;

    /* renamed from: l, reason: collision with root package name */
    public final C2532p f12825l;

    public g(String serialName, S3.f fVar, int i5, List list, a aVar) {
        AbstractC3340k.e(serialName, "serialName");
        this.f12815a = serialName;
        this.f12816b = fVar;
        this.f12817c = i5;
        this.f12818d = aVar.f12795b;
        ArrayList arrayList = aVar.f12796c;
        AbstractC3340k.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC2641B.D(p.a0(arrayList, 12)));
        o.Q0(arrayList, hashSet);
        this.f12819e = hashSet;
        int i10 = 0;
        this.f12820f = (String[]) arrayList.toArray(new String[0]);
        this.f12821g = AbstractC1240b0.c(aVar.f12798e);
        this.f12822h = (List[]) aVar.f12799f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f12800g;
        AbstractC3340k.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        this.f12823i = zArr;
        String[] strArr = this.f12820f;
        AbstractC3340k.e(strArr, "<this>");
        t tVar = new t(new q(strArr, 27), 3);
        ArrayList arrayList3 = new ArrayList(p.a0(tVar, 10));
        Iterator it2 = tVar.iterator();
        while (true) {
            Af.b bVar = (Af.b) it2;
            if (!bVar.f1290c.hasNext()) {
                this.f12824j = AbstractC2640A.X(arrayList3);
                this.k = AbstractC1240b0.c(list);
                this.f12825l = Fe.c.z(new q(this, 2));
                return;
            }
            y yVar = (y) bVar.next();
            arrayList3.add(new C2527k(yVar.f35436b, Integer.valueOf(yVar.f35435a)));
        }
    }

    @Override // Wf.InterfaceC1253k
    public final Set a() {
        return this.f12819e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        Integer num = (Integer) this.f12824j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return this.f12817c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        return this.f12820f[i5];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (AbstractC3340k.a(this.f12815a, serialDescriptor.h()) && Arrays.equals(this.k, ((g) obj).k)) {
                int iD = serialDescriptor.d();
                int i5 = this.f12817c;
                if (i5 == iD) {
                    for (int i10 = 0; i10 < i5; i10++) {
                        SerialDescriptor[] serialDescriptorArr = this.f12821g;
                        if (AbstractC3340k.a(serialDescriptorArr[i10].h(), serialDescriptor.g(i10).h()) && AbstractC3340k.a(serialDescriptorArr[i10].getKind(), serialDescriptor.g(i10).getKind())) {
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
        return this.f12822h[i5];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        return this.f12821g[i5];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f12818d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        return this.f12816b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.f12815a;
    }

    public final int hashCode() {
        return ((Number) this.f12825l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        return this.f12823i[i5];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        return AbstractC1240b0.m(this);
    }
}
