package J5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5671c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f5672a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f5673b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f5671c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i5 = u6.v.f46721a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f5672a = i10;
            this.f5673b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(W5.c cVar) {
        int i5 = 0;
        while (true) {
            W5.b[] bVarArr = cVar.f15149a;
            if (i5 >= bVarArr.length) {
                return;
            }
            W5.b bVar = bVarArr[i5];
            if (bVar instanceof b6.e) {
                b6.e eVar = (b6.e) bVar;
                if ("iTunSMPB".equals(eVar.f19343c) && a(eVar.f19344d)) {
                    return;
                }
            } else if (bVar instanceof b6.j) {
                b6.j jVar = (b6.j) bVar;
                if ("com.apple.iTunes".equals(jVar.f19352b) && "iTunSMPB".equals(jVar.f19353c) && a(jVar.f19354d)) {
                    return;
                }
            } else {
                continue;
            }
            i5++;
        }
    }
}
