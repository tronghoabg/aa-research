package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.Challenge;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.CookieJar;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import ef.InterfaceC2519c;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lcom/applovin/shadow/okhttp3/Headers;", "", "headerName", "", "Lcom/applovin/shadow/okhttp3/Challenge;", "parseChallenges", "(Lcom/applovin/shadow/okhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lcom/applovin/shadow/okio/Buffer;", "", "result", "Lef/C;", "readChallengeHeader", "(Lcom/applovin/shadow/okio/Buffer;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lcom/applovin/shadow/okio/Buffer;)Z", "", "prefix", "startsWith", "(Lcom/applovin/shadow/okio/Buffer;B)Z", "readQuotedString", "(Lcom/applovin/shadow/okio/Buffer;)Ljava/lang/String;", "readToken", "Lcom/applovin/shadow/okhttp3/CookieJar;", "Lcom/applovin/shadow/okhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lcom/applovin/shadow/okhttp3/CookieJar;Lcom/applovin/shadow/okhttp3/HttpUrl;Lcom/applovin/shadow/okhttp3/Headers;)V", "Lcom/applovin/shadow/okhttp3/Response;", "promisesBody", "(Lcom/applovin/shadow/okhttp3/Response;)Z", "response", "hasBody", "Lcom/applovin/shadow/okio/ByteString;", "QUOTED_STRING_DELIMITERS", "Lcom/applovin/shadow/okio/ByteString;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpHeaders {

    @NotNull
    private static final ByteString QUOTED_STRING_DELIMITERS;

    @NotNull
    private static final ByteString TOKEN_DELIMITERS;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        QUOTED_STRING_DELIMITERS = companion.encodeUtf8("\"\\");
        TOKEN_DELIMITERS = companion.encodeUtf8("\t ,=");
    }

    @InterfaceC2519c
    public static final boolean hasBody(@NotNull Response response) {
        AbstractC3340k.e(response, "response");
        return promisesBody(response);
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String headerName) {
        AbstractC3340k.e(headers, "<this>");
        AbstractC3340k.e(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (headerName.equalsIgnoreCase(headers.name(i5))) {
                try {
                    readChallengeHeader(new Buffer().writeUtf8(headers.value(i5)), arrayList);
                } catch (EOFException e7) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e7);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        AbstractC3340k.e(response, "<this>");
        if (AbstractC3340k.a(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(com.applovin.shadow.okio.Buffer r7, java.util.List<com.applovin.shadow.okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb4
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb4
        L21:
            com.applovin.shadow.okhttp3.Challenge r7 = new com.applovin.shadow.okhttp3.Challenge
            ff.w r0 = ff.w.f35433a
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = com.applovin.shadow.okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L63
            if (r6 != 0) goto L40
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L63
        L40:
            com.applovin.shadow.okhttp3.Challenge r2 = new com.applovin.shadow.okhttp3.Challenge
            java.lang.StringBuilder r3 = N0.a.j(r3)
            java.lang.String r4 = "="
            java.lang.String r4 = Bf.r.g0(r4, r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.AbstractC3340k.d(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L63:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = com.applovin.shadow.okhttp3.internal.Util.skipAll(r7, r4)
            int r6 = r6 + r5
        L6d:
            if (r3 != 0) goto L7e
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lb7
            int r5 = com.applovin.shadow.okhttp3.internal.Util.skipAll(r7, r4)
            r6 = r5
        L7e:
            if (r6 == 0) goto Lb7
            r5 = 1
            if (r6 <= r5) goto L84
            goto Lb4
        L84:
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L8b
            goto Lb4
        L8b:
            r5 = 34
            boolean r5 = startsWith(r7, r5)
            if (r5 == 0) goto L98
            java.lang.String r5 = readQuotedString(r7)
            goto L9c
        L98:
            java.lang.String r5 = readToken(r7)
        L9c:
            if (r5 != 0) goto L9f
            goto Lb4
        L9f:
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto La8
            goto Lb4
        La8:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb5
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lb5
        Lb4:
            return
        Lb5:
            r3 = r0
            goto L6d
        Lb7:
            com.applovin.shadow.okhttp3.Challenge r4 = new com.applovin.shadow.okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.http.HttpHeaders.readChallengeHeader(com.applovin.shadow.okio.Buffer, java.util.List):void");
    }

    private static final String readQuotedString(Buffer buffer) throws EOFException {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == 34) {
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == jIndexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, jIndexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static final String readToken(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl url, @NotNull Headers headers) {
        AbstractC3340k.e(cookieJar, "<this>");
        AbstractC3340k.e(url, "url");
        AbstractC3340k.e(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }

    private static final boolean skipCommasAndWhitespace(Buffer buffer) throws EOFException {
        boolean z2 = false;
        while (!buffer.exhausted()) {
            byte b5 = buffer.getByte(0L);
            if (b5 == 44) {
                buffer.readByte();
                z2 = true;
            } else {
                if (b5 != 32 && b5 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z2;
    }

    private static final boolean startsWith(Buffer buffer, byte b5) {
        return !buffer.exhausted() && buffer.getByte(0L) == b5;
    }
}
