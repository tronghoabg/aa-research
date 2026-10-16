package android.support.v4.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ck implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f268a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f269b;

    ck(View view, ArrayList arrayList) {
        this.f268a = view;
        this.f269b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f268a.setVisibility(8);
        ArrayList arrayList = this.f269b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) arrayList.get(i2)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
