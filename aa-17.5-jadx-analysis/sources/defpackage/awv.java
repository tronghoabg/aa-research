package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class awv implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ awv(aww awwVar, int i, cuo cuoVar, int i2, cts ctsVar, int i3) {
        this.f = i3;
        this.c = awwVar;
        this.a = i;
        this.d = cuoVar;
        this.b = i2;
        this.e = ctsVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [cts, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int iA;
        if (this.f == 0) {
            afeg afegVar = ((aww) this.c).b;
            ((cun) obj).s((cuo) this.d, ((dlo) afegVar.invoke(new dlq(((this.a - r2.a) << 32) | ((this.b - r2.b) & 4294967295L)), this.e.p())).a, BitmapDescriptorFactory.HUE_RED);
            return afak.a;
        }
        cun cunVar = (cun) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            cuo[] cuoVarArr = (cuo[]) this.d;
            if (i >= cuoVarArr.length) {
                return afak.a;
            }
            cuo cuoVar = cuoVarArr[i];
            int i3 = i2 + 1;
            cuoVar.getClass();
            avu avuVarD = asl.D(cuoVar);
            atz atzVar = avuVarD != null ? avuVarD.c : null;
            int i4 = this.a;
            if (atzVar != null) {
                iA = atzVar.a(i4, cuoVar.b, dlr.a, cuoVar, this.b);
            } else {
                iA = ((avw) this.c).a.a(cuoVar.b, i4);
            }
            cunVar.r(cuoVar, ((int[]) this.e)[i2], iA, BitmapDescriptorFactory.HUE_RED);
            i++;
            i2 = i3;
        }
    }

    public /* synthetic */ awv(cuo[] cuoVarArr, avw avwVar, int i, int i2, int[] iArr, int i3) {
        this.f = i3;
        this.d = cuoVarArr;
        this.c = avwVar;
        this.a = i;
        this.b = i2;
        this.e = iArr;
    }
}
