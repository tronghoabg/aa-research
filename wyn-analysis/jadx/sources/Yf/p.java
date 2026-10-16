package Yf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class p extends C3338i implements tf.p {
    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        SerialDescriptor p02 = (SerialDescriptor) obj;
        int iIntValue = ((Number) obj2).intValue();
        AbstractC3340k.e(p02, "p0");
        q qVar = (q) this.receiver;
        qVar.getClass();
        boolean z2 = !p02.i(iIntValue) && p02.g(iIntValue).b();
        qVar.f16873b = z2;
        return Boolean.valueOf(z2);
    }
}
