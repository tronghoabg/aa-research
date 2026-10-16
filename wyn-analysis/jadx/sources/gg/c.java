package gg;

import com.applovin.shadow.okio.Segment;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f35914a;

    static {
        char c10 = File.separatorChar;
        f35914a = new byte[0];
        System.lineSeparator();
        d.f35916b.getClass();
        d.f35915a.getClass();
        final int i5 = 0;
        final Supplier supplier = new Supplier() { // from class: gg.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i5) {
                    case 0:
                        return new byte[Segment.SIZE];
                    default:
                        return new char[Segment.SIZE];
                }
            }
        };
        final int i10 = 0;
        new ThreadLocal() { // from class: gg.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (i10) {
                    case 0:
                        ((a) supplier).getClass();
                        return new byte[Segment.SIZE];
                    default:
                        ((a) supplier).getClass();
                        return new char[Segment.SIZE];
                }
            }
        };
        final int i11 = 1;
        final Supplier supplier2 = new Supplier() { // from class: gg.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i11) {
                    case 0:
                        return new byte[Segment.SIZE];
                    default:
                        return new char[Segment.SIZE];
                }
            }
        };
        final int i12 = 1;
        new ThreadLocal() { // from class: gg.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (i12) {
                    case 0:
                        ((a) supplier2).getClass();
                        return new byte[Segment.SIZE];
                    default:
                        ((a) supplier2).getClass();
                        return new char[Segment.SIZE];
                }
            }
        };
    }

    public static void a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j8 = 0;
        while (true) {
            int i5 = inputStream.read(bArr);
            if (-1 == i5) {
                break;
            }
            outputStream.write(bArr, 0, i5);
            j8 += i5;
        }
        if (j8 > 2147483647L) {
            return -1;
        }
        return (int) j8;
    }
}
