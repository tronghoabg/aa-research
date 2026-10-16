package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class kms extends afey implements afec {
    public static final kms a = new kms();

    public kms() {
        super(1, aclh.class, "updateExperimentsForConfigPackage", "updateExperimentsForConfigPackage(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        wcj wcjVar = aclg.a;
        wae waeVarA = wae.a((Context) obj);
        if (waeVarA == null) {
            woy.Z(wae.d());
            return zgl.a;
        }
        wcw wcwVar = (wcw) wcw.a(waeVarA.c).get("com.google.android.projection.gearhead");
        if (wcwVar == null) {
            return new zhc(new IllegalStateException("Config package com.google.android.projection.gearhead does not use declarative registration. See go/phenotype-android-integration#phenotype for more information."));
        }
        wdq wdqVar = waeVarA.f;
        wdn wdnVar = new wdn(waeVarA, "com.google.android.projection.gearhead", "", wcwVar.c);
        return zfb.g(zgj.v(wdqVar.d(false)).u(Throwable.class, new txa(19), waeVarA.b()).w(new rgf(wdnVar, 14), waeVarA.b()), new pwg(wdnVar, waeVarA, 3), waeVarA.b());
    }
}
