package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ski {
    public static final /* synthetic */ int b = 0;
    private static final java.util.concurrent.ScheduledExecutorService c;
    private static final com.google.android.gms.common.api.Status d;
    public final defpackage.skd a = new defpackage.skd();

    static {
        defpackage.sqs sqsVar = defpackage.stp.a;
        c = defpackage.sqs.fD();
        d = new com.google.android.gms.common.api.Status(8, "Batch event failed.", null, null);
    }

    public final void a(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, defpackage.sjx sjxVar) {
        if (atomicBoolean.getAndSet(true)) {
            defpackage.skb.b().e(str, 1031);
            return;
        }
        java.util.concurrent.Future future = (java.util.concurrent.Future) atomicReference.get();
        if (future != null) {
            future.cancel(false);
        }
        b(sjxVar, str);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Queue] */
    public final void b(defpackage.sjx sjxVar, java.lang.String str) {
        while (true) {
            defpackage.skd skdVar = this.a;
            android.content.Context context = sjxVar.b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            long jD = defpackage.addn.a.fF().d(context);
            synchronized (skdVar.a) {
                ?? r5 = skdVar.d;
                if (r5.isEmpty()) {
                    long length = 0;
                    while (true) {
                        ?? r9 = skdVar.c;
                        if (!r9.isEmpty()) {
                            byte[] bArr = ((defpackage.skf) r9.element()).a.b;
                            if (bArr != null) {
                                length += (long) bArr.length;
                                if (!arrayList.isEmpty() && length > jD) {
                                    break;
                                } else {
                                    arrayList.add((defpackage.skf) r9.remove());
                                }
                            } else {
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                                arrayList.add((defpackage.skf) r9.remove());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        skdVar.b = false;
                    }
                } else {
                    defpackage.skf skfVarA = (defpackage.skf) r5.remove();
                    if (r5.isEmpty()) {
                        defpackage.ske skeVar = new defpackage.ske(skfVarA);
                        skeVar.b(true);
                        skfVarA = skeVar.a();
                    }
                    arrayList.add(skfVarA);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (((defpackage.skf) arrayList.get(0)).d) {
                defpackage.skb.b().e(((defpackage.skf) arrayList.get(0)).a.a.f, 1034);
            } else {
                defpackage.skb.b().e(str, 1026);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    defpackage.skb.b().e(((defpackage.skf) it.next()).a.a.f, 1027);
                }
            }
            defpackage.skg skgVar = new defpackage.skg(this, arrayList, str, sjxVar);
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(arrayList).map(new defpackage.mmf(13));
            int i = defpackage.ygw.d;
            defpackage.ygw ygwVar = (defpackage.ygw) map.collect(defpackage.yds.a);
            com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelableA = defpackage.skb.b().a();
            com.google.android.gms.clearcut.BatchedLogEventParcelable batchedLogEventParcelable = new com.google.android.gms.clearcut.BatchedLogEventParcelable(ygwVar, batchedLogErrorParcelableA);
            int i2 = 9;
            try {
                defpackage.ska skaVar = (defpackage.ska) sjxVar.v();
                android.os.Parcel parcelFp = skaVar.fp();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcelFp.writeStrongBinder(skgVar);
                defpackage.ijx.g(parcelFp, batchedLogEventParcelable);
                skaVar.fs(9, parcelFp);
                skgVar.e.c(skgVar.a, skgVar.b, skgVar.c, skgVar.d);
                return;
            } catch (java.lang.Throwable th) {
                if (((defpackage.skf) arrayList.get(0)).d) {
                    java.lang.String str2 = ((defpackage.skf) arrayList.get(0)).a.a.f;
                    defpackage.skb.b().e(str2, 1036);
                    if (th instanceof android.os.TransactionTooLargeException) {
                        android.util.Log.e("BatchingLogger", "Failed retry call to logBatchedEvents with TransactionTooLargeException", th);
                        defpackage.skb.b().e(str2, 1037);
                    } else if (th instanceof android.os.DeadObjectException) {
                        android.util.Log.e("BatchingLogger", "Failed retry call to logBatchedEvents with DeadObjectException", th);
                        defpackage.skb.b().e(str2, 1042);
                    } else {
                        android.util.Log.e("BatchingLogger", "Failed retry call to logBatchedEvents", th);
                    }
                } else {
                    defpackage.skb.b().e(str, 1032);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed call to logBatchedEvents");
                    if (arrayList.size() == 1) {
                        sb.append(", single event");
                        defpackage.skb.b().e(str, 1043);
                    }
                    if (th instanceof android.os.TransactionTooLargeException) {
                        sb.append(", TransactionTooLargeException");
                        defpackage.skb.b().e(str, 1033);
                    } else if (th instanceof android.os.DeadObjectException) {
                        sb.append(", DeadObjectException");
                        defpackage.skb.b().e(str, 1041);
                    }
                    android.util.Log.e("BatchingLogger", sb.toString(), th);
                }
                java.util.List list = batchedLogErrorParcelableA.a;
                if (list != null) {
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        defpackage.skb.b().c((com.google.android.gms.clearcut.internal.LogErrorParcelable) it2.next());
                    }
                }
                if (arrayList.size() > 1) {
                    defpackage.skd skdVar2 = this.a;
                    defpackage.ygw ygwVar2 = (defpackage.ygw) j$.util.Collection.-EL.stream(arrayList).map(new defpackage.rix(i2)).collect(defpackage.yds.a);
                    synchronized (skdVar2.a) {
                        skdVar2.d.addAll(ygwVar2);
                        skdVar2.b = true;
                    }
                } else {
                    defpackage.skf skfVar = (defpackage.skf) arrayList.get(0);
                    a$.ExternalSyntheticApiModelOutline2.m(skfVar.c, d);
                    if (!skfVar.d || skfVar.e) {
                        try {
                            defpackage.sjz skhVar = new skh(this, str, sjxVar);
                            ((defpackage.ska) sjxVar.v()).e(skhVar, defpackage.skb.b().a());
                            ((skh) skhVar).e.c(((skh) skhVar).a, ((skh) skhVar).b, ((skh) skhVar).c, ((skh) skhVar).d);
                            return;
                        } catch (java.lang.Throwable th2) {
                            android.util.Log.e("BatchingLogger", "Failed to deliver funnel logs in separate logError IPC.", th2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void c(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, defpackage.sjx sjxVar) {
        if (atomicBoolean.get()) {
            return;
        }
        java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = c.schedule(new defpackage.inw(this, atomicBoolean, str, sjxVar, 3), defpackage.addn.a.fF().a(sjxVar.b), java.util.concurrent.TimeUnit.MILLISECONDS);
        if (atomicReference.getAndSet(scheduledFutureSchedule) != null) {
            throw new java.lang.IllegalStateException("Timeout should only be started once.");
        }
        if (atomicBoolean.get()) {
            scheduledFutureSchedule.cancel(false);
        }
    }
}
