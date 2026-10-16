package com.google.d.b;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7250a;

    public w() {
        this.f7250a = new ArrayList();
    }

    public static w b(String str) {
        return new w(str);
    }

    static /* bridge */ /* synthetic */ String c(w wVar) {
        return (String) wVar.f7250a;
    }

    public static w f() {
        return new w(",");
    }

    static final CharSequence g(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final v a(String str) {
        return new v(this, str);
    }

    public final String d(Iterable iterable) throws IOException {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        e(sb, it);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    public final void e(StringBuilder sb, Iterator it) throws IOException {
        try {
            if (it.hasNext()) {
                sb.append(g(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f7250a);
                    sb.append(g(it.next()));
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void h(StringBuilder sb, Iterable iterable) {
        e(sb, iterable.iterator());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public final synchronized List i() {
        return DesugarCollections.unmodifiableList(new ArrayList((Collection) this.f7250a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized boolean j(List list) {
        ?? r0 = this.f7250a;
        r0.clear();
        if (list.size() <= 128) {
            return r0.addAll(list);
        }
        com.google.firebase.crashlytics.a.i.a().h("Ignored 0 entries when adding rollout assignments. Maximum allowable: 128");
        return r0.addAll(list.subList(0, 128));
    }

    private w(String str) {
        this.f7250a = str;
    }
}
