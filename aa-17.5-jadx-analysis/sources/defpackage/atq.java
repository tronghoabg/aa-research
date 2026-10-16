package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class atq implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ atq(cuo cuoVar, cto ctoVar, cts ctsVar, int i, int i2, atl atlVar, int i3) {
        this.g = i3;
        this.c = cuoVar;
        this.e = ctoVar;
        this.f = ctsVar;
        this.a = i;
        this.b = i2;
        this.d = atlVar;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [cts, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [cts, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [cto, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int iA;
        if (this.g != 0) {
            cfn cfnVar = ((atl) this.d).a;
            cun cunVar = (cun) obj;
            ?? r11 = this.f;
            atk.d(cunVar, (cuo) this.c, this.e, r11.p(), this.a, this.b, cfnVar);
            return afak.a;
        }
        cun cunVar2 = (cun) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            cuo[] cuoVarArr = (cuo[]) this.c;
            if (i >= cuoVarArr.length) {
                return afak.a;
            }
            ?? r3 = this.e;
            cuo cuoVar = cuoVarArr[i];
            int i3 = i2 + 1;
            cuoVar.getClass();
            avu avuVarD = asl.D(cuoVar);
            dlr dlrVarP = r3.p();
            atz atzVar = avuVarD != null ? avuVarD.c : null;
            int i4 = this.a;
            if (atzVar != null) {
                iA = atzVar.a(i4, cuoVar.a, dlrVarP, cuoVar, this.b);
            } else {
                iA = ((atr) this.d).a.a(cuoVar.a, i4, dlrVarP);
            }
            cunVar2.r(cuoVar, iA, ((int[]) this.f)[i2], BitmapDescriptorFactory.HUE_RED);
            i++;
            i2 = i3;
        }
    }

    public /* synthetic */ atq(cuo[] cuoVarArr, atr atrVar, int i, int i2, cts ctsVar, int[] iArr, int i3) {
        this.g = i3;
        this.c = cuoVarArr;
        this.d = atrVar;
        this.a = i;
        this.b = i2;
        this.e = ctsVar;
        this.f = iArr;
    }
}
