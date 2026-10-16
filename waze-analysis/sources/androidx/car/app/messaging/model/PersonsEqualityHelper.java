package androidx.car.app.messaging.model;

import androidx.core.app.Person;
import h.g.b.x;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PersonsEqualityHelper {
    public static final PersonsEqualityHelper INSTANCE = new PersonsEqualityHelper();

    private PersonsEqualityHelper() {
    }

    public static final boolean arePersonsEqual(Person person, Person person2) {
        if (person == null && person2 == null) {
            return true;
        }
        if (person == null || person2 == null) {
            return false;
        }
        String key = person.getKey();
        String key2 = person2.getKey();
        return (key == null && key2 == null) ? x.n(Objects.toString(person.getName()), Objects.toString(person2.getName())) && x.n(person.getUri(), person2.getUri()) && person.isBot() == person2.isBot() && person.isImportant() == person2.isImportant() : x.n(key, key2);
    }

    public static final int getPersonHashCode(Person person) {
        if (person == null) {
            return 0;
        }
        String key = person.getKey();
        return key != null ? key.hashCode() : Objects.hash(person.getName(), person.getUri(), Boolean.valueOf(person.isBot()), Boolean.valueOf(person.isImportant()));
    }
}
