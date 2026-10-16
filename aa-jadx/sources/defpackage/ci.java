package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ci extends android.transition.Transition.EpicenterCallback {
    final /* synthetic */ android.graphics.Rect a;

    public ci(android.graphics.Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        android.graphics.Rect rect = this.a;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
