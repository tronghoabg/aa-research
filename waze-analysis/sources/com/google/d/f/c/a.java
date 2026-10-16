package com.google.d.f.c;

import com.google.d.f.b.k;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class a {
    public a() {
    }

    public static a e() {
        return c.b();
    }

    public static /* synthetic */ int f(int i2, int i3) {
        long j2 = i2 + i3;
        int i4 = (int) j2;
        if (j2 == i4) {
            return i4;
        }
        throw new ArithmeticException();
    }

    public static void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public k a() {
        return k.g();
    }

    public j c() {
        return j.a();
    }

    public void d(String str, Level level, boolean z) {
    }

    protected a(byte[] bArr) {
    }
}
