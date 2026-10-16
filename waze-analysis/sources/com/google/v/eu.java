package com.google.v;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class eu extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a, reason: collision with root package name */
    private boolean f12920a;

    public eu(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.f12920a = true;
    }

    final boolean b() {
        return this.f12920a;
    }

    public eu(String str) {
        super(str);
    }

    public eu(IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}
