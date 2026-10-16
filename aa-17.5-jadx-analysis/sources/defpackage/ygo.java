package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ygo extends ybw implements Serializable {
    public static final ygo a;
    public static final ygo b;
    private final transient yfq c;

    static {
        int i = yfq.d;
        a = new ygo(yls.a);
        b = new ygo(yfq.q(ylp.a));
    }

    public ygo(yfq yfqVar) {
        this.c = yfqVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ylq
    public final /* bridge */ /* synthetic */ Set a() {
        yfq yfqVar = this.c;
        if (yfqVar.isEmpty()) {
            return yly.a;
        }
        ylp ylpVar = ylp.a;
        return new ylz(yfqVar, ylo.a);
    }

    Object writeReplace() {
        return new ygn(this.c);
    }
}
