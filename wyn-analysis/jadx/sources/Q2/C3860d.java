package q2;

import E5.C0465o;
import N1.Y;
import Q1.x;
import U1.C0840j;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.applovin.impl.W;
import u6.v;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3860d implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43987a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f43988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43989c;

    public C3860d(v6.f fVar, V5.k kVar) {
        this.f43989c = fVar;
        Handler handlerJ = v.j(this);
        this.f43988b = handlerJ;
        kVar.v(this, handlerJ);
    }

    public void a(long j8) {
        Surface surface;
        C3861e c3861e = (C3861e) this.f43989c;
        if (this != c3861e.f44022h1 || c3861e.f34021K == null) {
            return;
        }
        if (j8 == Long.MAX_VALUE) {
            c3861e.v0 = true;
            return;
        }
        try {
            c3861e.F0(j8);
            Y y10 = c3861e.f44018c1;
            boolean zEquals = y10.equals(Y.f8125d);
            X2.j jVar = c3861e.f43995E0;
            if (!zEquals && !y10.equals(c3861e.f44019d1)) {
                c3861e.f44019d1 = y10;
                jVar.Y(y10);
            }
            c3861e.f34065x0.f4909f++;
            m mVar = c3861e.f43998H0;
            boolean z2 = mVar.f44072d != 3;
            mVar.f44072d = 3;
            mVar.k.getClass();
            mVar.f44074f = x.K(SystemClock.elapsedRealtime());
            if (z2 && (surface = c3861e.f44006P0) != null) {
                Handler handler = (Handler) jVar.f16075b;
                if (handler != null) {
                    handler.post(new W(jVar, surface, SystemClock.elapsedRealtime(), 2));
                }
                c3861e.f44009S0 = true;
            }
            c3861e.m0(j8);
        } catch (C0840j e7) {
            c3861e.f34063w0 = e7;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f43987a) {
            case 0:
                if (message.what == 0) {
                    int i5 = message.arg1;
                    int i10 = message.arg2;
                    int i11 = x.f9724a;
                    a((4294967295L & i10) | ((i5 & 4294967295L) << 32));
                    break;
                } else {
                    break;
                }
            default:
                if (message.what != 0) {
                    break;
                } else {
                    int i12 = message.arg1;
                    int i13 = message.arg2;
                    int i14 = v.f46721a;
                    long j8 = (4294967295L & i13) | ((i12 & 4294967295L) << 32);
                    v6.f fVar = (v6.f) this.f43989c;
                    if (this == fVar.f46883l1) {
                        if (j8 == Long.MAX_VALUE) {
                            fVar.f13135x0 = true;
                            break;
                        } else {
                            try {
                                fVar.o0(j8);
                                fVar.w0();
                                fVar.f13139z0.f4909f++;
                                fVar.v0();
                                fVar.X(j8);
                                break;
                            } catch (C0465o e7) {
                                fVar.f13137y0 = e7;
                                return true;
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    public C3860d(C3861e c3861e, d2.j jVar) {
        this.f43989c = c3861e;
        Handler handlerM = x.m(this);
        this.f43988b = handlerM;
        jVar.L(this, handlerM);
    }
}
