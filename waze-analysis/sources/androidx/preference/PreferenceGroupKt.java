package androidx.preference;

import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.x;
import h.m.h;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PreferenceGroupKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.preference.PreferenceGroupKt$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Preference>, a {
        final /* synthetic */ PreferenceGroup $this_iterator;
        private int index;

        AnonymousClass1(PreferenceGroup preferenceGroup) {
            this.$this_iterator = preferenceGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getPreferenceCount();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Preference next() {
            int i2 = this.index;
            this.index = i2 + 1;
            Preference preference = this.$this_iterator.getPreference(i2);
            x.e(preference, "getPreference(...)");
            return preference;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i2 = this.index - 1;
            this.index = i2;
            PreferenceGroup preferenceGroup = this.$this_iterator;
            preferenceGroup.removePreference(preferenceGroup.getPreference(i2));
        }
    }

    public static final boolean contains(PreferenceGroup preferenceGroup, Preference preference) {
        x.f(preferenceGroup, "<this>");
        x.f(preference, "preference");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i2 = 0; i2 < preferenceCount; i2++) {
            if (x.n(preferenceGroup.getPreference(i2), preference)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(PreferenceGroup preferenceGroup, l<? super Preference, ab> lVar) {
        x.f(preferenceGroup, "<this>");
        x.f(lVar, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i2 = 0; i2 < preferenceCount; i2++) {
            lVar.invoke(get(preferenceGroup, i2));
        }
    }

    public static final void forEachIndexed(PreferenceGroup preferenceGroup, p<? super Integer, ? super Preference, ab> pVar) {
        x.f(preferenceGroup, "<this>");
        x.f(pVar, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i2 = 0; i2 < preferenceCount; i2++) {
            pVar.invoke(Integer.valueOf(i2), get(preferenceGroup, i2));
        }
    }

    public static final Preference get(PreferenceGroup preferenceGroup, int i2) {
        x.f(preferenceGroup, "<this>");
        Preference preference = preferenceGroup.getPreference(i2);
        x.e(preference, "getPreference(...)");
        return preference;
    }

    public static final h<Preference> getChildren(final PreferenceGroup preferenceGroup) {
        x.f(preferenceGroup, "<this>");
        return new h<Preference>() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // h.m.h
            public Iterator<Preference> iterator() {
                return PreferenceGroupKt.iterator(preferenceGroup);
            }
        };
    }

    public static final int getSize(PreferenceGroup preferenceGroup) {
        x.f(preferenceGroup, "<this>");
        return preferenceGroup.getPreferenceCount();
    }

    public static final boolean isEmpty(PreferenceGroup preferenceGroup) {
        x.f(preferenceGroup, "<this>");
        return preferenceGroup.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(PreferenceGroup preferenceGroup) {
        x.f(preferenceGroup, "<this>");
        return preferenceGroup.getPreferenceCount() != 0;
    }

    public static final Iterator<Preference> iterator(PreferenceGroup preferenceGroup) {
        x.f(preferenceGroup, "<this>");
        return new AnonymousClass1(preferenceGroup);
    }

    public static final void minusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        x.f(preferenceGroup, "<this>");
        x.f(preference, "preference");
        preferenceGroup.removePreference(preference);
    }

    public static final void plusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        x.f(preferenceGroup, "<this>");
        x.f(preference, "preference");
        preferenceGroup.addPreference(preference);
    }

    public static final <T extends Preference> T get(PreferenceGroup preferenceGroup, CharSequence charSequence) {
        x.f(preferenceGroup, "<this>");
        x.f(charSequence, "key");
        return (T) preferenceGroup.findPreference(charSequence);
    }
}
