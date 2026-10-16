package defpackage;

import android.support.v4.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ar extends az {
    final /* synthetic */ pr a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ pf c;
    final /* synthetic */ ox d;
    final /* synthetic */ Fragment e;

    public ar(Fragment fragment, pr prVar, AtomicReference atomicReference, pf pfVar, ox oxVar) {
        this.e = fragment;
        this.a = prVar;
        this.b = atomicReference;
        this.c = pfVar;
        this.d = oxVar;
    }

    @Override // defpackage.az
    public final void a() {
        pr prVar = this.a;
        Fragment fragment = this.e;
        this.b.set(((pc) prVar.a(null)).b(fragment.generateActivityResultKey(), fragment, this.c, this.d));
    }
}
