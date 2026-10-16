package androidx.compose.ui.platform;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidPlatformTextInputSession$startInputMethod$3$1$1 extends y implements l<Throwable, ab> {
    final /* synthetic */ InputMethodSession $methodSession;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPlatformTextInputSession$startInputMethod$3$1$1(InputMethodSession inputMethodSession, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.$methodSession = inputMethodSession;
        this.this$0 = androidPlatformTextInputSession;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$methodSession.dispose();
        this.this$0.textInputService.stopInput();
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
        invoke2(th);
        return ab.f48028a;
    }
}
