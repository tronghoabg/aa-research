package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aiz {
    public long a = 9205357640488583168L;
    public final defpackage.ajv b;
    public final defpackage.bwx c;
    public boolean d;
    public long e;
    public long f;
    public final defpackage.cwn g;
    private final defpackage.dlo h;
    private final defpackage.crv i;

    public aiz(android.content.Context context, defpackage.dlo dloVar, defpackage.avv avvVar) {
        this.h = dloVar;
        float[] fArr = defpackage.clr.a;
        defpackage.ajv ajvVar = new defpackage.ajv(context, (int) (defpackage.ckd.e(-43234558140743680L, defpackage.clr.e) >>> 32));
        this.b = ajvVar;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.afbk.a, defpackage.bxv.b);
        this.e = 0L;
        this.f = -1L;
        defpackage.bax baxVar = new defpackage.bax(this, 1);
        defpackage.cqu cquVar = defpackage.crq.a;
        defpackage.crv crvVar = new defpackage.crv(null, null, baxVar);
        this.i = crvVar;
        this.g = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.alq(crvVar, this, ajvVar) : new defpackage.akf(crvVar, this, ajvVar, avvVar);
    }

    public final float a(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (e() >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.e & 4294967295L));
        float f = 1.0f - fIntBitsToFloat;
        android.widget.EdgeEffect edgeEffectA = this.b.a();
        return defpackage.ca.bg(edgeEffectA) == 0.0f ? (-defpackage.ca.bi(edgeEffectA, -fIntBitsToFloat2, f)) * java.lang.Float.intBitsToFloat((int) (4294967295L & this.e)) : java.lang.Float.intBitsToFloat(i);
    }

    public final float b(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (e() & 4294967295L));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.e >> 32));
        float f = 1.0f - fIntBitsToFloat;
        android.widget.EdgeEffect edgeEffectC = this.b.c();
        return defpackage.ca.bg(edgeEffectC) == 0.0f ? defpackage.ca.bi(edgeEffectC, fIntBitsToFloat2, f) * java.lang.Float.intBitsToFloat((int) (this.e >> 32)) : java.lang.Float.intBitsToFloat(i);
    }

    public final float c(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (e() & 4294967295L));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.e >> 32));
        android.widget.EdgeEffect edgeEffectE = this.b.e();
        return defpackage.ca.bg(edgeEffectE) == 0.0f ? (-defpackage.ca.bi(edgeEffectE, -fIntBitsToFloat2, fIntBitsToFloat)) * java.lang.Float.intBitsToFloat((int) (this.e >> 32)) : java.lang.Float.intBitsToFloat(i);
    }

    public final float d(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (e() >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.e & 4294967295L));
        android.widget.EdgeEffect edgeEffectG = this.b.g();
        return defpackage.ca.bg(edgeEffectG) == 0.0f ? defpackage.ca.bi(edgeEffectG, fIntBitsToFloat2, fIntBitsToFloat) * java.lang.Float.intBitsToFloat((int) (4294967295L & this.e)) : java.lang.Float.intBitsToFloat(i);
    }

    public final long e() {
        long jY = this.a;
        if ((9223372034707292159L & jY) == 9205357640488583168L) {
            jY = defpackage.bzo.y(this.e);
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jY >> 32)) / java.lang.Float.intBitsToFloat((int) (this.e >> 32));
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jY & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (this.e & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r21.invoke(r0, r5) == r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0138, code lost:
    
        if (r4 != r6) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r19, defpackage.affg r21, defpackage.afdk r22) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiz.f(long, affg, afdk):java.lang.Object");
    }

    public final void g() {
        boolean z;
        defpackage.ajv ajvVar = this.b;
        android.widget.EdgeEffect edgeEffect = ajvVar.b;
        boolean z2 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        android.widget.EdgeEffect edgeEffect2 = ajvVar.c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        android.widget.EdgeEffect edgeEffect3 = ajvVar.d;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        android.widget.EdgeEffect edgeEffect4 = ajvVar.e;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            h();
        }
    }

    public final void h() {
        this.c.b(defpackage.afbk.a);
    }

    public final void i(long j) {
        long j2 = this.e;
        this.e = j;
        boolean z = j == j2;
        if (!z) {
            defpackage.ajv ajvVar = this.b;
            long jK = (((long) defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (j >> 32)))) << 32);
            ajvVar.a = jK;
            android.widget.EdgeEffect edgeEffect = ajvVar.b;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jK >> 32), (int) (jK & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect2 = ajvVar.c;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jK >> 32), (int) (jK & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect3 = ajvVar.d;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jK & 4294967295L), (int) (jK >> 32));
            }
            android.widget.EdgeEffect edgeEffect4 = ajvVar.e;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jK & 4294967295L), (int) (jK >> 32));
            }
            android.widget.EdgeEffect edgeEffect5 = ajvVar.f;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jK >> 32), (int) (jK & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect6 = ajvVar.g;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jK >> 32), (int) (jK & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect7 = ajvVar.h;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jK & 4294967295L), (int) (jK >> 32));
            }
            android.widget.EdgeEffect edgeEffect8 = ajvVar.i;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jK & 4294967295L), (int) (jK >> 32));
            }
        }
        if (j2 == 0 || z) {
            return;
        }
        g();
    }

    public final boolean j() {
        defpackage.ajv ajvVar = this.b;
        android.widget.EdgeEffect edgeEffect = ajvVar.b;
        if (edgeEffect != null && defpackage.ca.bg(edgeEffect) != 0.0f) {
            return true;
        }
        android.widget.EdgeEffect edgeEffect2 = ajvVar.c;
        if (edgeEffect2 != null && defpackage.ca.bg(edgeEffect2) != 0.0f) {
            return true;
        }
        android.widget.EdgeEffect edgeEffect3 = ajvVar.d;
        if (edgeEffect3 != null && defpackage.ca.bg(edgeEffect3) != 0.0f) {
            return true;
        }
        android.widget.EdgeEffect edgeEffect4 = ajvVar.e;
        return (edgeEffect4 == null || defpackage.ca.bg(edgeEffect4) == 0.0f) ? false : true;
    }
}
