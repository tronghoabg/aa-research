package com.google.b.d.b;

import android.text.TextUtils;
import com.google.d.d.bn;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final bn f7073a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f7074b;

    /* renamed from: c, reason: collision with root package name */
    private final UUID f7075c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7076d;

    /* synthetic */ ab(bn bnVar, bn bnVar2, UUID uuid, long j2) {
        this.f7073a = bnVar;
        this.f7074b = bnVar2;
        this.f7075c = uuid;
        this.f7076d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ab) {
            ab abVar = (ab) obj;
            if (this.f7073a.equals(abVar.f7073a) && this.f7074b.equals(abVar.f7074b) && this.f7075c.equals(abVar.f7075c) && this.f7076d == abVar.f7076d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f7073a.hashCode() ^ 1000003) * 1000003) ^ this.f7074b.hashCode()) * 1000003) ^ this.f7075c.hashCode();
        long j2 = this.f7076d;
        return ((int) (j2 ^ (j2 >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f7073a);
    }

    ab() {
        throw null;
    }
}
