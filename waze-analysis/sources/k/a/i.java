package k.a;

import com.waze.strings.DisplayStrings;
import h.g.b.x;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import k.ab;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ab f50764a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f50765b;

    /* renamed from: c, reason: collision with root package name */
    private final String f50766c;

    /* renamed from: d, reason: collision with root package name */
    private final long f50767d;

    /* renamed from: e, reason: collision with root package name */
    private final long f50768e;

    /* renamed from: f, reason: collision with root package name */
    private final long f50769f;

    /* renamed from: g, reason: collision with root package name */
    private final int f50770g;

    /* renamed from: h, reason: collision with root package name */
    private final long f50771h;

    /* renamed from: i, reason: collision with root package name */
    private final int f50772i;

    /* renamed from: j, reason: collision with root package name */
    private final int f50773j;

    /* renamed from: k, reason: collision with root package name */
    private final Long f50774k;

    /* renamed from: l, reason: collision with root package name */
    private final Long f50775l;
    private final Long m;
    private final Integer n;
    private final Integer o;
    private final Integer p;
    private final List q;

    public /* synthetic */ i(ab abVar, boolean z, String str, long j2, long j3, long j4, int i2, long j5, int i3, int i4, Long l2, Long l3, Long l4, int i5) {
        this(abVar, ((i5 & 2) == 0) & z, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? -1L : j2, (i5 & 16) != 0 ? -1L : j3, (i5 & 32) != 0 ? -1L : j4, (i5 & 64) != 0 ? -1 : i2, (i5 & 128) != 0 ? -1L : j5, (i5 & 256) != 0 ? -1 : i3, (i5 & 512) != 0 ? -1 : i4, (i5 & 1024) != 0 ? null : l2, (i5 & 2048) != 0 ? null : l3, (i5 & 4096) != 0 ? null : l4, null, null, null);
    }

    public final int a() {
        return this.f50770g;
    }

    public final long b() {
        return this.f50768e;
    }

    public final long c() {
        return this.f50771h;
    }

    public final long d() {
        return this.f50769f;
    }

    public final Long e() {
        Long l2 = this.m;
        if (l2 != null) {
            return Long.valueOf(k.a(l2.longValue()));
        }
        if (this.p == null) {
            return null;
        }
        return Long.valueOf(r4.intValue() * 1000);
    }

    public final Long f() {
        Long l2 = this.f50775l;
        if (l2 != null) {
            return Long.valueOf(k.a(l2.longValue()));
        }
        if (this.o == null) {
            return null;
        }
        return Long.valueOf(r4.intValue() * 1000);
    }

    public final Long g() {
        Long l2 = this.f50774k;
        if (l2 != null) {
            return Long.valueOf(k.a(l2.longValue()));
        }
        if (this.n != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i2 = this.f50773j;
        if (i2 == -1) {
            return null;
        }
        int i3 = this.f50772i;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        int i4 = i2 & 31;
        gregorianCalendar.set(((i3 >> 9) & 127) + DisplayStrings.DS_VOICE_PROMPTS_BE_EXTRA_CLEAR_TEXT, ((i3 >> 5) & 15) - 1, i3 & 31, i2 >> 11, (i2 >> 5) & 63, i4 + i4);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    public final List h() {
        return this.q;
    }

    public final ab i() {
        return this.f50764a;
    }

    public final i j(Integer num, Integer num2, Integer num3) {
        return new i(this.f50764a, this.f50765b, this.f50766c, this.f50767d, this.f50768e, this.f50769f, this.f50770g, this.f50771h, this.f50772i, this.f50773j, this.f50774k, this.f50775l, this.m, num, num2, num3);
    }

    public final boolean k() {
        return this.f50765b;
    }

    public i(ab abVar, boolean z, String str, long j2, long j3, long j4, int i2, long j5, int i3, int i4, Long l2, Long l3, Long l4, Integer num, Integer num2, Integer num3) {
        x.f(abVar, "canonicalPath");
        x.f(str, "comment");
        this.f50764a = abVar;
        this.f50765b = z;
        this.f50766c = str;
        this.f50767d = j2;
        this.f50768e = j3;
        this.f50769f = j4;
        this.f50770g = i2;
        this.f50771h = j5;
        this.f50772i = i3;
        this.f50773j = i4;
        this.f50774k = l2;
        this.f50775l = l3;
        this.m = l4;
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = new ArrayList();
    }
}
