package If;

import Hf.j0;
import Hf.v0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class E extends j0 implements v0 {
    @Override // Hf.v0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f5149h;
            AbstractC3340k.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f5150i + ((int) ((o() + this.k) - this.f5150i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void v(int i5) {
        synchronized (this) {
            Object[] objArr = this.f5149h;
            AbstractC3340k.b(objArr);
            b(Integer.valueOf(((Number) objArr[((int) ((this.f5150i + ((int) ((o() + this.k) - this.f5150i))) - 1)) & (objArr.length - 1)]).intValue() + i5));
        }
    }
}
