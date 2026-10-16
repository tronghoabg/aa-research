package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aiu {
    public long a = 9205357640488583168L;
    public final ajr b;
    public final bwq c;
    public boolean d;
    public long e;
    public long f;
    public final cwd g;
    private final dlg h;
    private final crm i;

    public aiu(Context context, dlg dlgVar, avp avpVar) {
        this.h = dlgVar;
        float[] fArr = clj.a;
        ajr ajrVar = new ajr(context, (int) (cjv.e(-43234558140743680L, clj.e) >>> 32));
        this.b = ajrVar;
        this.c = new ParcelableSnapshotMutableState(afak.a, bxp.b);
        this.e = 0L;
        this.f = -1L;
        bas basVar = new bas(this, 1);
        cql cqlVar = crh.a;
        crm crmVar = new crm(null, null, basVar);
        this.i = crmVar;
        this.g = Build.VERSION.SDK_INT >= 31 ? new all(crmVar, this, ajrVar) : new aka(crmVar, this, ajrVar, avpVar);
    }

    public final float a(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.e & 4294967295L));
        float f = 1.0f - fIntBitsToFloat;
        EdgeEffect edgeEffectA = this.b.a();
        return ca.bg(edgeEffectA) == BitmapDescriptorFactory.HUE_RED ? (-ca.bi(edgeEffectA, -fIntBitsToFloat2, f)) * Float.intBitsToFloat((int) (4294967295L & this.e)) : Float.intBitsToFloat(i);
    }

    public final float b(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.e >> 32));
        float f = 1.0f - fIntBitsToFloat;
        EdgeEffect edgeEffectC = this.b.c();
        return ca.bg(edgeEffectC) == BitmapDescriptorFactory.HUE_RED ? ca.bi(edgeEffectC, fIntBitsToFloat2, f) * Float.intBitsToFloat((int) (this.e >> 32)) : Float.intBitsToFloat(i);
    }

    public final float c(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.e >> 32));
        EdgeEffect edgeEffectE = this.b.e();
        return ca.bg(edgeEffectE) == BitmapDescriptorFactory.HUE_RED ? (-ca.bi(edgeEffectE, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.e >> 32)) : Float.intBitsToFloat(i);
    }

    public final float d(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.e & 4294967295L));
        EdgeEffect edgeEffectG = this.b.g();
        return ca.bg(edgeEffectG) == BitmapDescriptorFactory.HUE_RED ? ca.bi(edgeEffectG, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (4294967295L & this.e)) : Float.intBitsToFloat(i);
    }

    public final long e() {
        long jA = this.a;
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = byx.A(this.e);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32)) / Float.intBitsToFloat((int) (this.e >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L)) / Float.intBitsToFloat((int) (this.e & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r21.invoke(r0, r5) == r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0138, code lost:
    
        if (r4 != r6) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r19, defpackage.afeg r21, defpackage.afck r22) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiu.f(long, afeg, afck):java.lang.Object");
    }

    public final void g() {
        boolean z;
        ajr ajrVar = this.b;
        EdgeEffect edgeEffect = ajrVar.b;
        boolean z2 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = ajrVar.c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = ajrVar.d;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = ajrVar.e;
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
        this.c.b(afak.a);
    }

    public final void i(long j) {
        long j2 = this.e;
        this.e = j;
        boolean z = j == j2;
        if (!z) {
            ajr ajrVar = this.b;
            long jK = (afgi.k(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (afgi.k(Float.intBitsToFloat((int) (j >> 32))) << 32);
            ajrVar.a = jK;
            EdgeEffect edgeEffect = ajrVar.b;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jK >> 32), (int) (jK & 4294967295L));
            }
            EdgeEffect edgeEffect2 = ajrVar.c;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jK >> 32), (int) (jK & 4294967295L));
            }
            EdgeEffect edgeEffect3 = ajrVar.d;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jK & 4294967295L), (int) (jK >> 32));
            }
            EdgeEffect edgeEffect4 = ajrVar.e;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jK & 4294967295L), (int) (jK >> 32));
            }
            EdgeEffect edgeEffect5 = ajrVar.f;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jK >> 32), (int) (jK & 4294967295L));
            }
            EdgeEffect edgeEffect6 = ajrVar.g;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jK >> 32), (int) (jK & 4294967295L));
            }
            EdgeEffect edgeEffect7 = ajrVar.h;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jK & 4294967295L), (int) (jK >> 32));
            }
            EdgeEffect edgeEffect8 = ajrVar.i;
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
        ajr ajrVar = this.b;
        EdgeEffect edgeEffect = ajrVar.b;
        if (edgeEffect != null && ca.bg(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect2 = ajrVar.c;
        if (edgeEffect2 != null && ca.bg(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect3 = ajrVar.d;
        if (edgeEffect3 != null && ca.bg(edgeEffect3) != BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        EdgeEffect edgeEffect4 = ajrVar.e;
        return (edgeEffect4 == null || ca.bg(edgeEffect4) == BitmapDescriptorFactory.HUE_RED) ? false : true;
    }
}
