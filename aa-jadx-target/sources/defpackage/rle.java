package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rle extends defpackage.ijw implements defpackage.rlf {
    private final defpackage.yhe a;
    private final boolean b;

    public rle(defpackage.yhe yheVar, boolean z) {
        super("com.google.android.gms.car.display.manager.ICarDisplayManager");
        defpackage.ysr.bk(!yheVar.isEmpty(), "No car displays are attached. Displays have not been discovered or car is disconnected/disconnecting.");
        this.b = z;
        this.a = yheVar;
    }

    @Override // defpackage.rlf
    public final defpackage.rkt e(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        defpackage.ivc ivcVar = (defpackage.ivc) this.a.get(carDisplayId);
        if (ivcVar != null) {
            return ivcVar.r;
        }
        throw new java.lang.IllegalStateException("No CarDisplayService found for display id: " + carDisplayId.b);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 2) {
            java.util.List listF = f();
            parcel2.writeNoException();
            parcel2.writeTypedList(listF);
            return true;
        }
        if (i == 3) {
            com.google.android.gms.car.display.CarDisplayId carDisplayId = (com.google.android.gms.car.display.CarDisplayId) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarDisplayId.CREATOR);
            defpackage.ijx.d(parcel);
            defpackage.rkt rktVarE = e(carDisplayId);
            parcel2.writeNoException();
            defpackage.ijx.i(parcel2, rktVarE);
            return true;
        }
        if (i != 4) {
            return false;
        }
        boolean z = this.b;
        parcel2.writeNoException();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcel2.writeInt(z ? 1 : 0);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rlf
    public final java.util.List f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.you youVarListIterator = ((defpackage.ygw) this.a.values()).listIterator(0);
        while (youVarListIterator.hasNext()) {
            arrayList.add(((defpackage.ivc) youVarListIterator.next()).r.g());
        }
        return arrayList;
    }

    @Override // defpackage.rlf
    public final boolean g() {
        return this.b;
    }
}
