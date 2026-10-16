package defpackage;

import androidx.car.app.model.Action;

/* loaded from: classes.dex */
public final class hig {
    public final boolean a;
    public final Object b;
    public final Object c;

    public hig(Action action, ajmd ajmdVar) {
        this.b = action;
        this.a = (action.getFlags() & 2) != 0;
        this.c = ajmdVar;
    }

    public hig(ddu dduVar, dlp dlpVar, boolean z) {
        this.b = dduVar;
        this.c = dlpVar;
        this.a = z;
    }
}
