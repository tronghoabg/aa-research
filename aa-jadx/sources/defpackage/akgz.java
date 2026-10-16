package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akgz implements defpackage.akgw {
    private final java.util.Map c;
    private final java.util.Set d;
    private final java.lang.String b = "org/joda/time/tz/data/";
    public final java.lang.ClassLoader a = getClass().getClassLoader();

    public akgz() throws java.io.IOException {
        java.io.InputStream inputStreamC = c("ZoneInfoMap");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStreamC);
        try {
            e(dataInputStream, concurrentHashMap);
            try {
                dataInputStream.close();
            } catch (java.io.IOException unused) {
            }
            concurrentHashMap.put("UTC", new java.lang.ref.SoftReference(defpackage.akdl.a));
            this.c = concurrentHashMap;
            this.d = j$.util.DesugarCollections.unmodifiableSortedSet(new java.util.TreeSet(concurrentHashMap.keySet()));
        } catch (java.lang.Throwable th) {
            try {
                dataInputStream.close();
            } catch (java.io.IOException unused2) {
            }
            throw th;
        }
    }

    private final java.io.InputStream c(java.lang.String str) throws java.io.IOException {
        java.lang.String strConcat = this.b.concat(str);
        java.io.InputStream inputStream = (java.io.InputStream) java.security.AccessController.doPrivileged(new defpackage.akgy(this, strConcat));
        if (inputStream != null) {
            return inputStream;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(strConcat);
        sb.append("\" ClassLoader: ");
        java.lang.ClassLoader classLoader = this.a;
        sb.append(classLoader != null ? classLoader.toString() : "system");
        throw new java.io.IOException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0029: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:42), block:B:12:0x0029 */
    private final defpackage.akdl d(java.lang.String str) throws java.lang.Throwable {
        java.io.InputStream inputStreamC;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            try {
                inputStreamC = c(str);
                try {
                    defpackage.akdl akdlVarB = inputStreamC instanceof java.io.DataInput ? defpackage.agxp.b((java.io.DataInput) inputStreamC, str) : defpackage.agxp.b(new java.io.DataInputStream(inputStreamC), str);
                    this.c.put(str, new java.lang.ref.SoftReference(akdlVarB));
                    try {
                        inputStreamC.close();
                    } catch (java.io.IOException unused) {
                    }
                    return akdlVarB;
                } catch (java.io.IOException e) {
                    e = e;
                    e.printStackTrace();
                    this.c.remove(str);
                    if (inputStreamC != 0) {
                        try {
                            inputStreamC.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            inputStreamC = 0;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    private static void e(java.io.DataInputStream dataInputStream, java.util.Map map) throws java.io.IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        java.lang.String[] strArr = new java.lang.String[unsignedShort];
        for (int i = 0; i < unsignedShort; i++) {
            strArr[i] = dataInputStream.readUTF().intern();
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i2 = 0; i2 < unsignedShort2; i2++) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw new java.io.IOException("Corrupt zone info map");
            }
        }
    }

    @Override // defpackage.akgw
    public final java.util.Set a() {
        return this.d;
    }

    @Override // defpackage.akgw
    public final defpackage.akdl b(java.lang.String str) {
        java.lang.Object obj;
        if (str == null || (obj = this.c.get(str)) == null) {
            return null;
        }
        if (!(obj instanceof java.lang.ref.SoftReference)) {
            return str.equals(obj) ? d(str) : b((java.lang.String) obj);
        }
        defpackage.akdl akdlVar = (defpackage.akdl) ((java.lang.ref.SoftReference) obj).get();
        return akdlVar != null ? akdlVar : d(str);
    }
}
