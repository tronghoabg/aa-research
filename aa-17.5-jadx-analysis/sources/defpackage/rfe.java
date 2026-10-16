package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class rfe {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public rfe(qvb qvbVar) {
        this.a = new rox(new rcn(4));
        this.b = new sss(Looper.getMainLooper());
        this.d = new ArrayList();
        this.e = new qvm(this);
        this.f = new ArrayList();
        this.g = new qxf(this);
        this.c = qvbVar;
    }

    public static Object a(byte[] bArr, abpc abpcVar, String str) {
        try {
            return abpcVar.g(bArr);
        } catch (abon e) {
            throw new IllegalArgumentException(a.bq(str, "Failed to parse a ", " message."), e);
        }
    }

    public static void e(String str, Object... objArr) {
        if (omc.c("CAR.AudioDiagnosticsMgr", 3)) {
            rrd.d(3, "CAR.AudioDiagnosticsMgr", null, str, objArr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qvb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qvn] */
    private final void m() {
        try {
            this.c.k(this.e);
            e("Unregistered audio stream diagnostics listener from car service.", new Object[0]);
        } catch (RemoteException | IllegalStateException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qvb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, qxg] */
    private final void n() {
        try {
            this.c.l(this.g);
            e("Unregistered microphone diagnostics listener from car service.", new Object[0]);
        } catch (RemoteException | IllegalStateException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void b(rfb rfbVar) throws qrz {
        ?? r0 = this.d;
        woy.S(!r0.contains(rfbVar), "Audio Stream diagnostics listener %s already registered", rfbVar);
        r0.add(rfbVar);
        if (r0.size() == 1) {
            ((rox) this.a).g(new rea(this, 5));
            e("Registered audio stream diagnostics listener with car service.", new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void c(rfd rfdVar) throws qrz {
        ?? r0 = this.f;
        woy.S(!r0.contains(rfdVar), "Microphone diagnostics listener %s already registered", rfdVar);
        r0.add(rfdVar);
        if (r0.size() == 1) {
            ((rox) this.a).g(new rea(this, 6));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void d() {
        this.d.clear();
        m();
        this.f.clear();
        n();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void f(rfb rfbVar) {
        ?? r0 = this.d;
        if (!r0.remove(rfbVar)) {
            e("Not removing Audio Stream diagnostics listener %s: it's already absent", rfbVar);
        } else if (r0.isEmpty()) {
            m();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void g(rfd rfdVar) {
        ?? r0 = this.f;
        if (!r0.remove(rfdVar)) {
            e("Not removing Microphone diagnostics listener %s: it's already absent", rfdVar);
        } else if (r0.isEmpty()) {
            n();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.lang.Object] */
    public final tqh h() {
        int i = 6;
        ygr ygrVarM = ygr.m(yrm.am(this.c, new txa(i)));
        ygr ygrVarM2 = ygr.m(yrm.am(this.a, new txa(i)));
        ygr ygrVarM3 = ygr.m(yrm.am(this.b, new txa(i)));
        ygr ygrVarM4 = ygr.m(yrm.am(this.e, new txa(i)));
        ygr.m(yrm.am(this.d, new txa(i)));
        ygr.m(yrm.am(this.f, new txa(i)));
        ygr.m(yrm.am(this.g, new txa(i)));
        return new tqh(ygrVarM, ygrVarM2, ygrVarM3, ygrVarM4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Set] */
    public final void i(udx udxVar, ucq ucqVar) {
        switch (ucqVar.ordinal()) {
            case 0:
                this.c.add(udxVar);
                break;
            case 1:
                this.a.add(udxVar);
                break;
            case 2:
                this.b.add(udxVar);
                break;
            case 3:
                this.e.add(udxVar);
                break;
            case 4:
                this.d.add(udxVar);
                break;
            case 5:
                this.g.add(udxVar);
                break;
            case 6:
                this.f.add(udxVar);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void j(udx udxVar) {
        this.c.remove(udxVar);
        this.a.remove(udxVar);
        this.b.remove(udxVar);
        this.e.remove(udxVar);
        this.d.remove(udxVar);
        this.g.remove(udxVar);
        this.f.remove(udxVar);
    }

    public final Iterable k() {
        int i = yfq.d;
        return new uax((gjv) this.e, yls.a);
    }

    public final void l(int i, yfg yfgVar) {
        Iterator<E> it = yfgVar.iterator();
        while (it.hasNext()) {
            Object obj = this.e;
            ((aeqz) ((gjv) obj).a).a((abeg) it.next(), i);
        }
    }

    public rfe(Context context, fiy fiyVar, ajdr ajdrVar, fng fngVar, WorkDatabase workDatabase, fod fodVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.c = fiyVar;
        this.b = ajdrVar;
        this.d = fngVar;
        this.a = workDatabase;
        this.f = fodVar;
        this.g = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.e = applicationContext;
        new dsz(null);
    }

    public rfe(byte[] bArr) {
        this.g = "d";
        this.a = "e";
        this.e = "f";
        this.c = "g";
        this.d = "h";
        this.b = "i";
        this.f = "j";
    }

    public rfe() {
        this.c = new HashSet();
        this.a = new HashSet();
        this.b = new HashSet();
        this.e = new HashSet();
        this.d = new HashSet();
        this.g = new HashSet();
        this.f = new HashSet();
    }

    public rfe(byte[] bArr, byte[] bArr2) {
        this.e = new gjv((short[]) null);
        this.f = new ArrayList();
        this.d = new ArrayList();
        this.b = new ArrayList();
        this.c = new aehy(16);
        this.a = new ArrayList();
        this.g = new HashSet();
    }
}
