package defpackage;

import android.os.StrictMode;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class hsw implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer g;
    public int i;
    private final File k;
    public long f = 0;
    public final LinkedHashMap h = new LinkedHashMap(0, 0.75f, true);
    private long n = 0;
    final ThreadPoolExecutor j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hsu());
    private final Callable o = new qmr(this, 1);
    private final int l = 1;
    public final int d = 1;
    private final long m = 262144000;
    public final boolean e = true;

    public hsw(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.k = new File(file, "journal.bkp");
    }

    public static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void d(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private final void k() {
        if (this.g == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void l(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void m(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsw.b():void");
    }

    public final synchronized void c() throws IOException {
        Writer writer = this.g;
        if (writer != null) {
            l(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), hsz.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.l));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (hsv hsvVar : this.h.values()) {
                if (hsvVar.g != null) {
                    bufferedWriter.write(a.bq(hsvVar.a, "DIRTY ", "\n"));
                } else {
                    bufferedWriter.write("CLEAN " + hsvVar.a + hsvVar.a() + "\n");
                }
            }
            l(bufferedWriter);
            File file = this.b;
            if (file.exists()) {
                d(file, this.k, true);
            }
            d(this.c, file, false);
            this.k.delete();
            this.g = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), hsz.a));
        } catch (Throwable th) {
            l(bufferedWriter);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.g == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.h.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nbu nbuVar = ((hsv) arrayList.get(i)).g;
            if (nbuVar != null) {
                nbuVar.d();
            }
        }
        e();
        l(this.g);
        this.g = null;
    }

    public final void e() throws IOException {
        while (this.f > this.m) {
            g((String) ((Map.Entry) this.h.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean f() {
        int i = this.i;
        return i >= 2000 && i >= this.h.size();
    }

    public final synchronized void g(String str) throws IOException {
        k();
        LinkedHashMap linkedHashMap = this.h;
        hsv hsvVar = (hsv) linkedHashMap.get(str);
        if (hsvVar != null && hsvVar.g == null) {
            for (int i = 0; i < this.d; i = 1) {
                File fileE = hsvVar.e();
                if (fileE.exists() && !fileE.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(fileE))));
                }
                long j = this.f;
                long[] jArr = hsvVar.b;
                this.f = j - jArr[0];
                jArr[0] = 0;
            }
            this.i++;
            this.g.append((CharSequence) "REMOVE");
            this.g.append(' ');
            this.g.append((CharSequence) str);
            this.g.append('\n');
            linkedHashMap.remove(str);
            if (f()) {
                this.j.submit(this.o);
            }
        }
    }

    public final synchronized hwi h(String str) throws IOException {
        k();
        hsv hsvVar = (hsv) this.h.get(str);
        if (hsvVar != null && hsvVar.e) {
            for (int i = 0; i < this.d; i = 1) {
                if (hsvVar.e().exists()) {
                }
            }
            this.i++;
            this.g.append((CharSequence) "READ");
            this.g.append(' ');
            this.g.append((CharSequence) str);
            this.g.append('\n');
            if (f()) {
                this.j.submit(this.o);
            }
            return new hwi(this, str, hsvVar.c);
        }
        return null;
    }

    public final synchronized void i(nbu nbuVar, boolean z) throws IOException {
        Object obj = nbuVar.b;
        if (((hsv) obj).g != nbuVar) {
            throw new IllegalStateException();
        }
        if (z && !((hsv) obj).e) {
            for (int i = 0; i < this.d; i = 1) {
                if (!((boolean[]) nbuVar.c)[0]) {
                    nbuVar.d();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!((hsv) obj).c().exists()) {
                    nbuVar.d();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            File fileC = ((hsv) obj).c();
            if (!z) {
                a(fileC);
            } else if (fileC.exists()) {
                File fileE = ((hsv) obj).e();
                fileC.renameTo(fileE);
                long[] jArr = ((hsv) obj).b;
                long j = jArr[0];
                long length = fileE.length();
                jArr[0] = length;
                this.f = (this.f - j) + length;
            }
        }
        this.i++;
        ((hsv) obj).g = null;
        if (((hsv) obj).e || z) {
            ((hsv) obj).e = true;
            this.g.append((CharSequence) "CLEAN");
            this.g.append(' ');
            this.g.append((CharSequence) ((hsv) obj).a);
            this.g.append((CharSequence) ((hsv) obj).a());
            this.g.append('\n');
            if (z) {
                this.n++;
            }
        } else {
            LinkedHashMap linkedHashMap = this.h;
            String str = ((hsv) obj).a;
            linkedHashMap.remove(str);
            this.g.append((CharSequence) "REMOVE");
            this.g.append(' ');
            this.g.append((CharSequence) str);
            this.g.append('\n');
        }
        m(this.g);
        if (this.f > this.m || f()) {
            this.j.submit(this.o);
        }
    }

    public final synchronized nbu j(String str) throws IOException {
        k();
        LinkedHashMap linkedHashMap = this.h;
        hsv hsvVar = (hsv) linkedHashMap.get(str);
        if (hsvVar == null) {
            hsvVar = new hsv(this, str);
            linkedHashMap.put(str, hsvVar);
        } else if (hsvVar.g != null) {
            return null;
        }
        nbu nbuVar = new nbu(this, hsvVar);
        hsvVar.g = nbuVar;
        this.g.append((CharSequence) "DIRTY");
        this.g.append(' ');
        this.g.append((CharSequence) str);
        this.g.append('\n');
        m(this.g);
        return nbuVar;
    }
}
