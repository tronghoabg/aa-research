package com.bykv.vk.openvk.uef.uef.oa.uef.oa;

import android.content.Context;
import cb.AbstractC1593a;
import com.bykv.vk.openvk.uef.uef.uef.lw.uef;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.wk;
import com.bytedance.sdk.component.oa.uef.wrv;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class oa {
    private File lw;
    private File moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bykv.vk.openvk.uef.uef.uef.yo.yo f24495oa;
    private Context uef;
    private volatile boolean yo = false;
    private final List<uef.InterfaceC0032uef> ivm = new ArrayList();
    private volatile boolean xs = false;

    public oa(Context context, com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        this.moa = null;
        this.lw = null;
        this.uef = context;
        this.f24495oa = yoVar;
        this.moa = com.bykv.vk.openvk.uef.uef.oa.moa.oa.oa(yoVar.lw(), yoVar.bs());
        this.lw = com.bykv.vk.openvk.uef.uef.oa.moa.oa.yo(yoVar.lw(), yoVar.bs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lw() {
        try {
            if (this.moa.renameTo(this.lw)) {
                return;
            }
            throw new IOException("Error renaming file " + this.moa + " to " + this.lw + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa() {
        try {
            this.lw.delete();
            this.moa.delete();
        } catch (Throwable unused) {
        }
    }

    private void yo() {
        dj.uef uefVarYo = com.bykv.vk.openvk.uef.uef.uef.yo.yo() != null ? com.bykv.vk.openvk.uef.uef.uef.yo.yo().yo() : new dj.uef("v_preload");
        long jOib = this.f24495oa.oib();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uefVarYo.uef(jOib, timeUnit).oa(this.f24495oa.dhk(), timeUnit).yo(this.f24495oa.tpx(), timeUnit);
        dj djVarUef = uefVarYo.uef();
        wrv.uef uefVar = new wrv.uef();
        final long length = this.moa.length();
        int iIvm = this.f24495oa.ivm();
        boolean zCq = this.f24495oa.cq();
        int iMoa = this.f24495oa.moa();
        if (iMoa > 0) {
            if (iMoa >= this.f24495oa.wrv()) {
                zCq = true;
            } else {
                iIvm = iMoa;
            }
        }
        uefVar.uef("videoPreload").uef(6);
        if (zCq) {
            uefVar.uef("RANGE", AbstractC1593a.h(length, "bytes=", "-")).oa(this.f24495oa.ab()).uef().oa();
        } else {
            uefVar.uef("RANGE", "bytes=" + length + "-" + iIvm).oa(this.f24495oa.ab()).uef().oa();
        }
        djVarUef.uef(uefVar.oa()).uef(new com.bytedance.sdk.component.oa.uef.yo() { // from class: com.bykv.vk.openvk.uef.uef.oa.uef.oa.oa.1
            @Override // com.bytedance.sdk.component.oa.uef.yo
            public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, IOException iOException) {
                oa oaVar2 = oa.this;
                oaVar2.uef(oaVar2.f24495oa, Sdk.SDKError.Reason.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE, iOException.getMessage());
                yo.uef(oa.this.f24495oa);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v3 */
            @Override // com.bytedance.sdk.component.oa.uef.yo
            public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, dz dzVar) throws IOException {
                InputStream inputStreamYo;
                Closeable closeable;
                wk wkVarIvm;
                RandomAccessFile randomAccessFile;
                long jUef;
                long j8 = length;
                int iYo = Sdk.SDKError.Reason.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE;
                wk wkVar = null;
                try {
                } catch (Throwable th) {
                    th = th;
                    inputStreamYo = null;
                    closeable = null;
                }
                if (dzVar != null) {
                    boolean zMoa = dzVar.moa();
                    if (!zMoa) {
                        oa oaVar2 = oa.this;
                        oaVar2.uef(oaVar2.f24495oa, dzVar.yo(), dzVar.lw());
                        oa.this.uef((Closeable) null);
                        oa.this.uef((Closeable) null);
                        oa.this.uef(wkVar);
                        oa.this.uef(dzVar);
                        oa.this.f24495oa.ab();
                        oa.this.f24495oa.ivm();
                        yo.uef(oa.this.f24495oa);
                    }
                    wkVarIvm = dzVar.ivm();
                    try {
                        wkVarIvm = dzVar.ivm();
                        if (!zMoa || wkVarIvm == null) {
                            inputStreamYo = null;
                            jUef = 0;
                        } else {
                            jUef = length + wkVarIvm.uef();
                            inputStreamYo = wkVarIvm.yo();
                        }
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile = wkVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamYo = null;
                        randomAccessFile = 0;
                    }
                    if (inputStreamYo == null) {
                        oa oaVar3 = oa.this;
                        oaVar3.uef(oaVar3.f24495oa, dzVar.yo(), dzVar.lw());
                    } else {
                        randomAccessFile = new RandomAccessFile(oa.this.moa, "rw");
                        try {
                            int iXs = com.bykv.vk.openvk.uef.uef.oa.uef.xs();
                            byte[] bArr = new byte[iXs];
                            int i5 = 0;
                            long j10 = 0;
                            while (true) {
                                int i10 = inputStreamYo.read(bArr, i5, iXs - i5);
                                if (i10 != -1) {
                                    if (oa.this.yo) {
                                        oa oaVar4 = oa.this;
                                        oaVar4.oa(oaVar4.f24495oa, dzVar.yo());
                                        oa.this.uef(randomAccessFile);
                                        break;
                                    } else {
                                        i5 += i10;
                                        j10 += i10;
                                        if (j10 % iXs == 0 || j10 == jUef - length) {
                                            com.bykv.vk.openvk.uef.uef.oa.moa.oa.uef(randomAccessFile, bArr, Long.valueOf(j8).intValue(), i5, oa.this.f24495oa.bs());
                                            j8 += i5;
                                            i5 = 0;
                                        }
                                    }
                                } else {
                                    if (oa.this.f24495oa.cq() && jUef == oa.this.moa.length()) {
                                        oa.this.lw();
                                    }
                                    oa oaVar5 = oa.this;
                                    oaVar5.uef(oaVar5.f24495oa, dzVar.yo());
                                    wkVar = randomAccessFile;
                                }
                            }
                            oa.this.uef(inputStreamYo);
                            oa.this.uef(wkVarIvm);
                        } catch (Throwable th4) {
                            th = th4;
                            wkVar = wkVarIvm;
                            closeable = randomAccessFile;
                            try {
                                oa.this.moa();
                                oa oaVar6 = oa.this;
                                com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar = oaVar6.f24495oa;
                                if (dzVar != null) {
                                    iYo = dzVar.yo();
                                }
                                oaVar6.uef(yoVar, iYo, th.getMessage());
                                oa.this.uef(closeable);
                                oa.this.uef(inputStreamYo);
                                oa.this.uef(wkVar);
                                oa.this.uef(dzVar);
                                oa.this.f24495oa.ab();
                                oa.this.f24495oa.ivm();
                                yo.uef(oa.this.f24495oa);
                            } catch (Throwable th5) {
                                oa.this.uef(closeable);
                                oa.this.uef(inputStreamYo);
                                oa.this.uef(wkVar);
                                oa.this.uef(dzVar);
                                oa.this.f24495oa.ab();
                                oa.this.f24495oa.ivm();
                                yo.uef(oa.this.f24495oa);
                                throw th5;
                            }
                        }
                        oa.this.uef(dzVar);
                        oa.this.f24495oa.ab();
                        oa.this.f24495oa.ivm();
                        yo.uef(oa.this.f24495oa);
                    }
                } else {
                    oa oaVar7 = oa.this;
                    oaVar7.uef(oaVar7.f24495oa, Sdk.SDKError.Reason.NATIVE_VIDEO_PLAYBACK_ERROR_VALUE, "Network link failed.");
                    wkVarIvm = null;
                    inputStreamYo = null;
                }
                oa.this.uef(wkVar);
                oa.this.uef(inputStreamYo);
                oa.this.uef(wkVarIvm);
                oa.this.uef(dzVar);
                oa.this.f24495oa.ab();
                oa.this.f24495oa.ivm();
                yo.uef(oa.this.f24495oa);
            }
        });
    }

    private boolean oa() {
        if (this.lw.exists()) {
            return true;
        }
        if (!this.f24495oa.cq()) {
            if (this.moa.length() >= this.f24495oa.ivm()) {
                return true;
            }
            if (this.f24495oa.moa() > 0 && this.moa.length() >= this.f24495oa.moa()) {
                return true;
            }
        }
        return false;
    }

    public void uef(uef.InterfaceC0032uef interfaceC0032uef) {
        if (this.xs) {
            synchronized (uef.InterfaceC0032uef.class) {
                this.ivm.add(interfaceC0032uef);
            }
            return;
        }
        this.ivm.add(interfaceC0032uef);
        if (oa()) {
            this.f24495oa.bcc(1);
            uef(this.f24495oa, 200);
            yo.uef(this.f24495oa);
        } else {
            this.xs = true;
            this.f24495oa.bcc(0);
            yo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
        synchronized (uef.InterfaceC0032uef.class) {
            try {
                for (uef.InterfaceC0032uef interfaceC0032uef : this.ivm) {
                    if (interfaceC0032uef != null) {
                        interfaceC0032uef.oa(yoVar, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.uef.uef.uef.yo.yo uef() {
        return this.f24495oa;
    }

    public void uef(boolean z2) {
        this.yo = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
        synchronized (uef.InterfaceC0032uef.class) {
            try {
                for (uef.InterfaceC0032uef interfaceC0032uef : this.ivm) {
                    if (interfaceC0032uef != null) {
                        interfaceC0032uef.uef(yoVar, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5, String str) {
        synchronized (uef.InterfaceC0032uef.class) {
            try {
                for (uef.InterfaceC0032uef interfaceC0032uef : this.ivm) {
                    if (interfaceC0032uef != null) {
                        interfaceC0032uef.uef(yoVar, i5, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
