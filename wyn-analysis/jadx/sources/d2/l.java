package d2;

import Q1.x;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public class l extends H5.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f33991a;

    public l(IllegalStateException illegalStateException, m mVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(mVar == null ? null : mVar.f33992a);
        super(sb2.toString(), illegalStateException);
        boolean z2 = illegalStateException instanceof MediaCodec.CodecException;
        this.f33991a = x.f9724a >= 23 ? z2 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : x.v(z2 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null);
    }
}
