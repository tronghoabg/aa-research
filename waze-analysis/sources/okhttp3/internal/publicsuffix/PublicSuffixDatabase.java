package okhttp3.internal.publicsuffix;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.webkit.ProxyConfig;
import h.a.i;
import h.g.b.aq;
import h.g.b.x;
import h.m.b;
import h.m.k;
import h.n.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k.j;
import k.t;
import k.y;
import okhttp3.internal.g.g;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final a Companion = new a();
    private static final byte[] WILDCARD_LABEL = {StylePropertiesKt.TextDirectionId};
    private static final List<String> PREVAILING_RULE = i.d(ProxyConfig.MATCH_ALL_SCHEMES);
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    private final List<String> findMatchingRule(List<String> list) throws InterruptedException {
        String str;
        String strA;
        String strA2;
        List<String> listH;
        List<String> listH2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = list.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            x.e(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            x.e(bytes, "getBytes(...)");
            bArr[i2] = bytes;
        }
        byte[][] bArr2 = bArr;
        int length = bArr2.length;
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                strA = null;
                break;
            }
            byte[] bArr3 = this.publicSuffixListBytes;
            if (bArr3 == null) {
                x.j("publicSuffixListBytes");
                bArr3 = null;
            }
            strA = a.a(bArr3, bArr, i3);
            if (strA != null) {
                break;
            }
            i3++;
        }
        if (bArr2.length > 1) {
            byte[][] bArr4 = (byte[][]) bArr2.clone();
            int length2 = bArr4.length - 1;
            for (int i4 = 0; i4 < length2; i4++) {
                bArr4[i4] = WILDCARD_LABEL;
                byte[] bArr5 = this.publicSuffixListBytes;
                if (bArr5 == null) {
                    x.j("publicSuffixListBytes");
                    bArr5 = null;
                }
                strA2 = a.a(bArr5, bArr4, i4);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int length3 = bArr2.length - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= length3) {
                    break;
                }
                byte[] bArr6 = this.publicSuffixExceptionListBytes;
                if (bArr6 == null) {
                    x.j("publicSuffixExceptionListBytes");
                    bArr6 = null;
                }
                String strA3 = a.a(bArr6, bArr, i5);
                if (strA3 != null) {
                    str = strA3;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return o.ae("!".concat(str), new char[]{'.'});
        }
        if (strA == null && strA2 == null) {
            return PREVAILING_RULE;
        }
        if (strA == null || (listH = o.ae(strA, new char[]{'.'})) == null) {
            listH = i.h();
        }
        if (strA2 == null || (listH2 = o.ae(strA2, new char[]{'.'})) == null) {
            listH2 = i.h();
        }
        return listH.size() > listH2.size() ? listH : listH2;
    }

    private final void readTheList() {
        try {
            aq aqVar = new aq();
            aq aqVar2 = new aq();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                j jVarC = y.c(new t(y.f(resourceAsStream)));
                try {
                    j jVar = jVarC;
                    aqVar.f48105a = jVar.U(jVar.e());
                    aqVar2.f48105a = jVar.U(jVar.e());
                    i.aW(jVarC, null);
                    synchronized (this) {
                        Object obj = aqVar.f48105a;
                        x.c(obj);
                        this.publicSuffixListBytes = (byte[]) obj;
                        Object obj2 = aqVar2.f48105a;
                        x.c(obj2);
                        this.publicSuffixExceptionListBytes = (byte[]) obj2;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    g.f56287a.m("Failed to read public suffix list", 5, e2);
                    if (!z) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List<String> splitDomain(String str) {
        List<String> listAe = o.ae(str, new char[]{'.'});
        return x.n(i.T(listAe), "") ? i.aK(listAe) : listAe;
    }

    public final String getEffectiveTldPlusOne(String str) throws InterruptedException {
        int size;
        int size2;
        x.f(str, "domain");
        String unicode = IDN.toUnicode(str);
        x.c(unicode);
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        int i2 = size - size2;
        h.m.t tVarAv = i.av(splitDomain(str));
        x.f(tVarAv, "<this>");
        if (i2 >= 0) {
            if (i2 != 0) {
                tVarAv = tVarAv instanceof b ? ((b) tVarAv).a(i2) : new h.m.t(tVarAv, i2, 1, null);
            }
            return k.u(tVarAv, ".");
        }
        throw new IllegalArgumentException("Requested element count " + i2 + " is less than zero.");
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        x.f(bArr, "publicSuffixListBytes");
        x.f(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
