package defpackage;

import android.view.KeyEvent;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class rmn implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public rmn(qrg qrgVar, Callable callable, int i) {
        this.c = i;
        this.b = callable;
        this.a = qrgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        if (this.c == 0) {
            return Boolean.valueOf(((rmk) this.b).a.sendKeyEvent((KeyEvent) this.a));
        }
        yop yopVarAi = qrg.a.l().ai(7679);
        ?? r1 = this.b;
        yopVarAi.y("doBinderTask on main thread. task=%s", r1);
        qrg qrgVar = (qrg) this.a;
        qrgVar.j();
        qrgVar.r.c();
        if (qrgVar.g == null) {
            throw new IllegalStateException("CarNotConnected");
        }
        if (qrgVar.i) {
            throw new IllegalStateException("CarNotConnected");
        }
        return (Boolean) r1.call();
    }

    public rmn(rmk rmkVar, KeyEvent keyEvent, int i) {
        this.c = i;
        this.a = keyEvent;
        this.b = rmkVar;
    }
}
