package g5;

import java.io.File;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2704a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35723c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35724d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35725e;

    /* renamed from: f, reason: collision with root package name */
    public SQLiteDatabase f35726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35727g;

    public C2704a(String str, String str2, int i5, int i10, boolean z2) {
        this.f35722b = str;
        this.f35723c = str2 == null ? "" : str2;
        this.f35721a = z2;
        this.f35724d = i5;
        this.f35725e = i10;
    }

    public static void a(String str) {
        File file = new File(str);
        file.delete();
        new File(file.getPath() + "-journal").delete();
        new File(file.getPath() + "-shm").delete();
        new File(file.getPath() + "-wal").delete();
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder("[");
        Thread threadCurrentThread = Thread.currentThread();
        sb2.append("" + this.f35724d + "," + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")");
        sb2.append("] ");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r11, ae.d r12) {
        /*
            r10 = this;
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = r10.f35723c
            r3 = 0
            java.lang.String r5 = r10.f35722b     // Catch: java.lang.Exception -> L37
            java.util.WeakHashMap r0 = net.zetetic.database.sqlcipher.SQLiteDatabase.f41113j     // Catch: java.lang.Exception -> L37
            int r0 = r2.length()     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L13
            byte[] r0 = new byte[r3]     // Catch: java.lang.Exception -> L37
        L11:
            r9 = r0
            goto L1c
        L13:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.Exception -> L32
            byte[] r0 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L2c
            goto L11
        L1c:
            r7 = 0
            r8 = 0
            r4 = r11
            r6 = r12
            net.zetetic.database.sqlcipher.SQLiteDatabase r11 = net.zetetic.database.sqlcipher.SQLiteDatabase.X(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L2a
            r10.f35726f = r11     // Catch: java.lang.Exception -> L27
            return
        L27:
            r0 = move-exception
        L28:
            r11 = r0
            goto L3b
        L2a:
            r0 = move-exception
            goto L2f
        L2c:
            r0 = move-exception
            r4 = r11
            r6 = r12
        L2f:
            r11 = r0
            r0 = r11
            goto L28
        L32:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            goto L28
        L37:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L28
        L3b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Opening db in "
            r12.<init>(r0)
            java.lang.String r0 = r10.f35722b
            r12.append(r0)
            java.lang.String r0 = " with PRAGMA cipher_migrate"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "Sqflite"
            android.util.Log.d(r0, r12)
            ad.L r8 = new ad.L
            r12 = 6
            r8.<init>(r11, r12)
            java.util.WeakHashMap r11 = net.zetetic.database.sqlcipher.SQLiteDatabase.f41113j
            int r11 = r2.length()
            if (r11 != 0) goto L67
            byte[] r11 = new byte[r3]
        L65:
            r9 = r11
            goto L70
        L67:
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r1)
            byte[] r11 = r2.getBytes(r11)
            goto L65
        L70:
            r7 = 0
            java.lang.String r5 = r10.f35722b
            net.zetetic.database.sqlcipher.SQLiteDatabase r11 = net.zetetic.database.sqlcipher.SQLiteDatabase.X(r4, r5, r6, r7, r8, r9)
            r10.f35726f = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2704a.c(int, ae.d):void");
    }
}
