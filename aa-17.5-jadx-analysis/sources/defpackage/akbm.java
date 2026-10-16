package defpackage;

import org.chromium.net.CronetProvider;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes2.dex */
public final class akbm {
    public CronetProvider a;
    public int b;
    public CronetLogger.CronetSource c;

    public final boolean equals(Object obj) {
        return (obj instanceof akbm) && this.a.equals(((akbm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
