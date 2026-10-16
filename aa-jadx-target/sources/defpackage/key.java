package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class key implements defpackage.zgn {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ key(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgi */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, whb] */
    /* JADX WARN: Type inference failed for: r7v5, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, zhs] */
    /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.Object, xyd] */
    @Override // defpackage.zgn
    public final defpackage.zhs a(java.lang.Object obj) throws java.lang.Throwable {
        int i;
        kqt kqtVar;
        int i2;
        int i3;
        ryx ryxVar;
        int i4;
        defpackage.zhs zhsVar;
        long jLongValue = -1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                android.content.Context context = (android.content.Context) this.a;
                return defpackage.ysr.cp(new kex(context.getString(2132085413) + " " + context.getString(2132084690), context.getString(2132084599), context.getString(2132084805), 1));
            case 1:
                defpackage.yqm yqmVar = defpackage.jmt.a;
                return this.a.invoke(obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                kqs kqsVar = (kqs) obj;
                int i5 = kqsVar.b & 1;
                java.lang.Object obj2 = this.a;
                if (i5 != 0 && (i2 = (kqtVar = (kqt) obj2).f) != 0 && kqsVar.c == i2) {
                    kqtVar.e();
                }
                if ((kqsVar.b & 2) != 0 && (i = kqsVar.d) >= 0) {
                    ajku ajkuVar = ((kqt) obj2).l;
                    ajkuVar.a = i;
                    jLongValue = ((java.lang.Long) ajkuVar.k(0)).longValue();
                }
                return defpackage.ysr.cp(new wjb(jLongValue));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar2 = com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService.a;
                return ((pid) this.a).a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                rsj rsjVar = (rsj) obj;
                int i6 = rsjVar.b & 1;
                java.lang.Object obj3 = this.a;
                if (i6 != 0 && (i4 = (ryxVar = (ryx) obj3).h) != 0 && rsjVar.c == i4) {
                    ryxVar.e();
                }
                if ((rsjVar.b & 2) != 0 && (i3 = rsjVar.d) >= 0) {
                    ((ryx) obj3).m = true;
                    ajmp ajmpVar = ryx.q;
                    ajmpVar.a = i3;
                    jLongValue = ((java.lang.Long) ajmpVar.n(0)).longValue();
                }
                return defpackage.ysr.cp(new wjb(jLongValue));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.vpu) this.a).a((vps) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.wej) this.a).c((wek) obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.wej) this.a).c((wek) obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.wej) this.a).c((wek) obj);
            case 9:
                return defpackage.ysr.cq((defpackage.zhs) ((defpackage.wem) this.a).f.fF());
            case 10:
                return this.a.c();
            case 11:
                defpackage.who whoVar = (defpackage.who) this.a;
                whoVar.f((android.net.Uri) defpackage.ysr.cw(whoVar.a), obj, (com.google.android.libraries.storage.protostore.MappedCounterCacheVersion) defpackage.ysr.cw(whoVar.e.a()));
                return defpackage.zho.a;
            case 12:
                defpackage.whs whsVar = (defpackage.whs) this.a;
                whsVar.c((android.net.Uri) defpackage.ysr.cw(whsVar.a), obj);
                return defpackage.zho.a;
            case 13:
                defpackage.whs whsVar2 = (defpackage.whs) this.a;
                return defpackage.ysr.cp(whsVar2.b((android.net.Uri) defpackage.ysr.cw(whsVar2.a)));
            case 14:
                android.net.Uri uri = (android.net.Uri) obj;
                android.net.Uri uriBD = defpackage.sqs.bD(uri, ".bak");
                try {
                    defpackage.ngb ngbVar = ((defpackage.whs) this.a).f;
                    if (ngbVar.g(uriBD)) {
                        ngbVar.f(uriBD, uri);
                        break;
                    }
                    return defpackage.zho.a;
                } catch (java.io.IOException e) {
                    return new defpackage.zif(e);
                }
            case 15:
                java.lang.Object obj4 = this.a;
                synchronized (((defpackage.whs) obj4).d) {
                    zhsVar = ((defpackage.whs) obj4).e;
                    break;
                }
                return zhsVar;
            case 16:
                return defpackage.ysr.cp(this.a.a(obj));
            default:
                java.lang.Object obj5 = this.a;
                ((java.io.IOException) obj5).addSuppressed((java.io.IOException) obj);
                throw ((java.lang.Throwable) obj5);
        }
    }
}
