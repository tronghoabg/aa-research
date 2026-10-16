package com.bumptech.glide.a;

import android.os.StrictMode;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private final File f2720b;

    /* renamed from: c, reason: collision with root package name */
    private final File f2721c;

    /* renamed from: d, reason: collision with root package name */
    private final File f2722d;

    /* renamed from: e, reason: collision with root package name */
    private final File f2723e;

    /* renamed from: k, reason: collision with root package name */
    private Writer f2729k;
    private int m;

    /* renamed from: j, reason: collision with root package name */
    private long f2728j = 0;

    /* renamed from: l, reason: collision with root package name */
    private final LinkedHashMap f2730l = new LinkedHashMap(0, 0.75f, true);
    private long n = 0;

    /* renamed from: a, reason: collision with root package name */
    final ThreadPoolExecutor f2719a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    private final Callable o = new a(this);

    /* renamed from: f, reason: collision with root package name */
    private final int f2724f = 1;

    /* renamed from: h, reason: collision with root package name */
    private final int f2726h = 1;

    /* renamed from: g, reason: collision with root package name */
    private final long f2725g = 262144000;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2727i = true;

    private f(File file) {
        this.f2720b = file;
        this.f2721c = new File(file, "journal");
        this.f2722d = new File(file, "journal.tmp");
        this.f2723e = new File(file, "journal.bkp");
    }

    public static f l(File file) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                u(file2, file3, false);
            }
        }
        f fVar = new f(file);
        if (fVar.f2721c.exists()) {
            try {
                fVar.s();
                q(fVar.f2722d);
                Iterator it = fVar.f2730l.values().iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f2715g == null) {
                        for (int i2 = 0; i2 < fVar.f2726h; i2 = 1) {
                            fVar.f2728j += dVar.f2713e[0];
                        }
                    } else {
                        dVar.f2715g = null;
                        for (int i3 = 0; i3 < fVar.f2726h; i3 = 1) {
                            q(dVar.i());
                            q(dVar.j());
                        }
                        it.remove();
                    }
                }
                return fVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e2.getMessage() + ", removing");
                fVar.close();
                i.b(fVar.f2720b);
            }
        }
        file.mkdirs();
        f fVar2 = new f(file);
        fVar2.t();
        return fVar2;
    }

    private final void n() {
        if (this.f2729k == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void o(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void p(c cVar, boolean z) {
        d dVar = cVar.f2706b;
        if (dVar.f2715g != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.f2714f) {
            for (int i2 = 0; i2 < this.f2726h; i2 = 1) {
                if (!cVar.f2707c[0]) {
                    cVar.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!dVar.j().exists()) {
                    cVar.b();
                    return;
                }
            }
        }
        for (int i3 = 0; i3 < this.f2726h; i3 = 1) {
            File fileJ = dVar.j();
            if (!z) {
                q(fileJ);
            } else if (fileJ.exists()) {
                File fileI = dVar.i();
                fileJ.renameTo(fileI);
                long j2 = dVar.f2713e[0];
                long length = fileI.length();
                dVar.f2713e[0] = length;
                this.f2728j = (this.f2728j - j2) + length;
            }
        }
        this.m++;
        dVar.f2715g = null;
        if (dVar.f2714f || z) {
            dVar.f2714f = true;
            this.f2729k.append((CharSequence) "CLEAN");
            this.f2729k.append(' ');
            this.f2729k.append((CharSequence) dVar.f2712d);
            this.f2729k.append((CharSequence) dVar.c());
            this.f2729k.append('\n');
            if (z) {
                this.n++;
            }
        } else {
            this.f2730l.remove(dVar.f2712d);
            this.f2729k.append((CharSequence) "REMOVE");
            this.f2729k.append(' ');
            this.f2729k.append((CharSequence) dVar.f2712d);
            this.f2729k.append('\n');
        }
        r(this.f2729k);
        if (this.f2728j > this.f2725g || w()) {
            this.f2719a.submit(this.o);
        }
    }

    private static void q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void r(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.a.f.s():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void t() {
        Writer writer = this.f2729k;
        if (writer != null) {
            o(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2722d), i.f2737a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2724f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f2726h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f2730l.values()) {
                if (dVar.f2715g != null) {
                    bufferedWriter.write("DIRTY " + dVar.f2712d + "\n");
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f2712d + dVar.c() + "\n");
                }
            }
            o(bufferedWriter);
            File file = this.f2721c;
            if (file.exists()) {
                u(file, this.f2723e, true);
            }
            u(this.f2722d, file, false);
            this.f2723e.delete();
            this.f2729k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), i.f2737a));
        } catch (Throwable th) {
            o(bufferedWriter);
            throw th;
        }
    }

    private static void u(File file, File file2, boolean z) throws IOException {
        if (z) {
            q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        while (this.f2728j > this.f2725g) {
            m((String) ((Map.Entry) this.f2730l.entrySet().iterator().next()).getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w() {
        int i2 = this.m;
        return i2 >= 2000 && i2 >= this.f2730l.size();
    }

    private final synchronized c x(String str) {
        n();
        LinkedHashMap linkedHashMap = this.f2730l;
        d dVar = (d) linkedHashMap.get(str);
        if (dVar == null) {
            dVar = new d(this, str);
            linkedHashMap.put(str, dVar);
        } else if (dVar.f2715g != null) {
            return null;
        }
        c cVar = new c(this, dVar);
        dVar.f2715g = cVar;
        this.f2729k.append((CharSequence) "DIRTY");
        this.f2729k.append(' ');
        this.f2729k.append((CharSequence) str);
        this.f2729k.append('\n');
        r(this.f2729k);
        return cVar;
    }

    public final c b(String str) {
        return x(str);
    }

    public final synchronized e c(String str) {
        n();
        d dVar = (d) this.f2730l.get(str);
        if (dVar != null && dVar.f2714f) {
            for (int i2 = 0; i2 < this.f2726h; i2 = 1) {
                if (dVar.i().exists()) {
                }
            }
            this.m++;
            this.f2729k.append((CharSequence) "READ");
            this.f2729k.append(' ');
            this.f2729k.append((CharSequence) str);
            this.f2729k.append('\n');
            if (w()) {
                this.f2719a.submit(this.o);
            }
            File[] fileArr = dVar.f2709a;
            long[] unused = dVar.f2713e;
            return new e(this, str, fileArr);
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f2729k == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f2730l.values());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar.f2715g != null) {
                dVar.f2715g.b();
            }
        }
        v();
        o(this.f2729k);
        this.f2729k = null;
    }

    public final synchronized void m(String str) {
        n();
        LinkedHashMap linkedHashMap = this.f2730l;
        d dVar = (d) linkedHashMap.get(str);
        if (dVar != null && dVar.f2715g == null) {
            for (int i2 = 0; i2 < this.f2726h; i2 = 1) {
                File fileI = dVar.i();
                if (fileI.exists() && !fileI.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(fileI))));
                }
                this.f2728j -= dVar.f2713e[0];
                dVar.f2713e[0] = 0;
            }
            this.m++;
            this.f2729k.append((CharSequence) "REMOVE");
            this.f2729k.append(' ');
            this.f2729k.append((CharSequence) str);
            this.f2729k.append('\n');
            linkedHashMap.remove(str);
            if (w()) {
                this.f2719a.submit(this.o);
            }
        }
    }
}
