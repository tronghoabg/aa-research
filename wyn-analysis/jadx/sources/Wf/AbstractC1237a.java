package Wf;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: Wf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1237a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Object objA = a();
        int iB = b(objA);
        Vf.a aVarB = decoder.b(getDescriptor());
        while (true) {
            int iM = aVarB.m(getDescriptor());
            if (iM == -1) {
                aVarB.c(getDescriptor());
                return h(objA);
            }
            f(aVarB, iM + iB, objA);
        }
    }

    public abstract void f(Vf.a aVar, int i5, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
