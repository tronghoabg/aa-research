package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import androidx.compose.material3.internal.CalendarModelKt;
import com.google.d.d.bn;
import com.google.d.m.a.bm;
import com.google.d.m.a.bo;
import com.google.v.de;
import com.google.v.fi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6116a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6117b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Context f6118c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.d.b.aj f6119d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.d.b.aj f6120e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.d.b.aj f6121f = com.google.d.b.an.a(new com.google.android.libraries.phenotype.client.e(this, 6));

    /* renamed from: g, reason: collision with root package name */
    private final com.google.d.b.aj f6122g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.d.b.aj f6123h;

    /* renamed from: i, reason: collision with root package name */
    private volatile com.google.android.libraries.phenotype.client.b.n f6124i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.d.b.aj f6125j;

    /* renamed from: k, reason: collision with root package name */
    private volatile com.google.android.libraries.phenotype.client.b.q f6126k;

    public bh(Context context, com.google.d.b.aj ajVar, com.google.d.b.aj ajVar2) {
        this.f6118c = context;
        this.f6120e = ajVar;
        this.f6119d = ajVar2;
        this.f6123h = k(context, "storage-info.pb");
        this.f6125j = k(com.google.android.libraries.a.c.a(context), "device-encrypted-storage-info.pb");
        this.f6122g = com.google.d.b.an.a(new com.google.android.libraries.phenotype.client.e(ajVar, 7));
    }

    public static /* synthetic */ bm b(bh bhVar) {
        bo boVar = (bo) bhVar.f6120e.get2();
        com.google.d.b.an.B(boVar);
        com.bumptech.glide.load.c.e.e eVar = (com.bumptech.glide.load.c.e.e) bhVar.f6119d.get2();
        com.google.d.b.an.B(eVar);
        com.google.d.m.a.be beVarA = com.google.d.m.a.be.z(eVar.g()).y(com.google.android.libraries.phenotype.client.a.m.class, new l(3), boVar).A(new ac(bhVar, 4), boVar);
        beVarA.addListener(new android.support.v7.app.p(beVarA, 1), boVar);
        return beVarA;
    }

    public static /* synthetic */ void f(bh bhVar, com.google.android.libraries.phenotype.client.b.u uVar) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                synchronized (f6116a) {
                    l((String) bhVar.f6123h.get2(), uVar.getCredentialEncryptedStorageInfo(), "ce-tmp");
                    bhVar.f6124i = uVar.getCredentialEncryptedStorageInfo();
                }
                synchronized (f6117b) {
                    l((String) bhVar.f6125j.get2(), uVar.getDeviceEncryptedStorageInfo(), "de-tmp");
                    bhVar.f6126k = uVar.getDeviceEncryptedStorageInfo();
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    private final com.google.android.libraries.phenotype.client.b.n i() {
        com.google.android.libraries.phenotype.client.b.n defaultInstance;
        com.google.android.libraries.phenotype.client.b.n defaultInstance2;
        com.google.android.libraries.phenotype.client.b.n nVar = this.f6124i;
        if (nVar != null) {
            return nVar;
        }
        synchronized (f6116a) {
            defaultInstance = this.f6124i;
            if (defaultInstance == null) {
                if (com.google.android.libraries.a.c.f(this.f6118c)) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream((String) this.f6123h.get2());
                            try {
                                defaultInstance2 = com.google.android.libraries.phenotype.client.b.n.parseFrom(fileInputStream, de.a());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException | IllegalStateException unused) {
                            defaultInstance2 = com.google.android.libraries.phenotype.client.b.n.getDefaultInstance();
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        defaultInstance = defaultInstance2;
                        this.f6124i = defaultInstance;
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th3;
                    }
                } else {
                    defaultInstance = com.google.android.libraries.phenotype.client.b.n.getDefaultInstance();
                }
            }
        }
        return defaultInstance;
    }

    private final com.google.android.libraries.phenotype.client.b.q j() {
        com.google.android.libraries.phenotype.client.b.q qVar;
        com.google.android.libraries.phenotype.client.b.q defaultInstance;
        FileInputStream fileInputStream;
        com.google.android.libraries.phenotype.client.b.q qVar2 = this.f6126k;
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (f6117b) {
            qVar = this.f6126k;
            if (qVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        fileInputStream = new FileInputStream((String) this.f6125j.get2());
                    } catch (IOException | IllegalStateException unused) {
                        defaultInstance = com.google.android.libraries.phenotype.client.b.q.getDefaultInstance();
                    }
                    try {
                        defaultInstance = com.google.android.libraries.phenotype.client.b.q.parseFrom(fileInputStream, de.a());
                        fileInputStream.close();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        qVar = defaultInstance;
                        this.f6126k = qVar;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th3;
                }
            }
        }
        return qVar;
    }

    private static com.google.d.b.aj k(Context context, String str) {
        return com.google.d.b.an.a(new bf(context, str, 0));
    }

    private static void l(String str, fi fiVar, String str2) throws IOException {
        File file = new File(str);
        com.google.d.f.c.a.g(file);
        File fileCreateTempFile = File.createTempFile(str2, ".pb", file.getParentFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                fiVar.writeTo(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException(String.valueOf(fileCreateTempFile) + " could not be renamed to " + file.toString());
            } finally {
            }
        } catch (IOException e2) {
            fileCreateTempFile.delete();
            throw e2;
        }
    }

    public final as a(boolean z) {
        boolean shouldUseSharedStorage;
        bn bnVarN;
        com.google.v.v secret;
        String dirPath;
        bn bnVarN2;
        bn bnVarN3;
        boolean zHasSecret;
        boolean allowEmptySnapshotToken;
        boolean enableCommitV2Api;
        com.google.android.libraries.phenotype.client.b.l clientFlags;
        String dataDirectory = "";
        if (z) {
            com.google.android.libraries.phenotype.client.b.q qVarJ = j();
            shouldUseSharedStorage = qVarJ.getShouldUseSharedStorage();
            bnVarN = bn.n(qVarJ.getEnabledBackingsList());
            secret = qVarJ.getSecret();
            dirPath = qVarJ.getDirPath();
            bnVarN2 = bn.n(qVarJ.getIncludeStaticConfigPackagesList());
            bnVarN3 = bn.n(qVarJ.getExcludeStaticConfigPackagesList());
            if (qVarJ.hasGmsCoreDataDirectory() && qVarJ.getGmsCoreDataDirectory().getApiLevel() == Build.VERSION.SDK_INT) {
                dataDirectory = qVarJ.getGmsCoreDataDirectory().getDataDirectory();
            }
            zHasSecret = qVarJ.hasSecret();
            allowEmptySnapshotToken = qVarJ.getAllowEmptySnapshotToken();
            enableCommitV2Api = qVarJ.getEnableCommitV2Api();
            clientFlags = qVarJ.getClientFlags();
        } else {
            com.google.android.libraries.phenotype.client.b.n nVarI = i();
            shouldUseSharedStorage = nVarI.getShouldUseSharedStorage();
            bnVarN = bn.n(nVarI.getEnabledBackingsList());
            secret = nVarI.getSecret();
            dirPath = nVarI.getDirPath();
            bnVarN2 = bn.n(nVarI.getIncludeStaticConfigPackagesList());
            bnVarN3 = bn.n(nVarI.getExcludeStaticConfigPackagesList());
            if (nVarI.hasGmsCoreDataDirectory() && nVarI.getGmsCoreDataDirectory().getApiLevel() == Build.VERSION.SDK_INT) {
                dataDirectory = nVarI.getGmsCoreDataDirectory().getDataDirectory();
            }
            zHasSecret = nVarI.hasSecret();
            allowEmptySnapshotToken = nVarI.getAllowEmptySnapshotToken();
            enableCommitV2Api = nVarI.getEnableCommitV2Api();
            clientFlags = nVarI.getClientFlags();
        }
        return new as(shouldUseSharedStorage, bnVarN, secret, dirPath, dataDirectory, bnVarN2, bnVarN3, zHasSecret, allowEmptySnapshotToken, enableCommitV2Api, clientFlags);
    }

    public final boolean c(boolean z, com.google.g.a.a.b bVar) {
        if (z) {
            com.google.android.libraries.phenotype.client.b.q qVarJ = j();
            return qVarJ.getShouldUseSharedStorage() && qVarJ.getEnabledBackingsList().contains(bVar) && !qVarJ.getRestrictUpdateNotifications();
        }
        com.google.android.libraries.phenotype.client.b.n nVarI = i();
        return nVarI.getShouldUseSharedStorage() && nVarI.getEnabledBackingsList().contains(bVar) && !nVarI.getRestrictUpdateNotifications();
    }

    public final boolean d(boolean z, com.google.g.a.a.b bVar) {
        if (z) {
            com.google.android.libraries.phenotype.client.b.q qVarJ = j();
            return qVarJ.getShouldUseSharedStorage() && qVarJ.getEnabledBackingsList().contains(bVar);
        }
        com.google.android.libraries.phenotype.client.b.n nVarI = i();
        return nVarI.getShouldUseSharedStorage() && nVarI.getEnabledBackingsList().contains(bVar);
    }

    public final void g() {
        if (!com.google.android.libraries.a.c.e(this.f6118c)) {
            long lastFetchTimestampMillis = i().getLastFetchTimestampMillis();
            TimeUnit timeUnit = TimeUnit.HOURS;
            if (lastFetchTimestampMillis + CalendarModelKt.MillisecondsIn24Hours < System.currentTimeMillis()) {
                bo boVar = (bo) this.f6120e.get2();
                com.google.d.b.an.B(boVar);
                com.google.d.m.a.be.z(com.google.d.m.a.bd.j((bm) this.f6122g.get2())).B(new am(this, 2), boVar);
                return;
            }
        }
        com.google.d.m.a.bd.i();
    }

    public final boolean h(com.google.g.a.a.b bVar) {
        if (com.google.android.libraries.phenotype.client.c.b()) {
            return false;
        }
        com.google.android.libraries.phenotype.client.b.n nVarI = i();
        return (nVarI.getShouldUseSharedStorage() && nVarI.getEnabledBackingsList().contains(bVar) && nVarI.getRestrictUpdateNotifications()) ? false : true;
    }
}
