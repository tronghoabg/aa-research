package j$.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedReader f37468a;

    /* renamed from: b, reason: collision with root package name */
    String f37469b = null;

    a(BufferedReader bufferedReader) {
        this.f37468a = bufferedReader;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f37469b != null) {
            return true;
        }
        try {
            String line = this.f37468a.readLine();
            this.f37469b = line;
            return line != null;
        } catch (IOException e7) {
            throw new UncheckedIOException(e7);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f37469b != null || hasNext()) {
            String str = this.f37469b;
            this.f37469b = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
