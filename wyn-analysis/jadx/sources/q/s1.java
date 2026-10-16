package q;

import Va.AbstractC1127r9;
import Va.B7;
import Va.Ba;
import Va.InterfaceC1217ya;
import a9.C1342b;
import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import rc.InterfaceC3965b;
import uc.C4273j;
import uc.InterfaceC4269f;
import uc.InterfaceC4283t;
import uc.InterfaceC4284u;
import uc.InterfaceC4285v;
import x.C4419l;
import x.C4424q;
import yc.C4584g;
import yc.C4592o;
import yc.InterfaceC4573C;
import yc.InterfaceC4574D;

/* loaded from: classes.dex */
public final class s1 implements InterfaceC1217ya, InterfaceC3965b {

    /* renamed from: a, reason: collision with root package name */
    public Object f43896a;

    /* renamed from: b, reason: collision with root package name */
    public Object f43897b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Object f43898c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Object f43899d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f43900e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public Object f43901f = new C4419l();

    /* renamed from: g, reason: collision with root package name */
    public Object f43902g = new C4419l();

    public s1(C4424q c4424q) {
        this.f43896a = c4424q;
    }

    public static void g(Exception exc, InterfaceC4573C interfaceC4573C) {
        if (exc instanceof CameraAccessException) {
            interfaceC4573C.c(new C4592o("CameraAccess", exc.getMessage(), null));
        } else {
            interfaceC4573C.c(new C4592o("error", exc.getMessage(), null));
        }
    }

    public static void h(Exception exc, InterfaceC4574D interfaceC4574D) {
        if (exc instanceof CameraAccessException) {
            interfaceC4574D.c(new C4592o("CameraAccess", exc.getMessage(), null));
        } else {
            interfaceC4574D.c(new C4592o("error", exc.getMessage(), null));
        }
    }

    @Override // Va.InterfaceC1217ya
    public void a(String str) {
        B7 b7G = Va.V.G((Va.V) this.f43902g, (Context) this.f43896a, str, (Va.Z0) this.f43897b);
        Va.Z0 z02 = (Va.Z0) this.f43897b;
        Ba ba2 = (Ba) this.f43901f;
        Va.V.N((Va.V) this.f43902g, z02, b7G, (AbstractC1127r9) this.f43900e, ba2, (Context) this.f43896a, (String) this.f43898c, (String) this.f43899d, false);
    }

    public void b(InterfaceC4283t interfaceC4283t) {
        ((HashSet) this.f43899d).add(interfaceC4283t);
    }

    public void c(InterfaceC4284u interfaceC4284u) {
        ((HashSet) this.f43900e).add(interfaceC4284u);
    }

    public void d(InterfaceC4285v interfaceC4285v) {
        ((HashSet) this.f43898c).add(interfaceC4285v);
    }

