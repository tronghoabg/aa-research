package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kpc implements java.util.function.Function {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpc(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i == 2) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i == 3) {
            return j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v25, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, thn] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        nus nusVar;
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            defpackage.yqm yqmVar = defpackage.kpd.a;
            int iOrdinal = ((defpackage.rsr) obj).ordinal();
            if (iOrdinal == 0) {
                return defpackage.qtu.a.equals((android.content.ComponentName) ((android.content.Intent) this.a).getParcelableExtra("com.google.android.gms.car.extra.EXTRA_CONNECTION_HANDOFF_COMPONENT")) ? defpackage.yyn.CONNECTION_HANDOFF_TO_GEARHEAD_STARTED : defpackage.yyn.CONNECTION_HANDOFF_TO_UNKNOWN_STARTED;
            }
            if (iOrdinal == 1) {
                return defpackage.yyn.CONNECTION_HANDOFF_COMPLETE;
            }
            if (iOrdinal == 2) {
                return defpackage.yyn.CONNECTION_HANDOFF_FAILED;
            }
            throw new java.lang.AssertionError("this line should be unreachable; is a case missing a return statement?");
        }
        if (i == 1) {
            return (defpackage.tgf) ((defpackage.yhe) this.a).get((java.lang.Integer) obj);
        }
        if (i == 2) {
            defpackage.yqm yqmVar2 = defpackage.kzb.a;
            return new defpackage.szw((android.content.Context) this.a, (defpackage.szo) obj);
        }
        if (i == 3) {
            defpackage.ntb ntbVar = (defpackage.ntb) this.a;
            com.google.android.gms.car.display.CarRegionGroup carRegionGroup = (com.google.android.gms.car.display.CarRegionGroup) obj;
            for (java.util.Map.Entry entry : ntbVar.i.entrySet()) {
                com.google.android.gms.car.display.CarRegionGroup carRegionGroup2 = (com.google.android.gms.car.display.CarRegionGroup) entry.getValue();
                if (carRegionGroup2.a == carRegionGroup.a) {
                    ((defpackage.yqj) defpackage.ntb.a.l().ai(5402)).R("Updating %s from group %s to group %s", entry.getKey(), carRegionGroup2, carRegionGroup);
                    defpackage.ylx ylxVar = ntbVar.j;
                    ylxVar.C(carRegionGroup2, entry.getKey());
                    ylxVar.t(carRegionGroup, (com.google.android.gms.car.display.CarRegionId) entry.getKey());
                    entry.setValue(carRegionGroup);
                }
            }
            return carRegionGroup;
        }
        if (i != 4) {
            if (i == 5) {
                return this.a.invoke(obj);
            }
            return new defpackage.thp(true, this.a);
        }
        nuv nuvVar = (nuv) obj;
        boolean z2 = nuvVar.e;
        defpackage.yhx yhxVar = defpackage.nyh.a;
        if (z2 && nuvVar.c.k) {
            ?? r8 = this.a;
            int size = r8.size();
            int i2 = 0;
            while (i2 < size) {
                nyg nygVar = (nyg) r8.get(i2);
                i2++;
                if (nygVar.a.d.equals(nuvVar.d)) {
                    z = nygVar.b;
                }
            }
            if (nuvVar.c.a.f > nvf.b.f) {
                nusVar = nuvVar.i;
                if (!nusVar.equals(nus.a)) {
                    z = false;
                }
            } else {
                z = false;
            }
        } else if (nuvVar.c.a.f > nvf.b.f) {
            nusVar = nuvVar.i;
            if (!nusVar.equals(nus.a) && !nusVar.equals(nus.b)) {
                z = false;
            }
        } else {
            z = false;
        }
        return new nyg(nuvVar, z);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i == 2) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i == 3) {
            return j$.util.function.Function.-CC.$default$compose(this, function);
        }
        if (i != 4) {
            return i != 5 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
