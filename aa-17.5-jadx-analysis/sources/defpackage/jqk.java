package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class jqk extends rwu {
    public boolean a;
    public boolean b;
    private final Context c;
    private final xyc d;

    public jqk(Context context, xyc xycVar) {
        this.c = context;
        this.d = xycVar;
    }

    public final synchronized jqj a() {
        woy.aa(!this.b, "Delegate has already been torn down");
        this.a = true;
        return (jqj) this.d.gu();
    }

    @Override // defpackage.rwv
    public final qup b() {
        return a().b();
    }

    @Override // defpackage.rwv
    public final rwp c(rws rwsVar) {
        return a().c(rwsVar);
    }

    @Override // defpackage.rwv
    public final void d(long j, int i, Bundle bundle, rwy rwyVar) throws InterruptedException, IOException {
        a().d(j, i, bundle, rwyVar);
    }

    @Override // defpackage.rwv
    public final void f() {
        a().f();
    }

    @Override // defpackage.rwv
    public final void g(long j, ParcelFileDescriptor parcelFileDescriptor, rwy rwyVar) {
        a().g(j, parcelFileDescriptor, rwyVar);
    }

    @Override // defpackage.rwv
    public final void h(long j, rwy rwyVar) {
        a().h(j, rwyVar);
    }

    @Override // defpackage.rwv
    public final void i(long j, int i) {
        a().i(j, i);
    }

    @Override // defpackage.rwv
    public final void j(long j, List list, List list2, rwm rwmVar) {
        a().j(j, list, list2, rwmVar);
    }

    @Override // defpackage.rwv
    public final void k(long j, List list, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) {
        a().k(j, list, parcelFileDescriptor, rwmVar);
    }

    @Override // defpackage.rwv
    public final void l(long j, List list, List list2, ParcelFileDescriptor parcelFileDescriptor, rwm rwmVar) {
        a().l(j, list, list2, parcelFileDescriptor, rwmVar);
    }

    @Override // defpackage.rwv
    public final void m(long j) {
        a().m(j);
    }

    @Override // defpackage.rwv
    public final void n(long j, Bundle bundle) {
        a().n(j, bundle);
    }

    @Override // defpackage.rwv
    public final void o(boolean z, boolean z2) {
        a().o(z, z2);
    }

    @Override // defpackage.ijo, android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (!acrh.a.gu().e() || Process.myUid() == callingUid || skn.a(this.c).c(callingUid)) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        throw new SecurityException("Caller is not Google-signed.");
    }

    @Override // defpackage.rwv
    public final boolean r(long j) {
        a().r(j);
        return true;
    }

    @Override // defpackage.rwv
    public final boolean s(int i, int i2, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        return a().s(i, i2, parcelFileDescriptor, bArr);
    }

    @Override // defpackage.rwv
    public final void t() {
        a();
    }

    @Override // defpackage.rwv
    public final void u() {
        a();
    }
}
