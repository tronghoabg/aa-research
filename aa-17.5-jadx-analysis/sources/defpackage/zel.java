package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class zel extends RuntimeException {
    private static final long serialVersionUID = 1;
    public final List a;

    public zel(List list) {
        super("Cyclical graphs can not be topologically sorted.");
        this.a = list;
    }
}
