package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class uox extends IOException {
    public final int a;

    public uox(Throwable th) {
        int i;
        super(th);
        int i2 = 0;
        if ((th instanceof pim) && (i = ((pim) th).b) >= 65536 && i < 81920) {
            i2 = i - 65536;
        }
        this.a = i2;
    }

    public uox() {
        super("Failed to create sqlite disk cache directory");
        this.a = 0;
    }
}
