package okhttp3;

import Bf.k;
import android.support.v4.media.session.b;
import cg.C1618g;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import ff.p;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import org.apache.tika.fork.ForkServer;
import zf.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/HttpUrl;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HttpUrl {
    public static final Companion k = new Companion(0);

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f42272l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f42273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42274b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42275c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42277e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f42278f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f42279g;

    /* renamed from: h, reason: collision with root package name */
    public final String f42280h;

    /* renamed from: i, reason: collision with root package name */
    public final String f42281i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f42282j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: i, reason: collision with root package name */
        public static final Companion f42283i = new Companion(0);

        /* renamed from: a, reason: collision with root package name */
        public String f42284a;

        /* renamed from: d, reason: collision with root package name */
        public String f42287d;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f42289f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f42290g;

        /* renamed from: h, reason: collision with root package name */
        public String f42291h;

        /* renamed from: b, reason: collision with root package name */
        public String f42285b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f42286c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f42288e = -1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "<init>", "()V", "", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(int i5) {
                this();
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f42289f = arrayList;
            arrayList.add("");
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.f42284a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.k;
            String strE = Companion.e(companion, this.f42285b, 0, 0, 7);
            String strE2 = Companion.e(companion, this.f42286c, 0, 0, 7);
            String str2 = this.f42287d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = this.f42288e;
            if (iB == -1) {
                String str3 = this.f42284a;
                AbstractC3340k.b(str3);
                companion.getClass();
                iB = Companion.b(str3);
            }
            ArrayList arrayList2 = this.f42289f;
            ArrayList arrayList3 = new ArrayList(p.a0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Companion.e(HttpUrl.k, (String) it.next(), 0, 0, 7));
            }
            ArrayList<String> arrayList4 = this.f42290g;
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(p.a0(arrayList4, 10));
                for (String str4 : arrayList4) {
                    arrayList.add(str4 == null ? null : Companion.e(HttpUrl.k, str4, 0, 0, 3));
                }
            }
            String str5 = this.f42291h;
            return new HttpUrl(str, strE, strE2, str2, iB, arrayList3, arrayList, str5 != null ? Companion.e(HttpUrl.k, str5, 0, 0, 7) : null, toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(okhttp3.HttpUrl r25, java.lang.String r26) throws java.lang.NumberFormatException, java.io.EOFException {
            /*
                Method dump skipped, instructions count: 955
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.b(okhttp3.HttpUrl, java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f42284a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f42285b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f42286c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f42285b
                r0.append(r1)
                java.lang.String r1 = r6.f42286c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f42286c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f42287d
                if (r1 == 0) goto L63
                boolean r1 = Bf.k.o0(r1, r2)
                if (r1 == 0) goto L5e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f42287d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L63
            L5e:
                java.lang.String r1 = r6.f42287d
                r0.append(r1)
            L63:
                int r1 = r6.f42288e
                r3 = -1
                if (r1 != r3) goto L6c
                java.lang.String r4 = r6.f42284a
                if (r4 == 0) goto L92
            L6c:
                if (r1 == r3) goto L6f
                goto L7d
            L6f:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.k
                java.lang.String r3 = r6.f42284a
                kotlin.jvm.internal.AbstractC3340k.b(r3)
                r1.getClass()
                int r1 = okhttp3.HttpUrl.Companion.b(r3)
            L7d:
                java.lang.String r3 = r6.f42284a
                if (r3 == 0) goto L8c
                okhttp3.HttpUrl$Companion r4 = okhttp3.HttpUrl.k
                r4.getClass()
                int r3 = okhttp3.HttpUrl.Companion.b(r3)
                if (r1 == r3) goto L92
            L8c:
                r0.append(r2)
                r0.append(r1)
            L92:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.k
                java.util.ArrayList r2 = r6.f42289f
                r1.getClass()
                java.lang.String r1 = "<this>"
                kotlin.jvm.internal.AbstractC3340k.e(r2, r1)
                int r1 = r2.size()
                r3 = 0
            La3:
                if (r3 >= r1) goto Lb7
                int r4 = r3 + 1
                r5 = 47
                r0.append(r5)
                java.lang.Object r3 = r2.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                r0.append(r3)
                r3 = r4
                goto La3
            Lb7:
                java.util.ArrayList r1 = r6.f42290g
                if (r1 == 0) goto Lcd
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.k
                java.util.ArrayList r2 = r6.f42290g
                kotlin.jvm.internal.AbstractC3340k.b(r2)
                r1.getClass()
                okhttp3.HttpUrl.Companion.g(r2, r0)
            Lcd:
                java.lang.String r1 = r6.f42291h
                if (r1 == 0) goto Ldb
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f42291h
                r0.append(r1)
            Ldb:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.AbstractC3340k.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static String a(Companion companion, String str, int i5, int i10, String str2, int i11) throws EOFException {
            int i12 = (i11 & 1) != 0 ? 0 : i5;
            int length = (i11 & 2) != 0 ? str.length() : i10;
            boolean z2 = (i11 & 8) == 0;
            boolean z10 = (i11 & 16) == 0;
            boolean z11 = (i11 & 32) == 0;
            boolean z12 = (i11 & 64) == 0;
            companion.getClass();
            AbstractC3340k.e(str, "<this>");
            int iCharCount = i12;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i13 = 32;
                int i14 = 128;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || k.o0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z2 || (z10 && !d(str, iCharCount, length)))) || (iCodePointAt == 43 && z11)))) {
                    C1618g c1618g = new C1618g();
                    c1618g.c0(i12, iCharCount, str);
                    C1618g c1618g2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z11) {
                                c1618g.d0(z2 ? "+" : "%2B");
                            } else if (iCodePointAt2 < i13 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i14 && !z12) || k.o0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z2 || (z10 && !d(str, iCharCount, length)))))) {
                                if (c1618g2 == null) {
                                    c1618g2 = new C1618g();
                                }
                                c1618g2.e0(iCodePointAt2);
                                while (!c1618g2.exhausted()) {
                                    byte b5 = c1618g2.readByte();
                                    int i15 = b5 & ForkServer.ERROR;
                                    c1618g.X(37);
                                    char[] cArr = HttpUrl.f42272l;
                                    c1618g.X(cArr[(i15 >> 4) & 15]);
                                    c1618g.X(cArr[b5 & 15]);
                                }
                            } else {
                                c1618g.e0(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i13 = 32;
                        i14 = 128;
                    }
                    return c1618g.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i12, length);
            AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static int b(String scheme) {
            AbstractC3340k.e(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        }

        public static HttpUrl c(String str) throws NumberFormatException, EOFException {
            AbstractC3340k.e(str, "<this>");
            Builder builder = new Builder();
            builder.b(null, str);
            return builder.a();
        }

        public static boolean d(String str, int i5, int i10) {
            int i11 = i5 + 2;
            return i11 < i10 && str.charAt(i5) == '%' && Util.q(str.charAt(i5 + 1)) != -1 && Util.q(str.charAt(i11)) != -1;
        }

        public static String e(Companion companion, String str, int i5, int i10, int i11) {
            int i12;
            if ((i11 & 1) != 0) {
                i5 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            boolean z2 = (i11 & 4) == 0;
            companion.getClass();
            AbstractC3340k.e(str, "<this>");
            int iCharCount = i5;
            while (iCharCount < i10) {
                int i13 = iCharCount + 1;
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                    C1618g c1618g = new C1618g();
                    c1618g.c0(i5, iCharCount, str);
                    while (iCharCount < i10) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i12 = iCharCount + 2) < i10) {
                            int iQ = Util.q(str.charAt(iCharCount + 1));
                            int iQ2 = Util.q(str.charAt(i12));
                            if (iQ == -1 || iQ2 == -1) {
                                c1618g.e0(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                c1618g.X((iQ << 4) + iQ2);
                                iCharCount = Character.charCount(iCodePointAt) + i12;
                            }
                        } else if (iCodePointAt == 43 && z2) {
                            c1618g.X(32);
                            iCharCount++;
                        } else {
                            c1618g.e0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return c1618g.readUtf8();
                }
                iCharCount = i13;
            }
            String strSubstring = str.substring(i5, i10);
            AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static ArrayList f(String str) {
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 <= str.length()) {
                int iV0 = k.v0(str, '&', i5, 4);
                if (iV0 == -1) {
                    iV0 = str.length();
                }
                int iV02 = k.v0(str, '=', i5, 4);
                if (iV02 == -1 || iV02 > iV0) {
                    String strSubstring = str.substring(i5, iV0);
                    AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i5, iV02);
                    AbstractC3340k.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iV02 + 1, iV0);
                    AbstractC3340k.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i5 = iV0 + 1;
            }
            return arrayList;
        }

        public static void g(ArrayList arrayList, StringBuilder sb2) {
            AbstractC3340k.e(arrayList, "<this>");
            e eVarR0 = b.r0(b.u0(0, arrayList.size()), 2);
            int i5 = eVarR0.f48500a;
            int i10 = eVarR0.f48501b;
            int i11 = eVarR0.f48502c;
            if ((i11 <= 0 || i5 > i10) && (i11 >= 0 || i10 > i5)) {
                return;
            }
            while (true) {
                int i12 = i5 + i11;
                String str = (String) arrayList.get(i5);
                String str2 = (String) arrayList.get(i5 + 1);
                if (i5 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i5 == i10) {
                    return;
                } else {
                    i5 = i12;
                }
            }
        }

        private Companion() {
        }
    }

    public HttpUrl(String scheme, String str, String str2, String host, int i5, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        AbstractC3340k.e(scheme, "scheme");
        AbstractC3340k.e(host, "host");
        this.f42273a = scheme;
        this.f42274b = str;
        this.f42275c = str2;
        this.f42276d = host;
        this.f42277e = i5;
        this.f42278f = arrayList;
        this.f42279g = arrayList2;
        this.f42280h = str3;
        this.f42281i = str4;
        this.f42282j = scheme.equals(HttpRequest.DEFAULT_SCHEME);
    }

    public final String a() {
        if (this.f42275c.length() == 0) {
            return "";
        }
        int length = this.f42273a.length() + 3;
        String str = this.f42281i;
        String strSubstring = str.substring(k.v0(str, ':', length, 4) + 1, k.v0(str, '@', 0, 6));
        AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f42273a.length() + 3;
        String str = this.f42281i;
        int iV0 = k.v0(str, '/', length, 4);
        String strSubstring = str.substring(iV0, Util.f(str, "?#", iV0, str.length()));
        AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f42273a.length() + 3;
        String str = this.f42281i;
        int iV0 = k.v0(str, '/', length, 4);
        int iF = Util.f(str, "?#", iV0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iV0 < iF) {
            int i5 = iV0 + 1;
            int iE = Util.e(str, '/', i5, iF);
            String strSubstring = str.substring(i5, iE);
            AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iV0 = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f42279g == null) {
            return null;
        }
        String str = this.f42281i;
        int iV0 = k.v0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iV0, Util.e(str, '#', iV0, str.length()));
        AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f42274b.length() == 0) {
            return "";
        }
        int length = this.f42273a.length() + 3;
        String str = this.f42281i;
        String strSubstring = str.substring(length, Util.f(str, ":@", length, str.length()));
        AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && AbstractC3340k.a(((HttpUrl) obj).f42281i, this.f42281i);
    }

    public final Builder f() {
        Builder builder = new Builder();
        String str = this.f42273a;
        builder.f42284a = str;
        builder.f42285b = e();
        builder.f42286c = a();
        builder.f42287d = this.f42276d;
        Companion companion = k;
        companion.getClass();
        int iB = Companion.b(str);
        int i5 = this.f42277e;
        if (i5 == iB) {
            i5 = -1;
        }
        builder.f42288e = i5;
        ArrayList arrayList = builder.f42289f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        builder.f42290g = strD == null ? null : Companion.f(Companion.a(companion, strD, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.QUERY_ENCODE_SET, 211));
        if (this.f42280h != null) {
            String str2 = this.f42281i;
            strSubstring = str2.substring(k.v0(str2, '#', 0, 6) + 1);
            AbstractC3340k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        builder.f42291h = strSubstring;
        return builder;
    }

    public final Builder g(String link) {
        AbstractC3340k.e(link, "link");
        try {
            Builder builder = new Builder();
            builder.b(this, link);
            return builder;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() {
        Builder builderG = g("/...");
        AbstractC3340k.b(builderG);
        Companion companion = k;
        builderG.f42285b = Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        builderG.f42286c = Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return builderG.a().f42281i;
    }

    public final int hashCode() {
        return this.f42281i.hashCode();
    }

    public final URI i() {
        String strReplaceAll;
        Builder builderF = f();
        String str = builderF.f42287d;
        if (str == null) {
            strReplaceAll = null;
        } else {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC3340k.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            AbstractC3340k.d(strReplaceAll, "replaceAll(...)");
        }
        builderF.f42287d = strReplaceAll;
        ArrayList arrayList = builderF.f42289f;
        int size = arrayList.size();
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, Companion.a(k, (String) arrayList.get(i10), 0, 0, com.applovin.shadow.okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE));
        }
        ArrayList arrayList2 = builderF.f42290g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i5 < size2) {
                int i11 = i5 + 1;
                String str2 = (String) arrayList2.get(i5);
                arrayList2.set(i5, str2 == null ? null : Companion.a(k, str2, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, 195));
                i5 = i11;
            }
        }
        String str3 = builderF.f42291h;
        builderF.f42291h = str3 != null ? Companion.a(k, str3, 0, 0, com.applovin.shadow.okhttp3.HttpUrl.FRAGMENT_ENCODE_SET_URI, 163) : null;
        String string = builderF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e7) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC3340k.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                AbstractC3340k.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC3340k.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* renamed from: toString, reason: from getter */
    public final String getF42281i() {
        return this.f42281i;
    }
}
