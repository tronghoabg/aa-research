package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes2.dex */
final class lpm extends llu {
    final /* synthetic */ lpn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lpm(lpn lpnVar) {
        super((int[]) null);
        this.a = lpnVar;
    }

    @Override // defpackage.llu
    public final void d(AaPlaybackState aaPlaybackState) {
        yph yphVar = lpq.a;
        lpn lpnVar = this.a;
        lpnVar.a.R();
        lpnVar.m(aaPlaybackState);
    }

    @Override // defpackage.llu
    public final void w() {
        yph yphVar = lpq.a;
        lpn lpnVar = this.a;
        lpnVar.a.R();
        lpnVar.m(null);
    }
}
