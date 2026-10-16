package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class sla implements sle {
    public final Context b;
    public final String c;
    public final spy d;
    public final sku e;
    public final slr f;
    public final Looper g;
    public final int h;
    public final sld i;
    protected final smi j;
    public final rju k;

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    public sla(Context context, Activity activity, rju rjuVar, sku skuVar, skz skzVar) {
        sna snaVar;
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (skzVar == null) {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("The provided context did not have an application context.");
        }
        this.b = applicationContext;
        String attributionTag = (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT < 30) ? null : context.getAttributionTag();
        this.c = attributionTag;
        this.d = Build.VERSION.SDK_INT >= 31 ? new spy(context.getAttributionSource()) : null;
        this.k = rjuVar;
        this.e = skuVar;
        this.g = skzVar.b;
        slr slrVar = new slr(rjuVar, skuVar, attributionTag);
        this.f = slrVar;
        this.i = new smj(this);
        smi smiVarC = smi.c(applicationContext);
        this.j = smiVarC;
        this.h = smiVarC.i.getAndIncrement();
        if (activity != null && Looper.myLooper() == Looper.getMainLooper()) {
            WeakHashMap weakHashMap = sna.a;
            bt btVarA = ((bc) activity).a();
            WeakReference weakReference = (WeakReference) sna.a.get(activity);
            if (weakReference == null || (snaVar = (sna) weakReference.get()) == null) {
                try {
                    snaVar = (sna) btVarA.f("SLifecycleFragmentImpl");
                    if (snaVar == null || snaVar.isRemoving()) {
                        snaVar = new sna();
                        w wVar = new w(btVarA);
                        wVar.e(0, snaVar, "SLifecycleFragmentImpl", 1);
                        wVar.i(true, true);
                    }
                    sna.a.put(activity, new WeakReference(snaVar));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            }
            smb smbVar = (smb) ((smn) smb.class.cast(snaVar.b.a.get("ConnectionlessLifecycleHelper")));
            smbVar = smbVar == null ? new smb(snaVar, smiVarC) : smbVar;
            smbVar.e.add(slrVar);
            smiVarC.f(smbVar);
        }
        Handler handler = smiVarC.o;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    @Override // defpackage.sle
    public final slr r() {
        return this.f;
    }

    public final smr s(Object obj, String str) {
        return uqw.H(obj, this.g, str);
    }

    public final snq t() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        snq snqVar = new snq();
        sku skuVar = this.e;
        boolean z = skuVar instanceof sks;
        Account accountA = null;
        if (z && (googleSignInAccountA2 = ((sks) skuVar).a()) != null) {
            String str = googleSignInAccountA2.c;
            if (str != null) {
                accountA = new Account(str, "com.google");
            }
        } else if (skuVar instanceof skr) {
            accountA = ((skr) skuVar).a();
        }
        snqVar.a = accountA;
        Set setA = (!z || (googleSignInAccountA = ((sks) skuVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.a();
        if (snqVar.b == null) {
            snqVar.b = new yy(0);
        }
        snqVar.b.addAll(setA);
        Context context = this.b;
        snqVar.d = context.getClass().getName();
        snqVar.c = context.getPackageName();
        return snqVar;
    }

    public final svz u(int i, snc sncVar) {
        nok nokVar = new nok(null, null);
        int i2 = sncVar.c;
        smi smiVar = this.j;
        smiVar.i(nokVar, i2, this);
        slo sloVar = new slo(i, sncVar, nokVar);
        Handler handler = smiVar.o;
        handler.sendMessage(handler.obtainMessage(4, new smv(sloVar, smiVar.j.get(), this)));
        return (svz) nokVar.a;
    }

    @ResultIgnorabilityUnspecified
    public final svz v(smp smpVar, int i) {
        nok nokVar = new nok(null, null);
        smi smiVar = this.j;
        smiVar.i(nokVar, i, this);
        slp slpVar = new slp(smpVar, nokVar);
        Handler handler = smiVar.o;
        handler.sendMessage(handler.obtainMessage(13, new smv(slpVar, smiVar.j.get(), this)));
        return (svz) nokVar.a;
    }

    public final void w(int i, slt sltVar) {
        boolean z = true;
        if (!sltVar.d && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        sltVar.d = z;
        smi smiVar = this.j;
        smv smvVar = new smv(new slm(i, sltVar), smiVar.j.get(), this);
        Handler handler = smiVar.o;
        handler.sendMessage(handler.obtainMessage(4, smvVar));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Runnable] */
    @ResultIgnorabilityUnspecified
    public final svz x(rjr rjrVar) {
        smw smwVar = (smw) rjrVar.b;
        spu.ax(smwVar.a(), "Listener has already been released.");
        nok nokVar = new nok(null, null);
        int i = smwVar.d;
        smi smiVar = this.j;
        smiVar.i(nokVar, i, this);
        sln slnVar = new sln(new rjr(smwVar, (ykd) rjrVar.c, rjrVar.a, null), nokVar);
        Handler handler = smiVar.o;
        handler.sendMessage(handler.obtainMessage(8, new smv(slnVar, smiVar.j.get(), this)));
        return (svz) nokVar.a;
    }
}
