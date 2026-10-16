package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tfq {
    private static final java.lang.ThreadLocal f = new defpackage.tfp();
    public final long a;
    public final java.lang.String b;
    public java.lang.String c;
    public java.lang.Object[] d;
    public final int e;
    private java.lang.String g;

    public tfq(long j, int i, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        this.a = j;
        this.e = i;
        this.b = str;
        this.c = str2;
        this.d = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:9:0x0010, B:11:0x0014, B:13:0x0020, B:16:0x0026, B:18:0x0029, B:20:0x002d, B:22:0x0031, B:30:0x0053, B:31:0x0055, B:25:0x003b, B:27:0x0049, B:32:0x0059, B:35:0x005f, B:36:0x0066, B:38:0x006c, B:40:0x0077, B:42:0x007f, B:44:0x0085, B:45:0x008a, B:47:0x008e, B:48:0x0091, B:49:0x0093, B:50:0x0095, B:52:0x009b, B:54:0x009f, B:55:0x00a3, B:56:0x00a6, B:57:0x00ae), top: B:67:0x0010, outer: #1 }] */
    public final synchronized void a() {
        defpackage.ysr.bk(this.g == null, "LogEntry has already been formatted");
        try {
            java.lang.String str = this.c;
            if (str != null) {
                this.g = defpackage.sqs.aH(str, this.d);
                java.lang.Object[] objArr = this.d;
                if (objArr != null && objArr.length != 0) {
                    java.lang.Object[] objArr2 = null;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        int length = objArr.length;
                        if (i >= length) {
                            break;
                        }
                        java.lang.Object obj = objArr[i];
                        if (obj != null) {
                            if (!(obj instanceof defpackage.zkf)) {
                                defpackage.zkg zkgVar = (defpackage.zkg) obj.getClass().getAnnotation(defpackage.zkg.class);
                                if (zkgVar != null && zkgVar.a() == defpackage.zke.a) {
                                    if (objArr2 == null) {
                                        objArr2 = new java.lang.Object[length];
                                    }
                                    objArr2[i] = obj;
                                    i2++;
                                }
                            } else if (((defpackage.zkf) obj).a == defpackage.zke.a) {
                                if (objArr2 == null) {
                                    objArr2 = new java.lang.Object[length];
                                }
                                objArr2[i] = obj;
                                i2++;
                            }
                        }
                        i++;
                    }
                    if (objArr2 != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < str.length()) {
                            char cCharAt = str.charAt(i3);
                            sb.append(cCharAt);
                            if (cCharAt == '%') {
                                int i5 = i3 + 1;
                                if (i5 >= str.length() || str.charAt(i5) != '%') {
                                    if (objArr2[i4] == null) {
                                        sb.append('%');
                                    }
                                    i4++;
                                } else {
                                    sb.append('%');
                                    i3 = i5;
                                }
                            }
                            i3++;
                        }
                        java.lang.Object[] objArr3 = new java.lang.Object[i2];
                        int i6 = 0;
                        for (java.lang.Object obj2 : objArr2) {
                            if (obj2 != null) {
                                objArr3[i6] = obj2;
                                i6++;
                            }
                        }
                        defpackage.sqs.aH(sb.toString(), objArr3);
                    }
                }
            } else {
                this.g = "";
            }
            this.c = null;
            this.d = null;
        } catch (java.lang.Throwable th) {
            this.c = null;
            this.d = null;
            throw th;
        }
    }

    public final synchronized java.lang.String b() {
        char c;
        java.lang.String str = ((java.text.SimpleDateFormat) f.get()).format(new java.util.Date(this.a));
        int i = this.e;
        if (i == 2) {
            c = 'V';
        } else if (i == 3) {
            c = 'D';
        } else if (i != 4) {
            c = i != 5 ? 'E' : 'W';
        } else {
            c = 'I';
        }
        java.lang.String str2 = str + " " + c + " " + this.b + " : ";
        java.lang.String str3 = this.g;
        if (str3 != null) {
            return str2.concat(str3);
        }
        java.lang.String str4 = this.c;
        if (str4 == null) {
            return str2;
        }
        return str2.concat(java.lang.String.valueOf(defpackage.sqs.aH(str4, this.d)));
    }

    public final java.lang.String toString() {
        return b();
    }
}
