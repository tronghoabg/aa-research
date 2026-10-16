package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class dab implements java.util.Comparator {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dab(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v17, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [fvp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v43, types: [adon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.zm zmVar = defpackage.dah.a;
                return ((java.lang.Number) this.a.invoke(obj, obj2)).intValue();
            case 1:
                ?? r4 = this.a;
                return r4.invoke(obj).compareTo(r4.invoke(obj2));
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.affg affgVar = defpackage.del.a;
                return ((java.lang.Number) this.a.invoke(obj, obj2)).intValue();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int iCompare = this.a.compare(obj, obj2);
                return iCompare != 0 ? iCompare : java.lang.Integer.valueOf(((defpackage.dec) obj).c).compareTo(java.lang.Integer.valueOf(((defpackage.dec) obj2).c));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((java.lang.Number) this.a.invoke(obj, obj2)).intValue();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.String string = ((haw) obj).b.toString();
                string.getClass();
                ?? r5 = this.a;
                java.lang.String strB = r5.b(string);
                java.lang.String string2 = ((haw) obj2).b.toString();
                string2.getClass();
                return defpackage.afga.x(strB, r5.b(string2));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i = mqo.f;
                return ((java.lang.Number) this.a.invoke(obj, obj2)).intValue();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.os.UserManager userManager = (android.os.UserManager) this.a;
                return (int) (userManager.getSerialNumberForUser((android.os.UserHandle) obj) - userManager.getSerialNumberForUser((android.os.UserHandle) obj2));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.gms.car.senderprotocol.ChannelMessage channelMessage = (com.google.android.gms.car.senderprotocol.ChannelMessage) obj;
                com.google.android.gms.car.senderprotocol.ChannelMessage channelMessage2 = (com.google.android.gms.car.senderprotocol.ChannelMessage) obj2;
                channelMessage.getClass();
                channelMessage2.getClass();
                int i2 = channelMessage.b;
                java.lang.Object obj3 = this.a;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
                java.util.Map map = ((rvi) obj3).b;
                defpackage.rws rwsVar = (defpackage.rws) map.get(numValueOf);
                defpackage.rws rwsVar2 = (defpackage.rws) map.get(java.lang.Integer.valueOf(channelMessage2.b));
                defpackage.yek yekVar = defpackage.yek.b;
                rwsVar.getClass();
                rwsVar2.getClass();
                return yekVar.c(rwsVar.f, rwsVar2.f).d(channelMessage.j, channelMessage2.j).a();
            case 9:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
                java.util.Comparator comparator = yif.a;
                entry.getClass();
                entry2.getClass();
                return this.a.compare(entry.getKey(), entry2.getKey());
            case 10:
                ?? r6 = this.a;
                int iA = r6.a(obj) - r6.a(obj2);
                return iA != 0 ? iA : obj.getClass().getName().compareTo(obj2.getClass().getName());
            default:
                for (int i3 = 0; i3 < 2; i3++) {
                    defpackage.affc affcVar = ((defpackage.affc[]) this.a)[i3];
                    int iX = defpackage.afga.x((java.lang.Comparable) affcVar.invoke(obj), (java.lang.Comparable) affcVar.invoke(obj2));
                    if (iX != 0) {
                        return iX;
                    }
                }
                return 0;
        }
    }

    public dab(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
