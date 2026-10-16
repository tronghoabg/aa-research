package H5;

import Q1.x;
import java.util.Locale;
import u6.v;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4904a;

    /* renamed from: b, reason: collision with root package name */
    public int f4905b;

    /* renamed from: c, reason: collision with root package name */
    public int f4906c;

    /* renamed from: d, reason: collision with root package name */
    public int f4907d;

    /* renamed from: e, reason: collision with root package name */
    public int f4908e;

    /* renamed from: f, reason: collision with root package name */
    public int f4909f;

    /* renamed from: g, reason: collision with root package name */
    public int f4910g;

    /* renamed from: h, reason: collision with root package name */
    public int f4911h;

    /* renamed from: i, reason: collision with root package name */
    public int f4912i;

    /* renamed from: j, reason: collision with root package name */
    public int f4913j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f4914l;

    /* renamed from: m, reason: collision with root package name */
    public int f4915m;

    public final String toString() {
        switch (this.f4904a) {
            case 0:
                int i5 = this.f4905b;
                int i10 = this.f4906c;
                int i11 = this.f4907d;
                int i12 = this.f4908e;
                int i13 = this.f4909f;
                int i14 = this.f4910g;
                int i15 = this.f4911h;
                int i16 = this.f4912i;
                int i17 = this.f4913j;
                int i18 = this.k;
                long j8 = this.f4914l;
                int i19 = this.f4915m;
                int i20 = v.f46721a;
                Locale locale = Locale.US;
                StringBuilder sbH = R8.v.h("DecoderCounters {\n decoderInits=", i5, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
                R8.v.i(i11, i12, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbH);
                R8.v.i(i13, i14, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbH);
                R8.v.i(i15, i16, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbH);
                R8.v.i(i17, i18, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbH);
                sbH.append(j8);
                sbH.append("\n videoFrameProcessingOffsetCount=");
                sbH.append(i19);
                sbH.append("\n}");
                return sbH.toString();
            default:
                int i21 = this.f4905b;
                int i22 = this.f4906c;
                int i23 = this.f4907d;
                int i24 = this.f4908e;
                int i25 = this.f4909f;
                int i26 = this.f4910g;
                int i27 = this.f4911h;
                int i28 = this.f4912i;
                int i29 = this.f4913j;
                int i30 = this.k;
                long j10 = this.f4914l;
                int i31 = this.f4915m;
                int i32 = x.f9724a;
                Locale locale2 = Locale.US;
                StringBuilder sbH2 = R8.v.h("DecoderCounters {\n decoderInits=", i21, ",\n decoderReleases=", i22, "\n queuedInputBuffers=");
                R8.v.i(i23, i24, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbH2);
                R8.v.i(i25, i26, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbH2);
                R8.v.i(i27, i28, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbH2);
                R8.v.i(i29, i30, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbH2);
                sbH2.append(j10);
                sbH2.append("\n videoFrameProcessingOffsetCount=");
                sbH2.append(i31);
                sbH2.append("\n}");
                return sbH2.toString();
        }
    }
}
