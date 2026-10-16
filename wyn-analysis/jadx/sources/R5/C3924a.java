package r5;

import ic.d;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import q5.C3868c;
import t5.InterfaceC4116k;

/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3924a implements InterfaceC4116k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f44360c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f44361d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3924a f44362e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3924a f44363f;

    /* renamed from: a, reason: collision with root package name */
    public final String f44364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44365b;

    static {
        String strH = d.H("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f44360c = strH;
        String strH2 = d.H("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strH3 = d.H("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f44361d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new C3868c("proto"), new C3868c("json"))));
        f44362e = new C3924a(strH, null);
        f44363f = new C3924a(strH2, strH3);
    }

    public C3924a(String str, String str2) {
        this.f44364a = str;
        this.f44365b = str2;
    }

    public static C3924a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C3924a(str2, str3);
    }
}
