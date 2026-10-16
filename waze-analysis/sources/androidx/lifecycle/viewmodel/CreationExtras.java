package androidx.lifecycle.viewmodel;

import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.m.k;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class CreationExtras {
    public static final Companion Companion = new Companion(null);
    private final Map<Key<?>, Object> extras = new LinkedHashMap();

    /* compiled from: WazeSource */
    public final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public <T> T get(Key<T> key) {
            x.f(key, "key");
            return null;
        }
    }

    /* compiled from: WazeSource */
    public interface Key<T> {
    }

    public boolean equals(Object obj) {
        return (obj instanceof CreationExtras) && x.n(this.extras, ((CreationExtras) obj).extras);
    }

    public abstract <T> T get(Key<T> key);

    public final Map<Key<?>, Object> getExtras$lifecycle_viewmodel() {
        return this.extras;
    }

    public int hashCode() {
        return this.extras.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.extras + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final /* synthetic */ <T> Key<T> Key() {
            x.i();
            return new Key() { // from class: androidx.lifecycle.viewmodel.CreationExtras$Companion$Key$1
                public String toString() {
                    int iHashCode = hashCode();
                    k.y(16);
                    String string = Integer.toString(iHashCode, 16);
                    x.e(string, "toString(...)");
                    x.i();
                    int i2 = ar.f48106a;
                    return "CreationExtras.Key@" + string + "<" + new m(Object.class).c() + ">";
                }
            };
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
