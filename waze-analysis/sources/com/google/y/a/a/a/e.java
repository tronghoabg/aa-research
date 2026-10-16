package com.google.y.a.a.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends IOException {
    public e(Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }

    public e(String str) {
        super(str);
    }
}
