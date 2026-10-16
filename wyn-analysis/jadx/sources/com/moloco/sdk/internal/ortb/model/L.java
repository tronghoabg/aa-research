package com.moloco.sdk.internal.ortb.model;

import Wf.C1241c;
import com.moloco.sdk.internal.ortb.model.C1901o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class L {

    @NotNull
    public static final C1901o.b Companion = new C1901o.b();

    /* renamed from: c, reason: collision with root package name */
    public static final KSerializer[] f28724c = {null, new C1241c(V.f28749a, 0)};

    /* renamed from: a, reason: collision with root package name */
    public final Integer f28725a;

    /* renamed from: b, reason: collision with root package name */
    public final List f28726b;

    public /* synthetic */ L(int i5, Integer num, List list) {
        if ((i5 & 1) == 0) {
            this.f28725a = null;
        } else {
            this.f28725a = num;
        }
        if ((i5 & 2) == 0) {
            this.f28726b = null;
        } else {
            this.f28726b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return AbstractC3340k.a(this.f28725a, l10.f28725a) && AbstractC3340k.a(this.f28726b, l10.f28726b);
    }

    public final int hashCode() {
        Integer num = this.f28725a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f28726b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DECBorderSerializable(borderWidth=" + this.f28725a + ", gradient=" + this.f28726b + ')';
    }
}
