package com.google.android.apps.gmm.xf;

import defpackage.qcg;
import defpackage.roc;
import defpackage.yly;

/* loaded from: classes2.dex */
public class Flagging {

    public interface a {
        Flagging b();
    }

    public Flagging() {
        qcg.b("flagging_native");
    }

    public static Flagging getInstance() {
        try {
            return ((a) roc.bu(a.class)).b();
        } catch (IllegalStateException unused) {
            yly ylyVar = yly.a;
            return new Flagging();
        }
    }
}
