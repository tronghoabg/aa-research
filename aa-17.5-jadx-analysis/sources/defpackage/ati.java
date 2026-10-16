package defpackage;

import com.google.android.apps.auto.components.coolwalk.compose.viewcompat.CarButton;

/* loaded from: classes.dex */
public final /* synthetic */ class ati implements afeg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ati(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [afeh, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                ((Integer) obj2).intValue();
                int i = this.a | 1;
                int i2 = i & 306783378;
                int i3 = i & 613566756;
                atk.c(this.b, (bux) obj, (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3));
                break;
            case 1:
                ((Integer) obj2).intValue();
                int i4 = this.a | 1;
                int i5 = i4 & 306783378;
                int i6 = i4 & 613566756;
                ((afh) this.b).a((bux) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                break;
            case 2:
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    int i7 = this.a;
                    axe axeVar = (axe) this.b;
                    os osVarB = axeVar.a.a.b(i7);
                    ((axc) osVarB.c).a.invoke(axeVar.b, Integer.valueOf(i7 - osVarB.a), buxVar, 0);
                } else {
                    buxVar.s();
                }
                break;
            case 3:
                ((Integer) obj2).intValue();
                int i8 = this.a | 1;
                int i9 = i8 & 306783378;
                int i10 = i8 & 613566756;
                afp.ae(this.b, (bux) obj, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
                break;
            case 4:
                bux buxVar2 = (bux) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i11 = iIntValue2 & 3;
                if (buxVar2.I(i11 != 2, iIntValue2 & 1)) {
                    int i12 = this.a;
                    bbf bbfVar = (bbf) this.b;
                    os osVarB2 = ((bbd) bbfVar.a).a.b(i12);
                    ((bba) osVarB2.c).a.invoke(bbfVar.b, Integer.valueOf(i12 - osVarB2.a), buxVar2, 0);
                } else {
                    buxVar2.s();
                }
                break;
            case 5:
                ((Integer) obj2).intValue();
                int i13 = this.a | 1;
                int i14 = i13 & 306783378;
                int i15 = i13 & 613566756;
                asl.ak((blr) this.b, (bux) obj, (i13 & (-920350135)) | i14 | (i15 >> 1) | ((i14 + i14) & i15));
                break;
            case 6:
                ((Integer) obj2).intValue();
                int i16 = this.a | 1;
                int i17 = i16 & 306783378;
                int i18 = i16 & 613566756;
                ((bfh) this.b).b((bux) obj, (i16 & (-920350135)) | i17 | (i18 >> 1) | ((i17 + i17) & i18));
                break;
            default:
                ((Integer) obj2).intValue();
                int i19 = this.a | 1;
                int i20 = i19 & 306783378;
                int i21 = i19 & 613566756;
                ((CarButton) this.b).l((bux) obj, (i19 & (-920350135)) | i20 | (i21 >> 1) | ((i20 + i20) & i21));
                break;
        }
        return afak.a;
    }
}
