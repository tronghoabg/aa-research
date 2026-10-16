package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qhh extends qtw implements lhl {
    private static final yph b = yph.c("ADU.AppDecorServicePdr");
    public final List a = new ArrayList();
    private final qtt c;

    public qhh(qtt qttVar) {
        this.c = qttVar;
    }

    @Override // defpackage.lhl
    public final /* synthetic */ void a() {
        wer.c();
    }

    @Override // defpackage.lhl
    public final synchronized void b() {
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qua] */
    @Override // defpackage.lhl
    public final synchronized void c() {
        for (ikf ikfVar : this.a) {
            try {
                ((ype) b.l().ai(7253)).u("notifying client that AppDecorService is ready");
                ikfVar.a.a(this.c);
            } catch (RemoteException e) {
                ((ype) ((ype) b.h()).ai((char) 7254)).y("failed to notify onStart: %s", e);
            }
        }
        this.a.clear();
    }

    @Override // defpackage.lhl
    public final synchronized void d(boolean z, boolean z2) {
    }

    @Override // defpackage.lhl
    public final synchronized void e() {
    }

    @Override // defpackage.lhl
    public final synchronized boolean g(rbu rbuVar) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, qua] */
    @Override // defpackage.qtx
    public final synchronized void h(qua quaVar) throws RemoteException {
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 7251)).y("AppDecorService requested: %s", quaVar);
        quaVar.getClass();
        if (lbh.d().gN()) {
            quaVar.a(this.c);
            return;
        }
        ((ype) yphVar.l().ai((char) 7252)).u("Session not up yet, saving callback");
        List list = this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ikf) it.next()).a.asBinder() == quaVar.asBinder()) {
                throw new IllegalStateException("AppDecorServiceReadyCallback is already registered");
            }
        }
        list.add(new ikf(this, quaVar, 8));
    }

    @Override // defpackage.lhl
    public final void f() {
    }
}
