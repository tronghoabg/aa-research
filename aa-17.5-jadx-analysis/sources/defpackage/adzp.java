package defpackage;

import android.os.RemoteException;
import androidx.car.app.AppManager;
import androidx.car.app.IAppHost;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.util.DesugarCollections;

/* loaded from: classes3.dex */
public final class adzp {
    public final Object a;
    public int b;
    public Object c;

    public adzp() {
        this.a = DesugarCollections.synchronizedMap(new yw());
        this.b = 0;
    }

    public static adzp b(qn qnVar, CharSequence charSequence) {
        qnVar.getClass();
        adzp adzpVar = new adzp(qnVar);
        charSequence.getClass();
        adzpVar.c = charSequence;
        adzpVar.b = 1;
        return adzpVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    public final void a() {
        final ?? r0 = this.c;
        if (r0 == 0) {
            throw new IllegalStateException("setText must have been called");
        }
        AppManager appManager = (AppManager) ((qn) this.a).a(AppManager.class);
        final int i = this.b;
        appManager.c.c(CloudRecognizerProtocolStrings.APP, "showToast", new qo() { // from class: pu
            @Override // defpackage.qo
            public final Object a(Object obj) throws RemoteException {
                ((IAppHost) obj).showToast(r0, i);
                return null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object] */
    public final ots c() {
        abnp abnpVarK = ((abnv) this.c).K();
        abnpVarK.t();
        ((ots) abnpVarK.b).g = abpf.b;
        abnpVarK.A(this.a);
        int i = this.b;
        abnpVarK.t();
        ots otsVar = (ots) abnpVarK.b;
        otsVar.b |= 16;
        otsVar.h = i;
        return (ots) abnpVarK.q();
    }

    public adzp(int i) {
        this.c = ots.a;
        this.a = new ydx(i);
    }

    public adzp(Object obj) {
        this.a = obj;
    }
}
