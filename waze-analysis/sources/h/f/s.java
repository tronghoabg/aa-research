package h.f;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import e.a.h.ad;
import h.g.b.x;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.ar;
import kotlinx.coroutines.e.aj;
import kotlinx.coroutines.u;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class s {
    public static final void a(Reader reader, h.g.a.l lVar) throws IOException {
        x.f(reader, "<this>");
        x.f(lVar, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            BufferedReader bufferedReader2 = bufferedReader;
            x.f(bufferedReader2, "<this>");
            Iterator it = h.m.k.d(new o(bufferedReader2)).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            h.a.i.aW(bufferedReader, null);
        } finally {
        }
    }

    public static final c b(File file) {
        int length;
        ArrayList arrayListH;
        int iW;
        x.f(file, "<this>");
        String path = file.getPath();
        x.c(path);
        String str = path;
        int iW2 = h.n.o.W(str, File.separatorChar, 0, 4);
        if (iW2 != 0) {
            length = (iW2 <= 0 || path.charAt(iW2 + (-1)) != ':') ? (iW2 == -1 && h.n.o.R(str, ':')) ? path.length() : 0 : iW2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != File.separatorChar || (iW = h.n.o.W(str, File.separatorChar, 2, 4)) < 0) {
            length = 1;
        } else {
            int iW3 = h.n.o.W(str, File.separatorChar, iW + 1, 4);
            length = iW3 >= 0 ? iW3 + 1 : path.length();
        }
        String strSubstring = path.substring(0, length);
        x.e(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(length);
        x.e(strSubstring2, "substring(...)");
        String str2 = strSubstring2;
        if (str2.length() == 0) {
            arrayListH = h.a.i.h();
        } else {
            List listAe = h.n.o.ae(str2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(h.a.i.q(listAe, 10));
            Iterator it = listAe.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            arrayListH = arrayList;
        }
        return new c(new File(strSubstring), arrayListH);
    }

    public static k c(File file, l lVar) {
        x.f(file, "<this>");
        x.f(lVar, "direction");
        return new k(file, lVar);
    }

    public static boolean d(File file) {
        x.f(file, "<this>");
        x.f(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : c(file, l.f48090b)) {
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void e(java.io.File r14, java.io.File r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.s.e(java.io.File, java.io.File):void");
    }

    public static /* synthetic */ void f(File file, File file2) throws IOException {
        x.f(file, "<this>");
        x.f(file2, TypedValues.AttributesType.S_TARGET);
        if (!file.exists()) {
            throw new p(file);
        }
        if (file2.exists() && !file2.delete()) {
            throw new b(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new d(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream fileInputStream2 = fileInputStream;
            fileInputStream = new FileOutputStream(file2);
            try {
                h.a.i.aY(fileInputStream2, fileInputStream);
                h.a.i.aW(fileInputStream, null);
                h.a.i.aW(fileInputStream, null);
            } finally {
            }
        } finally {
        }
    }

    public static final Throwable g(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ad.c(runtimeException, th);
        return runtimeException;
    }

    public static final void h(h.c.j jVar, Throwable th) {
        if (th instanceof ar) {
            th = ((ar) th).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) jVar.get(CoroutineExceptionHandler.f51269c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(jVar, th);
            } else {
                kotlinx.coroutines.d.d.b(jVar, th);
            }
        } catch (Throwable th2) {
            kotlinx.coroutines.d.d.b(jVar, g(th, th2));
        }
    }

    public static final Object i(Object obj, h.c.e eVar) {
        if (!(obj instanceof u)) {
            return obj;
        }
        Throwable thA = ((u) obj).f52067a;
        if (ai.c() && (eVar instanceof h.c.b.a.d)) {
            thA = aj.a(thA, (h.c.b.a.d) eVar);
        }
        return e.b.c.a(thA);
    }

    public static final Object j(Object obj) {
        Throwable thC = h.m.c(obj);
        return thC == null ? obj : new u(thC);
    }

    private static c k(c cVar) {
        File fileB = cVar.b();
        List<File> listC = cVar.c();
        ArrayList arrayList = new ArrayList(listC.size());
        for (File file : listC) {
            String name = file.getName();
            if (!x.n(name, ".")) {
                if (!x.n(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || x.n(((File) h.a.i.T(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return new c(fileB, arrayList);
    }
}
