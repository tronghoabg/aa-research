package x8;

import A7.I0;
import android.os.Bundle;
import l8.AbstractC3409K;
import l8.AbstractC3414P;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.C3407I;
import l8.e0;

/* renamed from: x8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4499b {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3414P f47849a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f47850b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f47851c;

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f47852d;

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f47853e;

    /* renamed from: f, reason: collision with root package name */
    public static final e0 f47854f;

    static {
        int i5 = AbstractC3414P.f40063c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f47849a = AbstractC3414P.i(15, objArr);
        C3407I c3407i = AbstractC3409K.f40056b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        AbstractC3437s.b(7, objArr2);
        f47850b = AbstractC3409K.h(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        AbstractC3437s.b(3, objArr3);
        f47851c = AbstractC3409K.h(3, objArr3);
        f47852d = AbstractC3409K.o("_r", "_dbg");
        C3406H c3406h = new C3406H(4);
        c3406h.b(I0.f527e);
        c3406h.b(I0.f528f);
        f47853e = c3406h.g();
        f47854f = AbstractC3409K.o("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(Bundle bundle, String str) {
        if (!f47850b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            e0 e0Var = f47852d;
            int i5 = e0Var.f40103d;
            int i10 = 0;
            while (i10 < i5) {
                Object obj = e0Var.get(i10);
                i10++;
                if (bundle.containsKey((String) obj)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f47853e.contains(str2)) {
            e0 e0Var = f47854f;
            int i5 = e0Var.f40103d;
            int i10 = 0;
            while (i10 < i5) {
                Object obj = e0Var.get(i10);
                i10++;
                if (str2.matches((String) obj)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (d(str) && bundle != null) {
            e0 e0Var = f47852d;
            int i5 = e0Var.f40103d;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    str.getClass();
                    switch (str) {
                        case "fcm":
                            bundle.putString("_cis", "fcm_integration");
                            return true;
                        case "fdl":
                            bundle.putString("_cis", "fdl_integration");
                            return true;
                        case "fiam":
                            bundle.putString("_cis", "fiam_integration");
                            return true;
                    }
                }
                Object obj = e0Var.get(i10);
                i10++;
                if (bundle.containsKey((String) obj)) {
                    break;
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        return !f47851c.contains(str);
    }
}
