package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* loaded from: classes2.dex */
public final class qmk implements ServiceConnection {
    public volatile boolean a;
    public final /* synthetic */ qml b;
    public volatile qnb c;

    protected qmk(qml qmlVar) {
        this.b = qmlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #4 {all -> 0x004f, blocks: (B:5:0x0008, B:10:0x0019, B:12:0x0025, B:14:0x002f, B:16:0x0037, B:25:0x0060, B:27:0x0070, B:29:0x0074, B:30:0x008e, B:23:0x0053, B:15:0x0032, B:18:0x0043), top: B:47:0x0006, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r8, android.os.IBinder r9) {
        /*
            r7 = this;
            java.lang.String r8 = "AnalyticsServiceConnection.onServiceConnected"
            defpackage.spu.ap(r8)
            monitor-enter(r7)
            if (r9 != 0) goto L18
            qml r0 = r7.b     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "Service connected with null binder"
            r4 = 0
            r5 = 0
            r1 = 6
            r3 = 0
            r0.p(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4f
            r7.notifyAll()     // Catch: java.lang.Throwable -> L99
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L99
            return
        L18:
            r8 = 0
            java.lang.String r3 = r9.getInterfaceDescriptor()     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
            if (r0 == 0) goto L43
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r9.queryLocalInterface(r0)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
            boolean r1 = r0 instanceof defpackage.qnb     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
            if (r1 == 0) goto L32
            qnb r0 = (defpackage.qnb) r0     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
            goto L37
        L32:
            qnb r0 = new qnb     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
        L37:
            qml r1 = r7.b     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L53
            java.lang.String r3 = "Bound to IAnalyticsService interface"
            r5 = 0
            r6 = 0
            r2 = 2
            r4 = 0
            r1.p(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L53
            goto L5e
        L43:
            qml r0 = r7.b     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r4 = 0
            r5 = 0
            r1 = 6
            r0.p(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L52
            r0 = r8
            goto L5e
        L4f:
            r0 = move-exception
            r8 = r0
            goto L95
        L52:
            r0 = r8
        L53:
            qml r1 = r7.b     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "Service connect failed to get IAnalyticsService"
            r5 = 0
            r6 = 0
            r2 = 6
            r4 = 0
            r1.p(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4f
        L5e:
            if (r0 != 0) goto L70
            spi r8 = defpackage.spi.a()     // Catch: java.lang.Throwable -> L4f java.lang.IllegalArgumentException -> L90
            qml r9 = r7.b     // Catch: java.lang.Throwable -> L4f java.lang.IllegalArgumentException -> L90
            android.content.Context r0 = r9.f()     // Catch: java.lang.Throwable -> L4f java.lang.IllegalArgumentException -> L90
            qmk r9 = r9.a     // Catch: java.lang.Throwable -> L4f java.lang.IllegalArgumentException -> L90
            r8.b(r0, r9)     // Catch: java.lang.Throwable -> L4f java.lang.IllegalArgumentException -> L90
            goto L90
        L70:
            boolean r9 = r7.a     // Catch: java.lang.Throwable -> L4f
            if (r9 != 0) goto L8e
            qml r1 = r7.b     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "onServiceConnected received after the timeout limit"
            r5 = 0
            r6 = 0
            r2 = 5
            r4 = 0
            r1.p(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4f
            qlk r9 = r1.g()     // Catch: java.lang.Throwable -> L4f
            qfa r1 = new qfa     // Catch: java.lang.Throwable -> L4f
            r2 = 19
            r1.<init>(r7, r0, r2, r8)     // Catch: java.lang.Throwable -> L4f
            r9.c(r1)     // Catch: java.lang.Throwable -> L4f
            goto L90
        L8e:
            r7.c = r0     // Catch: java.lang.Throwable -> L4f
        L90:
            r7.notifyAll()     // Catch: java.lang.Throwable -> L99
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L99
            return
        L95:
            r7.notifyAll()     // Catch: java.lang.Throwable -> L99
            throw r8     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L99
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmk.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        spu.ap("AnalyticsServiceConnection.onServiceDisconnected");
        this.b.g().c(new qfa(this, componentName, 20, (short[]) null));
    }
}
