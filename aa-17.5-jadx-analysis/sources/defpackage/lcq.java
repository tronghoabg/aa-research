package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.widget.Toast;
import com.google.android.projection.gearhead.R;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class lcq implements lhg {
    public static final lcp a = new lcp();
    public static final yph b = yph.c("GH.CsatPostdrive");
    public static final afgl c = new lcj(woy.df(new mkh[]{mkh.b}), 2);
    public final lda d;
    public final Set e;
    private final Context f;
    private final ohv g;
    private final ldh h;

    public /* synthetic */ lcq(byte[] bArr) {
        lda ldaVarA = lda.a.a();
        Context context = mki.a.c;
        context.getClass();
        context.getClass();
        this.d = ldaVarA;
        this.f = context;
        EnumSet enumSetNoneOf = EnumSet.noneOf(lbt.class);
        enumSetNoneOf.getClass();
        this.e = enumSetNoneOf;
        this.g = new ldn(this, 1);
        int i = ldh.e;
        this.h = new ldh(new kut(this, 11));
    }

    public static final lcq a() {
        return a.a();
    }

    public final void b(Context context) {
        context.getClass();
        Toast.makeText(context, R.string.csat_thank_you_message, 1).show();
    }

    @Override // defpackage.lhg
    public final void c() {
        b.l().u("Starting CsatPostdriveManager");
        olm.d().d(this.g, woy.aO(yxc.NON_UI));
        Context context = this.f;
        ldh ldhVar = this.h;
        synchronized (ldhVar.a) {
            if (!ldhVar.b) {
                dup.e(context, ldhVar, new IntentFilter("com.google.android.apps.auto.components.feedback.csat.TRIGGER_SURVEY"), null, 4);
                ldhVar.b = true;
            }
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        b.l().u("Stopping CsatPostdriveManager");
        Context context = this.f;
        ldh ldhVar = this.h;
        synchronized (ldhVar.a) {
            if (ldhVar.b) {
                context.unregisterReceiver(ldhVar);
                ldhVar.b = false;
            }
        }
        olm.d().f(this.g);
    }

    public lcq() {
        this(null);
    }
}
