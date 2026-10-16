package com.google.android.play.core.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f6955a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f6956b;

    /* synthetic */ q(String str, Long l2) {
        this.f6955a = str;
        this.f6956b = l2;
    }

    public final Long a() {
        return this.f6956b;
    }

    public final String b() {
        return this.f6955a;
    }

    public final boolean equals(Object obj) {
        Long l2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f6955a.equals(qVar.f6955a) && ((l2 = this.f6956b) != null ? l2.equals(qVar.f6956b) : qVar.f6956b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6955a.hashCode() ^ 1000003;
        Long l2 = this.f6956b;
        return (l2 == null ? 0 : l2.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f6955a + ", cloudProjectNumber=" + this.f6956b + "}";
    }

    public q() {
        throw null;
    }
}
