package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class snw extends snp implements skv {
    public static volatile Executor u;
    private final Account a;
    public final snr v;
    public final Set w;

    protected snw(Context context, Looper looper, int i, snr snrVar, slz slzVar, smu smuVar) {
        super(context, looper, soc.b(context), sjv.a, i, new wyd(slzVar, null), new wyd(smuVar, null), snrVar.f);
        this.v = snrVar;
        this.a = snrVar.a;
        Set set = snrVar.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.w = set;
        if (u == null) {
            synchronized (snw.class) {
                if (u == null && soa.a(context.getPackageName())) {
                    u = sny.a(context);
                }
            }
        }
    }

    @Override // defpackage.snp
    public final Feature[] D() {
        return new Feature[0];
    }

    @Override // defpackage.snp, defpackage.skv
    public int a() {
        throw null;
    }

    @Override // defpackage.skv
    public final Set m() {
        return i() ? this.w : Collections.EMPTY_SET;
    }

    @Override // defpackage.snp
    public final Account u() {
        return this.a;
    }

    @Override // defpackage.snp
    protected final Executor x() {
        return u;
    }
}
