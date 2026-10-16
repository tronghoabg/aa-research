package Wf;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public abstract class L implements SerialDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f15552a;

    public L(SerialDescriptor serialDescriptor) {
        this.f15552a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        AbstractC3340k.e(name, "name");
        Integer numL0 = Bf.r.l0(name);
        if (numL0 != null) {
            return numL0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e(int i5) {
        return String.valueOf(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return AbstractC3340k.a(this.f15552a, l10.f15552a) && AbstractC3340k.a(h(), l10.h());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List f(int i5) {
        if (i5 >= 0) {
            return ff.v.f35432a;
        }
        StringBuilder sbL = pd.f.l(i5, "Illegal index ", ", ");
        sbL.append(h());
        sbL.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i5) {
        if (i5 >= 0) {
            return this.f15552a;
        }
        StringBuilder sbL = pd.f.l(i5, "Illegal index ", ", ");
        sbL.append(h());
        sbL.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ List getAnnotations() {
        return ff.v.f35432a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final S3.f getKind() {
        return Uf.j.f12832q;
    }

    public final int hashCode() {
        return h().hashCode() + (this.f15552a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i5) {
        if (i5 >= 0) {
            return false;
        }
        StringBuilder sbL = pd.f.l(i5, "Illegal index ", ", ");
        sbL.append(h());
        sbL.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        return h() + '(' + this.f15552a + ')';
    }
}
