package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjm implements defpackage.lui {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MessagingManager");
    public boolean c;
    private final java.util.function.Consumer e;
    private final defpackage.lwq f;
    private defpackage.zz h;
    private android.util.SparseArray i;
    private final lyu d = new defpackage.qjk(this, 0);
    final android.content.SharedPreferences.OnSharedPreferenceChangeListener b = new defpackage.kww(this, 7);
    private final defpackage.eqt g = new defpackage.lkt(16);
    private final lwo j = new defpackage.qjl(0);

    public qjm(android.content.Context context, defpackage.lwq lwqVar) {
        this.f = lwqVar;
        this.e = new defpackage.pmt(context, 2);
    }

    public static void l(java.util.function.Consumer consumer) {
        java.util.Iterator it = defpackage.lxy.o().b(defpackage.zaw.SMS_NOTIFICATION, defpackage.zaw.IM_NOTIFICATION).iterator();
        while (it.hasNext()) {
            a$.ExternalSyntheticApiModelOutline2.m(consumer, (mog) it.next());
        }
    }

    public static void n(luk lukVar) {
        defpackage.lxy.o().l(lukVar);
    }

    public static final boolean o(android.os.Bundle bundle) {
        defpackage.mku mkuVarA = defpackage.mpr.f().a();
        if (!mkuVarA.n()) {
            return true;
        }
        boolean zL = mkuVarA.l();
        int i = lxi.e;
        return bundle.getBoolean("group_conversation") && !zL;
    }

    private static final boolean p() {
        return defpackage.nte.c().b().F();
    }

    private static final void q(luk lukVar) {
        defpackage.lxy.o().l(lukVar);
    }

    @Override // defpackage.lui
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.os.Bundle a(long j) {
        if (!this.c) {
            throw new java.lang.IllegalStateException("Cannot get IM persistent state when manager is not started");
        }
        android.os.Bundle bundle = (android.os.Bundle) this.h.d(j);
        if (bundle != null) {
            return bundle;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        this.h.g(j, bundle2);
        return bundle2;
    }

    @Override // defpackage.lui
    public final android.os.Bundle b(int i) {
        if (!this.c) {
            throw new java.lang.IllegalStateException("Cannot get SMS persistent state when manager is not started");
        }
        android.os.Bundle bundle = (android.os.Bundle) this.i.get(i);
        if (bundle != null) {
            return bundle;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        this.i.put(i, bundle2);
        return bundle2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhn
    public final void d() {
        defpackage.lxe.a().e(this.e);
        defpackage.mpr.f().a().b.unregisterOnSharedPreferenceChangeListener(this.b);
        defpackage.lwp.a().e(this.j);
        defpackage.lwz.d().f(this.d);
        defpackage.mak.e().b().k(this.g);
        this.c = false;
        this.h = null;
        this.i = null;
    }

    @Override // defpackage.lui
    public final void e(luk lukVar) {
        if (lukVar instanceof lxg) {
            ((lxg) lukVar).o();
            q(lukVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.lhn
    public final void eQ() {
        this.h = new defpackage.zz(10);
        this.i = new android.util.SparseArray();
        this.c = true;
        defpackage.lwp.a().b(this.j);
        defpackage.lwz.d().b(this.d);
        defpackage.mpr.f().a().b.registerOnSharedPreferenceChangeListener(this.b);
        if (!defpackage.acul.y()) {
            defpackage.lxe.a().b(this.e);
        }
        defpackage.mak.e().b().eM(defpackage.ler.c(), this.g);
    }

    @Override // defpackage.lui
    public final void f(luk lukVar, boolean z) {
        lukVar.g(z);
        q(lukVar);
    }

    @Override // defpackage.lui
    public final void g(luk lukVar) {
        q(lukVar.d(lukVar.a()));
    }

    @Override // defpackage.lui
    public final void h(luk lukVar, boolean z) {
        defpackage.lnt.l().a(lukVar, z);
    }

    @Override // defpackage.lui
    public final boolean i(long j) {
        return this.h.i(j);
    }

    @Override // defpackage.lui
    public final boolean j(luk lukVar) {
        return o(lukVar.c());
    }

    @Override // defpackage.lui
    public final com.google.android.gearhead.sdk.assistant.MessagingInfo k(luk lukVar, wif wifVar, defpackage.zbd zbdVar, defpackage.zbd zbdVar2, defpackage.zbd zbdVar3, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo;
        wif wifVar2 = wifVar;
        defpackage.zaw zawVar = ((moi) lukVar).j;
        if (zawVar == defpackage.zaw.IM_NOTIFICATION) {
            luk lukVar2 = (lxg) lukVar;
            com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo2 = ((lxg) lukVar2).a;
            qkg qkgVar = new qkg();
            qkgVar.b(messagingInfo2);
            defpackage.lwq lwqVar = this.f;
            qkgVar.e = lwqVar.b(lukVar2, wifVar2, zbdVar2, num2);
            android.app.RemoteInput remoteInput = messagingInfo2.j;
            remoteInput.getClass();
            qkgVar.j = lwqVar.d(lukVar2, remoteInput, wifVar2, zbdVar, num);
            if (defpackage.acul.o() && !p() && defpackage.ebo.n().k().a()) {
                wifVar2 = wifVar2;
                qkgVar.k = lwqVar.c(lukVar2, wifVar2, zbdVar3, num3);
            }
            wifVar2 = wifVar2;
            wifVar2 = wifVar2;
            wifVar2 = wifVar2;
            messagingInfo = new com.google.android.gearhead.sdk.assistant.MessagingInfo(qkgVar);
        } else {
            messagingInfo = null;
        }
        if (zawVar == defpackage.zaw.SMS_NOTIFICATION) {
            luk lukVar3 = (lxk) lukVar;
            java.lang.Long l = ((lxk) lukVar3).c;
            qkg qkgVar2 = new qkg();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((lxk) lukVar3).a.iterator();
            while (it.hasNext()) {
                defpackage.tna.aI((android.telephony.SmsMessage[]) it.next(), arrayList);
            }
            java.util.Iterator it2 = ((lxk) lukVar3).b.iterator();
            while (it2.hasNext()) {
                defpackage.tna.aI((android.telephony.SmsMessage[]) it2.next(), arrayList);
            }
            qkgVar2.b = arrayList;
            java.lang.String str = ((lxk) lukVar3).f;
            qkgVar2.c = str;
            qkgVar2.d = ((java.lang.Long) new defpackage.nub(l).i(0L)).longValue();
            qkgVar2.h = "generated.android.auto.sms.package.name";
            qkgVar2.m = false;
            qkgVar2.i = null;
            qkgVar2.g = str;
            defpackage.lwq lwqVar2 = this.f;
            qkgVar2.e = lwqVar2.b(lukVar3, wifVar2, zbdVar2, num2);
            if (acyo.c()) {
                android.app.RemoteInput remoteInputBuild = new android.app.RemoteInput.Builder("reply-remote-input-key").build();
                qkgVar2.j = lwqVar2.d(lukVar3, remoteInputBuild, wifVar2, zbdVar, num);
                qkgVar2.l = remoteInputBuild;
            }
            if (defpackage.acul.o() && !p() && defpackage.ebo.n().k().a()) {
                qkgVar2.k = lwqVar2.c(lukVar3, wifVar2, zbdVar3, num3);
            }
            messagingInfo = new com.google.android.gearhead.sdk.assistant.MessagingInfo(qkgVar2);
        }
        if (messagingInfo != null) {
            return messagingInfo;
        }
        throw new java.lang.IllegalArgumentException("Unknown messaging stream item type: " + zawVar.J);
    }

    public final void m(java.util.function.Consumer consumer) {
        defpackage.ysr.bk(this.c, "Method should only be called if MessagingManagerImpl is started.");
        for (int i = 0; i < this.h.b(); i++) {
            a$.ExternalSyntheticApiModelOutline2.m(consumer, (android.os.Bundle) this.h.e(i));
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            a$.ExternalSyntheticApiModelOutline2.m(consumer, (android.os.Bundle) this.i.valueAt(i2));
        }
    }
}
