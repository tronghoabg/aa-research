package com.bytedance.sdk.component.oa.uef;

import Va.M6;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.unity3d.services.core.network.model.HttpRequest;
import j$.util.DesugarCollections;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class xs {
    private static final char[] moa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final List<String> bcc;
    private final String cz;
    private final String ivm;
    private final String lw;

    /* renamed from: oa, reason: collision with root package name */
    final String f25075oa;
    final String uef;
    private final List<String> xs;
    final int yo;
    private final String zjm;

    public static final class uef {
        String bcc;
        final List<String> ivm;
        String moa;
        String uef;
        List<String> xs;

        /* renamed from: oa, reason: collision with root package name */
        String f25076oa = "";
        String yo = "";
        int lw = -1;

        /* renamed from: com.bytedance.sdk.component.oa.uef.xs$uef$uef, reason: collision with other inner class name */
        public enum EnumC0065uef {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public uef() {
            ArrayList arrayList = new ArrayList();
            this.ivm = arrayList;
            arrayList.add("");
        }

        private boolean ivm(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean lw(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public uef moa(String str) {
            this.xs = str != null ? xs.oa(xs.uef(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public uef oa(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strLw = lw(str, 0, str.length());
            if (strLw == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.moa = strLw;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.uef);
            sb2.append("://");
            if (!this.f25076oa.isEmpty() || !this.yo.isEmpty()) {
                sb2.append(this.f25076oa);
                if (!this.yo.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.yo);
                }
                sb2.append('@');
            }
            if (this.moa.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.moa);
                sb2.append(']');
            } else {
                sb2.append(this.moa);
            }
            int iUef = uef();
            if (iUef != xs.uef(this.uef)) {
                sb2.append(':');
                sb2.append(iUef);
            }
            xs.uef(sb2, this.ivm);
            if (this.xs != null) {
                sb2.append('?');
                xs.oa(sb2, this.xs);
            }
            if (this.bcc != null) {
                sb2.append('#');
                sb2.append(this.bcc);
            }
            return sb2.toString();
        }

        public uef uef(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.uef = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.uef = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public uef yo(String str) {
            if (str != null) {
                return uef(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        private static String lw(String str, int i5, int i10) {
            return com.bytedance.sdk.component.oa.uef.oa.cz.uef(xs.uef(str, i5, i10, false));
        }

        private static int moa(String str, int i5, int i10) {
            while (i5 < i10) {
                char cCharAt = str.charAt(i5);
                if (cCharAt == ':') {
                    return i5;
                }
                if (cCharAt == '[') {
                    do {
                        i5++;
                        if (i5 < i10) {
                        }
                    } while (str.charAt(i5) != ']');
                }
                i5++;
            }
            return i10;
        }

        private void yo() {
            if (this.ivm.remove(r0.size() - 1).isEmpty() && !this.ivm.isEmpty()) {
                this.ivm.set(r0.size() - 1, "");
            } else {
                this.ivm.add("");
            }
        }

        private static int ivm(String str, int i5, int i10) throws NumberFormatException {
            int i11;
            try {
                i11 = Integer.parseInt(xs.uef(str, i5, i10, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i11 <= 0 || i11 > 65535) {
                return -1;
            }
            return i11;
        }

        public xs oa() {
            if (this.uef != null) {
                if (this.moa != null) {
                    return new xs(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int yo(String str, int i5, int i10) {
            int i11 = 0;
            while (i5 < i10) {
                char cCharAt = str.charAt(i5);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i11++;
                i5++;
            }
            return i11;
        }

        public int uef() {
            int i5 = this.lw;
            return i5 != -1 ? i5 : xs.uef(this.uef);
        }

        private uef uef(String str, boolean z2) {
            boolean z10;
            uef uefVar;
            String str2;
            boolean z11;
            int i5 = 0;
            while (true) {
                int iUef = com.bytedance.sdk.component.oa.uef.oa.cz.uef(str, i5, str.length(), "/\\");
                if (iUef < str.length()) {
                    z10 = true;
                    str2 = str;
                    z11 = z2;
                    uefVar = this;
                } else {
                    z10 = false;
                    uefVar = this;
                    str2 = str;
                    z11 = z2;
                }
                uefVar.uef(str2, i5, iUef, z10, z11);
                i5 = iUef + 1;
                if (i5 > str2.length()) {
                    return uefVar;
                }
                str = str2;
                z2 = z11;
            }
        }

        private static int oa(String str, int i5, int i10) {
            if (i10 - i5 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i5);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i5++;
                    if (i5 >= i10) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public uef uef(String str, String str2) {
            if (str != null) {
                if (this.xs == null) {
                    this.xs = new ArrayList();
                }
                this.xs.add(xs.uef(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
                this.xs.add(str2 != null ? xs.uef(str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0065uef uef(xs xsVar, String str) throws NumberFormatException {
            int iUef;
            String str2;
            int i5;
            String str3;
            String str4 = str;
            int iUef2 = com.bytedance.sdk.component.oa.uef.oa.cz.uef(str4, 0, str4.length());
            int iOa = com.bytedance.sdk.component.oa.uef.oa.cz.oa(str4, iUef2, str4.length());
            if (oa(str4, iUef2, iOa) != -1) {
                if (str4.regionMatches(true, iUef2, "https:", 0, 6)) {
                    this.uef = HttpRequest.DEFAULT_SCHEME;
                    iUef2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iUef2, "http:", 0, 5)) {
                        this.uef = "http";
                        iUef2 += 5;
                    } else {
                        return EnumC0065uef.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (xsVar != null) {
                this.uef = xsVar.uef;
            } else {
                return EnumC0065uef.MISSING_SCHEME;
            }
            int iYo = yo(str4, iUef2, iOa);
            char c10 = '#';
            if (iYo < 2 && xsVar != null && xsVar.uef.equals(this.uef)) {
                this.f25076oa = xsVar.oa();
                this.yo = xsVar.yo();
                this.moa = xsVar.f25075oa;
                this.lw = xsVar.yo;
                this.ivm.clear();
                this.ivm.addAll(xsVar.moa());
                if (iUef2 == iOa || str4.charAt(iUef2) == '#') {
                    moa(xsVar.lw());
                }
                str2 = str4;
            } else {
                int i10 = iUef2 + iYo;
                boolean z2 = false;
                boolean z10 = false;
                while (true) {
                    iUef = com.bytedance.sdk.component.oa.uef.oa.cz.uef(str4, i10, iOa, "@/\\?#");
                    char cCharAt = iUef != iOa ? str4.charAt(iUef) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c10 || cCharAt == '/' || cCharAt == '\\' || cCharAt == '?') {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z2) {
                            int iUef3 = com.bytedance.sdk.component.oa.uef.oa.cz.uef(str4, i10, iUef, ':');
                            String strUef = xs.uef(str, i10, iUef3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z10) {
                                strUef = M6.t(new StringBuilder(), this.f25076oa, "%40", strUef);
                            }
                            this.f25076oa = strUef;
                            if (iUef3 != iUef) {
                                i5 = iUef;
                                this.yo = xs.uef(str, iUef3 + 1, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z2 = true;
                            } else {
                                i5 = iUef;
                            }
                            str3 = str;
                            z10 = true;
                        } else {
                            i5 = iUef;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.yo);
                            sb2.append("%40");
                            str3 = str;
                            sb2.append(xs.uef(str3, i10, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.yo = sb2.toString();
                        }
                        i10 = i5 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i11 = i10;
                int iMoa = moa(str2, i11, iUef);
                int i12 = iMoa + 1;
                if (i12 < iUef) {
                    this.moa = lw(str2, i11, iMoa);
                    int iIvm = ivm(str2, i12, iUef);
                    this.lw = iIvm;
                    if (iIvm == -1) {
                        return EnumC0065uef.INVALID_PORT;
                    }
                } else {
                    this.moa = lw(str2, i11, iMoa);
                    this.lw = xs.uef(this.uef);
                }
                if (this.moa == null) {
                    return EnumC0065uef.INVALID_HOST;
                }
                iUef2 = iUef;
            }
            int iUef4 = com.bytedance.sdk.component.oa.uef.oa.cz.uef(str2, iUef2, iOa, "?#");
            uef(str2, iUef2, iUef4);
            if (iUef4 < iOa && str2.charAt(iUef4) == '?') {
                int iUef5 = com.bytedance.sdk.component.oa.uef.oa.cz.uef(str2, iUef4, iOa, '#');
                this.xs = xs.oa(xs.uef(str2, iUef4 + 1, iUef5, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iUef4 = iUef5;
            }
            if (iUef4 < iOa && str2.charAt(iUef4) == '#') {
                this.bcc = xs.uef(str2, iUef4 + 1, iOa, "", true, false, false, false, null);
            }
            return EnumC0065uef.SUCCESS;
        }

        private void uef(String str, int i5, int i10) {
            if (i5 == i10) {
                return;
            }
            char cCharAt = str.charAt(i5);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.ivm;
                list.set(list.size() - 1, "");
            } else {
                this.ivm.clear();
                this.ivm.add("");
                i5++;
            }
            int i11 = i5;
            while (i11 < i10) {
                int iUef = com.bytedance.sdk.component.oa.uef.oa.cz.uef(str, i11, i10, "/\\");
                boolean z2 = iUef < i10;
                String str2 = str;
                uef(str2, i11, iUef, z2, true);
                if (z2) {
                    iUef++;
                }
                i11 = iUef;
                str = str2;
            }
        }

        private void uef(String str, int i5, int i10, boolean z2, boolean z10) {
            String strUef = xs.uef(str, i5, i10, HttpUrl.PATH_SEGMENT_ENCODE_SET, z10, false, false, true, null);
            if (lw(strUef)) {
                return;
            }
            if (ivm(strUef)) {
                yo();
                return;
            }
            if (((String) M6.k(1, this.ivm)).isEmpty()) {
                List<String> list = this.ivm;
                list.set(list.size() - 1, strUef);
            } else {
                this.ivm.add(strUef);
            }
            if (z2) {
                this.ivm.add("");
            }
        }
    }

    public xs(uef uefVar) {
        this.uef = uefVar.uef;
        this.lw = uef(uefVar.f25076oa, false);
        this.ivm = uef(uefVar.yo, false);
        this.f25075oa = uefVar.moa;
        this.yo = uefVar.uef();
        this.xs = uef(uefVar.ivm, false);
        List<String> list = uefVar.xs;
        this.bcc = list != null ? uef(list, true) : null;
        String str = uefVar.bcc;
        this.cz = str != null ? uef(str, false) : null;
        this.zjm = uefVar.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof xs) && ((xs) obj).zjm.equals(this.zjm);
    }

    public int hashCode() {
        return this.zjm.hashCode();
    }

    public String lw() {
        if (this.bcc == null) {
            return null;
        }
        int iIndexOf = this.zjm.indexOf(63) + 1;
        String str = this.zjm;
        return this.zjm.substring(iIndexOf, com.bytedance.sdk.component.oa.uef.oa.cz.uef(str, iIndexOf, str.length(), '#'));
    }

    public List<String> moa() {
        int iIndexOf = this.zjm.indexOf(47, this.uef.length() + 3);
        String str = this.zjm;
        int iUef = com.bytedance.sdk.component.oa.uef.oa.cz.uef(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iUef) {
            int i5 = iIndexOf + 1;
            int iUef2 = com.bytedance.sdk.component.oa.uef.oa.cz.uef(this.zjm, i5, iUef, '/');
            arrayList.add(this.zjm.substring(i5, iUef2));
            iIndexOf = iUef2;
        }
        return arrayList;
    }

    public String oa() {
        if (this.lw.isEmpty()) {
            return "";
        }
        int length = this.uef.length() + 3;
        String str = this.zjm;
        return this.zjm.substring(length, com.bytedance.sdk.component.oa.uef.oa.cz.uef(str, length, str.length(), ":@"));
    }

    public String toString() {
        return this.zjm;
    }

    public URL uef() {
        try {
            return new URL(this.zjm);
        } catch (MalformedURLException e7) {
            throw new RuntimeException(e7);
        }
    }

    public String yo() {
        if (this.ivm.isEmpty()) {
            return "";
        }
        return this.zjm.substring(this.zjm.indexOf(58, this.uef.length() + 3) + 1, this.zjm.indexOf(64));
    }

    public static int uef(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static void oa(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5 += 2) {
            String str = list.get(i5);
            String str2 = list.get(i5 + 1);
            if (i5 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    public static void uef(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            sb2.append('/');
            sb2.append(list.get(i5));
        }
    }

    public static xs yo(String str) {
        uef uefVar = new uef();
        if (uefVar.uef((xs) null, str) == uef.EnumC0065uef.SUCCESS) {
            return uefVar.oa();
        }
        return null;
    }

    public static String uef(String str, boolean z2) {
        return uef(str, 0, str.length(), z2);
    }

    private List<String> uef(List<String> list, boolean z2) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            String str = list.get(i5);
            arrayList.add(str != null ? uef(str, z2) : null);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static List<String> oa(String str) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 <= str.length()) {
            int iIndexOf = str.indexOf(38, i5);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i5);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i5, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i5, iIndexOf));
                arrayList.add(null);
            }
            i5 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static String uef(String str, int i5, int i10, boolean z2) {
        for (int i11 = i5; i11 < i10; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                com.bytedance.sdk.component.oa.uef.oa.uef uefVar = new com.bytedance.sdk.component.oa.uef.oa.uef();
                uefVar.uef(str, i5, i11);
                uef(uefVar, str, i11, i10, z2);
                return uefVar.yo();
            }
        }
        return str.substring(i5, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void uef(com.bytedance.sdk.component.oa.uef.oa.uef r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = com.bytedance.sdk.component.oa.uef.oa.cz.uef(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.bytedance.sdk.component.oa.uef.oa.cz.uef(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.oa(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.oa(r1)
            goto L3c
        L39:
            r5.uef(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.oa.uef.xs.uef(com.bytedance.sdk.component.oa.uef.oa.uef, java.lang.String, int, int, boolean):void");
    }

    public static boolean uef(String str, int i5, int i10) {
        int i11 = i5 + 2;
        return i11 < i10 && str.charAt(i5) == '%' && com.bytedance.sdk.component.oa.uef.oa.cz.uef(str.charAt(i5 + 1)) != -1 && com.bytedance.sdk.component.oa.uef.oa.cz.uef(str.charAt(i11)) != -1;
    }

    public static String uef(String str, int i5, int i10, String str2, boolean z2, boolean z10, boolean z11, boolean z12, Charset charset) {
        int iCharCount = i5;
        while (iCharCount < i10) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z12) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z2 && (!z10 || uef(str, iCharCount, i10)))) && (iCodePointAt != 43 || !z11)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.oa.uef.oa.uef uefVar = new com.bytedance.sdk.component.oa.uef.oa.uef();
                uefVar.uef(str, i5, iCharCount);
                uef(uefVar, str, iCharCount, i10, str2, z2, z10, z11, z12, charset);
                return uefVar.yo();
            }
        }
        return str.substring(i5, i10);
    }

    public static void uef(com.bytedance.sdk.component.oa.uef.oa.uef uefVar, String str, int i5, int i10, String str2, boolean z2, boolean z10, boolean z11, boolean z12, Charset charset) {
        com.bytedance.sdk.component.oa.uef.oa.uef uefVar2 = null;
        while (i5 < i10) {
            int iCodePointAt = str.codePointAt(i5);
            if (!z2 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z11) {
                    uefVar.uef(z2 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z12) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z2 && (!z10 || uef(str, i5, i10)))))) {
                    uefVar.uef(iCodePointAt);
                } else {
                    if (uefVar2 == null) {
                        uefVar2 = new com.bytedance.sdk.component.oa.uef.oa.uef();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.oa.uef.oa.cz.uef)) {
                        uefVar2.uef(str, i5, Character.charCount(iCodePointAt) + i5, charset);
                    } else {
                        uefVar2.uef(iCodePointAt);
                    }
                    while (!uefVar2.uef()) {
                        byte bOa = uefVar2.oa();
                        int i11 = bOa & ForkServer.ERROR;
                        uefVar.oa(37);
                        char[] cArr = moa;
                        uefVar.oa((int) cArr[(i11 >> 4) & 15]);
                        uefVar.oa((int) cArr[bOa & 15]);
                    }
                }
            }
            i5 += Character.charCount(iCodePointAt);
        }
    }

    public static String uef(String str, String str2, boolean z2, boolean z10, boolean z11, boolean z12) {
        return uef(str, 0, str.length(), str2, z2, z10, z11, z12, null);
    }
}
