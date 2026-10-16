package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
final class aut extends ebx implements Runnable, View.OnAttachStateChangeListener, eaj {
    public boolean a;
    public boolean b;
    public ecy c;
    private final awp d;

    public aut(awp awpVar) {
        super(!awpVar.n ? 1 : 0);
        this.d = awpVar;
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        this.c = ecyVar;
        awp awpVar = this.d;
        awpVar.d(ecyVar);
        if (this.a) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.b) {
            awpVar.c(ecyVar);
            awpVar.e(ecyVar);
        }
        return awpVar.n ? ecy.a : ecyVar;
    }

    @Override // defpackage.ebx
    public final ecy b(ecy ecyVar, List list) {
        awp awpVar = this.d;
        awpVar.e(ecyVar);
        return awpVar.n ? ecy.a : ecyVar;
    }

    @Override // defpackage.ebx
    public final ebw c(lds ldsVar, ebw ebwVar) {
        this.a = false;
        return ebwVar;
    }

    @Override // defpackage.ebx
    public final void d(lds ldsVar) {
        this.a = false;
        this.b = false;
        ecy ecyVar = this.c;
        if (ldsVar.U() > 0 && ecyVar != null) {
            awp awpVar = this.d;
            awpVar.c(ecyVar);
            awpVar.d(ecyVar);
            awpVar.e(ecyVar);
        }
        this.c = null;
    }

    @Override // defpackage.ebx
    public final void e(lds ldsVar) {
        this.a = true;
        this.b = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            this.a = false;
            this.b = false;
            ecy ecyVar = this.c;
            if (ecyVar != null) {
                awp awpVar = this.d;
                awpVar.c(ecyVar);
                awpVar.e(ecyVar);
                this.c = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
