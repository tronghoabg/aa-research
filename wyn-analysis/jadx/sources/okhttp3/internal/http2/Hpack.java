package okhttp3.internal.http2;

import cg.AbstractC1613b;
import cg.C1610B;
import cg.C1618g;
import cg.C1621j;
import com.google.android.gms.common.api.f;
import com.unity3d.services.core.network.model.HttpRequest;
import ff.m;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import org.apache.tika.fork.ForkServer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final Hpack f42705a = new Hpack();

    /* renamed from: b, reason: collision with root package name */
    public static final Header[] f42706b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f42707c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Reader {

        /* renamed from: c, reason: collision with root package name */
        public final C1610B f42710c;

        /* renamed from: f, reason: collision with root package name */
        public int f42713f;

        /* renamed from: g, reason: collision with root package name */
        public int f42714g;

        /* renamed from: a, reason: collision with root package name */
        public int f42708a = 4096;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f42709b = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public Header[] f42711d = new Header[8];

        /* renamed from: e, reason: collision with root package name */
        public int f42712e = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.f42710c = AbstractC1613b.d(continuationSource);
        }

        public final int a(int i5) {
            int i10;
            int i11 = 0;
            if (i5 > 0) {
                int length = this.f42711d.length;
                while (true) {
                    length--;
                    i10 = this.f42712e;
                    if (length < i10 || i5 <= 0) {
                        break;
                    }
                    Header header = this.f42711d[length];
                    AbstractC3340k.b(header);
                    int i12 = header.f42704c;
                    i5 -= i12;
                    this.f42714g -= i12;
                    this.f42713f--;
                    i11++;
                }
                Header[] headerArr = this.f42711d;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.f42713f);
                this.f42712e += i11;
            }
            return i11;
        }

        public final C1621j b(int i5) throws IOException {
            if (i5 >= 0) {
                Hpack hpack = Hpack.f42705a;
                hpack.getClass();
                Header[] headerArr = Hpack.f42706b;
                if (i5 <= headerArr.length - 1) {
                    hpack.getClass();
                    return headerArr[i5].f42702a;
                }
            }
            Hpack.f42705a.getClass();
            int length = this.f42712e + 1 + (i5 - Hpack.f42706b.length);
            if (length >= 0) {
                Header[] headerArr2 = this.f42711d;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    AbstractC3340k.b(header);
                    return header.f42702a;
                }
            }
            throw new IOException(AbstractC3340k.k(Integer.valueOf(i5 + 1), "Header index too large "));
        }

        public final void c(Header header) {
            this.f42709b.add(header);
            int i5 = this.f42708a;
            int i10 = header.f42704c;
            if (i10 > i5) {
                Header[] headerArr = this.f42711d;
                m.o0(headerArr, null, 0, headerArr.length);
                this.f42712e = this.f42711d.length - 1;
                this.f42713f = 0;
                this.f42714g = 0;
                return;
            }
            a((this.f42714g + i10) - i5);
            int i11 = this.f42713f + 1;
            Header[] headerArr2 = this.f42711d;
            if (i11 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f42712e = this.f42711d.length - 1;
                this.f42711d = headerArr3;
            }
            int i12 = this.f42712e;
            this.f42712e = i12 - 1;
            this.f42711d[i12] = header;
            this.f42713f++;
            this.f42714g += i10;
        }

        public final C1621j d() {
            int i5;
            C1610B source = this.f42710c;
            byte b5 = source.readByte();
            byte[] bArr = Util.f42438a;
            int i10 = b5 & ForkServer.ERROR;
            int i11 = 0;
            boolean z2 = (b5 & 128) == 128;
            long jE = e(i10, 127);
            if (!z2) {
                return source.a(jE);
            }
            C1618g c1618g = new C1618g();
            Huffman.f42843a.getClass();
            AbstractC3340k.e(source, "source");
            Huffman.Node node = Huffman.f42846d;
            Huffman.Node node2 = node;
            long j8 = 0;
            int i12 = 0;
            while (j8 < jE) {
                j8++;
                byte b10 = source.readByte();
                byte[] bArr2 = Util.f42438a;
                i11 = (i11 << 8) | (b10 & ForkServer.ERROR);
                i12 += 8;
                while (i12 >= 8) {
                    Huffman.Node[] nodeArr = node2.f42847a;
                    AbstractC3340k.b(nodeArr);
                    node2 = nodeArr[(i11 >>> (i12 - 8)) & 255];
                    AbstractC3340k.b(node2);
                    if (node2.f42847a == null) {
                        c1618g.X(node2.f42848b);
                        i12 -= node2.f42849c;
                        node2 = node;
                    } else {
                        i12 -= 8;
                    }
                }
            }
            while (i12 > 0) {
                Huffman.Node[] nodeArr2 = node2.f42847a;
                AbstractC3340k.b(nodeArr2);
                Huffman.Node node3 = nodeArr2[(i11 << (8 - i12)) & 255];
                AbstractC3340k.b(node3);
                if (node3.f42847a != null || (i5 = node3.f42849c) > i12) {
                    break;
                }
                c1618g.X(node3.f42848b);
                i12 -= i5;
                node2 = node;
            }
            return c1618g.z(c1618g.f19902b);
        }

        public final int e(int i5, int i10) {
            int i11 = i5 & i10;
            if (i11 < i10) {
                return i11;
            }
            int i12 = 0;
            while (true) {
                byte b5 = this.f42710c.readByte();
                byte[] bArr = Util.f42438a;
                int i13 = b5 & ForkServer.ERROR;
                if ((b5 & 128) == 0) {
                    return i10 + (i13 << i12);
                }
                i10 += (b5 & 127) << i12;
                i12 += 7;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Writer {

        /* renamed from: a, reason: collision with root package name */
        public final C1618g f42715a;

        /* renamed from: c, reason: collision with root package name */
        public boolean f42717c;

        /* renamed from: g, reason: collision with root package name */
        public int f42721g;

        /* renamed from: h, reason: collision with root package name */
        public int f42722h;

        /* renamed from: b, reason: collision with root package name */
        public int f42716b = f.API_PRIORITY_OTHER;

        /* renamed from: d, reason: collision with root package name */
        public int f42718d = 4096;

        /* renamed from: e, reason: collision with root package name */
        public Header[] f42719e = new Header[8];

        /* renamed from: f, reason: collision with root package name */
        public int f42720f = 7;

        public Writer(C1618g c1618g) {
            this.f42715a = c1618g;
        }

        public final void a(int i5) {
            int i10;
            if (i5 > 0) {
                int length = this.f42719e.length - 1;
                int i11 = 0;
                while (true) {
                    i10 = this.f42720f;
                    if (length < i10 || i5 <= 0) {
                        break;
                    }
                    Header header = this.f42719e[length];
                    AbstractC3340k.b(header);
                    i5 -= header.f42704c;
                    int i12 = this.f42722h;
                    Header header2 = this.f42719e[length];
                    AbstractC3340k.b(header2);
                    this.f42722h = i12 - header2.f42704c;
                    this.f42721g--;
                    i11++;
                    length--;
                }
                Header[] headerArr = this.f42719e;
                int i13 = i10 + 1;
                System.arraycopy(headerArr, i13, headerArr, i13 + i11, this.f42721g);
                Header[] headerArr2 = this.f42719e;
                int i14 = this.f42720f + 1;
                Arrays.fill(headerArr2, i14, i14 + i11, (Object) null);
                this.f42720f += i11;
            }
        }

        public final void b(Header header) {
            int i5 = this.f42718d;
            int i10 = header.f42704c;
            if (i10 > i5) {
                Header[] headerArr = this.f42719e;
                m.o0(headerArr, null, 0, headerArr.length);
                this.f42720f = this.f42719e.length - 1;
                this.f42721g = 0;
                this.f42722h = 0;
                return;
            }
            a((this.f42722h + i10) - i5);
            int i11 = this.f42721g + 1;
            Header[] headerArr2 = this.f42719e;
            if (i11 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f42720f = this.f42719e.length - 1;
                this.f42719e = headerArr3;
            }
            int i12 = this.f42720f;
            this.f42720f = i12 - 1;
            this.f42719e[i12] = header;
            this.f42721g++;
            this.f42722h += i10;
        }

        public final void c(C1621j data) throws EOFException {
            AbstractC3340k.e(data, "data");
            C1618g c1618g = this.f42715a;
            Huffman.f42843a.getClass();
            int iD = data.d();
            int i5 = 0;
            int i10 = 0;
            long j8 = 0;
            while (i10 < iD) {
                int i11 = i10 + 1;
                byte bI = data.i(i10);
                byte[] bArr = Util.f42438a;
                j8 += Huffman.f42845c[bI & ForkServer.ERROR];
                i10 = i11;
            }
            if (((int) ((j8 + 7) >> 3)) >= data.d()) {
                e(data.d(), 127, 0);
                c1618g.Q(data);
                return;
            }
            C1618g c1618g2 = new C1618g();
            Huffman.f42843a.getClass();
            int iD2 = data.d();
            long j10 = 0;
            int i12 = 0;
            while (i5 < iD2) {
                int i13 = i5 + 1;
                byte bI2 = data.i(i5);
                byte[] bArr2 = Util.f42438a;
                int i14 = bI2 & ForkServer.ERROR;
                int i15 = Huffman.f42844b[i14];
                byte b5 = Huffman.f42845c[i14];
                j10 = (j10 << b5) | i15;
                i12 += b5;
                while (i12 >= 8) {
                    i12 -= 8;
                    c1618g2.X((int) (j10 >> i12));
                }
                i5 = i13;
            }
            if (i12 > 0) {
                c1618g2.X((int) ((255 >>> i12) | (j10 << (8 - i12))));
            }
            C1621j c1621jZ = c1618g2.z(c1618g2.f19902b);
            e(c1621jZ.d(), 127, 128);
            c1618g.Q(c1621jZ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(java.util.ArrayList r15) throws java.io.EOFException {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.d(java.util.ArrayList):void");
        }

        public final void e(int i5, int i10, int i11) {
            C1618g c1618g = this.f42715a;
            if (i5 < i10) {
                c1618g.X(i5 | i11);
                return;
            }
            c1618g.X(i11 | i10);
            int i12 = i5 - i10;
            while (i12 >= 128) {
                c1618g.X(128 | (i12 & 127));
                i12 >>>= 7;
            }
            c1618g.X(i12);
        }
    }

    static {
        Header header = new Header(Header.f42701i, "");
        C1621j c1621j = Header.f42698f;
        Header header2 = new Header(c1621j, "GET");
        Header header3 = new Header(c1621j, "POST");
        C1621j c1621j2 = Header.f42699g;
        Header header4 = new Header(c1621j2, "/");
        Header header5 = new Header(c1621j2, "/index.html");
        C1621j c1621j3 = Header.f42700h;
        Header header6 = new Header(c1621j3, "http");
        Header header7 = new Header(c1621j3, HttpRequest.DEFAULT_SCHEME);
        C1621j c1621j4 = Header.f42697e;
        int i5 = 0;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(c1621j4, "200"), new Header(c1621j4, "204"), new Header(c1621j4, "206"), new Header(c1621j4, "304"), new Header(c1621j4, "400"), new Header(c1621j4, "404"), new Header(c1621j4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f42706b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        while (i5 < length) {
            int i10 = i5 + 1;
            if (!linkedHashMap.containsKey(headerArr[i5].f42702a)) {
                linkedHashMap.put(headerArr[i5].f42702a, Integer.valueOf(i5));
            }
            i5 = i10;
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        AbstractC3340k.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        f42707c = mapUnmodifiableMap;
    }

    private Hpack() {
    }

    public static void a(C1621j name) {
        AbstractC3340k.e(name, "name");
        int iD = name.d();
        int i5 = 0;
        while (i5 < iD) {
            int i10 = i5 + 1;
            byte bI = name.i(i5);
            if (65 <= bI && bI <= 90) {
                throw new IOException(AbstractC3340k.k(name.t(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
            i5 = i10;
        }
    }
}
