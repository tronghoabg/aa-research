package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dsu {
    public static final java.lang.Object a = new java.lang.Object();

    /* JADX WARN: Code duplicated, block: B:45:0x0043 A[EXC_TOP_SPLITTER, PHI: r1
  0x0043: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:26:0x0050, B:20:0x0041] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static java.lang.String a(android.content.Context context) {
        java.lang.String attributeValue;
        synchronized (a) {
            attributeValue = "";
            try {
                try {
                    java.io.FileInputStream fileInputStreamOpenFileInput = context.openFileInput("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = android.util.Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE);
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1) {
                                    if (next == 3) {
                                        if (xmlPullParserNewPullParser.getDepth() <= depth) {
                                            break;
                                        }
                                        next = 3;
                                        if (next == 3) {
                                        }
                                    } else if (next == 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused2) {
                            android.util.Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                        }
                        if (attributeValue.isEmpty()) {
                            context.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                        }
                    } catch (java.lang.Throwable th) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (java.io.IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (java.io.FileNotFoundException unused4) {
                    return "";
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        return attributeValue;
    }
}
