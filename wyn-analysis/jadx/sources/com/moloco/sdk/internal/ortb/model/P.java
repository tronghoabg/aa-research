package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.C1903q;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class P {

    @NotNull
    public static final C1903q.b Companion = new C1903q.b();

    /* renamed from: a, reason: collision with root package name */
    public final Float f28738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28739b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28740c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f28741d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f28742e;

    public /* synthetic */ P(int i5, Float f10, String str, String str2, Integer num, Integer num2) {
        if ((i5 & 1) == 0) {
            this.f28738a = null;
        } else {
            this.f28738a = f10;
        }
        if ((i5 & 2) == 0) {
            this.f28739b = null;
        } else {
            this.f28739b = str;
        }
        if ((i5 & 4) == 0) {
            this.f28740c = null;
        } else {
            this.f28740c = str2;
        }
        if ((i5 & 8) == 0) {
            this.f28741d = null;
        } else {
            this.f28741d = num;
        }
        if ((i5 & 16) == 0) {
            this.f28742e = null;
        } else {
            this.f28742e = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return AbstractC3340k.a(this.f28738a, p10.f28738a) && AbstractC3340k.a(this.f28739b, p10.f28739b) && AbstractC3340k.a(this.f28740c, p10.f28740c) && AbstractC3340k.a(this.f28741d, p10.f28741d) && AbstractC3340k.a(this.f28742e, p10.f28742e);
    }

    public final int hashCode() {
        Float f10 = this.f28738a;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        String str = this.f28739b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28740c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f28741d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f28742e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "DECRatingSerializable(ratingValue=" + this.f28738a + ", foregroundColor=" + this.f28739b + ", backgroundColor=" + this.f28740c + ", size=" + this.f28741d + ", fontSize=" + this.f28742e + ')';
    }
}
