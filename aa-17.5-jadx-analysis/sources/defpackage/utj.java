package defpackage;

import android.opengl.GLES20;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;

/* loaded from: classes3.dex */
public class utj implements uth {
    private static final uwt a = new uwt(0, 0, 0, 0);
    private ute c;
    private uws e;
    protected ute i;
    public final uvp j;
    protected uud l;
    protected usz q;
    private final Object b = new Object();
    public boolean k = true;
    public uvx m = null;
    private final uwm[] d = new uwm[8];
    public umi x = null;
    protected final uww n = new uww();
    public boolean o = true;
    protected final uww p = new uww();
    public boolean r = false;
    private int f = 1;
    private int g = 0;
    public int s = 519;
    public boolean t = false;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    private final utf h = new uti(this);

    public utj(uvp uvpVar, ute uteVar) {
        this.j = uvpVar;
        this.c = uteVar;
        this.i = uteVar;
    }

    @Override // defpackage.uth
    public final void A(boolean z) {
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        this.k = z;
    }

    @Override // defpackage.uth
    public final boolean B() {
        uuz uuzVar;
        int i = 0;
        while (true) {
            boolean zB = true;
            if (i >= 8) {
                return true;
            }
            uwm uwmVar = this.d[i];
            if (uwmVar != null && (uuzVar = uwmVar.c) != null) {
                usq usqVar = uuzVar.c;
                if (usqVar != null) {
                    zB = usqVar.b();
                } else {
                    utc utcVar = uuzVar.j;
                    if (utcVar == null) {
                        continue;
                    } else if (utcVar.a == null) {
                        zB = false;
                    }
                }
                if (!zB) {
                    return false;
                }
            }
            i++;
        }
    }

    @Override // defpackage.uth
    public final boolean C() {
        return this.r;
    }

    protected float[] D(usy usyVar) {
        if (this.o || usyVar.p() != this.q) {
            uww uwwVar = this.p;
            uxf.b(uwwVar.a, usyVar.y(), this.n.a);
            uwwVar.a();
            this.o = false;
            this.q = usyVar.p();
        }
        return this.p.a;
    }

    @Override // defpackage.uth
    public final ute E() {
        ute uteVar;
        synchronized (this.b) {
            uteVar = this.i;
        }
        return uteVar;
    }

    @Override // defpackage.uth
    public final uvp F() {
        return this.j;
    }

    @Override // defpackage.uth
    public uwt G() {
        return a;
    }

