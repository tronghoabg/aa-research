package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class afgr extends afgs implements Serializable {
    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return afgq.a;
    }

    @Override // defpackage.afgs
    public final int c(int i) {
        return afgs.b.c(i);
    }

    @Override // defpackage.afgs
    public final long d() {
        return afgs.b.d();
    }

    @Override // defpackage.afgs
    public final long hv() {
        return afgs.b.hv();
    }
}
