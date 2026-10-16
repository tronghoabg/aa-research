package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bqj {
    public afdr a;
    public afec b;
    public final float[] c;
    public boolean d;
    public final bwq e;
    public api f;
    public final afdr g;
    public final afgw h;
    public final byd i;
    public final byd j;
    public final byd k;
    public final byd l;
    public final bii m;
    public final ajmd n;
    private boolean o;
    private final bwq p;
    private final byb q;
    private final byb r;
    private final byb s;

    public bqj(float f, afdr afdrVar, afgw afgwVar) {
        this.a = afdrVar;
        this.h = afgwVar;
        this.q = new ParcelableSnapshotMutableFloatState(f);
        this.o = true;
        float f2 = bqh.a;
        this.c = new float[0];
        this.i = new ParcelableSnapshotMutableIntState(0);
        this.j = new ParcelableSnapshotMutableIntState(0);
        bxp bxpVar = bxp.c;
        this.e = new ParcelableSnapshotMutableState(false, bxpVar);
        this.k = new ParcelableSnapshotMutableIntState(0);
        this.l = new ParcelableSnapshotMutableIntState(0);
        this.f = api.b;
        this.p = new ParcelableSnapshotMutableState(false, bxpVar);
        this.g = new ahp(this, 7);
        float fA = bqh.a(((Number) afgwVar.d()).floatValue(), ((Number) afgwVar.c()).floatValue(), f);
        float f3 = 1.0f - fA;
        this.r = new ParcelableSnapshotMutableFloatState((f3 * BitmapDescriptorFactory.HUE_RED) + (fA * BitmapDescriptorFactory.HUE_RED));
        this.s = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
        this.n = new ajmd(this, null);
        this.m = new bii((byte[]) null, (char[]) null);
    }

    public final float a() {
        afgw afgwVar = this.h;
        return bqh.a(((Number) afgwVar.d()).floatValue(), ((Number) afgwVar.c()).floatValue(), afpt.d(c(), ((Number) afgwVar.d()).floatValue(), ((Number) afgwVar.c()).floatValue()));
    }

    public final float b() {
        return this.r.e();
    }

    public final float c() {
        return this.q.e();
    }

    public final int d() {
        return this.l.e();
    }

    public final int e() {
        return this.k.e();
    }

    public final int f() {
        return this.i.e();
    }

    public final void g(float f) {
        float fMax;
        float fMin;
        if (this.f == api.a) {
            fMax = Math.max(this.j.e() - (d() / 2.0f), BitmapDescriptorFactory.HUE_RED);
            fMin = Math.min(d() / 2.0f, fMax);
        } else {
            fMax = Math.max(f() - (e() / 2.0f), BitmapDescriptorFactory.HUE_RED);
            fMin = Math.min(e() / 2.0f, fMax);
        }
        this.r.h(b() + f + this.s.e());
        i(BitmapDescriptorFactory.HUE_RED);
        float fB = b();
        afgw afgwVar = this.h;
        float f2 = bqh.a;
        float fFloatValue = ((Number) afgwVar.d()).floatValue();
        float fFloatValue2 = ((Number) afgwVar.c()).floatValue();
        float fA = bqh.a(fMin, fMax, fB);
        float f3 = ((1.0f - fA) * fFloatValue) + (fA * fFloatValue2);
        if (f3 == c()) {
            return;
        }
        afec afecVar = this.b;
        if (afecVar != null) {
            afecVar.invoke(Float.valueOf(f3));
        } else {
            j(f3);
        }
    }

    public final void h(boolean z) {
        this.p.b(Boolean.valueOf(z));
    }

    public final void i(float f) {
        this.s.h(f);
    }

    public final void j(float f) {
        if (this.o) {
            afgw afgwVar = this.h;
            f = afpt.d(f, ((Number) afgwVar.d()).floatValue(), ((Number) afgwVar.c()).floatValue());
            ((Number) afgwVar.d()).floatValue();
            ((Number) afgwVar.c()).floatValue();
            float f2 = bqh.a;
        }
        this.q.h(f);
    }

    public final boolean k() {
        return ((Boolean) this.p.a()).booleanValue();
    }

    public bqj() {
        this(BitmapDescriptorFactory.HUE_RED, null, new afgw(BitmapDescriptorFactory.HUE_RED, 1.0f));
    }
}
