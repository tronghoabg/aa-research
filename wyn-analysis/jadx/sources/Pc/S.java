package Pc;

import J8.AbstractC0640o;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import uc.C4271h;

/* loaded from: classes5.dex */
public final /* synthetic */ class S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f9372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f9373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4271h f9374c;

    public /* synthetic */ S(AtomicBoolean atomicBoolean, HashMap map, C4271h c4271h) {
        this.f9372a = atomicBoolean;
        this.f9373b = map;
        this.f9374c = c4271h;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        AtomicBoolean atomicBoolean = this.f9372a;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        AbstractC0640o abstractC0640o = firebaseAuth.f27288f;
        HashMap map = this.f9373b;
        if (abstractC0640o == null) {
            map.put("user", null);
        } else {
            map.put("user", com.moloco.sdk.internal.publisher.H.c0(com.moloco.sdk.internal.publisher.H.j0(abstractC0640o)));
        }
        this.f9374c.a(map);
    }
}
