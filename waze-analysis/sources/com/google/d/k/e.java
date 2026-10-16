package com.google.d.k;

import androidx.media3.common.MimeTypes;
import androidx.webkit.ProxyConfig;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.libraries.phenotype.client.stable.l;
import com.google.d.b.aa;
import com.google.d.b.an;
import com.google.d.b.p;
import com.google.d.b.v;
import com.google.d.b.w;
import com.google.d.d.bo;
import com.google.d.d.bx;
import com.google.d.d.fo;
import j$.util.Objects;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7944a;

    /* renamed from: b, reason: collision with root package name */
    private static final bo f7945b;

    /* renamed from: c, reason: collision with root package name */
    private static final p f7946c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f7947d;

    /* renamed from: e, reason: collision with root package name */
    private static final v f7948e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7949f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7950g;

    /* renamed from: h, reason: collision with root package name */
    private final bo f7951h;

    /* renamed from: i, reason: collision with root package name */
    private String f7952i;

    /* renamed from: j, reason: collision with root package name */
    private int f7953j;

    static {
        String strK = an.K(StandardCharsets.UTF_8.name());
        bx bxVar = new bx();
        bxVar.c(strK);
        f7945b = bxVar.b();
        f7946c = p.g().e(p.i().b()).e(p.m()).e(p.j("()<>@,;:\\\"/[]?="));
        p.g().e(p.j("\"\\\r"));
        p.f(" \t\r\n");
        f7947d = new HashMap();
        f(ProxyConfig.MATCH_ALL_SCHEMES, ProxyConfig.MATCH_ALL_SCHEMES);
        f("text", ProxyConfig.MATCH_ALL_SCHEMES);
        f("image", ProxyConfig.MATCH_ALL_SCHEMES);
        f(MimeTypes.BASE_TYPE_AUDIO, ProxyConfig.MATCH_ALL_SCHEMES);
        f(MimeTypes.BASE_TYPE_VIDEO, ProxyConfig.MATCH_ALL_SCHEMES);
        f(MimeTypes.BASE_TYPE_APPLICATION, ProxyConfig.MATCH_ALL_SCHEMES);
        f("font", ProxyConfig.MATCH_ALL_SCHEMES);
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        f("image", "bmp");
        f("image", "x-canon-crw");
        f("image", "gif");
        f("image", "vnd.microsoft.icon");
        f("image", "jpeg");
        f("image", "png");
        f("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        f("image", "tiff");
        f("image", "avif");
        f("image", "webp");
        f("image", "heif");
        f("image", "jp2");
        f(MimeTypes.BASE_TYPE_AUDIO, "mp4");
        f(MimeTypes.BASE_TYPE_AUDIO, "mpeg");
        f(MimeTypes.BASE_TYPE_AUDIO, "ogg");
        f(MimeTypes.BASE_TYPE_AUDIO, "webm");
        f(MimeTypes.BASE_TYPE_AUDIO, "l16");
        f(MimeTypes.BASE_TYPE_AUDIO, "l24");
        f(MimeTypes.BASE_TYPE_AUDIO, "basic");
        f(MimeTypes.BASE_TYPE_AUDIO, "aac");
        f(MimeTypes.BASE_TYPE_AUDIO, "vorbis");
        f(MimeTypes.BASE_TYPE_AUDIO, "x-ms-wma");
        f(MimeTypes.BASE_TYPE_AUDIO, "x-ms-wax");
        f(MimeTypes.BASE_TYPE_AUDIO, "vnd.rn-realaudio");
        f(MimeTypes.BASE_TYPE_AUDIO, "vnd.wave");
        f(MimeTypes.BASE_TYPE_VIDEO, "mp4");
        f(MimeTypes.BASE_TYPE_VIDEO, "mpeg");
        f(MimeTypes.BASE_TYPE_VIDEO, "ogg");
        f(MimeTypes.BASE_TYPE_VIDEO, "quicktime");
        f(MimeTypes.BASE_TYPE_VIDEO, "webm");
        f(MimeTypes.BASE_TYPE_VIDEO, "x-ms-wmv");
        f(MimeTypes.BASE_TYPE_VIDEO, "x-flv");
        f(MimeTypes.BASE_TYPE_VIDEO, "3gpp");
        f(MimeTypes.BASE_TYPE_VIDEO, "3gpp2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "atom+xml");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-bzip2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "dart");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.apple.pkpass");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-fontobject");
        f(MimeTypes.BASE_TYPE_APPLICATION, "epub+zip");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-www-form-urlencoded");
        f(MimeTypes.BASE_TYPE_APPLICATION, "pkcs12");
        f(MimeTypes.BASE_TYPE_APPLICATION, "binary");
        f(MimeTypes.BASE_TYPE_APPLICATION, "cbor");
        f(MimeTypes.BASE_TYPE_APPLICATION, "geo+json");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-gzip");
        f(MimeTypes.BASE_TYPE_APPLICATION, "hal+json");
        b(MimeTypes.BASE_TYPE_APPLICATION, "javascript");
        f(MimeTypes.BASE_TYPE_APPLICATION, "jose");
        f(MimeTypes.BASE_TYPE_APPLICATION, "jose+json");
        f7944a = b(MimeTypes.BASE_TYPE_APPLICATION, "json");
        f(MimeTypes.BASE_TYPE_APPLICATION, "jwt");
        b(MimeTypes.BASE_TYPE_APPLICATION, "manifest+json");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.google-earth.kml+xml");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.google-earth.kmz");
        f(MimeTypes.BASE_TYPE_APPLICATION, "mbox");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-apple-aspen-config");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-excel");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-outlook");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.ms-powerpoint");
        f(MimeTypes.BASE_TYPE_APPLICATION, "msword");
        f(MimeTypes.BASE_TYPE_APPLICATION, "dash+xml");
        f(MimeTypes.BASE_TYPE_APPLICATION, "wasm");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-nacl");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-pem-file");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-pnacl");
        f(MimeTypes.BASE_TYPE_APPLICATION, "octet-stream");
        f(MimeTypes.BASE_TYPE_APPLICATION, "ogg");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.wordprocessingml.document");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.presentationml.presentation");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.graphics");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.presentation");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.spreadsheet");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.oasis.opendocument.text");
        b(MimeTypes.BASE_TYPE_APPLICATION, "opensearchdescription+xml");
        f(MimeTypes.BASE_TYPE_APPLICATION, "pdf");
        f(MimeTypes.BASE_TYPE_APPLICATION, "postscript");
        f(MimeTypes.BASE_TYPE_APPLICATION, "protobuf");
        b(MimeTypes.BASE_TYPE_APPLICATION, "rdf+xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "rtf");
        f(MimeTypes.BASE_TYPE_APPLICATION, "font-sfnt");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-shockwave-flash");
        f(MimeTypes.BASE_TYPE_APPLICATION, "vnd.sketchup.skp");
        b(MimeTypes.BASE_TYPE_APPLICATION, "soap+xml");
        f(MimeTypes.BASE_TYPE_APPLICATION, "x-tar");
        f(MimeTypes.BASE_TYPE_APPLICATION, "font-woff");
        f(MimeTypes.BASE_TYPE_APPLICATION, "font-woff2");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xhtml+xml");
        b(MimeTypes.BASE_TYPE_APPLICATION, "xrd+xml");
        f(MimeTypes.BASE_TYPE_APPLICATION, "zip");
        f("font", "collection");
        f("font", "otf");
        f("font", "sfnt");
        f("font", "ttf");
        f("font", "woff");
        f("font", "woff2");
        f(MimeTypes.BASE_TYPE_APPLICATION, "yaml");
        f7948e = w.b("; ").a("=");
    }

    private e(String str, String str2, bo boVar) {
        this.f7949f = str;
        this.f7950g = str2;
        this.f7951h = boVar;
    }

    static /* synthetic */ String a(String str) {
        if (f7946c.l(str) && !str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\r' || cCharAt == '\\') {
                sb.append('\\');
            } else if (cCharAt == '\"') {
                cCharAt = '\"';
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return sb.toString();
    }

    private static e b(String str, String str2) {
        e eVar = new e(str, str2, f7945b);
        e(eVar);
        aa.i(StandardCharsets.UTF_8);
        return eVar;
    }

    private final String c() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7949f);
        sb.append('/');
        sb.append(this.f7950g);
        bo boVar = this.f7951h;
        if (!boVar.F()) {
            sb.append("; ");
            f7948e.a(sb, fo.t(boVar, new d()).z());
        }
        return sb.toString();
    }

    private final Map d() {
        return fo.A(this.f7951h.e(), new l(4));
    }

    private static void e(e eVar) {
        f7947d.put(eVar, eVar);
    }

    private static void f(String str, String str2) {
        e(new e(str, str2, bo.b()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f7949f.equals(eVar.f7949f) && this.f7950g.equals(eVar.f7950g) && d().equals(eVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f7953j;
        if (i2 != 0) {
            return i2;
        }
        int iHash = Objects.hash(this.f7949f, this.f7950g, d());
        this.f7953j = iHash;
        return iHash;
    }

    public final String toString() throws IOException {
        String str = this.f7952i;
        if (str != null) {
            return str;
        }
        String strC = c();
        this.f7952i = strC;
        return strC;
    }
}
