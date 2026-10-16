package androidx.compose.ui.viewinterop;

import android.os.Handler;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends y implements l<AndroidViewHolder, ab> {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AndroidViewHolder androidViewHolder) {
        Handler handler = androidViewHolder.getHandler();
        final a aVar = androidViewHolder.runUpdate;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$Companion$OnCommitAffectingUpdate$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        });
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(AndroidViewHolder androidViewHolder) {
        invoke2(androidViewHolder);
        return ab.f48028a;
    }
}