    @Override // defpackage.uth
    public void H(uth uthVar, uth uthVar2, usy usyVar) {
        uud uudVar = this.l;
        uws uwsVar = this.e;
        uvx uvxVar = this.m;
        if (uudVar == null || uwsVar == null || uvxVar == null) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            uwm uwmVarD = d(i);
            uudVar.x(uud.q[i], uwmVarD != null ? uwmVarD.d : uue.a);
        }
        uvw uvwVar = uvxVar.i;
        uudVar.f(uvwVar == null ? 0 : uvwVar.w);
        uvxVar.a(uudVar, this, usyVar, this.n.a, usyVar.y(), D(usyVar));
        uudVar.n(this.f, this.g);
        uudVar.p(this.s);
        uudVar.q(1);
        uudVar.s(this.t, this.u, this.v, this.w);
        uudVar.r(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        woy.Z(uudVar.j);
        if (uudVar.f != 1.0f) {
            GLES20.glLineWidth(1.0f);
            uudVar.f = 1.0f;
        }
        uud uudVar2 = uwsVar.c;
        uudVar2.getClass();
        if (uwsVar.n.b()) {
            uue uueVar = uudVar2.g;
            uue uueVar2 = uwsVar.n;
            if (uueVar != uueVar2 || uudVar2.h != uwsVar.o) {
                uudVar2.g(uueVar2);
                int i2 = uwsVar.n.f;
                if (uwsVar.o.b()) {
                    uudVar2.e(uwsVar.o);
                }
                uudVar2.k(0);
                uudVar2.j(1);
                boolean z = uwsVar.h;
                if (z || uwsVar.i) {
                    uudVar2.k(2);
                } else {
                    uudVar2.j(2);
                }
                boolean z2 = uwsVar.g;
                if (z2) {
                    uudVar2.k(3);
                } else {
                    uudVar2.j(3);
                }
                if (uwsVar.e) {
                    GLES20.glVertexAttribPointer(0, true != uwsVar.j ? 3 : 2, 5126, false, uwsVar.p, i2);
                } else if (uwsVar.f) {
                    GLES20.glVertexAttribPointer(0, true != uwsVar.j ? 3 : 2, 5122, false, uwsVar.p, i2);
                }
                if (z) {
                    GLES20.glVertexAttribPointer(2, 4, 5126, false, uwsVar.p, i2 + uwsVar.s);
                }
                if (uwsVar.i) {
                    GLES20.glVertexAttribPointer(2, 4, 5121, true, uwsVar.p, i2 + uwsVar.s);
                }
                if (z2) {
                    GLES20.glVertexAttribPointer(3, 2, 5126, true, uwsVar.p, i2 + uwsVar.r);
                }
                int i3 = uwsVar.m;
                if ((i3 & 2176) == 0) {
                    uudVar2.j(4);
                } else if ((i3 & 128) != 0) {
                    uudVar2.k(4);
                    GLES20.glVertexAttribPointer(4, 4, 5121, false, uwsVar.p, i2 + uwsVar.t);
                } else {
                    uudVar2.k(4);
                    GLES20.glVertexAttribPointer(4, 1, 5126, false, uwsVar.p, i2 + uwsVar.t);
                }
                if ((i3 & 4352) == 0) {
                    uudVar2.j(5);
                } else if ((i3 & 256) != 0) {
                    uudVar2.k(5);
                    GLES20.glVertexAttribPointer(5, 4, 5121, false, uwsVar.p, i2 + uwsVar.u);
                } else {
                    uudVar2.k(5);
                    GLES20.glVertexAttribPointer(5, 1, 5126, false, uwsVar.p, i2 + uwsVar.u);
                }
                if ((i3 & 8704) == 0) {
                    uudVar2.j(6);
                } else if ((i3 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    uudVar2.k(6);
                    GLES20.glVertexAttribPointer(6, 4, 5121, false, uwsVar.p, i2 + uwsVar.v);
                } else {
                    uudVar2.k(6);
                    GLES20.glVertexAttribPointer(6, 1, 5126, false, uwsVar.p, i2 + uwsVar.v);
                }
                if ((i3 & 17408) == 0) {
                    uudVar2.j(7);
                } else if ((i3 & 1024) != 0) {
                    uudVar2.k(7);
                    GLES20.glVertexAttribPointer(7, 4, 5121, false, uwsVar.p, i2 + uwsVar.w);
                } else {
                    uudVar2.k(7);
                    GLES20.glVertexAttribPointer(7, 1, 5126, false, uwsVar.p, i2 + uwsVar.w);
                }
            }
        } else {
            ((ynz) ((ynz) uws.a.g()).ai((char) 9710)).u("Trying to bind invalid vertex data");
        }
        uwsVar.c.getClass();
        if (uwsVar.o.b()) {
            GLES20.glDrawElements(uwsVar.l, uwsVar.d, 5123, uwsVar.o.f);
        } else {
            GLES20.glDrawArrays(uwsVar.l, 0, uwsVar.k);
        }
    }

    @Override // defpackage.uth
    public uwm d(int i) {
        return this.d[i];
    }

    @Override // defpackage.uth
    public void e(boolean z) {
        if (this.r) {
            uws uwsVar = this.e;
            if (uwsVar != null) {
                uwsVar.b(z);
            }
            uwm[] uwmVarArr = this.d;
            for (int i = 0; i < 8; i++) {
                uwm uwmVar = uwmVarArr[i];
                if (uwmVar != null) {
                    uwmVar.c(z);
                }
            }
            uvx uvxVar = this.m;
            if (uvxVar != null) {
                uvxVar.e();
            }
            this.l = null;
            this.r = false;
        }
    }

    @Override // defpackage.uth
    public final void h() {
        synchronized (this.b) {
            ute uteVar = this.c;
            if (uteVar != null && !uteVar.equals(this.i)) {
                this.i = this.c;
            }
        }
    }

    @Override // defpackage.uth
    public int i() {
        return 0;
    }

    @Override // defpackage.uth
    public utf j() {
        return this.h;
    }

    @Override // defpackage.uth
    public boolean o() {
        return this.e != null && this.k;
    }

    @Override // defpackage.uth
    public final umi p() {
        return this.x;
    }

    public final void t(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public final void u(ute uteVar) {
        synchronized (this.b) {
            this.c = uteVar;
        }
    }

    public final void v(uvx uvxVar) {
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        uvx uvxVar2 = this.m;
        this.m = uvxVar;
        if (this.r) {
            if (uvxVar2 != null) {
                uvxVar2.e();
            }
            if (uvxVar != null) {
                uud uudVar = this.l;
                uudVar.getClass();
                uvxVar.c(uudVar);
            }
        }
    }

    public final void w(uws uwsVar) {
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        uws uwsVar2 = this.e;
        if (this.r) {
            uud uudVar = this.l;
            uudVar.getClass();
            if (uwsVar2 != null) {
                uwsVar2.b(false);
            }
            if (uwsVar != null) {
                uwsVar.a(uudVar);
            }
        }
        this.e = uwsVar;
    }

    public final void x(int i, int i2) {
        this.t = true;
        this.u = 514;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.uth
    public final void y(uud uudVar) throws IOException {
        if (this.r) {
            return;
        }
        this.l = uudVar;
        uws uwsVar = this.e;
        if (uwsVar != null) {
            uwsVar.a(uudVar);
        }
        uwm[] uwmVarArr = this.d;
        for (int i = 0; i < 8; i++) {
            uwm uwmVar = uwmVarArr[i];
            if (uwmVar != null) {
                uwmVar.b(uudVar);
            }
        }
        uvx uvxVar = this.m;
        if (uvxVar != null) {
            uvxVar.c(uudVar);
        }
        this.r = true;
    }

    public void z(int i, uwm uwmVar) throws IOException {
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        uwm[] uwmVarArr = this.d;
        uwm uwmVar2 = uwmVarArr[i];
        uwmVarArr[i] = uwmVar;
        if (this.r) {
            if (uwmVar2 != null) {
                uwmVar2.c(false);
            }
            uud uudVar = this.l;
            uudVar.getClass();
            uwmVar.b(uudVar);
        }
    }

    @Override // defpackage.uth
    public void b(long j) {
    }
}
