package defpackage;

/* loaded from: classes3.dex */
public final class ahek {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "PROTOCOL_ERROR";
            case 3:
                return "INTERNAL_ERROR";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "SETTINGS_TIMEOUT";
            case 6:
                return "STREAM_CLOSED";
            case 7:
                return "FRAME_SIZE_ERROR";
            case 8:
                return "REFUSED_STREAM";
            case 9:
                return "CANCEL";
            case 10:
                return "COMPRESSION_ERROR";
            case 11:
                return "CONNECT_ERROR";
            case 12:
                return "ENHANCE_YOUR_CALM";
            case 13:
                return "INADEQUATE_SECURITY";
            default:
                return "HTTP_1_1_REQUIRED";
        }
    }

    public static int[] b() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    }

    public static final int c(int i) {
        int[] iArrB = b();
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = iArrB[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 0;
    }

    public static final ahei makeDeserializationComponentsForJava(agcu agcuVar, aiei aieiVar, agdb agdbVar, agvt agvtVar, ahfc ahfcVar, ahen ahenVar, ahzh ahzhVar, ahlc ahlcVar) {
        agcuVar.getClass();
        aieiVar.getClass();
        agdbVar.getClass();
        agvtVar.getClass();
        ahfcVar.getClass();
        ahenVar.getClass();
        ahzhVar.getClass();
        ahlcVar.getClass();
        return new ahei(aieiVar, agcuVar, ahyw.INSTANCE, new aheo(ahfcVar, ahenVar), ahee.createBinaryClassAnnotationAndConstantLoader(agcuVar, agdbVar, aieiVar, ahfcVar, ahlcVar), agvtVar, agdbVar, ahzhVar, aglp.INSTANCE, ahyu.Companion.getDEFAULT(), aike.Companion.getDefault(), new ailo(woy.bg(aifm.INSTANCE)));
    }

    public static final agvt makeLazyJavaPackageFragmentProvider(agsm agsmVar, agcu agcuVar, aiei aieiVar, agdb agdbVar, ahfc ahfcVar, ahen ahenVar, ahzh ahzhVar, agze agzeVar, agvx agvxVar, ahfr ahfrVar) {
        agsmVar.getClass();
        agcuVar.getClass();
        aieiVar.getClass();
        agdbVar.getClass();
        ahfcVar.getClass();
        ahenVar.getClass();
        ahzhVar.getClass();
        agzeVar.getClass();
        agvxVar.getClass();
        ahfrVar.getClass();
        agtd agtdVar = agtd.Companion.getDefault(new aezq(1, 9));
        aguw aguwVar = aguw.DO_NOTHING;
        aguwVar.getClass();
        agup agupVar = agup.EMPTY;
        agupVar.getClass();
        return new agvt(new agvl(aieiVar, agsmVar, ahfcVar, ahenVar, aguwVar, ahzhVar, agupVar, agum.INSTANCE, new ahwi(aieiVar, afbe.a), agzeVar, agvxVar, ahfrVar, ageb.INSTANCE, aglp.INSTANCE, agcuVar, new afym(agcuVar, agdbVar), new agrw(agtdVar), new ahcu(new ahao(agvn.INSTANCE)), agsn.INSTANCE, agvn.INSTANCE, aike.Companion.getDefault(), agtdVar, new ahej(), null, 8388608, null));
    }
}
