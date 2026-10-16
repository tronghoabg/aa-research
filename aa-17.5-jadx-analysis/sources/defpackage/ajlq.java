package defpackage;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ajlq extends IOException {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajlq(int i) {
        super("stream was reset: ".concat(ahek.a(i)));
        Objects.toString(ahek.a(i));
        this.a = i;
    }
}
