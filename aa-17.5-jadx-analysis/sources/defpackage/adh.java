package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class adh extends acv {
    public aec a;
    public cfn b;
    public afeg c;
    private boolean f;
    private long d = -9223372034707292160L;
    private long e = dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY);
    private final bwq g = new ParcelableSnapshotMutableState(null, bxp.c);

    public adh(aec aecVar, cfn cfnVar, afeg afegVar) {
        this.a = aecVar;
        this.b = cfnVar;
        this.c = afegVar;
    }

    public final void a(adf adfVar) {
        this.g.b(adfVar);
    }

    @Override // defpackage.cwu
    public final ctq el(final cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV;
        char c;
        long j2;
        adh adhVar;
        adf adfVar;
        long jE;
        adf adfVar2;
        if (ctsVar.eM()) {
            this.e = j;
            this.f = true;
            cuoVarV = ctoVar.v(j);
        } else {
            cuoVarV = ctoVar.v(this.f ? this.e : j);
        }
        final cuo cuoVar = cuoVarV;
        final long j3 = (cuoVar.b & 4294967295L) | (cuoVar.a << 32);
        if (ctsVar.eM()) {
            this.d = j3;
            adhVar = this;
            jE = j3;
            c = ' ';
            j2 = 4294967295L;
        } else {
            long j4 = this.d;
            if (j4 == -9223372034707292160L) {
                j4 = j3;
            }
            adf adfVar3 = (adf) this.g.a();
            if (adfVar3 != null) {
                adu aduVar = adfVar3.a;
                boolean z = (j4 == ((dlq) aduVar.d()).a || aduVar.j()) ? false : true;
                c = ' ';
                j2 = 4294967295L;
                if (j4 != ((dlq) aduVar.c()).a || z) {
                    adfVar3.b = ((dlq) aduVar.d()).a;
                    adfVar2 = adfVar3;
                    adhVar = this;
                    ahnc.d(N(), null, 0, new adg(adfVar2, j4, adhVar, null), 3);
                } else {
                    adhVar = this;
                    adfVar2 = adfVar3;
                }
                adfVar = adfVar2;
            } else {
                long j5 = j4;
                c = ' ';
                j2 = 4294967295L;
                adhVar = this;
                adfVar = new adf(new adu(new dlq(j5), agm.h, new dlq(4294967297L), "Animatable"), j5);
            }
            adhVar.a(adfVar);
            jE = dlf.e(j, ((dlq) adfVar.a.d()).a);
        }
        final int i = (int) (jE >> c);
        final int i2 = (int) (jE & j2);
        final adh adhVar2 = adhVar;
        return ctsVar.eK(i, i2, afbf.a, new afec() { // from class: ade
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                ((cun) obj).s(cuoVar, this.a.b.a(j3, (i << 32) | (i2 & 4294967295L), ctsVar.p()), BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            }
        });
    }

    @Override // defpackage.cfx
    public final void em() {
        a(null);
    }

    @Override // defpackage.cfx
    public final void er() {
        this.d = -9223372034707292160L;
        this.f = false;
    }
}
