package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ewe extends erm {
    public WeakReference a;

    @Override // defpackage.erm
    protected final void d() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            affa.d("completeTransition");
            weakReference = null;
        }
        afdr afdrVar = (afdr) weakReference.get();
        if (afdrVar != null) {
            afdrVar.invoke();
        }
    }
}
