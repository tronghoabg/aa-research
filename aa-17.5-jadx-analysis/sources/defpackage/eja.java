package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class eja {
    public static volatile eja a = null;
    public static final eja b = new eja(null);
    private static volatile boolean d = false;
    public final Map c;

    eja() {
        this.c = new HashMap();
    }

    public eja(byte[] bArr) {
        this.c = Collections.EMPTY_MAP;
    }
}
