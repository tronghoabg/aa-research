package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ozp extends ozn {
    private static final yph g = yph.c("GH.WirelessProxy");
    private static final Pattern h = Pattern.compile("(.*):([\\d]+)");
    public String e;
    public int f;
    private String i;
    private String j;

    @Override // defpackage.ozn
    protected final void c(String str) {
        List listI = xxx.c(' ').i(str);
        if (listI.size() < 3) {
            ((ype) ((ype) g.g()).ai(6254)).M("%s: failed to parse first line of HTTP request/response: %s", this.c, str);
            return;
        }
        this.e = ((String) listI.get(0)).trim();
        this.i = ((String) listI.get(1)).trim();
        ((String) listI.get(2)).trim();
    }

    @Override // defpackage.ozn
    public final void e() {
        super.e();
        this.d = 2;
    }

    final String g() {
        if (this.j == null) {
            h();
        }
        return this.j;
    }

    public final void h() {
        String str = this.i;
        if ("CONNECT".equals(this.e)) {
            Matcher matcher = h.matcher(str);
            if (matcher.matches()) {
                this.j = matcher.group(1);
                String strGroup = matcher.group(2);
                if (TextUtils.isEmpty(strGroup)) {
                    return;
                }
                this.f = Integer.parseInt(strGroup);
            }
        }
    }
}
