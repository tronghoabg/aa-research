package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class qmc extends qmf {
    public static boolean a;
    private qkt c;
    private String d;
    private boolean e;
    private final Object f;
    private final ajzn g;

    public qmc(qmh qmhVar) {
        super(qmhVar);
        this.e = false;
        this.f = new Object();
        this.g = new ajzn((byte[]) null);
    }

    private static String c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigestBh = roc.bh();
        if (messageDigestBh == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestBh.digest(str.getBytes())));
    }

    private final boolean d(String str) throws NoSuchAlgorithmException, IOException {
        qmc qmcVar;
        String strC;
        try {
            strC = c(str);
            qmcVar = this;
        } catch (IOException e) {
            e = e;
            qmcVar = this;
        }
        try {
            super.p(2, "Storing hashed adid.", null, null, null);
            FileOutputStream fileOutputStreamOpenFileOutput = qmcVar.f().openFileOutput("gaClientIdData", 0);
            fileOutputStreamOpenFileOutput.write(strC.getBytes());
            fileOutputStreamOpenFileOutput.close();
            qmcVar.d = strC;
            return true;
        } catch (IOException e2) {
            e = e2;
            super.p(6, "Error creating hash file", e, null, null);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0236 A[Catch: all -> 0x02c2, DONT_GENERATE, TryCatch #1 {all -> 0x02c2, blocks: (B:96:0x0168, B:118:0x01ce, B:120:0x01dc, B:131:0x021d, B:133:0x0236, B:135:0x023a, B:137:0x0242, B:139:0x0245, B:174:0x02c3, B:121:0x01e1, B:127:0x01f1, B:128:0x0204, B:130:0x0208, B:125:0x01ed), top: B:188:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023a A[Catch: all -> 0x02c2, TryCatch #1 {all -> 0x02c2, blocks: (B:96:0x0168, B:118:0x01ce, B:120:0x01dc, B:131:0x021d, B:133:0x0236, B:135:0x023a, B:137:0x0242, B:139:0x0245, B:174:0x02c3, B:121:0x01e1, B:127:0x01f1, B:128:0x0204, B:130:0x0208, B:125:0x01ed), top: B:188:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a3 A[EXC_TOP_SPLITTER, PHI: r2
  0x02a3: PHI (r2v36 qmc) = (r2v31 qmc), (r2v37 qmc) binds: [B:163:0x02a1, B:93:0x015a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0151 A[Catch: all -> 0x02cd, TryCatch #10 {all -> 0x02cd, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0013, B:10:0x001b, B:11:0x001d, B:19:0x0035, B:20:0x0036, B:22:0x0041, B:23:0x0043, B:31:0x0053, B:32:0x0054, B:87:0x014b, B:91:0x0154, B:182:0x02ce, B:94:0x015d, B:95:0x0167, B:169:0x02b2, B:175:0x02c4, B:90:0x0151, B:61:0x00fc, B:63:0x0103, B:65:0x0107, B:67:0x010b, B:75:0x011c, B:76:0x012b, B:85:0x0147, B:178:0x02c9), top: B:203:0x0003, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d A[Catch: all -> 0x02cd, TryCatch #10 {all -> 0x02cd, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0013, B:10:0x001b, B:11:0x001d, B:19:0x0035, B:20:0x0036, B:22:0x0041, B:23:0x0043, B:31:0x0053, B:32:0x0054, B:87:0x014b, B:91:0x0154, B:182:0x02ce, B:94:0x015d, B:95:0x0167, B:169:0x02b2, B:175:0x02c4, B:90:0x0151, B:61:0x00fc, B:63:0x0103, B:65:0x0107, B:67:0x010b, B:75:0x011c, B:76:0x012b, B:85:0x0147, B:178:0x02c9), top: B:203:0x0003, inners: #23 }] */
    /* JADX WARN: Type inference failed for: r0v35, types: [qlk] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.concurrent.Callable, qmr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.qkt a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmc.a():qkt");
    }

    @Override // defpackage.qmf
    protected final void b() {
    }
}
