package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wzh implements android.os.Handler.Callback {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public wzh(defpackage.sox soxVar, int i) {
        this.b = i;
        this.a = soxVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (this.b == 0) {
            ((defpackage.wzi) this.a).a.a(null, message.what);
            return true;
        }
        int i = message.what;
        if (i == 0) {
            java.util.HashMap map = ((defpackage.sox) this.a).b;
            synchronized (map) {
                defpackage.sow sowVar = (defpackage.sow) message.obj;
                defpackage.spa spaVar = (defpackage.spa) map.get(sowVar);
                if (spaVar != null && spaVar.c()) {
                    if (spaVar.c) {
                        defpackage.sox soxVar = spaVar.g;
                        soxVar.d.removeMessages(1, spaVar.e);
                        try {
                            soxVar.e.b(soxVar.c, spaVar);
                            spaVar.c = false;
                            spaVar.b = 2;
                        } catch (java.lang.Throwable th) {
                            spaVar.c = false;
                            spaVar.b = 2;
                            throw th;
                        }
                    }
                    map.remove(sowVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        java.util.HashMap map2 = ((defpackage.sox) this.a).b;
        synchronized (map2) {
            if (message.obj instanceof soy) {
                defpackage.sow sowVar2 = ((soy) message.obj).a;
                throw null;
            }
            defpackage.sow sowVar3 = (defpackage.sow) message.obj;
            defpackage.spa spaVar2 = (defpackage.spa) map2.get(sowVar3);
            if (spaVar2 != null && spaVar2.b == 3) {
                android.util.Log.e("GmsClientSupervisor", defpackage.a.bX(sowVar3, "Timeout waiting for ServiceConnection callback "), new java.lang.Exception());
                android.content.ComponentName componentName = spaVar2.f;
                if (componentName == null) {
                    componentName = sowVar3.c;
                }
                if (componentName == null) {
                    java.lang.String str = sowVar3.b;
                    defpackage.sqs.aA(str);
                    componentName = new android.content.ComponentName(str, "unknown");
                }
                spaVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }

    public /* synthetic */ wzh(defpackage.wzi wziVar, int i) {
        this.b = i;
        this.a = wziVar;
    }
}
