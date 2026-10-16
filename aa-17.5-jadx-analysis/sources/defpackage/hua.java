package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class hua extends IOException {
    private static final long serialVersionUID = 1;

    public hua(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
