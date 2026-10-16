package defpackage;

import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.auto.components.externalkeyboard.phone.PhoneKeyboardActivity;

/* loaded from: classes3.dex */
final class xct implements xda {
    final /* synthetic */ EditorInfo a;
    final /* synthetic */ xcw b;

    public xct(xcw xcwVar, EditorInfo editorInfo) {
        this.a = editorInfo;
        this.b = xcwVar;
    }

    @Override // defpackage.xda
    public final EditorInfo a() {
        return this.a;
    }

    @Override // defpackage.xda
    public final InputConnection b() {
        InputConnection inputConnection = this.b.c;
        inputConnection.getClass();
        return inputConnection;
    }

    @Override // defpackage.xda
    public final void c(boolean z) {
        xcw xcwVar = this.b;
        xcwVar.l = z;
        if (z) {
            xcwVar.h();
        } else {
            xcwVar.g(true);
        }
    }

    @Override // defpackage.xda
    public final void d(boolean z) {
        xcw xcwVar = this.b;
        if (z) {
            xcwVar.g(false);
        } else {
            xcwVar.h();
        }
    }

    @Override // defpackage.xda
    public final void e() {
        ajmd ajmdVar = this.b.q;
        if (ajmdVar != null) {
            ((PhoneKeyboardActivity) ajmdVar.a).A();
        }
    }

    @Override // defpackage.xda
    public final void f() {
        rmi rmiVar = this.b.b;
        if (rmiVar == null) {
            rrd.d(5, "CAR.CLIENT.IME", null, "service attempted to stop input, but callback was null", new Object[0]);
            return;
        }
        try {
            rmiVar.e();
        } catch (RemoteException e) {
            rrd.b("CAR.CLIENT.IME", e, "unable to stop input from service");
        }
    }
}
