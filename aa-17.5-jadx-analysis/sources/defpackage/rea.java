package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rea implements rze {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rea(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, qvn] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, qxg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rpg] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, qvb] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, qvb] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, qus] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, quv] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, qup] */
    @Override // defpackage.rze
    public final void a() throws RemoteException {
        int i = this.b;
        if (i == 0) {
            ?? r3 = this.a;
            ((rpf) r3).a.bh(r3);
            return;
        }
        if (i == 1) {
            ((sgk) ((rdx) this.a).e).b().o();
            return;
        }
        if (i == 2) {
            ?? r32 = this.a;
            ((qur) r32).a.bd(r32);
            return;
        }
        if (i == 3) {
            ?? r33 = this.a;
            ((quu) r33).a.be(r33);
            return;
        }
        if (i == 4) {
            this.a.bf();
            return;
        }
        Object obj = this.a;
        if (i != 5) {
            rfe rfeVar = (rfe) obj;
            rfeVar.c.h(rfeVar.g);
            rfe.e("Registered microphone diagnostics listener with car service.", new Object[0]);
            return;
        }
        rfe rfeVar2 = (rfe) obj;
        rfeVar2.c.g(rfeVar2.e);
        rfe.e("Registered audio stream diagnostics listener with car service.", new Object[0]);
    }
}
