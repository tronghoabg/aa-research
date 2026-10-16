package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class ajov extends IOException {
    private static final long serialVersionUID = 617550366255636674L;

    public ajov(Object... objArr) {
        super(ajpd.a(String.format("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", objArr)));
    }

    public ajov() {
        super(ajpd.a("Premature end of chunk coded message body: closing chunk expected"));
    }
}
