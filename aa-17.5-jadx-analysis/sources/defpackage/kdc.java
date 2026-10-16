package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import java.util.List;

/* loaded from: classes2.dex */
public final class kdc extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ List b;
    final /* synthetic */ ActionStripView c;

    public kdc(ActionStripView actionStripView, boolean z, List list) {
        this.a = z;
        this.b = list;
        this.c = actionStripView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.a;
        ActionStripView actionStripView = this.c;
        if (!z) {
            actionStripView.e(false);
            kcj kcjVar = actionStripView.e;
            if (kcjVar != null) {
                kcjVar.fb();
                return;
            }
            return;
        }
        actionStripView.d(true);
        int i = actionStripView.d;
        if (i >= 0) {
            List list = this.b;
            if (i < list.size()) {
                ((View) list.get(actionStripView.d)).requestFocus();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        boolean z = this.a;
        ActionStripView actionStripView = this.c;
        if (!z) {
            actionStripView.d(false);
            return;
        }
        actionStripView.e(true);
        kcj kcjVar = actionStripView.e;
        if (kcjVar != null) {
            kcjVar.fb();
        }
    }
}
