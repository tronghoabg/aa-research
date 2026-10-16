package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class acai implements Serializable, abnz, acag, acah {
    public static final acai U = new acai(-1);
    private final int V;

    public acai(int i) {
        this.V = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        if (this != U) {
            return this.V;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(this.V);
    }
}
