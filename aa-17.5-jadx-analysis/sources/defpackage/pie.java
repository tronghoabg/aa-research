package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class pie extends pid {
    private static final yob c = yob.c("com/google/android/apps/common/testing/performance/InAppPerformanceLogger");
    private final List d;
    private final AtomicBoolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pie(ContentResolver contentResolver, String str) {
        super(contentResolver, String.format("%s.ANNOTATED_PB", str));
        contentResolver.getClass();
        this.d = new ArrayList();
        this.e = new AtomicBoolean(true);
    }

    public final synchronized void a(nsy nsyVar, long j) {
        for (Pair pair : this.d) {
            nsyVar.f((String) pair.first, (String) pair.second);
        }
        try {
            abzn abznVarC = nsyVar.c(j);
            fcw fcwVar = fcw.OUTPUT;
            String str = this.b;
            int i = fcx.a;
            Uri.Builder builderScheme = new Uri.Builder().scheme("content");
            String str2 = fcwVar.e;
            Uri uriBuild = builderScheme.authority(str2).path(str).build();
            ContentProviderClient contentProviderClientAcquireContentProviderClient = this.a.acquireContentProviderClient(uriBuild);
            if (contentProviderClientAcquireContentProviderClient == null) {
                throw new IllegalStateException(a.bq(str2, "Content provider for ", " not found. Make sure //third_party/android/androidx_test/services:test_services is installed."));
            }
            try {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
                try {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFile = contentProviderClientAcquireContentProviderClient.openFile(uriBuild, this.e.getAndSet(false) ? "wt" : "wa");
                        if (parcelFileDescriptorOpenFile == null) {
                            throw null;
                        }
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorOpenFile);
                        try {
                            abnp abnpVarN = abzm.a.n();
                            abnpVarN.t();
                            abzm abzmVar = (abzm) abnpVarN.b;
                            abznVarC.getClass();
                            aboh abohVar = abzmVar.b;
                            if (!abohVar.c()) {
                                int size = abohVar.size();
                                abzmVar.b = abohVar.d(size + size);
                            }
                            abzmVar.b.add(abznVarC);
                            ((abzm) abnpVarN.q()).g(autoCloseOutputStream);
                            autoCloseOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                autoCloseOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (RemoteException | FileNotFoundException e) {
                    throw new RuntimeException(a.bY(uriBuild, "Unable to access content provider: "), e);
                }
            } finally {
                contentProviderClientAcquireContentProviderClient.release();
            }
        } catch (IOException e2) {
            ((ynz) ((ynz) ((ynz) c.g()).p(e2)).ai((char) 6729)).u("Unable to add entries to Output stream.");
        }
    }
}
