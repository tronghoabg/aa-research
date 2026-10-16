package defpackage;

import android.os.Parcel;
import java.util.List;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final /* synthetic */ class adpy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ adpy(adpz adpzVar, int i, Parcel parcel, int i2) {
        this.d = i2;
        this.b = adpzVar;
        this.a = i;
        this.c = parcel;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            int i = this.a;
            ?? r1 = this.b;
            ((wjt) this.c).a.a(new ajll(3, ((abxl) r1.get(i)).e, ((abxl) r1.get(i)).d));
            long j = wid.a;
            return;
        }
        Object obj = this.c;
        try {
            if (((adqb) this.b).c(this.a, (Parcel) obj)) {
                return;
            }
            adqb.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
        } catch (Exception e) {
            adqb.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e);
        }
    }

    public /* synthetic */ adpy(wjt wjtVar, List list, int i, int i2) {
        this.d = i2;
        this.c = wjtVar;
        this.b = list;
        this.a = i;
    }
}
