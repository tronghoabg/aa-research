package defpackage;

import j$.util.Optional;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class vmc {
    protected final ajgu a;
    private final vmb b;

    protected vmc(vmb vmbVar, ajgu ajguVar) {
        this.b = vmbVar;
        this.a = ajguVar;
    }

    protected static String b(Long l) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.##");
        if (l.longValue() >= 1024) {
            return l.longValue() < 1048576 ? String.valueOf(decimalFormat.format(l.longValue() / 1024.0f)).concat(" KB") : l.longValue() < 1073741824 ? String.valueOf(decimalFormat.format(l.longValue() / 1048576.0f)).concat(" MB") : String.valueOf(decimalFormat.format(l.longValue() / 1.0737418E9f)).concat(" GB");
        }
        Objects.toString(l);
        return l.toString().concat(" B");
    }

    protected static String d(Integer num) {
        if (num == null) {
            return "null";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#0.##");
        if (num.intValue() >= 1024) {
            return num.intValue() < 1048576 ? String.valueOf(decimalFormat.format(num.intValue() / 1024.0f)).concat(" MB") : String.valueOf(decimalFormat.format(num.intValue() / 1048576.0f)).concat(" GB");
        }
        Objects.toString(num);
        return num.toString().concat(" KB");
    }

    protected static String f(Long l) {
        if (l == null) {
            return "null";
        }
        DecimalFormat decimalFormat = new DecimalFormat("#0.##");
        if (l.longValue() >= 1000) {
            return l.longValue() < 60000 ? String.valueOf(decimalFormat.format(l.longValue() / 1000.0f)).concat(" s") : l.longValue() < 3600000 ? String.valueOf(decimalFormat.format(l.longValue() / 60000.0f)).concat(" m") : String.valueOf(decimalFormat.format(l.longValue() / 3600000.0f)).concat(" h");
        }
        Objects.toString(l);
        return l.toString().concat(" ms");
    }

    public final Optional a() {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        if (!h()) {
            return Optional.empty();
        }
        vlz vlzVar = new vlz();
        vlzVar.a(ajgu.a);
        vkr vkrVar = vkr.a;
        if (vkrVar == null) {
            throw new NullPointerException("Null clientTracingEvent");
        }
        vlzVar.f = vkrVar;
        vlzVar.a = g();
        vlzVar.d = this.b;
        String strE = e();
        if (strE == null) {
            throw new NullPointerException("Null message");
        }
        vlzVar.b = strE;
        vlzVar.a(this.a);
        long time = new Date().getTime();
        vlzVar.c = (byte) 1;
        String str2 = vlzVar.a;
        if (str2 != null && (obj = vlzVar.d) != null && (str = vlzVar.b) != null && (obj2 = vlzVar.e) != null && (obj3 = vlzVar.f) != null) {
            return Optional.of(new vma(str2, (vmb) obj, str, (ajgu) obj2, (vkr) obj3, time));
        }
        StringBuilder sb = new StringBuilder();
        if (vlzVar.a == null) {
            sb.append(" name");
        }
        if (vlzVar.d == null) {
            sb.append(" eventType");
        }
        if (vlzVar.b == null) {
            sb.append(" message");
        }
        if (vlzVar.e == null) {
            sb.append(" systemHealthMetric");
        }
        if (vlzVar.f == null) {
            sb.append(" clientTracingEvent");
        }
        if (vlzVar.c == 0) {
            sb.append(" timeCreatedMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    protected final String c() {
        ajgu ajguVar = this.a;
        int i = ajguVar.b;
        if ((i & 4) != 0) {
            return ajguVar.e;
        }
        if ((i & 2) == 0) {
            return null;
        }
        return ajguVar.d;
    }

    protected abstract String e();

    protected abstract String g();

    protected abstract boolean h();
}
