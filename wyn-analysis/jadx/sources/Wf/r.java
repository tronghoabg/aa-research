package Wf;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public abstract class r extends AbstractC1237a {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f15627a;

    public r(KSerializer kSerializer) {
        this.f15627a = kSerializer;
    }

    @Override // Wf.AbstractC1237a
    public void f(Vf.a aVar, int i5, Object obj) {
        i(i5, obj, aVar.D(getDescriptor(), i5, this.f15627a, null));
    }

    public abstract void i(int i5, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        Vf.b bVarK = encoder.k(descriptor, iD);
        Iterator itC = c(obj);
        for (int i5 = 0; i5 < iD; i5++) {
            bVarK.f(getDescriptor(), i5, this.f15627a, itC.next());
        }
        bVarK.c(descriptor);
    }
}
