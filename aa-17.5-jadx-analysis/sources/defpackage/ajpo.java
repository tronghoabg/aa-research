package defpackage;

import java.nio.charset.CharacterCodingException;

/* loaded from: classes2.dex */
public final class ajpo extends CharacterCodingException {
    private static final long serialVersionUID = 6077207720446368695L;
    private final String a;

    public ajpo(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
