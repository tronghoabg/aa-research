package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fhi extends AnimatorListenerAdapter {
    final /* synthetic */ fhl a;

    public fhi(fhl fhlVar) {
        this.a = fhlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fhl fhlVar = this.a;
        ArrayList arrayList = new ArrayList(fhlVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fhh) arrayList.get(i)).b(fhlVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        fhl fhlVar = this.a;
        ArrayList arrayList = new ArrayList(fhlVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fhh) arrayList.get(i)).c(fhlVar);
        }
    }
}
