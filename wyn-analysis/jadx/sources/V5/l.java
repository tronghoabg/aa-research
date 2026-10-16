package V5;

import android.media.MediaCodec;

/* loaded from: classes3.dex */
public class l extends H5.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f13060a;

    public l(IllegalStateException illegalStateException, n nVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(nVar == null ? null : nVar.f13061a);
        super(sb2.toString(), illegalStateException);
        if (u6.v.f46721a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f13060a = diagnosticInfo;
    }
}
