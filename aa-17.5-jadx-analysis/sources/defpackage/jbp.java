package defpackage;

import android.content.res.Resources;
import android.os.HandlerThread;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final class jbp {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    private static final rlh k;
    public final jae b;
    public final iyl c;
    public final izl d;
    public int e;
    public jbm f;
    public xob g;
    public final Queue h;
    public ruv[] i;
    final wyd j;
    private final Closeable l;
    private iyq m;
    private final rlh n;
    private final jcr o;
    private final int p;

    static {
        rlg rlgVarA = rlh.a();
        rlgVarA.c(false);
        k = rlgVarA.a();
    }

    public jbp(jbl jblVar) {
        int i;
        int i2;
        int i3;
        wyd wydVar = new wyd(this, null);
        this.j = wydVar;
        this.e = 0;
        this.h = new ArrayDeque();
        jae jaeVar = jblVar.d;
        this.b = jaeVar;
        this.m = jblVar.e;
        rlh rlhVar = (rlh) new ntn(jblVar.f).i(k);
        this.n = rlhVar;
        this.l = jblVar.a;
        this.i = null;
        this.c = new iyl(jblVar.b, jaeVar, jblVar.t);
        this.o = jblVar.q;
        int i4 = jblVar.x;
        this.p = i4;
        InputStream inputStream = jblVar.g;
        OutputStream outputStream = jblVar.j;
        Closeable closeable = jblVar.a;
        ypf ypfVar = izl.a;
        izi iziVar = new izi(inputStream, outputStream, closeable);
        iziVar.o = jblVar.y;
        iziVar.d = wub.L(new jbk(this, jblVar, 0));
        BiFunction biFunction = jblVar.w;
        if (biFunction != null) {
            iziVar.g = biFunction;
        }
        izz izzVar = jblVar.p;
        if (izzVar != null) {
            iziVar.k = izzVar;
        }
        jai jaiVar = jblVar.r;
        if (jaiVar != null) {
            rhx rhxVar = rhx.c;
            if (actz.a.gu().j()) {
                iziVar.m = jaiVar;
            }
        }
        xyc xycVar = jblVar.c;
        if (xycVar != null) {
            iziVar.j = xycVar;
        }
        iziVar.n = i4;
        iziVar.e = jblVar.d;
        iziVar.h = jblVar.e;
        iziVar.p = wydVar;
        iziVar.f = rld.a(rlhVar);
        iziVar.i = jblVar.b;
        iziVar.l = jblVar.u;
        izl izlVar = new izl(iziVar);
        this.d = izlVar;
        izd izdVar = new izd(0, -128, jeb.DEFAULT, izlVar, new izg(izlVar, 0), izlVar.h, izlVar.n);
        izlVar.b.c(izdVar);
        izlVar.x.put(0, izlVar.n);
        izdVar.h.set(2);
        izlVar.h.p(izdVar);
        izlVar.h.Q();
        izlVar.c[0] = izdVar;
        int i5 = jblVar.m;
        if (i5 <= 0 || (i = jblVar.i) <= 0 || (i2 = jblVar.h) <= 0 || (i3 = jblVar.n) <= 0) {
            return;
        }
        Resources resources = jblVar.b.getResources();
        izu izuVar = izlVar.g;
        izuVar.g = i(resources, i5);
        izuVar.h = i(resources, i);
        izuVar.i = i(resources, i2);
        izuVar.f = resources.getString(i3);
    }

    static final byte[] i(Resources resources, int i) throws Resources.NotFoundException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        byte[] bArr = new byte[1024];
        int i2 = 0;
        while (i2 != -1) {
            try {
                i2 = inputStreamOpenRawResource.read(bArr);
                if (i2 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            } catch (IOException unused) {
                a.g().ai(1797).u("Error reading raw resource.");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public final int a(jbo jboVar) {
        xnz xnzVar;
        iyw iywVarA;
        int i = 0;
        for (ruv ruvVar : this.i) {
            if (ruvVar.d == null && (xnzVar = ruvVar.b) != null && (iywVarA = jboVar.a(xnzVar)) != null) {
                jcr jcrVar = this.o;
                int i2 = this.p;
                izl izlVar = this.d;
                int i3 = ruvVar.a;
                if (i2 == 0) {
                    throw null;
                }
                int i4 = i2 - 1;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new RuntimeException(null, null);
                    }
                    iywVarA = new jdu(iywVarA, jcrVar.a, jcrVar.b, new fbf(izlVar.x, izlVar.y));
                }
                ruvVar.d = iywVarA;
                ruvVar.b = null;
                i++;
            }
        }
        return i;
    }

    public final void b() throws IOException {
        iyl iylVar = this.c;
        synchronized (iylVar.f) {
            iylVar.g = true;
            iylVar.a();
        }
        this.d.c(false);
        Closeable closeable = this.l;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void c(PrintWriter printWriter) {
        String string;
        izl izlVar = this.d;
        if (izlVar != null) {
            printWriter.println("\nChannelManager");
            printWriter.println("GalSnoop");
            rld rldVar = izlVar.u;
            if (rldVar.e) {
                printWriter.println("GalSnoop message buffer:");
                rldVar.b(izlVar.v, printWriter);
            } else {
                printWriter.println("GalSnoop disabled");
            }
            izd[] izdVarArr = izlVar.c;
            int length = izdVarArr.length;
            for (int i = 0; i < 256; i++) {
                izd izdVar = izdVarArr[i];
                if (izdVar != null) {
                    printWriter.println("Channel number: " + izdVar.b);
                    printWriter.println("  priority: " + izdVar.e + "  qosPriority: " + izdVar.f.name());
                    int i2 = izdVar.h.get();
                    int i3 = iyy.a;
                    if (i2 == 0) {
                        string = "CHANNEL_STATE_OPENING_BLOCKED";
                    } else if (i2 == 1) {
                        string = "CHANNEL_STATE_OPENING";
                    } else if (i2 == 2) {
                        string = "CHANNEL_STATE_OPEN";
                    } else if (i2 == 3) {
                        string = "CHANNEL_STATE_CLOSING";
                    } else if (i2 != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2);
                        string = sb.toString();
                    } else {
                        string = "CHANNEL_STATE_CLOSED";
                    }
                    printWriter.println("  channelState: " + string + " bytes received: " + izdVar.k.get());
                }
            }
            printWriter.println("Framer");
            izx izxVar = izlVar.b;
            if (izxVar != null) {
                izxVar.a(printWriter);
            }
        }
    }

    public final void d(xnz xnzVar, boolean z) {
        ruv[] ruvVarArr = this.i;
        if (ruvVarArr == null) {
            throw new IllegalStateException("Service updated before service discovery");
        }
        for (ruv ruvVar : ruvVarArr) {
            if (ruvVar.a == xnzVar.c) {
                Object obj = ruvVar.d;
                if (obj instanceof iyv) {
                    ((iyv) obj).k(xnzVar);
                    return;
                }
                if (obj != null) {
                    a.h().ai(1794).y("Attempted to update a service that is not updatable: %s", xnzVar);
                    return;
                } else {
                    if (z) {
                        throw new IllegalStateException("Service discovery complete, but current service is not discovered.");
                    }
                    a.f().ai(1795).u("Adding service to queue to be processed after service discovery is complete.");
                    this.h.add(xnzVar);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Updating a service that was not registered during service discovery");
    }

    public final void e() {
        this.d.f();
        ruv[] ruvVarArr = this.i;
        if (ruvVarArr != null) {
            for (ruv ruvVar : ruvVarArr) {
                Object obj = ruvVar.c;
                if (obj != null) {
                    ((jbj) obj).g();
                }
            }
        }
    }

    public final void f(xhv xhvVar) {
        this.c.b(false, xhvVar);
    }

    public final void g(izq izqVar) {
        izu izuVar = this.d.g;
        izuVar.q = izqVar;
        izuVar.q.a(izuVar);
        synchronized (izuVar.l) {
            Queue<Pair> queue = izuVar.p;
            for (Pair pair : queue) {
                izuVar.q.c((xhj) pair.first, ((Boolean) pair.second).booleanValue());
            }
            queue.clear();
        }
    }

    public final void h(iyq iyqVar) {
        this.m = iyqVar;
        izl izlVar = this.d;
        izlVar.t = iyqVar;
        izlVar.b.e(iyqVar);
        if (iyqVar != null) {
            iyqVar.a(0, 1);
            ruv[] ruvVarArr = this.i;
            if (ruvVarArr != null) {
                for (ruv ruvVar : ruvVarArr) {
                    Object obj = ruvVar.c;
                    if (obj != null) {
                        iyqVar.a(ruvVar.a, ((jbj) obj).u);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [iyx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [iyw, java.lang.Object] */
    public final void j(jbm jbmVar) {
        Object obj;
        izk izkVar;
        if (this.f != null) {
            throw new IllegalStateException("Can't start services while waiting on services");
        }
        this.f = jbmVar;
        ArrayList arrayList = new ArrayList();
        for (ruv ruvVar : this.i) {
            if (ruvVar.c == null && ruvVar.d != null) {
                if (jbmVar.b(ruvVar.a)) {
                    ruvVar.c = ruvVar.d.b(this.b);
                }
                if (ruvVar.c != null) {
                    arrayList.add(ruvVar);
                    iyq iyqVar = this.m;
                    if (iyqVar != null) {
                        int i = ruvVar.a;
                        Object obj2 = ruvVar.c;
                        obj2.getClass();
                        iyqVar.a(i, ((jbj) obj2).u);
                    }
                }
            }
        }
        this.e = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ruv ruvVar2 = (ruv) arrayList.get(i2);
            Object obj3 = ruvVar2.c;
            obj3.getClass();
            izl izlVar = this.d;
            jeb jebVarJ = ((jbj) obj3).j();
            int i3 = ruvVar2.a;
            ?? r15 = ruvVar2.c;
            r15.getClass();
            r15.getClass();
            int i4 = ((jbj) r15).v;
            if (i3 <= 0 || i3 > 255) {
                throw new IllegalArgumentException(a.bp(i3, "Invalid service ID: "));
            }
            Object obj4 = izlVar.d;
            synchronized (obj4) {
                try {
                    izk izkVar2 = izlVar.n;
                    if (i4 == 2) {
                        if (izlVar.o == null) {
                            izlVar.j = new HandlerThread("RxAud", -19);
                            izlVar.j.start();
                            izlVar.o = new izk(izlVar, izlVar.j.getLooper());
                        }
                        izkVar = izlVar.o;
                    } else if (i4 == 1) {
                        if (izlVar.q == null) {
                            izlVar.l = new HandlerThread("RxVid", -8);
                            izlVar.l.start();
                            izlVar.q = new izk(izlVar, izlVar.l.getLooper());
                        }
                        izkVar = izlVar.q;
                    } else if (i4 == 3) {
                        if (izlVar.r == null) {
                            izlVar.m = new HandlerThread("RxSen");
                            izlVar.m.start();
                            izlVar.r = new izk(izlVar, izlVar.m.getLooper());
                        }
                        izkVar = izlVar.r;
                    } else if (i4 == 4) {
                        if (izlVar.p == null) {
                            izlVar.k = new HandlerThread("RxMic", -16);
                            izlVar.k.start();
                            izlVar.p = new izk(izlVar, izlVar.k.getLooper());
                        }
                        izkVar = izlVar.p;
                    } else {
                        izkVar = izkVar2;
                    }
                    izlVar.x.put(Integer.valueOf(i3), izkVar);
                    obj = obj4;
                    try {
                        izd izdVar = new izd(i3, 0, jebVarJ, izlVar, new izg(izlVar, i3), r15, izkVar);
                        izlVar.c[i3] = izdVar;
                        ((jbj) r15).p(izdVar);
                        izlVar.b.c(izdVar);
                        rro rroVarB = rro.b(((jbj) r15).u);
                        rld rldVar = izlVar.u;
                        rroVarB.getClass();
                        rldVar.g(i3, olm.k(rroVarB));
                        izlVar.b(i3, roc.p(rroVarB));
                        if (!izdVar.h.compareAndSet(4, 0)) {
                            throw new IllegalStateException("Channel needs to be closed before it can be opened.");
                        }
                        if (izlVar.e || i4 == 3) {
                            izdVar.b();
                        }
                        arrayList2.add(Integer.valueOf(ruvVar2.a));
                        ruvVar2.c.getClass();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj4;
                }
            }
        }
        a.l().ai(1798).w("%d car services started.", arrayList.size());
        if (arrayList.isEmpty()) {
            this.f = null;
            jbmVar.a();
        }
    }
}
