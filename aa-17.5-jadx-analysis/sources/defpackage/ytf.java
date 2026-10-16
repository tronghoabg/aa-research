package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ytf implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public ytf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private Object readResolve() {
        return new ytg(this.a, this.b);
    }
}
