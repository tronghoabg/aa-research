package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public class ajqu extends IOException {
    private static final long serialVersionUID = -5596590843227115865L;

    public ajqu(Throwable th) {
        initCause(th);
    }

    public ajqu(String str) {
        super(str);
    }
}
