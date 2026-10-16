package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public interface pyh {
    SharedPreferences a();

    String b(abow abowVar);

    @Deprecated
    void c(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener);

    void d(pyk pykVar);

    @Deprecated
    void e(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener);

    boolean f(pyk pykVar);

    @ResultIgnorabilityUnspecified
    boolean g();

    long h(pyk pykVar, long j);

    uzy i(pyk pykVar);

    Enum j(pyk pykVar, Class cls, Enum r3);

    String k(pyk pykVar, String str);

    void l(pyk pykVar, Enum r2);

    void m(pyk pykVar, long j);

    void n(pyk pykVar, abow abowVar);

    void o(pyk pykVar, String str);

    @ResultIgnorabilityUnspecified
    boolean p(pyk pykVar);

    int q(pyk pykVar);

    abow r(pyk pykVar, abpc abpcVar);

    String s(pyk pykVar, Account account);

    void t(pyk pykVar);
}
