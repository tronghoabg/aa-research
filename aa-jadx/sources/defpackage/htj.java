package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class htj {
    static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("US-ASCII");

    static {
        java.nio.charset.Charset.forName(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
    }

    static void a(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }

    public static void b(java.io.File file) throws java.io.IOException {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new java.io.IOException("not a readable directory: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(file))));
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2);
            }
            if (!file2.delete()) {
                throw new java.io.IOException("failed to delete file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(file2))));
            }
        }
    }
}
