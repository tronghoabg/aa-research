package android.support.v7.widget;

import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fy extends EmojiCompat.InitCallback {

    /* renamed from: a, reason: collision with root package name */
    private final Reference f1532a;

    fy(SwitchCompat switchCompat) {
        this.f1532a = new WeakReference(switchCompat);
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onFailed(Throwable th) {
        SwitchCompat switchCompat = (SwitchCompat) this.f1532a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat.InitCallback
    public final void onInitialized() {
        SwitchCompat switchCompat = (SwitchCompat) this.f1532a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
