package e.a.h;

import com.google.d.b.an;
import e.a.cd;
import e.a.cm;
import e.a.du;
import e.a.ee;
import e.a.ef;
import e.a.eh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends h {

    /* renamed from: a, reason: collision with root package name */
    final du f47805a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f47806b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47808d;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f47807c = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47809e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47810f = false;

    w(du duVar) {
        this.f47805a = duVar;
    }

    @Override // e.a.h.ae
    public final void onCompleted() {
        ee eeVar = ee.f47401a;
        cd cdVar = cm.f46534a;
        this.f47805a.a();
        this.f47810f = true;
    }

    @Override // e.a.h.ae
    public final void onError(Throwable th) {
        cm cmVarA;
        cm cmVar = new cm();
        ee eeVar = ee.f47401a;
        Throwable cause = th;
        while (true) {
            if (cause == null) {
                cmVarA = null;
                break;
            } else if (cause instanceof ef) {
                cmVarA = ((ef) cause).a();
                break;
            } else {
                if (cause instanceof eh) {
                    cmVarA = ((eh) cause).a();
                    break;
                }
                cause = cause.getCause();
            }
        }
        if (cmVarA != null) {
            cmVar.h(cmVarA);
        }
        du duVar = this.f47805a;
        ee.e(th);
        duVar.a();
        this.f47809e = true;
    }

    @Override // e.a.h.ae
    public final void onNext(Object obj) {
        an.v(!this.f47809e, "Stream was terminated by error, no further calls are allowed");
        an.v(!this.f47810f, "Stream is already completed, no further calls are allowed");
        if (!this.f47808d) {
            du duVar = this.f47805a;
            cd cdVar = cm.f46534a;
            duVar.c();
            this.f47808d = true;
        }
        this.f47805a.d();
    }
}
