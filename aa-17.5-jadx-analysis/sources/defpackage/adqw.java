package defpackage;

import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public final class adqw extends adjx {
    public final CronetEngine a;
    public final erb b = aeac.i;
    private final adwb c;

    private adqw(String str, int i, CronetEngine cronetEngine) {
        this.c = new adwb(InetSocketAddress.createUnresolved(str, i), adue.d(str, i), new aeas(this, 1));
        this.a = cronetEngine;
    }

    public static adqw c(String str, int i, CronetEngine cronetEngine) {
        cronetEngine.getClass();
        return new adqw(str, i, cronetEngine);
    }

    @Override // defpackage.adjx
    protected final adlo b() {
        return this.c;
    }
}
