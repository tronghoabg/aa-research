package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class htg implements java.io.Closeable {
    public final java.io.File a;
    public final java.io.File b;
    public final java.io.File c;
    public java.io.Writer f;
    public int h;
    private final java.io.File j;
    public long e = 0;
    public final java.util.LinkedHashMap g = new java.util.LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final java.util.concurrent.ThreadPoolExecutor i = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new defpackage.htd());
    private final java.util.concurrent.Callable n = new defpackage.qnn(this, 1);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public htg(java.io.File file) {
        this.a = file;
        this.b = new java.io.File(file, "journal");
        this.c = new java.io.File(file, "journal.tmp");
        this.j = new java.io.File(file, "journal.bkp");
    }

    public static void b(java.io.File file) throws java.io.IOException {
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    public static void e(java.io.File file, java.io.File file2, boolean z) throws java.io.IOException {
        if (z) {
            b(file2);
        }
        if (!file.renameTo(file2)) {
            throw new java.io.IOException();
        }
    }

    private final void k() {
        if (this.f == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    private static void l(java.io.Writer writer) throws java.io.IOException {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void m(java.io.Writer writer) throws java.io.IOException {
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized defpackage.htf a(java.lang.String str) throws java.io.IOException {
        k();
        defpackage.hte hteVar = (defpackage.hte) this.g.get(str);
        if (hteVar != null && hteVar.c) {
            for (int i = 0; i < this.d; i = 1) {
                if (hteVar.e().exists()) {
                }
            }
            this.h++;
            this.f.append((java.lang.CharSequence) "READ");
            this.f.append(' ');
            this.f.append((java.lang.CharSequence) str);
            this.f.append('\n');
            if (g()) {
                this.i.submit(this.n);
            }
            return new defpackage.htf(this, str);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void c() throws java.io.IOException {
        java.lang.String strSubstring;
        defpackage.hti htiVar = new defpackage.hti(new java.io.FileInputStream(this.b), defpackage.htj.a);
        try {
            java.lang.String strA = htiVar.a();
            java.lang.String strA2 = htiVar.a();
            java.lang.String strA3 = htiVar.a();
            java.lang.String strA4 = htiVar.a();
            java.lang.String strA5 = htiVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE.equals(strA2) || !java.lang.Integer.toString(this.k).equals(strA3) || !java.lang.Integer.toString(this.d).equals(strA4) || !"".equals(strA5)) {
                throw new java.io.IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    java.lang.String strA6 = htiVar.a();
                    int iIndexOf = strA6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                    }
                    int i2 = iIndexOf + 1;
                    int iIndexOf2 = strA6.indexOf(32, i2);
                    if (iIndexOf2 == -1) {
                        strSubstring = strA6.substring(i2);
                        if (iIndexOf == 6) {
                            if (strA6.startsWith("REMOVE")) {
                                this.g.remove(strSubstring);
                            } else {
                                iIndexOf = 6;
                            }
                        }
                        i++;
                    } else {
                        strSubstring = strA6.substring(i2, iIndexOf2);
                    }
                    java.util.LinkedHashMap linkedHashMap = this.g;
                    defpackage.hte hteVar = (defpackage.hte) linkedHashMap.get(strSubstring);
                    if (hteVar == null) {
                        hteVar = new defpackage.hte(this, strSubstring);
                        linkedHashMap.put(strSubstring, hteVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5) {
                        if (!strA6.startsWith("CLEAN")) {
                            iIndexOf = 5;
                            if (iIndexOf2 != -1) {
                                if (iIndexOf2 == -1) {
                                }
                                throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                            }
                            if (iIndexOf2 == -1) {
                            }
                            throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                        }
                        java.lang.String[] strArrSplit = strA6.substring(iIndexOf2 + 1).split(" ");
                        hteVar.c = true;
                        hteVar.e = null;
                        if (strArrSplit.length != hteVar.d.d) {
                            throw defpackage.hte.d(strArrSplit);
                        }
                        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                            try {
                                hteVar.b[i3] = java.lang.Long.parseLong(strArrSplit[i3]);
                            } catch (java.lang.NumberFormatException unused) {
                                throw defpackage.hte.d(strArrSplit);
                            }
                        }
                    } else if (iIndexOf2 != -1 && iIndexOf == 5 && strA6.startsWith("DIRTY")) {
                        hteVar.e = new defpackage.nch(this, hteVar);
                    } else if (iIndexOf2 == -1 || iIndexOf != 4 || !strA6.startsWith("READ")) {
                        throw new java.io.IOException("unexpected journal line: ".concat(java.lang.String.valueOf(strA6)));
                    }
                    i++;
                } catch (java.io.EOFException unused2) {
                    this.h = i - this.g.size();
                    if (htiVar.b == -1) {
                        d();
                    } else {
                        this.f = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.b, true), defpackage.htj.a));
                    }
                    defpackage.htj.a(htiVar);
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            defpackage.htj.a(htiVar);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
        if (this.f == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.nch nchVar = ((defpackage.hte) arrayList.get(i)).e;
            if (nchVar != null) {
                nchVar.d();
            }
        }
        f();
        l(this.f);
        this.f = null;
    }

    public final synchronized void d() throws java.io.IOException {
        java.io.Writer writer = this.f;
        if (writer != null) {
            l(writer);
        }
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.c), defpackage.htj.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (defpackage.hte hteVar : this.g.values()) {
                if (hteVar.e != null) {
                    bufferedWriter.write(defpackage.a.bp(hteVar.a, "DIRTY ", "\n"));
                } else {
                    bufferedWriter.write("CLEAN " + hteVar.a + hteVar.a() + "\n");
                }
            }
            l(bufferedWriter);
            java.io.File file = this.b;
            if (file.exists()) {
                e(file, this.j, true);
            }
            e(this.c, file, false);
            this.j.delete();
            this.f = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file, true), defpackage.htj.a));
        } catch (java.lang.Throwable th) {
            l(bufferedWriter);
            throw th;
        }
    }

    public final void f() throws java.io.IOException {
        while (this.e > this.l) {
            h((java.lang.String) ((java.util.Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean g() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized void h(java.lang.String str) throws java.io.IOException {
        k();
        java.util.LinkedHashMap linkedHashMap = this.g;
        defpackage.hte hteVar = (defpackage.hte) linkedHashMap.get(str);
        if (hteVar != null && hteVar.e == null) {
            for (int i = 0; i < this.d; i = 1) {
                java.io.File fileE = hteVar.e();
                if (fileE.exists() && !fileE.delete()) {
                    throw new java.io.IOException("failed to delete ".concat(fileE.toString()));
                }
                long j = this.e;
                long[] jArr = hteVar.b;
                this.e = j - jArr[0];
                jArr[0] = 0;
            }
            this.h++;
            this.f.append((java.lang.CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((java.lang.CharSequence) str);
            this.f.append('\n');
            linkedHashMap.remove(str);
            if (g()) {
                this.i.submit(this.n);
            }
        }
    }

    public final synchronized void i(defpackage.nch nchVar, boolean z) throws java.io.IOException {
        java.lang.Object obj = nchVar.b;
        if (((defpackage.hte) obj).e != nchVar) {
            throw new java.lang.IllegalStateException();
        }
        if (z && !((defpackage.hte) obj).c) {
            for (int i = 0; i < this.d; i = 1) {
                if (!((boolean[]) nchVar.c)[0]) {
                    nchVar.d();
                    throw new java.lang.IllegalStateException("Newly created entry didn't create value for index 0");
                }
                if (!((defpackage.hte) obj).c().exists()) {
                    nchVar.d();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            java.io.File fileC = ((defpackage.hte) obj).c();
            if (!z) {
                b(fileC);
            } else if (fileC.exists()) {
                java.io.File fileE = ((defpackage.hte) obj).e();
                fileC.renameTo(fileE);
                long[] jArr = ((defpackage.hte) obj).b;
                long j = jArr[0];
                long length = fileE.length();
                jArr[0] = length;
                this.e = (this.e - j) + length;
            }
        }
        this.h++;
        ((defpackage.hte) obj).e = null;
        if (((defpackage.hte) obj).c || z) {
            ((defpackage.hte) obj).c = true;
            this.f.append((java.lang.CharSequence) "CLEAN");
            this.f.append(' ');
            this.f.append((java.lang.CharSequence) ((defpackage.hte) obj).a);
            this.f.append((java.lang.CharSequence) ((defpackage.hte) obj).a());
            this.f.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            java.util.LinkedHashMap linkedHashMap = this.g;
            java.lang.String str = ((defpackage.hte) obj).a;
            linkedHashMap.remove(str);
            this.f.append((java.lang.CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((java.lang.CharSequence) str);
            this.f.append('\n');
        }
        m(this.f);
        if (this.e > this.l || g()) {
            this.i.submit(this.n);
        }
    }

    public final synchronized defpackage.nch j(java.lang.String str) throws java.io.IOException {
        k();
        java.util.LinkedHashMap linkedHashMap = this.g;
        defpackage.hte hteVar = (defpackage.hte) linkedHashMap.get(str);
        if (hteVar == null) {
            hteVar = new defpackage.hte(this, str);
            linkedHashMap.put(str, hteVar);
        } else if (hteVar.e != null) {
            return null;
        }
        defpackage.nch nchVar = new defpackage.nch(this, hteVar);
        hteVar.e = nchVar;
        this.f.append((java.lang.CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((java.lang.CharSequence) str);
        this.f.append('\n');
        m(this.f);
        return nchVar;
    }
}
