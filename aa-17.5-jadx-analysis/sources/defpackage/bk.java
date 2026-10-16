package defpackage;

import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
final class bk extends bf {
    final /* synthetic */ bt b;

    public bk(bt btVar) {
        this.b = btVar;
    }

    @Override // defpackage.bf
    public final Fragment a(ClassLoader classLoader, String str) {
        return Fragment.instantiate(this.b.m.c, str, null);
    }
}
