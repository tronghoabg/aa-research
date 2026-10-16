package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sro implements defpackage.srt {
    private final /* synthetic */ int a;

    public sro(int i) {
        this.a = i;
    }

    @Override // defpackage.srt
    public final defpackage.srs a(android.content.Context context, java.lang.String str, defpackage.srr srrVar) throws defpackage.srq {
        int iB;
        int i = -1;
        if (this.a != 0) {
            defpackage.srs srsVar = new defpackage.srs();
            int iB2 = srrVar.b(context, str, true);
            srsVar.b = iB2;
            if (iB2 != 0) {
                srsVar.c = 1;
                return srsVar;
            }
            int iA = srrVar.a(context, str);
            srsVar.a = iA;
            if (iA != 0) {
                srsVar.c = -1;
            }
            return srsVar;
        }
        defpackage.srs srsVar2 = new defpackage.srs();
        int iA2 = srrVar.a(context, str);
        srsVar2.a = iA2;
        int i2 = 0;
        if (iA2 != 0) {
            iB = srrVar.b(context, str, false);
            srsVar2.b = iB;
        } else {
            iB = srrVar.b(context, str, true);
            srsVar2.b = iB;
        }
        int i3 = srsVar2.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            srsVar2.c = i;
            return srsVar2;
        }
        i2 = i3;
        if (i2 < iB) {
            i = 1;
        }
        srsVar2.c = i;
        return srsVar2;
    }
}
