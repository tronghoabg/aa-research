package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ce extends android.transition.Transition.EpicenterCallback {
    final /* synthetic */ android.graphics.Rect a;

    public ce(android.graphics.Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        return this.a;
    }
}
