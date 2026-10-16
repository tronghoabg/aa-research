package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class kfb extends llu {
    final /* synthetic */ kfc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfb(kfc kfcVar) {
        super((int[]) null);
        this.a = kfcVar;
    }

    @Override // defpackage.llu
    public final void d(AaPlaybackState aaPlaybackState) {
        if (aaPlaybackState == null || !kfc.b(aaPlaybackState.Q())) {
            return;
        }
        kfc kfcVar = this.a;
        kfcVar.c(3, kfcVar.c.getString(R.string.play_from_search_supported_test_play_session_changed));
        kfc.d(kfcVar.b.V(), aaPlaybackState);
    }
}
