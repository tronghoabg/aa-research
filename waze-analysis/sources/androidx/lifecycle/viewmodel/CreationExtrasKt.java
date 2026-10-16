package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CreationExtrasKt {
    public static final CreationExtras CreationExtras(CreationExtras creationExtras, l<? super MutableCreationExtras, ab> lVar) {
        x.f(creationExtras, "initialExtras");
        x.f(lVar, "builderAction");
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(creationExtras);
        lVar.invoke(mutableCreationExtras);
        return mutableCreationExtras;
    }

    public static /* synthetic */ CreationExtras CreationExtras$default(CreationExtras creationExtras, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar = new l() { // from class: androidx.lifecycle.viewmodel.CreationExtrasKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return CreationExtrasKt.CreationExtras$lambda$0((MutableCreationExtras) obj2);
                }
            };
        }
        return CreationExtras(creationExtras, lVar);
    }

    static final ab CreationExtras$lambda$0(MutableCreationExtras mutableCreationExtras) {
        x.f(mutableCreationExtras, "<this>");
        return ab.f48028a;
    }

    public static final boolean contains(CreationExtras creationExtras, CreationExtras.Key<?> key) {
        x.f(creationExtras, "<this>");
        x.f(key, "key");
        return creationExtras.getExtras$lifecycle_viewmodel().containsKey(key);
    }

    public static final MutableCreationExtras plus(CreationExtras creationExtras, CreationExtras creationExtras2) {
        x.f(creationExtras, "<this>");
        x.f(creationExtras2, "creationExtras");
        return new MutableCreationExtras((Map<CreationExtras.Key<?>, ? extends Object>) r.o(creationExtras.getExtras$lifecycle_viewmodel(), creationExtras2.getExtras$lifecycle_viewmodel()));
    }

    public static final void plusAssign(MutableCreationExtras mutableCreationExtras, CreationExtras creationExtras) {
        x.f(mutableCreationExtras, "<this>");
        x.f(creationExtras, "creationExtras");
        mutableCreationExtras.getExtras$lifecycle_viewmodel().putAll(creationExtras.getExtras$lifecycle_viewmodel());
    }

    public static final CreationExtras CreationExtras(CreationExtras creationExtras) {
        x.f(creationExtras, "initialExtras");
        return CreationExtras$default(creationExtras, null, 2, null);
    }

    public static final CreationExtras CreationExtras() {
        return CreationExtras$default(null, null, 3, null);
    }
}
