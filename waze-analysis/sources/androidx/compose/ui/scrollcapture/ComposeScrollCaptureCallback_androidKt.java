package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ComposeScrollCaptureCallback_androidKt {
    private static final boolean DEBUG = false;
    private static final String TAG = "ScrollCapture";

    /* JADX INFO: Access modifiers changed from: private */
    public static final br launchWithCancellationSignal(af afVar, CancellationSignal cancellationSignal, p<? super af, ? super e<? super ab>, ? extends Object> pVar) {
        final br brVarZ = aj.z(afVar, null, null, pVar, 3);
        brVarZ.bY(new AnonymousClass1(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$$ExternalSyntheticLambda0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                brVarZ.s(null);
            }
        });
        return brVarZ;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Throwable, ab> {
        final /* synthetic */ CancellationSignal $signal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CancellationSignal cancellationSignal) {
            super(1);
            this.$signal = cancellationSignal;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ ab invoke(Throwable th) {
            invoke2(th);
            return ab.f48028a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th != null) {
                this.$signal.cancel();
            }
        }
    }
}