    public void e() {
        C4424q c4424q = (C4424q) this.f43896a;
        if (c4424q.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c4424q.iterator();
            while (true) {
                Af.i iVar = (Af.i) it;
                if (!iVar.hasNext()) {
                    return;
                }
                N.q0 q0Var = (N.q0) iVar.next();
                iVar.remove();
                q0Var.j();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void f() {
        k(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f43898c;
        boolean zIsEmpty = arrayList.isEmpty();
        C4424q c4424q = (C4424q) this.f43896a;
        if (!zIsEmpty) {
            Trace.beginSection("Compose:onForgotten");
            try {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(size);
                    if (obj instanceof N.q0) {
                        c4424q.remove(obj);
                        ((N.q0) obj).k();
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f43897b;
        if (arrayList2.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                N.q0 q0Var = (N.q0) arrayList2.get(i5);
                c4424q.remove(q0Var);
                q0Var.c();
            }
        } finally {
        }
    }

    public void i(yc.x xVar) {
        int i5;
        C4584g c4584g = (C4584g) this.f43902g;
        if (c4584g == null) {
            throw new C4592o("cameraNotFound", "Camera not found. Please call the 'create' method before calling 'initialize'.", null);
        }
        try {
            int iOrdinal = xVar.ordinal();
            if (iOrdinal == 0) {
                i5 = 35;
            } else if (iOrdinal == 1) {
                i5 = 256;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unreachable code");
                }
                i5 = 17;
            }
            c4584g.f(i5);
        } catch (CameraAccessException e7) {
            throw new C4592o("CameraAccessException", e7.getMessage(), null);
        }
    }

    public Long j(String str, yc.y yVar) {
        Integer num;
        io.flutter.embedding.engine.renderer.i iVarD = ((io.flutter.embedding.engine.renderer.k) this.f43900e).d();
        Handler handler = new Handler(Looper.getMainLooper());
        InterfaceC4269f interfaceC4269f = (InterfaceC4269f) this.f43897b;
        com.google.android.gms.ads.nativead.l lVar = new com.google.android.gms.ads.nativead.l(interfaceC4269f, 28);
        long j8 = iVarD.f36986a;
        md.J j10 = new md.J(handler, lVar, new t6.q(interfaceC4269f, String.valueOf(j8)));
        t6.q qVar = new t6.q(str, (CameraManager) ((Activity) this.f43896a).getSystemService("camera"));
        Long l10 = yVar.f48191b;
        Integer numValueOf = l10 == null ? null : Integer.valueOf(l10.intValue());
        Long l11 = yVar.f48192c;
        Integer numValueOf2 = l11 == null ? null : Integer.valueOf(l11.intValue());
        Long l12 = yVar.f48193d;
        Integer numValueOf3 = l12 != null ? Integer.valueOf(l12.intValue()) : null;
        int iOrdinal = yVar.f48190a.ordinal();
        int i5 = 1;
        if (iOrdinal != 0) {
            int i10 = 2;
            if (iOrdinal != 1) {
                i5 = 3;
                if (iOrdinal != 2) {
                    i10 = 4;
                    if (iOrdinal != 3) {
                        i5 = 5;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            i5 = 6;
                        }
                    }
                }
                num = numValueOf2;
            }
            num = numValueOf2;
            i5 = i10;
        } else {
            num = numValueOf2;
        }
        int i11 = i5;
        C1342b c1342b = new C1342b();
        boolean zBooleanValue = yVar.f48194e.booleanValue();
        Lc.b bVar = new Lc.b();
        bVar.f7075b = i11;
        bVar.f7074a = zBooleanValue;
        bVar.f7076c = numValueOf;
        bVar.f7077d = num;
        bVar.f7078e = numValueOf3;
        this.f43902g = new C4584g((Activity) this.f43896a, iVarD, c1342b, j10, qVar, bVar);
        return Long.valueOf(j8);
    }

    public void k(int i5) {
        int i10 = 0;
        ArrayList arrayList = (ArrayList) this.f43900e;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayListG = null;
        int i11 = 0;
        C4419l c4419l = null;
        C4419l c4419l2 = null;
        while (true) {
            C4419l c4419l3 = (C4419l) this.f43902g;
            if (i11 >= c4419l3.f47521b) {
                break;
            }
            if (i5 <= c4419l3.b(i11)) {
                Object objRemove = arrayList.remove(i11);
                int iC = c4419l3.c(i11);
                int iC2 = ((C4419l) this.f43901f).c(i11);
                if (arrayListG == null) {
                    arrayListG = AbstractC3935e.G(objRemove);
                    c4419l2 = new C4419l();
                    c4419l2.a(iC);
                    c4419l = new C4419l();
                    c4419l.a(iC2);
                } else {
                    AbstractC3340k.c(c4419l, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    AbstractC3340k.c(c4419l2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListG.add(objRemove);
                    c4419l2.a(iC);
                    c4419l.a(iC2);
                }
            } else {
                i11++;
            }
        }
        if (arrayListG != null) {
            AbstractC3340k.c(c4419l, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            AbstractC3340k.c(c4419l2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListG.size() - 1;
            while (i10 < size) {
                int i12 = i10 + 1;
                int size2 = arrayListG.size();
                for (int i13 = i12; i13 < size2; i13++) {
                    int iB = c4419l2.b(i10);
                    int iB2 = c4419l2.b(i13);
                    if (iB < iB2 || (iB2 == iB && c4419l.b(i10) < c4419l.b(i13))) {
                        Object obj = arrayListG.get(i10);
                        arrayListG.set(i10, arrayListG.get(i13));
                        arrayListG.set(i13, obj);
                        int iB3 = c4419l.b(i10);
                        c4419l.d(i10, c4419l.b(i13));
                        c4419l.d(i13, iB3);
                        int iB4 = c4419l2.b(i10);
                        c4419l2.d(i10, c4419l2.b(i13));
                        c4419l2.d(i13, iB4);
                    }
                }
                i10 = i12;
            }
            ((ArrayList) this.f43898c).addAll(arrayListG);
        }
    }

    public void l(N.q0 q0Var, int i5, int i10, int i11) {
        k(i5);
        if (i11 < 0 || i11 >= i5) {
            ((ArrayList) this.f43898c).add(q0Var);
            return;
        }
        ((ArrayList) this.f43900e).add(q0Var);
        ((C4419l) this.f43901f).a(i10);
        ((C4419l) this.f43902g).a(i11);
    }

    public void m(InterfaceC4283t interfaceC4283t) {
        ((HashSet) this.f43899d).remove(interfaceC4283t);
    }

    public void n(Boolean bool) throws IOException {
        C4584g c4584g = (C4584g) this.f43902g;
        C4273j c4273j = bool.booleanValue() ? (C4273j) this.f43901f : null;
        try {
            File fileCreateTempFile = File.createTempFile("REC", ".mp4", c4584g.f48118g.getCacheDir());
            c4584g.f48133w = fileCreateTempFile;
            try {
                c4584g.g(fileCreateTempFile.getAbsolutePath());
                J3.g gVar = c4584g.f48112a;
                t6.q qVar = c4584g.f48120i;
                c4584g.f48121j.getClass();
                gVar.f5569a.put("AUTO_FOCUS", new Ac.a(qVar, true));
                c4584g.n(c4584g.f48120i);
                if (c4273j != null) {
                    c4273j.a(new Wa.d(c4584g, 3));
                }
                c4584g.f48115d = ((Integer) ((CameraCharacteristics) c4584g.f48120i.f45906a).get(CameraCharacteristics.LENS_FACING)).intValue();
                c4584g.f48131u = true;
                try {
                    c4584g.o(true, c4273j != null);
                } catch (CameraAccessException e7) {
                    c4584g.f48131u = false;
                    c4584g.f48133w = null;
                    throw new C4592o("videoRecordingFailed", e7.getMessage(), null);
                }
            } catch (IOException e10) {
                c4584g.f48131u = false;
                c4584g.f48133w = null;
                throw new C4592o("videoRecordingFailed", e10.getMessage(), null);
            }
        } catch (IOException | SecurityException e11) {
            throw new C4592o("cannotCreateFile", e11.getMessage(), null);
        }
    }

    public String o() throws IllegalStateException, CameraAccessException {
        C4584g c4584g = (C4584g) this.f43902g;
        if (!c4584g.f48131u) {
            return "";
        }
        J3.g gVar = c4584g.f48112a;
        t6.q qVar = c4584g.f48120i;
        c4584g.f48121j.getClass();
        gVar.f5569a.put("AUTO_FOCUS", new Ac.a(qVar, false));
        J3.g gVar2 = c4584g.f48112a;
        gVar2.f5569a.put("FPS_RANGE", new Gc.a(c4584g.f48120i));
        c4584g.f48131u = false;
        try {
            c4584g.b();
            c4584g.f48126p.abortCaptures();
            c4584g.f48130t.stop();
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        c4584g.f48130t.reset();
        try {
            c4584g.p(null);
            String absolutePath = c4584g.f48133w.getAbsolutePath();
            c4584g.f48133w = null;
            return absolutePath;
        } catch (CameraAccessException | IllegalStateException | InterruptedException e7) {
            throw new C4592o("videoRecordingFailed", e7.getMessage(), null);
        }
    }
}
