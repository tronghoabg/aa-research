package defpackage;

import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class xcv extends Binder implements IBinder {
    public final /* synthetic */ xcw a;

    public xcv(xcw xcwVar) {
        this.a = xcwVar;
    }

    public final boolean a(int i) {
        xdc xdcVarF;
        if (i != -1) {
            xcw xcwVar = this.a;
            if (i == xcwVar.m && (xdcVarF = xcwVar.f()) != null && xdcVarF.getView() != null) {
                return true;
            }
        }
        return false;
    }
}
