package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class reh extends rdj {
    private qup l;

    public reh(Looper looper, final Runnable runnable) {
        super(looper);
        this.f = new rox(new Consumer() { // from class: reg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                RemoteException remoteException = (RemoteException) obj;
                if (omc.c("CAR.CLIENT", 3)) {
                    rrd.a("CAR.CLIENT", remoteException, "carServiceExceptionHandler invoked");
                }
                Runnable runnable2 = runnable;
                this.a.G();
                runnable2.run();
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.rdj
    public final synchronized qup C() {
        qup qupVar;
        qupVar = this.l;
        if (qupVar == null) {
            throw new IllegalStateException("WrapperCarClient not connected.");
        }
        return qupVar;
    }

    @Override // defpackage.rdj
    public final synchronized void G() {
        super.G();
        this.l = null;
    }

    public final synchronized void O(qup qupVar) {
        this.l = qupVar;
        if (qupVar != null) {
            E();
        }
    }

    public final boolean P() {
        return this.l != null;
    }
}
