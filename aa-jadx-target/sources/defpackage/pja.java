package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pja extends defpackage.piz {
    private static final defpackage.ypg c = defpackage.ypg.c("com/google/android/apps/common/testing/performance/InAppPerformanceLogger");
    private final java.util.List d;
    private final java.util.concurrent.atomic.AtomicBoolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pja(android.content.ContentResolver contentResolver, java.lang.String str) {
        super(contentResolver, java.lang.String.format("%s.ANNOTATED_PB", str));
        contentResolver.getClass();
        this.d = new java.util.ArrayList();
        this.e = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public final synchronized void a(defpackage.npc npcVar, long j) {
        for (android.util.Pair pair : this.d) {
            npcVar.d((java.lang.String) pair.first, (java.lang.String) pair.second);
        }
        try {
            defpackage.acaq acaqVarA = npcVar.a(j);
            defpackage.fdd fddVar = defpackage.fdd.OUTPUT;
            java.lang.String str = this.b;
            int i = defpackage.fde.a;
            android.net.Uri.Builder builderScheme = new android.net.Uri.Builder().scheme("content");
            java.lang.String str2 = fddVar.e;
            android.net.Uri uriBuild = builderScheme.authority(str2).path(str).build();
            android.content.ContentProviderClient contentProviderClientAcquireContentProviderClient = this.a.acquireContentProviderClient(uriBuild);
            if (contentProviderClientAcquireContentProviderClient == null) {
                throw new java.lang.IllegalStateException(defpackage.a.bp(str2, "Content provider for ", " not found. Make sure //third_party/android/androidx_test/services:test_services is installed."));
            }
            try {
                android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
                android.os.StrictMode.setThreadPolicy(ep$.ExternalSyntheticApiModelOutline1.m(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy)).build());
                try {
                    try {
                        android.os.ParcelFileDescriptor parcelFileDescriptorOpenFile = contentProviderClientAcquireContentProviderClient.openFile(uriBuild, this.e.getAndSet(false) ? "wt" : "wa");
                        if (parcelFileDescriptorOpenFile == null) {
                            throw null;
                        }
                        android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorOpenFile);
                        try {
                            defpackage.abor aborVarN = defpackage.acap.a.n();
                            aborVarN.t();
                            defpackage.acap acapVar = (defpackage.acap) aborVarN.b;
                            acaqVarA.getClass();
                            defpackage.abpj abpjVar = acapVar.b;
                            if (!abpjVar.c()) {
                                int size = abpjVar.size();
                                acapVar.b = abpjVar.d(size + size);
                            }
                            acapVar.b.add(acaqVarA);
                            ((defpackage.acap) aborVarN.q()).g(autoCloseOutputStream);
                            autoCloseOutputStream.close();
                            android.os.StrictMode.setThreadPolicy(threadPolicy);
                            contentProviderClientAcquireContentProviderClient.release();
                        } catch (java.lang.Throwable th) {
                            try {
                                autoCloseOutputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        android.os.StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                } catch (android.os.RemoteException | java.io.FileNotFoundException e) {
                    throw new java.lang.RuntimeException(defpackage.a.bX(uriBuild, "Unable to access content provider: "), e);
                }
            } catch (java.lang.Throwable th4) {
                contentProviderClientAcquireContentProviderClient.release();
                throw th4;
            }
        } catch (java.io.IOException e2) {
            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) c.g()).p(e2)).ai((char) 6755)).u("Unable to add entries to Output stream.");
        }
    }
}
