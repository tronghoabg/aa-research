package com.google.android.gms.carsetup.setup;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class UsbConnectionHelper {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.SETUP");
    public static final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final defpackage.sgc c;
    public final java.lang.Object d = new java.lang.Object();
    public defpackage.sts e;

    public UsbConnectionHelper(defpackage.sgc sgcVar) {
        this.c = sgcVar;
    }

    public final void a(android.content.Context context, android.hardware.usb.UsbAccessory usbAccessory, boolean z, boolean z2, shf shfVar) {
        defpackage.zak zakVar;
        android.os.ParcelFileDescriptor parcelFileDescriptor;
        java.lang.String str;
        boolean z3;
        android.os.ParcelFileDescriptor parcelFileDescriptorOpenAccessory;
        defpackage.rit ritVar = defpackage.rit.INSTANCE;
        if (defpackage.duw.c(context, "android.permission.MANAGE_USB") != 0) {
            this.c.c(defpackage.zaj.NO_MANAGE_USB_PERMISSION_ERROR, defpackage.zak.UNKNOWN_DETAIL, "Do not have permission android.permission.MANAGE_USB.");
            shfVar.a((android.os.ParcelFileDescriptor) null);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31 && !(defpackage.duw.c(context, "android.permission.BLUETOOTH_CONNECT") == 0 && defpackage.duw.c(context, "android.permission.BLUETOOTH_SCAN") == 0)) {
            this.c.c(defpackage.zaj.NO_NEARBY_DEVICES_PERMISSION_ERROR, defpackage.zak.UNKNOWN_DETAIL, "Nearby devices permission is not granted.");
            shfVar.a((android.os.ParcelFileDescriptor) null);
            return;
        }
        android.hardware.usb.UsbManager usbManager = (android.hardware.usb.UsbManager) context.getSystemService("usb");
        if (usbManager == null) {
            this.c.c(defpackage.zaj.USB_ACCESSORY_ERROR, defpackage.zak.UNKNOWN_DETAIL, "Could not create UsbManager.");
            shfVar.a((android.os.ParcelFileDescriptor) null);
            return;
        }
        android.hardware.usb.UsbAccessory[] accessoryList = usbManager.getAccessoryList();
        if (defpackage.rlw.n()) {
            accessoryList = (android.hardware.usb.UsbAccessory[]) defpackage.rlw.m().b(defpackage.pbp.LIST_USB_ACCESSORIES, new pda(accessoryList, 5));
        }
        if (accessoryList == null || accessoryList.length == 0) {
            zakVar = defpackage.zak.EMPTY_USB_ACCESSORY_LIST;
            parcelFileDescriptor = null;
            str = "No device currently connected ";
            z3 = true;
        } else if (usbManager.hasPermission(usbAccessory)) {
            z3 = false;
            try {
                parcelFileDescriptorOpenAccessory = usbManager.openAccessory(usbAccessory);
                try {
                    if (parcelFileDescriptorOpenAccessory != null) {
                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                            java.util.List list = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.a;
                            com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.i = android.os.SystemClock.elapsedRealtime();
                            java.util.List list2 = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.a;
                            synchronized (list2) {
                                if (!list2.isEmpty()) {
                                    a.f().ai(8934).y("Closing %s FDs due to new connection", new defpackage.vqo(list2.size()));
                                }
                            }
                            try {
                                com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.b();
                            } catch (java.io.IOException e) {
                                a.g().p(e).ai(8933).u("Failed to close all previous FDs");
                                android.content.Context context2 = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.h;
                                context2.getClass();
                                defpackage.omv.i(context2, defpackage.yyn.USB_FD_PREV_FD_CLOSE_FAILED);
                            }
                            parcelFileDescriptorOpenAccessory = com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor.a(parcelFileDescriptorOpenAccessory);
                        }
                        str = null;
                        parcelFileDescriptor = parcelFileDescriptorOpenAccessory;
                        zakVar = null;
                    } else if (b.get()) {
                        a.h().ai(8938).y("Ignoring a potentially spurious intent to attach to: %s", usbAccessory);
                        this.c.d(defpackage.zaj.USB_ACCESSORY_ERROR, defpackage.zak.SPURIOUS_USB_ACCESSORY_EVENT, "Failed to open already open USB accessory.");
                        shfVar.a((android.os.ParcelFileDescriptor) null);
                        return;
                    } else {
                        str = "Failed to open accessory ";
                        zakVar = defpackage.zak.NO_ACCESSORY_FD;
                        parcelFileDescriptor = parcelFileDescriptorOpenAccessory;
                    }
                } catch (java.lang.IllegalArgumentException e2) {
                    e = e2;
                    a.g().p(e).ai(8937).u("Error opening accessory");
                    str = "Invalid argument passed in openAccessory ";
                    parcelFileDescriptor = parcelFileDescriptorOpenAccessory;
                    zakVar = defpackage.zak.INVALID_ACCESSORY;
                }
            } catch (java.lang.IllegalArgumentException e3) {
                e = e3;
                parcelFileDescriptorOpenAccessory = null;
            }
        } else {
            zakVar = defpackage.zak.NO_ACCESSORY_PERMISSION;
            str = "No permission for accessory ";
            z3 = !z2;
            parcelFileDescriptor = null;
        }
        if (zakVar == null) {
            a.l().ai(8935).y("Got USB accessory fd: %s", parcelFileDescriptor);
            b.set(true);
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
            synchronized (this.d) {
                she sheVar = new she(this);
                this.e = sheVar;
                defpackage.duw.e(context, sheVar, intentFilter, null, 2);
            }
            shfVar.a(parcelFileDescriptor);
            return;
        }
        if (z) {
            a.f().ai(8936).y("%s, retrying", str);
            defpackage.rbz.i(new jlr(this, context, usbAccessory, z2, shfVar, 4), 500L);
            return;
        }
        defpackage.sgc sgcVar = this.c;
        if (z3) {
            sgcVar.d(defpackage.zaj.USB_ACCESSORY_ERROR, zakVar, java.lang.String.valueOf(str).concat(usbAccessory.toString()));
        } else {
            sgcVar.c(defpackage.zaj.USB_ACCESSORY_ERROR, zakVar, java.lang.String.valueOf(str).concat(usbAccessory.toString()));
        }
        shfVar.a((android.os.ParcelFileDescriptor) null);
    }

    public static class TrackedParcelFileDescriptor extends android.os.ParcelFileDescriptor {
        public static defpackage.shi e;
        public static android.os.HandlerThread f;
        public static android.os.Handler g;
        public static android.content.Context h;
        public static long i;
        final long k;
        public final java.util.concurrent.atomic.AtomicBoolean l;
        public static final java.util.List a = j$.util.DesugarCollections.synchronizedList(new java.util.ArrayList());
        public static final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);
        public static final java.util.concurrent.atomic.AtomicInteger c = new java.util.concurrent.atomic.AtomicInteger(0);
        public static final java.lang.Object d = new java.lang.Object();
        private static final java.util.concurrent.atomic.AtomicInteger m = new java.util.concurrent.atomic.AtomicInteger(0);
        public static final defpackage.xzi j = new defpackage.riu(7);
        public static final android.os.Parcelable.Creator<com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor> CREATOR = new defpackage.rcy(13);

        private TrackedParcelFileDescriptor(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            this(parcelFileDescriptor, (((long) android.system.Os.getpid()) << 32) | ((long) m.getAndIncrement()), false);
        }

        public static com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor a(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            if (parcelFileDescriptor == null) {
                return null;
            }
            if (parcelFileDescriptor instanceof com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor) {
                return (com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor) parcelFileDescriptor;
            }
            android.content.Context context = h;
            context.getClass();
            defpackage.omv.i(context, defpackage.yyn.USB_FD_TRACKING_STARTED);
            com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor trackedParcelFileDescriptor = new com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor(parcelFileDescriptor);
            a.add(trackedParcelFileDescriptor);
            return trackedParcelFileDescriptor;
        }

        public static void b() throws java.io.IOException {
            java.util.List list = a;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor trackedParcelFileDescriptor = (com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor) it.next();
                    if (trackedParcelFileDescriptor != null) {
                        trackedParcelFileDescriptor.e();
                    }
                    it.remove();
                }
            }
        }

        public static void c(android.content.Context context) {
            if (h == null) {
                h = context.getApplicationContext();
            }
        }

        public static defpackage.shg d(android.content.Context context) {
            defpackage.shg shgVar;
            synchronized (d) {
                if (f == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("DisconnectMonitor");
                    f = handlerThread;
                    handlerThread.start();
                    g = new defpackage.stq(f.getLooper());
                }
                android.content.Context applicationContext = context.getApplicationContext();
                if (b.getAndIncrement() == 0) {
                    defpackage.shi shiVar = new defpackage.shi();
                    e = shiVar;
                    android.os.Handler handler = g;
                    handler.getClass();
                    handler.post(new defpackage.kfq(applicationContext, shiVar, 10, (byte[]) null));
                }
                shgVar = new defpackage.shg(new java.util.concurrent.atomic.AtomicBoolean(false), applicationContext);
            }
            return shgVar;
        }

        private final void e() throws java.io.IOException {
            if (this.l.compareAndSet(false, true)) {
                android.content.Context context = h;
                context.getClass();
                defpackage.omv.i(context, defpackage.yyn.USB_FD_CLOSED);
                super.close();
            }
        }

        @Override // android.os.ParcelFileDescriptor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            if (defpackage.rlw.n() && ((java.lang.Boolean) defpackage.rlw.m().b(defpackage.pbp.USB_FD_CLOSE, new shh(0))).booleanValue()) {
                com.google.android.gms.carsetup.setup.UsbConnectionHelper.a.f().ai(8932).u("Failed to close file descriptor due to FAIL_CLOSE_USB_FD");
                return;
            }
            e();
            java.util.List list = a;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor trackedParcelFileDescriptor = (com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor) it.next();
                    if (trackedParcelFileDescriptor.k == this.k) {
                        trackedParcelFileDescriptor.e();
                        it.remove();
                    }
                }
            }
        }

        @Override // android.os.ParcelFileDescriptor
        public final android.os.ParcelFileDescriptor dup() throws java.io.IOException {
            h.getClass();
            com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor trackedParcelFileDescriptor = new com.google.android.gms.carsetup.setup.UsbConnectionHelper.TrackedParcelFileDescriptor(super.dup());
            a.add(trackedParcelFileDescriptor);
            defpackage.omv.i(h, defpackage.yyn.USB_FD_DUP);
            return trackedParcelFileDescriptor;
        }

        @Override // android.os.ParcelFileDescriptor, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.k);
            parcel.writeInt(this.l.get() ? 1 : 0);
        }

        public TrackedParcelFileDescriptor(android.os.ParcelFileDescriptor parcelFileDescriptor, long j2, boolean z) {
            super(parcelFileDescriptor);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            this.l = atomicBoolean;
            this.k = j2;
            atomicBoolean.set(z);
        }
    }
}
