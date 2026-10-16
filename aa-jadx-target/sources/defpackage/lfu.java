package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lfu implements defpackage.afer {
    private final /* synthetic */ int a;

    public /* synthetic */ lfu(int i) {
        this.a = i;
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        byte[] bArr = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.lfx();
            case 1:
                return new defpackage.leq();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.lhq();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.ljw();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.lmp();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.mdc();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afar afarVar = defpackage.mik.a;
                return (defpackage.mik) defpackage.mkp.a.i(defpackage.mik.class);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.mks();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.mkq mkqVar = defpackage.mks.a;
                java.util.concurrent.Executor executor = defpackage.mkp.a.d;
                executor.getClass();
                return aiaz.b(executor);
            case 9:
                android.content.Context context = defpackage.mkp.a.c;
                context.getClass();
                return new defpackage.msg(context);
            case 10:
                return new defpackage.msl();
            case 11:
                int i = defpackage.muh.c;
                return new defpackage.muq();
            case 12:
                return new defpackage.nfg();
            case 13:
                return new defpackage.nfn(bArr);
            case 14:
                defpackage.nfk nfkVar = defpackage.nfn.a;
                return new defpackage.nfm();
            case 15:
                return defpackage.mkp.a.c;
            case 16:
                return new defpackage.nfp();
            case 17:
                return new defpackage.nfx();
            case 18:
                return new defpackage.ngf(bArr);
            case 19:
                return new defpackage.ngk();
            default:
                defpackage.yqm yqmVar = defpackage.nif.a;
                java.util.List list = defpackage.nje.j;
                int iP = defpackage.afga.P(defpackage.afga.aj(list, 10));
                if (iP < 16) {
                    iP = 16;
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iP);
                defpackage.afbo afboVar = new defpackage.afbo((defpackage.afbr) list);
                while (afboVar.hasNext()) {
                    java.lang.Object next = afboVar.next();
                    linkedHashMap.put(next, new defpackage.cit());
                }
                return linkedHashMap;
        }
    }
}
