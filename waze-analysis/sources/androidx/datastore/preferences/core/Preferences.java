package androidx.datastore.preferences.core;

import androidx.autofill.HintConstants;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class Preferences {

    /* compiled from: WazeSource */
    public final class Key<T> {
        private final String name;

        public Key(String str) {
            x.f(str, HintConstants.AUTOFILL_HINT_NAME);
            this.name = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return x.n(this.name, ((Key) obj).name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public final Pair<T> to(T t) {
            return new Pair<>(this, t);
        }

        public String toString() {
            return this.name;
        }
    }

    /* compiled from: WazeSource */
    public final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public Pair(Key<T> key, T t) {
            x.f(key, "key");
            this.key = key;
            this.value = t;
        }

        public final Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(Key<T> key);

    public final Preferences copy(l<? super MutablePreferences, ab> lVar) {
        x.f(lVar, "block");
        MutablePreferences mutablePreferences = new MutablePreferences(r.t(asMap()), false);
        lVar.invoke(mutablePreferences);
        mutablePreferences.freeze$datastore_preferences_core();
        return mutablePreferences;
    }

    public abstract <T> T get(Key<T> key);

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(r.t(asMap()), false);
    }

    public final Preferences toPreferences() {
        return new MutablePreferences(r.t(asMap()), true);
    }
}
