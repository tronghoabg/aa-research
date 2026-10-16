package com.unity3d.ads.core.domain.exposure;

import Fe.e;
import Gf.s;
import Gf.t;
import android.support.v4.media.session.b;
import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import ef.C2515C;
import java.util.Locale;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "bytesDownloaded", "totalBytes", "Lef/C;", "<anonymous>", "(JJ)V"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1", f = "CommonAdViewerExposedFunctions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 extends AbstractC3471j implements q {
    final /* synthetic */ t $$this$channelFlow;
    final /* synthetic */ String $downloadId;
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(t tVar, String str, InterfaceC3103c<? super CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1> interfaceC3103c) {
        super(3, interfaceC3103c);
        this.$$this$channelFlow = tVar;
        this.$downloadId = str;
    }

    @Nullable
    public final Object invoke(long j8, long j10, @Nullable InterfaceC3103c<? super C2515C> interfaceC3103c) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(this.$$this$channelFlow, this.$downloadId, interfaceC3103c);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$0 = j8;
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$1 = j10;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.U(obj);
        long j8 = this.J$0;
        long j10 = this.J$1;
        Integer num = j10 > 0 ? new Integer(b.S((int) ((100 * j8) / j10), 0, 100)) : null;
        t tVar = this.$$this$channelFlow;
        String str = this.$downloadId;
        Long l10 = new Long(j10);
        String lowerCase = "REMOTE".toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        ((s) tVar).c(new OnDownloadProgressEvent(str, num, j8, l10, false, null, lowerCase));
        return C2515C.f34653a;
    }

    @Override // tf.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (InterfaceC3103c<? super C2515C>) obj3);
    }
}
