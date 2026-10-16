package com.waze.network.f;

import com.waze.strings.DisplayStrings;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    private final String f32274a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32275b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32276c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32277d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32278e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f32279f;

    public af(String str, long j2, String str2, String str3, byte[] bArr) {
        h.g.b.x.f(str, "token");
        h.g.b.x.f(str2, "userId");
        h.g.b.x.f(str3, "sessionId");
        this.f32274a = str;
        this.f32275b = j2;
        this.f32276c = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_2;
        this.f32277d = str2;
        this.f32278e = str3;
        this.f32279f = bArr;
    }

    public final long a() {
        return this.f32275b;
    }

    public final String b() {
        return this.f32278e;
    }

    public final String c() {
        return this.f32274a;
    }

    public final String d() {
        return this.f32277d;
    }

    public final byte[] e() {
        return this.f32279f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if (!h.g.b.x.n(this.f32274a, afVar.f32274a) || this.f32275b != afVar.f32275b) {
            return false;
        }
        int i2 = afVar.f32276c;
        return h.g.b.x.n(this.f32277d, afVar.f32277d) && h.g.b.x.n(this.f32278e, afVar.f32278e) && h.g.b.x.n(this.f32279f, afVar.f32279f);
    }

    public final int hashCode() {
        return (((((((((this.f32274a.hashCode() * 31) + a.a.b(this.f32275b)) * 31) + DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_PRIVATE_2) * 31) + this.f32277d.hashCode()) * 31) + this.f32278e.hashCode()) * 31) + Arrays.hashCode(this.f32279f);
    }

    public final String toString() {
        return "SessionToken(token=" + this.f32274a + ", loginId=" + this.f32275b + ", protocol=234, userId=" + this.f32277d + ", sessionId=" + this.f32278e + ", loginResponseData=" + Arrays.toString(this.f32279f) + ")";
    }
}
