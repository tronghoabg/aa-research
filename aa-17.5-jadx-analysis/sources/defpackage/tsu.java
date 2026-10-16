package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class tsu {
    public long a;
    public final Object b;
    public final Object c;

    public tsu(File file) {
        this.b = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.c = new ajmd(file, null);
    }

    public static int a(InputStream inputStream) throws IOException {
        return (q(inputStream) << 24) | q(inputStream) | (q(inputStream) << 8) | (q(inputStream) << 16);
    }

    public static long b(InputStream inputStream) throws IOException {
        return (q(inputStream) & 255) | ((q(inputStream) & 255) << 8) | ((q(inputStream) & 255) << 16) | ((q(inputStream) & 255) << 24) | ((q(inputStream) & 255) << 32) | ((q(inputStream) & 255) << 40) | ((q(inputStream) & 255) << 48) | ((q(inputStream) & 255) << 56);
    }

    public static String e(hri hriVar) throws IOException {
        return new String(l(hriVar, b(hriVar)), CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
    }

    static void i(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void j(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static void k(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
        int length = bytes.length;
        j(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] l(hri hriVar, long j) throws IOException {
        long jA = hriVar.a();
        if (j >= 0 && j <= jA) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(hriVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + jA);
    }

    private static int q(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    private final void r(String str, hrh hrhVar) {
        ?? r0 = this.b;
        if (r0.containsKey(str)) {
            this.a += hrhVar.a - ((hrh) r0.get(str)).a;
        } else {
            this.a += hrhVar.a;
        }
        r0.put(str, hrhVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    private final void s(String str) {
        hrh hrhVar = (hrh) this.b.remove(str);
        if (hrhVar != null) {
            this.a -= hrhVar.a;
        }
    }

    private static final String t(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized hqh c(String str) {
        hrh hrhVar = (hrh) this.b.get(str);
        if (hrhVar == null) {
            return null;
        }
        File fileD = d(str);
        try {
            hri hriVar = new hri(new BufferedInputStream(new FileInputStream(fileD)), fileD.length());
            try {
                String str2 = hrh.a(hriVar).b;
                if (!TextUtils.equals(str, str2)) {
                    hrf.a("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, str2);
                    s(str);
                    return null;
                }
                byte[] bArrL = l(hriVar, hriVar.a());
                hqh hqhVar = new hqh();
                hqhVar.a = bArrL;
                hqhVar.b = hrhVar.c;
                hqhVar.c = hrhVar.d;
                hqhVar.d = hrhVar.e;
                hqhVar.e = hrhVar.f;
                hqhVar.f = hrhVar.g;
                List<hqn> list = hrhVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (hqn hqnVar : list) {
                    treeMap.put(hqnVar.a, hqnVar.b);
                }
                hqhVar.g = treeMap;
                hqhVar.h = DesugarCollections.unmodifiableList(list);
                return hqhVar;
            } finally {
                hriVar.close();
            }
        } catch (IOException e) {
            hrf.a("%s: %s", fileD.getAbsolutePath(), e.toString());
            h(str);
            return null;
        }
    }

    public final File d(String str) {
        Object obj = this.c;
        return new File((File) ((ajmd) obj).a, t(str));
    }

    public final synchronized void f() {
        Object obj = ((ajmd) this.c).a;
        if (((File) obj).exists()) {
            File[] fileArrListFiles = ((File) obj).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        hri hriVar = new hri(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            hrh hrhVarA = hrh.a(hriVar);
                            hrhVarA.a = length;
                            r(hrhVarA.b, hrhVarA);
                            hriVar.close();
                        } catch (Throwable th) {
                            hriVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!((File) obj).mkdirs()) {
            hrf.b("Unable to create cache dir %s", ((File) obj).getAbsolutePath());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final synchronized void g(java.lang.String r29, defpackage.hqh r30) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsu.g(java.lang.String, hqh):void");
    }

    public final synchronized void h(String str) {
        boolean zDelete = d(str).delete();
        s(str);
        if (zDelete) {
            return;
        }
        hrf.a("Could not delete cache entry for key=%s, filename=%s", str, t(str));
    }

    public final synchronized void m(String str) {
        hqh hqhVarC = c(str);
        if (hqhVarC != null) {
            hqhVarC.f = 0L;
            hqhVarC.e = 0L;
            g(str, hqhVarC);
        }
    }

    public final void n(cqu cquVar, long j) {
        if (tl.k(cquVar)) {
            p();
        }
        if (!tl.m(cquVar)) {
            List listA = cquVar.a();
            int size = listA.size();
            for (int i = 0; i < size; i++) {
                cqd cqdVar = (cqd) listA.get(i);
                o(cqdVar.a, a.ai(cqdVar.e, j));
            }
            o(cquVar.b, a.ai(cquVar.m, j));
        }
        if (tl.m(cquVar) && cquVar.b - this.a > 40) {
            p();
        }
        this.a = cquVar.b;
    }

    public final void o(long j, long j2) {
        ((cro) this.c).b(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((cro) this.b).b(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void p() {
        ((cro) this.c).c();
        ((cro) this.b).c();
        this.a = 0L;
    }

    public tsu(byte[] bArr) {
        this.c = new cro(false, 1);
        this.b = new cro(false, 1);
    }

    public tsu() {
        this.b = new ttm();
        this.c = new ttm();
        this.a = -1L;
    }
}
