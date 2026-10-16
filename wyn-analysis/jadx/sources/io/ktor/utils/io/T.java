package io.ktor.utils.io;

import java.io.IOException;

/* loaded from: classes5.dex */
public class T extends IOException {
    public T(Throwable th) {
        super(th != null ? th.getMessage() : null, th);
    }
}
