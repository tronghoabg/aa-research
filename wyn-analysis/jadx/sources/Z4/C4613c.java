package z4;

import A7.C0237b0;
import A7.CallableC0255h0;
import android.os.Build;
import android.os.StrictMode;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;

/* renamed from: z4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4613c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f48348a;

    /* renamed from: b, reason: collision with root package name */
    public final File f48349b;

    /* renamed from: c, reason: collision with root package name */
    public final File f48350c;

    /* renamed from: d, reason: collision with root package name */
    public final File f48351d;

    /* renamed from: f, reason: collision with root package name */
    public final long f48353f;

    /* renamed from: i, reason: collision with root package name */
    public BufferedWriter f48356i;
    public int k;

    /* renamed from: h, reason: collision with root package name */
    public long f48355h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f48357j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f48358l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f48359m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4611a());

    /* renamed from: n, reason: collision with root package name */
    public final CallableC0255h0 f48360n = new CallableC0255h0(this, 7);

    /* renamed from: e, reason: collision with root package name */
    public final int f48352e = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f48354g = 1;

    public C4613c(File file, long j8) {
        this.f48348a = file;
        this.f48349b = new File(file, "journal");
        this.f48350c = new File(file, "journal.tmp");
        this.f48351d = new File(file, "journal.bkp");
        this.f48353f = j8;
    }

    public static void P(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(C4613c c4613c, C0237b0 c0237b0, boolean z2) {
        synchronized (c4613c) {
            C4612b c4612b = (C4612b) c0237b0.f813c;
            if (c4612b.f48346f != c0237b0) {
                throw new IllegalStateException();
            }
            if (z2 && !c4612b.f48345e) {
                for (int i5 = 0; i5 < c4613c.f48354g; i5++) {
                    if (!((boolean[]) c0237b0.f814d)[i5]) {
                        c0237b0.d();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i5);
                    }
                    if (!c4612b.f48344d[i5].exists()) {
                        c0237b0.d();
                        return;
                    }
                }
            }
            for (int i10 = 0; i10 < c4613c.f48354g; i10++) {
                File file = c4612b.f48344d[i10];
                if (!z2) {
                    d(file);
                } else if (file.exists()) {
                    File file2 = c4612b.f48343c[i10];
                    file.renameTo(file2);
                    long j8 = c4612b.f48342b[i10];
                    long length = file2.length();
                    c4612b.f48342b[i10] = length;
                    c4613c.f48355h = (c4613c.f48355h - j8) + length;
                }
            }
            c4613c.k++;
            c4612b.f48346f = null;
            if (c4612b.f48345e || z2) {
                c4612b.f48345e = true;
                c4613c.f48356i.append((CharSequence) "CLEAN");
                c4613c.f48356i.append(' ');
                c4613c.f48356i.append((CharSequence) c4612b.f48341a);
                c4613c.f48356i.append((CharSequence) c4612b.a());
                c4613c.f48356i.append('\n');
                if (z2) {
                    c4613c.f48358l++;
                }
            } else {
                c4613c.f48357j.remove(c4612b.f48341a);
                c4613c.f48356i.append((CharSequence) "REMOVE");
                c4613c.f48356i.append(' ');
                c4613c.f48356i.append((CharSequence) c4612b.f48341a);
                c4613c.f48356i.append('\n');
            }
            i(c4613c.f48356i);
            if (c4613c.f48355h > c4613c.f48353f || c4613c.w()) {
                c4613c.f48359m.submit(c4613c.f48360n);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void i(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static C4613c y(File file, long j8) throws IOException {
        if (j8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                P(file2, file3, false);
            }
        }
        C4613c c4613c = new C4613c(file, j8);
        if (c4613c.f48349b.exists()) {
            try {
                c4613c.B();
                c4613c.z();
                return c4613c;
            } catch (IOException e7) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e7.getMessage() + ", removing");
                c4613c.close();
                f.a(c4613c.f48348a);
            }
        }
        file.mkdirs();
        C4613c c4613c2 = new C4613c(file, j8);
        c4613c2.J();
        return c4613c2;
    }

    public final void B() {
        File file = this.f48349b;
        C4615e c4615e = new C4615e(new FileInputStream(file), f.f48367a);
        try {
            String strA = c4615e.a();
            String strA2 = c4615e.a();
            String strA3 = c4615e.a();
            String strA4 = c4615e.a();
            String strA5 = c4615e.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(strA2) || !Integer.toString(this.f48352e).equals(strA3) || !Integer.toString(this.f48354g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i5 = 0;
            while (true) {
                try {
                    D(c4615e.a());
                    i5++;
                } catch (EOFException unused) {
                    this.k = i5 - this.f48357j.size();
                    if (c4615e.f48366e == -1) {
                        J();
                    } else {
                        this.f48356i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), f.f48367a));
                    }
                    try {
                        c4615e.close();
                        return;
                    } catch (RuntimeException e7) {
                        throw e7;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c4615e.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void D(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i5 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i5);
        LinkedHashMap linkedHashMap = this.f48357j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i5);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i5, iIndexOf2);
        }
        C4612b c4612b = (C4612b) linkedHashMap.get(strSubstring);
        if (c4612b == null) {
            c4612b = new C4612b(this, strSubstring);
            linkedHashMap.put(strSubstring, c4612b);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c4612b.f48346f = new C0237b0(this, c4612b);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(StringUtils.SPACE);
        c4612b.f48345e = true;
        c4612b.f48346f = null;
        if (strArrSplit.length != c4612b.f48347g.f48354g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                c4612b.f48342b[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void J() {
        try {
            BufferedWriter bufferedWriter = this.f48356i;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48350c), f.f48367a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f48352e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f48354g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C4612b c4612b : this.f48357j.values()) {
                    if (c4612b.f48346f != null) {
                        bufferedWriter2.write("DIRTY " + c4612b.f48341a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c4612b.f48341a + c4612b.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f48349b.exists()) {
                    P(this.f48349b, this.f48351d, true);
                }
                P(this.f48350c, this.f48349b, false);
                this.f48351d.delete();
                this.f48356i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48349b, true), f.f48367a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void Q() {
        while (this.f48355h > this.f48353f) {
            String str = (String) ((Map.Entry) this.f48357j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f48356i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C4612b c4612b = (C4612b) this.f48357j.get(str);
                    if (c4612b != null && c4612b.f48346f == null) {
                        for (int i5 = 0; i5 < this.f48354g; i5++) {
                            File file = c4612b.f48343c[i5];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j8 = this.f48355h;
                            long[] jArr = c4612b.f48342b;
                            this.f48355h = j8 - jArr[i5];
                            jArr[i5] = 0;
                        }
                        this.k++;
                        this.f48356i.append((CharSequence) "REMOVE");
                        this.f48356i.append(' ');
                        this.f48356i.append((CharSequence) str);
                        this.f48356i.append('\n');
                        this.f48357j.remove(str);
                        if (w()) {
                            this.f48359m.submit(this.f48360n);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f48356i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f48357j.values()).iterator();
            while (it.hasNext()) {
                C0237b0 c0237b0 = ((C4612b) it.next()).f48346f;
                if (c0237b0 != null) {
                    c0237b0.d();
                }
            }
            Q();
            b(this.f48356i);
            this.f48356i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C0237b0 h(String str) {
        synchronized (this) {
            try {
                if (this.f48356i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C4612b c4612b = (C4612b) this.f48357j.get(str);
                if (c4612b == null) {
                    c4612b = new C4612b(this, str);
                    this.f48357j.put(str, c4612b);
                } else if (c4612b.f48346f != null) {
                    return null;
                }
                C0237b0 c0237b0 = new C0237b0(this, c4612b);
                c4612b.f48346f = c0237b0;
                this.f48356i.append((CharSequence) "DIRTY");
                this.f48356i.append(' ');
                this.f48356i.append((CharSequence) str);
                this.f48356i.append('\n');
                i(this.f48356i);
                return c0237b0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized vb.e o(String str) {
        if (this.f48356i == null) {
            throw new IllegalStateException("cache is closed");
        }
        C4612b c4612b = (C4612b) this.f48357j.get(str);
        if (c4612b == null) {
            return null;
        }
        if (!c4612b.f48345e) {
            return null;
        }
        for (File file : c4612b.f48343c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.f48356i.append((CharSequence) "READ");
        this.f48356i.append(' ');
        this.f48356i.append((CharSequence) str);
        this.f48356i.append('\n');
        if (w()) {
            this.f48359m.submit(this.f48360n);
        }
        return new vb.e(c4612b.f48343c);
    }

    public final boolean w() {
        int i5 = this.k;
        return i5 >= 2000 && i5 >= this.f48357j.size();
    }

    public final void z() throws IOException {
        d(this.f48350c);
        Iterator it = this.f48357j.values().iterator();
        while (it.hasNext()) {
            C4612b c4612b = (C4612b) it.next();
            C0237b0 c0237b0 = c4612b.f48346f;
            int i5 = this.f48354g;
            int i10 = 0;
            if (c0237b0 == null) {
                while (i10 < i5) {
                    this.f48355h += c4612b.f48342b[i10];
                    i10++;
                }
            } else {
                c4612b.f48346f = null;
                while (i10 < i5) {
                    d(c4612b.f48343c[i10]);
                    d(c4612b.f48344d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }
}
