package defpackage;

import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class op implements epy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ op(bii biiVar, ob obVar, int i) {
        this.c = i;
        this.b = biiVar;
        this.a = obVar;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        if (this.c != 0) {
            if (eprVar == epr.ON_CREATE) {
                Object obj = this.a;
                Object obj2 = this.b;
                OnBackInvokedDispatcher onBackInvokedDispatcher = ((ob) obj).getOnBackInvokedDispatcher();
                onBackInvokedDispatcher.getClass();
                ((bii) obj2).z(onBackInvokedDispatcher);
                return;
            }
            return;
        }
        int iOrdinal = eprVar.ordinal();
        if (iOrdinal == 1) {
            ((ol) this.a).d(true);
            return;
        }
        if (iOrdinal == 4) {
            ((ol) this.a).d(false);
        } else {
            if (iOrdinal != 5) {
                return;
            }
            ((ewt) this.a).f();
            ((ept) this.b).d(this);
        }
    }

    public op(ol olVar, ept eptVar, int i) {
        this.c = i;
        this.a = olVar;
        this.b = eptVar;
    }
}
