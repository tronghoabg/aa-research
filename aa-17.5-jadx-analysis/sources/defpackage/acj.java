package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class acj implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ acj(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Integer) obj).intValue();
                aft aftVar = acl.a;
                return 0;
            case 1:
                aft aftVar2 = acl.a;
                return new dlq(0L);
            case 2:
                return acl.d;
            case 3:
                return afak.a;
            case 4:
                return new aee(((Float) obj).floatValue());
            case 5:
                return new aee(((Integer) obj).intValue());
            case 6:
                return Integer.valueOf((int) ((aee) obj).a);
            case 7:
                return new aee(((dlj) obj).a);
            case 8:
                return new dlj(((aee) obj).a);
            case 9:
                long j = ((dlk) obj).a;
                return new aef(Float.intBitsToFloat((int) (j >> 32)) + BitmapDescriptorFactory.HUE_RED, Float.intBitsToFloat((int) (j & 4294967295L)) + BitmapDescriptorFactory.HUE_RED);
            case 10:
                float f = ((aef) obj).a;
                return new dlk((Float.floatToRawIntBits(r7.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 11:
                long j2 = ((cjd) obj).a;
                return new aef(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 12:
                float f2 = ((aef) obj).a;
                return new cjd((Float.floatToRawIntBits(r7.b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            case 13:
                long j3 = ((cja) obj).a;
                return new aef(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            case 14:
                float f3 = ((aef) obj).a;
                return new cja((Float.floatToRawIntBits(r7.b) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
            case 15:
                long j4 = ((dlo) obj).a;
                return new aef((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 16:
                aef aefVar = (aef) obj;
                return new dlo((Math.round(aefVar.b) & 4294967295L) | (Math.round(aefVar.a) << 32));
            case 17:
                long j5 = ((dlq) obj).a;
                return new aef((int) (j5 >> 32), (int) (j5 & 4294967295L));
            case 18:
                aef aefVar2 = (aef) obj;
                int iRound = Math.round(aefVar2.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                return new dlq((iRound << 32) | (Math.round(aefVar2.b) >= 0 ? r7 : 0));
            case 19:
                cjb cjbVar = (cjb) obj;
                return new aeh(cjbVar.b, cjbVar.c, cjbVar.d, cjbVar.e);
            default:
                aeh aehVar = (aeh) obj;
                return new cjb(aehVar.a, aehVar.b, aehVar.c, aehVar.d);
        }
    }
}
