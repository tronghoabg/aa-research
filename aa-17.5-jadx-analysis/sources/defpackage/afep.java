package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class afep implements Serializable {
    public static final afep a = new afep();

    private afep() {
    }

    private Object readResolve() throws ObjectStreamException {
        return a;
    }
}
