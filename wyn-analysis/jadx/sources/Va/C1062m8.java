package Va;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import g2.AbstractC2671A;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: Va.m8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1062m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14386a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f14387b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14388c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14389d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14390e;

    public C1062m8(String str, String str2, String str3, int i5) {
        this.f14388c = str;
        this.f14389d = str2;
        this.f14390e = str3;
        this.f14387b = i5;
    }

    public static String b(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(9029573360206146788L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 9029573360206146788L));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public String a(Y1.t tVar, Uri uri, int i5) throws NoSuchAlgorithmException, N1.D {
        int i10 = this.f14387b;
        if (i10 == 1) {
            String strEncodeToString = Base64.encodeToString((tVar.f16380b + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + tVar.f16381c).getBytes(g2.z.f35699g), 0);
            int i11 = Q1.x.f9724a;
            Locale locale = Locale.US;
            return R8.v.f("Basic ", strEncodeToString);
        }
        if (i10 != 2) {
            throw new N1.D(null, new UnsupportedOperationException(), false, 4);
        }
        String str = this.f14389d;
        String str2 = this.f14388c;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strH = AbstractC2671A.h(i5);
            String str3 = tVar.f16380b + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + tVar.f16381c;
            Charset charset = g2.z.f35699g;
            String strV = Q1.x.V(messageDigest.digest((Q1.x.V(messageDigest.digest(str3.getBytes(charset))) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + Q1.x.V(messageDigest.digest((strH + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + uri).getBytes(charset)))).getBytes(charset)));
            String str4 = this.f14390e;
            return str4.isEmpty() ? String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", tVar.f16380b, str2, str, uri, strV) : String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", tVar.f16380b, str2, str, uri, strV, str4);
        } catch (NoSuchAlgorithmException e7) {
            throw new N1.D(null, e7, false, 4);
        }
    }

    public String toString() {
        switch (this.f14386a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f14388c);
                sb2.append(b("̔䣳̺\uf010搟", TextUtils.getOffsetBefore("", 0)).intern());
                sb2.append(this.f14389d);
                sb2.append(b("珬噸珄ᚼ쬅", Color.green(0)).intern());
                sb2.append(this.f14390e);
                sb2.append(b("ন㙼\u0992鏚\ue8c8", ExpandableListView.getPackedPositionGroup(0L)).intern());
                sb2.append(this.f14387b);
                sb2.append(b("ﱌ㑑ﱥ䜀\uf354", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public C1062m8(int i5, String str, String str2, String str3) {
        this.f14387b = i5;
        this.f14388c = str;
        this.f14389d = str2;
        this.f14390e = str3;
    }
}
