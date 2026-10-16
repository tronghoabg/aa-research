package com.google.android.gms.carsetup.setup;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.system.Os;
import defpackage.jpx;
import defpackage.ols;
import defpackage.par;
import defpackage.rcd;
import defpackage.rhy;
import defpackage.rla;
import defpackage.sfg;
import defpackage.sgk;
import defpackage.sgl;
import defpackage.sgm;
import defpackage.sss;
import defpackage.ssu;
import defpackage.xyc;
import defpackage.ypf;
import defpackage.yxi;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class UsbConnectionHelper {
    public static final ypf a = ols.R("CAR.SETUP");
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public final sfg c;
    public final Object d = new Object();
    public ssu e;

    public UsbConnectionHelper(sfg sfgVar) {
        this.c = sfgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r15, android.hardware.usb.UsbAccessory r16, boolean r17, boolean r18, defpackage.sgj r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.setup.UsbConnectionHelper.a(android.content.Context, android.hardware.usb.UsbAccessory, boolean, boolean, sgj):void");
    }

    public static class TrackedParcelFileDescriptor extends ParcelFileDescriptor {
        public static sgm e;
        public static HandlerThread f;
        public static Handler g;
        public static Context h;
        public static long i;
        final long k;
        public final AtomicBoolean l;
        public static final List a = DesugarCollections.synchronizedList(new ArrayList());
        public static final AtomicInteger b = new AtomicInteger(0);
        public static final AtomicInteger c = new AtomicInteger(0);
        public static final Object d = new Object();
        private static final AtomicInteger m = new AtomicInteger(0);
        public static final xyc j = new rhy(8);
        public static final Parcelable.Creator<TrackedParcelFileDescriptor> CREATOR = new rcd(13);

        private TrackedParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
            this(parcelFileDescriptor, (Os.getpid() << 32) | m.getAndIncrement(), false);
        }

        public static TrackedParcelFileDescriptor a(ParcelFileDescriptor parcelFileDescriptor) {
            if (parcelFileDescriptor == null) {
                return null;
            }
            if (parcelFileDescriptor instanceof TrackedParcelFileDescriptor) {
                return (TrackedParcelFileDescriptor) parcelFileDescriptor;
            }
            Context context = h;
            context.getClass();
            ols.M(context, yxi.USB_FD_TRACKING_STARTED);
            TrackedParcelFileDescriptor trackedParcelFileDescriptor = new TrackedParcelFileDescriptor(parcelFileDescriptor);
            a.add(trackedParcelFileDescriptor);
            return trackedParcelFileDescriptor;
        }

        public static void b() throws IOException {
            List list = a;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    TrackedParcelFileDescriptor trackedParcelFileDescriptor = (TrackedParcelFileDescriptor) it.next();
                    if (trackedParcelFileDescriptor != null) {
                        trackedParcelFileDescriptor.e();
                    }
                    it.remove();
                }
            }
        }

        public static void c(Context context) {
            if (h == null) {
                h = context.getApplicationContext();
            }
        }

        public static sgk d(Context context) {
            sgk sgkVar;
            synchronized (d) {
                if (f == null) {
                    HandlerThread handlerThread = new HandlerThread("DisconnectMonitor");
                    f = handlerThread;
                    handlerThread.start();
                    g = new sss(f.getLooper());
                }
                Context applicationContext = context.getApplicationContext();
                if (b.getAndIncrement() == 0) {
                    sgm sgmVar = new sgm();
                    e = sgmVar;
                    Handler handler = g;
                    handler.getClass();
                    handler.post(new jpx(applicationContext, sgmVar, 11));
                }
                sgkVar = new sgk(new AtomicBoolean(false), applicationContext);
            }
            return sgkVar;
        }

        private final void e() throws IOException {
            if (this.l.compareAndSet(false, true)) {
                Context context = h;
                context.getClass();
                ols.M(context, yxi.USB_FD_CLOSED);
                super.close();
            }
        }

        @Override // android.os.ParcelFileDescriptor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (rla.n() && ((Boolean) rla.m().b(par.USB_FD_CLOSE, new sgl(0))).booleanValue()) {
                UsbConnectionHelper.a.f().ai(8907).u("Failed to close file descriptor due to FAIL_CLOSE_USB_FD");
                return;
            }
            e();
            List list = a;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    TrackedParcelFileDescriptor trackedParcelFileDescriptor = (TrackedParcelFileDescriptor) it.next();
                    if (trackedParcelFileDescriptor.k == this.k) {
                        trackedParcelFileDescriptor.e();
                        it.remove();
                    }
                }
            }
        }

        @Override // android.os.ParcelFileDescriptor
        public final ParcelFileDescriptor dup() throws IOException {
            h.getClass();
            TrackedParcelFileDescriptor trackedParcelFileDescriptor = new TrackedParcelFileDescriptor(super.dup());
            a.add(trackedParcelFileDescriptor);
            ols.M(h, yxi.USB_FD_DUP);
            return trackedParcelFileDescriptor;
        }

        @Override // android.os.ParcelFileDescriptor, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.k);
            parcel.writeInt(this.l.get() ? 1 : 0);
        }

        public TrackedParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, long j2, boolean z) {
            super(parcelFileDescriptor);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.l = atomicBoolean;
            this.k = j2;
            atomicBoolean.set(z);
        }
    }
}
