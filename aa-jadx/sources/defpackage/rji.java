package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface rji extends android.os.IInterface {
    com.google.android.gms.car.control.CarPropertyState f(com.google.android.gms.car.control.CarProperty carProperty) throws android.os.RemoteException;

    java.util.List i() throws android.os.RemoteException;

    java.util.List j() throws android.os.RemoteException;

    java.util.List k() throws android.os.RemoteException;

    void l() throws android.os.RemoteException;

    void n(com.google.android.gms.car.control.CarAction carAction) throws android.os.RemoteException;

    void t(int i, defpackage.rjl rjlVar) throws android.os.RemoteException;

    void u(defpackage.rjr rjrVar, java.util.List list) throws android.os.RemoteException;

    void v(com.google.android.gms.car.control.CarProperty carProperty, com.google.android.gms.car.control.CarPropertyValue carPropertyValue, defpackage.rjo rjoVar) throws android.os.RemoteException;

    void w(defpackage.rjl rjlVar) throws android.os.RemoteException;

    void x(defpackage.rjr rjrVar) throws android.os.RemoteException;
}
