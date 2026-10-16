package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class aipt {
    private aipt() {
    }

    public static final void a(ajag ajagVar, Object obj) {
        if (ajagVar.a != obj) {
            throw ajagVar;
        }
    }

    public final <T> aipv<T> create(Collection<? extends T> collection) {
        collection.getClass();
        aipv<T> aipvVar = new aipv<>(null);
        aipvVar.addAll(collection);
        return aipvVar;
    }

    public /* synthetic */ aipt(afeu afeuVar) {
        this();
    }

    public final <T> aipv<T> create() {
        return new aipv<>(null);
    }
}
