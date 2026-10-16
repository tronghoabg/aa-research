package defpackage;

import android.util.SparseArray;
import android.view.Surface;
import com.google.android.gms.car.display.CarRegionId;
import java.io.PrintWriter;
import java.util.UUID;

/* loaded from: classes.dex */
public interface jix {
    void b(CarRegionId carRegionId, jiw jiwVar, UUID uuid, int i, int i2, SparseArray sparseArray, jhc jhcVar) throws jiy;

    void c(PrintWriter printWriter);

    void d(jhc jhcVar);

    void e(jhc jhcVar);

    void f(int i, UUID uuid, int i2, SparseArray sparseArray) throws jiy;

    void g(boolean z);

    void h(boolean z);

    void i(Surface surface, UUID uuid, jhc jhcVar, boolean z) throws jiy;

    void j() throws jiy;

    void k(long j);

    void l(SparseArray sparseArray, int i);

    boolean m();

    boolean n(SparseArray sparseArray);

    boolean o(iye iyeVar);

    boolean p();
}
