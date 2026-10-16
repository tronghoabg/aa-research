package com.google.firebase.crashlytics.a.f;

import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.a.c.ah;
import com.google.firebase.crashlytics.a.c.h;
import com.google.firebase.crashlytics.a.c.j;
import com.google.firebase.crashlytics.a.c.o;
import com.google.firebase.crashlytics.a.d.t;
import com.google.firebase.crashlytics.a.e.be;
import com.google.firebase.crashlytics.a.e.bi;
import com.google.firebase.crashlytics.a.e.co;
import com.google.firebase.crashlytics.a.e.ct;
import com.google.firebase.crashlytics.a.e.cu;
import com.google.firebase.crashlytics.a.h.f;
import com.google.firebase.crashlytics.a.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9695a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f9696b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    private static final int f9697c = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.crashlytics.a.e.a.c f9698d = new com.google.firebase.crashlytics.a.e.a.c();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f9699e = new h(3);

    /* renamed from: f, reason: collision with root package name */
    private static final FilenameFilter f9700f = new o(2);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f9701g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private final c f9702h;

    /* renamed from: i, reason: collision with root package name */
    private final j f9703i;

    /* renamed from: j, reason: collision with root package name */
    private final f f9704j;

    public a(c cVar, f fVar, j jVar) {
        this.f9702h = cVar;
        this.f9704j = fVar;
        this.f9703i = jVar;
    }

    private static String k(String str) {
        return str.substring(0, f9697c);
    }

    private static String l(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f9696b);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private final List m() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f9702h;
        arrayList.addAll(cVar.j());
        arrayList.addAll(cVar.i());
        Comparator comparator = f9699e;
        Collections.sort(arrayList, comparator);
        List listK = cVar.k();
        Collections.sort(listK, comparator);
        arrayList.addAll(listK);
        return arrayList;
    }

    private static void n(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f9696b);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static final void o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final long b(String str) {
        return this.f9702h.f(str, "start-time").lastModified();
    }

    public final List c() {
        List<File> listM = m();
        ArrayList arrayList = new ArrayList();
        for (File file : listM) {
            try {
                arrayList.add(ah.a(f9698d.e(l(file)), file.getName(), file));
            } catch (IOException e2) {
                i.a().i("Could not load report file " + String.valueOf(file) + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public final SortedSet d() {
        return new TreeSet(this.f9702h.g()).descendingSet();
    }

    public final void e() {
        c cVar = this.f9702h;
        o(cVar.k());
        o(cVar.j());
        o(cVar.i());
    }

    public final void f(String str, long j2) {
        boolean z;
        com.google.firebase.crashlytics.a.e.a.c cVar;
        c cVar2 = this.f9702h;
        cVar2.m();
        SortedSet<String> sortedSetD = d();
        if (str != null) {
            sortedSetD.remove(str);
        }
        if (sortedSetD.size() > 8) {
            while (sortedSetD.size() > 8) {
                String str2 = (String) sortedSetD.last();
                i.a().b("Removing session over cap: ".concat(String.valueOf(str2)));
                cVar2.o(str2);
                sortedSetD.remove(str2);
            }
        }
        for (String str3 : sortedSetD) {
            i.a().g("Finalizing report for session ".concat(String.valueOf(str3)));
            List<File> listL = cVar2.l(str3, f9700f);
            if (listL.isEmpty()) {
                i.a().g("Session " + str3 + " has no events.");
            } else {
                Collections.sort(listL);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    z = false;
                    for (File file : listL) {
                        try {
                            arrayList.add(f9698d.d(l(file)));
                            if (!z) {
                                try {
                                    String name = file.getName();
                                    if (!name.startsWith(NotificationCompat.CATEGORY_EVENT) || !name.endsWith("_")) {
                                        break;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    z = false;
                                    i.a().i("Could not add event to report for ".concat(String.valueOf(String.valueOf(file))), e);
                                }
                            }
                            z = true;
                        } catch (IOException e3) {
                            e = e3;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    i.a().h("Could not parse event files for session ".concat(String.valueOf(str3)));
                } else {
                    c cVar3 = this.f9702h;
                    String strE = t.e(str3, cVar3);
                    String strA = this.f9703i.a(str3);
                    File fileF = cVar3.f(str3, "report");
                    try {
                        cVar = f9698d;
                    } catch (IOException e4) {
                        e = e4;
                    }
                    try {
                        cu cuVarP = cVar.e(l(fileF)).t(j2, z, strE).n(strA).p(arrayList);
                        ct ctVarE = cuVarP.e();
                        if (ctVarE != null) {
                            i.a().b("appQualitySessionId: " + strA);
                            n(z ? cVar3.d(ctVarE.j()) : cVar3.e(ctVarE.j()), cVar.g(cuVarP));
                        }
                    } catch (IOException e5) {
                        e = e5;
                        i.a().i("Could not synthesize final report file for ".concat(fileF.toString()), e);
                        this.f9702h.o(str3);
                    }
                    this.f9702h.o(str3);
                }
            }
            this.f9702h.o(str3);
        }
        com.google.firebase.crashlytics.a.h.c cVar4 = this.f9704j.c().f9740a;
        List listM = m();
        int size = listM.size();
        if (size <= 4) {
            return;
        }
        Iterator it = listM.subList(4, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final void g(String str, bi biVar, be beVar) {
        c cVar = this.f9702h;
        File fileF = cVar.f(str, "report");
        i.a().b("Writing native session report for " + str + " to file: " + fileF.toString());
        String strA = this.f9703i.a(str);
        try {
            com.google.firebase.crashlytics.a.e.a.c cVar2 = f9698d;
            n(cVar.b(str), cVar2.g(cVar2.e(l(fileF)).s(biVar).o(beVar).n(strA)));
        } catch (IOException e2) {
            i.a().i("Could not synthesize final native report file for ".concat(fileF.toString()), e2);
        }
    }

    public final void h(co coVar, String str, boolean z) {
        int i2 = this.f9704j.c().f9740a.f9739a;
        String strF = f9698d.f(coVar);
        String str2 = String.format(Locale.US, "%010d", Integer.valueOf(this.f9701g.getAndIncrement()));
        StringBuilder sb = new StringBuilder(NotificationCompat.CATEGORY_EVENT);
        sb.append(str2);
        sb.append(true != z ? "" : "_");
        try {
            n(this.f9702h.f(str, sb.toString()), strF);
        } catch (IOException e2) {
            i.a().i("Could not persist event for session ".concat(String.valueOf(str)), e2);
        }
        List<File> listL = this.f9702h.l(str, new o(3));
        Collections.sort(listL, new h(4));
        int size = listL.size();
        for (File file : listL) {
            if (size <= i2) {
                return;
            }
            c.n(file);
            size--;
        }
    }

    public final void i(cu cuVar) throws IOException {
        ct ctVarE = cuVar.e();
        if (ctVarE == null) {
            i.a().b("Could not get session for report");
            return;
        }
        String strJ = ctVarE.j();
        try {
            String strG = f9698d.g(cuVar);
            c cVar = this.f9702h;
            n(cVar.f(strJ, "report"), strG);
            File fileF = cVar.f(strJ, "start-time");
            long jB = ctVarE.b();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileF), f9696b);
            try {
                outputStreamWriter.write("");
                fileF.setLastModified(jB * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e2) {
            i.a().c("Could not persist report for session ".concat(strJ), e2);
        }
    }

    public final boolean j() {
        c cVar = this.f9702h;
        return (cVar.k().isEmpty() && cVar.j().isEmpty() && cVar.i().isEmpty()) ? false : true;
    }
}
