package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class afqy implements Comparator {
    private final afeg arg$0;

    public afqy(afeg afegVar) {
        this.arg$0 = afegVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return afrj.findPropertyDescriptor$lambda$3(this.arg$0, obj, obj2);
    }
}
