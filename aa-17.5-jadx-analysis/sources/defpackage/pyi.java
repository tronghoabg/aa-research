package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class pyi implements SharedPreferences.OnSharedPreferenceChangeListener, pyh {
    public static final ygr a = ygr.t(pyk.x, pyk.y, pyk.d, pyk.i, pyk.r, pyk.s, pyk.l, pyk.E, pyk.e, pyk.ag, pyk.j, pyk.k, pyk.m, pyk.n, pyk.o, pyk.p, pyk.q, pyk.v, pyk.w, pyk.z, pyk.A, pyk.B, pyk.C, pyk.D, pyk.F, pyk.G, pyk.I, pyk.J);
    private static final AtomicBoolean c = new AtomicBoolean(true);
    public final SharedPreferences b;
    private final htm d = new htm((int[]) null);

    static {
        Pattern.compile("^([^#$]+)([#$])(.*)$");
    }

    public pyi(Context context) {
        vaq.d();
        this.b = context.getSharedPreferences("settings_preference", 0);
    }

    public static Enum u(Class cls, String str, Enum r3) {
        if (!woy.am(str)) {
            try {
                return Enum.valueOf(cls, str);
            } catch (ClassCastException | IllegalArgumentException unused) {
            }
        }
        return r3;
    }

    public static String w(String str, Account account) {
        if (account == null) {
            return str;
        }
        GmmAccount gmmAccountP = lws.P(account);
        if (gmmAccountP.e() || str.endsWith("#")) {
            String strD = gmmAccountP.d();
            if (!str.endsWith("#")) {
                str = str.concat("#");
            }
            return str.concat(woy.al(strD));
        }
        String c2 = (gmmAccountP.f() || gmmAccountP.getA()) ? gmmAccountP.getC() : null;
        woy.N(!lws.Q(c2));
        return str + "$" + woy.al(c2);
    }

    @Override // defpackage.pyh
    public final SharedPreferences a() {
        return this.b;
    }

    @Override // defpackage.pyh
    public final String b(abow abowVar) {
        if (abowVar == null) {
            return null;
        }
        return Base64.encodeToString(abowVar.h(), 0);
    }

    @Override // defpackage.pyh
    @Deprecated
    public final void c(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.pyh
    public final void d(pyk pykVar) {
        String str = pykVar.Q;
        if (pyk.b(str)) {
            String strW = w(str, null);
            SharedPreferences sharedPreferences = this.b;
            if (sharedPreferences.contains(strW)) {
                sharedPreferences.edit().remove(strW).apply();
            }
        }
    }

    @Override // defpackage.pyh
    @Deprecated
    public final void e(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // defpackage.pyh
    public final boolean f(pyk pykVar) {
        return pykVar.a() && this.b.contains(pykVar.Q);
    }

    @Override // defpackage.pyh
    @ResultIgnorabilityUnspecified
    public final boolean g() {
        return this.b.edit().commit();
    }

    @Override // defpackage.pyh
    public final long h(pyk pykVar, long j) {
        String str = pykVar.Q;
        if (pyk.b(str)) {
            try {
                return this.b.getLong(w(str, null), j);
            } catch (ClassCastException unused) {
            }
        }
        return j;
    }

    @Override // defpackage.pyh
    public final uzy i(pyk pykVar) {
        plm plmVar = new plm(this, pykVar, 2);
        String str = pykVar.Q;
        boolean zA = pykVar.a();
        htm htmVar = this.d;
        return zA ? htmVar.y(str, new qeq(this, str, plmVar, 1)) : htmVar.y(str, new joa(18));
    }

    @Override // defpackage.pyh
    public final Enum j(pyk pykVar, Class cls, Enum r4) {
        return pykVar.a() ? u(cls, v(pykVar.Q, null, null), r4) : r4;
    }

    @Override // defpackage.pyh
    public final String k(pyk pykVar, String str) {
        return v(pykVar.Q, null, str);
    }

    @Override // defpackage.pyh
    public final void l(pyk pykVar, Enum r2) {
        x(pykVar.Q, r2 == null ? null : r2.name());
    }

    @Override // defpackage.pyh
    public final void m(pyk pykVar, long j) {
        String str = pykVar.Q;
        if (pyk.b(str)) {
            this.b.edit().putLong(w(str, null), j).apply();
        }
    }

    @Override // defpackage.pyh
    public final void n(pyk pykVar, abow abowVar) {
        x(pykVar.Q, b(abowVar));
    }

    @Override // defpackage.pyh
    public final void o(pyk pykVar, String str) {
        x(pykVar.Q, str);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        uzz uzzVar;
        if (!c.get() || str == null || (uzzVar = (uzz) ((ConcurrentHashMap) this.d.a).get(str)) == null) {
            return;
        }
        uzzVar.h();
    }

    @Override // defpackage.pyh
    @ResultIgnorabilityUnspecified
    public final boolean p(pyk pykVar) {
        String str = pykVar.Q;
        try {
            if (pyk.b(str)) {
                return this.b.getBoolean(w(str, null), false);
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    @Override // defpackage.pyh
    public final int q(pyk pykVar) {
        return y(pykVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [abow, java.lang.Object] */
    @Override // defpackage.pyh
    public final abow r(pyk pykVar, abpc abpcVar) {
        byte[] bArrDecode;
        String str = pykVar.Q;
        if (!pyk.b(str)) {
            return null;
        }
        String strV = v(str, null, null);
        if (strV == null) {
            bArrDecode = null;
        } else {
            try {
                bArrDecode = Base64.decode(strV, 0);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (bArrDecode == null) {
            return null;
        }
        try {
            return abpcVar.g(bArrDecode);
        } catch (abon unused2) {
            return null;
        }
    }

    @Override // defpackage.pyh
    public final String s(pyk pykVar, Account account) {
        String str = pykVar.Q;
        if (account == null) {
            account = pmp.a;
        }
        return v(str, account, "");
    }

    @Override // defpackage.pyh
    public final void t(pyk pykVar) {
        String str = pykVar.Q;
        if (pyk.b(str)) {
            this.b.edit().putInt(w(str, null), 1).apply();
        }
    }

    public final String v(String str, Account account, String str2) {
        if (pyk.b(str)) {
            try {
                return this.b.getString(w(str, account), str2);
            } catch (ClassCastException unused) {
            }
        }
        return str2;
    }

    final void x(String str, String str2) {
        if (pyk.b(str)) {
            this.b.edit().putString(w(str, null), str2).apply();
        }
    }

    public final int y(pyk pykVar) {
        String str = pykVar.Q;
        if (pyk.b(str)) {
            try {
                return this.b.getInt(w(str, null), 0);
            } catch (ClassCastException unused) {
            }
        }
        return 0;
    }
}
