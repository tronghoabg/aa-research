package defpackage;

import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;

@Deprecated
/* loaded from: classes2.dex */
public final class pmm {
    private static final yob c = yob.c("com/google/android/apps/gmm/storage/ProtoFileHelper");
    private final Context d;
    private File e;
    private File f;
    private File g;
    private final abpc h;
    public final AtomicInteger b = new AtomicInteger();
    public final String a = "SavedClientParameters.data";

    public pmm(abpc abpcVar, Context context) {
        this.d = context;
        this.h = abpcVar;
    }

    private final File d() {
        File file = this.g;
        if (file != null) {
            return file;
        }
        Context context = this.d;
        context.getClass();
        File file2 = new File(context.getFilesDir(), this.a.concat(".adler32"));
        this.g = file2;
        return file2;
    }

    private final File e() {
        File file = this.f;
        if (file != null) {
            return file;
        }
        Context context = this.d;
        context.getClass();
        File file2 = new File(context.getFilesDir(), this.a);
        this.f = file2;
        return file2;
    }

    private final File f() {
        File file = this.e;
        if (file != null) {
            return file;
        }
        Context context = this.d;
        context.getClass();
        File file2 = new File(context.getFilesDir(), this.a.concat(".cs"));
        this.e = file2;
        return file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4 A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:6:0x000a, B:7:0x0013, B:9:0x001e, B:10:0x0027, B:17:0x004b, B:19:0x0052, B:20:0x005b, B:22:0x0067, B:23:0x006e, B:27:0x007a, B:28:0x0085, B:26:0x0073, B:12:0x0032, B:14:0x0041, B:35:0x00ac, B:36:0x00be, B:33:0x0097, B:34:0x00ab, B:47:0x00ce, B:49:0x00d4, B:50:0x00db, B:54:0x00e7, B:56:0x00f2, B:53:0x00e0, B:57:0x0104), top: B:67:0x0001, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2 A[Catch: all -> 0x0108, TryCatch #4 {, blocks: (B:3:0x0001, B:6:0x000a, B:7:0x0013, B:9:0x001e, B:10:0x0027, B:17:0x004b, B:19:0x0052, B:20:0x005b, B:22:0x0067, B:23:0x006e, B:27:0x007a, B:28:0x0085, B:26:0x0073, B:12:0x0032, B:14:0x0041, B:35:0x00ac, B:36:0x00be, B:33:0x0097, B:34:0x00ab, B:47:0x00ce, B:49:0x00d4, B:50:0x00db, B:54:0x00e7, B:56:0x00f2, B:53:0x00e0, B:57:0x0104), top: B:67:0x0001, inners: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean g(defpackage.abow r7, int r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmm.g(abow, int):boolean");
    }

    private static byte[] h(File file) throws IOException {
        FileInputStream fileInputStreamF = new ncp(file).F();
        try {
            byte[] bArr = new byte[fileInputStreamF.available()];
            int i = 0;
            while (true) {
                int length = bArr.length;
                int i2 = fileInputStreamF.read(bArr, i, length - i);
                if (i2 <= 0) {
                    return bArr;
                }
                i += i2;
                int iAvailable = fileInputStreamF.available();
                if (iAvailable > length - i) {
                    byte[] bArr2 = new byte[iAvailable + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamF.close();
        }
    }

    @ResultIgnorabilityUnspecified
    private static void i(File file) {
        if (file.exists()) {
            ncp ncpVar = new ncp(file);
            ((File) ncpVar.a).delete();
            ((File) ncpVar.b).delete();
            ((File) ncpVar.c).delete();
        }
    }

    private final synchronized acjs j() {
        acjs acjsVarI;
        acjs acjsVarI2;
        xuv xuvVarB = xuw.b("ProtoFileHelper.loadSavedProtoFromFileInternal");
        try {
            if (f().exists()) {
                acjsVarI2 = c();
            } else {
                vaq.d();
                if (e().exists()) {
                    File fileE = e();
                    File fileD = d();
                    vaq.d();
                    try {
                        try {
                            byte[] bArrH = h(fileE);
                            if (fileD.exists()) {
                                try {
                                    byte[] bArrH2 = h(fileD);
                                    if (bArrH2.length != 8) {
                                        acjsVarI = acjs.i(4, null);
                                    } else {
                                        vaq.d();
                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                        byteBufferAllocate.put(bArrH2, 0, 8);
                                        byteBufferAllocate.flip();
                                        long j = byteBufferAllocate.getLong();
                                        Adler32 adler32 = new Adler32();
                                        adler32.update(bArrH, 0, bArrH.length);
                                        if (adler32.getValue() != j) {
                                            ((ynz) ((ynz) c.g()).ai(6790)).R("File checksum mismatch: %s %d %d", fileE, Long.valueOf(j), Long.valueOf(adler32.getValue()));
                                            acjsVarI = acjs.i(3, null);
                                        } else {
                                            acjsVarI = new acjs(ByteBuffer.wrap(bArrH), 7);
                                        }
                                    }
                                } catch (IOException e) {
                                    acjsVarI = acjs.i(4, e);
                                }
                            } else {
                                acjsVarI = acjs.i(9, null);
                            }
                        } catch (IOException e2) {
                            acjsVarI = acjs.i(8, e2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    ((ynz) ((ynz) c.d()).ai(6791)).y("File doesn't exist: %s", this.a);
                    acjsVarI = acjs.i(6, new FileNotFoundException());
                }
                ByteBuffer byteBuffer = (ByteBuffer) acjsVarI.b;
                if (byteBuffer == null) {
                    acjsVarI2 = acjs.i(acjsVarI.a, null);
                } else {
                    try {
                        acjsVarI2 = new acjs(this.h.k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), abnj.a()), acjsVarI.a);
                    } catch (abon e3) {
                        ((ynz) ((ynz) ((ynz) c.g()).p(e3)).ai(6786)).y("readProtoLiteFromFile failed: %s", this.a);
                        acjsVarI2 = acjs.i(5, e3);
                    }
                }
            }
            xuvVarB.close();
        } finally {
        }
        return acjsVarI2;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean a(abow abowVar, int i) {
        if (i != this.b.get()) {
            return false;
        }
        try {
            return g(abowVar, i);
        } catch (IOException | SecurityException e) {
            ((ynz) ((ynz) ((ynz) c.g()).p(e)).ai((char) 6792)).u("writeProtoLiteToFile failed to write proto:");
            return false;
        }
    }

    public final synchronized acjs b() {
        return j();
    }

    final synchronized acjs c() {
        File fileF = f();
        try {
            FileInputStream fileInputStreamF = new ncp(fileF).F();
            try {
                int i = fileInputStreamF.read(new byte[8]);
                if (i >= 8) {
                    acjs acjsVar = new acjs(this.h.i(fileInputStreamF, abnj.a()), 2);
                    fileInputStreamF.close();
                    return acjsVar;
                }
                ((ynz) ((ynz) c.g()).ai(6789)).R("Checksums are disabled however file was too short to contain a checksum: %s - %d %d", fileF, Integer.valueOf(i), 8);
                acjs acjsVarI = acjs.i(3, null);
                fileInputStreamF.close();
                return acjsVarI;
            } catch (Throwable th) {
                try {
                    fileInputStreamF.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) c.g()).p(e)).ai(6787)).y("readProtoLiteFromFile failed: %s", this.a);
            return acjs.i(5, e);
        } catch (IOException e2) {
            ((ynz) ((ynz) ((ynz) c.g()).p(e2)).ai(6788)).y("readProtoLiteFromFile failed: %s", this.a);
            return acjs.i(8, e2);
        }
    }
}
