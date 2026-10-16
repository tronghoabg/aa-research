package n6;

import h6.AbstractC2786e;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3595a extends AbstractC2786e {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f40917o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f40918p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    public final StringBuilder f40919m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f40920n = new ArrayList();

    public static long h(Matcher matcher, int i5) {
        String strGroup = matcher.group(i5 + 1);
        long j8 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i5 + 2);
        strGroup2.getClass();
        long j10 = (Long.parseLong(strGroup2) * 60000) + j8;
        String strGroup3 = matcher.group(i5 + 3);
        strGroup3.getClass();
        long j11 = (Long.parseLong(strGroup3) * 1000) + j10;
        String strGroup4 = matcher.group(i5 + 4);
        if (strGroup4 != null) {
            j11 += Long.parseLong(strGroup4);
        }
        return j11 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x028e, code lost:
    
        return new X2.j(22, (h6.C2783b[]) r2.toArray(new h6.C2783b[r5]), java.util.Arrays.copyOf(r3, r6));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    @Override // h6.AbstractC2786e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h6.InterfaceC2787f e(byte[] r32, int r33, boolean r34) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.C3595a.e(byte[], int, boolean):h6.f");
    }
}
