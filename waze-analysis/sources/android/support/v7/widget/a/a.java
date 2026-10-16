package android.support.v7.widget.a;

import android.support.v7.widget.fe;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f990a;

    a(j jVar) {
        this.f990a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f990a;
        if (jVar.f1015b == null || !jVar.m()) {
            return;
        }
        fe feVar = jVar.f1015b;
        if (feVar != null) {
            jVar.e(feVar);
        }
        jVar.f1024k.removeCallbacks(jVar.f1025l);
        ViewCompat.postOnAnimation(jVar.f1024k, this);
    }
}
