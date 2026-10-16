package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class vqz extends vuf implements vqj, vqa, vsa {
    public final vqk a;
    final AtomicBoolean b;
    public final aezk c;
    public final vry d;
    public final htm e;
    private final Context i;
    private final Executor j;
    private final AtomicBoolean k;
    private final vqe l;

    /* JADX WARN: Multi-variable type inference failed */
    public vqz(wci wciVar, Context context, vqk vqkVar, vqe vqeVar, zgt zgtVar, ackk ackkVar, htm htmVar, aezk aezkVar, aezk aezkVar2, Executor executor) {
        super(null, null);
        this.b = new AtomicBoolean();
        new ConcurrentHashMap();
        this.k = new AtomicBoolean(false);
        this.l = vqeVar;
        this.d = wciVar.d(executor, ackkVar, aezkVar2);
        this.i = context;
        this.a = vqkVar;
        this.j = Build.VERSION.SDK_INT < 31 ? executor : zgtVar;
        this.e = htmVar;
        this.c = aezkVar;
    }

    private final void U(final int i) {
        wub.ad(new zfj() { // from class: vqy
            /* JADX WARN: Removed duplicated region for block: B:598:0x0c3d  */
            /* JADX WARN: Removed duplicated region for block: B:599:0x0c40  */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tmb] */
            @Override // defpackage.zfj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final defpackage.zgp a() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 3176
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vqy.a():zgp");
            }
        }, this.j);
    }

    @Override // defpackage.vqa
    public final void g(vky vkyVar) {
        if (!tmz.f(this.i)) {
            zgp zgpVar = zgl.a;
            return;
        }
        try {
            woy.Z(this.b.getAndSet(false));
            U(2);
        } catch (Exception e) {
            new zhc(e);
        }
    }

    @Override // defpackage.vqj
    public final void h() {
        if (this.k.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.vqa
    public final void j(vky vkyVar) {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            return;
        }
        if (!tmz.f(this.i)) {
            zgp zgpVar = zgl.a;
        } else if (!atomicBoolean.getAndSet(true)) {
            U(3);
        } else {
            ((ynz) ((ynz) vlj.a.h()).ai((char) 9793)).u("App is already in the foreground.");
            wub.X();
        }
    }

    @Override // defpackage.vsa
    public final void k() {
        this.l.a(this);
        this.a.a(this);
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void f(int i) {
    }
}
