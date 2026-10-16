package ya;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ya.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4570a {

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f48039a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    public final Set f48040b = DesugarCollections.synchronizedSet(new HashSet());
}
