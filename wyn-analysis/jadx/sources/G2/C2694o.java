package g2;

import a2.C1323c;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3401C;
import l8.C3406H;
import l8.C3410L;
import l8.C3439u;
import l8.C3441w;
import l8.e0;
import org.apache.tika.metadata.HttpHeaders;

/* renamed from: g2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2694o {

    /* renamed from: a, reason: collision with root package name */
    public final C3410L f35646a;

    static {
        new C2694o(new C1323c(10));
    }

    public C2694o(C1323c c1323c) {
        C3410L c3410l;
        C3441w c3441w = (C3441w) ((C1323c) c1323c.f17156b).f17156b;
        if (c3441w == null) {
            c3410l = C3401C.f40042e;
        } else {
            Collection collectionEntrySet = c3441w.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                c3410l = C3401C.f40042e;
            } else {
                C3439u c3439u = (C3439u) collectionEntrySet;
                E4.n nVar = new E4.n(c3439u.f40167b.size(), 18);
                Iterator it = c3439u.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    e0 e0VarG = ((C3406H) entry.getValue()).g();
                    nVar.v(key, e0VarG);
                    i5 += e0VarG.f40103d;
                }
                c3410l = new C3410L(nVar.e(), i5);
            }
        }
        this.f35646a = c3410l;
    }

    public static String a(String str) {
        return A6.h.v(str, "Accept") ? "Accept" : A6.h.v(str, "Allow") ? "Allow" : A6.h.v(str, ApiHeadersProvider.AUTHORIZATION) ? ApiHeadersProvider.AUTHORIZATION : A6.h.v(str, "Bandwidth") ? "Bandwidth" : A6.h.v(str, "Blocksize") ? "Blocksize" : A6.h.v(str, "Cache-Control") ? "Cache-Control" : A6.h.v(str, "Connection") ? "Connection" : A6.h.v(str, "Content-Base") ? "Content-Base" : A6.h.v(str, HttpHeaders.CONTENT_ENCODING) ? HttpHeaders.CONTENT_ENCODING : A6.h.v(str, HttpHeaders.CONTENT_LANGUAGE) ? HttpHeaders.CONTENT_LANGUAGE : A6.h.v(str, HttpHeaders.CONTENT_LENGTH) ? HttpHeaders.CONTENT_LENGTH : A6.h.v(str, HttpHeaders.CONTENT_LOCATION) ? HttpHeaders.CONTENT_LOCATION : A6.h.v(str, "Content-Type") ? "Content-Type" : A6.h.v(str, "CSeq") ? "CSeq" : A6.h.v(str, "Date") ? "Date" : A6.h.v(str, "Expires") ? "Expires" : A6.h.v(str, HttpHeaders.LOCATION) ? HttpHeaders.LOCATION : A6.h.v(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : A6.h.v(str, "Proxy-Require") ? "Proxy-Require" : A6.h.v(str, "Public") ? "Public" : A6.h.v(str, "Range") ? "Range" : A6.h.v(str, "RTP-Info") ? "RTP-Info" : A6.h.v(str, "RTCP-Interval") ? "RTCP-Interval" : A6.h.v(str, "Scale") ? "Scale" : A6.h.v(str, "Session") ? "Session" : A6.h.v(str, "Speed") ? "Speed" : A6.h.v(str, "Supported") ? "Supported" : A6.h.v(str, "Timestamp") ? "Timestamp" : A6.h.v(str, "Transport") ? "Transport" : A6.h.v(str, "User-Agent") ? "User-Agent" : A6.h.v(str, "Via") ? "Via" : A6.h.v(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final String b(String str) {
        AbstractC3409K abstractC3409KD = this.f35646a.d(a(str));
        if (abstractC3409KD.isEmpty()) {
            return null;
        }
        return (String) AbstractC3437s.j(abstractC3409KD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2694o) {
            return this.f35646a.equals(((C2694o) obj).f35646a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35646a.hashCode();
    }
}
