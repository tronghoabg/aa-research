package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public class kho {
    private final ContentResolver a;
    private eqj b;

    public kho(Context context) {
        this.a = context.getContentResolver();
    }

    public static kho e() {
        return (kho) mki.a.i(kho.class);
    }

    private static final eqj f(eqj eqjVar) {
        return eqy.b(eqjVar, new jxa(19));
    }

    @ResultIgnorabilityUnspecified
    public eqj a(eqj eqjVar) {
        khj.c();
        return eqy.a(f(khj.a(this.a, eqy.b(eqjVar, new jxa(16)))));
    }

    public eqj b(eqj eqjVar) {
        yfq yfqVar = khm.a;
        return eqy.c(eqy.b(eqjVar, new jxa(18)), new kaa(this.a, 10));
    }

    public eqj c(eqj eqjVar, eqj eqjVar2) {
        khj.c();
        return eqy.a(f(khj.a(this.a, eqy.b(tby.z(eqjVar, eqjVar2), new jxa(17)))));
    }

    public final eqj d() {
        if (this.b == null) {
            this.b = new khn(new tbi(mki.a.c, new IntentFilter("android.intent.action.TIME_TICK")));
        }
        return this.b;
    }
}
