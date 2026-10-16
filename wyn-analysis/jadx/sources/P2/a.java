package P2;

import java.util.List;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3409K f9055a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9056b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9057c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9058d;

    public a(List list, long j8, long j10) {
        this.f9055a = AbstractC3409K.j(list);
        this.f9056b = j8;
        this.f9057c = j10;
        long j11 = -9223372036854775807L;
        if (j8 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j8 + j10;
        }
        this.f9058d = j11;
    }
}
