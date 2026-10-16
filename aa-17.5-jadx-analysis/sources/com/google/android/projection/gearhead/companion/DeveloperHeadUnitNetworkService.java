package com.google.android.projection.gearhead.companion;

import android.app.PendingIntent;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.projection.gearhead.R;
import defpackage.dss;
import defpackage.dsx;
import defpackage.erb;
import defpackage.mas;
import defpackage.omc;
import defpackage.pdn;
import defpackage.qsz;
import defpackage.qzo;
import defpackage.rrd;
import defpackage.wdu;
import defpackage.wxj;
import defpackage.wzf;
import defpackage.wzg;
import defpackage.ype;
import defpackage.yph;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* loaded from: classes3.dex */
public class DeveloperHeadUnitNetworkService extends Service {
    public static final yph a = yph.c("GH.DHUService");
    public static boolean b = false;
    public ServerSocket c;
    public qsz d;
    public final Object e = new Object();
    public erb f;

    private final erb b() {
        erb erbVar;
        Object obj = this.e;
        synchronized (obj) {
            while (this.f == null) {
                try {
                    obj.wait();
                } catch (InterruptedException unused) {
                    ((ype) ((ype) a.h()).ai(9950)).u("Interrupted");
                }
            }
            erbVar = this.f;
        }
        return erbVar;
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, qzi] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, qzi] */
    public final void a(Socket socket) throws InterruptedException, IOException {
        try {
            ((ype) ((ype) a.f()).ai(9945)).u("Head unit connected");
            ParcelFileDescriptor[] parcelFileDescriptorArrCreateSocketPair = ParcelFileDescriptor.createSocketPair();
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreateSocketPair[0]);
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorArrCreateSocketPair[0]);
            Thread thread = new Thread(new wzg(socket, socket.getInputStream(), autoCloseOutputStream));
            Thread thread2 = new Thread(new wzg(socket, autoCloseInputStream, socket.getOutputStream()));
            thread.start();
            thread2.start();
            try {
                b().a.f(new qzo(parcelFileDescriptorArrCreateSocketPair[1]), 3, true, false);
                try {
                    thread.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    ((ype) ((ype) ((ype) a.h()).p(e)).ai(9949)).u("Ignoring InterruptedException");
                }
                try {
                    b().a.e();
                } catch (RemoteException e2) {
                    if (rrd.e("CAR.SYS", 4)) {
                        rrd.d(4, "CAR.SYS", e2, "Remote exception stopping connection: %s", e2.getMessage());
                    }
                }
                ((ype) ((ype) a.f()).ai(9946)).u("Head unit disconnected");
            } catch (RemoteException e3) {
                throw new RuntimeException("Failed to start connection", e3);
            }
        } catch (ActivityNotFoundException e4) {
            ((ype) ((ype) ((ype) a.g()).p(e4)).ai((char) 9948)).u("Google Play Services does not support car projection.");
        } catch (IOException e5) {
            ((ype) ((ype) ((ype) a.f()).p(e5)).ai((char) 9947)).u("Unable to set up projection file descriptor");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        Intent intent = new Intent(this, (Class<?>) DeveloperHeadUnitNetworkService.class);
        intent.setAction("shutdown");
        ClipData clipData = wdu.a;
        PendingIntent pendingIntentD = wdu.d(this, 0, intent, 67108864);
        mas.c();
        dsx dsxVar = new dsx(this, "gearhead_connection_status");
        dsxVar.i(getString(R.string.developer_head_unit_server_notification_title));
        dsxVar.h(getString(R.string.developer_head_unit_server_notification_subtitle));
        dsxVar.n(2131231981);
        dsxVar.g(new dss(2131232005, getString(R.string.developer_head_unit_server_notification_stop), pendingIntentD).a());
        startForeground(2847442, dsxVar.a());
        qsz qszVarB = omc.b(this, new pdn(this, 2), new wzf(this, 0), null, 0);
        this.d = qszVarB;
        qszVarB.e();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        stopForeground(true);
        this.d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) throws IOException {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("shutdown")) {
            new Thread(new wxj(this, 4, null)).start();
            b = true;
            return 1;
        }
        ((ype) ((ype) a.f()).ai((char) 9951)).u("Shutting down service");
        ServerSocket serverSocket = this.c;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                ((ype) ((ype) a.l().p(e)).ai((char) 9952)).u("Exception closing socket.");
            }
            this.c = null;
        }
        stopSelfResult(i2);
        b = false;
        return 2;
    }
}
