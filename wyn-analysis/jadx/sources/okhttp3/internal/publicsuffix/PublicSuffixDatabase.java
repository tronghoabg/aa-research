package okhttp3.internal.publicsuffix;

import Af.n;
import Bf.k;
import cg.AbstractC1613b;
import cg.C1610B;
import cg.r;
import ff.o;
import ff.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.apache.tika.fork.ForkServer;
import r7.AbstractC3935e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f42917e = new Companion(0);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f42918f = {42};

    /* renamed from: g, reason: collision with root package name */
    public static final List f42919g = AbstractC3935e.C("*");

    /* renamed from: h, reason: collision with root package name */
    public static final PublicSuffixDatabase f42920h = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f42921a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f42922b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f42923c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f42924d;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "", "EXCEPTION_MARKER", "C", "", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "", "WILDCARD_LABEL", "[B", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        public static final String a(Companion companion, byte[] bArr, byte[][] bArr2, int i5) {
            int i10;
            boolean z2;
            int i11;
            int i12;
            int i13 = -1;
            companion.getClass();
            int length = bArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = (i14 + length) / 2;
                while (i15 > i13 && bArr[i15] != 10) {
                    i15 += i13;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i10 = i16 + i17;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i17++;
                }
                int i18 = i10 - i16;
                int i19 = i5;
                boolean z10 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z10) {
                        i11 = 46;
                        z2 = false;
                    } else {
                        byte b5 = bArr2[i19][i20];
                        byte[] bArr3 = Util.f42438a;
                        int i22 = b5 & ForkServer.ERROR;
                        z2 = z10;
                        i11 = i22;
                    }
                    byte b10 = bArr[i16 + i21];
                    byte[] bArr4 = Util.f42438a;
                    i12 = i11 - (b10 & ForkServer.ERROR);
                    if (i12 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z10 = z2;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        z10 = true;
                        i20 = -1;
                    }
                }
                if (i12 >= 0) {
                    if (i12 <= 0) {
                        int i23 = i18 - i21;
                        int length2 = bArr2[i19].length - i20;
                        int length3 = bArr2.length;
                        for (int i24 = i19 + 1; i24 < length3; i24++) {
                            length2 += bArr2[i24].length;
                        }
                        if (length2 >= i23) {
                            if (length2 <= i23) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                AbstractC3340k.d(UTF_8, "UTF_8");
                                return new String(bArr, i16, i18, UTF_8);
                            }
                        }
                        length = i15;
                    }
                    i14 = i10 + 1;
                } else {
                    length = i15;
                }
                i13 = -1;
            }
            return null;
        }

        private Companion() {
        }
    }

    public static List c(String str) {
        List listH0 = k.H0(str, new char[]{'.'});
        return AbstractC3340k.a(o.y0(listH0), "") ? o.m0(listH0) : listH0;
    }

    public final String a(String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        List listH0;
        String unicodeDomain = IDN.toUnicode(str);
        AbstractC3340k.d(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        if (this.f42921a.get() || !this.f42921a.compareAndSet(false, true)) {
            try {
                this.f42922b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } finally {
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z2 = true;
                } catch (IOException e7) {
                    Platform.f42887a.getClass();
                    Platform.f42888b.getClass();
                    Platform.i("Failed to read public suffix list", 5, e7);
                    if (z2) {
                    }
                }
            }
        }
        if (this.f42923c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = listC.size();
        byte[][] bArr = new byte[size][];
        for (int i5 = 0; i5 < size; i5++) {
            String str2 = (String) listC.get(i5);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC3340k.d(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            AbstractC3340k.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i5] = bytes;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strA = null;
                break;
            }
            int i11 = i10 + 1;
            Companion companion = f42917e;
            byte[] bArr2 = this.f42923c;
            if (bArr2 == null) {
                AbstractC3340k.m("publicSuffixListBytes");
                throw null;
            }
            strA = Companion.a(companion, bArr2, bArr, i10);
            if (strA != null) {
                break;
            }
            i10 = i11;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i12 + 1;
                bArr3[i12] = f42918f;
                Companion companion2 = f42917e;
                byte[] bArr4 = this.f42923c;
                if (bArr4 == null) {
                    AbstractC3340k.m("publicSuffixListBytes");
                    throw null;
                }
                strA2 = Companion.a(companion2, bArr4, bArr3, i12);
                if (strA2 != null) {
                    break;
                }
                i12 = i13;
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i14 = size - 1;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                Companion companion3 = f42917e;
                byte[] bArr5 = this.f42924d;
                if (bArr5 == null) {
                    AbstractC3340k.m("publicSuffixExceptionListBytes");
                    throw null;
                }
                strA3 = Companion.a(companion3, bArr5, bArr, i15);
                if (strA3 != null) {
                    break;
                }
                i15 = i16;
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listH0 = k.H0(AbstractC3340k.k(strA3, "!"), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listH0 = f42919g;
        } else {
            List listH02 = strA == null ? null : k.H0(strA, new char[]{'.'});
            List list = v.f35432a;
            if (listH02 == null) {
                listH02 = list;
            }
            List listH03 = strA2 == null ? null : k.H0(strA2, new char[]{'.'});
            if (listH03 != null) {
                list = listH03;
            }
            listH0 = listH02.size() > list.size() ? listH02 : list;
        }
        if (listC.size() != listH0.size() || ((String) listH0.get(0)).charAt(0) == '!') {
            return n.b0(n.U(o.j0(c(str)), ((String) listH0.get(0)).charAt(0) == '!' ? listC.size() - listH0.size() : listC.size() - (listH0.size() + 1)), ".");
        }
        return null;
    }

    public final void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        C1610B c1610bD = AbstractC1613b.d(new r(AbstractC1613b.m(resourceAsStream)));
        try {
            long j8 = c1610bD.readInt();
            c1610bD.require(j8);
            byte[] byteArray = c1610bD.f19864b.readByteArray(j8);
            long j10 = c1610bD.readInt();
            c1610bD.require(j10);
            byte[] byteArray2 = c1610bD.f19864b.readByteArray(j10);
            c1610bD.close();
            synchronized (this) {
                this.f42923c = byteArray;
                this.f42924d = byteArray2;
            }
            this.f42922b.countDown();
        } finally {
        }
    }
}
