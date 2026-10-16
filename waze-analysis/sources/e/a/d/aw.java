package e.a.d;

import androidx.media3.common.C;
import androidx.media3.exoplayer.upstream.CmcdData;
import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f46627a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f46628b = "CallOptions";

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bh f46629c;

    aw(bh bhVar, long j2) {
        this.f46627a = j2;
        Objects.requireNonNull(bhVar);
        this.f46629c = bhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2 = this.f46627a;
        long jAbs = Math.abs(j2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j3 = jAbs / C.NANOS_PER_SECOND;
        long jAbs2 = Math.abs(j2);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long j4 = jAbs2 % C.NANOS_PER_SECOND;
        StringBuilder sb = new StringBuilder();
        if (j2 < 0) {
            sb.append("ClientCall started after ");
            sb.append(this.f46628b);
            sb.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb.append("Deadline ");
            sb.append(this.f46628b);
            sb.append(" was exceeded after ");
        }
        sb.append(j3);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(j4)));
        sb.append(CmcdData.STREAMING_FORMAT_SS);
        this.f46629c.o(e.a.ee.f47404d.g(sb.toString()), true);
    }
}
