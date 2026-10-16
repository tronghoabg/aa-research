package J8;

import K8.C0693e;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import f7.AbstractC2614a;
import java.util.ArrayList;

/* renamed from: J8.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0640o extends AbstractC2614a implements E {
    public abstract String V();

    public abstract boolean W();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [J8.h, K8.E] */
    public final Task X() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f(((C0693e) this).f6629c));
        firebaseAuth.getClass();
        return firebaseAuth.f27287e.zza(firebaseAuth.f27283a, this, (K8.E) new C0633h(firebaseAuth, 0));
    }

    public abstract C0693e Y(ArrayList arrayList);

    public abstract void Z(ArrayList arrayList);
}
