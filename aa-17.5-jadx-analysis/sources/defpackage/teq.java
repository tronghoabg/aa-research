package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class teq implements tep {
    final /* synthetic */ ter a;
    private volatile Object b;

    public teq(ter terVar) {
        this.a = terVar;
    }

    @Override // defpackage.tep
    public final Object b(Context context) {
        Object objB;
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        ter terVar = this.a;
        synchronized (this) {
            objB = this.b;
            if (objB == null) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                objB = terVar.b(applicationContext);
                this.b = objB;
            }
        }
        return objB;
    }
}
