package Wf;

import ef.C2532p;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Wf.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1266y extends C1244d0 {

    /* renamed from: l, reason: collision with root package name */
    public final Uf.i f15657l;

    /* renamed from: m, reason: collision with root package name */
    public final C2532p f15658m;

    public C1266y(final String str, final int i5) {
        super(str, null, i5);
        this.f15657l = Uf.i.f12830q;
        this.f15658m = Fe.c.z(new tf.a() { // from class: Wf.x
            @Override // tf.a
            public final Object invoke() {
                int i10 = i5;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    serialDescriptorArr[i11] = Fe.g.t(str + '.' + this.f15589e[i11], Uf.j.f12834s, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            }
        });
    }

    @Override // Wf.C1244d0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (serialDescriptor.getKind() != Uf.i.f12830q) {
            return false;
        }
        return this.f15585a.equals(serialDescriptor.h()) && AbstractC3340k.a(AbstractC1240b0.b(this), AbstractC1240b0.b(serialDescriptor));
    }

    @Override // Wf.C1244d0, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        return ((SerialDescriptor[]) this.f15658m.getValue())[i5];
    }

    @Override // Wf.C1244d0, kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        return this.f15657l;
    }

    @Override // Wf.C1244d0
    public final int hashCode() {
        int iHashCode = this.f15585a.hashCode();
        Uf.h hVar = new Uf.h(this);
        int iHashCode2 = 1;
        while (hVar.hasNext()) {
            int i5 = iHashCode2 * 31;
            String str = (String) hVar.next();
            iHashCode2 = i5 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // Wf.C1244d0
    public final String toString() {
        return ff.o.w0(new Af.t(this, 1), ", ", this.f15585a.concat("("), ")", null, 56);
    }
}
