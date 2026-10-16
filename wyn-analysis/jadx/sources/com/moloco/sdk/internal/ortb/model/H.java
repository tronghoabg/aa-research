package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.C1899m;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class H {

    @NotNull
    public static final C1899m.b Companion = new C1899m.b();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f28715a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28716b;

    /* renamed from: c, reason: collision with root package name */
    public final L f28717c;

    public /* synthetic */ H(int i5, Integer num, String str, L l10) {
        if ((i5 & 1) == 0) {
            this.f28715a = null;
        } else {
            this.f28715a = num;
        }
        if ((i5 & 2) == 0) {
            this.f28716b = null;
        } else {
            this.f28716b = str;
        }
        if ((i5 & 4) == 0) {
            this.f28717c = null;
        } else {
            this.f28717c = l10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return AbstractC3340k.a(this.f28715a, h10.f28715a) && AbstractC3340k.a(this.f28716b, h10.f28716b) && AbstractC3340k.a(this.f28717c, h10.f28717c);
    }

    public final int hashCode() {
        Integer num = this.f28715a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f28716b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        L l10 = this.f28717c;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "DECAppIconSerializable(size=" + this.f28715a + ", appIconUri=" + this.f28716b + ", border=" + this.f28717c + ')';
    }
}
