package com.ironsource.adqualitysdk.sdk;

import Va.Ab;
import Va.AbstractC1104pb;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes4.dex */
public class ISAdQualitySegment {

    /* renamed from: a, reason: collision with root package name */
    public final String f28287a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28288b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28289c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28290d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f28291e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28292f;

    /* renamed from: g, reason: collision with root package name */
    public final double f28293g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f28294h;

    @Deprecated
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f28295a;

        /* renamed from: c, reason: collision with root package name */
        public String f28297c;

        /* renamed from: b, reason: collision with root package name */
        public int f28296b = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f28298d = -1;

        /* renamed from: e, reason: collision with root package name */
        public AtomicBoolean f28299e = null;

        /* renamed from: f, reason: collision with root package name */
        public long f28300f = 0;

        /* renamed from: g, reason: collision with root package name */
        public double f28301g = -1.0d;

        /* renamed from: h, reason: collision with root package name */
        public final HashMap f28302h = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f28295a, this.f28296b, this.f28297c, this.f28298d, this.f28299e, this.f28301g, this.f28300f, new HashMap(this.f28302h));
        }

        @Deprecated
        public Builder setAge(int i5) {
            if (i5 == 0) {
                return this;
            }
            if (i5 > 0 && i5 <= 199) {
                this.f28296b = i5;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setAge( ");
            sb2.append(i5);
            sb2.append(" ) age must be between 1-199");
            Ab.k("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setCustomData(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                HashMap map = this.f28302h;
                try {
                    if (map.size() >= 5) {
                        StringBuilder sb2 = new StringBuilder("setCustomData( ");
                        sb2.append(str);
                        sb2.append(" , ");
                        sb2.append(str2);
                        sb2.append(" ) limited to 5 custom values. Ignoring custom value.");
                        Ab.k("ISAdQualitySegment Builder", sb2.toString());
                        return this;
                    }
                    if (AbstractC1104pb.o0(str) && AbstractC1104pb.o0(str2) && AbstractC1104pb.N(32, str) && AbstractC1104pb.N(32, str2)) {
                        map.put("sgct_".concat(String.valueOf(str)), str2);
                        return this;
                    }
                    StringBuilder sb3 = new StringBuilder("setCustomData( ");
                    sb3.append(str);
                    sb3.append(" , ");
                    sb3.append(str2);
                    sb3.append(" ) key and value must be alphanumeric and 1-32 in length");
                    Ab.k("ISAdQualitySegment Builder", sb3.toString());
                    return this;
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
            return this;
        }

        @Deprecated
        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals("male") || str.toLowerCase(locale).equals("female")) {
                this.f28297c = str.toLowerCase(locale);
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setGender( ");
            sb2.append(str);
            sb2.append(" ) is invalid");
            Ab.k("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setInAppPurchasesTotal(double d3) {
            if (d3 >= 0.0d && d3 < 999999.99d) {
                this.f28301g = Math.floor(d3 * 100.0d) / 100.0d;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setIAPTotal( ");
            sb2.append(d3);
            sb2.append(" ) iapt must be between 0-999999.99");
            Ab.k("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setIsPaying(boolean z2) {
            if (this.f28299e == null) {
                this.f28299e = new AtomicBoolean();
            }
            this.f28299e.set(z2);
            return this;
        }

        @Deprecated
        public Builder setLevel(int i5) {
            if (i5 == 0) {
                return this;
            }
            if (i5 > 0 && i5 < 999999) {
                this.f28298d = i5;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setLevel( ");
            sb2.append(i5);
            sb2.append(" ) level must be between 1-999999");
            Ab.k("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (AbstractC1104pb.o0(str) && AbstractC1104pb.N(32, str)) {
                this.f28295a = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setSegmentName( ");
            sb2.append(str);
            sb2.append(" ) segment name must be alphanumeric and 1-32 in length");
            Ab.k("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setUserCreationDate(long j8) {
            if (j8 == 0) {
                return this;
            }
            if (j8 > 0) {
                this.f28300f = j8;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setUserCreationDate( ");
            sb2.append(j8);
            sb2.append(" ) is an invalid timestamp");
            Ab.k("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }
    }

    public ISAdQualitySegment(String str, int i5, String str2, int i10, AtomicBoolean atomicBoolean, double d3, long j8, HashMap map) {
        this.f28287a = str;
        this.f28288b = i5;
        this.f28289c = str2;
        this.f28290d = i10;
        this.f28291e = atomicBoolean;
        this.f28293g = d3;
        this.f28292f = j8;
        this.f28294h = map;
    }

    @Deprecated
    public int getAge() {
        return this.f28288b;
    }

    @Deprecated
    public Map<String, String> getCustomData() {
        return this.f28294h;
    }

    @Deprecated
    public String getGender() {
        return this.f28289c;
    }

    @Deprecated
    public double getInAppPurchasesTotal() {
        return this.f28293g;
    }

    @Deprecated
    public AtomicBoolean getIsPaying() {
        return this.f28291e;
    }

    @Deprecated
    public int getLevel() {
        return this.f28290d;
    }

    @Deprecated
    public String getName() {
        return this.f28287a;
    }

    @Deprecated
    public long getUserCreationDate() {
        return this.f28292f;
    }
}
