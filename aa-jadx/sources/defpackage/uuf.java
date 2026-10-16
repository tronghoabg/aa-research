package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uuf implements defpackage.uud {
    private static final defpackage.uxq a = new defpackage.uxq(0, 0, 0, 0);
    private defpackage.uua c;
    private defpackage.uxp e;
    protected defpackage.uua i;
    public final defpackage.uwm j;
    protected defpackage.uuz l;
    protected defpackage.utv q;
    private final java.lang.Object b = new java.lang.Object();
    public boolean k = true;
    public defpackage.uwu m = null;
    private final defpackage.uxj[] d = new defpackage.uxj[8];
    public defpackage.une x = null;
    protected final defpackage.uxt n = new defpackage.uxt();
    public boolean o = true;
    protected final defpackage.uxt p = new defpackage.uxt();
    public boolean r = false;
    private int f = 1;
    private int g = 0;
    public int s = 519;
    public boolean t = false;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    private final defpackage.uub h = new defpackage.uue(this);

    public uuf(defpackage.uwm uwmVar, defpackage.uua uuaVar) {
        this.j = uwmVar;
        this.c = uuaVar;
        this.i = uuaVar;
    }

    @Override // defpackage.uud
    public final void A(boolean z) {
        if (this.r) {
            defpackage.uwo uwoVar = defpackage.uwo.a;
        }
        this.k = z;
    }

    @Override // defpackage.uud
    public final boolean B() {
        defpackage.uvv uvvVar;
        int i = 0;
        while (true) {
            boolean zB = true;
            if (i >= 8) {
                return true;
            }
            defpackage.uxj uxjVar = this.d[i];
            if (uxjVar != null && (uvvVar = uxjVar.c) != null) {
                defpackage.utm utmVar = uvvVar.c;
                if (utmVar != null) {
                    zB = utmVar.b();
                } else {
                    defpackage.uty utyVar = uvvVar.j;
                    if (utyVar == null) {
                        continue;
                    } else if (utyVar.a == null) {
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

    @Override // defpackage.uud
    public final boolean C() {
        return this.r;
    }

    protected float[] D(defpackage.utu utuVar) {
        if (this.o || utuVar.p() != this.q) {
            defpackage.uxt uxtVar = this.p;
            defpackage.uyb.b(uxtVar.a, utuVar.y(), this.n.a);
            uxtVar.a();
            this.o = false;
            this.q = utuVar.p();
        }
        return this.p.a;
    }

    @Override // defpackage.uud
    public final defpackage.uua E() {
        defpackage.uua uuaVar;
        synchronized (this.b) {
            uuaVar = this.i;
        }
        return uuaVar;
    }

    @Override // defpackage.uud
    public final defpackage.uwm F() {
        return this.j;
    }

    @Override // defpackage.uud
    public defpackage.uxq G() {
        return a;
    }

    @Override // defpackage.uud
    public void H(defpackage.uud uudVar, defpackage.uud uudVar2, defpackage.utu utuVar) {
        defpackage.uuz uuzVar = this.l;
        defpackage.uxp uxpVar = this.e;
        defpackage.uwu uwuVar = this.m;
        if (uuzVar == null || uxpVar == null || uwuVar == null) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            defpackage.uxj uxjVarD = d(i);
            uuzVar.x(defpackage.uuz.q[i], uxjVarD != null ? uxjVarD.d : defpackage.uva.a);
        }
        defpackage.uwt uwtVar = uwuVar.i;
        uuzVar.f(uwtVar == null ? 0 : uwtVar.w);
        uwuVar.a(uuzVar, this, utuVar, this.n.a, utuVar.y(), D(utuVar));
        uuzVar.n(this.f, this.g);
        uuzVar.p(this.s);
        uuzVar.q(1);
        uuzVar.s(this.t, this.u, this.v, this.w);
        uuzVar.r(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        defpackage.ysr.bj(uuzVar.j);
        if (uuzVar.f != 1.0f) {
            android.opengl.GLES20.glLineWidth(1.0f);
            uuzVar.f = 1.0f;
        }
        defpackage.uuz uuzVar2 = uxpVar.c;
        uuzVar2.getClass();
        if (uxpVar.n.b()) {
            defpackage.uva uvaVar = uuzVar2.g;
            defpackage.uva uvaVar2 = uxpVar.n;
            if (uvaVar != uvaVar2 || uuzVar2.h != uxpVar.o) {
                uuzVar2.g(uvaVar2);
                int i2 = uxpVar.n.f;
                if (uxpVar.o.b()) {
                    uuzVar2.e(uxpVar.o);
                }
                uuzVar2.k(0);
                uuzVar2.j(1);
                boolean z = uxpVar.h;
                if (z || uxpVar.i) {
                    uuzVar2.k(2);
                } else {
                    uuzVar2.j(2);
                }
                boolean z2 = uxpVar.g;
                if (z2) {
                    uuzVar2.k(3);
                } else {
                    uuzVar2.j(3);
                }
                if (uxpVar.e) {
                    android.opengl.GLES20.glVertexAttribPointer(0, true != uxpVar.j ? 3 : 2, 5126, false, uxpVar.p, i2);
                } else if (uxpVar.f) {
                    android.opengl.GLES20.glVertexAttribPointer(0, true != uxpVar.j ? 3 : 2, 5122, false, uxpVar.p, i2);
                }
                if (z) {
                    android.opengl.GLES20.glVertexAttribPointer(2, 4, 5126, false, uxpVar.p, i2 + uxpVar.s);
                }
                if (uxpVar.i) {
                    android.opengl.GLES20.glVertexAttribPointer(2, 4, 5121, true, uxpVar.p, i2 + uxpVar.s);
                }
                if (z2) {
                    android.opengl.GLES20.glVertexAttribPointer(3, 2, 5126, true, uxpVar.p, i2 + uxpVar.r);
                }
                int i3 = uxpVar.m;
                if ((i3 & 2176) == 0) {
                    uuzVar2.j(4);
                } else if ((i3 & 128) != 0) {
                    uuzVar2.k(4);
                    android.opengl.GLES20.glVertexAttribPointer(4, 4, 5121, false, uxpVar.p, i2 + uxpVar.t);
                } else {
                    uuzVar2.k(4);
                    android.opengl.GLES20.glVertexAttribPointer(4, 1, 5126, false, uxpVar.p, i2 + uxpVar.t);
                }
                if ((i3 & 4352) == 0) {
                    uuzVar2.j(5);
                } else if ((i3 & 256) != 0) {
                    uuzVar2.k(5);
                    android.opengl.GLES20.glVertexAttribPointer(5, 4, 5121, false, uxpVar.p, i2 + uxpVar.u);
                } else {
                    uuzVar2.k(5);
                    android.opengl.GLES20.glVertexAttribPointer(5, 1, 5126, false, uxpVar.p, i2 + uxpVar.u);
                }
                if ((i3 & 8704) == 0) {
                    uuzVar2.j(6);
                } else if ((i3 & defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    uuzVar2.k(6);
                    android.opengl.GLES20.glVertexAttribPointer(6, 4, 5121, false, uxpVar.p, i2 + uxpVar.v);
                } else {
                    uuzVar2.k(6);
                    android.opengl.GLES20.glVertexAttribPointer(6, 1, 5126, false, uxpVar.p, i2 + uxpVar.v);
                }
                if ((i3 & 17408) == 0) {
                    uuzVar2.j(7);
                } else if ((i3 & 1024) != 0) {
                    uuzVar2.k(7);
                    android.opengl.GLES20.glVertexAttribPointer(7, 4, 5121, false, uxpVar.p, i2 + uxpVar.w);
                } else {
                    uuzVar2.k(7);
                    android.opengl.GLES20.glVertexAttribPointer(7, 1, 5126, false, uxpVar.p, i2 + uxpVar.w);
                }
            }
        } else {
            ((defpackage.ype) ((defpackage.ype) defpackage.uxp.a.g()).ai((char) 9738)).u("Trying to bind invalid vertex data");
        }
        uxpVar.c.getClass();
        if (uxpVar.o.b()) {
            android.opengl.GLES20.glDrawElements(uxpVar.l, uxpVar.d, 5123, uxpVar.o.f);
        } else {
            android.opengl.GLES20.glDrawArrays(uxpVar.l, 0, uxpVar.k);
        }
    }

    @Override // defpackage.uud
    public defpackage.uxj d(int i) {
        return this.d[i];
    }

    @Override // defpackage.uud
    public void e(boolean z) {
        if (this.r) {
            defpackage.uxp uxpVar = this.e;
            if (uxpVar != null) {
                uxpVar.b(z);
            }
            defpackage.uxj[] uxjVarArr = this.d;
            for (int i = 0; i < 8; i++) {
                defpackage.uxj uxjVar = uxjVarArr[i];
                if (uxjVar != null) {
                    uxjVar.c(z);
                }
            }
            defpackage.uwu uwuVar = this.m;
            if (uwuVar != null) {
                uwuVar.e();
            }
            this.l = null;
            this.r = false;
        }
    }

    @Override // defpackage.uud
    public final void h() {
        synchronized (this.b) {
            defpackage.uua uuaVar = this.c;
            if (uuaVar != null && !uuaVar.equals(this.i)) {
                this.i = this.c;
            }
        }
    }

    @Override // defpackage.uud
    public int i() {
        return 0;
    }

    @Override // defpackage.uud
    public defpackage.uub j() {
        return this.h;
    }

    @Override // defpackage.uud
    public boolean o() {
        return this.e != null && this.k;
    }

    @Override // defpackage.uud
    public final defpackage.une p() {
        return this.x;
    }

    public final void t(int i, int i2) {
        this.f = i;
        this.g = i2;
    }

    public final void u(defpackage.uua uuaVar) {
        synchronized (this.b) {
            this.c = uuaVar;
        }
    }

    public final void v(defpackage.uwu uwuVar) {
        if (this.r) {
            defpackage.uwo uwoVar = defpackage.uwo.a;
        }
        defpackage.uwu uwuVar2 = this.m;
        this.m = uwuVar;
        if (this.r) {
            if (uwuVar2 != null) {
                uwuVar2.e();
            }
            if (uwuVar != null) {
                defpackage.uuz uuzVar = this.l;
                uuzVar.getClass();
                uwuVar.c(uuzVar);
            }
        }
    }

    public final void w(defpackage.uxp uxpVar) {
        if (this.r) {
            defpackage.uwo uwoVar = defpackage.uwo.a;
        }
        defpackage.uxp uxpVar2 = this.e;
        if (this.r) {
            defpackage.uuz uuzVar = this.l;
            uuzVar.getClass();
            if (uxpVar2 != null) {
                uxpVar2.b(false);
            }
            if (uxpVar != null) {
                uxpVar.a(uuzVar);
            }
        }
        this.e = uxpVar;
    }

    public final void x(int i, int i2) {
        this.t = true;
        this.u = 514;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.uud
    public final void y(defpackage.uuz uuzVar) {
        if (this.r) {
            return;
        }
        this.l = uuzVar;
        defpackage.uxp uxpVar = this.e;
        if (uxpVar != null) {
            uxpVar.a(uuzVar);
        }
        defpackage.uxj[] uxjVarArr = this.d;
        for (int i = 0; i < 8; i++) {
            defpackage.uxj uxjVar = uxjVarArr[i];
            if (uxjVar != null) {
                uxjVar.b(uuzVar);
            }
        }
        defpackage.uwu uwuVar = this.m;
        if (uwuVar != null) {
            uwuVar.c(uuzVar);
        }
        this.r = true;
    }

    public void z(int i, defpackage.uxj uxjVar) {
        if (this.r) {
            defpackage.uwo uwoVar = defpackage.uwo.a;
        }
        defpackage.uxj[] uxjVarArr = this.d;
        defpackage.uxj uxjVar2 = uxjVarArr[i];
        uxjVarArr[i] = uxjVar;
        if (this.r) {
            if (uxjVar2 != null) {
                uxjVar2.c(false);
            }
            defpackage.uuz uuzVar = this.l;
            uuzVar.getClass();
            uxjVar.b(uuzVar);
        }
    }

    @Override // defpackage.uud
    public void b(long j) {
    }
}
