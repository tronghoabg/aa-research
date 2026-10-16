package com.bumptech.glide.load;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends IOException {
    private static final long serialVersionUID = 1;

    public c(String str, int i2, Throwable th) {
        super(str + ", status code: " + i2, th);
    }

    public c(String str, int i2) {
        this(str, i2, null);
    }
}
