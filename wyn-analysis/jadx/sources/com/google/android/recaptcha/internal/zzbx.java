package com.google.android.recaptcha.internal;

import A6.h;
import Ba.c;
import ff.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import qf.C3893a;

/* loaded from: classes4.dex */
public final class zzbx {
    @NotNull
    public static final byte[] zza(@NotNull File file) throws GeneralSecurityException, IOException {
        AbstractC3340k.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i5 = (int) length;
            byte[] bArrCopyOf = new byte[i5];
            int i10 = i5;
            int i11 = 0;
            while (i10 > 0) {
                int i12 = fileInputStream.read(bArrCopyOf, i11, i10);
                if (i12 < 0) {
                    break;
                }
                i10 -= i12;
                i11 += i12;
            }
            if (i10 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i13 = fileInputStream.read();
                if (i13 != -1) {
                    C3893a c3893a = new C3893a(8193);
                    c3893a.write(i13);
                    h.o(fileInputStream, c3893a);
                    int size = c3893a.size() + i5;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrB = c3893a.b();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    AbstractC3340k.d(bArrCopyOf, "copyOf(...)");
                    m.f0(i5, 0, c3893a.size(), bArrB, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.n(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(@NotNull File file, @NotNull byte[] array) throws GeneralSecurityException, IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        AbstractC3340k.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
        } finally {
        }
    }
}
