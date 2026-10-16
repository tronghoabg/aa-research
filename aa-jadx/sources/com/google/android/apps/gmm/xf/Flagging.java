package com.google.android.apps.gmm.xf;

/* JADX INFO: loaded from: classes2.dex */
public class Flagging {

    public interface a {
        com.google.android.apps.gmm.xf.Flagging b();
    }

    public Flagging() {
        defpackage.qde.a("flagging_native");
    }

    public static com.google.android.apps.gmm.xf.Flagging getInstance() {
        try {
            return ((com.google.android.apps.gmm.xf.Flagging.a) defpackage.rox.ac(com.google.android.apps.gmm.xf.Flagging.a.class)).b();
        } catch (java.lang.IllegalStateException unused) {
            defpackage.ynd yndVar = defpackage.ynd.a;
            return new com.google.android.apps.gmm.xf.Flagging();
        }
    }
}
