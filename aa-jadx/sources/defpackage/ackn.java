package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ackn {
    private static final java.util.List c = new java.util.ArrayList();
    public final java.nio.charset.CharsetEncoder[] a;
    public final int b;

    static {
        java.lang.String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            java.lang.String str = strArr[i];
            if (((defpackage.ackm) defpackage.ackm.B.get(str)) != null) {
                try {
                    c.add(java.nio.charset.Charset.forName(str).newEncoder());
                } catch (java.nio.charset.UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public ackn(java.lang.String str, java.nio.charset.Charset charset) {
        int i;
        boolean zCanEncode;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.nio.charset.StandardCharsets.ISO_8859_1.newEncoder());
        int i2 = 0;
        boolean z = charset != null && charset.name().startsWith("UTF");
        for (int i3 = 0; i3 < str.length(); i3++) {
            int size = arrayList.size();
            int i4 = 0;
            do {
                if (i4 >= size) {
                    java.util.Iterator it = c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        java.nio.charset.CharsetEncoder charsetEncoder = (java.nio.charset.CharsetEncoder) it.next();
                        if (charsetEncoder.canEncode(str.charAt(i3))) {
                            arrayList.add(charsetEncoder);
                            break;
                        }
                    }
                } else {
                    zCanEncode = ((java.nio.charset.CharsetEncoder) arrayList.get(i4)).canEncode(str.charAt(i3));
                    i4++;
                }
            } while (!zCanEncode);
        }
        if (arrayList.size() != 1 || z) {
            this.a = new java.nio.charset.CharsetEncoder[arrayList.size() + 2];
            int size2 = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = i5 + 1;
                if (i6 >= size2) {
                    break;
                }
                this.a[i5] = (java.nio.charset.CharsetEncoder) arrayList.get(i6);
                i6++;
                i5 = i;
            }
            this.a[i5] = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
            this.a[i] = java.nio.charset.StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.a = new java.nio.charset.CharsetEncoder[]{(java.nio.charset.CharsetEncoder) arrayList.get(0)};
        }
        int i7 = -1;
        if (charset != null) {
            while (true) {
                java.nio.charset.CharsetEncoder[] charsetEncoderArr = this.a;
                if (i2 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i2] != null && charset.name().equals(this.a[i2].charset().name())) {
                    i7 = i2;
                    break;
                }
                i2++;
            }
        }
        this.b = i7;
    }

    public final int a() {
        return this.a.length;
    }

    public final java.nio.charset.Charset b(int i) {
        return this.a[i].charset();
    }

    public final boolean c(char c2, int i) {
        return this.a[i].canEncode(java.lang.String.valueOf(c2));
    }

    public final byte[] d(java.lang.String str, int i) {
        return str.getBytes(this.a[i].charset());
    }
}
