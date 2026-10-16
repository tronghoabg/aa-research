package Wf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class F extends C1244d0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15542l;

    public F(String str, G g9) {
        super(str, g9, 1);
        this.f15542l = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ef.i, java.lang.Object] */
    @Override // Wf.C1244d0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f15585a.equals(serialDescriptor.h())) {
                F f10 = (F) obj;
                if (f10.f15542l && Arrays.equals((SerialDescriptor[]) this.f15594j.getValue(), (SerialDescriptor[]) f10.f15594j.getValue())) {
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
        }
        return false;
    }

    @Override // Wf.C1244d0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // Wf.C1244d0, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f15542l;
    }
}
