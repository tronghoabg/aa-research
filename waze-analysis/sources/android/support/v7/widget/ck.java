package android.support.v7.widget;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ck implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cl f1240a;

    ck(cl clVar) {
        this.f1240a = clVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cl clVar = this.f1240a;
        clVar.f1241a = null;
        clVar.drawableStateChanged();
    }
}
