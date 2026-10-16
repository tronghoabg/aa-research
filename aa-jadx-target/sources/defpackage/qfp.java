package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class qfp implements defpackage.lbn {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/gearhead/FactoryImpl");

    @Override // defpackage.lbn
    public final android.content.SharedPreferences a(android.content.Context context, java.lang.String str) {
        return new defpackage.knf(context, str);
    }

    @Override // defpackage.lbn
    public final defpackage.lhn b(android.content.Context context, defpackage.oed oedVar, oic oicVar) {
        if (!defpackage.ogv.k()) {
            return new ogc(context, oedVar);
        }
        ((defpackage.ype) ((defpackage.ype) a.f()).ai((char) 7039)).u("Using multiple call notification producer");
        return new defpackage.ogk(context, oedVar);
    }

    @Override // defpackage.lbn
    public final defpackage.sax c(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return defpackage.oml.u(qshVar);
    }

    @Override // defpackage.lbn
    public final java.util.UUID d() {
        return java.util.UUID.randomUUID();
    }

    @Override // defpackage.lbn
    public final defpackage.roz e(defpackage.qsh qshVar) throws defpackage.qst {
        return defpackage.oml.s(qshVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX INFO: Thrown type has an unknown type hierarchy: rlp */
    @Override // defpackage.lbn
    public final defpackage.rot f(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst, rlo, rlp {
        defpackage.ros rosVarI = defpackage.oml.i(qshVar);
        if (!rosVarI.d) {
            throw new rlp();
        }
        defpackage.rot rotVar = null;
        try {
            qwd qwdVarS = rosVarI.a.s(rosVarI.e, 0);
            if (qwdVarS == null) {
                if (defpackage.omv.c("CAR.AUDIO", 5)) {
                    defpackage.rrx.d(5, "CAR.AUDIO", null, "CarService error: %s", "cannot get audio record binder");
                }
                rosVarI.a();
                throw new rlp((byte[]) null);
            }
            rotVar = new defpackage.rot(rosVarI, qwdVarS);
            synchronized (rosVarI.b) {
                rosVarI.c.add(rotVar);
            }
            return rotVar;
        } catch (android.os.RemoteException e) {
            rosVarI.b(e);
        } catch (java.lang.IllegalStateException e2) {
            defpackage.oml.H(e2);
        }
    }

    @Override // defpackage.lbn
    public final rko g(android.app.Activity activity) {
        return new rko(activity);
    }

    @Override // defpackage.lbn
    public final xrc h(android.content.Context context, android.os.Looper looper, defpackage.wva wvaVar) {
        return new xrc(context, looper, wvaVar);
    }

    @Override // defpackage.lbn
    public final mbs i(ajnd ajndVar, defpackage.mbk mbkVar) {
        return new defpackage.qjr(ajndVar, mbkVar);
    }
}
