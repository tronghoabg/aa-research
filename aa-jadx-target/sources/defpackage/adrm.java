package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adrm implements android.content.ServiceConnection, adpq {
    private static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.adrm.class.getName());
    public final android.content.Intent a;
    public final android.os.UserHandle b;
    private final int d;
    private final java.util.concurrent.Executor e;
    private android.content.Context f;
    private int g;
    private int h;
    private final defpackage.adps i;

    public adrm(java.util.concurrent.Executor executor, android.content.Context context, android.content.Intent intent, android.os.UserHandle userHandle, defpackage.adps adpsVar) {
        synchronized (this) {
            this.a = intent;
            this.d = 1;
            this.i = adpsVar;
            this.f = context;
            this.e = executor;
            this.b = userHandle;
            this.g = 1;
            this.h = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x002f A[Catch: RuntimeException -> 0x0096, SecurityException -> 0x00b1, all -> 0x00f8, TRY_LEAVE, TryCatch #6 {all -> 0x00f8, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x0015, B:14:0x0021, B:20:0x002f), top: B:68:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043 A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fc, TryCatch #8 {all -> 0x00fc, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fa, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fc, TryCatch #8 {all -> 0x00fc, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fa, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0053 A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fc, TryCatch #8 {all -> 0x00fc, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fa, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0058 A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fc, TryCatch #8 {all -> 0x00fc, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fa, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fc, TryCatch #8 {all -> 0x00fc, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fa, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fc, TryCatch #8 {all -> 0x00fc, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fa, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006c A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fc, PHI: r6
  0x006c: PHI (r6v16 'this' adrm) = (r6v15 'this' adrm), (r6v20 'this' adrm) binds: [B:30:0x0067, B:19:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {all -> 0x00fc, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fa, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #8 {all -> 0x00fc, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fa, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x006c, please report this as an issue */
    public final synchronized void a() throws java.lang.Throwable {
        defpackage.ador adorVarE;
        defpackage.adrl adrlVar;
        int iOrdinal;
        boolean zBindService;
        android.app.admin.DevicePolicyManager devicePolicyManager;
        try {
            try {
                if (this.g == 1) {
                    this.g = 2;
                    android.content.Context context = this.f;
                    android.content.Intent intent = this.a;
                    int i = this.d;
                    android.os.UserHandle userHandle = this.b;
                    defpackage.adrl adrlVar2 = defpackage.adrl.BIND_SERVICE;
                    if (userHandle != null) {
                        try {
                            adrlVar2 = defpackage.adrl.BIND_SERVICE_AS_USER;
                            adrlVar = adrlVar2;
                            try {
                                iOrdinal = adrlVar.ordinal();
                                try {
                                    if (iOrdinal != 0) {
                                        this = this;
                                        zBindService = context.bindService(intent, this, i);
                                    } else if (iOrdinal != 1) {
                                        this = this;
                                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                                            zBindService = bgp$.ExternalSyntheticApiModelOutline0.m(context, intent, this, i, userHandle);
                                        } else {
                                            adorVarE = defpackage.ador.l.e("Cross user Channel requires Android R+");
                                        }
                                    } else if (iOrdinal != 2) {
                                        this = this;
                                        adorVarE = defpackage.ador.k.e(adrlVar.d + "(" + java.lang.String.valueOf(intent) + ") returned false");
                                    } else {
                                        devicePolicyManager = (android.app.admin.DevicePolicyManager) context.getSystemService("device_policy");
                                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                                            this = this;
                                            zBindService = a$.ExternalSyntheticApiModelOutline1.m(devicePolicyManager, (android.content.ComponentName) null, intent, this, i, userHandle);
                                        } else {
                                            this = this;
                                            adorVarE = defpackage.ador.l.e("Device policy admin binding requires Android R+");
                                        }
                                    }
                                    if (zBindService) {
                                        adorVarE = defpackage.ador.b;
                                    } else {
                                        adorVarE = defpackage.ador.k.e(adrlVar.d + "(" + java.lang.String.valueOf(intent) + ") returned false");
                                    }
                                } catch (java.lang.SecurityException e) {
                                    e = e;
                                    adrlVar2 = adrlVar;
                                    adorVarE = defpackage.ador.g.d(e).e("SecurityException from ".concat(java.lang.String.valueOf(adrlVar2.d)));
                                } catch (java.lang.RuntimeException e2) {
                                    e = e2;
                                    adrlVar2 = adrlVar;
                                    adorVarE = defpackage.ador.l.d(e).e("RuntimeException from ".concat(java.lang.String.valueOf(adrlVar2.d)));
                                }
                            } catch (java.lang.SecurityException e3) {
                                e = e3;
                            } catch (java.lang.RuntimeException e4) {
                                e = e4;
                            }
                        } catch (java.lang.SecurityException e5) {
                            e = e5;
                            adorVarE = defpackage.ador.g.d(e).e("SecurityException from ".concat(java.lang.String.valueOf(adrlVar2.d)));
                            if (!adorVarE.g()) {
                                try {
                                    this.f.unbindService(this);
                                } catch (java.lang.RuntimeException e6) {
                                    c.logp(java.util.logging.Level.FINE, "io.grpc.binder.internal.ServiceBinding", "handleBindServiceFailure", "Could not clean up after bindService() failure.", (java.lang.Throwable) e6);
                                }
                                this.g = 4;
                                this.e.execute(new defpackage.aafx(this, adorVarE, 4));
                                return;
                            }
                        } catch (java.lang.RuntimeException e7) {
                            e = e7;
                            adorVarE = defpackage.ador.l.d(e).e("RuntimeException from ".concat(java.lang.String.valueOf(adrlVar2.d)));
                            if (!adorVarE.g()) {
                                this.f.unbindService(this);
                                this.g = 4;
                                this.e.execute(new defpackage.aafx(this, adorVarE, 4));
                                return;
                            }
                        }
                    } else {
                        adrlVar = adrlVar2;
                        iOrdinal = adrlVar.ordinal();
                        if (iOrdinal != 0) {
                            this = this;
                            zBindService = context.bindService(intent, this, i);
                        } else if (iOrdinal != 1) {
                            this = this;
                            if (android.os.Build.VERSION.SDK_INT >= 30) {
                                zBindService = bgp$.ExternalSyntheticApiModelOutline0.m(context, intent, this, i, userHandle);
                            } else {
                                adorVarE = defpackage.ador.l.e("Cross user Channel requires Android R+");
                            }
                        } else if (iOrdinal != 2) {
                            this = this;
                            adorVarE = defpackage.ador.k.e(adrlVar.d + "(" + java.lang.String.valueOf(intent) + ") returned false");
                        } else {
                            devicePolicyManager = (android.app.admin.DevicePolicyManager) context.getSystemService("device_policy");
                            if (android.os.Build.VERSION.SDK_INT >= 30) {
                                this = this;
                                zBindService = a$.ExternalSyntheticApiModelOutline1.m(devicePolicyManager, (android.content.ComponentName) null, intent, this, i, userHandle);
                            } else {
                                this = this;
                                adorVarE = defpackage.ador.l.e("Device policy admin binding requires Android R+");
                            }
                        }
                        if (zBindService) {
                            adorVarE = defpackage.ador.b;
                        } else {
                            adorVarE = defpackage.ador.k.e(adrlVar.d + "(" + java.lang.String.valueOf(intent) + ") returned false");
                        }
                    }
                    if (!adorVarE.g()) {
                        this.f.unbindService(this);
                        this.g = 4;
                        this.e.execute(new defpackage.aafx(this, adorVarE, 4));
                        return;
                    }
                } else {
                    this = this;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                this = this;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void b(defpackage.ador adorVar) {
        java.util.logging.Logger logger = c;
        logger.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", adorVar);
        this.f = null;
        if (this.h != 4) {
            this.h = 4;
            logger.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.i.n(adorVar);
        }
    }

    final void c(defpackage.ador adorVar) {
        android.content.Context context;
        synchronized (this) {
            int i = this.g;
            context = (i == 2 || i == 3) ? this.f : null;
            this.g = 4;
        }
        this.e.execute(new defpackage.aafx(this, adorVar, 5));
        if (context != null) {
            context.unbindService(this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ados */
    public final android.content.Context d() throws ados {
        defpackage.ysr.bk(this.f != null, "Already unbound!");
        try {
            android.os.UserHandle userHandle = this.b;
            android.content.Context context = this.f;
            return userHandle == null ? context : defpackage.adrq.p(context, userHandle);
        } catch (java.lang.ReflectiveOperationException unused) {
            throw new ados(defpackage.ador.l.e("Cross-user pre-auth requires SDK_INT >= R and @SystemApi visibility"));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        c(defpackage.ador.m.e("Remote Service component " + componentName.getClassName() + " was disabled, or its package " + componentName.getPackageName() + " was disabled, force-stopped, replaced or uninstalled (onBindingDied)."));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        android.content.Intent intent = this.a;
        c(defpackage.ador.k.e("Remote Service returned null from onBind() for " + java.lang.String.valueOf(intent) + " (onNullBinding): " + java.lang.String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.g == 2) {
                this.g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.h == 1) {
            this.h = 3;
            c.logp(java.util.logging.Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.i.l(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        c(defpackage.ador.m.e("Server process crashed, exited or was killed (onServiceDisconnected): ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName)))));
    }
}
