package defpackage;

import defpackage.eid;
import defpackage.eie;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class eie<MessageType extends eie<MessageType, BuilderType>, BuilderType extends eid<MessageType, BuilderType>> implements eke {
    protected int memoizedHashCode = 0;

    public int c(ekp ekpVar) {
        throw null;
    }

    @Override // defpackage.eke
    public final eip d() {
        try {
            int iH = h();
            eip eipVar = eip.b;
            byte[] bArr = new byte[iH];
            boolean z = eiw.e;
            eiu eiuVar = new eiu(bArr, iH);
            r(eiuVar);
            return dtd.g(eiuVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
