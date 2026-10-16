package defpackage;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes3.dex */
public final class yrv extends yrw {
    private final yru c;

    public yrv(ypl yplVar, int i, yru yruVar) {
        super(yplVar, i);
        this.c = yruVar;
        StringBuilder sb = new StringBuilder("%");
        yplVar.f(sb);
        sb.append(true != yplVar.d() ? 't' : 'T');
        sb.append(yruVar.G);
    }

    @Override // defpackage.yrw
    public final void a(ysa ysaVar, Object obj) {
        yru yruVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            ysa.c(ysaVar.d, obj, "%t" + yruVar.G);
            return;
        }
        ypl yplVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        yplVar.f(sb);
        sb.append(true != yplVar.d() ? 't' : 'T');
        sb.append(yruVar.G);
        ysaVar.d.append(String.format(ypr.a, sb.toString(), obj));
    }
}
