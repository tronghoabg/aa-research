package com.google.android.apps.auto.components.bugreport;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.BugreportManager;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.common.api.Status;
import com.google.android.projection.gearhead.R;
import defpackage.a$$ExternalSyntheticApiModelOutline2;
import defpackage.dsx;
import defpackage.ivr;
import defpackage.jbk;
import defpackage.jfj;
import defpackage.jrl;
import defpackage.jxe;
import defpackage.kgb;
import defpackage.kgc;
import defpackage.kge;
import defpackage.kgf;
import defpackage.kgi;
import defpackage.lbn;
import defpackage.mas;
import defpackage.mdd;
import defpackage.mki;
import defpackage.ols;
import defpackage.qrn;
import defpackage.qrz;
import defpackage.qsa;
import defpackage.qsz;
import defpackage.rbk;
import defpackage.rcy;
import defpackage.rdm;
import defpackage.rpz;
import defpackage.rrc;
import defpackage.tss;
import defpackage.vky;
import defpackage.wer;
import defpackage.wub;
import defpackage.ycm;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zgp;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final class BugreportRequester {
    public static BugreportRequester d;
    public final AtomicInteger g = new AtomicInteger();
    public final AtomicBoolean h = new AtomicBoolean();
    public static final yph a = yph.c("GH.BugreportRequester");
    public static final lbn b = new kgb();
    public static final ComponentName c = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.bugreport.BugreportRequester");
    static final Executor e = Executors.newSingleThreadExecutor();
    static final BiFunction f = new kgc(0);

    /* loaded from: classes2.dex */
    public static class BugreportProgressService extends Service {
        @Override // android.app.Service
        public final IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public final int onStartCommand(Intent intent, int i, int i2) {
            String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TITLE");
            int intExtra = intent.getIntExtra("EXTRA_NOTIFICATION_ID", 0);
            mas.c();
            dsx dsxVar = new dsx(this, "gearhead_surveys_and_feedback");
            dsxVar.n(R.drawable.gs_android_auto_vd_24);
            dsxVar.l();
            dsxVar.e(2, true);
            dsxVar.i(stringExtra);
            dsxVar.h(getString(R.string.bugreport_notification_generating_description));
            startForeground(intExtra, dsxVar.a(), 16);
            return 2;
        }

        @Override // android.app.Service
        public final void onTimeout(int i) {
            ((ype) ((ype) BugreportRequester.a.h()).ai((char) 3015)).u("Bugreport failed to generate in time");
            BugreportRequester.h(this, yzy.CJ);
            stopSelf();
        }
    }

    /* loaded from: classes2.dex */
    public static class RetrieveBugreportReceiver extends mdd {
        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("RetrieveBugreportReceiver");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra("EXTRA_BUGREPORT_SRC_FILE");
            String stringExtra2 = intent.getStringExtra("EXTRA_BUGREPORT_DST_FILE");
            File fileD = BugreportRequester.d(context);
            stringExtra2.getClass();
            File file = new File(fileD, stringExtra2);
            BugreportManager bugreportManagerM = a$$ExternalSyntheticApiModelOutline2.m(jfj.c(context).getSystemService(a$$ExternalSyntheticApiModelOutline2.m()));
            ((ype) ((ype) BugreportRequester.a.f()).ai(3018)).M("Copying bug report from %s to %s", stringExtra, stringExtra2);
            stringExtra.getClass();
            bugreportManagerM.retrieveBugreport(stringExtra, BugreportRequester.a(file), BugreportRequester.e, new kgf(context, intent, file));
            context.sendBroadcast(new Intent(context, (Class<?>) BugreportProjectionNotificationReceiver.class).setAction("CLOSE_NOTIFICATION"));
            BugreportRequester.h(context, yzy.CM);
        }
    }

    public BugreportRequester(Context context, jrl jrlVar) {
        wub.L(new jbk(context, jrlVar, 5, null));
    }

    public static ParcelFileDescriptor a(File file) {
        try {
            return ParcelFileDescriptor.open(file, 704643072);
        } catch (FileNotFoundException e2) {
            tss.r("GH.BugreportRequester", e2, "Couldn't create ParcelFileDescriptor for %s", file);
            throw new IllegalArgumentException(e2);
        }
    }

    public static BugreportRequester b() {
        BugreportRequester bugreportRequester = d;
        bugreportRequester.getClass();
        return bugreportRequester;
    }

    public static qsz c(Context context, Instant instant, boolean z) {
        AtomicReference atomicReference = new AtomicReference();
        qsz qszVar = (qsz) f.apply(context, new kge(atomicReference, z, context, instant));
        atomicReference.set(qszVar);
        return qszVar;
    }

    public static File d(Context context) {
        File file = new File(context.getCacheDir(), "bugreports");
        if (!file.exists() && !file.mkdirs()) {
            tss.q("GH.BugreportRequester", "Couldn't create directory %s", file);
        }
        return file;
    }

    static String e(String str, int i) {
        return str.length() <= i ? str : str.substring(str.length() - i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Context context, Instant instant, qrn qrnVar, boolean z) {
        rbk rbkVar;
        Status status;
        if (mki.a != null) {
            yfq yfqVarQ = yfq.q(CarDisplayId.a);
            try {
                yfqVarQ = (yfq) Collection.EL.stream(ols.p(qrnVar).a()).map(new jxe(20)).collect(ycm.a);
            } catch (qrz | qsa e2) {
                ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 3022)).u("Error getting car displays");
            }
            int size = yfqVarQ.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                CarDisplayId carDisplayId = (CarDisplayId) yfqVarQ.get(i);
                try {
                    rdm rdmVarD = ((qsz) qrnVar).d();
                    rbkVar = (rbk) ((zgp) rdmVarD.f.b(new rcy(rdmVarD, carDisplayId, 2))).get();
                    status = rbkVar.b;
                } catch (IllegalStateException | InterruptedException | ExecutionException | qrz e3) {
                    ((ype) ((ype) ((ype) a.h()).p(e3)).ai((char) 3032)).u("Failed to capture screenshot");
                }
                if (status.equals(Status.a)) {
                    Bitmap bitmapA = rbkVar.a();
                    if (z) {
                        File file = new File(d(context), kgi.g(kgi.c(instant), Integer.toString(carDisplayId.b)));
                        ((ype) a.l().ai((char) 3041)).y("Temporarily saving screenshot to %s", file.getAbsolutePath());
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                            try {
                                bitmapA.compress(Bitmap.CompressFormat.PNG, 0, bufferedOutputStream);
                                bufferedOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            ((ype) ((ype) ((ype) a.h()).p(e4)).ai((char) 3042)).u("Couldn't save screenshot");
                            bitmapA.recycle();
                        }
                    }
                    ivr.a(context, bitmapA);
                    bitmapA.recycle();
                } else {
                    ((ype) ((ype) a.h()).ai((char) 3031)).y("Failed to capture screenshot: %s", status);
                }
                if (!z2) {
                    h(context, yzy.Cz);
                    z2 = true;
                }
            }
        }
    }

    public static void g(Context context, String str) {
        wer.b();
        File[] fileArrListFiles = new File(context.getCacheDir(), "bugreports").listFiles();
        if (fileArrListFiles == null) {
            ((ype) ((ype) a.f()).ai((char) 3036)).u("No old files found");
            return;
        }
        try {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (name.startsWith(str)) {
                    Path path = FileRetargetClass.toPath(file);
                    long days = Duration.between(Instant.ofEpochMilli(Files.readAttributes(path, BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis()), Instant.now()).toDays();
                    yph yphVar = a;
                    ((ype) yphVar.l().ai(3033)).L("Found file %s which is %d days old", name, days);
                    if (days > 7) {
                        ((ype) ((ype) yphVar.f()).ai(3034)).K("Deleting old file %s which is older than %d days", name, 7);
                        Files.delete(path);
                    }
                }
            }
        } catch (IOException e2) {
            ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 3035)).u("Error deleting old files");
        }
    }

    public static void h(Context context, yzy yzyVar) {
        rpz.a(context).c(rrc.h(yxy.GEARHEAD, yzz.BUGREPORT, yzyVar).l());
    }
}
