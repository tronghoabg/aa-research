package com.bytedance.sdk.openadsdk.core.dz.oa;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dz.oa.yo;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public class uef extends yo implements Comparable<uef> {
    public long uef;

    /* renamed from: com.bytedance.sdk.openadsdk.core.dz.oa.uef$uef, reason: collision with other inner class name */
    public static class C0095uef {

        /* renamed from: oa, reason: collision with root package name */
        private final long f25586oa;
        private final String uef;
        private yo.EnumC0096yo yo = yo.EnumC0096yo.TRACKING_URL;

        public C0095uef(String str, long j8) {
            this.uef = str;
            this.f25586oa = j8;
        }

        public uef uef() {
            return new uef(this.f25586oa, this.uef, this.yo, Boolean.FALSE);
        }
    }

    public uef(long j8, String str, yo.EnumC0096yo enumC0096yo, Boolean bool) {
        super(str, enumC0096yo, bool);
        this.uef = j8;
    }

    public String toString() {
        return super.toString();
    }

    public long uef() {
        return this.uef;
    }

    public static int uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Float.parseFloat(strArrSplit[2]) * 1000.0f) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Integer.parseInt(strArrSplit[0]) * 3600000));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean uef(long j8) {
        return this.uef <= j8 && !moa();
    }

    @Override // java.lang.Comparable
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    public int compareTo(uef uefVar) {
        if (uefVar == null) {
            return 1;
        }
        long j8 = this.uef;
        long j10 = uefVar.uef;
        if (j8 > j10) {
            return 1;
        }
        return j8 < j10 ? -1 : 0;
    }
}
