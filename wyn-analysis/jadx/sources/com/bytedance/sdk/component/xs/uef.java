package com.bytedance.sdk.component.xs;

import N0.a;
import android.os.Bundle;
import com.bytedance.sdk.component.oa.uef.bcc;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.uef.uef.lw;
import com.bytedance.sdk.component.xs.yo.moa;
import com.bytedance.sdk.openadsdk.sy.moa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private static yo f25114oa;
    private static lw uef;
    private dj yo;

    public interface oa {
        void oa(moa moaVar);

        void uef(moa moaVar);

        void yo(moa moaVar);
    }

    /* renamed from: com.bytedance.sdk.component.xs.uef$uef, reason: collision with other inner class name */
    public static final class C0068uef {
        private Set<String> ivm;
        oa moa;
        private Bundle xs;
        final List<bcc> lw = new ArrayList();
        int uef = 10000;

        /* renamed from: oa, reason: collision with root package name */
        int f25115oa = 10000;
        int yo = 10000;

        public C0068uef uef(boolean z2) {
            return this;
        }

        public C0068uef yo(long j8, TimeUnit timeUnit) {
            this.yo = uef("timeout", j8, timeUnit);
            return this;
        }

        public C0068uef oa(long j8, TimeUnit timeUnit) {
            this.f25115oa = uef("timeout", j8, timeUnit);
            return this;
        }

        public C0068uef uef(long j8, TimeUnit timeUnit) {
            this.uef = uef("timeout", j8, timeUnit);
            return this;
        }

        public C0068uef uef(bcc bccVar) {
            this.lw.add(bccVar);
            return this;
        }

        public C0068uef uef(oa oaVar) {
            this.moa = oaVar;
            return this;
        }

        private static int uef(String str, long j8, TimeUnit timeUnit) {
            if (j8 < 0) {
                throw new IllegalArgumentException(a.f(str, " < 0"));
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j8);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(a.f(str, " too large."));
                }
                if (millis != 0 || j8 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(a.f(str, " too small."));
            }
            throw new NullPointerException("unit == null");
        }

        public uef uef() {
            return new uef(this);
        }
    }

    public interface yo {
        boolean oa();

        void uef(String str, String str2, String str3, int i5, String str4, boolean z2, int i10, int i11);

        boolean uef();
    }

    public static boolean ivm() {
        yo yoVar = f25114oa;
        if (yoVar == null) {
            return false;
        }
        return yoVar.uef();
    }

    public static boolean lw() {
        lw lwVar = uef;
        if (lwVar == null) {
            return false;
        }
        return lwVar.uef();
    }

    public static void uef() {
        com.bytedance.sdk.component.xs.yo.moa.uef(moa.uef.DEBUG);
    }

    public static boolean xs() {
        yo yoVar = f25114oa;
        if (yoVar == null) {
            return false;
        }
        return yoVar.oa();
    }

    public dj bcc() {
        return this.yo;
    }

    public com.bytedance.sdk.component.xs.oa.uef moa() {
        return new com.bytedance.sdk.component.xs.oa.uef(this.yo);
    }

    public com.bytedance.sdk.component.xs.oa.moa oa() {
        return new com.bytedance.sdk.component.xs.oa.moa(this.yo);
    }

    public com.bytedance.sdk.component.xs.oa.oa yo() {
        return new com.bytedance.sdk.component.xs.oa.oa(this.yo);
    }

    private uef(C0068uef c0068uef) {
        dj.uef uefVar = new dj.uef();
        long j8 = c0068uef.uef;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dj.uef uefVarOa = uefVar.uef(j8, timeUnit).yo(c0068uef.yo, timeUnit).oa(c0068uef.f25115oa, timeUnit);
        List<bcc> list = c0068uef.lw;
        if (list != null && list.size() > 0) {
            Iterator<bcc> it = c0068uef.lw.iterator();
            while (it.hasNext()) {
                uefVarOa.uef(it.next());
            }
        }
        if (c0068uef.xs != null) {
            Bundle unused = c0068uef.xs;
        }
        Set unused2 = c0068uef.ivm;
        uefVarOa.uef(c0068uef.moa);
        this.yo = uefVarOa.uef();
    }

    public static void uef(lw lwVar) {
        uef = lwVar;
    }

    public static void uef(String str, String str2, String str3, int i5, String str4, boolean z2, int i10, int i11) {
        yo yoVar = f25114oa;
        if (yoVar == null) {
            return;
        }
        yoVar.uef(str, str2, str3, i5, str4, z2, i10, i11);
    }

    public static void uef(yo yoVar) {
        f25114oa = yoVar;
    }
}
