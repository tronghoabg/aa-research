package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ffb extends defpackage.fge {
    final /* synthetic */ android.graphics.Rect a;

    public ffb(android.graphics.Rect rect) {
        this.a = rect;
    }

    @Override // defpackage.fge
    public final android.graphics.Rect a() {
        android.graphics.Rect rect = this.a;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
