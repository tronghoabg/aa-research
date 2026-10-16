package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class yli extends yln implements Serializable {
    public static final yli a = new yli();
    private static final long serialVersionUID = 0;
    private transient yln b;
    private transient yln c;

    private yli() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.yln
    public final yln a() {
        yln ylnVar = this.b;
        if (ylnVar != null) {
            return ylnVar;
        }
        ylj yljVar = new ylj(this);
        this.b = yljVar;
        return yljVar;
    }

    @Override // defpackage.yln
    public final yln b() {
        yln ylnVar = this.c;
        if (ylnVar != null) {
            return ylnVar;
        }
        ylk ylkVar = new ylk(this);
        this.c = ylkVar;
        return ylkVar;
    }

    @Override // defpackage.yln
    public final yln c() {
        return ymd.a;
    }

    @Override // defpackage.yln, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
