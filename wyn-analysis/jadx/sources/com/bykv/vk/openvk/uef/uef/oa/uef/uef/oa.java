package com.bykv.vk.openvk.uef.uef.oa.uef.uef;

import Va.M6;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.wk;
import com.bytedance.sdk.component.oa.uef.wrv;
import com.bytedance.sdk.component.utils.dhk;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa implements yo {
    private volatile long cq;
    private RandomAccessFile dj;
    private long ivm;
    private File lw;
    private File moa;
    private boolean uef;
    private final com.bykv.vk.openvk.uef.uef.uef.yo.yo wrv;

    /* renamed from: oa, reason: collision with root package name */
    private volatile long f24498oa = -2147483648L;
    private final Object yo = new Object();
    private volatile long xs = -1;
    private volatile int bcc = -100;
    private volatile boolean cz = false;
    private volatile boolean zjm = false;

    public oa(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        this.ivm = 0L;
        this.dj = null;
        this.wrv = yoVar;
        try {
            String strLw = yoVar.lw();
            String strBs = yoVar.bs();
            this.moa = com.bykv.vk.openvk.uef.uef.oa.moa.oa.oa(strLw, strBs);
            this.lw = com.bykv.vk.openvk.uef.uef.oa.moa.oa.yo(strLw, strBs);
            if (moa()) {
                this.dj = new RandomAccessFile(this.lw, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            } else {
                this.dj = new RandomAccessFile(this.moa, "rw");
            }
            if (!moa()) {
                this.ivm = this.moa.length();
                uef();
            }
            this.uef = com.bykv.vk.openvk.uef.uef.oa.uef.ivm() == 2;
        } catch (Throwable unused) {
            yoVar.ab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ivm() throws IOException {
        synchronized (this.yo) {
            if (moa()) {
                this.wrv.ab();
                this.wrv.bs();
                return;
            }
            try {
            } finally {
            }
            if (!this.moa.renameTo(this.lw)) {
                throw new IOException("Error renaming file " + this.moa + " to " + this.lw + " for completion!");
            }
            RandomAccessFile randomAccessFile = this.dj;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.dj = new RandomAccessFile(this.lw, "rw");
            this.wrv.bs();
            this.wrv.ab();
        }
    }

    private long lw() {
        return moa() ? this.lw.length() : this.moa.length();
    }

    private boolean moa() {
        return this.lw.exists();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.uef.uef.yo
    public void oa() {
        try {
            if (!this.cz) {
                this.dj.close();
            }
            File file = this.moa;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.lw;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.cz = true;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.uef.uef.yo
    public long yo() throws IOException {
        if (moa()) {
            this.f24498oa = this.lw.length();
        } else {
            synchronized (this.yo) {
                int i5 = 0;
                while (this.f24498oa == -2147483648L && !this.cz) {
                    try {
                        i5 += 15;
                        try {
                            this.yo.wait(5L);
                            if (i5 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return this.f24498oa;
    }

    public void uef() {
        dj.uef uefVar;
        if (com.bykv.vk.openvk.uef.uef.uef.yo.yo() != null) {
            uefVar = com.bykv.vk.openvk.uef.uef.uef.yo.yo().yo();
        } else {
            uefVar = new dj.uef("v_cache");
        }
        long jOib = this.wrv.oib();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uefVar.uef(jOib, timeUnit).oa(this.wrv.dhk(), timeUnit).yo(this.wrv.tpx(), timeUnit);
        dj djVarUef = uefVar.uef();
        this.wrv.bs();
        djVarUef.uef(new wrv.uef().uef("RANGE", M6.s(new StringBuilder("bytes="), this.ivm, "-")).oa(this.wrv.ab()).uef().uef("videoLoadWhenPlaying").uef(9).oa()).uef(new com.bytedance.sdk.component.oa.uef.yo() { // from class: com.bykv.vk.openvk.uef.uef.oa.uef.uef.oa.1
            @Override // com.bytedance.sdk.component.oa.uef.yo
            public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, IOException iOException) {
                oa.this.uef(30000, iOException.getMessage());
            }

            @Override // com.bytedance.sdk.component.oa.uef.yo
            public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, dz dzVar) throws IOException {
                wk wkVarIvm;
                if (dzVar == null) {
                    oa.this.uef(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                    return;
                }
                InputStream inputStreamYo = null;
                try {
                    try {
                        oa.this.zjm = dzVar.moa();
                        if (oa.this.zjm) {
                            wkVarIvm = dzVar.ivm();
                            try {
                                if (oa.this.zjm && wkVarIvm != null) {
                                    oa.this.f24498oa = wkVarIvm.uef() + oa.this.ivm;
                                    inputStreamYo = wkVarIvm.yo();
                                }
                                if (inputStreamYo == null) {
                                    oa.this.uef(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                    if (inputStreamYo != null) {
                                        inputStreamYo.close();
                                    }
                                    if (wkVarIvm != null) {
                                        wkVarIvm.close();
                                    }
                                    dzVar.close();
                                    if (!oa.this.zjm || oa.this.moa.length() != oa.this.f24498oa) {
                                        return;
                                    }
                                    oa.this.ivm();
                                }
                                int iXs = com.bykv.vk.openvk.uef.uef.oa.uef.xs();
                                byte[] bArr = new byte[iXs];
                                long j8 = oa.this.ivm;
                                long unused = oa.this.f24498oa;
                                long unused2 = oa.this.ivm;
                                oa.this.wrv.ab();
                                long j10 = 0;
                                long j11 = 0;
                                int i5 = 0;
                                while (true) {
                                    int i10 = inputStreamYo.read(bArr, i5, iXs - i5);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    i5 += i10;
                                    j11 += i10;
                                    boolean z2 = j11 % ((long) iXs) == j10 || j11 == oa.this.f24498oa - oa.this.ivm;
                                    long unused3 = oa.this.f24498oa;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(j11);
                                    sb2.append(", waitingAtPost=");
                                    long unused4 = oa.this.cq;
                                    if (z2) {
                                        synchronized (oa.this.yo) {
                                            try {
                                                com.bykv.vk.openvk.uef.uef.oa.moa.oa.uef(oa.this.dj, bArr, Long.valueOf(j8).intValue(), i5, oa.this.wrv.bs());
                                                if (oa.this.uef && oa.this.cq > -1 && oa.this.ivm + j11 >= oa.this.cq) {
                                                    oa.this.yo.notify();
                                                }
                                            } finally {
                                            }
                                        }
                                        j8 += i5;
                                        i5 = 0;
                                    }
                                    j10 = 0;
                                }
                                long unused5 = oa.this.ivm;
                                long unused6 = oa.this.f24498oa;
                                long unused7 = oa.this.f24498oa;
                                long unused8 = oa.this.ivm;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    oa.this.uef(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                    if (inputStreamYo != null) {
                                        inputStreamYo.close();
                                    }
                                    if (wkVarIvm != null) {
                                        wkVarIvm.close();
                                    }
                                    dzVar.close();
                                    if (oa.this.zjm && oa.this.moa.length() == oa.this.f24498oa) {
                                        oa.this.ivm();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    if (inputStreamYo != null) {
                                        try {
                                            inputStreamYo.close();
                                        } catch (Throwable unused9) {
                                            throw th2;
                                        }
                                    }
                                    if (wkVarIvm != null) {
                                        wkVarIvm.close();
                                    }
                                    dzVar.close();
                                    if (oa.this.zjm && oa.this.moa.length() == oa.this.f24498oa) {
                                        oa.this.ivm();
                                    }
                                    throw th2;
                                }
                            }
                        } else {
                            oa.this.uef(dzVar.yo(), dzVar.lw());
                            wkVarIvm = null;
                        }
                        if (inputStreamYo != null) {
                            inputStreamYo.close();
                        }
                        if (wkVarIvm != null) {
                            wkVarIvm.close();
                        }
                        dzVar.close();
                        if (!oa.this.zjm || oa.this.moa.length() != oa.this.f24498oa) {
                            return;
                        }
                        oa.this.ivm();
                    } catch (Throwable unused10) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    wkVarIvm = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(int i5, String str) {
        JSONObject jSONObjectYo;
        this.zjm = false;
        this.bcc = i5;
        this.f24498oa = this.xs;
        dhk.oa("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i5), StringUtils.SPACE, str);
        com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar = this.wrv;
        if (yoVar == null || !yoVar.uef() || (jSONObjectYo = this.wrv.yo()) == null) {
            return;
        }
        try {
            jSONObjectYo.put("error_real_code", i5);
            jSONObjectYo.put("error_real_msg", str);
        } catch (Throwable th) {
            dhk.uef("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.uef.uef.yo
    public int uef(long j8, byte[] bArr, int i5, int i10) throws IOException {
        try {
            if (j8 == this.f24498oa) {
                return -1;
            }
            int i11 = 0;
            int i12 = 0;
            while (!this.cz) {
                synchronized (this.yo) {
                    try {
                        if (j8 < lw()) {
                            this.dj.seek(j8);
                            i12 = this.dj.read(bArr, i5, i10);
                        } else {
                            i11 += 33;
                            this.cq = j8;
                            this.yo.wait(33L);
                            this.cq = -1L;
                        }
                    } finally {
                    }
                }
                if (i12 > 0) {
                    return i12;
                }
                com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar = this.wrv;
                if (yoVar != null && yoVar.uef() && this.bcc != -100 && (!this.zjm || this.f24498oa == this.xs)) {
                    throw new IOException();
                }
                if (i11 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }
}
